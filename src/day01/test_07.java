package day01;

public class test_07 {
    public static void main(String[] args) {
        int i=0;
        int j=i++ + ++i;j=0+2;i=2;
        int k= --i + i--;
        System.out.println(j);
        System.out.println(k);
    }
}
