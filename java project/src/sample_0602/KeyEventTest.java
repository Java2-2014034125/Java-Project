package sample_0602;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KeyEventTest extends JFrame implements KeyListener{

	private JPanel panel;
	private JTextField field;



public KeyEventTest(){
	panel = new JPanel(new GridLayout(0,2));
	panel.add(new JLabel("문자를 입력하시오:"));
	field = new JTextField(10);
	panel.add(field);
	add(panel,BorderLayout.NORTH);


	field.addKeyListener(this);
	setTitle("KEYEVENTTEST");
	setSize(400,200);
	setVisible(true);
}

public static void main(String[] args){
	new KeyEventTest();
}

public void keyTyped(KeyEvent e){
	display(e, "Key Typed              ");
}
public void keyPressed(KeyEvent e){
	display(e, "Key Typed              ");
}

public void keyReleased(KeyEvent e){
	display(e, "Key Typed              ");
}

protected void display(KeyEvent e, String s){
	char c = e.getKeyChar();
	int keyCode = e.getKeyCode();
	String modifiers =  "Alt" + e.isAltDown() + "Ctrl: "+ e.isControlDown() + "Shift: " + e.isShiftDown();
}
}
