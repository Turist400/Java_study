package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;


public class ContactModificationTests extends TestBase {

  @BeforeMethod
  public void ensurePreconditions(){
    app.getContactHelper().goHomePage();
    if (app.getContactHelper().list().size() == 0) {
      app.getContactHelper().create((new ContactData("Ivan", "Ivanov", "123456789", "ivanov@mail.ru", "Moscow, Lenina st.", "test1")), true);
    }
  }

  @Test
  public void testContactModificatiom() throws InterruptedException {
    List<ContactData> before = app.getContactHelper().list();
    int index = before.size() - 1;
    ContactData contact = new ContactData(before.get(index).getId(),"Ivan12", "Ivanov33", "123456789", "ivanov@mail.ru", "Moscow, Lenina st.", "test1");
    app.getContactHelper().modify(index, contact);
    List<ContactData> after = app.getContactHelper().list();
    Assert.assertEquals(after.size(), before.size());


    before.remove(index);
    before.add(contact);
    Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
    //Comparator<? super ContactData> byId = Comparator.comparingInt(ContactData::getId);
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before, after);
  }


}
