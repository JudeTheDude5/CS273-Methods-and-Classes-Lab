import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Math;
import java.awt.Graphics; 
import java.awt.Color;

public class Die {
    private int currentValue;
    private int size = 50;
    private int xCoord;
    private int yCoord;
    
    private void reRoll() {
        currentValue = (int)(Math.random() * 6) + 1;
    }
    
    public void paint(Graphics g) {
        if (g == null) {
            return;
        }
        
        g.setColor(Color.black);
        g.drawRect(xCoord,yCoord,size,size);
        
        g.setColor(Color.white);
        g.fillRect(xCoord,yCoord,size,size);
        
        switch (currentValue) {
            case 1:
                drawSpot(25, 25, g);
                break;
            case 2:
                drawSpot(12, 38, g);
                drawSpot(38, 12, g);
                break;
            case 3:
                drawSpot(12, 38, g);
                drawSpot(38, 12, g);
                drawSpot(25, 25, g);
                break;
            case 4:
                drawSpot(12, 38, g);
                drawSpot(38, 12, g);
                drawSpot(12, 12, g);
                drawSpot(38, 38, g);
                break;
            case 5:
                drawSpot(12, 38, g);
                drawSpot(38, 12, g);
                drawSpot(12, 12, g);
                drawSpot(38, 38, g);
                drawSpot(25, 25, g);
                break;
            case 6:
                drawSpot(12, 12, g);
                drawSpot(12, 25, g);
                drawSpot(12, 38, g);
                drawSpot(38, 12, g);
                drawSpot(38, 25, g);
                drawSpot(38, 38, g);
                break;
            
        }
    }
    
    public void roll(Graphics g) {
        reRoll();
        paint(g);
    }
    
    public Die() {
        reRoll();
    }
    
    public Die(int x, int y) {
        this();
        xCoord = x;
        yCoord = y;
    }
    
    private void drawSpot(int x, int y, Graphics g) {
        g.setColor(Color.black);
        g.fillOval(xCoord + ((x-5)*size/50),yCoord + ((y-5)*size/50),(9*size/50),(9*size/50));
    }
    
    public void setSize(int s) {
        size = s;
    }
    
    public int getSize() {
        return size;
    }
    
    public int getCurrentValue() {
        return currentValue;
    }
    
    public String toString() {
        String r = Integer.toString(getCurrentValue());
        return r;
    }
    
    public boolean equals(Die d) {
        if (getCurrentValue() == d.getCurrentValue()) {
            return true;
        }
        else {
            return false;
        }
    }
}

