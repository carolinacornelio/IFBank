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
import java.awt.Toolkit;

public class Inicial extends JFrame {

	private static final long serialVersionUID = 1L;
	public static Banco ifbank = new Banco();
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicial frame = new Inicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Inicial() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Inicial.class.getResource("/img/cifrao.png")));
		//Banco ifbank = new Banco();
		setTitle("BANCO");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel chamar = new JLabel("");
		chamar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, ifbank.chamarProximo());
			}
		});
		chamar.setIcon(new ImageIcon(Inicial.class.getResource("/img/Chamar - bnt.png")));
		chamar.setBounds(467, 476, 260, 64);
		contentPane.add(chamar);
		
		JLabel retirar = new JLabel("");
		retirar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				Opcoes opcoes = new Opcoes();
				opcoes.setVisible(true);
			}
		});
		retirar.setIcon(new ImageIcon(Inicial.class.getResource("/img/Retirar - bnt.png")));
		retirar.setBounds(138, 476, 260, 64);
		contentPane.add(retirar);
		
		JLabel sair = new JLabel("");
		sair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		sair.setIcon(new ImageIcon(Inicial.class.getResource("/img/Sair - bnt.png")));
		sair.setBounds(315, 557, 260, 64);
		contentPane.add(sair);
		
		JLabel fundo = new JLabel("");
		fundo.setIcon(new ImageIcon(Inicial.class.getResource("/img/Tamanho correto - BANCO.png")));
		fundo.setBounds(0, 0, 1200, 680);
		contentPane.add(fundo);
	}
}