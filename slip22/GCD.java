
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

  
public class NumberOpr extends Frame implements ActionListener
{
	JMenuBar mbar;
	JMenu m1,m2;
	JTextField T1,T2,T3;
	JMenuItem accept,exit,gcd,power;
public NumberOpr()
{
	JFrame f=new JFrame();
	mbar=new JMenuBar();
	m1=new JMenu("operation");
	  mbar.add(m1);
	m2=new JMenu("compute");
	  mbar.add(m2);
	accept=new JMenuItem("accept");
	     m1.add(accept);
	accept.addActionListener(this);
	exit=new JMenuItem("exit");
	     m1.add(exit);
	exit.addActionListener(this);
	gcd=new JMenuItem("gcd");
	     m2.add(gcd);
	gcd.addActionListener(this);
	power=new JMenuItem("power");
	    m2.add(power);
	power.addActionListener(this);
    JPanel p=new JPanel();
    p.setLayout(new GridLayout(2,1,10,10));   
    f.setJMenuBar(mbar);
      T1=new JTextField();
         p.add(T1);
         T2=new JTextField();
         p.add(T2);
         T3=new JTextField();
         p.add(T3);
         f.add(p);
      f.setSize(300,300);
     f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	                                                  
}	

public void actionPerformed(ActionEvent e)
{ int pw=1,a,n;
	String msg=e.getActionCommand();
	   if(msg.equals("gcd"))
	   {
	   	 a=Integer.parseInt(T1.getText());
	   	 n=Integer.parseInt(T2.getText());
	   	while(a!=n)
	   	{
	   		if(a<n)
	   			a-=n;
	   		else
	   			n-=a;
	   	}
	   	T3.setText(String.valueOf(a));		
	   }
	 	if(msg.equals("power"))
	 	{
	 		a=Integer.parseInt(T1.getText());
	        n=Integer.parseInt(T2.getText());
	   
	 		for(int i=1;i<=n;i++)
	 		{
	 			 pw*=a;
	 		}	
	 		T3.setText(String.valueOf(pw));
	 				
	 	}		
	 }
	 public static void main(String args[])
	 {
	 	new NumberOpr();
	  	
	 }  			   	
   }
    