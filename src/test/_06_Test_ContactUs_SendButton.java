package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Contact_Us_Page;
import utilities.Driver;

public class _06_Test_ContactUs_SendButton {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        Contact_Us_Page.navigateToContactUsPage();

        WebElement sendButton = driver.findElement(By.xpath("//div[@data-ux='Block']/button"));
        System.out.println(sendButton.isDisplayed() ? "Send button is displayed validation: PASSED" : "Send button is displayed validation: FAILED");
        System.out.println(sendButton.isEnabled() ? "Send button is enabled validation: PASSED" : "Send button is enabled validation: FAILED");
        System.out.println(sendButton.getText().equals("SEND") ? "Send button text is displayed validation: PASSED" : "Send button text is displayed validation: FAILED");


        Driver.quitDriver();



    }
}
