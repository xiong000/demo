package com.didspace;

import com.example.demo.DemoApplication;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@WebAppConfiguration//开启WEB应用的配置，用于模拟
@SpringApplicationConfiguration(calsses= DemoApplication.class)
@RunWith(SpringJUnit4ClassRunner .class)
public class HelloApplicationTests {
    private  MockMvc mvc;
    @Before
    public void setUP() throws Exception{

        mvc= MockMvcBuilders.standaloneSetup(new HelloController()).build();

    }


}
