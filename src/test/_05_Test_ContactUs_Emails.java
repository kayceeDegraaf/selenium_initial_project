package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Contact_Us_Page;
import utilities.Driver;

public class _05_Test_ContactUs_Emails {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        Contact_Us_Page.navigateToContactUsPage();

        WebElement signUp = driver.findElement(By.xpath("(//div[@data-ux='Element'])[2]"));
        WebElement signUpInput = driver.findElement(By.cssSelector("input[data-aid='CONTACT_FORM_EMAIL_OPT_IN']"));

        signUp.click();
        System.out.println(signUpInput.isSelected() ? "Sign up selected validation: PASSED" : "Sign up selected validation: FAILED");

        signUp.click();
        System.out.println(!signUpInput.isSelected() ? "Sign up NOT selected validation: PASSED" : "Sign up NOT selected validation: FAILED");


        Driver.quitDriver();






    }
}
