package com.aconex;


import com.aconex.controller.HomeController;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by vlo on 4/17/2016.
 */
public class ApplicationTest {

    @Test
    public void testApp() {

        HomeController hc = new HomeController();
        String result = hc.home();

        assertEquals(result, "Aconex Home Page");

    }
}
