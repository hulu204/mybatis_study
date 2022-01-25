package org.mybatis.example.Dao;

import org.mybatis.example.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author 李聪燕
 * @date 2022/1/24 21:45
 */
public interface UserMapper {
    /**
     * 查询所有用户信息
     * @return
     */
    List<User> getUsers();

    /**
     * 模糊查询
     * @param userName
     * @return
     */
    List<User> getUsersLike(String userName);

    User getUserById(int id);

    /**
     * 测试map传参
     * @param map
     * @return
     */
    User getUserByIdAndName(Map<String,Object> map);
    void add(User user);

    void del(int id);

    void update(User user);
}
