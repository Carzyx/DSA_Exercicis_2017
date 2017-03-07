package View;

import Controller.Service;
import Model.Eetakemon;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Miguel Angel Archilla on 21/02/2017.
 */
public class UserInterface {
    private static Service service = new Service();
    private static Eetakemon eetakemon = new Eetakemon();

    public static void main(String [ ] args){

        System.out.println("Hello, this is a User Interface to create, delete, find and print our Eetakemons");
        System.out.println("Select a number option");
        boolean avaliable = true;
        while(avaliable) {
            printMenuOptions();

            try {
                Scanner sc = new Scanner(System.in);
                int option = sc.nextInt();

                switch (option) {

                    default:
                        System.out.println("Input a valid option!");
                        break;

                    case 0:
                        System.out.println("Bye!");
                        avaliable = false;
                        break;

                    case 1:
                        System.out.println("Name: ");
                        eetakemon = new Eetakemon(sc.next());

                        service.addElement(eetakemon);
                        break;

                    case 2:
                        System.out.println("Id: ");

                        boolean result = service.deleteElementById(sc.nextInt());
                        if (!result)
                            System.out.println("Eetakemon not found...");
                        else
                            System.out.println("Deleted");

                        break;

                    case 3:
                        System.out.println("Id: ");
                        eetakemon = service.findElementById(sc.nextInt());
                        printEetakemon(eetakemon);
                        break;

                    case 4:
                        List<Eetakemon> listEetakemon = service.getAllElements();
                        if (listEetakemon.size() != 0) {
                            System.out.println("Eetakemon Registered:");
                            for (Eetakemon item : listEetakemon) {
                                    printEetakemon(item);
                            }
                        } else
                            System.out.println("Not Eetakemon registered...");

                        break;
                }
            }
            catch (java.util.InputMismatchException err)
            {
                System.out.println("Input a valid option!");
            }

        }
    }

    private static void printMenuOptions()
    {
        System.out.println("----------------------------------------------");
        System.out.println("1. Create a new Eetakemon");
        System.out.println("2. Remove a Eetakemon by Id");
        System.out.println("3. Find a Eetakemon by Id");
        System.out.println("4. Print all Eetakemons");
        System.out.println("0. Exit");
        System.out.println("----------------------------------------------");
        System.out.println("Select option: ");
    }



    private static void printEetakemon(Eetakemon e) {
        if(e != null)
        System.out.println("Id: "+e.id+" Name: "+e.name+" Level: "+e.level);
        else
            System.out.println("Eetakemon not found...");
    }
}
