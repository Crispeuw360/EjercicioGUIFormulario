import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class VentanaFormulario extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel labelTitulo;
	private JLabel label1; 
	private JLabel label2;
	private JTextField textField1;
	private JTextField textField2;
	private JRadioButton botonProfesor;
	private JRadioButton botonAlumno;
	private JCheckBox boxCastellano;
	private JCheckBox boxEuskera;
	private JCheckBox boxIngles;
	private JButton botonEnviar;
	private JLabel LabelIdiomas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaFormulario frame = new VentanaFormulario();
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
	public VentanaFormulario() {
		setTitle("VentanaFormularios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		labelTitulo = new JLabel("CIFP ZORNOTZA LHII");
		labelTitulo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelTitulo.setForeground(Color.BLUE);
		labelTitulo.setBounds(85, 11, 281, 34);
		contentPane.add(labelTitulo);
		
		label1 = new JLabel("Nombre");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label1.setBounds(37, 70, 59, 19);
		contentPane.add(label1);
		
		label2 = new JLabel("Apellido");
		label2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label2.setBounds(37, 100, 59, 19);
		contentPane.add(label2);
		
		textField1 = new JTextField();
		textField1.setBounds(94, 69, 140, 20);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(94, 99, 140, 20);
		contentPane.add(textField2);
		
		botonProfesor = new JRadioButton("Profesor");
		botonProfesor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		botonProfesor.setBounds(298, 68, 109, 23);
		contentPane.add(botonProfesor);
		botonProfesor.addActionListener(this);
		
		botonAlumno = new JRadioButton("Alumno");
		botonAlumno.setFont(new Font("Tahoma", Font.PLAIN, 12));
		botonAlumno.setBounds(298, 98, 109, 23);
		contentPane.add(botonAlumno);
		botonAlumno.addActionListener(this);
		
		LabelIdiomas = new JLabel("Idiomas Que Conoces(Por Lo menos 2b)");
		LabelIdiomas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		LabelIdiomas.setBounds(37, 142, 366, 23);
		contentPane.add(LabelIdiomas);
		
		boxCastellano = new JCheckBox("Castellano");
		boxCastellano.setBounds(21, 189, 97, 23);
		contentPane.add(boxCastellano);
		boxCastellano.addActionListener(this);
		
		boxEuskera = new JCheckBox("Euskera");
		boxEuskera.setBounds(152, 189, 97, 23);
		contentPane.add(boxEuskera);
		boxEuskera.addActionListener(this);
		
		boxIngles = new JCheckBox("Ingles");
		boxIngles.setBounds(269, 189, 97, 23);
		contentPane.add(boxIngles);
		boxIngles.addActionListener(this);
		
		botonEnviar = new JButton("Enviar");
		botonEnviar.setBounds(105, 227, 89, 23);
		contentPane.add(botonEnviar);
		botonEnviar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String rol="";
		ArrayList<String> idiomas = new ArrayList<>();
		
		
		if(textField1.getText().equalsIgnoreCase("")||textField2.getText().equalsIgnoreCase(""))
		{
			JOptionPane.showMessageDialog(contentPane, "Error");
		}else
		{
			if(botonProfesor.isSelected())
			{
				rol ="Profesor";
			}else if(botonAlumno.isSelected())
			{
				rol ="Alumno";
			}
			if(boxCastellano.isSelected())
			{
				idiomas.add("Castellano");
			}
			if(boxEuskera.isSelected())
			{
				idiomas.add("Euskera");
			}if(boxIngles.isSelected())
			{
				idiomas.add("Ingles");
			}
			if(e.getSource()==botonEnviar)
			{
				JOptionPane.showMessageDialog(contentPane,idiomas.toString()+" son los idiomas que conoces" ,"Bienvenido "+rol+" "+textField1.getText()+" "+textField2.getText(),JOptionPane.INFORMATION_MESSAGE );
			}
			
		}
	}
}
