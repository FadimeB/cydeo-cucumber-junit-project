package com.cydeo.pages.librarian;

import io.cucumber.java.an.E;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage extends  Librarian_BasePage{

    @FindBy(xpath = "//a[@href=\"tpl/add-user.html\"]")
    public WebElement addUser;

    @FindBy(name = "full_name")
    public WebElement fullName;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(xpath = "//button[.='Save changes']")
    public WebElement saveBtn;

    @FindBy(css = "div.toast-message")
    public WebElement message;

    @FindBy(partialLinkText = "Log Out")
    public WebElement logOutLink;

    @FindBy(css = "#navbarDropdown>span")
    public WebElement accountHolderName;




}
