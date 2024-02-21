import java.util.Scanner;

public class HeartRateApp {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //Fname input

        System.out.println("Enter your FirstName:");

        String firstName = input.nextLine();

        //lastName input

        System.out.println("Enter your lastName:");

        String lastName = input.nextLine();

        //birthDay input

        System.out.println("Enter your birthDay:");
        int birthDay = input.nextInt();

        //birthMonth input

        System.out.println("Enter your birthMonth: ");
        int birthMonth = input.nextInt();

        //birthYear Input

        System.out.println("Enter your BirthYear: ");
        int birthYear = input.nextInt();


        System.out.printf("This is your date of birth: %d/%d/%d", birthDay,birthMonth,birthYear);

        //instantiation
        HeartRates heartRatesApp = new HeartRates(firstName,lastName,birthDay,birthMonth,birthYear);

        System.out.println();

        System.out.printf("this is your age: %n%d", heartRatesApp.calculateAge());

        System.out.println();

        System.out.printf("This is your maximumHeartRate: %n%d", heartRatesApp.calculateHeartRateMax());

        System.out.println();


        System.out.printf("This is your TargetHeartRate: %n%d", heartRatesApp.calculateTargetHr(35, 10));


    }
}
