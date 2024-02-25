package org.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class JSAlertHandlePopup {
    @Test
    public void jSAlertHandlePopup() throws InterruptedException {
        /*
        ALert - Confirmation Message - Prompt
         */
        open("https://mail.rediff.com/cgi-bin/login.cgi");
        $(By.name("proceed")).click();
        Thread.sleep(5000);
        Alert alert = switchTo().alert();
        String text = alert.getText();
        Assert.assertEquals(text, "Please enter a valid user name");
        alert.accept();//ok button
        //alert.dismiss();//cancel alert
        //alert.sendKeys("param");
    }
}
