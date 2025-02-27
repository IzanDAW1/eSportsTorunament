import java.awt.event.ItemEvent;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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
        Player[] jugadores = new Player[10];
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

        return jugadores;
    }

    public Team[] rellenarTeams()
    {
        Team[] equipos = new Team[5];
        equipos[0]=new Team("Team1");
        equipos[1]=new Team("Team2");
        equipos[2]=new Team("Team3",new Player[]{players[0],players[1],players[2],players[3],players[4]});
        equipos[3]=new Team("Team4");
        equipos[4]=new Team("Team5",new Player[]{players[5],players[6],players[7],players[8],players[9]});

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
        Arrays.sort(playersNotNull);
        for(Player p:playersNotNull)
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
            System.out.println(t);
        }
    }

    public void addPlayerToTeam()
    {
        Scanner sc = new Scanner(System.in);
        for(Team t:teams)
        {
            System.out.println(t.getName());
        }
        System.out.println("Which team did you want to fill?");
        int option = sc.nextInt();

        System.out.println("Which player did you want to add?: ");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.println("Player level?: ");
        String level = sc.nextLine();
        System.out.println("Player ranking?: ");
        String ranking = sc.nextLine();
        Player pl = new Player(name,Integer.parseInt(level),Float.parseFloat(ranking));
        try
        {
            teams[option-1].AddPlayer(pl);
        }
        catch (fullTeamException e)
        {
            System.out.println(e.getMessage());
        }



    }
}
