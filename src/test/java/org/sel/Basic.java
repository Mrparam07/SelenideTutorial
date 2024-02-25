package org.sel;


import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class Basic {
    @Test
    public void googleSearch() throws InterruptedException {
        open("https://www.google.com/");
//        $(By.name("q")).sendKeys("Parambir Kumar");
//        $(By.name("btnK")).pressEnter();
//        $(By.id("logo")).shouldHave(appear);
          // Perform the search
        $("[name='q']").setValue("Parambir Kumar").pressEnter();
          // Wait for the search results to appear
        $("#search").shouldBe(Condition.visible);
    }
}
