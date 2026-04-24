package varible;


import java.util.Scanner;

public class VaribleDemo2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seconds;//需要输入的秒数
        System.out.println("请输入秒数(0~100 000 000)");
        seconds = sc.nextInt();
        int hour,min,sec;
        hour = seconds/3600;
        min = seconds % 3600 /60;
        sec = seconds - hour*3600 - min*60;
        System.out.println(hour + ":" + min + ":" +sec);
        sc.close();
    }
}
