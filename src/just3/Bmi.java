package just3;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class Bmi extends JFrame{
	JLabel w_label,h_label,r_label;
	
	JTextField txt1,txt2;
	
	JButton ok_btn,cancel_btn;
	
	Scanner sc=new Scanner(System.in);
	int weight=0;
	int height=0;
	double height2=0;
	double result;
	

	
	public Bmi() {
	super("bmi 계산기");
	setSize(200,200);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c=getContentPane();
	setLocationRelativeTo(null);
	c.setLayout(new GridLayout(3,2,10,10));
	
	w_label=new JLabel("height(cm)");
	h_label=new JLabel("weight(kg)");
	
	ok_btn=new JButton("Check");
//	체중(kg) ÷ {신장(m) x 신장(m)} 
	
	ok_btn.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			height=Integer.parseInt(txt1.getText());
			height2=(double)height/100;
			weight=Integer.parseInt(txt2.getText());
			
			result=weight/(height2*height2);
			
			setVisible(false);
			new BmiResult(result);
			
		}
	});
	cancel_btn=new JButton("Cancel");
	cancel_btn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
			dispose();
		}
	});
	
	txt1=new JTextField(10);
	txt2=new JTextField(10);
	
	
	c.add(w_label);
	c.add(txt1);
	c.add(h_label);
	c.add(txt2);
	c.add(ok_btn);
	c.add(cancel_btn);
	
	
	
	setVisible(true);
	}
	public static void main(String[] args) {
		new Bmi();
	}
}


