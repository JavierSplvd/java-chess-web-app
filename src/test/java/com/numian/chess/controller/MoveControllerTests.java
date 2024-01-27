package com.numian.chess.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.numian.chess.config.SecurityConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(MoveController.class)
@ContextConfiguration(classes = { SecurityConfig.class, MoveController.class })
public class MoveControllerTests {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void move() throws Exception {
    mockMvc
      .perform(get("/api/move/b123").header("X-API-KEY", "1234567890"))
      .andExpect(status().isOk());
  }
}
