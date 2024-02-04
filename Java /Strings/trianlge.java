//write a program to input 3 sides of a trianle
//check equaliterial, isosceles, scalene
import java.util.*;
class triangles{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Side 1");
int s1 = sc.nextInt();
System.out.println("Enter Side 2");
int s2 = sc.nextInt();
System.out.println("Enter Side 3");
int s3 = sc.nextInt();
if (s1 == s2 && s2 == s3 ){
    System.out.println("equaliterial Triangle");
}
else if(s1 == s2 || s2 == s3 || s3 == s1){
    System.out.println("Isosceles Triangle");
}
else if(s1!=s2 && s2!=s3 && s3!=s1){
    System.out.println("Scalene Trianlge");
}

}
}


