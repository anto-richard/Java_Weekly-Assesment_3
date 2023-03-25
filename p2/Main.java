import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("Enter the number to be calculated : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("I implemented: AdvancedArithmetic\n" + my_calculator.divisor_sum(n));
        s.close();
    }
}