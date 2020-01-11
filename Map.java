import java.util.Random;

class Map {

    int field[][];
    Difficulty diff;

    Map(Difficulty difficulty) {
        this.diff = difficulty;
        this.field = new int[this.diff.k][this.diff.k];
        this.initField();
        this.printScreen();
    }

    public void initField() {
        Random rand = new Random();
        int x, y, a, b;

        for (int i = 0;  i < 10; i++) {
            x = rand.nextInt(1000);
            y = rand.nextInt(1000);
            x = x % (this.diff.k - 1);
            y = y % (this.diff.k - 1);
            System.out.println(x + " " + y);
            if (this.field[x][y] == -1) {
                if (x == this.diff.k-1) {
                    if (y == this.diff.k-1) {
                        this.field[x-1][y-1] = -1;
                    } else {
                        this.field[x-1][y] = -1;
                    }
                } else if (y == this.diff.k-1) {
                    this.field[x][y-1] = -1;
                } else {
                    this.field[x+1][y+1] = -1;
                }
               
            } else {
                this.field[x][y] = -1;
            }
            
        }
    }

    public void printScreen() {
        for (int i = 0; i < this.diff.k; i++) {
            for (int j = 0; j < this.diff.k; j++) {
                System.out.print(this.field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}