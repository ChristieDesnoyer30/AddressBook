package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    private ArrayList<Contact> myContacts= new ArrayList<>();

    public void addContact(Contact contact){

        myContacts.add(contact);
    }

    public void printAddressBook(){
        int count = 1;

        for(Contact contact : myContacts){

            System.out.println(count + " " + contact);

            count ++;
        }

    }

    public void deleteUser(int number){
        number -=1;

        System.out.println("You are removing " + myContacts.get(number));

        myContacts.remove(number);

        System.out.println("Your updated address book is : ");

        printAddressBook();

    }


    public void searchByName(String name){


            for(int i = 0; i < myContacts.size(); i++){

                if (name.equalsIgnoreCase(myContacts.get(i).getName())){

                    System.out.println("There is someone with :" + name);
                    System.out.println(myContacts.get(i));

                }

        }

    }


    public void searchByPhoneNo(String phoneNumber){


        for(int i = 0; i < myContacts.size(); i++){

            if (phoneNumber.equals(myContacts.get(i).getPhoneNumber())){

                System.out.println("There is someone with the phone number of" + phoneNumber);
               System.out.println(myContacts.get(i));

            }

        }

    }



    public String wouldYouLikeToContinue(){
        Scanner scan = new Scanner (System.in);

        System.out.println("Would you like to continue? type yes or no?");


        String userContinue = scan.nextLine();

        return userContinue;
    }


}
