package org.ctt.showstudent.test;

import org.ctt.showstudent.dao.IStudentDao;
import org.ctt.showstudent.dao.StudentDao;
import org.ctt.showstudent.model.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by acer on 2015/7/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/beans.xml")
public class TestStu {
    @Resource
    private IStudentDao studentDao;

    @Test
    public void testAdd() {
        Student s = new Student();
        s.setName("111");
        s.setMajor("qqq");
        s.setSex(1);
        studentDao.add(s);
    }
}
