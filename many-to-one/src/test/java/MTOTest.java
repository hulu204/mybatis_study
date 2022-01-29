import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.mybatis.example.dao.StudentMapper;
import org.mybatis.example.dao.TeacherMapper;
import org.mybatis.example.entity.Student;
import org.mybatis.example.utils.MybatisUtils;

import java.util.List;

/**
 * @author 李聪燕
 * @date 2022/1/28 23:12
 */
public class MTOTest {
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    StudentMapper stuMapper = sqlSession.getMapper(StudentMapper.class);
    TeacherMapper teaMapper = sqlSession.getMapper(TeacherMapper.class);

    @Test
    public void test1 () {
        List<Student> all = stuMapper.getStudent();
        for (Student student : all) {
            System.out.println(student);
        }
        sqlSession.close();

    }
}
