package cn.itcast.mp.simple;

import cn.itcast.mp.simple.mapper.UserMapper;
import cn.itcast.mp.simple.pojo.User;
import com.sun.deploy.model.Resource;
import java.io.IOException;
import java.io.InputStream;

import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

/**
 * @program: Mybatis-plus
 * @auther: MuGe
 * @date: 2020/1/20
 * @time: 12:19
 * @description:
 */
public class TestMybatis {

	@Test
	public void testFindAll() throws IOException {
		String config = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(config);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		List<User> users = userMapper.findAll();
		for (User user : users) {
			System.out.println(user);
		}
	}
}
