package day03;

public class 数组_01 {
    public static void main(String[] args) {
        String[] names=new String[5];
        names[0]="撒旦法";
        names[1]="梵蒂冈";
        names[2]="阿道夫";
        for (int i=0;i<names.length;i++){
            System.out.println(names[i]);
            if (names[i]==null){
                System.out.println(names[i]);
            }
        }

//        String[] names=new String[]{"万桑","阿斯蒂芬"};
//        String[] names={"万桑","阿斯蒂芬"};
    }
}
