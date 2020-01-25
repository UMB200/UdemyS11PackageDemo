package com.example.game;

import java.util.ArrayList;
import java.util.List;

public class Players implements ISaveable {
    private String playerName;
    private int playerScore;
    private int healthLevel;
    private String weapon;

    public Players(String playerName, int playerScore, int healthLevel) {
        this.playerName = playerName;
        this.playerScore = playerScore;
        this.healthLevel = healthLevel;
        this.weapon = "Stick";
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Players{" +
                "playerName='" + playerName + '\'' +
                ", playerScore=" + playerScore +
                ", healthLevel=" + healthLevel +
                ", weapon='" + weapon + '\'' +
                '}';
    }



    @Override
    public List<String> valuesToSave() {

            List<String> arrayList = new ArrayList<>();
            arrayList.add(0, this.playerName);
            arrayList.add(1, ""+  this.playerScore);
            arrayList.add(2, "" + this.healthLevel);
            arrayList.add(3, this.weapon);
            return arrayList;

    }

    @Override
    public void populateFields(List<String> fields) {
        if(fields != null && fields.size() >0){
            this.playerName = fields.get(0);
            this.playerScore = Integer.parseInt(fields.get(1));
            this.healthLevel = Integer.parseInt(fields.get(2));
            this.weapon = fields.get(3);
        }
    }
}
