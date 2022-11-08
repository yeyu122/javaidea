import java.util.Random;

public class fs {
    public static void main(String ages[]){
        int[] arr = new int[100];
        int a=0,b=0,c=0,d=0,e=0;
        Random rand= new Random();
        for (int i = 0; i<100;i++){
            for (int j = 0 ; j<100; j++){
                int n = rand.nextInt(100);
                arr[j]= n;
            }
            if(arr[i] >= 90 && arr[i] <= 100){
                a++;
            }else if(arr[i] >= 80 && arr[i] <= 89){
                b++;
            }
            else if(arr[i] >= 70 && arr[i] <= 79){
                c++;
            }
            else if(arr[i] >= 60 && arr[i] <= 69){
                d++;
            }else {
                e++;
            }
            int is = i+1;
            System.out.println("第"+is+"位同学的成绩"+arr[i]);
        }
        System.out.println("/////////////////////////////////////////////////////");
        System.out.println("成绩大于90的同学人数:"+a);
        System.out.println("成绩大于80小于90的同学人数:"+b);
        System.out.println("成绩大于70小于80的同学人数:"+c);
        System.out.println("成绩大于60小于70的同学人数:"+d);
        System.out.println("成绩小于60的同学人数:"+e);
    }
}
