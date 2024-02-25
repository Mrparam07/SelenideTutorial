package org.sel;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class UserAction {
    /*
        actions()
        Drag and drop
        Right Click
        Release etc
     */
    @Test
    public void userAction() throws InterruptedException {
        open("https://www.spicejet.com");
        SelenideElement addOn = $(By.xpath("//div[text()='Add-ons']"));
        actions().moveToElement(addOn).build().perform();
        SelenideElement visaService = $(By.xpath("//div[text()='Visa Services']"));
        visaService.click();

        Thread.sleep(5000);
    }
    @Test
    public void dragAndDrop() throws InterruptedException {
        //three action needed
        open("https://jqueryui.com/resources/demos/droppable/default.html");

        SelenideElement sourceEle = $(By.id("draggable"));
        SelenideElement targetEle = $(By.id("droppable"));

        //first way
        actions()
                .clickAndHold(sourceEle)
                        .moveToElement(targetEle)
                                .release()
                                        .perform();
        //Second Way
        actions().dragAndDrop(sourceEle, targetEle).build().perform();
        Thread.sleep(5000);
    }
    @Test
    public void rightClick() throws InterruptedException {
        open("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        //Context menu (double click) on specific element
        SelenideElement rightClickElement = $(By.xpath("//span[text()='right click me']"));
        actions().contextClick(rightClickElement).build().perform();

        //right click on page
        actions().contextClick().build().perform();
        Thread.sleep(5000);
    }
}
