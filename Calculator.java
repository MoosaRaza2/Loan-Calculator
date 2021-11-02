
package quuestion2;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calculator extends JFrame implements ActionListener {
    
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JLabel l5;
    JLabel l6;
    JTextField t1;
      JTextField t2;
        JTextField t3;
          JTextField t4;
            JTextField t5;
            JPanel p1;
            JButton btn1;
            
            public Calculator(){
                
                p1=new JPanel();
                   p1.setBounds(0,0,600,600);
                p1.setLayout(null);
                
                l1=new JLabel("Loan Calculator");
                l1.setBounds(250, 20, 150, 100);
                l1.setFont(new Font("Times New Roman",Font.BOLD, 18));
                
                
                p1.add(l1);
                
                l2=new JLabel("Annual interest rate");
                l2.setBounds(120, 90, 190, 150);
                l2.setFont(new Font("Times New Roman",Font.BOLD, 18));
                
                t1=new JTextField();
                t1.setBounds(310, 150, 140, 30);
                p1.add(t1);
                p1.add(l2);
                
                l3=new JLabel("number of years");
                l3.setBounds(120, 130, 190, 150);
                l3.setFont(new Font("Times New Roman",Font.BOLD, 18));
                
                  t2=new JTextField();
                t2.setBounds(310, 190, 140, 30);
                p1.add(t2);
                p1.add(l3);
                  l4=new JLabel("loan amount");
                l4.setBounds(120, 170, 190, 150);
                l4.setFont(new Font("Times New Roman",Font.BOLD, 18));
                 t3=new JTextField();
                t3.setBounds(310, 230, 140, 30);
                p1.add(t3);
                p1.add(l4);
                 l5=new JLabel("monthly amount");
                l5.setBounds(120, 210, 190, 150);
                l5.setFont(new Font("Times New Roman",Font.BOLD, 18));
                 t4=new JTextField();
                t4.setBounds(310, 270, 140, 30);
                p1.add(t4);
                p1.add(l5);
                
                 l6=new JLabel("Total Amount");
                l6.setBounds(120, 250, 190, 150);
                l6.setFont(new Font("Times New Roman",Font.BOLD, 18));
                 t5=new JTextField();
                t5.setBounds(310, 310, 140, 30);
                p1.add(t5);
                p1.add(l6);
               
                
                btn1=new JButton("submit");
                btn1.setBounds(250, 370, 100, 40);
                btn1.addActionListener(this);
                p1.add(btn1);
                 add(p1);
                
            }

    @Override
    public void actionPerformed(ActionEvent ae) {
      if(ae.getSource()==btn1){
          if(t1.getText().equalsIgnoreCase("") || t2.getText().equalsIgnoreCase("") || t3.getText().equalsIgnoreCase("")){
              JOptionPane.showMessageDialog( null, "Missing input!!","Error",JOptionPane.ERROR_MESSAGE );
          }else
          {
              
          
          String AnnualRate=t1.getText();
          String noofYears=t2.getText();
          String loanAmount=t3.getText();
          
          double ar=Double.valueOf(AnnualRate);
          int noyears=Integer.parseInt(noofYears);
          int loan=Integer.parseInt(loanAmount);
          
          double monthlyrate=ar/(12*100);
          double monthlyPayment=  (loan*monthlyrate)/(1-Math.pow(1+monthlyrate, (-noyears*12)));
          String a=String.format("%.2f",monthlyPayment);
         
          t4.setText(a);
          double totalpayment=noyears*12*monthlyPayment;
         String b=String.format("%.2f",totalpayment);
          t5.setText(b);
          
          t4.setEditable(false);
          t5.setEditable(false);
          
          
      }
    }
    }
    
    
}
