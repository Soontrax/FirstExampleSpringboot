package com.alvaro.Dao;

import com.alvaro.Entity.Student;

import java.util.Collection;

public interface studentInterface {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudent(Student student);
}
