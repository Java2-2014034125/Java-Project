package sample_0525_2;

import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame{
	private JButton button;
	private JLabel label;
	
	public MyFrame(){
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");
		JPanel panel = new JPanel();
		button = new JButton("��ư�� �����ÿ�");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�");
		button.addActionListener(new MyListener());
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);	
	}
	private class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if (e.getSource()==button){
				label.setText("��ħ�� ��ư�� ���������ϴ�.");
			}
		}
	}
}
public class ActionEventTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame t = new MyFrame();
	}

}
