import java.io.Console;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static String GenerateMenu()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("OPCIONES(1-10)");
        System.out.println("1.-Ver torneos disponibles ordenados por nombre\n" +
                "2.-Ver información de jugadores ordenada por clasificación y nombre\n" +
                "3.-Ver información de equipos ordenada por clasificación\n" +
                "4.-Añadir un nuevo jugador a un equipo\n" +
                "5.-Encontrar un jugador exacto por nombre\n" +
                "6.-Encontrar un jugador\n" +
                "7.-Encontrar un equipo\n" +
                "8.-Mostrar todos los partidos ordenados por nombre del torneo\n" +
                "9.-Actualizar el resultado de los partidos pendientes\n" +
                "10.-Salir");
        return sc.nextLine();
    }

    public static void main(String[] args) {
        TournamentManager tm = new TournamentManager();
        tm.Initialized();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            switch (GenerateMenu()) {
                case "1":
                    tm.showTournaments();
                    break;
                case "2":
                    tm.showPlayerRanking();
                    break;
                case "3":
                    tm.showTeamRanking();
                    break;
                case "4":
                    tm.addPlayerToTeam();
                    break;
                case "5":
                    System.out.println("Dime un jugador que quieras buscar: ");
                    String nombre = sc.nextLine();
                    System.out.println(tm.findPlayer(nombre));
                    break;
                case "6":

                    break;
                case "7":

                    break;
                case "8":

                    break;
                case "9":

                    break;
                case "10":
                    System.out.println("Leaving...");
                    exit = true;
                    break;
            }
        }
    }
}