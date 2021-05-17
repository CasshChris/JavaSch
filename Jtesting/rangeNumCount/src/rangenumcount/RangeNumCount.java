package rangenumcount;

public class RangeNumCount {

    public static void main(String[] args) {
        // 1 :: declare variable
        int count = 0;

        for (int i = 0; i < 100; i++) {
        // Create range
            if (count % 3 == 0) {
                count *= 2;
            }
            System.out.println(count);
        }
        
    }
    
}
