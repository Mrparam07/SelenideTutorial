package org.sel;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class CloseBrowser {

    @Test
    public void closeBrowser(){
        open("https://www.geeksforgeeks.org"); //parent - 0
        System.out.println(title());

        $(By.linkText("90% Refund @Courses")).click(); //child - 1
        switchTo().window(1);
        System.out.println(title());
        closeWindow();
        switchTo().window(0);
        System.out.println(title());
        closeWebDriver();//driver.quit


    }
}
