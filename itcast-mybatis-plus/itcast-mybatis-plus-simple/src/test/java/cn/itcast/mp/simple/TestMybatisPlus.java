package cn.itcast.mp.simple;

import cn.itcast.mp.simple.mapper.UserMapper;
import cn.itcast.mp.simple.pojo.User;
import com.baomidou.mybatisplus.core.MybatisSqlSessionFactoryBuilder;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
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
public class TestMybatisPlus {

	@Test
	public void testFindAll() throws IOException {
		String config = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(config);
		SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//		List<User> users = userMapper.findAll();
//		QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
//		User user1 = new User();
//		user1.setId(5l);
//		userQueryWrapper.setEntity(user1);
		List<User> users = userMapper.selectList(null);

		for (User user : users) {
			System.out.println(user);
		}
	}
}
