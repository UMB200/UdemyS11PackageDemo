package com.example.game;

import java.util.ArrayList;
import java.util.List;

public class Monsters implements ISaveable {
    private String monsterName;
    private int monsterScore;
    private int monsterHealth;

    public Monsters(String monsterName, int monsterScore, int monsterHealth) {
        this.monsterName = monsterName;
        this.monsterScore = monsterScore;
        this.monsterHealth = monsterHealth;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public int getMonsterScore() {
        return monsterScore;
    }

    public int getMonsterHealth() {
        return monsterHealth;
    }

    @Override
    public List<String> valuesToSave() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(0, this.monsterName);
        arrayList.add(1, "" + this.monsterScore);
        arrayList.add(2, ""+ this.monsterHealth);
        return arrayList;
    }

    @Override
    public void populateFields(List<String> fields) {
        if(fields != null && fields.size() > 0){
            this.monsterName = fields.get(0);
            this.monsterScore = Integer.parseInt(fields.get(1));
            this.monsterHealth = Integer.parseInt(fields.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monsters{" +
                "monsterName='" + monsterName + '\'' +
                ", monsterScore=" + monsterScore +
                ", monsterHealth=" + monsterHealth +
                '}';
    }

}
