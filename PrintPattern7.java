/* print the pattern
***********
***** *****
****   ****
***     ***
**       **
*         *
**       **
***     ***
****   ****
***** *****
***********
 */

public class PrintPattern7 {
    public static void main(String[] args){
        int n=19;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j<=(n-1)/2 || j==0 && i<=(n-1)/2|| i+j<=(n-1)/2 || i==0 && j>=(n-1)/2 || j==n-1 && i<=(n-1)/2 || j-i>=(n-1)/2
                ||j==0 && i>(n-1)/2|| i==(n-1) && j<=(n-1)/2 || i-j>=(n-1)/2 || i==n-1 && j>=(n-1)/2 || j==n-1 && i>=(n-1)/2||i+j>=n-1+(n-1)/2  ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
