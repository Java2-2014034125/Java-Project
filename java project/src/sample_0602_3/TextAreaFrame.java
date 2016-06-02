package sample_0602_3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaFrame extends JFrame implements ActionListener {
	protected JTextField textField;
	protected JTextArea textArea;
	
	public TextAreaFrame(){
		setTitle("Text Area Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField(30);
		textField.addActionListener(this);
		textArea = new JTextArea(10,30);
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		add(scrollPane,BorderLayout.CENTER);
		
		textArea.setEditable(false);
		
		add(textField, BorderLayout.NORTH);
		//add(textArea, BorderLayout.CENTER); 이걸 주석안하면 위에 scrollPane이랑 충돌,이미 스크롤 페인에 텍스트에어리어를 집어넣엇음
		
		pack();
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent evt){
		String text = textField.getText();
		textArea.append(text + "\n");
		textField.selectAll();
		textArea.setCaretPosition(textArea.getDocument().getLength());//커서때문에 만듬
	}
	public static void main (String[] args){
		new TextAreaFrame();
	}

}
