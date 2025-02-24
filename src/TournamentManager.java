import java.awt.event.ItemEvent;
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
        Player[] jugadores = new Player[10];
        jugadores[0]=new Player("Izan",3,19);
        jugadores[1]=new Player("Sergio",6,14);
        jugadores[2]=new Player("Alejandro",4,13);
        jugadores[3]=new Player("Marcos",7,16);
        jugadores[4]=new Player("Nico",12,17);
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
        equipos[0]=new Team("Izan");
        equipos[1]=new Team("Sergio");
        equipos[2]=new Team("Alejandro");
        equipos[3]=new Team("Marcos");
        equipos[4]=new Team("Nico");

        return equipos;
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
        String hoka;
        int numeroPartidas = r.nextInt(1,11);

        return new Match[numeroPartidas];
    }
}
