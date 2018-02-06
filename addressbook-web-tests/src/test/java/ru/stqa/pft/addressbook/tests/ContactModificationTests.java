package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;


public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModificatiom() throws InterruptedException {
    app.getContactHelper().goHomePage();
    if (! app.getContactHelper().IsThereAContact()) {
      app.getContactHelper().createContact
      ((new ContactData("Ivan", "Ivanov", "123456789", "ivanov@mail.ru", "Moscow, Lenina st.", "test1")), true);
    }
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().initEdit(before.size() - 1);
    ContactData contact = new ContactData(before.get(before.size() - 1).getId(),"Ivan12", "Ivanov33", "123456789", "ivanov@mail.ru", "Moscow, Lenina st.", "test1");
    app.getContactHelper().fillContactForm(contact);
    app.getContactHelper().submitUpdate();
    app.getContactHelper().goHomePage();

    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size());


    before.remove(before.size() - 1);
    before.add(contact);
    Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
    //Comparator<? super ContactData> byId = Comparator.comparingInt(ContactData::getId);
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before, after);
  }
}
