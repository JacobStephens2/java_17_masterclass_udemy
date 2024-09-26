package net.jacobstephens.ArrayList.MobilePhone;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    private boolean addNewContact(Contact contact) {
        // if contact exists already
        if (myContacts.contains(contact)) {
            return false;
        } else {
            myContacts.add(contact);
            return true;
        }
    }

    private boolean removeContact(Contact contact) {
        if (myContacts.contains(contact)) {
            myContacts.remove(contact);
            return true;
        } else {
            return false;
        }
    }

    private int findContact(Contact contact) {
        if (myContacts.contains(contact)) {
            return myContacts.indexOf(contact);
        } else {
            return -1;
        }
    }

    private int findContact(String number) {
        // create contact
        if (myContacts.contains(number)) {
            return myContacts.indexOf(number);
        } else {
            return -1;
        }
    }

    private Contact queryContact(String number) {
        String name = null;
        if (myContacts.contains(number)) { // fix search
            return new Contact(name, number);
        } else {
            return null;
        }
    }

    private void printContacts() {
        System.out.println("Contact List:");

        int i = 0;
        for (Contact contact : myContacts) {
            System.out.println(contact);
            System.out.printf("%d. %s -> %s", i + 1, contact.getName(), contact.getPhoneNumber());
            i++;
        }
    }
}
