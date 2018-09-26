package com.qxcjs.jackson;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * User: ellisli
 * DATE: 2018/9/20
 * TIME: 14:54
 **/
public class RuleMain {
    public static void main(String[] args) {
        String format = DateFormatUtils.format(new Date(), "yyyy-MM-dd 00:00:00");
        System.out.println(format);
        String andjson = "[{\"conn\":\"\",\"menuCode\":0,\"menuValue\":\"正常\",\"labelId\":110,\"labelName\":\"是否测试用户\",\"operator\":\"=\",\"rules\":[]},{\"conn\":\"and\",\"menuCode\":0,\"menuValue\":\"正常\",\"labelId\":110,\"labelName\":\"是否测试用户\",\"operator\":\"=\",\"rules\":[]}]";
        String json1or = "[{\"conn\":\"\",\"menuCode\":0,\"menuValue\":\"正常\",\"labelId\":110,\"labelName\":\"是否测试用户\",\"operator\":\"=\",\"rules\":[]},{\"conn\":\"or\",\"menuCode\":0,\"menuValue\":\"正常\",\"labelId\":110,\"labelName\":\"是否测试用户\",\"operator\":\"=\",\"rules\":[]}]";
        String json2or = "[{\"conn\":\"\",\"menuCode\":0,\"menuValue\":\"正常\",\"labelId\":110,\"labelName\":\"是否测试用户\",\"operator\":\"=\",\"rules\":[]},{\"conn\":\"or\",\"menuCode\":0,\"menuValue\":\"正常\",\"labelId\":110,\"labelName\":\"是否测试用户\",\"operator\":\"=\",\"rules\":[]},{\"conn\":\"or\",\"menuCode\":0,\"menuValue\":\"正常\",\"labelId\":110,\"labelName\":\"是否测试用户\",\"operator\":\"=\",\"rules\":[]}]";
        String jsonAndOr = "[{\"conn\":\"\",\"menuCode\":0,\"menuValue\":\"正常\",\"labelId\":110,\"labelName\":\"是否测试用户\",\"operator\":\"=\",\"rules\":[]},{\"conn\":\"or\",\"menuCode\":0,\"menuValue\":\"正常\",\"labelId\":110,\"labelName\":\"是否测试用户\",\"operator\":\"=\",\"rules\":[]},{\"conn\":\"and\",\"menuCode\":0,\"menuValue\":\"正常\",\"labelId\":110,\"labelName\":\"是否测试用户\",\"operator\":\"=\",\"rules\":[]}]";
        String jsonSubAnd = "[{\"conn\":\"\",\"menuCode\":0,\"menuValue\":\"正常\",\"labelId\":110,\"labelName\":\"是否测试用户\",\"operator\":\"=\",\"rules\":[{\"conn\":\"and\",\"menuCode\":0,\"menuValue\":\"正常\",\"labelId\":110,\"labelName\":\"是否测试用户\",\"operator\":\"=\",\"rules\":[]},{\"conn\":\"and\",\"menuCode\":0,\"menuValue\":\"正常\",\"labelId\":110,\"labelName\":\"是否测试用户\",\"operator\":\"=\",\"rules\":[]}]},{\"conn\":\"or\",\"menuCode\":0,\"menuValue\":\"正常\",\"labelId\":110,\"labelName\":\"是否测试用户\",\"operator\":\"=\",\"rules\":[]}]";
        String jsonSubAndOr = "[{\"conn\":\"\",\"menuCode\":0,\"menuValue\":\"正常\",\"labelId\":110,\"labelName\":\"是否测试用户\",\"operator\":\"=\",\"rules\":[{\"conn\":\"and\",\"menuCode\":0,\"menuValue\":\"正常\",\"labelId\":110,\"labelName\":\"是否测试用户\",\"operator\":\"=\",\"rules\":[]},{\"conn\":\"or\",\"menuCode\":0,\"menuValue\":\"正常\",\"labelId\":110,\"labelName\":\"是否测试用户\",\"operator\":\"=\",\"rules\":[]}]},{\"conn\":\"and\",\"menuCode\":0,\"menuValue\":\"正常\",\"labelId\":110,\"labelName\":\"是否测试用户\",\"operator\":\"=\",\"rules\":[]}]";
        String json1 = "[{\"conn\":\"\",\"menuCode\":0,\"menuValue\":\"正常\",\"labelId\":110,\"labelName\":\"是否测试用户\",\"operator\":\"=\",\"rules\":[]},{\"conn\":\"and\",\"menuCode\":0,\"menuValue\":\"正常\",\"labelId\":110,\"labelName\":\"是否测试用户\",\"operator\":\"=\",\"rules\":[{\"conn\":\"and\",\"menuCode\":0,\"menuValue\":\"正常\",\"labelId\":110,\"labelName\":\"是否测试用户\",\"operator\":\"=\",\"rules\":[]}]}]";

        parseJsonToSQL(jsonSubAnd);
    }

