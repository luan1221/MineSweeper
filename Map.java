import java.util.Random;


abstract class Map {

    Cell field[][];
    

    Map(int length, int bombs) {
        this.field = new Cell[length][length];
        this.initField();
        this.distributeBombs(bombs);
        boolean test = true;
        this.printScreen(test);
        this.countBombs();
    }

    public void initField() {
        for(int i = 0; i < this.field.length; i++) {
            for(int j = 0; j < this.field.length; j++) {
                this.field[i][j] = new Cell();
            }
        }
    }
    public void distributeBombs(int bombs) {
        Random rand = new Random();
        int x, y;

        for (int i = 0;  i < bombs; i++) {
            x = rand.nextInt(1000);
            y = rand.nextInt(1000);
            x = x % (this.field.length - 1);
            y = y % (this.field.length - 1);
            if (!this.field[x][y].getBomb()) {
                if (x == this.field.length-1) {
                    if (y == this.field.length-1) {
                        this.field[x-1][y-1].setBomb(true);
                    } else {
                        this.field[x-1][y].setBomb(true);
                    }
                } else if (y == this.field.length-1) {
                    this.field[x][y-1].setBomb(true);
                } else {
                    this.field[x+1][y+1].setBomb(true);
                }
               
            } else {
                this.field[x][y].setBomb(false);
            }
            
        }
    }

    public void printScreen(boolean test) {
        if (!test) {
            for(int i = 0; i < this.field.length; i++) {
                for (int j = 0; j < this.field.length; j++) {
                    if (this.field[i][j].getVisible()) {
                        System.out.print(this.field[i][j].getNumNeighBomb() + " ");
                    }    
                }
                System.out.println();
            }
            System.out.println();
        } else {
            for (int i = 0; i < this.field.length; i++) {
                for (int j = 0; j < this.field.length; j++) {
                    System.out.print(this.field[i][j].getNumNeighBomb() + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public void countBombs() {
        for (int i = 0; i < this.field.length; i++) {
            for (int j = 0; j < this.field.length; j++) {
                
            }
        }   
    }

    public void choosePosition(int row, int col) {
        if (this.field[row][col].getBomb()) {
            System.out.println("Game Over. You Lose!");
        } else if (this.field[row][col].getNumNeighBomb() > 0) {
            this.field[row][col].setVisible(true);
            this.printScreen(false);
        } else {

        }
    }

}