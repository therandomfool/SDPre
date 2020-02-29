import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, in, lb, ft, ti;

    System.out.println( "Your height in feet: " );
    ft = keyboard.nextDouble();
    System.out.println( "Your height in inches: " );
    in = keyboard.nextDouble();
    ti = (ft * 12) + in;
    m = ti * 0.0254;

    System.out.println( "Your weight in lb: " );
    lb = keyboard.nextDouble();
    kg = lb * 0.45359237;


    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi );
  }
}
