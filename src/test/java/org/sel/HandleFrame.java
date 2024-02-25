package org.sel;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class HandleFrame {
    @Test
    public void handleFrame(){
    open("{url}");
    switchTo().frame($(By.xpath("{path}")));
    /*
    operation on frame
     */
     switchTo().defaultContent();

    }
}
