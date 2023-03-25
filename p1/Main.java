import java.util.*;
public class Main {

    public static void main(String []args){
        //creating an instance of MyBook
        MyBook new_novel = new MyBook();
        System.out.print("Enter the title of the book: " );
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();

        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());
    }
}