package banco;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Opcoes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Opcoes frame = new Opcoes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Opcoes() {
		// Banco ifbank = new Banco();
		Banco ifbank2 = Inicial.ifbank;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel preferencial = new JLabel("");
		preferencial.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//banco = Inicial.ifbank
				String ficha = ifbank2 .retirarFicha(1);
				JOptionPane.showMessageDialog(null, ficha);
			}
		});
		preferencial.setIcon(new ImageIcon(Opcoes.class.getResource("/img/pref - bnt.png")));
		preferencial.setBounds(467, 438, 260, 64);
		contentPane.add(preferencial);
		
		JLabel comum = new JLabel("");
		comum.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String ficha = ifbank2.retirarFicha(2);
				JOptionPane.showMessageDialog(null, ficha);
			}
		});
		comum.setIcon(new ImageIcon(Opcoes.class.getResource("/img/comum - bnt.png")));
		comum.setBounds(137, 438, 260, 64);
		contentPane.add(comum);
		
		JLabel voltar = new JLabel("");
		voltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				Inicial inicial = new Inicial();
				inicial.setVisible(true);
			}
		});
		voltar.setIcon(new ImageIcon(Opcoes.class.getResource("/img/voltar2.png")));
		voltar.setBounds(-84, 511, 202, 162);
		contentPane.add(voltar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Opcoes.class.getResource("/img/tela opcoes.png")));
		lblNewLabel.setBounds(0, -14, 1200, 680);
		contentPane.add(lblNewLabel);
	}
}
