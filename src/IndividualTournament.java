public class IndividualTournament extends Tournament{


    @Override
    public String toString()
    {
        return "Individual Tournament - " + name + "(" + associatedGame + ")" + " - Prize: " + prize;
    }
}
