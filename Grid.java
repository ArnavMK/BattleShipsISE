
public class Grid {

    private GridUnit[][] gridCoordinates = new GridUnit[10][10];

    public Grid() {
        
        initialize();

    }
    
    private void initialize() {
         
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {

                 
                gridCoordinates[row][col] = new GridUnit(row, col);
            }
        }


    } 
    
    public GridUnit[][] getGrid() {
        return gridCoordinates; 
    }
}

class GridUnit {

    private int x;
    private int y;
    private boolean isUnderShip;
    private Ship ship;
    
    public GridUnit(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getCoordinates() {
        int[] test = {x, y};
        return test;
    }    
}
