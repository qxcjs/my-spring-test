package com.qxcjs.mybatis.dao;

import java.util.List;

import com.qxcjs.mybatis.domain.TableDependInfo;
import com.qxcjs.mybatis.domain.TableDependInfoExample;
import org.apache.ibatis.annotations.Param;

public interface TableDependInfoMapper {
    int countByExample(TableDependInfoExample example);

    int deleteByExample(TableDependInfoExample example);

    int deleteByPrimaryKey(Integer findex);

    int insert(TableDependInfo record);

    int insertSelective(TableDependInfo record);

    List<TableDependInfo> selectByExample(TableDependInfoExample example);

    TableDependInfo selectByPrimaryKey(Integer findex);

    int updateByExampleSelective(@Param("record") TableDependInfo record, @Param("example") TableDependInfoExample example);

    int updateByExample(@Param("record") TableDependInfo record, @Param("example") TableDependInfoExample example);

    int updateByPrimaryKeySelective(TableDependInfo record);

    int updateByPrimaryKey(TableDependInfo record);
}