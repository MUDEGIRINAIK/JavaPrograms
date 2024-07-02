import java.util.Scanner;
interface machine{
void withdraw();
void deposit();
void checkbalence();
}
class service implements machine{
int balence=10000;
int amount;
int check;
Scanner am=new Scanner(System.in);
@Override
public void withdraw(){
System.out.print("Enter amount you want to withdraw from available balence:");
amount=am.nextInt();
if(amount<balence){
balence=balence-amount;
System.out.println("collect your cash ");
System.out.print("Press 1 if you want to display the balence and Press any number to skip:");
check=am.nextInt();
if(check==1)
    System.out.println("Current  balence is:"+balence);
else
    System.out.println("your transcation completed");
}
else{
System.out.println("Insufficient balence");
}
System.out.println("Successfully your transaction completed");
System.out.println("Thanks you..");
}
@Override
public void deposit(){
System.out.println("Enter amount you want to deposit in savings account");
amount=am.nextInt();
System.out.println("Successfully amount deposited ");
balence=balence+amount;
System.out.print("Press 1 if you want to display the balence and Press any number to skip:");
check=am.nextInt();
if(check==1)
    System.out.println("Current  balence is:"+balence);
else
    System.out.println("your transcation completed");
System.out.println("Successfully your transaction completed");
System.out.println("Thanks you..");
}
@Override
public   void checkbalence(){
System.out.println("Available balence is:"+balence);
System.out.println("Successfully your transaction completed");
System.out.println("Thanks you..");
}
}
public class task3 {
public static void main(String[]args) {
int option;
int pin;
System.out.println("Welcome to ATM services");
System.out.println("To continue ATM services enter your pin: ");
try(Scanner sc = new Scanner(System.in)){
pin=sc.nextInt();
String pinAsString=Integer.toString(pin);
int length=pinAsString.length();
if(length==4){
System.out.println("1.WITHDRAW    ");
System.out.println("2.DEPOSIT    ");
System.out.println("3.CHECK BALENCE ");
System.out.println("4.Exit");
System.out.print("Select your option:");
option=sc.nextInt();
service s=new service();
switch (option) {
case 1 -> {
    s.withdraw();
    break;
 }
case 2 -> {
    s.deposit();
    break;
 }
case 3 -> {
    s.checkbalence();
    break;
 }
case 4 ->{
    System.out.println("Your transaction failed");  
}
default -> {
    System.out.println("Your transaction failed");
    System.out.println("Enter valid option to continue any transaction..");
    break;
 }
 }    
 }
 else{
    System.out.println("Enter correct 4 digit pin");
    }
  }
 }
}
