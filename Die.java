import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Math;
import java.awt.Graphics; 
import java.awt.Color;

public class Die {
    private int currentValue;
    private int size;
    private int xCoord;
    private int yCoord;
    
    private void reRoll() {
        currentValue = (int)(Math.random() * 6);
    }
    
    public void paint(Graphics g) {
        if (g == null) {
            return;
        }
        
        g.setColor(Color.black);
        g.drawRect(0,0,50,50);
        
        g.setColor(Color.white);
        g.fillRect(0,0,50,50);
        
        g.setColor(Color.black);
        g.drawString(Integer.toString(currentValue),25,25);
        
    }
    
    public void roll(Graphics g) {
        reRoll();
        paint(g);
    }
    
    public Die() {
        reRoll();
    }
}

