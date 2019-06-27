package com.example.demo;

import com.example.demo.Controller.HelloController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebAppConfiguration//开启WEB应用的配置，用于模拟
@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {
	private MockMvc mvc;


	@Test
	public void contextLoads() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType
		.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("Hello World")));
	}



	@Before
	public void setUP() throws Exception{

		mvc= MockMvcBuilders.standaloneSetup(new HelloController()).build();

	}


}
