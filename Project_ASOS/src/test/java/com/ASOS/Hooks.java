package com.ASOS;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks {
    DriverManager dm = new DriverManager();

    @Before

    public void invokeBrowser() throws IOException
    {
        dm.getProperties();
        dm.openBrowser();
    }

    @After

    public void tearDown()
    {
        dm.closeBrowser();
    }
}
