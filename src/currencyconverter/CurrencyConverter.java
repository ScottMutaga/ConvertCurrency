/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconverter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Currency;
import java.util.Locale;
import javafx.scene.layout.GridPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author user
 */
public class CurrencyConverter extends JFrame{
    double ksh=120.53,ugsh=1152,srand=96.32,dir=78.25,naira=302.96,cedi=300.23,mau=79.25;
    JFrame frame ;
    JPanel panel;
        JPanel mPanel;
            JPanel mpanel;
            GridLayout lay;
    JScrollPane pane;
    JLabel label,label4;
    JLabel label3;
    JLabel label2;
    JButton con;
    JList Africa;
    JTextField field;
    JList Europe;
    String [] europa={"England","Germany","Italy","Portugal","Scotland","Poland","Belgium","Norway","Denmark","France"};
     String [] afrika={"Kenya","Uganda","South Africa","Morocco","Nigeria","Ghana","Mauritius","Seychelles","Tanzania","Egypt"};
    String [] pesa={"Sterling pound","Euro","Euro","Euro","Sterling pound","Polish zloty","Euro","Norwegian krone","Danish krone","CFP franc"};
    String money[]={"Kenyan Shillings","Ugandan Shilling","Rand","Moroccan dirham","Naira","Ghanaian cedi","Mauritian rupee"
    ,"Seychellois rupee","Tanzanian Shillings","Egyptian Pound"};
    CurrencyConverter(){
        lay=new GridLayout();
        label4=new JLabel(" to ");
        frame =new JFrame();
        panel=new JPanel();
        mPanel=new JPanel();
        mpanel=new JPanel();
        label3=new JLabel();
        field=new JTextField(20);
        label2=new JLabel();
        con=new JButton("Convert");
        label =new JLabel();
        Africa=new JList(afrika);
        Europe=new JList(europa);
          panel.add(Europe);
        panel.add(Africa);
         panel.setLayout(new FlowLayout());
        mPanel.add(label);
        mPanel.add(label4);
        mPanel.add(label2);
         mPanel.setLayout(new FlowLayout());
        mpanel.add(field);
        mpanel.add(con);
        mpanel.add(label3);
        mpanel.setLayout(new FlowLayout());
        
frame.setLayout(lay);
panel.setAlignmentX(0);
panel.setAlignmentY(0);
        frame.add(panel);
        frame.add(mPanel);
        frame.add(mpanel);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
         ListHandler handle=new ListHandler();
        ButtonHandler hd=new ButtonHandler();
        con.addActionListener(hd);
        Africa.addListSelectionListener(handle);
        Europe.addListSelectionListener(handle);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CurrencyConverter cv=new CurrencyConverter();
    }

    private class ListHandler implements ListSelectionListener{

        public ListHandler() {
        }

        @Override
        public void valueChanged(ListSelectionEvent e) {
            label.setText( pesa[Europe.getSelectedIndex()]);
              label2.setText( money[Africa.getSelectedIndex()]);
        }
    }

    private class ButtonHandler implements ActionListener{

