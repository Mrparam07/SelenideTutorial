package org.sel;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class WaitConcept {
    /*
        Default wait time in selenide is 4 sec
        in selenium there is no default time
     */
    @Test
    public void waitConcept(){
        //Default timrout
        Configuration.timeout = 5000;//milliseconds
        open("https://api.cogmento.com/register/");
        $(By.partialLinkText("Log in here")).click();
        SelenideElement email = $(By.name("email"));
        email.should(Condition.visible, Duration.ofSeconds(10)).sendKeys("param");
        actions().moveToElement($(By.linkText("Sign Up"))).click().build().perform();
        SelenideElement checkBox = $(By.name("terms"));
//        checkBox.click();
        //if the checkbox is not selected within 10 seconds then it got failed
//        checkBox.should(Condition.checked, Duration.ofSeconds(10));
        //or
//        checkBox.shouldBe(Condition.checked);
        checkBox.shouldNot(Condition.checked);
    }
}
