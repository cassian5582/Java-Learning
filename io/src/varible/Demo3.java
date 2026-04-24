package varible;

import java.util.Scanner;

public class Demo3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day =sc.nextInt();
        String dayName = switch (day)
        {
            case 1 ->"星期一";
            case 2 ->"星期二";
            case 3 ->"星期三";
            default ->"";
        };
        System.out.println(dayName);
        sc.close();
    }
}
