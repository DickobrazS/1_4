import java.util.Scanner;

public class Main {
    public static int fact(int a){
        int b = 1;
       for (int i=1;i<a;i++){
           b=b*(i+1);
       }
        System.out.println("Факториал этого числа:");
        System.out.println(b);
        return b;
    }

    public static void main(String[] args) {
        System.out.println("Введите число:");
    Scanner in = new Scanner(System.in);
    int a=in.nextInt();
        fact(a);

    }
    }

