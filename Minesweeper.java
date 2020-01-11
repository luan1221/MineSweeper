class Minesweeper {

    Player player;
    Map map;
    Difficulty difficulty;

    Minesweeper(Player p, Difficulty d) {
        this.player = p;
        this.difficulty = d;
        this.map = new Map(this.difficulty);
    }

    
}