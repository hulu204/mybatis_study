package org.mybatis.example.entity;

/**
 * @author ĉèŞç
 * @date 2022/1/28 23:01
 */
public class Student {
    private int id;
    private String name;
    private int tid;

    public Student(int id, String name, int tid) {
        this.id = id;
        this.name = name;
        this.tid = tid;
    }

    public Student() {
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

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tid=" + tid +
                '}';
    }
}
