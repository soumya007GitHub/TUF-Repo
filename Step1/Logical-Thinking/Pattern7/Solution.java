/* SAMPLE PATTERN
    *    
   ***   
  *****  
 ******* 
*********
  */


public class Main
{
    static void star(int n){
        for(int i = 0; i<n; ++i){
            for(int j = 0; j<(n-i-1); ++j){
                System.out.print(" ");
            }
            for(int k = 0; k<(2*i+1); ++k){
                System.out.print("*");
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
		star(5);
	}
}
