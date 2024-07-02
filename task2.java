import java.util.Scanner;
public class task2 {
public static void main(String []args){
int i,sum=0;
int subjects;
int marks;
float avg;  
try(Scanner mark =new Scanner(System.in)){
System.out.print("Enter number of subjects:");
subjects=mark.nextInt();
System.out.println("Enter marks of student in each subject out of 100");
for(i=1;i<=subjects;i++){
System.out.print("Enter marks in subject"+i+":  ");
marks=mark.nextInt();
sum=sum+marks;
}
System.out.println("Results obatained by student:");
System.out.println("Total marks scored by student in all subjects:  "+sum);
avg=sum/subjects;
System.out.println("Average Percentage obtained by student:  "+avg);
System.out.print("Awarded grade of student:");
if(avg>=90)
  System.out.print("A+ Grade");
else if(avg>=80)
  System.out.print("A Grade");
else if(avg>=70)
  System.out.print("B Grade");
else if(avg>=60)
  System.out.print("C Grade");
else if(avg>50)
  System.out.print("D Grade");
else
  System.out.print("Fail");
}  
}
}

