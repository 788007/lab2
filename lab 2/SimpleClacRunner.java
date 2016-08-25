
/**
 * Write a description of class SimpleClacRunner here.
 * 
 * @Laurel Woods
 * @version (a version number or a date)
 */
public class SimpleClacRunner
{
       public static void main(String[] args) {
           int n1 = 1123;
           int n2 = 567;
           
           SimpleCalc sc = new SimpleCalc(n1, n2);
           SimpleCalc sc2 = new SimpleCalc(5, 7);
           System.out.println("Numbers: " + n1 + ", " + n2);
           System.out.println("The Sum is: " + sc.add());
           System.out.println("The Diff is: " + sc.subtract ());
           System.out.println("The Product is: " + sc.mult());
           System.out.println("The Quotient is: " + sc.div());
           System.out.println("n1 is greater than n2: " + sc.isGreater());
    }
}
