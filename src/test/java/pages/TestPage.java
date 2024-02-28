package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class TestPage {
    public SelenideElement username = $(By.id("exampleInputEmail1"));
    public SelenideElement password = $(By.id("exampleInputPassword1"));
    public SelenideElement submitButton = $(By.xpath("//button[@type='submit']"));
    public SelenideElement logOutLink = $(By.partialLinkText(" Logout"));

}
