//package Number_pattern.No_1;

public class trangle {

    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= row; col++) {
              System.out.print(col);                
            }
            System.out.println();
        }
    } 
}

// 1
// 12
// 123
// 1234