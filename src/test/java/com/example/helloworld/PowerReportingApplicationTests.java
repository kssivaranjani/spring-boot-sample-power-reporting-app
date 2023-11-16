package com.example.helloworld;

import com.example.helloworld.controller.PowerReportingController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
class PowerReportingApplicationTests {

    @Autowired
    private PowerReportingController powerReportingController;

    @Test
    void contextLoads() {
        // to ensure that controller is getting created inside the application context
        assertNotNull(powerReportingController);
    }

}
