public class sj {
    public static void main(String ages[]) {
        for(int i=0;i<5;i++){             //循环几次
            for(int j=0;j<i;j++){
                System.out.print(" ");     //循环控制空格数量
            }
            for(int k=0;k<2*(6-i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
//        System.out.println("**********"); //10 //0个空格
//        System.out.println(" ********");//8   //1个空格
//        System.out.println("  ******");//6    //2个空格
//        System.out.println("   ****");//4     //3个空格
//        System.out.println("    **");//2     //4个空格
//        ***********11  12-1 12=3*4-1    11=1
//          *******7           7=2*4-1
//            ***3             3=1*4-1
    }
}
