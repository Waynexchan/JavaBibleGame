package com.company.Sprite;

import com.company.Main;
import javax.swing.*;
import java.awt.*;

//因為sprite唔可以print自己,要用abstract class
public abstract class Sprite {

    protected ImageIcon img;
    protected Point relativePosition; //JAVA內建a point 反映X,Y既method e.g左上角 1,1 1,2 1,3 1,4 ...
    protected Point absolutePosition; //畫真正位置

    public void draw(Graphics g){
        if (relativePosition != null){ //設定原因 因為遊戲內既sprite可以殺死, 如果殺左= null 唔會執行paintIcon
            img.paintIcon(null, g, absolutePosition.x, absolutePosition.y);
        }
    }

    public void setPosition(Point p){ //method overload
        setPosition(p.x , p.y);
    }
    public void setPosition(int x, int y){ //set relativePosition, absolute Position
        relativePosition = new Point(x, y); //JAVA內建Point既method
        absolutePosition = new Point((x - 1)* Main.CELL,(y - 1) * Main.CELL);
    }

    public void setNullPosition(){
        relativePosition = null;
        absolutePosition = null;
    }

    public Point getRelativePosition(){
        if (relativePosition == null){
            return null;
        } else {
            return new Point(relativePosition); //用 new point(relativePosion) 避免用左copy by reference
        }
    }

    public abstract String overlap(int x , int y);
}
