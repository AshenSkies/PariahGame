package com.alicedev.pariah.ironbound;

public class PlayerCharacter {
    private String name;
    private String weapon;
    private int hitpoints;
    private int iron_hitpoints;

    private int dice_rerolls;

    private String purpose;
    private String past;
    private String imprisonment;
    private String love;

    public PlayerCharacter(String name, String weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHitpoints() {
        return hitpoints;
    }
    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int getIron_hitpoints() {
        return iron_hitpoints;
    }
    public void setIron_hitpoints(int iron_hitpoints) {
        this.iron_hitpoints = iron_hitpoints;
    }

    public int getDice_rerolls() {
        return dice_rerolls;
    }
    public void setDice_rerolls(int dice_rerolls) {
        this.dice_rerolls = dice_rerolls;
    }

    public String getPast() {
        return past;
    }
    public void setPast(String past) {
        this.past = past;
    }

    public String getImprisonment() {
        return imprisonment;
    }
    public void setImprisonment(String imprisonment) {
        this.imprisonment = imprisonment;
    }

    public String getLove() {
        return love;
    }
    public void setLove(String love) {
        this.love = love;
    }

    public String getPurpose() {
        return purpose;
    }
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
