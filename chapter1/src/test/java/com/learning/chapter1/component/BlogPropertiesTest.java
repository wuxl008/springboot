package com.learning.chapter1.component;



import com.learning.chapter1.Chapter1Application;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes =Chapter1Application.class)
public class BlogPropertiesTest {

    private static final Log log = LogFactory.getLog(Chapter1Application.class);

    @Autowired
    private BlogProperties blogProperties;


    /**
     *
     * @throws Exception
     */
    @Test
    public void test1() throws Exception {
        Assert.assertEquals("wuxl", blogProperties.getName());
        Assert.assertEquals("learning", blogProperties.getTitle());
//        Assert.assertEquals("程序猿DD正在努力写《Spring Boot教程》", blogProperties.getDesc());

        log.info("随机数测试输出：");
//        log.info("随机字符串 : " + blogProperties.getValue());
//        log.info("随机int : " + blogProperties.getNumber());
//        log.info("随机long : " + blogProperties.getBignumber());
//        log.info("随机10以下 : " + blogProperties.getTest1());
//        log.info("随机10-20 : " + blogProperties.getTest2());

    }

}
