package org.sel;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;


public class FindElementConcept {
    @Test
    public void findElementConcept(){
        open("https://www.freshworks.com");
        ElementsCollection colls = $$(By.xpath("//footer//ul/li/a"));
        System.out.println(colls.size());
//        colls.forEach(e -> {
//            System.out.println(e.getText());
//        });
        List<String> footerTextList = colls.texts();
        footerTextList.forEach(e -> System.out.println(e));
        for(String item: footerTextList){
            System.out.println(item);
        }
        //colls.last(10).forEach(e -> System.out.println(e.getText()));

//        open("https://www.amazon.com");
//        ElementsCollection col = $$(By.tagName("a"));
//        System.out.println(col.size());
//        for(SelenideElement c: col){
//            String text = c.getText();
//            String href = c.getAttribute("href");
//            System.out.println(href);
//        }
//        col.shouldHave(CollectionCondition.sizeLessThan(5));

        /*
            $ = single element
            $$ = driver.element

            $ (dollar sign): This method is used to find a single element that matches the given CSS selector.
             It returns a SelenideElement object representing the found element.
             If multiple elements match the selector, it returns the first matching element.
             If no elements match, it throws an ElementNotFound exception.
                      SelenideElement element = $(By.cssSelector(".class1"));

             $$ (double dollar sign): This method is used to find multiple elements that match the given CSS selector.
             It returns a ElementsCollection object containing SelenideElement objects representing the found elements.
             If no elements match, it returns an empty collection.
                        ElementsCollection elements = $$(By.cssSelector(".class1"));
         */
    }
}
