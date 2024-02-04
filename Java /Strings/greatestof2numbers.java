//write a program to input 2 numbers
//find the greastest
import java.util.*;
class greatest{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number 1");
    int num1 = sc.nextInt();
    System.out.println("Enter Number 2");
    int num2 = sc.nextInt();
    if (num1 > num2){
        System.out.println(num1 + "is the greatest number");
    }
    else if (num2 > num1) {
        System.out.println(num2 + "is the greatest number");
    }
    else if(num1 == num2){
        System.out.println("Both numbers are Equal");
    }

}

}