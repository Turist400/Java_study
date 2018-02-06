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
    if (app.getContactHelper().list().size() == 0) {
      app.getContactHelper().create(new ContactData("Ivan", "Ivanov", "123456789", "ivanov@mail.ru", "Moscow, Lenina st.", "test1"), true);
    }
  }

  @Test
  public void testContactDeletion() {
    List<ContactData> before = app.getContactHelper().list();
    int index = before.size() - 1;
    app.getContactHelper().delete(index);
    List<ContactData> after = app.getContactHelper().list();
    Assert.assertEquals(after.size(), before.size() -1);

    //before.remove(before.size() - 1);
    //Assert.assertEquals(before, after);
  }


}
