package Teste;

import javax.swing.JFrame;

public class Teste_panel {

	public static void meuFrame() {
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		meuFrame();
	}

}
