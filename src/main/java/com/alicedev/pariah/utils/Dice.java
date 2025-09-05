package com.alicedev.pariah.utils;

public enum Dice {
    D100(100),
    D20(20),
    D12(12),
    D8(8),
    D6(6),
    D4(4),
    D2(2);

    public final int max_face;

    private Dice(int i) {
        this.max_face = i;
    }
}
