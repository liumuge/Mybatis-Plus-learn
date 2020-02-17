package cn.itcast.mp.simple;

import cn.itcast.mp.simple.mapper.UserMapper;
import cn.itcast.mp.simple.pojo.User;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: Mybatis-plus
 * @auther: MuGe
 * @date: 2020/1/20
 * @time: 16:33
 * @description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestMybatisSpring {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void testSelectList() {
		List<User> users = userMapper.selectList(null);
		for (User user : users) {
			System.out.println(user);
		}
	}
}











