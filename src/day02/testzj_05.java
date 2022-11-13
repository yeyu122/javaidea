package day02;

import java.util.Scanner;

public class testzj_05 {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            for (int j=0;j<=i;j++){
                System.out.print("\t*");
            }
            System.out.println();
        }
        /////////////////////九九乘法表
        Scanner a =new Scanner(System.in);
        System.out.println("请输入一个数:");
        int as = a.nextInt();
        for (int i=1;i<as+1;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+"X"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
