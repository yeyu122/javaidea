package day01;
import java.util.*;

public class testrun_05 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("请输入年份:");
        int yead = a.nextInt();
        if ((yead%4==0&&yead%100!=0)||(yead%400==0)){
            System.out.println(yead+"是闰年");
        }else {
            System.out.println(yead+"不是闰年");
        }


    }
}
