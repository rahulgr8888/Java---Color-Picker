/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Shubham Gupta
 */
@SuppressWarnings("serial")
public class panels extends JFrame implements MouseListener{
	JPanel jp[];
	int i=0,y=0;

    public panels()  {
        this.addMouseListener(this);
    }

    public void Gridtry1() {
        i++;
        y=y+10;
        jp=new JPanel[i+1];
        jp[i]=new JPanel();
        GridLayout gl=new GridLayout(1,i);
       this.setLayout(gl);
       // JPanel pl=new JPanel();
        jp[i].setBackground(Color. getHSBColor(10+y,10+y,20+y));
         add(jp[i]);
         
         validate();
         //JPanel pl1=new JPanel();
          //pl1.setBackground(Color.yellow);
        //this.add(pl1);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        panels gd=new panels();
        gd.setVisible(true);
        gd.setSize(100, 100);
        gd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       System.out.println("aaa");
       Gridtry1();
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
