package designpatterns.singleton.enumsingleton;

import designpatterns.singleton.enumsingleton.araba.*;
import designpatterns.singleton.enumsingleton.araba.*;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;

public class ArabaKayitFormuWithEnumSingletonDP {

	private JFrame frame;
	private JTextField txtKapi;
	private JTextField txtPencere;
	private JComboBox cmbMarka;
	private JComboBox cmbKasa;
	private int secilenMarkaId;
	private int secilenModelId;
	private int secilenKasaId;
	private JComboBox cmbModel;
	private JTable table;
	private JTextField txtFiyat;
	private DefaultTableModel tableModel;

	private DatabaseSingletonEnum dbEnum;
	private Connection connection;
	private Statement statement;
	private static ResultSet resultSet;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArabaKayitFormuWithEnumSingletonDP window = new ArabaKayitFormuWithEnumSingletonDP();
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
	public ArabaKayitFormuWithEnumSingletonDP() {
		dbEnum = DatabaseSingletonEnum.INSTANCE;
		connection = dbEnum.getConnection();
		statement = dbEnum.getStatement();
		initialize();
		markaGetir();
		kasaGetir();
		arabalariGetir();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblMarka = new JLabel("Marka : ");
		lblMarka.setBounds(90, 33, 75, 14);
		frame.getContentPane().add(lblMarka);

		cmbMarka = new JComboBox();
		cmbMarka.setBounds(175, 29, 139, 22);
		cmbMarka.addActionListener(e -> {
			JComboBox c = (JComboBox) e.getSource();
			ComboItem comboItem = (ComboItem) c.getSelectedItem();

			if (comboItem != null) {
				secilenMarkaId = comboItem.getId();
				if (comboItem.getId() > 0) {
					modelGetir(secilenMarkaId);
				}
			}

		});
		frame.getContentPane().add(cmbMarka);

		JLabel lblModel = new JLabel("Model : ");
		lblModel.setBounds(90, 88, 71, 14);
		frame.getContentPane().add(lblModel);

		cmbModel = new JComboBox();
		cmbModel.setModel(new DefaultComboBoxModel(new String[] { "Model Seçiniz" }));
		cmbModel.setBounds(175, 84, 139, 22);
		cmbModel.addActionListener(e -> {
			JComboBox c = (JComboBox) e.getSource();
			ComboItem comboItem = (ComboItem) c.getSelectedItem();
			if (comboItem != null) {
				secilenModelId = comboItem.getId();
			}
		});
		frame.getContentPane().add(cmbModel);

		JLabel lblKasa = new JLabel("Kasa : ");
		lblKasa.setBounds(87, 151, 46, 14);
		frame.getContentPane().add(lblKasa);

		cmbKasa = new JComboBox();
		cmbKasa.setBounds(175, 147, 139, 22);
		cmbKasa.addActionListener(e -> {
			JComboBox c = (JComboBox) e.getSource();
			ComboItem comboItem = (ComboItem) c.getSelectedItem();
			if (comboItem != null) {
				secilenKasaId = comboItem.getId();
			}
		});
		frame.getContentPane().add(cmbKasa);

		JLabel lblKapi = new JLabel("Kapı : ");
		lblKapi.setBounds(87, 213, 46, 14);
		frame.getContentPane().add(lblKapi);

		txtKapi = new JTextField();
		txtKapi.setBounds(176, 210, 138, 20);
		frame.getContentPane().add(txtKapi);
		txtKapi.setColumns(10);
		txtKapi.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtKapi.getText().length() >= 1) // limit to 4 characters
					e.consume();
			}
		});

		txtKapi.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

					e.consume();
				}
			}
		});

		JLabel lblPencere = new JLabel("Pencere : ");
		lblPencere.setBounds(87, 268, 78, 14);
		frame.getContentPane().add(lblPencere);

		txtPencere = new JTextField();
		txtPencere.setBounds(179, 265, 135, 20);
		frame.getContentPane().add(txtPencere);
		txtPencere.setColumns(10);

		txtPencere.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtPencere.getText().length() >= 1) // limit to 4 characters
					e.consume();
			}
		});

		txtPencere.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

					e.consume();
				}
			}
		});

		JButton btnKaydet = new JButton("KAYDET");
		btnKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (cmbMarka.getSelectedItem().toString() == "Marka Seçiniz") {
					JOptionPane.showMessageDialog(null, "Lütfen Marka Seçiniz", "Bilgi", JOptionPane.ERROR_MESSAGE);
				} else if (cmbModel.getSelectedItem().toString() == "Model Seçiniz") {
					JOptionPane.showMessageDialog(null, "Lütfen Model Seçiniz", "Bilgi", JOptionPane.ERROR_MESSAGE);
				} else if (cmbKasa.getSelectedItem().toString() == "Kasa Seçiniz") {
					JOptionPane.showMessageDialog(null, "Lütfen Kasa Seçiniz", "Bilgi", JOptionPane.ERROR_MESSAGE);
				} else if (txtKapi.getText().trim().length() == 0) {
					JOptionPane.showMessageDialog(null, "Lütfen Kapı Sayısı Yazınız", "Bilgi",
							JOptionPane.ERROR_MESSAGE);
				} else if (txtPencere.getText().trim().length() == 0) {
					JOptionPane.showMessageDialog(null, "Lütfen Pencere Sayısı Yazınız", "Bilgi",
							JOptionPane.ERROR_MESSAGE);
				} else if (txtFiyat.getText().trim().length() == 0) {
					JOptionPane.showMessageDialog(null, "Lütfen Fiyat Yazınız", "Bilgi", JOptionPane.ERROR_MESSAGE);
				} else {
					try {
						PreparedStatement prStmt = connection.prepareStatement(
								"insert into araba (markaid,modelid,kapisayisi,penceresayisi,fiyat,kasaid)"
										+ " values(?,?,?,?,?,?)");
						prStmt.setInt(1, secilenMarkaId);
						prStmt.setInt(2, secilenModelId);
						prStmt.setInt(3, Integer.valueOf(txtKapi.getText()));
						prStmt.setInt(4, Integer.valueOf(txtPencere.getText()));
						prStmt.setDouble(5, Double.valueOf(txtFiyat.getText().replaceAll(",", "")));
						prStmt.setInt(6, secilenKasaId);
						int etkilenenKayitSayisi = prStmt.executeUpdate();
						if (etkilenenKayitSayisi > 0) {
							JOptionPane.showMessageDialog(null, "Kayıt Başarılı", "Bilgi",
									JOptionPane.INFORMATION_MESSAGE);
							arabalariGetir();
						} else {
							JOptionPane.showMessageDialog(null, "Kayıt Başarısız", "Bilgi", JOptionPane.ERROR_MESSAGE);
						}
                        prStmt.close();
						dbEnum.closeConnection();

					} catch (Exception ex) {
						System.out.println("hata : " + ex.getMessage().toString());
					}
				}

			}
		});
		btnKaydet.setBounds(179, 373, 135, 31);
		frame.getContentPane().add(btnKaydet);

		JLabel lblSonuc = new JLabel("Sonuç : ");
		lblSonuc.setBounds(62, 415, 349, 14);
		frame.getContentPane().add(lblSonuc);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(62, 460, 406, 117);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setRowHeaderView(table);
		scrollPane.setViewportView(table);

		JLabel lblFiyat = new JLabel("Fiyat : ");
		lblFiyat.setBounds(90, 318, 46, 14);
		frame.getContentPane().add(lblFiyat);

		txtFiyat = new JTextField();
		txtFiyat.setBounds(175, 315, 139, 20);
		frame.getContentPane().add(txtFiyat);
		txtFiyat.setColumns(10);

		txtFiyat.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtFiyat.getText().length() >= 15) // limit to 4 characters
					e.consume();
			}
		});

		txtFiyat.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {

					e.consume();
				}
			}
		}

		);

		txtFiyat.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					DecimalFormat df = new DecimalFormat("#,###");
					txtFiyat.setText(df.format(df.parse(txtFiyat.getText())));
				} catch (ParseException ex) {
					ex.printStackTrace();
				}
			}
		});

		frame.setVisible(true);
	}

	@SuppressWarnings({ "unchecked", "unchecked" })
	public void markaGetir() {

		try {

			String sorgu = "select * from marka";
			resultSet = statement.executeQuery(sorgu);
			cmbMarka.addItem(new ComboItem(-1, "Marka Seçiniz"));
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String markaadi = resultSet.getString("markaadi");
				cmbMarka.addItem(new ComboItem(id, markaadi));
			}

		} catch (Exception ex) {
			System.out.println("Hata : " + ex.getMessage().toString());
		}

	}

	public void kasaGetir() {

		try {

			String sorgu = "select * from kasa";
			resultSet = statement.executeQuery(sorgu);
			cmbKasa.addItem(new ComboItem(-1, "Kasa Seçiniz"));
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String kasatipi = resultSet.getString("kasatipi");
				cmbKasa.addItem(new ComboItem(id, kasatipi));
			}

		} catch (Exception ex) {
			System.out.println("Hata : " + ex.getMessage().toString());
		}
	}

	public void modelGetir(int markaId) {
		try {

			String sorgu = "select * from model where markaid=" + markaId;
			resultSet = statement.executeQuery(sorgu);
			cmbModel.removeAllItems();
			cmbModel.addItem(new ComboItem(-1, "Model Seçiniz"));
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String kasatipi = resultSet.getString("modeladi");
				cmbModel.addItem(new ComboItem(id, kasatipi));
			}

		} catch (Exception ex) {
			System.out.println("Hata : " + ex.getMessage().toString());
		}
	}

	public void arabalariGetir() {
		ArrayList<YeniAraba> yeniArabaListesi = new ArrayList<YeniAraba>();
		try {

			String sorgu = "select a.Id,ma.markaadi,mo.modeladi,a.kapisayisi,a.penceresayisi,a.fiyat,k.kasatipi"
					+ " from araba as a" + " inner join marka as ma" + " on ma.id = a.markaid "
					+ " inner join model as mo" + " on mo.id = a.modelid " + " inner join kasa as k "
					+ " on k.id = a.kasaid " + " order by a.Id desc";
			resultSet = statement.executeQuery(sorgu);
			while (resultSet.next()) {
				int id = Integer.valueOf(resultSet.getString("id"));
				double fiyat = Double.valueOf(resultSet.getString("fiyat"));

				Marka marka = new Marka(resultSet.getString("markaadi"));
				Model model = new Model(resultSet.getString("modeladi"));
				Kapi kapi = new Kapi(Integer.valueOf(resultSet.getString("kapisayisi")));
				Pencere pencere = new Pencere(Integer.valueOf(resultSet.getString("penceresayisi")));
				Kasa kasa = new Kasa(marka, model, kapi, pencere, resultSet.getString("kasatipi"));
				YeniAraba yeniAraba = new YeniAraba(id, kasa, fiyat);
				yeniArabaListesi.add(yeniAraba);
			}
			tableModel = new DefaultTableModel();

			Object[] kolonIsimleri = new Object[7];
			kolonIsimleri[0] = "Id";
			kolonIsimleri[1] = "Marka Adı";
			kolonIsimleri[2] = "Modeli";
			kolonIsimleri[3] = "Kapı";
			kolonIsimleri[4] = "Pencere";
			kolonIsimleri[5] = "Fiyat";
			kolonIsimleri[6] = "Kasa";
			tableModel.setColumnIdentifiers(kolonIsimleri);

			Object[] satir = new Object[7];
			for (int i = 0; i < yeniArabaListesi.size(); i++) {
				satir[0] = yeniArabaListesi.get(i).id;
				satir[1] = yeniArabaListesi.get(i).kasa.marka.markasi;
				satir[2] = yeniArabaListesi.get(i).kasa.model.modeli;
				satir[3] = yeniArabaListesi.get(i).kasa.kapi.kapiSayisi;
				satir[4] = yeniArabaListesi.get(i).kasa.pencere.pencereSayisi;
				satir[5] = yeniArabaListesi.get(i).fiyat;
				satir[6] = yeniArabaListesi.get(i).kasa.kasaTipi;
				tableModel.addRow(satir);

			}
			table.setModel(tableModel);

		} catch (Exception ex) {
			System.out.println("Hata oluştu : " + ex.getMessage().toString());
		}
	}

}
