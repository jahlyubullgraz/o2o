package com.imooc.o2o;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 配置Spring和Junit整合，Junit启动时加载SpringIOC容器
 * @author garyli
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉Junit Spring配置文件位置
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class BaseTest {
	

}