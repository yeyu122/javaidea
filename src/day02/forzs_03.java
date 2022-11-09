package day02;

import java.util.Scanner;

public class forzs_03 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("请输入一个数");
        int as = a.nextInt();
        for (int i =2;i<as;i++){
            if(as%i==0){
                System.out.println(i+"是质数");
            }else{
//                System.out.println(i+"不是质数");
            }
        }
    }
}
