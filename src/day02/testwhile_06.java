package day02;

import java.util.Scanner;

public class testwhile_06 {
    public static void main(String[] args) {
        int a=8;
        while (a<88888){
            System.out.println(a);
            a=a*10+8;
        }
        Scanner b = new Scanner(System.in);
        System.out.println("请输入一个数:");
        int as = b.nextInt();
        int i=1;
        while (i<as){
            i++;
            if (i==as){
                System.out.println(i+"是质数");
            }else if (as%i==0){
                System.out.println(i+"是合数");
//                break;
            }
        }
    }

}