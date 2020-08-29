package com.example.demo;

import com.example.demo.util.DbMailHelper;
import com.netflix.discovery.converters.Auto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= DemoApplication.class) //这里DemoApplication要改成你的项目启动类名
public class DemoApplicationTests {
	@Autowired
	private DbMailHelper dbMailHelper;
	@Autowired
	private Jedis jedis;
	@Test
	public void Test1(){
		/*填你的测试信息*/
		String to ="1003177738@qq.com";
		String title="密码找回";
		String context ="本次验证哟9年公寓密码找回 请不要告知他人 验证码为"+dbMailHelper.verifyCode();
		dbMailHelper.sendVertifyCode(to,title,context);
	}
	/**
	 * 测试redis
	 */
   @Test
	public void testredis()
   {
   	jedis.set("a","123");
   	jedis.set("a","sfg");
	   System.out.println(jedis.get("a"));
   }
}
