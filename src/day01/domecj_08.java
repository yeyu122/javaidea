package day01;

import java.util.Scanner;

public class dome_08 {
    public static void main(String[] args) {
       Scanner a= new Scanner(System.in);
       System.out.println("请输入您的成绩:");
       int cj = a.nextInt();
       if (cj>=90&&cj<100){
           System.out.println("优秀");
       }else if (cj>=80&&cj<90){
           System.out.println("良好");
       }
       else if (cj>=70&&cj<80){
           System.out.println("中等");
       }
       else if (cj>=60&&cj<80){
           System.out.println("及格");
       }else {
           System.out.println("不及格");
       }
    }
}
