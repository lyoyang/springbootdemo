package com.lyoyang.springbootstart;

import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ApplicationTests {

    private static Logger logger = LoggerFactory.getLogger(ApplicationTests.class);

    @Autowired
    private MockMvc mockMvc;

    private static ExecutorService generateThread = Executors.newFixedThreadPool(5);

    @Test
    public void test_index() throws Exception {
        System.out.println(123 + "---->");
        mockMvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("hello springboot"));
    }


    @Test
    public void testExecute() {
        List<Callable<String>> callables = Lists.newArrayList();
        for(int i = 0; i<10; i++) {
            callables.add(new TestRunner(i));
        }
        try {
            generateThread.invokeAll(callables);
        } catch (InterruptedException e) {
            logger.error("主线程发生异常");
        }
    }


    class TestRunner implements Callable<String> {
        private Integer id;

        public TestRunner(Integer id) {
            this.id = id;
        }

        @Override
        public String call() throws Exception {
            Thread.sleep(600000);
            System.out.println("this is:" + id);
            return "OK";
        }
    }

}
