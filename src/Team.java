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
        int count = 0;
        for(Player p:players)
        {
            if(p!=null)
            {
                count++;
            }
        }
        Player[] playersNotNull = new Player[count];
        for(int i = 0; i<players.length;i++)
        {
            if(players[i]!=null)
            {
                playersNotNull[i] = players[i];
            }
        }
        String playersInfo = "";
        for (int i = 0; i < playersNotNull.length; i++) {
            playersInfo += playersNotNull[i].toString() + "\n";
        }

        return "Nombre: "+name+" , Members: " + playersNotNull.length +"/5 \n"
                + playersInfo;
    }

    public double getAverageRanking()
    {
        int count = 0;
        for(Player p:players)
        {
            if(p!=null)
            {
                count++;
            }
        }
        Player[] playersNotNull = new Player[count];
        for(int i = 0; i<players.length;i++)
        {
            if(players[i]!=null)
            {
                playersNotNull[i] = players[i];
            }
        }
        double result=0;
        for(int i=0;i<playersNotNull.length;i++)
        {
            result+=playersNotNull[i].getRanking();
        }
        return result/playersNotNull.length;
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
