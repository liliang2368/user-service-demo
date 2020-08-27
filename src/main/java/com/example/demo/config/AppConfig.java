package com.example.demo.config;

import org.jboss.logging.Logger;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
//@ComponentScan(basePackages = "com.yc")
@EnableTransactionManagement // 查找spring 托管Bean 上是否有
								// @Transactional注解,如果有，则启用事务管理器
								// @Transactional(value="tx")
public class AppConfig {
	private Logger log = Logger.getLogger(AppConfig.class);
//	@Bean   // 键[字符串]: 值[对象]
//	public RedisTemplate redsiTemplate(  JedisConnectionFactory conn   ) {
//        RedisTemplate<byte[], byte[]> template = new RedisTemplate<>();
//        template.setConnectionFactory(conn);
//        template.afterPropertiesSet();
//        return template;
//	}
//
//	@Bean     // 键[字符串]: 值[字符串]
//	public StringRedisTemplate stringRedisTemplate(     JedisConnectionFactory conn      ) {
//        StringRedisTemplate template = new StringRedisTemplate();
//        template.setConnectionFactory(conn);
//        template.afterPropertiesSet();
//        return template;
//	}
	
	
//	@Bean    //  MongoTemplate由spring 托管
//    @Primary
//    public MongoTemplate template() {
//        return new MongoTemplate(factory());
//    }
//
	 /**
     * 功能描述: 创建数据库名称对应的工厂，数据库名称可以通过配置文件导入
     * @param
     * @return:org.springframework.data.mongodb.MongoDbFactory
     * @since: v1.0
     */
//    @Bean("mongoDbFactory")
//    public MongoDbFactory factory() {
//        return new SimpleMongoDbFactory(client(), "yc74ibike");
//    }
//
    /**
     * 功能描述: 配置client，client中传入的ip和端口可以通过配置文件读入
     *
     * @param
     * @return:com.mongodb.MongoClient
     */
//    @Bean("mongoClient")
//    public MongoClient client() {
//        return new MongoClient("192.168.0.200", 27017);
//    }

//	@Bean // TODO: 修改成数据库联接池, 获取数据源
//	public DriverManagerDataSource dataSource() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//		dataSource.setUrl("jdbc:mysql://localhost:3306/ibike");
//		dataSource.setUsername("root");
//		dataSource.setPassword("a");
//		log.info("创建数据源" + dataSource);
//		return dataSource;
//	}

//	@Bean
//	public DataSourceTransactionManager tx(DriverManagerDataSource ds) {
//		log.info("创建事务管理器," + ds);
//		DataSourceTransactionManager dtm = new DataSourceTransactionManager();
//		dtm.setDataSource(ds);
//		return dtm;
//	}

//	@Bean
//	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
//		PropertySourcesPlaceholderConfigurer c = new PropertySourcesPlaceholderConfigurer();
//		c.setIgnoreUnresolvablePlaceholders(true);
//		return c;
//	}

}
