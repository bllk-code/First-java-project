import java.util.Scanner;
public class Firstjp{
public static void main (String[] args){
    /*
    ts us my first java project
    it includes variables, print, and scanner stuffs
    very happy with java so far and i wanna continue learning
     */
    String adjective1;
    String adjective2;
    String noun1;
    String noun2;
    String verb1;
    String verb2;

    System.out.println("I went to the ______ + ______ with a friend");
    System.out.println("The first thing we did was ______ in the ______");
    System.out.println("The worker there told us to ______ after we are done just to be safe");
    System.out.println("After we finished, we left a tip and thanked our ______ worker");
    System.out.println("Please enter the words in the order you see each blank\n");
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter adjective 1: ");
    adjective1 = input.nextLine();

    System.out.println("enter noun 1: ");
    noun1 = input.nextLine();

    System.out.println("enter verb 1: ");
    verb1 = input.nextLine();

    System.out.println("enter noun 2: ");
    noun2 = input.nextLine();

    System.out.println("enter verb 2: ");
    verb2 = input.nextLine();

    System.out.println("enter adjective 2: ");
    adjective2 = input.nextLine();

    System.out.println("I went to the " + adjective1 + " " + noun1 + " with a friend");
    System.out.println("The first thing we did was " + verb1 + " in the " + noun2);
    System.out.println("The worker there told us to " + verb2 + " after we are done just to be safe");
    System.out.println("After we finished, we left a tip and thanked our " + adjective2 + " worker");

}
    }
