package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactDeletionTests extends TestBase {

  @BeforeMethod
  public void ensurePreconditions() {
    app.getContactHelper().goHomePage();
    if (! app.getContactHelper().IsThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Ivan", "Ivanov", "123456789", "ivanov@mail.ru", "Moscow, Lenina st.", "test1"), true);
    }
  }

  @Test
  public void testContactDeletion() {
    List<ContactData> before = app.getContactHelper().getContactList();
    int index = before.size() - 1;
    app.getContactHelper().selectContact(index);
    app.getContactHelper().deleteContact();
    app.getContactHelper().confirmDeletionContact();
    app.getContactHelper().goHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), index);

    //before.remove(before.size() - 1);
    //Assert.assertEquals(before, after);
  }
}
