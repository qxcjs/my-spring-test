package com.qxcjs.mybatis.service.impl;

import com.qxcjs.mybatis.dao.TableDependInfoMapper;
import com.qxcjs.mybatis.domain.TableDependInfo;
import com.qxcjs.mybatis.service.TableDependInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TableDependInfoServiceImpl implements TableDependInfoService {

    @Autowired
    private TableDependInfoMapper tableDependInfoMapper;

    @Override
    public TableDependInfo selectByPrimaryKey(Integer findex) {
        return tableDependInfoMapper.selectByPrimaryKey(1);
    }
}