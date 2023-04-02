package Arrays;

public class Arrays3 {
    public void loop3() {
        int[][] myNumber = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}};
        for (int i = 0; i < myNumber.length; i++) {
            for (int j = 0; j < myNumber[i].length; j++) {
                System.out.printf("%3d", myNumber[i] [j]);
            }
        }
    }
}