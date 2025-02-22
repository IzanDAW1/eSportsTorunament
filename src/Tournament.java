public abstract class Tournament {
    protected String name;
    protected String associatedGame;
    protected int prize;

    public Tournament(String name, String associatedGame, int prize){
        this.name = name;
        this.associatedGame = associatedGame;
        this.prize = prize;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAssociatedGame(String associatedGame){
        this.associatedGame = associatedGame;
    }
    public String getAssociatedGame(){
        return associatedGame;
    }
    public void setPrize(int prize){
        this.prize = prize;
    }
    public int getPrize(){
        return prize;
    }
    @Override
    public String toString(){
        return name + "(" + associatedGame + ")";
    }
}
