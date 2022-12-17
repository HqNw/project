public class TwoDimensionalArrayExample {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2}, {3, 4}, {5, 6}};
        for (int[] row : numbers) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
