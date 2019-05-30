package com.wen._09test;

import com.wen.MyMvcConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * @Author: wen
 * @Date: 2019/5/29 23:19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MyMvcConfig.class})
@WebAppConfiguration("src/main/resources")//指定加载资源路径的WebApplicationContext
public class TestControllerIntegrationTests {
    private MockMvc mockMvc;//模拟MVC对象
    @Autowired
    private DemoService demoService;
    @Autowired
    WebApplicationContext wac;
    @Autowired
    MockHttpSession session;
    @Autowired
    MockHttpServletRequest request;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();//初始化模拟对象
    }

    @Test
    public void testNormalController() throws Exception {
        mockMvc.perform(get("/normal"))//模拟get请求
                .andExpect(status().isOk())//预期返回状态200
                .andExpect(view().name("page"))//预期返回view
        .andExpect(forwardedUrl("/WEB-INF/classes/views/page.jsp"))//预期页面转向正确路径
        .andExpect(model().attribute("msg",demoService.saySomething()));//预期返回模型属性值
    }

    @Test
    public void testRestController() throws Exception {
        mockMvc.perform(get("/testRest"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("text/plain;charset=UTF-8"))//预期返回媒体类型
                .andExpect(content().string(demoService.saySomething()));
    }
}
