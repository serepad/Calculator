import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator {
	
// Объявляем элементы калькулятора.
JPanel windowContent;
JTextField displayField;
JButton button0;
JButton button1;
JButton button2;
JButton button3;
JButton button4;
JButton button5;
JButton button6;
JButton button7;
JButton button8;
JButton button9;
JButton buttonPoint;
JButton buttonEqual;
JPanel p1;
	
	Calculator() {
		
		windowContent = new JPanel();
		BorderLayout bl = new BorderLayout();
		windowContent.setLayout(bl);
		
		// Создаём и добавляем текстовое поле в Северную часть окна.
		displayField = new JTextField(30);
		windowContent.add("North", displayField);
		
		// Создаём кнопки.
		button0 = new JButton("0");
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		buttonPoint = new JButton(".");
		buttonEqual = new JButton("=");
		buttonPlus = new JButton("+");
		buttonMinus = new JButton("-");
		buttonMultiply = new JButton("*");
		buttonDivide = new JButton("/");
		
		// Создаём панель с GridLayout, которая содержит 12 кнопок.
		p1 = new JPanel();
		GridLayout gl = new GridLayout(4,3);
		p1.setLayout(gl);
		
		// Добавляем кнопки на панель p1.
		p1.add(button1);
		p1.add(button2);
		p1.add(button3);
		p1.add(button4);
		p1.add(button5);
		p1.add(button6);
		p1.add(button7);
		p1.add(button8);
		p1.add(button9);
		p1.add(button0);
		p1.add(buttonPoint);
		p1.add(buttonEqual);
		
		// Помещаем панель p1 в центр экрана.
		windowContent.add("Center", p1);
		
		// Создаём панель операций p2.
		p2 = new JPanel();
		BoxLayout bl = new BoxLayout();
		p2.SetLayout(bl);
		
		p2.add(buttonPlus);
		p2.add(buttonMinus);
		p2.add(buttonMultiply);
		p2.add(buttonDivide);
		
		windowContent.add("East", p2);
		
		//Создаём фрейм и задаём его основную панель.
		JFrame frame = new JFrame("Calculator");
		frame.setContentPane(windowContent);
		
		//делаем размер окна достаточным чтоб вместить все компоненты.
		frame.pack();
		
		// Показываем окно.
		frame.setVisible(true);		
	}
	
	public static void main(String[] args){
		
		Calculator calc = new Calculator();
	}
}