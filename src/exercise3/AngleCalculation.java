package exercise3;

import java.util.Scanner;
import java.lang.Math;

public class AngleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int winkel = input.nextInt();
        char ch = input.next().charAt(0);
        double Radiant;
        double Grad;
        double Pi = Math.PI;

        do {
          if(ch == 'r'){
              Radiant = (winkel*Pi ) / 180;
              System.out.println("Angle: " + Radiant + ch);
          } else {
              Grad = (winkel * 180) / Pi;
              System.out.println("Angle: " + Grad + ch);
          }

          ch = input.next().charAt(0);

        } while((ch == 'r') || (ch == 'd'));

        



    }

}
