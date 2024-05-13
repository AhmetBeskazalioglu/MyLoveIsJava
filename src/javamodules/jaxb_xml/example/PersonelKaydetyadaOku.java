package javamodules.jaxb_xml.example;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import designpatterns.singleton.enumsingleton.DatabaseSingletonEnum;
import org.apache.commons.io.FilenameUtils;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class PersonelKaydetyadaOku {

    private JFrame frame;
    private JTextField txtad;
    private JTextField txtsoyad;
    private JTextField txtyas;
    private JTextField txtulke;
    private JTextField txtmaas;
    private JTextField txtadres;
    private JTextField txtis;
    private DefaultTableModel tableModel;
    private JTable table_1;
    private JTextField txtsehir;
    private JTextField txtsirket;
    private JTextField txtdept;
    private JTextField txttel;
    private JTextField txtendustri;
    private JTextField txtbolum;
    private JTextField txtkampus;
    private JTextField txtyil;
    private static DatabaseSingletonEnum db;
    private static Connection connection;
    private static Statement statement;
    private JTextField txtokul;
    private JTextField textField;
    private static ResultSet resultSet;
    private static List<Personal> employees;
    private static PersonalListWrapper personalListWrapper;
    private static Personal personel;
    private static PersonalListWrapper unmarshalledPersonalListWrapper;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PersonelKaydetyadaOku window = new PersonelKaydetyadaOku();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     *
     * @throws SQLException
     */
    public PersonelKaydetyadaOku() throws SQLException {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 1500, 1200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());

        JLabel lblad = new JLabel("Ad:");
        lblad.setBounds(150, 59, 61, 16);
        frame.getContentPane().add(lblad);

        JLabel lblSoyad = new JLabel("Soyad:");
        lblSoyad.setBounds(574, 59, 61, 16);
        frame.getContentPane().add(lblSoyad);

        JLabel lblYas = new JLabel("Yaş:");
        lblYas.setBounds(1129, 59, 61, 16);
        frame.getContentPane().add(lblYas);

        JLabel lblSehir = new JLabel("Şehir:");
        lblSehir.setBounds(150, 114, 61, 16);
        frame.getContentPane().add(lblSehir);

        JLabel lblUlke = new JLabel("Ülke:");
        lblUlke.setBounds(574, 114, 61, 16);
        frame.getContentPane().add(lblUlke);

        JLabel lblMaas = new JLabel("Maaş:");
        lblMaas.setBounds(1129, 114, 61, 16);
        frame.getContentPane().add(lblMaas);

        JLabel lblJob = new JLabel("İş:");
        lblJob.setBounds(150, 253, 61, 16);
        frame.getContentPane().add(lblJob);

        txtad = new JTextField();
        txtad.setBounds(203, 54, 313, 26);
        frame.getContentPane().add(txtad);
        txtad.setColumns(10);

        txtsoyad = new JTextField();
        txtsoyad.setBounds(636, 54, 423, 26);
        frame.getContentPane().add(txtsoyad);
        txtsoyad.setColumns(10);

        txtyas = new JTextField();
        txtyas.setBounds(1225, 54, 130, 26);
        frame.getContentPane().add(txtyas);
        txtyas.setColumns(10);

        txtulke = new JTextField();
        txtulke.setBounds(638, 109, 421, 26);
        frame.getContentPane().add(txtulke);
        txtulke.setColumns(10);

        txtmaas = new JTextField();
        txtmaas.setBounds(1225, 109, 130, 26);
        frame.getContentPane().add(txtmaas);
        txtmaas.setColumns(10);

        txtadres = new JTextField();
        txtadres.setBounds(258, 361, 500, 26);
        frame.getContentPane().add(txtadres);
        txtadres.setColumns(10);

        JLabel lblDept = new JLabel("Departman");
        lblDept.setBounds(150, 292, 96, 16);
        frame.getContentPane().add(lblDept);

        JLabel lblCompany = new JLabel("Şirket İsmi:");
        lblCompany.setBounds(150, 325, 96, 16);
        frame.getContentPane().add(lblCompany);

        txtis = new JTextField();
        txtis.setBounds(258, 248, 500, 26);
        frame.getContentPane().add(txtis);
        txtis.setColumns(10);

        JLabel lblAddress = new JLabel("Şirket Adres:");
        lblAddress.setBounds(150, 366, 117, 16);
        frame.getContentPane().add(lblAddress);

        JLabel lblPhone = new JLabel("Şirket Tel:");
        lblPhone.setBounds(150, 413, 117, 16);
        frame.getContentPane().add(lblPhone);

        JLabel lblIndustry = new JLabel("Endüstri:");
        lblIndustry.setBounds(150, 461, 61, 16);
        frame.getContentPane().add(lblIndustry);

        JLabel lblSchool = new JLabel("Okul:");
        lblSchool.setBounds(150, 568, 61, 16);
        frame.getContentPane().add(lblSchool);

        JLabel lblCourse = new JLabel("Bölüm:");
        lblCourse.setBounds(150, 608, 61, 16);
        frame.getContentPane().add(lblCourse);

        JLabel lblCampus = new JLabel("Kampüs:");
        lblCampus.setBounds(150, 646, 61, 16);
        frame.getContentPane().add(lblCampus);

        JLabel lblYear = new JLabel("Mezuniyet Yılı:");
        lblYear.setBounds(150, 680, 130, 16);
        frame.getContentPane().add(lblYear);

        JButton btnNewButton = new JButton("Kayıt Ekle");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                connectToDatabase();
                kayitEkle();
                try {
                    closeConnection();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        btnNewButton.setBounds(1028, 253, 219, 171);
        frame.getContentPane().add(btnNewButton);

        JScrollPane scrollPane = new JScrollPane();
        frame.getContentPane().add(scrollPane, BorderLayout.SOUTH);

        table_1 = new JTable();
        scrollPane.setRowHeaderView(table_1);
        scrollPane.setViewportView(table_1);

        txtsehir = new JTextField();
        txtsehir.setColumns(10);
        txtsehir.setBounds(203, 109, 313, 26);
        frame.getContentPane().add(txtsehir);

        txtsirket = new JTextField();
        txtsirket.setColumns(10);
        txtsirket.setBounds(258, 320, 500, 26);
        frame.getContentPane().add(txtsirket);

        txtdept = new JTextField();
        txtdept.setColumns(10);
        txtdept.setBounds(258, 287, 500, 26);
        frame.getContentPane().add(txtdept);

        txttel = new JTextField();
        txttel.setColumns(10);
        txttel.setBounds(258, 408, 500, 26);
        frame.getContentPane().add(txttel);

        txtendustri = new JTextField();
        txtendustri.setColumns(10);
        txtendustri.setBounds(258, 456, 500, 26);
        frame.getContentPane().add(txtendustri);

        txtbolum = new JTextField();
        txtbolum.setColumns(10);
        txtbolum.setBounds(258, 603, 500, 26);
        frame.getContentPane().add(txtbolum);

        txtkampus = new JTextField();
        txtkampus.setColumns(10);
        txtkampus.setBounds(258, 641, 500, 26);
        frame.getContentPane().add(txtkampus);

        txtyil = new JTextField();
        txtyil.setColumns(10);
        txtyil.setBounds(258, 675, 145, 26);
        frame.getContentPane().add(txtyil);

        txtokul = new JTextField();
        txtokul.setColumns(10);
        txtokul.setBounds(258, 563, 500, 26);
        frame.getContentPane().add(txtokul);

        JButton btnBilgiiGetir = new JButton("Bilgi Getir");
        btnBilgiiGetir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                connectToDatabase();
                //bilgiGetirXML();
                bilgiGetirJSON();
                try {
                    closeConnection();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        btnBilgiiGetir.setBounds(1028, 491, 219, 171);
        frame.getContentPane().add(btnBilgiiGetir);

        textField = new JTextField();
        textField.setColumns(10);
        textField.setBounds(258, 525, 500, 26);
        frame.getContentPane().add(textField);

    }

    /**
     * Database e kayıt ekleme işlemi yapar.
     */
    public void kayitEkle() {
        if (txtad.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lütfen ad giriniz", "Hata", JOptionPane.ERROR_MESSAGE);
        } else if (txtsoyad.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lütfen soyad giriniz", "Hata", JOptionPane.ERROR_MESSAGE);
        } else if (txtyas.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lütfen yaş giriniz", "Hata", JOptionPane.ERROR_MESSAGE);
        } else if (txtulke.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lütfen ülke giriniz", "Hata", JOptionPane.ERROR_MESSAGE);
        } else if (txtmaas.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lütfen maaş giriniz", "Hata", JOptionPane.ERROR_MESSAGE);
        } else if (txtadres.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lütfen adres giriniz", "Hata", JOptionPane.ERROR_MESSAGE);
        } else if (txtis.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lütfen iş giriniz", "Hata", JOptionPane.ERROR_MESSAGE);
        } else if (txtsehir.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lütfen şehir giriniz", "Hata", JOptionPane.ERROR_MESSAGE);
        } else if (txtsirket.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lütfen şirket ismi giriniz", "Hata", JOptionPane.ERROR_MESSAGE);
        } else if (txtdept.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lütfen departman giriniz", "Hata", JOptionPane.ERROR_MESSAGE);
        } else if (txttel.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lütfen telefon giriniz", "Hata", JOptionPane.ERROR_MESSAGE);
        } else if (txtendustri.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lütfen endüstri giriniz", "Hata", JOptionPane.ERROR_MESSAGE);
        } else if (txtbolum.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lütfen bölüm giriniz", "Hata", JOptionPane.ERROR_MESSAGE);
        } else if (txtkampus.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lütfen kampüs giriniz", "Hata", JOptionPane.ERROR_MESSAGE);
        } else if (txtyil.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lütfen mezuniyet yılı giriniz", "Hata", JOptionPane.ERROR_MESSAGE);
        } else if (txtokul.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lütfen okul giriniz", "Hata", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                String ad = txtad.getText();
                String soyad = txtsoyad.getText();
                int yas = Integer.valueOf(txtyas.getText());
                String ulke = txtulke.getText();
                int maas = Integer.valueOf(txtmaas.getText());
                String adres = txtadres.getText();
                String is = txtis.getText();
                String sehir = txtsehir.getText();
                String sirket = txtsirket.getText();
                int dept = Integer.valueOf(txtdept.getText());
                int tel = Integer.valueOf(txttel.getText());
                String endustri = txtendustri.getText();
                String bolum = txtbolum.getText();
                String kampus = txtkampus.getText();
                int yil = Integer.valueOf(txtyil.getText());
                String okul = txtokul.getText();

                String personal_sorgu = "insert into personal (ad, soyad, yas, ulke, maas, sehir) values ('" + ad
                        + "','" + soyad + "'," + yas + ",'" + ulke + "','" + maas + "','" + sehir + "')";
                statement.executeUpdate(personal_sorgu);

                int personal_id = 0;
                try {

                    resultSet = statement.executeQuery("select max(id) from personal");
                    while (resultSet.next()) {
                        personal_id = resultSet.getInt("max");
                    }
                } catch (Exception e) {
                    System.out.println("Hata: fromdatabase " + e.getMessage());
                }

                String personal_job_sorgu = "insert into personal_job (id,job,dept,company_id) values (" + personal_id
                        + ",'" + is + "'," + dept + "," + personal_id + ")";
                statement.executeUpdate(personal_job_sorgu);

                String personal_company_sorgu = "insert into personal_company (id,company, address, phone_no, industry) values ("
                        + personal_id + ",'" + sirket + "','" + adres + "','" + tel + "','" + endustri + "')";
                statement.executeUpdate(personal_company_sorgu);

                String personal_education_sorgu = "insert into personal_education (id,school, course, campus, year) values ("
                        + personal_id + ",'" + okul + "','" + bolum + "','" + kampus + "'," + yil + ")";
                if (statement.executeLargeUpdate(personal_education_sorgu) > 0) {
                    JOptionPane.showMessageDialog(null, "Kayıt Eklendi", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("Kayıt eklendi.");
                } else {
                    JOptionPane.showMessageDialog(null, "Kayıt Eklenemedi", "Hata", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Kayıt eklenemedi.");
                }
            } catch (Exception ex) {
                System.out.println("Hata : kayitEkle() - " + ex.getMessage().toString());
            }
        }

    }

    /**
     * Databaseden gelen verileri listeye ekler.
     */
    public static void fromDatabaseToList() {

        employees = new ArrayList<>();

        try {
            resultSet = statement.executeQuery("select * from personal as p full join personal_job as pj on p.job_id=pj.id full join personal_company as pc on pj.company_id=pc.id full join personal_education as pe on pe.id=p.education_id order by p.id");
            while (resultSet.next()) {
                personel = new Personal();
                personel.setId(resultSet.getInt("id"));
                personel.setName(resultSet.getString("ad"));
                personel.setSurname(resultSet.getString("soyad"));
                personel.setAge(resultSet.getInt("yas"));
                personel.setCinsiyet(resultSet.getBoolean("cinsiyet"));
                personel.setCity(resultSet.getString("sehir"));
                personel.setCountry(resultSet.getString("ulke"));
                personel.setSalary(resultSet.getString("maas"));
                personel.setJob(new Job(resultSet.getString("job"), resultSet.getInt("dept"),
                        new Company(resultSet.getString("company"), resultSet.getString("address"),
                                resultSet.getString("phone_no"), resultSet.getString("industry"))));
                personel.setEducation(new Education(resultSet.getString("school"), resultSet.getString("course"),
                        resultSet.getString("campus"), resultSet.getInt("year")));
                employees.add(personel);

            }

        } catch (Exception e) {
            System.out.println("Hata : fromDatabaseToList() - " + e.getMessage());
        }
    }

    /**
     * Tabloyu oluşturur.
     */
    public void tabloOlustur(PersonalListWrapper plw) {

        try {
            resultSet = statement.executeQuery("select * from personal as p full join personal_job as pj on p.job_id=pj.id full join personal_company as pc on pj.company_id=pc.id full join personal_education as pe on pe.id=p.education_id order by p.id");

            tableModel = new DefaultTableModel();

            Object[] kolonIsimleri = new Object[18];
            kolonIsimleri[0] = "ID";
            kolonIsimleri[1] = "Name";
            kolonIsimleri[2] = "Surname";
            kolonIsimleri[3] = "Age";
            kolonIsimleri[4] = "Gender";
            kolonIsimleri[5] = "City";
            kolonIsimleri[6] = "Country";
            kolonIsimleri[7] = "Salary";
            kolonIsimleri[8] = "Job";
            kolonIsimleri[9] = "Dept";
            kolonIsimleri[10] = "Company";
            kolonIsimleri[11] = "Address";
            kolonIsimleri[12] = "Phone No";
            kolonIsimleri[13] = "Industry";
            kolonIsimleri[14] = "School";
            kolonIsimleri[15] = "Course";
            kolonIsimleri[16] = "Campus";
            kolonIsimleri[17] = "Year";

            tableModel.setColumnIdentifiers(kolonIsimleri);

            Object[] satir = new Object[18];
            for (int i = 0; i < plw.getEmployees().size(); i++) {
                satir[0] = plw.getEmployees().get(i).getId();
                satir[1] = plw.getEmployees().get(i).getName();
                satir[2] = plw.getEmployees().get(i).getSurname();
                satir[3] = plw.getEmployees().get(i).getAge();
                satir[4] = plw.getEmployees().get(i).isCinsiyet();
                satir[5] = plw.getEmployees().get(i).getCity();
                satir[6] = plw.getEmployees().get(i).getCountry();
                satir[7] = plw.getEmployees().get(i).getSalary();
                satir[8] = plw.getEmployees().get(i).getJob().getName();
                satir[9] = plw.getEmployees().get(i).getJob().getDept();
                satir[10] = plw.getEmployees().get(i).getJob().getCompany().getCompany();
                satir[11] = plw.getEmployees().get(i).getJob().getCompany().getAddress();
                satir[12] = plw.getEmployees().get(i).getJob().getCompany().getPhone();
                satir[13] = plw.getEmployees().get(i).getJob().getCompany().getIndustry();
                satir[14] = plw.getEmployees().get(i).getEducation().getSchool();
                satir[15] = plw.getEmployees().get(i).getEducation().getCourse();
                satir[16] = plw.getEmployees().get(i).getEducation().getCampus();
                satir[17] = plw.getEmployees().get(i).getEducation().getYear();

                tableModel.addRow(satir);
            }

            table_1.setModel(tableModel);

        } catch (SQLException e) {
            System.out.println("Hata : tabloOlustur() - " + e.getMessage());
        }

    }

    /**
     * Database e bağlanır.
     */
    public void connectToDatabase() {
        db = DatabaseSingletonEnum.INSTANCE;
        connection = db.getConnection();
        statement = db.getStatement();
        System.out.println("Bağlantı açıldı.");
    }

    /**
     * Database bağlantısını kapatır.
     *
     * @throws SQLException
     */
    public void closeConnection() throws SQLException {
        connection = null;
        statement = null;
        resultSet = null;
        System.out.println("Bağlantı kapatıldı.");
    }

    /**
     * Database den gelen verileri xml dosyasına yazar.
     * Xml dosyasını okur ve tabloyu oluşturur.
     */
    public void bilgiGetirXML() {

        fromDatabaseToList();
        String filePath = "/Users/anke/Downloads/Kraft/PersonalListFromDatabase.xml";
        marshaltoXMLList(filePath);
        // 1. way
        //unmarshalOfXMLList(filePath);

        // 2. way
        //unmarshalledPersonalListWrapper=unmarshalOfXMLList_ConversionbyFileExtension(filePath);

        // 3. way
        unmarshalledPersonalListWrapper = unmarshalOfXMLList_UsingGenericClass(PersonalListWrapper.class, filePath);

        tabloOlustur(unmarshalledPersonalListWrapper);
    }

    /**
     * Listeyi xml dosyasına yazar.
     */
    public static void marshaltoXMLList(String filePath) {
        personalListWrapper = new PersonalListWrapper(employees);
        try {
            File file = new File(filePath);
            JAXBContext jaxbContext = JAXBContext.newInstance(PersonalListWrapper.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(personalListWrapper, file);
            // marshaller.marshal(personalListWrapper, System.out);
        } catch (JAXBException e) {
            System.out.println("Hata : marshaltoXMLList() - " + e.getMessage());
        }
    }

    /**
     * Xml dosyasını okur ve listeye ekler.
     */
    public void unmarshalOfXMLList(String filePath) {

        try {
            File file = new File(filePath);
            JAXBContext jaxbContext = JAXBContext.newInstance(PersonalListWrapper.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            unmarshalledPersonalListWrapper = (PersonalListWrapper) unmarshaller.unmarshal(file);

        } catch (JAXBException e) {
            System.out.println("Hata : unmarshalOfXMLList() - " + e.getMessage());
        }
    }

    /**
     * Database den gelen verileri json dosyasına yazar.
     * Json dosyasını okur ve tabloyu oluşturur.
     */
    public void bilgiGetirJSON() {

        fromDatabaseToList();
        String jsonFilePath = "/Users/anke/Downloads/Kraft/PersonalListFromDatabase.json";
        marshaltoJSONList(jsonFilePath);

        // 1. way
        //unmarchalOfJSONList(jsonFilePath);

        // 2. way
        unmarshalledPersonalListWrapper=unmarshalOfList_ConversionbyFileExtension(jsonFilePath);

        // 3. way
        //unmarshalledPersonalListWrapper= unmarshalofJSONList_UsingGenericClass(PersonalListWrapper.class, jsonFilePath);

        tabloOlustur(unmarshalledPersonalListWrapper);
    }

    /**
     * Listeyi json dosyasına yazar.
     */
    public void marshaltoJSONList(String filePath) {
        personalListWrapper = new PersonalListWrapper(employees);
        try {
            File file = new File(filePath);
            ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
            objectMapper.writeValue(file, personalListWrapper);
        } catch (IOException e) {
            System.out.println("Hata : marshaltoJSONList() - " + e.getMessage());
        }
    }

    /**
     * Json dosyasını okur ve listeye ekler.
     */
    public void unmarchalOfJSONList(String filePath) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            unmarshalledPersonalListWrapper = objectMapper.readValue(new File(filePath), PersonalListWrapper.class);
        } catch (IOException e) {
            System.out.println("Hata : unmarchalOfJSONList() - " + e.getMessage());
        }
    }

    /**
     * Dosya uzantısına göre dönüştürme işlemi yapar.
     * Bunun için common.io dependency eklenmelidir.
     *
     * Dynamic Parser örneği.
     *
     * @param filePath
     * @param <T>
     * @return
     */
    public static <T> T unmarshalOfList_ConversionbyFileExtension(String filePath) {
        try {
            File file = new File(filePath);
            String extension = FilenameUtils.getExtension(filePath);

            switch (extension) {
                case "xml":
                    JAXBContext jaxbContext = JAXBContext.newInstance(PersonalListWrapper.class);
                    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
                    return (T) unmarshaller.unmarshal(file);
                case "json":
                    ObjectMapper objectMapper = new ObjectMapper();
                    return (T) objectMapper.readValue(file, PersonalListWrapper.class);
                case "csv":
                    System.out.println("CSV için parser yazılacak.");
                    break;
                case "txt":
                    System.out.println("TXT için parser yazılacak.");
                    break;
                case "xls":
                    System.out.println("XLS için parser yazılacak.");
                    break;
                default:
                    throw new IllegalArgumentException("Dosya uzantısı desteklenmiyor: " + extension);
            }
        } catch (JAXBException | IllegalArgumentException e) {
            System.out.println("Hata : unmarshalOfList_ConversionbyFileExtension() - " + e.getMessage());
            return null;
        } catch (StreamReadException e) {
            throw new RuntimeException(e);
        } catch (DatabindException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }



    /**
     * Generic class kullanarak XML'den dönüştürme işlemi yapar.
     *
     * @param <T>
     * @return
     */
    public static <T> T unmarshalOfXMLList_UsingGenericClass(Class<T> genericClass, String filePath) {
        T result = null;
        try {
            File file = new File(filePath);
            JAXBContext jaxbContext = JAXBContext.newInstance(genericClass);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            result = genericClass.cast(unmarshaller.unmarshal(file));
        } catch (JAXBException e) {
            System.out.println("Hata : unmarshalOfXMLList_UsingGenericClass() - " + e.getMessage());
        }
        return result;
    }

    /**
     * Generic class kullanarak JSON'dan dönüştürme işlemi yapar.
     *
     * @param <T>
     * @return
     */
    public static <T> T unmarshalofJSONList_UsingGenericClass(Class<T> genericClass, String filePath) {
        T result = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            result = objectMapper.readValue(new File(filePath), genericClass);
        } catch (IOException e) {
            System.out.println("Hata : unmarshalofJSONList_UsingGenericClass() - " + e.getMessage());
        }
        return result;
    }

    /**
     * XML dosyasını JSON formatına dönüştürür.
     *
     * @param xmlFilePath
     * @param jsonFilePath
     */
    public static void convertXmlToJson(String xmlFilePath, String jsonFilePath) {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
            Object data = xmlMapper.readValue(new File(xmlFilePath), Object.class);
            objectMapper.writeValue(new File(jsonFilePath), data);
            System.out.println("XML dosyası JSON formatına başarıyla dönüştürüldü.");
        } catch (IOException e) {
            System.out.println("Hata : convertXmlToJson() - " + e.getMessage());
        }
    }
}