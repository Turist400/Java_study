package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

  public ContactHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void submitContactCreation() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"), contactData.getName());
    type(By.name("lastname"), contactData.getSecondname());
    type(By.name("address"), contactData.getAddress());
    type(By.name("mobile"), contactData.getPhonenumber());
    type(By.name("email"), contactData.getEmail());

  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }
}
