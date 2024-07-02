import java.util.Scanner;
class converter{
    int option2,amount;
    double target;
    Scanner s=new Scanner(System.in);
   public void display(){
        System.out.println("Choose the option given below of your TargetCurrency");
        System.out.println("1.Rupee");
        System.out.println("2.Dollar");
        System.out.println("3.Pound");
        System.out.println("4.Yuan");
        System.out.println("5.Saudi riyal");
        System.out.println("Choose option  from above list:");
         option2=s.nextInt();
        System.out.println("Enter amount Quantity:"); 
        amount=s.nextInt();   
    }
    public void rupee(int option1){
         switch (option2) {
             case 2->{
                   target=(amount*0.012);
                   System.out.println("Amount in dollars->$."+target);
                 break;
             }
             case 3->{
                target=(amount*0.0095);
                System.out.println("Amount in pounds->£."+target);
              break;
             }
          case 4->{
            target=(amount*0.0087);
            System.out.println("Amount in yuan->¥."+target);
          break;
           }
          case 5->{
           target=(amount*0.0045);
           System.out.println("Amount in saudi riyal->﷼."+target);
           break;
           }
             default->
                System.out.println("Invalid option");
         }
    }
    public void dollar(int option1){
         switch (option2) {
             case 1->{
                   target=(amount*83.56);
                   System.out.println("Amount in rupee->₹."+target);
                 break;
             }
             case 3->{
                target=(amount*0.79);
                System.out.println("Amount in pounds->£."+target);
              break;
             }
          case 4->{
            target=(amount*7.26);
            System.out.println("Amount in yuan->¥."+target);
          break;
           }
          case 5->{
           target=(amount*3.75);
           System.out.println("Amount in saudi riyal->﷼."+target);
           break;
           }
             default->
                System.out.println("Invalid option");
         }
    }
    public void pound(int option1){
         switch (option2) {
             case 1->{
                   target=(amount*105.68);
                   System.out.println("Amount in rupee->₹."+target);
                 break;
             }
             case 2->{
                target=(amount*1.27);
                System.out.println("Amount in dollar->$."+target);
              break;
             }
          case 4->{
            target=(amount*9.19);
            System.out.println("Amount in yuan->¥."+target);
          break;
           }
          case 5->{
           target=(amount*4.75);
           System.out.println("Amount in saudi riyal-> ﷼."+target);
           break;
           }
             default->
                System.out.println("Invalid option");
         }
    }
 public void yuan(int option1){
  switch (option2) {
    case 1->{
          target=(amount*11.51);
          System.out.println("Amount in rupee->₹."+target);
        break;
    }
    case 2->{
       target=(amount*0.14);
       System.out.println("Amount in dollar->$."+target);
     break;
    }
 case 3->{
   target=(amount*0.11);
   System.out.println("Amount in pound->£."+target);
 break;
  }
 case 5->{
  target=(amount*0.52);
  System.out.println("Amount in saudi riyal-> ﷼."+target);
  break;
  }
    default->
       System.out.println("Invalid option");
}
 }
 public void suadiriyal(int option1){
  switch (option2) {
    case 1->{
          target=(amount*22.26);
          System.out.println("Amount in rupee->₹."+target);
        break;
    }
    case 2->{
       target=(amount*0.27);
       System.out.println("Amount in dollar->$."+target);
     break;
    }
 case 3->{
   target=(amount*0.21);
   System.out.println("Amount in pound->£."+target);
 break;
  }
 case 4->{
  target=(amount*1.93);
  System.out.println("Amount in yuan->¥. "+target);
  break;
  }
    default->
       System.out.println("Invalid option");
}
 }
}
public class task4 {
    public static void main(String []args){
        System.out.println("Welcome to CurrencyConverter");
        System.out.println("Choose the option given below of your BaseCurrency");
        System.out.println("1.Rupee");
        System.out.println("2.Dollar");
        System.out.println("3.Pound");
        System.out.println("4.Yuan");
        System.out.println("5.Saudi Riyal");
        int option1;
       try( Scanner sc=new Scanner(System.in)){
        System.out.println("Choose option  from above list:");
        option1=sc.nextInt();
        converter c=new converter();
        switch(option1){
            case 1 -> {
                c.display();
                c.rupee(option1);
                }
        case 2 -> {
            c.display();
            c.dollar(option1);
                }
        case 3 -> {
            c.display();
            c.pound(option1);
                }
        case 4 -> {
            c.display();
            c.yuan(option1);
                }
         case 5 -> {
             c.display();
             c.suadiriyal(option1);
                }
         default -> System.out.println("Invalid Option");
        } 
        System.out.println("Successfully Your Currency is converted");  
    }
}
}