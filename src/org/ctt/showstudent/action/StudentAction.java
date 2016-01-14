package org.ctt.showstudent.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import org.ctt.showstudent.dao.IStudentDao;
import org.ctt.showstudent.dao.StudentDao;
import org.ctt.showstudent.model.Student;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by acer on 2015/7/9.
 */
@Controller ("studentAction")
public class StudentAction implements ModelDriven<Student> {
    private Student stu;
    private IStudentDao studentDao;

    public IStudentDao getStudentDao() {
        return studentDao;
    }
    @Resource
    public void setStudentDao(IStudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    @Override

    public Student getModel() {
        if(stu==null) stu=new Student();
        return stu;
    }
    public String add(){
        studentDao.add(stu);
        return  "success";

    }
    public String delete(){
        studentDao.delete(stu.getId());
        return "success";

    }
    public String list() {
        ActionContext.getContext().put("users", studentDao.list());
        return "success";


    }
    public String addinput() {
        return "success";
    }
    public String updateinput() {
        return "success";

    }
    public  String update(){
        studentDao.update(stu);
        return "success";
    }

}
