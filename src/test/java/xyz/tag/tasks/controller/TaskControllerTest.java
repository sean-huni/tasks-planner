package xyz.tag.tasks.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * PROJECT   : tasks
 * PACKAGE   : xyz.tag.tasks.controller
 * USER      : sean
 * DATE      : 29-Sat-Jun-2019
 * TIME      : 03:03
 * E-MAIL    : kudzai@bcs.org
 * CELL      : +27-64-906-8809
 */
@AutoConfigureMockMvc
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TaskControllerTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(TaskControllerTest.class);

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    public void setUp() {
        LOGGER.info("Testing...");
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void givenTasksEndpoint_whenGetTasks_thenReturnTasks() throws Exception {

        final MvcResult mvcResult = mockMvc.perform(get("/api/v1/tasks")
                .contentType("application/json"))
                .andDo(print())
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$.[0].id").isNotEmpty())
                .andExpect(jsonPath("$.[0].id").isNumber())
                .andExpect(jsonPath("$.[0].id").value(1))
                .andExpect(jsonPath("$.[4].id").isNotEmpty())
                .andExpect(jsonPath("$.[4].id").isNumber())
                .andExpect(jsonPath("$.[4].id").value(5))
                .andReturn();

        LOGGER.info(mvcResult.getResponse().getContentAsString());
    }
}