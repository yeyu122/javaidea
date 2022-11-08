import java.util.*;
class mybox{
    int length=0,width=0;
    void mj(int i,int j){
        length=i;width=j;
        System.out.println("长:"+length+"----宽:"+width+"\t"+"面积=" +length*+width);//+"\t"table
        System.out.println("长:"+length+"----宽:"+width+"\t"+"周长=" +2*(length+width));
    }}

public class mj{
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("请输入宽:");
        int i,j;
        i=cin.nextInt();//输入一个数
        System.out.println("请输入高:");
        j=cin.nextInt();//输入一个数
        mybox a = new mybox();
        a.mj(i,j);

    }
}