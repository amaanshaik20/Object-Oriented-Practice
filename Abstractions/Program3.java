package Abstractions;

abstract class Games {
    abstract void typeOfGame();

    abstract void numberOfMembers();

}

abstract class IndoorGames extends Games {
    @Override
    void typeOfGame() {
        System.out.println("These are indoor games");
    }
}

abstract class OutdoorGames extends Games {
    @Override
    void typeOfGame() {
        System.out.println("These are outdoor games.");
    }

}

class Chess extends IndoorGames {
    @Override
    void numberOfMembers() {
        System.out.println("This is individual game.");
    }
}

class Carrom extends IndoorGames {
    @Override
    void numberOfMembers() {
        System.out.println("This is Group Game");
    }
}

class Cricket extends OutdoorGames {
    @Override
    void numberOfMembers() {
        System.out.println("This is a team sport.");
    }
}

class Racing extends OutdoorGames {
    @Override
    void numberOfMembers() {
        System.out.println("This is individual sport.");
    }
}

class GamesPermit {
    static void permit(Games g) {
        g.numberOfMembers();
        g.typeOfGame();
    }
}

public class Program3 {
    public static void main(String[] args) {
        Racing r = new Racing();
        Cricket c = new Cricket();
        Carrom ca = new Carrom();
        Chess ch = new Chess();

        GamesPermit.permit(r);
        GamesPermit.permit(c);
        GamesPermit.permit(ca);
        GamesPermit.permit(ch);

    }
}
