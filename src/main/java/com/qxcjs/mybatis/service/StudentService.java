package com.qxcjs.mybatis.service;

import com.qxcjs.mybatis.domain.Student;

public interface StudentService {

    Student selectUserByID(Integer id);

    void updateUser(Student stu);
}