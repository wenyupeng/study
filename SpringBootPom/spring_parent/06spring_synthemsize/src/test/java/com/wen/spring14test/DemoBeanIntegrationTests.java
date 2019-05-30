package com.wen.spring14test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: wen
 * @Date: 2019/5/26 11:30
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)//加载配置ApplicationContext
@ActiveProfiles("prod")//声明活动的profile
public class DemoBeanIntegrationTests {
    @Autowired
    private TestBean testBean;

    @Test
    public void prodBeanShouldInject(){
        String expected="from production profile";
        String actual=testBean.getContent();
        Assert.assertEquals(expected,actual);
    }
}
