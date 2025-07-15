//package Star_Pattern.Star_04;

public class star_decrease {

    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        for(int row =n; row >= 1; row--){
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// * * * * 
// * * * 
// * * 
// * 