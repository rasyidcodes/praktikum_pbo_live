import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int [] numbers = new int[3];
//
//        numbers[0] =1;
//        numbers[1] =2;
//        numbers[2] = 3;
//
////        int[] numx = {1,2,3};
//
//        int total = numbers[0] + numbers[1] + numbers[2];
//        System.out.println(total);
//
//        for (int i = 0; i < numbers.length; i++){
//            System.out.println(numbers[i]);
//        }

//        char[] chars = {'*','9','3', '1'};
//        String res = "";
//        for (int i = 0; i < chars.length; i++){
//            res = res + chars[i];
//        }
//        System.out.println(res);



//        ARRAY W SCANNER
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("input panjang");
//        int lenlist = sc.nextInt();
//        char [] chars = new char[lenlist];
//        for (int i =0; i < lenlist ; i ++){
//            chars[i] = sc.next().charAt(0);
//        }
//        String res = "";
//        for (int i = 0; i < chars.length; i++){
//            res = res + chars[i];
//        }
//        System.out.println(res);



//          MULTIDIMENSIONAL ARRAY
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("input row size");
//        int lenx = sc.nextInt();
//
//        System.out.println("input column size");
//        int leny = sc.nextInt();
//
//        int [][] numbers = new int[lenx][leny];
//
//        for(int x = 0; x < lenx; x++){
//            for (int y =0; y < leny; y++){
//                System.out.println("input number" + "["+ x +"]" + "["+ y +"] : ");
//                numbers[x][y] = sc.nextInt();
//            }
//        }
//
//        for(int x = 0; x < lenx; x++){
//            for (int y =0; y < leny; y++){
//                System.out.println("Print number" + "["+ x +"]" + "["+ y +"] : " + numbers[x][y]);
//            }
//        }


//        ARRAYLST

//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        System.out.println(cars.size());
//
//        ArrayList<Integer> numarray = new ArrayList<Integer>(Arrays.asList(1,3,4));
//        System.out.println(numarray);


//        FAKTORIAL

//        Scanner sc =  new Scanner(System.in);
//
//        System.out.println("masukan angka faktorial");
//        int numx =  sc.nextInt();
//        int res = 1;
//        for (int i = 1; i <= numx; i ++){
//            res = res * i;
//        }
//        System.out.println(res);
//
//
//        int res2 = 1;
//        int num = numx;
//        while (num > 0){
//            res2 = res2 * (num);
//            num  = num -1;
//        }
//
//        System.out.println(res2);
//
//        int res3 = 1;
//        do{
//            res3 = res3 * (numx);
//            numx  = numx -1;
//        }while(numx > 1);
//
//        System.out.println(res3);

        ArrayList<String> anjing = new ArrayList<String>(Arrays.asList("buddy", "ruby", "coco"));
        ArrayList<String> kucing = new ArrayList<String>(Arrays.asList("sam", "kyki", "shadow"));
        ArrayList<String> ferry = new ArrayList<String>();

//        for (int i = 0; i < anjing.size(); i++){
//            if (anjing.get(i).contains("y")) {
//                ferry.add(anjing.get(i));
//            }
//        }
//
//        for (int i = 0; i < kucing.size(); i++){
//            if (kucing.get(i).contains("y")) {
//                ferry.add(kucing.get(i));
//            }
//        }


        for (String kcg : kucing){
            if (kcg.contains("y")) {
                ferry.add(kcg);
            }
        }

        for (String ajg : anjing){
            if (ajg.contains("y")) {
                ferry.add(ajg);
            }
        }

        System.out.println(ferry);
    }
}
