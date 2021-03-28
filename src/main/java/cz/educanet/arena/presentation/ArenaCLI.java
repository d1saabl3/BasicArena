package cz.educanet.arena.presentation;

import cz.educanet.arena.data.GladiatorDatabase;
import cz.educanet.arena.logic.Arena;
import cz.educanet.arena.logic.Gladiator;

import java.util.Scanner;

public class ArenaCLI {
    private Arena logic;
    private Scanner sc;

    public void initialize() {
        logic = new Arena();
        sc = new Scanner(System.in);
    }

    public void renderLandingPage() {
        System.out.println("     /\\                         \n" +
                "    /  \\   _ __ ___ _ __   __ _ \n" +
                "   / /\\ \\ | '__/ _ \\ '_ \\ / _` |\n" +
                "  / ____ \\| | |  __/ | | | (_| |\n" +
                " /_/    \\_\\_|  \\___|_| |_|\\__,_|");
        System.out.println("---------------------------------");
    }

    public void renderGladiatorPicker() {
        System.out.println("Pick your fighter #1 (enter the path of the saved file):");
        String gladiator1File = sc.nextLine();
        System.out.println("Pick your fighter #2 (enter the path of the saved file):");
        String gladiator2File = sc.nextLine();

        Gladiator gladiator1 = GladiatorDatabase.loadGladiator(gladiator1File);
        Gladiator gladiator2 = GladiatorDatabase.loadGladiator(gladiator2File);
        logic.setGladiator1(gladiator1);
        logic.setGladiator2(gladiator2);
    }

    public void renderEntireFight() {
        while (logic.getWinner() == null) {
            Gladiator gladiator1 = logic.getGladiator1();
            Gladiator gladiator2 = logic.getGladiator2();

            int round = logic.getRound();

            System.out.println();
            System.out.println("---" + round + ". KOLO ---");
            System.out.println();

            System.out.println("---ZIVOTY NASICH GLADIATORU---");
            System.out.println(gladiator1.getName() + " ma " + gladiator1.getHP() + "/" + gladiator1.getFullHP());
            System.out.println(gladiator2.getName() + " ma " + gladiator2.getHP() + "/" + gladiator2.getFullHP());
            logic.fight();

        }
        Gladiator winner = logic.getWinner();
        System.out.println("---------------------");
        System.out.println(winner.getName() + " prave vyhral souboj ! GG");
        System.out.println("---------------------");
    }
}
