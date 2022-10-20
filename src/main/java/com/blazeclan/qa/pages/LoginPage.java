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
    @FindBy(xpath = "//body/div[@id='container']/div[@id='content']/div[1]/form[1]/div[3]/input[1]")
    public WebElement loginBtn;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
