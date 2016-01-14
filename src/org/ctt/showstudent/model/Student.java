package org.ctt.showstudent.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by acer on 2015/7/5.
 */
@Entity
@Table(name="t_stu")
public class Student {
    private String name;
    private int id;
    private int sex;
    private String course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getMajor() {
        return course;
    }

    public void setMajor(String major) {
        this.course = major;
    }
}
