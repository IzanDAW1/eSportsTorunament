public class TeamTournament extends Tournament {

    int playersPerTeam;

    public TeamTournament(String name, String associatedGame, int prize, int playersPerTeam) {
        super(name, associatedGame, prize);
        this.playersPerTeam = playersPerTeam;
    }
    public int getPlayersPerTeam() {
        return playersPerTeam;
    }
    public void setPlayersPerTeam(int playersPerTeam) {
        this.playersPerTeam = playersPerTeam;
    }
    @Override
    public String toString()
    {
        return "Team Tournament - " + name + "(" + associatedGame + ")" + " - Prize: " + prize + " - Players per team: " + playersPerTeam;
    }
}
