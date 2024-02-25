package org.sel;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class LaunchBrowser {
    @Test
    public void launchBrowser(){
        //Configuration.browser = "edge";

        //BaseUrl
        Configuration.baseUrl = "https://www.google.com";
        System.setProperty("selenide.browser", "edge");
        Configuration.screenshots = false;

        //without opening the browser
        //Configuration.headless = true;

        //System.setProperty("webdriver.gecko.driver", "{path}");
        //GeckoDriver is the WebDriver implementation for Firefox. It is a proxy for using W3C WebDriver-compatible clients to interact with Gecko-based browsers, such as Firefox

        //we can use any binary file or any specif version of browers then we need to download and set the path first
        //Configuration.browserBinary = "{path}";
        //System.setProperty("selenide.browserBinary", "{path}");

        //by default it will open  chorme browser
        open("/search?q=Parambir+Kumar");
        int count = $$(By.cssSelector(".LC20lb.MBeuO.DKV0Md")).size();
        $$(By.cssSelector(".LC20lb.MBeuO.DKV0Md")).shouldHave(CollectionCondition.size(9));
        System.out.println(count);
        Assert.assertEquals(count, 10);
    }
}
