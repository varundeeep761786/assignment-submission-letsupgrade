package line1;
import java.util.Scanner;
public class Student{
   int mar;
   String name;
   float roll;
   public Student(String name, int mar, float roll){
      this.name = name;
      this.mar = mar;
      this.roll = roll;
   }
   public void display() {
      System.out.println("Name of the student is: "+name);
      System.out.println("marks of the student is: "+mar);
      System.out.println("roll no of the student is: "+roll);
   }
   public static void main (String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your name: ");
      String name = sc.next();
      System.out.println("Enter your marks: ");
      int mar = sc.nextInt();
      System.out.println("Enter your roll: ");
      float roll = sc.nextFloat();
      Student obj = new Student(name, mar, roll);
      obj.display();
   }
}
