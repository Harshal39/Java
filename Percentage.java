
import java.util.Scanner;

public class Percentage {
    public static void main(String[] args)
{
    float total=0;
    System.out.println("Welcome to CBSE PERCENTAGE Maker");
    Scanner input=new Scanner(System.in);
    System.out.print("Enter total marks of the Subject: ");
    int total_marks=input.nextInt();
    System.out.print("Enter marks of Subject 1: ");
   float s1=input.nextFloat();
   total=total+s1;
   System.out.print("Enter marks of Subject2: ");
   float s2=input.nextFloat();
   total=total+s2;
   System.out.print("Enter marks of Subject3: ");
   float s3=input.nextFloat();
   total=total+s3;
   System.out.print("Enter marks of Subject4: ");
   float s4=input.nextFloat();
   total=total+s4;
   System.out.print("Enter marks of Subject5: ");
   float s5=input.nextFloat();
   total=total+s5;
   
   float percentage = (total / 500) * 100;
    System.out.println("Percentage: " + percentage + "%");
   System.out.println("Made by Harshal");

                        }
}
