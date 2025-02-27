public class Team extends Participant implements Comparable<Team>{
    Player[] players;

    public Team(String name) {
        super(name);
        this.players = new Player[5];
    }
    public Team(String name,Player[] players) {
        super(name);
        this.players = players;
    }

    public void AddPlayer(Player pl) throws fullTeamException {
        boolean added = false;
        for (int i = 0; i < players.length; i++)
        {
            if (players[i] == null && !added)
            {
                players[i] = pl;
                added = true;
            }
        }
        if (!added)
        {
            throw new fullTeamException("Reached the max amount of players in a team.");
        }
    }
    public Player[] getPlayers() {
        return players;
    }

    @Override
    public String toString() {

        String playersInfo = "";
        for (int i = 0; i < players.length; i++) {
            playersInfo += players[i].toString() + "\n";
        }

        return "Nombre: "+name+" , Members: " + players.length +"/5 \n"
                + playersInfo;
    }

    public double getAverageRanking()
    {

        double result=0;
        for(int i=0;i<players.length;i++)
        {
            result+=players[i].getRanking();
        }
        return result/players.length;
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