    private static String parseJsonToSQL(String json) {
        ObjectMapper mapper = new ObjectMapper();
        String sql = "";
        try {
            List<Rule> rules = mapper.readValue(json, new TypeReference<List<Rule>>(){});
            String s = processOutsideRule(rules);
            sql = String.format("select distinct fuid (%s) t",s);
            System.out.println(sql);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sql;
    }

    private static String processOutsideRule(List<Rule> rules){
        String outsideSQL = "";
        String insideSQL = "";
        int alias = 0;
        for (Rule rule : rules) {
            if (StringUtils.isBlank(rule.getConn())) {
                outsideSQL = String.format("select t%s.fuid from (%s) t%s",alias,processOperation(rule),alias);
                if(!rule.getRules().isEmpty()){
                    insideSQL = processOperation(rule);
                    for (Rule insideRule : rule.getRules()) {
                        outsideSQL = processInsideRule(outsideSQL,insideSQL, ++alias,insideRule.getConn());
                    }
                }
            }else {
                if(!rule.getRules().isEmpty()){
                    for (Rule insideRule : rule.getRules()) {
                        insideSQL = processOperation(rule);
                        outsideSQL = processInsideRule(outsideSQL,insideSQL, ++alias,insideRule.getConn());
                    }
                }else {
                    insideSQL = processOperation(rule);
                    outsideSQL = processInsideRule(outsideSQL,insideSQL, ++alias,rule.getConn());
                }
            }
        }
        return outsideSQL;
    }

    private static String processInsideRule(String outsideSQL,String insideSQL,int alias,String conn){
            if("and".equals(conn)){
                int last = alias-1;
                String format = String.format("%s inner join (%s) t%s on t%s.fuid=t%s.fuid",outsideSQL,insideSQL,alias,alias,last);
                return format;
            }else if("or".equals(conn)){
                String format = String.format(" %s union all %s",outsideSQL,String.format("select t%s.fuid from (%s) t%s",alias,insideSQL,alias));
                return format;
            }else{
                return  null;
            }
    }

    private static String processOperation(Rule rule) {
        switch (rule.getOperator()) {
            case "in":
                return String.format("select fuid from dp_label.user_label_collection where flabel_id = %s and flabel_value %s (%s)",
                        rule.getLabelId(), rule.getOperator(), rule.getMenuCode());
            case "like":
                return String.format("select fuid from dp_label.user_label_collection where flabel_id = %s and flabel_value %s '%%s%'",
                        rule.getLabelId(), rule.getOperator(), rule.getMenuCode());
            default:
                return String.format("select fuid from dp_label.user_label_collection where flabel_id = %s and flabel_value %s %s",
                        rule.getLabelId(), rule.getOperator(), rule.getMenuCode());
        }
    }

    private static class Rule {
        private String conn;
        private int menuCode;
        private String menuValue;
        private int labelId;
        private String labelName;
        private String operator;
        private List<Rule> rules = new ArrayList<>();

        public Rule() {
        }

        public String getConn() {
            return conn;
        }

        public void setConn(String conn) {
            this.conn = conn;
        }

        public int getMenuCode() {
            return menuCode;
        }

        public void setMenuCode(int menuCode) {
            this.menuCode = menuCode;
        }

        public String getMenuValue() {
            return menuValue;
        }

        public void setMenuValue(String menuValue) {
            this.menuValue = menuValue;
        }

        public int getLabelId() {
            return labelId;
        }

        public void setLabelId(int labelId) {
            this.labelId = labelId;
        }

        public String getLabelName() {
            return labelName;
        }

        public void setLabelName(String labelName) {
            this.labelName = labelName;
        }

        public String getOperator() {
            return operator;
        }

        public void setOperator(String operator) {
            this.operator = operator;
        }

        public List<Rule> getRules() {
            return rules;
        }

        public void setRules(List<Rule> rules) {
            this.rules = rules;
        }
    }

}
