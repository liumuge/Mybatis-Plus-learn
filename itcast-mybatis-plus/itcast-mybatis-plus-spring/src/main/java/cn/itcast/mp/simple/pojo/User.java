package cn.itcast.mp.simple.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: Mybatis-plus
 * @auther: MuGe
 * @date: 2020/1/20
 * @time: 12:09
 * @description:
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_user")
public class User {
	private Long id;
	private String userName;
	private String password;
	private String name;
	private Integer age;
	private String email;
}