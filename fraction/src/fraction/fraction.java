package fraction;

import java.util.*;

public class fraction {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("type upper number in fraction");
        double number1 = scan.nextDouble();
        System.out.println("type under number in fraction");
        double number2 = scan.nextDouble();
        double x=0;
        double y=number1;
        while(x<=number1){
            if (number1==number2){
                System.out.println("lowest form is 1");
                System.out.println("starndart form is 1");
                break;
            }
            if (number1%y==0 && number2%y==0){
                number1=number1/y;
                number2=number2/y;
            }
            --y;
            ++x;
        }
        System.out.println("lowest form is "+number1+" over "+number2);
        double standartform= number1/number2;
        System.out.println("standart form is "+standartform);
    }
}
