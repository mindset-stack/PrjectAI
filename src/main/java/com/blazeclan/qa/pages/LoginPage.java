package com.blazeclan.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(xpath = "//input[@id='id_username']")
    public WebElement loginEmail;
    @FindBy(xpath ="//input[@id='id_password']")
    public WebElement loginPassword;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginBtn;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
