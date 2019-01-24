package com.company;
import java.util.Scanner;
public class AddressesDemo {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        //Create a program that manages an Address Book.
        // +Each entry in the book should include a person's name,
        // +address, phone number and birthday.
        //+Your program should allow a user to view all the entries in the address book,
        // search for a person by name, search for a person by phone number, delete an entry,
        // and add an entry to the Address Book.
        //Think about how to use your knowledge of classes, objects, and collections to architect your program!
        AddressBook addy = new AddressBook();
        addy.addContact(new Contact("Christie Desnoyer","4895 Audubon Rd Detroit Mi","3135158544", 8121988));
        addy.addContact(new Contact("Eric Hurd","4895 Audubon Rd Detroit Mi","7346350699", 7281988));

//        //add a contact
//        System.out.println("Add a contact");
//        System.out.println("Name: ");
//        String name = scan.nextLine();
//        System.out.println("Address: ");
//        String address = scan.nextLine();
//        System.out.println("Phone No: ");
//        String phoneNum = scan.nextLine();
//        System.out.println("Birthday: ");
//        int bday= scan.nextInt();
//
//        addy.addContact(new Contact(name, address, phoneNum, bday));
//
//
//        //print addresses
//        addy.printAddressBook();
//
//        //delete a user
//        System.out.println("Remove a contact?");
//        int deleteNumber = scan.nextInt();
//        addy.deleteUser(deleteNumber);


        //search user name
        System.out.println("Search by name?");
        String name2= scan.nextLine();
        addy.searchByName(name2);


        //search by phone number
        System.out.println("Search by phone number?");
        String phone= scan.nextLine();
        addy.searchByPhoneNo(phone);



    }
}
