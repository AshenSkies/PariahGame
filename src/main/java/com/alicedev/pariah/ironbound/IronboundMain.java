package com.alicedev.pariah.ironbound;

import com.alicedev.pariah.utils.MenuOption;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import static com.alicedev.pariah.utils.Input.inputOption;
import static com.alicedev.pariah.utils.Input.inputString;

public class IronboundMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        gameIntroduction();

        PlayerCharacter player = new PlayerCharacter(
                inputString("\nBy whom do you go by?\n",scanner),
                inputString("\nWhat carries you in armament?\n",scanner)
        );

        List<MenuOption> land_menu_options = new ArrayList<>();
        land_menu_options.add(new MenuOption("landMenu_toTower","Enter the Mage's tower."));
        land_menu_options.add(new MenuOption("landMenu_viewSelf", "Peer into the silver leaf."));
        MenuOption chosen_menu = inputOption("...And what shall you do?", land_menu_options, scanner);

        switch (chosen_menu.getId()) {
            case "landMenu_toTower":
                System.out.println("bla");
                break;
            case "landMenu_viewSelf":
                System.out.println("bleh");
                break;
        }
    }

    public static void gameIntroduction() {
        System.out.println("You are a Prisoner of Flesh within a realm of Magic.");
        System.out.println("It hates you, eats at your cells, your weakness.");
        System.out.println("Bound in IRON you are, in irony and mockery.");
        System.out.println("The Goddess of Iron does not take well to the arrogance to the God of Magic.");
        System.out.println("She blesses your wrists with scalding heat,");
        System.out.println("BLACKIRON taking the place of the weaker metal,");
        System.out.println("encasing your arms and gifting you violence.");

        System.out.println("Bound by a new IRON, you are given one duty – to defeat the arrogant Mage who imprisoned you here.");
        System.out.println("Then, perhaps, freedom will you know.");
        System.out.println("Yet you know the terms of the deal made.");
        System.out.println("And how foolish such a thought is now.");
        System.out.println("For your Fate is now set in IRON.");
        System.out.println("Ever the IRON BASTARD, ever the foe,");
        System.out.println("by spell or blade, all you will know is pain.");

    }
}