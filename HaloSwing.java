package com.artivisi.project;

import javax.swing.Jframe;
import javax.swing.Jpanel;
import javax.swing.JoptionPane;
import javax.swing.Jlabel;

public class HaloSwing{
  public static void main(String[] xx){
  Jframe fr=new Jframe();
  fr.setTittle("Halo Swing");
  
  fr.setSize(200,200);
  fr.setLocationRelativeTo(null);
  fr.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);
  
  fr.setRisizeble(false);
  JPanel pnl = new JPanel();
  JLabel lbl = new JLabel("Label pada JPanel");
  pnl.add(lbl);
  fr.add(pnl);
  JOptionPane.showMessegeDialog(null, "Halo Dialog");
  
  fr.setVisible(true);
  )
  }
