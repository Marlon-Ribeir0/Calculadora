package br.com.Calculadora.View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.Calculadora.Prog.Calculadora;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.datatransfer.StringSelection;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	Calculadora calculo = new Calculadora();

	String operacao;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraView frame = new CalculadoraView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculadoraView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 414, 777);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel jLabelTexto = new JLabel("");
		jLabelTexto.setForeground(Color.WHITE);
		jLabelTexto.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		jLabelTexto.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		jLabelTexto.setBackground(Color.WHITE);
		jLabelTexto.setFont(new Font("Arial", Font.PLAIN, 62));
		jLabelTexto.setBounds(26, 83, 350, 67);
		contentPane.add(jLabelTexto);

		JButton jButton0 = new JButton("");
		jButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				jLabelTexto.setText(jLabelTexto.getText() + "0");
				;

			}
		});
		jButton0.setBorder(null);
		jButton0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jButton0.setContentAreaFilled(false);
		jButton0.setBounds(10, 644, 85, 86);
		contentPane.add(jButton0);

		JButton jButton1 = new JButton("");
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				jLabelTexto.setText(jLabelTexto.getText() + "1");
				;

			}
		});
		jButton1.setBorder(null);
		jButton1.setContentAreaFilled(false);
		jButton1.setBounds(10, 540, 93, 86);
		contentPane.add(jButton1);

		JButton jButton2 = new JButton("");
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				jLabelTexto.setText(jLabelTexto.getText() + "2");
				;

			}
		});
		jButton2.setBorder(null);
		jButton2.setContentAreaFilled(false);
		jButton2.setBounds(107, 540, 93, 86);
		contentPane.add(jButton2);

		JButton jButton3 = new JButton("");
		jButton3.setBorder(null);
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				jLabelTexto.setText(jLabelTexto.getText() + "3");
				;

			}
		});
		jButton3.setContentAreaFilled(false);
		jButton3.setBounds(207, 540, 93, 86);
		contentPane.add(jButton3);

		JButton jButton4 = new JButton("");
		jButton4.setBorder(null);
		jButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				jLabelTexto.setText(jLabelTexto.getText() + "4");
				;

			}
		});
		jButton4.setContentAreaFilled(false);
		jButton4.setBounds(10, 431, 93, 99);
		contentPane.add(jButton4);

		JButton jButton5 = new JButton("");
		jButton5.setBorder(null);
		jButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				jLabelTexto.setText(jLabelTexto.getText() + "5");
				;

			}
		});
		jButton5.setContentAreaFilled(false);
		jButton5.setBounds(107, 431, 93, 91);
		contentPane.add(jButton5);

		JButton jButton6 = new JButton("");
		jButton6.setBorder(null);
		jButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				jLabelTexto.setText(jLabelTexto.getText() + "6");
				;

			}
		});
		jButton6.setContentAreaFilled(false);
		jButton6.setBounds(207, 431, 93, 91);
		contentPane.add(jButton6);

		JButton jButton7 = new JButton("");
		jButton7.setBorder(null);
		jButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				jLabelTexto.setText(jLabelTexto.getText() + "7");
				;
			}
		});
		jButton7.setContentAreaFilled(false);
		jButton7.setBounds(10, 330, 93, 86);
		contentPane.add(jButton7);

		JButton jButton8 = new JButton("");
		jButton8.setBorder(null);
		jButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				jLabelTexto.setText(jLabelTexto.getText() + "8");
				;

			}
		});
		jButton8.setContentAreaFilled(false);
		jButton8.setBounds(107, 330, 93, 86);
		contentPane.add(jButton8);

		JButton jButton9 = new JButton("");
		jButton9.setBorder(null);
		jButton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				jLabelTexto.setText(jLabelTexto.getText() + "9");
				;
			}
		});
		jButton9.setContentAreaFilled(false);
		jButton9.setBounds(207, 330, 93, 86);
		contentPane.add(jButton9);

		JButton jButtonSubtracao = new JButton("");
		jButtonSubtracao.setBorder(null);
		jButtonSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				calculo.setValor1(Double.parseDouble(jLabelTexto.getText()));
				operacao = "Subtracao";
				jLabelTexto.setText("");

			}
		});
		jButtonSubtracao.setContentAreaFilled(false);
		jButtonSubtracao.setBounds(305, 330, 85, 86);
		contentPane.add(jButtonSubtracao);

		JButton jButtonAdicao = new JButton("");
		jButtonAdicao.setBorder(null);
		jButtonAdicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				calculo.setValor1(Double.parseDouble(jLabelTexto.getText()));
				jLabelTexto.setText("");
				operacao = "Adicao";

			}
		});
		jButtonAdicao.setContentAreaFilled(false);
		jButtonAdicao.setBounds(302, 431, 88, 86);
		contentPane.add(jButtonAdicao);

		JButton jButtonMultiplicacao = new JButton("");
		jButtonMultiplicacao.setBorder(null);
		jButtonMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				calculo.setValor1(Double.parseDouble(jLabelTexto.getText()));
				operacao = "Multiplicacao";
				jLabelTexto.setText("");

			}
		});
		jButtonMultiplicacao.setContentAreaFilled(false);
		jButtonMultiplicacao.setBounds(305, 218, 85, 91);
		contentPane.add(jButtonMultiplicacao);

		JButton jButtonDivisao = new JButton("");
		jButtonDivisao.setBorder(null);
		jButtonDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				calculo.setValor1(Double.parseDouble(jLabelTexto.getText()));
				operacao = "Divisao";
				jLabelTexto.setText("");

			}
		});
		jButtonDivisao.setContentAreaFilled(false);
		jButtonDivisao.setBounds(207, 218, 93, 91);
		contentPane.add(jButtonDivisao);

		JButton jButtonPorcento = new JButton("");
		jButtonPorcento.setBorder(null);
		jButtonPorcento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculo.setValor1(Double.parseDouble(jLabelTexto.getText()));
				calculo.Porcento();
				jLabelTexto.setText(String.valueOf(calculo.getResultado()));

			}
		});
		jButtonPorcento.setContentAreaFilled(false);
		jButtonPorcento.setBounds(107, 218, 93, 91);
		contentPane.add(jButtonPorcento);

		JButton jButtonLimpa = new JButton("");
		jButtonLimpa.setBorder(null);
		jButtonLimpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				calculo.setValor1(0);
				calculo.setValor2(0);
				operacao = "";
				jLabelTexto.setText("");

			}
		});
		jButtonLimpa.setContentAreaFilled(false);
		jButtonLimpa.setBounds(10, 218, 93, 91);
		contentPane.add(jButtonLimpa);

		JButton jButtonPonto = new JButton("");
		jButtonPonto.setBorder(null);
		jButtonPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				jLabelTexto.setText(jLabelTexto.getText() + ".");
				;
			}
		});
		jButtonPonto.setContentAreaFilled(false);
		jButtonPonto.setBounds(105, 644, 95, 86);
		contentPane.add(jButtonPonto);

		JButton jButtonApagar = new JButton("");
		jButtonApagar.setBorder(null);
		jButtonApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jLabelTexto.setText(jLabelTexto.getText().substring(0, jLabelTexto.getText().length() - 1));

			}
		});
		jButtonApagar.setContentAreaFilled(false);
		jButtonApagar.setBounds(207, 644, 93, 86);
		contentPane.add(jButtonApagar);

		JButton jButtonResultado = new JButton("");
		jButtonResultado.setBorder(null);
		jButtonResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculo.setValor2(Double.parseDouble(jLabelTexto.getText()));
				if (operacao == "Adicao") {
					calculo.Somar();
					jLabelTexto.setText(String.valueOf(calculo.getResultado()));
					operacao = "";
				}

				if (operacao == "Subtracao") {

					calculo.Subtrair();
					jLabelTexto.setText(String.valueOf(calculo.getResultado()));
					operacao = "";
				}

				if (operacao == "Divisao") {

					calculo.Divisao();
					jLabelTexto.setText(String.valueOf(calculo.getResultado()));
					operacao = "";
				}

				if (operacao == "Multiplicacao") {

					calculo.Multiplicar();
					jLabelTexto.setText(String.valueOf(calculo.getResultado()));
					operacao = "";
				}

				if (operacao == "Porcento") {

					calculo.Multiplicar();
					jLabelTexto.setText(String.valueOf(calculo.getResultado()));
					operacao = "";
				}

			}
		});
		jButtonResultado.setContentAreaFilled(false);
		jButtonResultado.setBounds(305, 540, 85, 190);
		contentPane.add(jButtonResultado);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 407, 743);
		lblNewLabel.setIcon(new ImageIcon(CalculadoraView.class.getResource("/calc/CalculadoraFOTO.png")));
		contentPane.add(lblNewLabel);
	}
}
