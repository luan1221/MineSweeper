class Cell {
    private boolean flag;
    private boolean bomb;
    private int numNeighBomb;
    private boolean visible;

    Cell() {
        this.flag = false;
        this.bomb = false;
        this.numNeighBomb = 0;
        this.visible = false;
    }

    boolean getFlag() {
        return this.flag;
    }

    boolean getBomb() {
        return this.bomb;
    }

    int getNumNeighBomb() {
        return this.numNeighBomb;
    }

    boolean getVisible() {
        return this.visible;
    }

    void setFlag(boolean f) {
        this.flag = f;
    }

    void setBomb(boolean b) {
        this.bomb = b;
    }

    void setNumNeighBomb(int n) {
        this.numNeighBomb = n;
    }

    void setVisible(boolean v) {
        this.flag = v;
    }
}