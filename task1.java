import java.util.Random;
import java.util.Scanner;
public class task1 {
public static void main(String[] args) {
boolean playagain = true;
int number;
System.out.println("Welcome to NUMBERGAME..");
System.out.println("Let's play the game");
System.out.println("You have to guess the number which is between 1 to 100 in 10 chances");
System.out.println("We also provide you hints based on your guesses");
try (Scanner sc = new Scanner(System.in)) {
Random random = new Random();
while (playagain) {
int targetNumber = random.nextInt(100) + 1;
System.out.println("Enter your guessed number:");
for (int i = 1; i <= 10; i++) {
number = sc.nextInt();
if (number == targetNumber) {
System.out.println("You guessed the number correctly on attempt " + i);
break;
} 
else if (i == 10) 
 System.out.println("You used all your attempts. You lose the game. The correct number was " + targetNumber);
else if (number > targetNumber)
System.out.println("Your guess is too high... try again");
else 
System.out.println("Your guess is too low... try again");
}
System.out.println("If you want to play the game again type yes/no:");
sc.nextLine();  
String response = sc.nextLine().trim().toLowerCase();
if (!response.equals("yes")) {
playagain = false;
System.out.println("Thanks for your participation!");
}
}
}
}
}