package com.kavin.pojo;

import java.io.Serializable;

/**
 * 用户实体类
 * @author Kavin
 *
 */
public class User implements Serializable{

	private  String Name;
    private  int age;
    private  String sex;
    
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    @Override
	public String toString() {
		return "User [Name=" + Name + ", age=" + age + ", sex=" + sex + "]";
	}
    
}
