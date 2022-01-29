package org.mybatis.example.dao;

import org.mybatis.example.entity.Teacher;

import java.util.List;

/**
 * @author 李聪燕
 * @date 2022/1/28 23:10
 */
public interface TeacherMapper {
    public List<Teacher> getTeachers(int id);
}
