package javamodules.serilization;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.*;
import java.awt.event.ActionEvent;

public class SerilizationOrnek {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SerilizationOrnek window = new SerilizationOrnek();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SerilizationOrnek() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnDosyayaYaz = new JButton("Dosyaya Yaz");
		btnDosyayaYaz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

					Kullanici k = new Kullanici(1, "Ahmet", "Beşkazalıoğlu");
					FileOutputStream dosya = new FileOutputStream("/Users/anke/Downloads/Kraft/Deneme.xml");
					ObjectOutputStream yaz = new ObjectOutputStream(dosya);
					yaz.writeObject(k);
					yaz.close();
					dosya.close();
					System.out.println("Dosya oluşturuldu.");

				} catch (Exception e1) {

				}

			}
		});
		btnDosyayaYaz.setBounds(84, 408, 177, 29);
		frame.getContentPane().add(btnDosyayaYaz);

		JButton btnDosyadanOku = new JButton("Dosyadan Oku");
		btnDosyadanOku.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					
					FileInputStream dosya = new FileInputStream("/Users/anke/Downloads/Kraft/Deneme.xml");
					ObjectInputStream oku = new ObjectInputStream(dosya);
					Kullanici k = (Kullanici) oku.readObject();
					System.out.println(k.toString());
					oku.close();
					dosya.close();
					
				} catch (Exception e1) {
				}
			}
		});

		btnDosyadanOku.setBounds(435, 408, 164, 29);
		frame.getContentPane().add(btnDosyadanOku);
	}
}
