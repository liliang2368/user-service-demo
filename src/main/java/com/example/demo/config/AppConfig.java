package com.example.demo.config;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import redis.clients.jedis.Jedis;

@Configuration
@ComponentScan(basePackages = "com.example")
@EnableTransactionManagement // 查找spring 托管Bean 上是否有
								// @Transactional注解,如果有，则启用事务管理器
@PropertySource("classpath:/properties/redis.properties")
public class AppConfig {
	private Logger log = Logger.getLogger(AppConfig.class);
	@Value("${redis.hostName}")
	private String host;
	@Value("${redis.port}")
	private Integer port;

	//将返回值的结果交给spring容器进行管理,如果以后想要使用该对象则可以直接注入.
	@Bean
	public Jedis jedis() {

		return new Jedis(host, port);
	}


}
