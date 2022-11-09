package day2;

import java.util.Scanner;

public class switch_01 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("请输入一个7以内的数:");
        int b = a.nextInt();
        switch (b){
            case 1:
                System.out.println("星期一");break;
            case 2:
                System.out.println("星期二");break;
            case 3:
                System.out.println("星期三");break;
            case 4:
                System.out.println("星期四");break;
            case 5:
                System.out.println("星期五");break;
            case 6:
                System.out.println("星期六");break;
            case 7:
                System.out.println("星期天");break;
            default: System.out.println("错误");break;
        }
    }
}
