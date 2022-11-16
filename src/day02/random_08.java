package day02;

import java.util.Random;
import java.util.Scanner;

public class random_08 {
    public static void main(String[] args) {
        int num =new Random().nextInt(100)+1;
        Scanner a=new Scanner(System.in);
        while (true){
            System.out.println("请输入一个数字:");
            int input = a.nextInt();
            if (input<num){
                System.out.println("小了");
            }else if (input>num){
                System.out.println("大了");
            }else if (input==num){
                System.out.println("你猜对了");
                break;
            }
        }
    }
}
