package day03;

import java.util.Scanner;

public class 年月日 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        Scanner b=new Scanner(System.in);
        Scanner c=new Scanner(System.in);
        System.out.println("请输入年:");
        int year = a.nextInt();
        System.out.println("请输入月:");
        int mouth = b.nextInt();
        System.out.println("请输入日:");
        int day = c.nextInt();
        int sumDays = 0;
        switch(mouth){
            case 12:
                sumDays += 30;//11月的总天数30
            case 11:
                sumDays += 31;//10月的总天数31
            case 10:
                sumDays += 30;//9月的总天数30
            case 9:
                sumDays += 31;//8月的总天数31
            case 8:
                sumDays += 31;//7月的总天数31
            case 7:
                sumDays += 30;//6月的总天数30
            case 6:
                sumDays += 31;//5月的总天数31
            case 5:
                sumDays += 30;//4月的总天数30
            case 4:
                sumDays += 31;//3月的总天数31
            case 3:
                if ((year % 4 ==0 && year % 100 !=0) || year % 400 ==0){
                    sumDays += 29;//闰年2月的总天数29
                }else{
                    sumDays += 28;//非闰年2月的总天数28
                }
            case 2:
                sumDays += 31;//1月的总天数31
            case 1:
                sumDays += day;//当月的天数
        }
        System.out.println(year + "年" + mouth + "月" + day + "日是当年的第" + sumDays + "天");
    }
}