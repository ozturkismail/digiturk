package com.tech.selenium.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by Sridhar Bandi on 5/9/18.
 * Updated on 26/01/19
 */
public class GoogleSearchPage {

    private WebDriver _driver = null;

    @FindBy(id = "login-form:email")
    WebElement _userName;

    @FindBy(id = "login-form:password")
    WebElement _passWord;

    @FindBy(id = "login-form:login")
    WebElement _loginButton;

    @FindBy(className = "login")
    WebElement _nameSurName;



    public GoogleSearchPage(WebDriver driver) {
        this._driver = driver;
        PageFactory.initElements(_driver, this);
    }

    public void openURL(){
        _driver.get("https://demo.borland.com/InsuranceWebExtJS/");
    }

    public void searchFor(String _name,String _pass){
        _userName.sendKeys(_name);
        _passWord.sendKeys(_pass);
        _loginButton.click();
        if(_nameSurName.getText() != "John Smith")
        {
            System.out.println("Giris Basarili");
        }
        else
        {
            _driver.close();
        }
    }
}
