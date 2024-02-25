package org.sel;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelectDropDown {
    @Test
    public void selectDropDown() throws InterruptedException {
        //Select html tag
        open("https://www.orangehrm.com/orangehrm-30-day-trial/");
        $(By.id("Form_getForm_Country")).selectOption(2);
        Thread.sleep(2000);
        $(By.id("Form_getForm_Country")).selectOption("India");
        Thread.sleep(2000);
        $(By.id("Form_getForm_Country")).selectOptionByValue("France");
        Thread.sleep(2000);

        //without select tag xpath/css selector
        ElementsCollection colls = $$(By.cssSelector("select#Form_getForm_country option"));
        System.out.println(colls.size());
        for(SelenideElement e : colls){
            String text = e.getText();
            System.out.println(text);
            if(text.equals("India")){
               e.click();
               break;
            }
        }
        Thread.sleep(2000);

    }
}
