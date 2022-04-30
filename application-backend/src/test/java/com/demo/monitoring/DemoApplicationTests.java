package com.demo.monitoring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemoApplicationTests {
    DemoApplication application = new DemoApplication();

    @Test
    void testApplication() {
        assertNotNull(application);
    }

    @Test
    void testIsReady() {
        assertTrue(application.isReady());
    }
}
