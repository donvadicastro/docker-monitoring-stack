package com.demo.monitoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
