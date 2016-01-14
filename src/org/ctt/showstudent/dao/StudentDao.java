package org.ctt.showstudent.dao;

import org.ctt.showstudent.model.Student;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by acer on 2015/7/5.
 */
public class StudentDao implements IStudentDao {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }
    @Override
    public void add(Student t) {
        getSession().save(t);

    }

    @Override
    public void delete(int id) {
        getSession().delete(load(id));


    }

    @Override
    public void update(Student t) {
        getSession().update(t);

    }

    @Override
    public Student load(int id) {
        return (Student)getSession().load(Student.class, id);
    }

    @Override
    public List<Student> list() {
        String hql = "from Student";
        Query q = getSession().createQuery(hql);
        return q.list();
    }
}
