package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModificatiom() {
    app.getContactHelper().goHomePage();
    if (! app.getContactHelper().IsThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Ivan", "Ivanov", "123456789", "ivanov@mail.ru", "Moscow, Lenina st.", "test1"), true);
    }
    app.getContactHelper().initEdit();
    app.getContactHelper().fillContactForm(new ContactData("IvanUp", "IvanovUP", "1234567890", "ivanovUP@mail.ru", "MoscowUP, Lenina st.", null), false);
    app.getContactHelper().submitUpdate();
    app.getContactHelper().goHomePage();
  }
}
