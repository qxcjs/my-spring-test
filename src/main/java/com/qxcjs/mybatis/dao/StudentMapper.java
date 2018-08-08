package com.qxcjs.mybatis.dao;

import com.qxcjs.mybatis.domain.Student;

public interface StudentMapper {
    Student selectUserByID(Integer findex);

    int updateUser(Student stu);

}