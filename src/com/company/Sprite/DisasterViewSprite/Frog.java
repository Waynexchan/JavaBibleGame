package com.company.Sprite.DisasterViewSprite;

import com.company.Sprite.Sprite;

import javax.swing.*;

public class Frog extends Sprite {

    public Frog(int x, int y){
        setPosition(x, y); //設定relative position & absolute position
        img = new ImageIcon("frog.png");
    }
    @Override
    public String overlap(int x, int y) {
        return null;
    }
}