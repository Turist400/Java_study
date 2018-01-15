package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation() {
    app.initContactCreation();
    app.fillContactForm(new ContactData("Ivan", "Ivanov", "123456789", "ivanov@mail.ru", "Moscow, Lenina st."));
    app.submitContactCreation();
    app.returnToHomePage();
  }

}
