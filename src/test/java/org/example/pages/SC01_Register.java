package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;

public class P01_Register {

    public WebElement registerationLink(){
        By registerLink = By.className("ico-register");
        return driver.findElement(registerLink);
    }

    public WebElement choosegenderCheckBox() {
        By genderCheckBox = By.id("gender-male");
        return driver.findElement(genderCheckBox);
    }

    public WebElement FirstNameEntryField() {
        By insertFirstName = By.id("FirstName");
        return driver.findElement(insertFirstName);
    }

    public WebElement LastNameEntryField() {
        By insertLastName = By.id("LastName");
        return driver.findElement(insertLastName);
    }

    public WebElement BirthingDayDropDown() {
        By selectBirthDay = By.name("DateOfBirthDay");
        return driver.findElement(selectBirthDay);
    }

    public WebElement BirthingMonthDropDown() {
        By selectBirthMonth = By.name("DateOfBirthMonth");
        return driver.findElement(selectBirthMonth);
    }

    public WebElement BirthingYearDropDown() {
        By selectBirthYear = By.name("DateOfBirthYear");
        return driver.findElement(selectBirthYear);
    }

    public WebElement EmailAddressEntryField() {
        By emailAddressTxtField = By.cssSelector("div[class=\"inputs\"] > input[type=\"email\"]");
        return driver.findElement(emailAddressTxtField);
    }

    public String validEmail() {
        return "test103@example.com";
    }

    public WebElement PwEntryField() {
        By passwordTxtField = By.id("Password");
        return driver.findElement(passwordTxtField);
    }

    public String validPassword() {
        return "testpassword101";
    }

    public WebElement ConfirmPWEntryField() {
        By confirmPassTxtField = By.id("ConfirmPassword");
        return driver.findElement(confirmPassTxtField);
    }

    public WebElement registerButton() {
        By registerButton = By.cssSelector("button[name=\"register-button\"]");
        return driver.findElement(registerButton);
    }

    public WebElement successMsg() {
        By successMsg = By.cssSelector("div[class=\"result\"]");
        return driver.findElement(successMsg);
    }

}
