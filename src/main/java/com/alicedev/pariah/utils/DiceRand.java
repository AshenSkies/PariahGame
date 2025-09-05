package com.alicedev.pariah.utils;

import java.security.SecureRandom;

public class DiceRand {

    public static int[] rollDice(Dice type, int amount) {
        SecureRandom rand = new SecureRandom();
        int[] dice = new int[amount];
        for (int i = 0; i < amount; i++) {
            dice[i] = rand.nextInt(type.max_face)+1; //0 inclusive, max_face exclusive; thus add 1
        }
        return dice;
    }
}
