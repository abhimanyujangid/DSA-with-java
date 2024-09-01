package oops;

public class interfaces {
    public static void main(String[] args) {
        Queen q  = new Queen();
        q.moves();
    }
}

interface CheesPlayer {
    void moves();
}
class Queen implements CheesPlayer{
    public void moves(){
        System.out.println("up,down,left,right,dignoal(in all )");
    }
}
class Rook implements CheesPlayer {
    public void moves(){
        System.out.println("up,down,left,right");
    }
}

class King implements CheesPlayer {
    public void moves(){
        System.out.println("up,down,left,right,dignoal by one stap");
    }
}

