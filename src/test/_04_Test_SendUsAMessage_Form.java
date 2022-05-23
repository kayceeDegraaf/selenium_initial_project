package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Contact_Us_Page;
import utilities.Driver;

public class _04_Test_SendUsAMessage_Form {
    public static void main(String[] args) {

    WebDriver driver = Driver.getDriver();
        Contact_Us_Page.navigateToContactUsPage();

    WebElement firstName = driver.findElement(By.xpath("//input[@data-aid='First Name']"));
    WebElement lastName = driver.findElement(By.xpath("//input[@data-aid='Last Name']"));
    WebElement email = driver.findElement(By.xpath("//input[@data-aid='CONTACT_FORM_EMAIL']"));

    WebElement firstNameText = driver.findElement(By.xpath("(//label[@data-ux='InputFloatLabelLabel'])[1]"));
    WebElement lastNameText = driver.findElement(By.xpath("(//label[@data-ux='InputFloatLabelLabel'])[2]"));
    WebElement emailText = driver.findElement(By.xpath("(//label[@data-ux='InputFloatLabelLabel'])[3]"));
    WebElement messageBody = driver.findElement(By.tagName("textarea"));

        firstName.sendKeys("Kaycee");
        lastName.sendKeys("De Graaf");
        email.sendKeys("test@gmail.com");
        messageBody.sendKeys("Test 4 Send Us A Message");

        System.out.println(firstName.isDisplayed() ? "First name input box is displayed validation: PASSED" : "First Name input box is displayed validation: FAILED");
        System.out.println(lastName.isDisplayed() ? "Last name input box is displayed validation: PASSED" : "Last Name input box is displayed validation: FAILED");
        System.out.println(email.isDisplayed() ? "Email input box is displayed validation: PASSED" : "Email input box is displayed validation: FAILED");
        System.out.println(messageBody.isDisplayed() ? "Message input box is displayed validation: PASSED" : "Message input box is displayed validation: FAILED");

        System.out.println(firstName.getAttribute("value").equals("Kaycee") ? "User first name send keys validation: PASSED" : "User first name send keys validation: FAILED");
        System.out.println(lastName.getAttribute("value").equals("De Graaf") ? "User last name send keys validation: PASSED" : "User last name send keys validation: FAILED");
        System.out.println(email.getAttribute("value").equals("test@gmail.com") ? "User email send keys validation: PASSED" : "User email send keys validation: FAILED");
        System.out.println(messageBody.getText().equals("Test 4 Send Us A Message") ? "User message send keys validation: PASSED" : "User message send keys validation: FAILED");

        System.out.println(firstNameText.getText().equals("First Name*") ? "First Name label validation: PASSED" : "First Name label validation: FAILED");
        System.out.println(lastNameText.getText().equals("Last Name*") ? "Last Name label validation: PASSED" : "Last Name label validation: FAILED");
        System.out.println(emailText.getText().equals("Email*") ? "Email label validation: PASSED" : "Email label validation: FAILED");
        System.out.println(messageBody.getAttribute("placeholder").equals("Message*") ? "Message label validation: PASSED" : "Message label validation: FAILED");

        Driver.quitDriver();
}
}

