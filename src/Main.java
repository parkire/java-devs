import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        int a = 2;
        int weight = 0;
        float height = 0;
        float bmi = 0;
        Scanner scanner = new Scanner (System.in);
        while (true){
            try{
                System.out.print("Enter your weight(Kgs): ");
                weight = scanner.nextInt();
                System.out.print("Enter your height(Metres): ");
                height = scanner.nextFloat();
                bmi = (float) (weight / Math.pow(height, 2));
                if (bmi <= 17){
                    System.out.println("Your BMI is:" + bmi);
                    System.out.println("You are underweight");
                } else if (bmi >= 25){
                    System.out.println("Your BMI is:" + bmi);
                    System.out.println("You are Overweight");
                    bmi = (float) (weight / Math.pow(height, 2));
                } else if (bmi >= 18 && bmi <= 24){
                    System.out.println("Your BMI is:" + bmi);
                    System.out.println("Your BMI is good");
                } else
                    System.out.println("Thank you for visiting us");
                break;
            }catch (InputMismatchException e){
                System.out.println("Please enter a correct value");
            }
            scanner.nextLine();
        }
    }

}
