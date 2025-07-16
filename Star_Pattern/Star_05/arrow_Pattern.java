// package Star_Pattern.Star_05;

public class arrow_Pattern {

  public static void main(String[] args) {
    pattern(5);
  }  
  static void pattern(int n){
     for (int row = 0; row <= n; row++) {
        for (int col = 0; col <= row; col++) {
            System.out.print("* ");
        }
         System.out.println();
     }
        for(int row =n; row >= 1; row--){
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
     }
  }


// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
// * * * * * * 
// * * * * * 
// * * * * 
// * * * 
// * * 
// *
