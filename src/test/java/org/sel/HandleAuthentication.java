package org.sel;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static com.codeborne.selenide.Selenide.*;

public class HandleAuthentication {
    @Test
    public void handleAuth() throws InterruptedException, MalformedURLException {
//        open("https://the-internet.herokuapp.com/");
        //$(By.linkText("Basic Auth")).click();
        //open("https://the-internet.herokuapp.com/basic_auth","","admin","admin");
        System.setProperty("selenide.browser", "edge");
        open(new URL("https://the-internet.herokuapp.com/basic_auth"),"","admin","admin");
        String text = $(By.cssSelector("div.example")).getText();
        Assert.assertTrue(text.contains("Congratulations! You must have the proper credentials."));
        Thread.sleep(5000);
    }

}

