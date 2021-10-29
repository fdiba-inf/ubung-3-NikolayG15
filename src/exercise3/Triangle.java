package exercise3;

import java.util.Scanner;
import java.lang.Math;

public class Triangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        double P;
        double S;

        if(a < 0 || b < 0 || c < 0 || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
          System.out.println("Values are not correct!");

        } else {

          do {
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
            } else if(b == c && b != a){
              System.out.println("Triangle: isosceles ");
              break;
            } else {
              System.out.println("Triangle: scalene ");
              break;
            }
              
          }

           while(a > 0 && b > 0 && c > 0);
        }
        
    }
}

