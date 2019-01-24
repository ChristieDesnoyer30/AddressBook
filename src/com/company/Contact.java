package com.company;

public class Contact {

    private String name;
    private String address;
    private String phoneNumber;
    private int birthday;



    public Contact(String name, String address, String phoneNumber, int birthday) {

        this.name = name;

        this.address = address;

        this.phoneNumber = phoneNumber;

        this.birthday = birthday;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Name : " +  name +
                ", address :'" + address +
                ", phone number : " + phoneNumber +
                ", birthday : " + birthday;
    }
}
