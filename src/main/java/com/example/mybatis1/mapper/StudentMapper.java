package com.example.mybatis1.mapper;

import com.example.mybatis1.bean.Student;

import java.util.List;

public interface StudentMapper {
    void insert(Student student);
    void delete(int id);
    void delAll();

    void update(Student student);

    Student queOne(int i);

    List<Student> queAll();

    int queCount();
}
