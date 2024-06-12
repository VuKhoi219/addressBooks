package AddressBooks;

import java.util.Scanner;

public class AddressBooks {
    public static void main(String[] args) {
        Contact contact = new Contact();
        boolean flag = true;
        while (flag) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Add new contact");
            System.out.println("2. Find a contact by name");
            System.out.println("3. Display contacts");
            System.out.println("4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    contact.addAddressBook();
                    break;
                case 2:
                    contact.displayTelephoneNumberByName();
                    break;
                case 3:
                    contact.displayContact();
                    break;
                case 4:
                    flag = false;
                    System.out.println("Exit");
                    break;
            }
        }
    }
}
