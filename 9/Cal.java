package homework9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.;

public class Cal extends JFrame {


   private JPanel contentPane;
   private JTextField txtQuarter;
   private JTextField txtDime;
   private JTextField txtNickel;
   private JTextField txtPenny;
   private JTextField txtHalfDollar;
   private JTextField txtDollar;
   private JTextField textOut;

   double Nickel = 5;
   double Quarter = 25;
   double Dime = 10;
   double Penny = 1;
   double HalfDollar = 50;
   double Dollar = 100;
   private final Action action = new SwingAction();

  
   public static void main(String[] args) {
       EventQueue.invokeLater(new Runnable() {
           public void run() {
               try {
            	   Cal frame = new Cal();
                   frame.setVisible(true);
                  
               } catch (Exception e) {
                   e.printStackTrace();}}});}

   public Cal() {
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setBounds(60, 60, 388, 470);
       contentPane = new JPanel();
       contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
       setContentPane(contentPane);
       contentPane.setLayout(null);
       contentPane.setBackground(Color.YELLOW);
      

       JLabel lblCurrencyCalculator = new JLabel(CURRENCY CALCULATOR);
       lblCurrencyCalculator.setBounds(128, 38, 264, 20);
       contentPane.add(lblCurrencyCalculator);
       lblCurrencyCalculator.setForeground(Color.BLUE);

       JLabel lblQuarter = new JLabel(Quarter(.25));
       lblQuarter.setBounds(40, 80, 70, 20);
       contentPane.add(lblQuarter);
       lblQuarter.setForeground(Color.BLUE);

       JLabel lblDime = new JLabel(Dime(.10));
       lblDime.setBounds(40, 120, 70, 20);
       contentPane.add(lblDime);
       lblDime.setForeground(Color.BLUE);

       JLabel lblNickel = new JLabel(Nickel(.05));
       lblNickel.setBounds(40, 160, 70, 20);
       contentPane.add(lblNickel);
       lblNickel.setForeground(Color.BLUE);

       JLabel lblPenny = new JLabel(Penny(.01));
       lblPenny.setBounds(40, 205, 70, 20);
       contentPane.add(lblPenny);
       lblPenny.setForeground(Color.BLUE);

       JLabel lblHalfdollar = new JLabel(Half-dollar(.50));
       lblHalfdollar.setBounds(40, 250, 90, 20);
       contentPane.add(lblHalfdollar);
       lblHalfdollar.setForeground(Color.BLUE);

       JLabel lblDollar = new JLabel(Dollar(1.00) );
       lblDollar.setBounds(40, 296, 70, 20);
       contentPane.add(lblDollar);
       lblDollar.setForeground(Color.BLUE);

       txtQuarter = new JTextField();
       txtQuarter.setBounds(140, 78, 100, 20);
       contentPane.add(txtQuarter);
       txtQuarter.setColumns(8);

       txtDime = new JTextField();
       txtDime.setBounds(140, 118, 100, 20);
       contentPane.add(txtDime);
       txtDime.setColumns(8);

       txtNickel = new JTextField();
       txtNickel.setBounds(138, 160, 100, 20);
       contentPane.add(txtNickel);
       txtNickel.setColumns(8);

       txtPenny = new JTextField();
       txtPenny.setBounds(140, 204, 100, 20);
       contentPane.add(txtPenny);
       txtPenny.setColumns(8);

       txtHalfDollar = new JTextField();
       txtHalfDollar.setBounds(140, 247, 100, 20);
       contentPane.add(txtHalfDollar);
       txtHalfDollar.setColumns(8);

       txtDollar = new JTextField();
       txtDollar.setBounds(140, 293, 100, 20);
       contentPane.add(txtDollar);
       txtDollar.setColumns(8);

       JButton btnCalculate = new JButton(CALCULATE);
       btnCalculate.setAction(action);
       btnCalculate.setBounds(112, 337, 169, 38);
       contentPane.add(btnCalculate);

       
       JLabel lblTotal = new JLabel(Total);
       lblTotal.setBounds(40, 390, 70, 20);
       contentPane.add(lblTotal);
       lblTotal.setForeground(Color.BLUE);
       
       textOut = new JTextField();
       textOut.setBounds(112, 386, 200, 41);
       contentPane.add(textOut);
       textOut.setColumns(8);
   }

   private class SwingAction extends AbstractAction {
       public SwingAction() {
           putValue(NAME, CALCULATE);
           putValue(SHORT_DESCRIPTION, Some short description);
       }

       public void actionPerformed(ActionEvent e) {

           try {
               if (Integer.parseInt(txtQuarter.getText().trim())  0  Integer.parseInt(txtDime.getText().trim())  0
                        Integer.parseInt(txtNickel.getText().trim())  0
                        Integer.parseInt(txtPenny.getText().trim())  0
                        Integer.parseInt(txtHalfDollar.getText().trim())  0
                        Integer.parseInt(txtDollar.getText().trim())  0) {
                   JOptionPane.showMessageDialog(null, You can not enter negative value);
               } else {
                   int totalQuater = (int) (Quarter  Integer.parseInt(txtQuarter.getText().trim()));
                   int totalDime = (int) (Dime  Integer.parseInt(txtDime.getText().trim()));
                   int totalNickel = (int) (Nickel  Integer.parseInt(txtNickel.getText().trim()));
                   int totalPenny = (int) (Penny  Integer.parseInt(txtPenny.getText().trim()));
                   int totalHalfDollar = (int) (HalfDollar  Integer.parseInt(txtHalfDollar.getText().trim()));
                   int totalDollar = (int) (Dollar  Integer.parseInt(txtDollar.getText().trim()));

                   int total = totalQuater + totalDime + totalNickel + totalPenny + totalHalfDollar + totalDollar;

                   int finalDollars = total  100;
                   int cents = total % 100;
                  
                   String output = Total  + finalDollars + $ and  + cents + cents.;
                   textOut.setText(output);

               }
           } catch (NumberFormatException e1) {
               JOptionPane.showMessageDialog(null, Enter only numbers);
           }
       }
   }
}