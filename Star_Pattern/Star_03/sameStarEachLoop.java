// package Star_Pattern.Star_03;

public class sameStarEachLoop {

    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        for (int row = 1; row  <= n ; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
                
            }
            System.out.println();
        }
    } 
}

// * * * *
// * * * *
// * * * *
// * * * *