package com.qxcjs.mybatis.dao;

import com.qxcjs.mybatis.domain.Student;

import java.util.List;

public interface StudentMapper {
    Student selectUserByID(Integer findex);

    int updateUser(Student stu);

    List<Student> selectStudentPage();

}