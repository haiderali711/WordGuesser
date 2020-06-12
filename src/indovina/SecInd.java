package indovina;

import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SecInd implements ActionListener{
    JFrame f2 = new JFrame("2nd Frame");
    String s1 = "AEIMQUY";
    String s2 = "BFJNRVZ";
    String s3 = "CGKOSW-";
    String s4 = "DHLPTX-";
    String []sHor;
    String []sVer;
    int numTot;
    int totLett[] = new int[20];
    String parola ="";
    int totL2[];
    int num = 0;
    
    JButton b1,b2,b3,b4,b5,b6,b7,end;
    JLabel l1,l2,l3,l4,l5,l6,l7;
    String lS1="",lS2="",lS3="",lS4="",lS5="",lS6="",lS7="";

    ArrayList <String> combinations = new ArrayList<>();
    private static int n[] = new int [7];







    SecInd(int numTot,int totLett[]){
        this.numTot = numTot;
        this.totLett = totLett;
        
        sHor = new String[numTot];
        sVer = new String[7];
        for (int i = 0; i < 7; i++) {
            sVer[i]="";
        }
        totL2 = new int[numTot];
        
        
        f2.setBounds(50,50,550,((numTot*50)+100));
        f2.setLayout(new BorderLayout());
        f2.setDefaultCloseOperation(f2.EXIT_ON_CLOSE);
        
        JPanel northP = new JPanel();
        JPanel centerP = new JPanel();
        JPanel southP = new JPanel();
        
        
        b1 = new JButton("1");
        b1.addActionListener(this);
        b2 = new JButton("2");
        b2.addActionListener(this);
        b3 = new JButton("3");
        b3.addActionListener(this);
        b4 = new JButton("4");
        b4.addActionListener(this);
        b5 = new JButton("5");
        b5.addActionListener(this);
        b6 = new JButton("6");
        b6.addActionListener(this);
        b7 = new JButton("7");
        b7.addActionListener(this);
        //end = new JButton("Finito");
        //end.addActionListener(this);
        
        
        northP.setLayout(new GridLayout(1,7,2,2));
        l1 = new JLabel("");
        l2 = new JLabel("");
        l3 = new JLabel("");
        l4 = new JLabel("");
        l5 = new JLabel("");
        l6 = new JLabel("");
        l7 = new JLabel("");
        northP.add(l1);
        northP.add(l2);
        northP.add(l3);
        northP.add(l4);
        northP.add(l5);
        northP.add(l6);
        northP.add(l7);

        //gammal kod kommenterat
        //centerP.setLayout(new GridLayout((1+numTot),7,2,2));
        centerP.setLayout(new GridLayout(5,7,2,2));

        centerP.add(b1);
        centerP.add(b2);
        centerP.add(b3);
        centerP.add(b4);
        centerP.add(b5);
        centerP.add(b6);
        centerP.add(b7);
        
        for (int i = 0; i < numTot; i++) {
            if (totLett[i]==1){
                sHor[i]=s1;
            }
            if (totLett[i]==2){
                sHor[i]=s2;
            }
            if (totLett[i]==3){
                sHor[i]=s3;
            }
            if (totLett[i]==4){
                sHor[i]=s4;
            }
            System.out.println(sHor[i]);

        }
        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < numTot; j++) {
                sVer[i] += sHor[j].charAt(i);
            }
            System.out.println(sVer[i]);
        }


        //kommenterat kod för att skriva ut dem riktiga lines som skulle vara!
        /*
        for (int i = 0; i < numTot; i++) {
            if (totLett[i]==1){
                for (int j = 0; j < 7; j++) {
                    centerP.add(new JLabel("    "+s1.charAt(j)));
                }
            }
            if (totLett[i]==2){
                for (int j = 0; j < 7; j++) {
                    centerP.add(new JLabel("    "+s2.charAt(j)));
                }
            }
            if (totLett[i]==3){
                for (int j = 0; j < 7; j++) {
                    centerP.add(new JLabel("    "+s3.charAt(j)));
                }
            }
            if (totLett[i]==4){
                for (int j = 0; j < 7; j++) {
                    centerP.add(new JLabel("    "+s4.charAt(j)));
                }
            }
        }*/




        for (int i=0; i < numTot; i++){
            n[i]=0;
        }


        for (int i = 0; i < 7; i++) {
            centerP.add(new JLabel("    "+s1.charAt(i)));
        }
        for (int i = 0; i < 7; i++) {
            centerP.add(new JLabel("    "+s2.charAt(i)));
        }
        for (int i = 0; i < 7; i++) {
            centerP.add(new JLabel("    "+s3.charAt(i)));
        }
        for (int i = 0; i < 7; i++) {
            centerP.add(new JLabel("    "+s4.charAt(i)));
        }

            //southP.add(end);
        
        f2.add(northP,BorderLayout.NORTH);
        f2.add(centerP,BorderLayout.CENTER);
        
        //f2.add(southP,BorderLayout.SOUTH);
        f2.setVisible(true);
    }
/*
    int counter;

    private static void combin2(int depth, int[][]matrix, int[] output)
    {
        int[] row = matrix[depth];

        if(depth == 0) {
            counter = 0;
            output = new int[matrix.length];
            System.out.println("matrix length: " + matrix.length);
        }

        for(int i=0; i<row.length; i++) {
            output[depth] = row[i];

            if(depth == (matrix.length-1)) {
                //print the combination
                System.out.println(Arrays.toString(output));
                counter++;
            } else {
                //recursively generate the combination
                combin2(depth+1, matrix, output);
            }
        }
    }
*/




    //index is going to start from num - 1
    private void makeCombinations(int index){
        if ((index ==0)&&n[7]==){

        }



        String s ="";
        for (int i = 0; i < numTot; i++) {
            if ()
        }

    }





    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()== b1){
            int n=0;
            parola += sVer[n].charAt(num);
            num++;
            if (num == numTot){
                JOptionPane.showMessageDialog(null,"The word you thought is : "+parola);
            }
        }
        if (ae.getSource()== b2){
            int n=1;
            parola += sVer[n].charAt(num);
            num++;
            if (num == numTot){
                JOptionPane.showMessageDialog(null,"The word you thought is : "+parola);
            }
        }
        if (ae.getSource()== b3){
            int n=2;
            parola += sVer[n].charAt(num);
            num++;
            if (num == numTot){
                JOptionPane.showMessageDialog(null,"The word you thought is : "+parola);
            }
        }
        if (ae.getSource()== b4){
            int n=3;
            parola += sVer[n].charAt(num);
            num++;
            if (num == numTot){
                JOptionPane.showMessageDialog(null,"The word you thought is : "+parola);
            }
        }
        if (ae.getSource()== b5){
            int n=4;
            parola += sVer[n].charAt(num);
            num++;
            if (num==numTot){
                JOptionPane.showMessageDialog(null,"The word you thought is : "+parola);
            }
        }
        if (ae.getSource()== b6){
            int n=5;
            parola += sVer[n].charAt(num);
            num++;
            if (num == numTot){
                JOptionPane.showMessageDialog(null,"The word you thought is : "+parola);
            }
        }
        if (ae.getSource()== b7){
            int n=6;
            parola += sVer[n].charAt(num);
            num++;
            if (num == numTot){
                JOptionPane.showMessageDialog(null,"The word you thought is : "+parola);
            }
        }
    }
}
