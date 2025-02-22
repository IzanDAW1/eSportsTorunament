public class Team extends Participant{
    Player[] players = new Player[5];
    int countOfPlayers;

    public Team(String name,Player[] players) {
        super(name);
        this.players=players;
        countOfPlayers=0;
    }

    public void AddPlayer(Player p){
        if(countOfPlayers>5){
            throw new fullTeamException("Reached the max ammount of players in a team. Sorry");
        }
        else{
            players[countOfPlayers]=p;
            countOfPlayers++;
        }
    }
}
