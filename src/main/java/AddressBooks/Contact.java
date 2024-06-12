package AddressBooks;

import java.util.ArrayList;
import java.util.Scanner;

public class Contact {
    private String name;
    private String company;
    private String email;
    private String phone;

    ArrayList<Contact> contacts = new ArrayList<>();

    public void addAddressBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Contact Name");
        name = sc.nextLine();
        System.out.println("Please enter Contact Company");
        company = sc.nextLine();
        System.out.println("Please enter Contact Email");
        email = sc.nextLine();
        System.out.println("Please enter Contact Phone");
        phone = sc.nextLine();
        Contact contact = new Contact(name, company, email, phone);
        contacts.add(contact);
    }

    public void displayTelephoneNumberByName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Contact Name");
        name = sc.nextLine();
        System.out.printf("%-15s\n", "Phone number");
        int key = -1;
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contact.getName().equals(name)) {
                key = i;
                System.out.printf("%-15s\n", contact.getPhone());
            }
        }
        if (key == -1) {
            System.out.println("“Not found”");
        }
    }

    public void displayContact() {
        System.out.printf("%-15s  %-30s %-30s %-30s\n", "Contact Name", "Company", "Email", "Phone number");
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            System.out.printf("%-15s  %-30s %-30s %-30s\n", contact.getName(), contact.getCompany(), contact.getEmail(), contact.getPhone());
        }
    }

    public Contact() {
    }

    public Contact(String name, String company, String email, String phone) {
        this.company = company;
        this.email = email;
        this.name = name;
        this.phone = phone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
