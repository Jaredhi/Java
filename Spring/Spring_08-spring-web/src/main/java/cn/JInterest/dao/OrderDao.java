package cn.JInterest.dao;

import cn.JInterest.domain.Student;

import java.util.List;

public interface OrderDao {

    int insertStudent(Student student);
    List<Student> selectStudents();

}
