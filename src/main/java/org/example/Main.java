package org.example;
import java.util.Scanner;
public class Main {
    public  static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        // fisrt
        System.out.println("ПЕРВОЕ ЧИСЛО");
        int n1=scanner.nextInt();
        System.out.println("Второе ЧИСЛО");
        int n2=scanner.nextInt();
        System.out.println("знак");
        String action=scanner.nextLine();
        action=scanner.nextLine();

        switch (action){
            case"+":
                int resultMake;
                resultMake = MAKE1(n1,n2);

                System.out.println(resultMake);
                break;
            case"-":
                int resultsustract = subtract(n1,n2);
                System.out.println(resultsustract);

                break;
            case"*":
                int resultmultiply = multiply(n1,n2);
                System.out.println(resultmultiply);
                break;
            case"/":
                int resultdivide = divide(n1,n2);
                System.out.println(resultdivide);

                break;

        }
    }
    private int MAKE(int a,int b){
        return a+b;
    }
    public  static int subtract(int a,int b){
        return a-b;
    }
    public static int multiply(int a,int b){
        return a*b;
    }
    public static int divide(int a,int b){
        return a/b;
    }
    public static int MAKE1(int a,int b){
        return a+b;
    }


}

