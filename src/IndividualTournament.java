public class IndividualTournament extends Tournament{


    public IndividualTournament(String name, String associatedGame, int prize) {
        super(name, associatedGame, prize);
    }
    @Override
    public String toString()
    {
        return "Individual Tournament - " + name + "(" + associatedGame + ")" + " - Prize: " + prize;
    }
}
