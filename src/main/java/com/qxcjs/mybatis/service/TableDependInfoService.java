package com.qxcjs.mybatis.service;

import com.qxcjs.mybatis.domain.TableDependInfo;
import com.qxcjs.mybatis.domain.TableDependInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TableDependInfoService {
    TableDependInfo selectByPrimaryKey(Integer findex);
}