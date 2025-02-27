import java.awt.event.ItemEvent;
import java.util.Arrays;
import java.util.Random;

public class TournamentManager {
    Player[] players;
    Team[] teams;
    Tournament[] tournaments;
    Match[] matches;

    public TournamentManager()
    {
    }

    public void Initialized()
    {
        players = rellenarPlayers();
        teams = rellenarTeams();
        tournaments = rellenarTournaments();
        matches = rellenarMatches();
    }

    public Player[] rellenarPlayers()
    {
        Player[] jugadores = new Player[25];
        jugadores[0]=new Player("Izan",3,19);
        jugadores[1]=new Player("Sergio",6,14);
        jugadores[2]=new Player("Alejandro",4,14);
        jugadores[3]=new Player("Marcos",7,16);
        jugadores[4]=new Player("Nico",12,16);
        jugadores[5]=new Player("Adrian",14,18);
        jugadores[6]=new Player("Gabriel",11,11);
        jugadores[7]=new Player("Yassin",32,12);
        jugadores[8]=new Player("Miguel",12,10);
        jugadores[9]=new Player("Carlos",5,9);
        jugadores[10] = new Player("Jose",6,12);
        jugadores[11] = new Player("Maria", 15, 30);
        jugadores[12] = new Player("Luis", 20, 50);
        jugadores[13] = new Player("Ana", 18, 45);
        jugadores[14] = new Player("Carlos", 12, 22);
        jugadores[15] = new Player("Laura", 25, 65);
        jugadores[16] = new Player("Miguel", 10, 18);
        jugadores[17] = new Player("Elena", 17, 38);
        jugadores[18] = new Player("Sofia", 22, 55);
        jugadores[19] = new Player("Daniel", 8, 14);
        jugadores[20] = new Player("Isabella", 14, 26);
        jugadores[21] = new Player("Valeria", 16, 31);
        jugadores[22] = new Player("Martina", 19, 48);
        jugadores[23] = new Player("Paula", 21, 53);
        jugadores[24] = new Player("Adriana", 13, 24);

        return jugadores;
    }

    public Team[] rellenarTeams()
    {
        Team[] equipos = new Team[5];
        equipos[0]=new Team("Team1",new Player[]{players[0],players[1],players[2],players[3],players[4]});
        equipos[1]=new Team("Team2",new Player[]{players[5],players[6],players[7],players[8],players[9]});
        equipos[2]=new Team("Team3",new Player[]{players[13],players[11],players[15],players[17],players[18]});
        equipos[3]=new Team("Team4",new Player[]{players[10],players[12],players[14],players[16],players[19]});
        equipos[4]=new Team("Team5",new Player[]{players[20],players[21],players[22],players[23],players[24]});

        return equipos;
    }
    public Team fillTeam(Team team){
        return team;
    }

    public Tournament[] rellenarTournaments()
    {
        Tournament[] torneos = new Tournament[3];
        torneos[0]=new IndividualTournament("LCD","Call of Duty",20000);
        torneos[1]= new MixedTournament("VCT","Valorant",43000,"Banned characters");
        torneos[2]= new TeamTournament("RLCS","Fortnite",540000,4);

        return torneos;
    }
    public Match[] rellenarMatches()
    {
        Random r = new Random();
        int numeroPartidas = r.nextInt(1,11);

        return new Match[numeroPartidas];
    }
    public void showPlayerRanking()
    {
        Arrays.sort(players);
        for(Player p:players)
        {
            System.out.println(p);
        }
    }
    public Player findPlayer(String name)
    {
        Player player = new Player("",0,0);
        for(Player p:players)
        {
            if(p.getName().equals(name))
            {
                player = p;
            }
        }
        return player;
    }
    public void showTournaments()
    {
        Arrays.sort(tournaments);
        for(Tournament t:tournaments)
        {
            System.out.println(t);
        }
    }

    public void showTeamRanking(){
        Arrays.sort(teams);
        for(Team t:teams)
        {
            System.out.println(t.getName() + " Ranking: " + t.getAverageRanking());
        }
    }
}
