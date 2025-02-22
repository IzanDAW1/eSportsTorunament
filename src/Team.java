public class Team extends Participant{
    Player[] players;
    int countOfPlayers;

    public Team(String name) {
        super(name);
        this.players = new Player[5];
        countOfPlayers=0;
    }

    public void AddPlayer(Player pl) throws fullTeamException{
        if(countOfPlayers>=players.length){
            throw new fullTeamException("Reached the max amount of players in a team.");
        }
        else{
            players[countOfPlayers] = pl;
            countOfPlayers++;
        }
    }
    public Player[] getPlayers() {
        return players;
    }

    @Override
    public String toString() {
        String playersInfo = "";
        for (int i = 0; i < countOfPlayers; i++) {
            playersInfo = players[i].toString();
            System.out.println(playersInfo);
        }

        return "Nombre: "+name+" , Members: "+countOfPlayers +"/5"
                + playersInfo;
    }
}
