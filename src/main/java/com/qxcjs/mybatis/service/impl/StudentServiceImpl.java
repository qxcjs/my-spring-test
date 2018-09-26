package com.qxcjs.mybatis.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qxcjs.mybatis.dao.StudentMapper;
import com.qxcjs.mybatis.domain.Student;
import com.qxcjs.mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student selectUserByID(Integer id) {
        return studentMapper.selectUserByID(id);
    }

    @Override
    public void updateUser(Student stu) throws RuntimeException {
        int i = studentMapper.updateUser(stu);
        if (i == 1) {
            throw new RuntimeException();
        }
    }

    @Override
    public List<Student> queryStudentPage() {
        PageHelper.startPage(1, 10);
        Page<Student> students = (Page<Student>) studentMapper.selectStudentPage();
        PageInfo<Student> pageInfo = new PageInfo<>(students);
        System.out.println(pageInfo.getTotal());
        return students;
    }
}