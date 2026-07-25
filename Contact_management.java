import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Contact_management {
    public static void  main(String[] args) {
        Scanner sc =new  Scanner(System.in);
        int choice;
        ArrayList<String> contacts=new ArrayList<>();
        System.out.println("Contact management System!");
        do{
            System.out.println("1-Add Contact:");
            System.out.println("2-Search Contact:");
            System.out.println("3-Remove Contact:");
            System.out.println("4-Display Contact:");
            System.out.println("5-Exit:");
            System.out.println("Enter your choice:");
            choice=sc.nextInt();sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter Name:");
                    String name=sc.nextLine();
                    contacts.add(name);
                    System.out.println("Contact has been added!");
                    break;
                case 2:
                    System.out.println("Enter Name to Search:");
                    String search=sc.nextLine();
                    if(contacts.contains(search))
                        System.out.println("Contact Found!");
                    else
                        System.out.println("Contact Not Found!");
                    break;
                case 3:
                    System.out.println("Enter Name to Remove Contact:");
                    String remove=sc.nextLine();
                    if(contacts.remove(remove))
                        System.out.println("Contact has been removed!");
                    else
                        System.out.println("Contact Not Removed!");
                    break;
                case 4:
                    System.out.println("Contact List:");
                    for(String contact:contacts){
                        System.out.println(contact);
                    }
                    break;
                case 5:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Invalid choice!");

            }
        }while(choice!=5);
        sc.close();
    }
}
