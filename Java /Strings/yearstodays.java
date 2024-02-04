import java.util.*;


class yearstodays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of days");
        int days = sc.nextInt();
        int years = days / 365;
        int remdays = days % 365;
        int months = remdays / 30;
        int actualdays = remdays % 30;
        System.out.println(years + months + actualdays);


    }
}