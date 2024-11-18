import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Run3 extends Run2 {

    public static void main3() {
        new Run3().setVisible(true);
    }

    public Run3() {
        super();        
    }

    @Override
    protected void addDice() {
        super.addDice();
        myDie.setSize(150);
        
        // Calls their super code since we have an add dice function within Run1 and this extends Run2 which extends Run1
        // This keeps us from having to make a second redundent add dice function in Run3
    }

    @Override
    protected void handleButtonEvent(ActionEvent ae) { 
        if(ae.getSource() == increaseButton) { 
            myDie.setSize(myDie.getSize() + 10);
        }
        else if(ae.getSource() == decreaseButton) { 
            myDie.setSize(myDie.getSize() - 10);
        }        
        
        // IF you press the size+ and size- buttons it will change their size and redraw them
        // By calling changes on the dice instance
        
        repaint();
    }    
}