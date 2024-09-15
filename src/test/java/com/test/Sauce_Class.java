package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pompackage.Pom_Class;

public class Sauce_Class extends BaseClass {

	public Pom_Class p;

	public static WebDriver driver;

	@Test(priority = 0)
	private void browserLaunch() {

		driver = getBrowser();
	}

	@Test(priority = 1)
	private void url() {
		launchUrl("https://www.saucedemo.com/");

	}

	@Test(priority = 2)
	private void userName() {

		p = new Pom_Class(driver);

		sendKeys(p.getUserName(), "standard_user");
	}

	@Test(priority = 3)
	private void password() {

		p = new Pom_Class(driver);

		sendKeys(p.getPassword(), "secret_sauce");
	}

	@Test(priority = 4)
	private void login() {

		clickAnElement(p.getLogin());
	}

	@Test(priority = 5)
	private void aboutMenu() {

		clickAnElement(p.getMenu());
	}

	@Test(priority = 6)
	private void about() throws InterruptedException {
		Thread.sleep(2000);
		clickAnElement(p.getAbout());
	}

	@Test(priority = 7)
	private void back() throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().back();
	}

	@Test(priority = 8)
	private void validateThePage() {

		String expected = "Swag Labs";
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
	}

	@Test(priority = 9)
	private void addToCart() throws InterruptedException {
		Thread.sleep(2000);
		clickAnElement(p.getAddToCart());
	}

	@Test(priority = 10)
	private void cartToIcon() {

		clickAnElement(p.getCartIcon());
	}

	@Test(priority = 11)
	private void validateTheCartPage() {

		String expected = "Swag Labs";
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
	}

	@Test(priority = 12)
	private void checkOut() {

		clickAnElement(p.getCheckOut());
	}

	@Test(priority = 13)
	private void validateTheCheckoutPage() {

		String expected = "Swag Labs";
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
	}

	@Test(priority = 14)
	private void firstName() {

		sendKeys(p.getfirstName(), "magesh");
	}

	@Test(priority = 15)
	private void lastName() {

		sendKeys(p.getlastName(), "nagappan");
	}

	@Test(priority = 16)
	private void postalCode() {
   
		sendKeys(p.getpostalCode(), "600098");
	}

	@Test(priority = 17)
	private void continueButton() throws InterruptedException {
    Thread.sleep(3000);
		clickAnElement(p.getcontinueBtn());
	}

}
