package just3;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class BmiResult extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel resultLa=new JLabel(); 
	public BmiResult(double result) {
		super("Result");
		setSize(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		if(result<18.5) {
			resultLa.setText("저체중입니다.");
						}
		else if(result<23) {
			resultLa.setText("정상 체중입니다.");
		}
		else if(result<25) {
			resultLa.setText("과체중입니다.");
		}
		else if(result<30) {
			resultLa.setText("비만입니다.");
		}
		else {
			resultLa.setText("고도비만입니다.");
		}
		
		c.add(resultLa);
		
		
		setVisible(true);
	}
}


