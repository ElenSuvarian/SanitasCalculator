package com.iteriam.SanitasCalculator.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.iteriam.SanitasCalculator.model.BasicOperandModel;

@AutoConfigureMockMvc
@EnableWebMvc
@TestInstance(Lifecycle.PER_CLASS)
class OperatorTest {
	
	private final static BasicOperandModel OPERAND = new BasicOperandModel(4,10);	
	private final static OperatorController OPERATOR = new OperatorController();
	
	@Autowired
	MockMvc mockMvc;
	
	@BeforeAll
	public void setUp(){
	    mockMvc = MockMvcBuilders.standaloneSetup(OPERATOR).build();
	}
	
	@Test
	public void shouldReturnAddSuccesResponse() throws Exception {
		mockMvc.perform(post("/add").contentType(MediaType.APPLICATION_JSON).content(convertOperandToStringJson(OPERAND)))
        .andExpect(status().isOk());
	}
	
	@Test
	public void shouldReturnSubstractSuccesResponse() throws Exception {
		mockMvc.perform(post("/substract").contentType(MediaType.APPLICATION_JSON).content(convertOperandToStringJson(OPERAND)))
        .andExpect(status().isOk());
	}

	
	private String convertOperandToStringJson(BasicOperandModel operand) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
	    mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
	    ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
	    String request = ow.writeValueAsString(operand);
		return request;		
	}

}
