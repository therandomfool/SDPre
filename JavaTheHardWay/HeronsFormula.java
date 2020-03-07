public class HeronsFormula {
  public static void main(String[] args) {
    double a, g;
    String tws = "a triangle with sides ";

    a = triangleArea(3,3,3);
    System.out.println("A triangle with sides 3,3,3 has area " + a );

    a = triangleArea(3,4,5);
    System.out.println("A triangle with sides 3,4,5 has area " + a);
    g = triangleArea(7,8,9);
    System.out.println(tws + "7,8,9 has area " + g);

    System.out.println(tws + "5,12,13 has area " + triangleArea(5,12,13) );
    System.out.println(tws + "10,9,11 has area " + triangleArea(10,9,11) );
    System.out.println(tws + "8,15,17 has area " + triangleArea(8,15,17) );
    System.out.println(tws + "9,9,9 has area " + triangleArea(9,9,9) );

  }
    // This function coputes area of triangle with sides a,b,c
  public static double triangleArea(int a, int b, int c) {
    double s, A;

    s= (a+b+c) / 2.0;
    A = Math.sqrt( s*(s-a)*(s-b)*(s-c) );

    return A;
  }
    // Study Drills
   // Q#1 the code without the function is longer
   // Q#2 changing 2 to 2.0 in a function requires one fix instead of multiple fixes on multiple lines
   // Q#3 similare to Q#2 changing one function interchangable DRY code rather than changing multiple lines of code to achieve same results without a function
   

}
