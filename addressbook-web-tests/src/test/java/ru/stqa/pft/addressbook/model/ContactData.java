package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class ContactData {
  private int id;
  private final String name;
  private final String secondname;
  private final String phonenumber;
  private final String email;
  private final String address;
  private String group;

  public ContactData(String name, String secondname, String phonenumber, String email, String address, String group) {
    this.id = Integer.MAX_VALUE;
    this.name = name;
    this.secondname = secondname;
    this.phonenumber = phonenumber;
    this.email = email;
    this.address = address;
    this.group = group;
  }

  public int getId() {
    return id;
  }

  public ContactData(int id, String name, String secondname, String phonenumber, String email, String address, String group) {
    this.id = id;
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

  public void setId(int id) {
    this.id = id;


  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData that = (ContactData) o;

    return Objects.equals(name, that.name) &&
            Objects.equals(secondname, that.secondname);

  }

  @Override
  public int hashCode() {
    return Objects.hash(name, secondname);
  }

  @Override
  public String toString() {
    return "ContactData{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", secondname='" + secondname + '\'' +
            '}';
  }
}