        public ButtonHandler() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            double p;
            double fMoney=Double.parseDouble(field.getText());
            if(e.getSource().equals(con)){
                if(Europe.getSelectedIndex()==0 ||Europe.getSelectedIndex()==4  && Africa.getSelectedIndex()==0){
                    p=fMoney*ksh;
                     label3.setText("KSh "+ String.valueOf(p));
                }if(Europe.getSelectedIndex()==0 ||Europe.getSelectedIndex()==4 && Africa.getSelectedIndex()==1){
                    p=fMoney*ugsh;
                     label3.setText("UGSh "+String.valueOf(p));
                }
                if(Europe.getSelectedIndex()==0 ||Europe.getSelectedIndex()==4 && Africa.getSelectedIndex()==2){
                    p=fMoney*srand;
                     label3.setText("Rand "+String.valueOf(p));
                }
                if(Europe.getSelectedIndex()==0 ||Europe.getSelectedIndex()==4 && Africa.getSelectedIndex()==3){
                    p=fMoney*dir;
                     label3.setText("Dir "+String.valueOf(p));
                }
                  if(Europe.getSelectedIndex()==0 ||Europe.getSelectedIndex()==4 && Africa.getSelectedIndex()==4){
                    p=fMoney*naira;
                     label3.setText("Naira "+String.valueOf(p));
                }
                   if(Europe.getSelectedIndex()==0 ||Europe.getSelectedIndex()==4 && Africa.getSelectedIndex()==5){
                    p=fMoney*cedi;
                     label3.setText("cedi "+String.valueOf(p));
                }
                     if(Europe.getSelectedIndex()==0 ||Europe.getSelectedIndex()==4 && Africa.getSelectedIndex()==6){
                    p=fMoney*mau;
                     label3.setText("Rupee "+String.valueOf(p));
                }
                      if(Europe.getSelectedIndex()==0 ||Europe.getSelectedIndex()==4 && Africa.getSelectedIndex()==7){
                    p=fMoney*99.56;
                     label3.setText("Rupee "+String.valueOf(p));
                }
                      if(Europe.getSelectedIndex()==0 ||Europe.getSelectedIndex()==4 && Africa.getSelectedIndex()==8){
                    p=fMoney*1025.35;
                     label3.setText("Tsh "+String.valueOf(p));
                }
                       if(Europe.getSelectedIndex()==0 ||Europe.getSelectedIndex()==4 && Africa.getSelectedIndex()==9){
                    p=fMoney*97.54;
                     label3.setText("Egyptian Pound "+String.valueOf(p));
                }
                if(Europe.getSelectedIndex()==1||Europe.getSelectedIndex()==2 ||Europe.getSelectedIndex()==3 ||Europe.getSelectedIndex()==6 && Africa.getSelectedIndex()==0){
                    p=fMoney*150;
                     label3.setText("KSh "+String.valueOf(p));
                }
                 if(Europe.getSelectedIndex()==1 ||Europe.getSelectedIndex()==2||Europe.getSelectedIndex()==3 ||Europe.getSelectedIndex()==6 && Africa.getSelectedIndex()==1){
                    p=fMoney*1020;
                     label3.setText("UGSh "+String.valueOf(p));
                }
                  if(Europe.getSelectedIndex()==1 ||Europe.getSelectedIndex()==2 ||Europe.getSelectedIndex()==3 ||Europe.getSelectedIndex()==6 && Africa.getSelectedIndex()==2){
                    p=fMoney*96;
                     label3.setText("Rand "+String.valueOf(p));
                }
                   if(Europe.getSelectedIndex()==1 ||Europe.getSelectedIndex()==2 ||Europe.getSelectedIndex()==3 ||Europe.getSelectedIndex()==6 && Africa.getSelectedIndex()==3){
                    p=fMoney*98.24;
                     label3.setText("Dir "+String.valueOf(p));
                }
                    if(Europe.getSelectedIndex()==1 ||Europe.getSelectedIndex()==2 ||Europe.getSelectedIndex()==3 ||Europe.getSelectedIndex()==6 && Africa.getSelectedIndex()==4){
                    p=fMoney*108.14;
                     label3.setText("Naira "+String.valueOf(p));
                }
                     if(Europe.getSelectedIndex()==1 ||Europe.getSelectedIndex()==2 ||Europe.getSelectedIndex()==3 || Europe.getSelectedIndex()==6 && Africa.getSelectedIndex()==5){
                    p=fMoney*99.24;
                     label3.setText("cedi "+String.valueOf(p));
                }
                      if(Europe.getSelectedIndex()==1 ||Europe.getSelectedIndex()==2 ||Europe.getSelectedIndex()==3 ||Europe.getSelectedIndex()==6 && Africa.getSelectedIndex()==6){
                    p=fMoney*97.56;
                     label3.setText("Rupee "+String.valueOf(p));
                }
                      if(Europe.getSelectedIndex()==1||Europe.getSelectedIndex()==2 ||Europe.getSelectedIndex()==3 ||Europe.getSelectedIndex()==6 && Africa.getSelectedIndex()==7){
                    p=fMoney*96.25;
                     label3.setText("Rupee "+String.valueOf(p));            
                            }
                      if(Europe.getSelectedIndex()==1||Europe.getSelectedIndex()==2 ||Europe.getSelectedIndex()==3 ||Europe.getSelectedIndex()==6 && Africa.getSelectedIndex()==8){
                    p=fMoney*1052.25;
                     label3.setText("TzSh "+String.valueOf(p));            
                            }
                        if(Europe.getSelectedIndex()==1||Europe.getSelectedIndex()==2 ||Europe.getSelectedIndex()==3 ||Europe.getSelectedIndex()==6 && Africa.getSelectedIndex()==9){
                    p=fMoney*105.25;
                     label3.setText("Egyptian Pound "+String.valueOf(p));            
                            }
                        if(Europe.getSelectedIndex()==5 && Africa.getSelectedIndex()==0){
                              p=fMoney*92.36;
                     label3.setText("KSh "+String.valueOf(p));
                        }
                        if(Europe.getSelectedIndex()==5 && Africa.getSelectedIndex()==1){
                          p=fMoney*1110.25;
                     label3.setText("UGSh "+String.valueOf(p));}
                        if(Europe.getSelectedIndex()==5 && Africa.getSelectedIndex()==2){
                          p=fMoney*97.54;
                     label3.setText("Rand "+String.valueOf(p));}
                        if(Europe.getSelectedIndex()==5 && Africa.getSelectedIndex()==3){
                          p=fMoney*88.25;
                     label3.setText("Dir "+String.valueOf(p));}
                        if(Europe.getSelectedIndex()==5 && Africa.getSelectedIndex()==4){
                          p=fMoney*95.75;
                     label3.setText("Naira "+String.valueOf(p));}
                        if(Europe.getSelectedIndex()==5 && Africa.getSelectedIndex()==5){
                          p=fMoney*92.23;
                     label3.setText("cedi "+String.valueOf(p));}
                        if(Europe.getSelectedIndex()==5 && Africa.getSelectedIndex()==6){
                          p=fMoney*88.02;
                     label3.setText("Rupee "+String.valueOf(p));}
                        if(Europe.getSelectedIndex()==5 && Africa.getSelectedIndex()==7){ 
                            p=fMoney*94.59;
                     label3.setText("Rupee "+String.valueOf(p));}
                        if(Europe.getSelectedIndex()==5 && Africa.getSelectedIndex()==8){
                          p=fMoney*1012.39;
                     label3.setText("TZSh "+String.valueOf(p));}
                        if(Europe.getSelectedIndex()==5 && Africa.getSelectedIndex()==9){
                          p=fMoney*96.25;
                     label3.setText("Egyptian Pound "+String.valueOf(p));}
                        if(Europe.getSelectedIndex()==7 && Africa.getSelectedIndex()==0){  
                            p=fMoney*92.56;
                     label3.setText("KSH "+String.valueOf(p));}
                        if(Europe.getSelectedIndex()==7 && Africa.getSelectedIndex()==1){
                          p=fMoney*1050.25;
                     label3.setText("UGSH "+String.valueOf(p));}
                        if(Europe.getSelectedIndex()==7 && Africa.getSelectedIndex()==2){
                          p=fMoney*91.02;
                     label3.setText("Rand "+String.valueOf(p));
                        }
                        if(Europe.getSelectedIndex()==7 && Africa.getSelectedIndex()==3){
                         p=fMoney*76.63;
                     label3.setText("Dir "+String.valueOf(p));}
                        if(Europe.getSelectedIndex()==7 && Africa.getSelectedIndex()==4){
                          p=fMoney*90.02;
                     label3.setText("Naira "+String.valueOf(p));}
                        if(Europe.getSelectedIndex()==7 && Africa.getSelectedIndex()==5){
                          p=fMoney*91.00;
                     label3.setText("cedi "+String.valueOf(p));}
                        if(Europe.getSelectedIndex()==7 && Africa.getSelectedIndex()==6){
                          p=fMoney*78.25;
                     label3.setText("Rupee "+String.valueOf(p));}
                        if(Europe.getSelectedIndex()==7 && Africa.getSelectedIndex()==7){
                          p=fMoney*89.05;
                     label3.setText("Rupee "+String.valueOf(p));}
                        if(Europe.getSelectedIndex()==7 && Africa.getSelectedIndex()==8){
                          p=fMoney*1130.03;
                     label3.setText("TZSH "+String.valueOf(p));}
                        if(Europe.getSelectedIndex()==7 && Africa.getSelectedIndex()==9){
                          p=fMoney*76.52;
                     label3.setText("Egyptian Pound "+String.valueOf(p));}
                        if(Europe.getSelectedIndex()==8 && Africa.getSelectedIndex()==0){
                          p=fMoney*78.05;
                     label3.setText("KSH "+String.valueOf(p));}
                        if(Europe.getSelectedIndex()==8 && Africa.getSelectedIndex()==1){
                          p=fMoney*990.25;
                     label3.setText("UGSH "+String.valueOf(p));}
                        if(Europe.getSelectedIndex()==8 && Africa.getSelectedIndex()==2){
                          p=fMoney*77.02;
                     label3.setText("Rand "+String.valueOf(p));}
                        if(Europe.getSelectedIndex()==8 && Africa.getSelectedIndex()==3){
                          p=fMoney*76.93;
                     label3.setText("Dir "+String.valueOf(p));}
                        if(Europe.getSelectedIndex()==8 && Africa.getSelectedIndex()==4){
                          p=fMoney*100.25;
                     label3.setText("Naira "+String.valueOf(p));}
                        if(Europe.getSelectedIndex()==8 && Africa.getSelectedIndex()==5){
                          p=fMoney*75.23;
                     label3.setText("cedi "+String.valueOf(p));}
                        if(Europe.getSelectedIndex()==8 && Africa.getSelectedIndex()==6){
                          p=fMoney*72.56;
                     label3.setText("Rupee "+String.valueOf(p));}
                        if(Europe.getSelectedIndex()==8 && Africa.getSelectedIndex()==7){
                          p=fMoney*73.45;
                     label3.setText("Rupee "+String.valueOf(p));}
                        if(Europe.getSelectedIndex()==8 && Africa.getSelectedIndex()==8){
                          p=fMoney*600.25;
                     label3.setText("TZSH "+String.valueOf(p));}
                        if(Europe.getSelectedIndex()==8 && Africa.getSelectedIndex()==9){
                          p=fMoney*73.25;
                     label3.setText("Egyptian Pound "+String.valueOf(p));}
                        if(Europe.getSelectedIndex()==9 && Africa.getSelectedIndex()==0){
                          p=fMoney*105.25;
                     label3.setText("KSH "+String.valueOf(p));}
                        if(Europe.getSelectedIndex()==9 && Africa.getSelectedIndex()==1){
                          p=fMoney*105.25;
                     label3.setText("UGSH "+String.valueOf(p));}
                        if(Europe.getSelectedIndex()==9 && Africa.getSelectedIndex()==2){
                          p=fMoney*1050.31;
                     label3.setText("Rand "+String.valueOf(p));}
                        if(Europe.getSelectedIndex()==9 && Africa.getSelectedIndex()==3){
                          p=fMoney*99.35;
                     label3.setText("Dir "+String.valueOf(p));}
                         if(Europe.getSelectedIndex()==9 && Africa.getSelectedIndex()==4){
                           p=fMoney*88.24;
                     label3.setText("Naira "+String.valueOf(p));}
                          if(Europe.getSelectedIndex()==9 && Africa.getSelectedIndex()==5){
                            p=fMoney*97.54;
                     label3.setText("cedi "+String.valueOf(p));}
                           if(Europe.getSelectedIndex()==9 && Africa.getSelectedIndex()==6){
                             p=fMoney*98.75;
                     label3.setText("Rupee "+String.valueOf(p));}
                            if(Europe.getSelectedIndex()==9 && Africa.getSelectedIndex()==7){
                              p=fMoney*92.12;
                     label3.setText("Rupee "+String.valueOf(p));}
                             if(Europe.getSelectedIndex()==9 && Africa.getSelectedIndex()==8){
                               p=fMoney*1027.34;
                     label3.setText("TZSH "+String.valueOf(p));}
                              if(Europe.getSelectedIndex()==9 && Africa.getSelectedIndex()==9){
                                p=fMoney*98.25;
                     label3.setText("Egyptian Pound "+String.valueOf(p));}
                                                            
                        


        }
    }}}



//        @Override
//         
//             label.setText( pesa[Europe.getSelectedIndex()]);
//              label2.setText( money[Africa.getSelectedIndex()]);
//               
//           
//        }
//    }

                    

//    private class ButtonHandler implements ActionListener{
//money[Africa.getSelectedIndex()]=="Kenya"
//        public ButtonHandler() {
//        }
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//        }
  //  }

