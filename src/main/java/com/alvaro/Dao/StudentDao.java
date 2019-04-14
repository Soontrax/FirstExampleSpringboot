package com.alvaro.Dao;

import com.alvaro.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao implements studentInterface {
    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Student", "CS"));
                put(2, new Student(2, "Alex", "Security"));
                put(3, new Student(3, "Johan", "Maths"));
            }
        };
    }

    @Override
    public Collection<Student> getAllStudents() {
        return this.students.values();
    }

    @Override
    public Student getStudentById(int id) {
        return this.students.get(id);
    }

    @Override
    public void removeStudentById(int id) {
        this.students.remove(id);
    }

    @Override
    public void updateStudent(Student student){
        Student s = students.get(student.getID());
        s.setCourse(student.getCourse());
        s.setName(student.getName());
        students.put(student.getID(), student);
    }

    @Override
    public void insertStudent(Student student){
        this.students.put(student.getID(), student);
    }
}
