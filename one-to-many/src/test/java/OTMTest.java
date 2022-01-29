import org.mybatis.example.dao.StudentMapper;
import org.mybatis.example.dao.TeacherMapper;
import org.mybatis.example.entity.Teacher;
import org.mybatis.example.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author 李聪燕
 * @date 2022/1/28 23:13
 */
public class OTMTest {
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    StudentMapper stuMapper = sqlSession.getMapper(StudentMapper.class);
    TeacherMapper teaMapper = sqlSession.getMapper(TeacherMapper.class);

    @Test
    public void test1 () {
        List<Teacher> all = teaMapper.getTeachers(1);
        for (Teacher teacher : all) {
            System.out.println(teacher);
        }
        sqlSession.close();

    }
}
