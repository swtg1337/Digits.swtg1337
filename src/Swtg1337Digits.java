import java.util.Scanner;
public class Swtg1337Digits{

    public static void main(String args[]){
       Scanner reader = new Scanner(System.in);
       System.out.println("Введите число х:");
       double x =reader.nextDouble();
       System.out.println("Введите число y:");
       double y =reader.nextDouble();
       if (x==y) {System.out.println("Числа равны");}
       else {System.out.println("Числа не равны.");};
       System.out.println("#swtg1337");
   }
}