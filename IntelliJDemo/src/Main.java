import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            // write your code here
            //System.out.println("IntelliJ sucks");
            Scanner sc = new Scanner (System.in);
            float gewicht;
            float groesse;
            float bmi;

            System.out.println("Wie viel wiegst du (in kg) ?");
            gewicht= sc.nextFloat();

            System.out.println("Wie groß bist du (in Metern) ?");
            groesse= sc.nextFloat();

            bmi = gewicht / groesse* groesse;

            System.out.println("Dein BMI ist: "+ bmi);

        }
    }

