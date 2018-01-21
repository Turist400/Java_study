package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String name;
  private final String secondname;
  private final String phonenumber;
  private final String email;
  private final String address;
  private String group;

  public ContactData(String name, String secondname, String phonenumber, String email, String address, String group) {
    this.name = name;
    this.secondname = secondname;
    this.phonenumber = phonenumber;
    this.email = email;
    this.address = address;
    this.group = group;
  }

  public String getName() {
    return name;
  }

  public String getSecondname() {
    return secondname;
  }

  public String getPhonenumber() {
    return phonenumber;
  }

  public String getEmail() {
    return email;
  }

  public String getAddress() {
    return address;
  }

  public String getGroup() {
    return group;
  }
}
