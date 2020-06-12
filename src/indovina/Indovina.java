package indovina;
import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class Indovina implements ActionListener{
    JFrame f1 = new JFrame("1st Step.");
    JButton b1,b2,b3,b4,end,back;
    
    JLabel l1,l2,l3,l4;
    String lS1="",lS2="",lS3="",lS4="";
    int totLett[] = new int[20];
    int numTot = 0;
    
    
    Indovina(){
        f1.setBounds(50,50,200,300);
        f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
        f1.setLayout(new BorderLayout());
        
        b1 = new JButton("1");
        b1.addActionListener(this);
        b2 = new JButton("2");
        b2.addActionListener(this);
        b3 = new JButton("3");
        b3.addActionListener(this);
        b4 = new JButton("4");
        b4.addActionListener(this);
        end = new JButton("END");
        end.addActionListener(this);
        
        JPanel northP = new JPanel();
        JPanel centerP = new JPanel();
        JPanel southP = new JPanel();
        
        
        northP.setLayout(new GridLayout(1,4,2,2));
        l1 = new JLabel("");
        l2 = new JLabel("");
        l3 = new JLabel("");
        l4 = new JLabel("");
        northP.add(l1);
        northP.add(l2);
        northP.add(l3);
        northP.add(l4);
        
        
        centerP.setLayout(new GridLayout(8,4,2,2));
        centerP.add(b1);
        centerP.add(b2);
        centerP.add(b3);
        centerP.add(b4);
        centerP.add(new JLabel("    A"));
        centerP.add(new JLabel("    B"));
        centerP.add(new JLabel("    C"));
        centerP.add(new JLabel("    D"));
        centerP.add(new JLabel("    E"));
        centerP.add(new JLabel("    F"));
        centerP.add(new JLabel("    G"));
        centerP.add(new JLabel("    H"));
        centerP.add(new JLabel("    I"));
        centerP.add(new JLabel("    J"));
        centerP.add(new JLabel("    K"));
        centerP.add(new JLabel("    L"));
        centerP.add(new JLabel("    M"));
        centerP.add(new JLabel("    N"));
        centerP.add(new JLabel("    O"));
        centerP.add(new JLabel("    P"));
        centerP.add(new JLabel("    Q"));
        centerP.add(new JLabel("    R"));
        centerP.add(new JLabel("    S"));
        centerP.add(new JLabel("    T"));
        centerP.add(new JLabel("    U"));
        centerP.add(new JLabel("    V"));
        centerP.add(new JLabel("    W"));
        centerP.add(new JLabel("    X"));
        centerP.add(new JLabel("    Y"));
        centerP.add(new JLabel("    Z"));
        centerP.add(new JLabel(""));
        centerP.add(new JLabel("")); 
        
        
        southP.add(end);
        
        JOptionPane.showMessageDialog(null,"Think a WORD in Enlish ! \n Thought ? ? ... Now tell me in which coloums are all the letters of the word .");
        f1.add(northP,BorderLayout.NORTH);
        f1.add(centerP,BorderLayout.CENTER);
        f1.add(end,BorderLayout.SOUTH);
        f1.setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==b1){
            totLett[numTot] = 1;
            numTot++;
            lS1= lS1+numTot+",";
            l1.setText(lS1);
        }
        if (ae.getSource()==b2){
            totLett[numTot] = 2;
            numTot++;
            lS2= lS2+numTot+",";
            l2.setText(lS2);
        }
        if (ae.getSource()==b3){
            totLett[numTot] = 3;
            numTot++;
            lS3= lS3+numTot+",";
            l3.setText(lS3);
        }
        if (ae.getSource()==b4){
            totLett[numTot] = 4;
            numTot++;
            lS4= lS4+numTot+",";
            l4.setText(lS4);
        }
        if (ae.getSource()==end){
            f1.setVisible(false);
            JOptionPane.showMessageDialog(null,"Now we do the samething again with another table.");
            SecInd a = new SecInd(numTot,totLett);
        }
    }
    
    
    public static void main(String[] args) {
        new Indovina();
    }
}
