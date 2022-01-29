import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.mybatis.example.dao.UserMapper;
import org.mybatis.example.pojo.User;
import org.mybatis.example.utils.MybatisUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 李聪燕
 * @date 2022/1/24 22:05
 */
public class MybatisTest {
   SqlSession session = MybatisUtil.getSession();
   UserMapper mapper = session.getMapper(UserMapper.class);

   @Test
   public void selectTest() {
      List<User> users = mapper.getUsers();
      for (User user : users) {
         System.out.println("id: " + user.getId() +" name: " + user.getName() + " password: " + user.getPwd());
      }
      session.close();
   }
   @Test
   public void getUsersLikeTest() {
      List<User> users = mapper.getUsersLike("张");
      for (User user : users) {
         System.out.println("id: " + user.getId() +" name: " + user.getName() + " password: " + user.getPwd());
      }
      session.close();
   }
   @Test
   public void getUserByIdTest() {
      User user = mapper.getUserById(1);
      System.out.println("id: " + user.getId() +" name: " + user.getName() + " password: " + user.getPwd());
      session.close();
   }
   @Test
   public void getUserByIdAndNameTest() {
      Map<String,Object> map = new HashMap<>();
      map.put("UserId",1);
      map.put("UserName","狂神");
      User user = mapper.getUserByIdAndName(map);
      System.out.println("id: " + user.getId() +" name: " + user.getName() + " password: " + user.getPwd());
      session.close();
   }
   @Test
   public void addTest() {
      User user = new User(5,"li","333");
      mapper.add(user);
      session.commit();
      session.close();
   }
   @Test
   public void updTest() {
      User user = new User(5,"licongyan","333");
      mapper.update(user);
      session.commit();
      session.close();
   }
   @Test
   public void delTest() {
      mapper.del(5);
      session.commit();
      session.close();
   }

}
