import java.util.Scanner;
public class userinput {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.println("enter the age");
        int age=scan.nextInt();
        scan.nextLine(); //consume the leftover newline 
        System.out.println("enter the name");
        String name=scan.nextLine();

        System.out.println("name is "+name);
        System.out.println("age is "+age);
    
    }
    
}
