public class Team extends Participant{
    Player[] players;
    int countOfPlayers;

    public Team(String name) {
        super(name);
        this.players = new Player[5];
        countOfPlayers=0;
    }

    public void AddPlayer(Player p) throws fullTeamException{
        if(countOfPlayers>=players.length){
            throw new fullTeamException("Reached the max amount of players in a team.");
        }
        else{
            players[countOfPlayers]=p;
            countOfPlayers++;
        }
    }
}
