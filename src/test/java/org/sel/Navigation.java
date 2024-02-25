package org.sel;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class Navigation {
    @Test
    public void navigationConcept(){
        open("https://www.google.com");
        System.out.println(title());
        open("https://www.amazon.com");
        System.out.println(title());
        back();
        System.out.println(title());
        forward();
        System.out.println(title());
        back();
        System.out.println(title());

        refresh();
    }
}
