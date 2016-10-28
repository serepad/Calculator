import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calculator extends JFrame {
		
	Calculator(){
		setTitle("Calculator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton button0 = new JButton("0");
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		
		
		JButton buttonPoint = new JButton(".");
		JButton buttonEqual = new JButton("=");
		JButton	buttonPlus = new JButton("+");
		JButton	buttonMinus = new JButton("-");
		JButton	buttonMultiply = new JButton("*");
		JButton	buttonDivide = new JButton("/");
		
		JTextField display = new JTextField(30);
		
		JPanel text = new JPanel();
			text.add(display);
			
		JPanel num = new JPanel();
			num.setLayout(new GridLayout(4,3));
			num.add(button1);
			num.add(button2);
			num.add(button3);
			num.add(button4);
			num.add(button5);
			num.add(button6);
			num.add(button7);
			num.add(button8);
			num.add(button9);
			num.add(button0);
			num.add(buttonPoint);
			num.add(buttonEqual);
		
		JPanel operations = new JPanel();
			operations.setLayout(new GridLayout(4,1));
			operations.add(buttonPlus);
			operations.add(buttonMinus);
			operations.add(buttonMultiply);
			operations.add(buttonDivide);
			
		setLayout(new BorderLayout());
		add(text, BorderLayout.NORTH);
		add(num, BorderLayout.CENTER);
		add(operations, BorderLayout.EAST);
		pack();
		setResizable(false);
		setVisible(true);
		
	}
	
	public static void main(String args[]) {
		new Calculator();
	}
}