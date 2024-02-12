//import java.util.*;
//class Day3{
//    public static void main(String [] args){
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        if (age>18){
//            System.out.println("Adult");
//        }
//        else {
//            System.out.println("Not Adult");
//        }
//    }
//}

//import java.util.*;
//class Day3{
//    public static void main(String [] args){
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        if (x % 2 == 0){
//            System.out.println("Even");
//        }
//        else {
//            System.out.println("Odd");
//        }
//    }
//}

//import java.util.*;
//class Day3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int button = sc.nextInt();
//        if (button == 1) {
//            System.out.println("Hello");
//        }else if (button == 2){
//            System.out.println("Namaste");
//        }else if (button == 3){
//            System.out.println("Bonjour");
//        }
//        else{
//            System.out.println("Invalid Button");
//        }
//    }
//}

import java.util.*;
class Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch(button){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid Button");
        }
    }
}