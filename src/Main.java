import java.io.Console;
import java.util.Scanner;

public class Main {

    public static String GenerateMenu()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("OPCIONES(1-10)");
        System.out.println("1.-Ver torneos disponibles ordenados por nombre");
        System.out.println("2.-Ver información de jugadores ordenada por clasificación y nombre");
        System.out.println("3.-Ver información de equipos ordenada por clasificacióN");
        System.out.println("4.-Añadir un nuevo jugador a un equipo");
        System.out.println("5.-Encontrar un jugador exacto por nombre");
        System.out.println("6.-Encontrar un jugador");
        System.out.println("7.-Encontrar un equipo");
        System.out.println("8.-Mostrar todos los partidos ordenados por nombre del torneo");
        System.out.println("9.-Actualizar el resultado de los partidos pendientes");
        System.out.println("10.-Salir");
        return sc.nextLine();
    }

    public static void Options(String option)
    {
        switch (option)
        {
            case "1":

                break;
            case "2":

                break;
            case "3":

                break;
            case "4":

                break;
            case "5":

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
                break;
        }
    }


    public static void main(String[] args) {

    }
}