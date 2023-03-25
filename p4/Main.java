import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        try
        {
            System.out.print("Enter the first integer : ");
            int x = s.nextInt();
            System.out.print("Enter the second integer : ");
            int y = s.nextInt();
            int res = x / y;
            System.out.println(res);
        }
        catch (InputMismatchException a)
        {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException a)
        {
            System.out.println("java.lang.ArithmeticException: " + a.getMessage());
        }
        s.close();
    }
}
