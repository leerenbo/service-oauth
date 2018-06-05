//package com.yibaijin.service.boot.web;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.redis.connection.RedisConnection;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.security.oauth2.provider.token.TokenStore;
//import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import javax.annotation.Resource;
//import java.sql.SQLException;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class ServiceBootWebApplicationTests {
//
////    @Test
////    public void test() {
////
////    }
//
//    @Resource
//    RedisConnectionFactory redisConnectionFactory;
//
//    @Autowired
//    RedisTokenStore tokenStore;
//
//   Logger logger = LogManager.getLogger();
//
////    @Test
////    public void test() throws SQLException {
////        RedisConnection conn = tokenStore.getAccessToken()getConnection();
////        conn.openPipeline();
////        byte[] accessKey="asdf".getBytes();
////        byte[] serializedAccessToken="zxcv".getBytes();
////        conn.set(accessKey, serializedAccessToken);
////        conn.closePipeline();
////        conn.close();
////
////    }
//
//
//}
