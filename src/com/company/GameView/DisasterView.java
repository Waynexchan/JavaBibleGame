package com.company.GameView;

import com.company.Sprite.DisasterViewSprite.Bug;
import com.company.Sprite.DisasterViewSprite.Frog;
import com.company.Sprite.DisasterViewSprite.Ice;
import com.company.Sprite.DisasterViewSprite.Tombstone;
import com.company.Sprite.Door;

import javax.swing.*;
import java.util.ArrayList;

public class DisasterView extends GameView{

    public ArrayList<Bug> getBugs() {
        return bugs;
    }

    public void setBugs(ArrayList<Bug> bugs) {
        this.bugs = bugs;
    }

    public ArrayList<Frog> getFrogs() {
        return frogs;
    }

    public void setFrogs(ArrayList<Frog> frogs) {
        this.frogs = frogs;
    }

    public ArrayList<Ice> getIceCubess() {
        return iceCubess;
    }

    public void setIceCubess(ArrayList<Ice> iceCubess) {
        this.iceCubess = iceCubess;
    }

    public ArrayList<Tombstone> getStones() {
        return stones;
    }

    public void setStones(ArrayList<Tombstone> stones) {
        this.stones = stones;
    }

    private ArrayList<Bug> bugs = new ArrayList<>();
    private ArrayList<Frog> frogs = new ArrayList<>();
    private ArrayList<Ice> iceCubess = new ArrayList<>();
    private ArrayList<Tombstone> stones = new ArrayList<>();



    public DisasterView(){
        img = new ImageIcon("egypt.jpg");
        elements = new ArrayList<>();
        door = new Door(10,10); //因為係GameView創建左唔駛再Construct
        bugs.add(new Bug(10,5));
        bugs.add(new Bug(9,5));
        bugs.add(new Bug(9,4));
        bugs.add(new Bug(6,2));
        bugs.add(new Bug(6,3));
        bugs.add(new Bug(6,3));
        bugs.add(new Bug(6,5));
        frogs.add(new Frog(1,2));
        frogs.add(new Frog(1,3));

        frogs.add(new Frog(1,4));

        frogs.add(new Frog(2,2));

        frogs.add(new Frog(2,3));
        iceCubess.add(new Ice(7,5));
        iceCubess.add(new Ice(3,5));
        iceCubess.add(new Ice(5,5));
        iceCubess.add(new Ice(4,5));
        iceCubess.add(new Ice(8,5));
        stones.add(new Tombstone(6,6));
        stones.add(new Tombstone(7,8));
        stones.add(new Tombstone(8,8));
        stones.add(new Tombstone(9,8));
        stones.add(new Tombstone(3,8));

        elements.add(door);//將門放入elements
        elements.addAll(stones); //將Stones Arraylist全部放入elements
        elements.addAll(frogs);
        elements.addAll(iceCubess);
        elements.addAll(bugs);

    }
}
