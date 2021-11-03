package exercise3;

import java.util.Scanner;
import java.lang.Math;

public class Triangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a;
        double b;
        double c;
        double P;
        double S;

      
          do {
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();

            if(a < 0 || b < 0 || c < 0 || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
          System.out.println("Values are not correct!");

        } else {


            P = (a + b + c) / 2;
            S = Math.sqrt(P * (P - a) * (P - b) * (P - c));
            System.out.println("Area: " + S);

            if(a == b && a == c){
              System.out.println("Triangle: equilateral");
              break;
            } else if(a == b && a != c){
              System.out.println("Triangle: isosceles ");
              break;
            } else if(a == c && a != b){
              System.out.println("Triangle: isosceles ");
              break;
            } else if(c == b && c != a){
              System.out.println("Triangle: isosceles ");
              break;
            } else {
              System.out.println("Triangle: scalene ");
              break;
            }
              
          }
          


    }while(a > 0 && b > 0 && c > 0);
          
    
    }
}

