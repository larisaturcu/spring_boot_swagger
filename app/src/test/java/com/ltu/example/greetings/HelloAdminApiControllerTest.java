package com.ltu.example.greetings;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.httpBasic;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ltu.example.greetings.model.Greeting;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class HelloAdminApiControllerTest {

	@Autowired
	private MockMvc mvc;

	@Test
	public void getHello() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/admin/api/titi")
				.accept(MediaType.APPLICATION_JSON)).andExpect(status().is(401));
	}
	
	@Test
	public void getHelloWithAuthentication() throws Exception {
		Greeting response = new Greeting("titi", "Hello admin titi");
		ObjectMapper mapper = new ObjectMapper();
		mvc.perform(MockMvcRequestBuilders.get("/admin/hello/titi")
				.with(httpBasic("admin","admin"))
				.accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(content().string(equalTo(mapper.writeValueAsString(response))));
	}
		
}
