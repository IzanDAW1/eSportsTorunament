public abstract class Tournament {
    String name;
    String associatedGame;
    int prize;

    public Tournament(String name, String associatedGame, int prize){
        this.name = name;
        this.associatedGame = associatedGame;
        this.prize = prize;
    }

    public void SetName(String name){
        this.name = name;
    }
    public String GetName(){
        return name;
    }
    public void SetAssociatedGame(String associatedGame){
        this.associatedGame = associatedGame;
    }
    public String GetAssociatedGame(){
        return associatedGame;
    }
}
