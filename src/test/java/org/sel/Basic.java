package org.sel;


import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.Assert;
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
        $("[name='q']").setValue("Parambir Kumar").pressEnter();
        $("#search").shouldBe(Condition.visible);
        String header = $(By.xpath("//h3[text()='Parambir Kumar - Vellore Institute of Technology - India']")).getText();
        System.out.println(header);
        Assert.assertEquals(header,"Parambir Kumar - Vellore Institute of Technology - India");
        int count = $$(By.cssSelector(".LC20lb.MBeuO.DKV0Md")).size();
        System.out.println(count);
    }
}
