/**
 * Grid
 */
public class Grid {

    private GridUnit[][] gridCoordinates = new GridUnit[10][10];

    public Grid() {

        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                gridCoordinates[row][col] = new GridUnit(row, col);
            }
        }
    }
}

class GridUnit {

    private int x;
    private int y;
    private boolean isUnderShip;
    
    public GridUnit(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
}
