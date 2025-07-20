public class ternary{
    public static void main(String[] args){
        int a=30,b=20,c=30;
        int numRes=(a<b)?((a<c)?a:c):(b<c)?b:c;
        System.out.println(numRes);
    }
}