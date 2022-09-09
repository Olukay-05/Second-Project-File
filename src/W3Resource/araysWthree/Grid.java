package W3Resource.araysWthree;

public interface Grid {

    public static void main(String[] args) {

        char [][] grid = new char[10][10];

        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid.length; j++) {

                System.out.printf("%2c ", grid[i][j]);
            }

            System.out.println();
        }
    }
}
