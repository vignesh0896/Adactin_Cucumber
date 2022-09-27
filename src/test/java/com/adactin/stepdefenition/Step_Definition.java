package com.adactin.stepdefenition;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseClass.Base_Class;
import com.adactin.runner.Runnerclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {
	
	public static WebDriver driver=Runnerclass.driver;

	@Given("^user Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws Throwable {
		
		driver=geturl("https://adactinhotelapp.com/");
		

	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("AKASHRAGHUNATHAN");

	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("73627362");

	}

	@Then("^user Click The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
		driver.findElement(By.xpath("//input[@name='login']")).click();

	}

	@When("^user Needs To Select The Location Of Their Chioce$")
	public void user_Needs_To_Select_The_Location_Of_Their_Chioce() throws Throwable {
		WebElement loc = driver.findElement(By.xpath("//select[@name='location']"));
		Select s = new Select(loc);
		s.selectByValue("Melbourne");

	}

	@When("^user Needs TO Select The Hotel Of Their Choice$")
	public void user_Needs_TO_Select_The_Hotel_Of_Their_Choice() throws Throwable {
		WebElement hot = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select v = new Select(hot);
		v.selectByVisibleText("Hotel Sunshine");

	}

	@When("^user Selects The Room Type$")
	public void user_Selects_The_Room_Type() throws Throwable {
		WebElement type = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select w = new Select(type);
		w.selectByVisibleText("Double");

	}

	@When("^user Select The Total Number Of Rooms To Be Booked$")
	public void user_Select_The_Total_Number_Of_Rooms_To_Be_Booked() throws Throwable {
		WebElement room = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select x = new Select(room);
		x.selectByValue("2");

	}

	@When("^user Selects The Checkin Date$")
	public void user_Selects_The_Checkin_Date() throws Throwable {
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("10/12/2022");

	}

	@When("^user Selects The Checkout Date$")
	public void user_Selects_The_Checkout_Date() throws Throwable {
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("11/12/2022");

	}

	@When("^user Selects The Number Of Adults Per Room$")
	public void user_Selects_The_Number_Of_Adults_Per_Room() throws Throwable {
		WebElement per = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select y = new Select(per);
		y.selectByValue("3");

	}

	@When("^user Selects The Number Of Childrens Per Room$")
	public void user_Selects_The_Number_Of_Childrens_Per_Room() throws Throwable {
		WebElement child = driver.findElement(By.id("child_room"));
		Select se = new Select(child);
		se.selectByValue("2");

	}

	@Then("^user Click The Search Button And It Navigates To Select Hotel Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {
		Thread.sleep(3000);
		WebElement click = driver.findElement(By.xpath("//input[@value='Search']"));
		click.click();

	}

	@When("^user Click The Radio Button By Confirming The Details$")
	public void user_Click_The_Radio_Button_By_Confirming_The_Details() throws Throwable {
		
		driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
	}

	@Then("^user Click The Continue Button And It Navigates To Book A Hotel Page$")
	public void user_Click_The_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Continue']")).click();

	}

	@When("^user Needs To Fill The First Name In The Text Field$")
	public void user_Needs_To_Fill_The_First_Name_In_The_Text_Field() throws Throwable {
		WebElement findElement = driver.findElement(By.xpath("//input[@id='first_name']"));
		findElement.sendKeys("Akash");

	}

	@When("^user Needs To Fill The Last Name In The Text Field$")
	public void user_Needs_To_Fill_The_Last_Name_In_The_Text_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Raghunathan");

	}

	@When("^user Needs To Fill The Billing Address Of Their Respective Location$")
	public void user_Needs_To_Fill_The_Billing_Address_Of_Their_Respective_Location() throws Throwable {
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("21,venbakkam");

	}

	@When("^user Needs To Enter The Credit Card Number$")
	public void user_Needs_To_Enter_The_Credit_Card_Number() throws Throwable {
		driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("1232 1213 2132 1225");

	}

	@When("^user Needs To Select The Type Of Credit Card They Have$")
	public void user_Needs_To_Select_The_Type_Of_Credit_Card_They_Have() throws Throwable {
		WebElement date = driver.findElement(By.xpath("//select[@class='select_combobox']"));
		Select z = new Select(date);
		z.selectByValue("MAST");

	}

	@When("^user Needs To Fill The Expiry Date Of Their Card In Respective Field$")
	public void user_Needs_To_Fill_The_Expiry_Date_Of_Their_Card_In_Respective_Field() throws Throwable {
		WebElement ex = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select l = new Select(ex);
		l.selectByValue("2");
		WebElement ex1 = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select l1 = new Select(ex1);
		l1.selectByIndex(2);

	}

	@When("^user Needs to Enter Their Cvv Number In The Card$")
	public void user_Needs_to_Enter_Their_Cvv_Number_In_The_Card() throws Throwable {
		
		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("256");

	}

	@Then("^user Click The Book Button And It Navigates To Booking Confirmation Page$")
	public void user_Click_The_Book_Button_And_It_Navigates_To_Booking_Confirmation_Page() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Book Now']")).click();

	}

	@Then("^user On Clicking The Logoutbutton It Sucessfully Logouts From The Application$")
	public void user_On_Clicking_The_Logoutbutton_It_Sucessfully_Logouts_From_The_Application() throws Throwable {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement logout = driver.findElement(By.id("logout"));
		logout.click();
	}

}
