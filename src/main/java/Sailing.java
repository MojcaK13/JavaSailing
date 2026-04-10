import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sailing {

    /**
     * This Java program takes user input for the number of boats and races, generates random race
     * results, calculates total points, and displays the results.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę łódek:");
        int boats = sc.nextInt();
        System.out.println("Podaj liczbę wyścigów:");
        int races = sc.nextInt();
        int[] result = new int[races];
        int points=0;
        Random randomRace = new Random();
        for (int race = 0; race < races; race++) {
            result[race] = randomRace.nextInt(((boats+1)-1)+1);
            points += result[race];
        }
        String results = Arrays.stream(result).mapToObj(String::valueOf).collect(Collectors.joining(","));
        System.out.println("Wyniki wyścigów regaty:"+results);
        System.out.println("Ilość punktów:"+points);
    }
}
