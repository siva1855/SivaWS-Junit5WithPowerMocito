package com.siva.rest.testcase;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.siva.restcontroller.WelcomeRestController;
import com.siva.service.WelcomeService;

@WebMvcTest(value = WelcomeRestController.class)
public class WelcomeRestControllerTest {

	@MockBean
	private WelcomeService welcomeService;

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void test_welcomeMsg() throws Exception {

		when(welcomeService.getWelcomeMsg()).thenReturn("this is test msg");

		MockHttpServletRequestBuilder reqBuilder = MockMvcRequestBuilders.get("/welcome");
		MvcResult mvcResult = mockMvc.perform(reqBuilder).andReturn();

		//String responseStr = mvcResult.getResponse().getContentAsString();

		int status = mvcResult.getResponse().getStatus();

		assertEquals(200, status);

	}

}
