package com.baizhi.entity;

public class Student {
    private int id;
    private String name;
    private int sex;
    private int age;
    private int groud;

    public Student(int id, String name, int sex, int age, int groud) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.groud = groud;
    }

    public Student() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGroud() {
        return groud;
    }

    public void setGroud(int groud) {
        this.groud = groud;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", groud=" + groud +
                '}';
    }
}
