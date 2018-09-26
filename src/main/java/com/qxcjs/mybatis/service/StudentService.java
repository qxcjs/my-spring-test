package com.qxcjs.mybatis.service;

import com.qxcjs.mybatis.domain.Student;

import java.util.List;

public interface StudentService {

    Student selectUserByID(Integer id);

    void updateUser(Student stu);

    List<Student> queryStudentPage();
}