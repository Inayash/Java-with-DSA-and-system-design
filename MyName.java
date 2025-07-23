/* 
*********** *         *      *      *         *      *      *********** *         *
     *      **        *     * *      *       *      * *     *           *         *
     *      * *       *    *   *      *     *      *   *    *           *         *
     *      *  *      *   *     *      *   *      *     *   *           *         *
     *      *   *     *  *       *      * *      *       *  *           *         *
     *      *    *    * ***********      *      *********** *********** ***********
     *      *     *   * *         *      *      *         *           * *         *
     *      *      *  * *         *      *      *         *           * *         *
     *      *       * * *         *      *      *         *           * *         *
     *      *        ** *         *      *      *         *           * *         *
*********** *         * *         *      *      *         * *********** *         *
 */

public class MyName {
public static void main(String[] args){
    int n=11;
    for(int i=0;i<n;i++){
        //I
        for(int j=0;j<n;j++){
            if(i==0 && j<=(n-1)||j==(n-1)/2 ||i==(n-1)&& j<=(n-1)){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.print(" ");
        //N
        for(int j=0;j<n;j++){
            if(j==0 && i<=(n-1)||i==j||j==(n-1)&& i<=(n-1)){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.print(" ");
        //A
        for(int j=0;j<n;j++){
            if(i+j==(n-1)/2||j-i==(n-1)/2 ||i==5 && j<=(n-1) || j==0 && i>=(n-1)/2 || j==(n-1) && i>=(n-1)/2){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.print(" ");
        //Y
        for(int j=0;j<n;j++){
            if(i==j && i<=(n-1)/2 || i+j==(n-1) && i<=(n-1)/2 || j==(n-1)/2 && i>=(n-1)/2  ){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.print(" ");
        //A
        for(int j=0;j<n;j++){
            if(i+j==(n-1)/2||j-i==(n-1)/2 ||i==5 && j<=(n-1) || j==0 && i>=(n-1)/2 || j==(n-1) && i>=(n-1)/2){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.print(" ");
        //S
        for(int j=0;j<n;j++){
            if(i==0 && j<(n) || j==0 && i<=(n-1)/2 ||i==(n-1)/2 && j<n || j==(n-1) && i>=(n-1)/2 || i==(n-1) && j<n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.print(" ");
        //H
        for(int j=0;j<n;j++){
            if(j==0 || j==n-1 ||i==(n-1)/2){
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
