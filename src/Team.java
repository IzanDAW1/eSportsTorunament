public class Team extends Participant implements Comparable<Team>{
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

    public double getAverageRanking()
    {
        double result=0;
        for(int i=0;i<countOfPlayers;i++)
        {
            result+=players[i].getRanking();
        }
        return result/countOfPlayers;
    }

    @Override
    public int compareTo(Team t2) {
        int result;
        if(this.getAverageRanking()>t2.getAverageRanking())
        {
            result = -1;
        }
        else if(this.getAverageRanking()<t2.getAverageRanking())
        {
            result = 1;
        }
        else{
            result = 0;
        }

        return result;
    }
}
