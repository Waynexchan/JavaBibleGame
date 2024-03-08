package com.company.GameView;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import com.company.Main;
import com.company.Sprite.*;

public abstract class GameView {

    protected ArrayList<Sprite> elements;
    protected Door door;
    protected ImageIcon img; //每個GAMEVIEW的背景

    public void drawView(Graphics g){ //每一個新的gameView 都要draw自己
        img.paintIcon(null, g,0,0); //用paintIcon paint自己
        g.fillRect(0,0, Main.WIDTH,Main.HEIGHT);
        for (Sprite s : elements){
            s.draw(g); //讓每一個sprite都可以用g黎畫自己
        }
    }
    public Door getDoor(){
        return this.door;
    }
    public ArrayList<Sprite> getElements(){
        return this.elements;
    }
}
