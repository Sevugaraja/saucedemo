package com.pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Class {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@data-test='username']")
	private WebElement userName;

	
	@FindBy(id = "password")
	private WebElement password;

	public WebElement getUserName() {
		return userName;
	}


	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath = "//input[@id='login-button']")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

	@FindBy(xpath = "//button[text()='Open Menu']")
	private WebElement menu;

	public WebElement getMenu() {
		return menu;
	}

	@FindBy(xpath = "//a[text()='About']")
	private WebElement about;

	public WebElement getAbout() {
		return about;
	}

	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	private WebElement addToCart;

	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement cartIcon;

	public WebElement getAddToCart() {
		return addToCart;

	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getCartIcon() {
		return cartIcon;
	}

	@FindBy(xpath = "//button[@id='checkout']")
	private WebElement checkOut;

	@FindBy(xpath = "//input[@id='first-name']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@data-test='lastName']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@id='postal-code']")
	private WebElement postalCode;

	@FindBy(id = "continue")
	private WebElement continueBtn;

	public WebElement getfirstName() {
		return firstName;
	}

	public WebElement getlastName() {
		return lastName;
	}

	public WebElement getpostalCode() {
		return postalCode;
	}

	public WebElement getcontinueBtn() {
		return continueBtn;
	}

	public Pom_Class(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

}
