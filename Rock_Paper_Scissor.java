import java.util.Scanner;

public class Rock_Paper_Scissor {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String userChoice;
    String computerChoice;
    int randomNumber;
    
    System.out.println("Rock, paper, or scissors?");
    userChoice = scanner.nextLine();
    
    randomNumber = (int) (Math.random() * 3 + 1);
    
    if (randomNumber == 1) {
      computerChoice = "rock";
    } else if (randomNumber == 2) {
      computerChoice = "paper";
    } else {
      computerChoice = "scissors";
    }
    
    System.out.println("The computer choose " + computerChoice + ".");
    
    if (userChoice.equals(computerChoice)) {
      System.out.println("It's a tie!");
    } else if (userChoice.equals("rock")) {
      if (computerChoice.equals("scissors")) {
        System.out.println("You win!");
      } else {
        System.out.println("The computer wins.");
      }
    } else if (userChoice.equals("paper")) {
      if (computerChoice.equals("rock")) {
        System.out.println("You win!");
      } else {
        System.out.println("The computer wins.");
      }
    } else if (userChoice.equals("scissors")) {
      if (computerChoice.equals("paper")) {
        System.out.println("You win!");
      } else {
        System.out.println("The computer wins.");
      }
    } else {
      System.out.println("Invalid input.");
    }
  }
}

