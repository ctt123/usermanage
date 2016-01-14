package org.ctt.showstudent.dao;

import org.ctt.showstudent.model.Student;

import java.util.List;

/**
 * Created by acer on 2015/7/5.
 */
public interface IStudentDao {
    void add(Student t);
    void delete(int id);
    void update(Student t);

    Object load(int id);

    List<Student> list();

}
