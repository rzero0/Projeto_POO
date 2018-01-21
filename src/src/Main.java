/* Recebe os valores finais e manda para o usuário */

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

public class Main extends JFrame {

	private static final long serialVersionUID = 4648172894076113183L;
	public Main() {
	super ("Sistema de monitoramento de reservatorios de água");
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		
		
		Container c2 = new JPanel();
		c2.setLayout(new GridLayout(4, 1));
		
		c2.add(new	JButton("bleeee"));
		c2.add(new	JButton("bleeee"));
		c2.add(new	JButton("bleeee"));
		c2.add(new	JButton("bleeee"));
	
		c.add(BorderLayout.CENTER, new JButton("bleeee"));
		c.add(BorderLayout.EAST, c2);
		
	
		JFrame frame = new JFrame();
		setSize(700, 700);
		setVisible(true);
	}
	public static void main(String [] args) {
		new Main();
		
	}
	
}
