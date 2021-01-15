package View07223;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class GUI07223 {
    JFrame LogReg = new JFrame();
    JLabel login,top;
    JTextField textnamalogin,textpasswordlogin;
    JLabel labelnamalogin,labelpasswordlogin;
    JButton check;
    JPasswordField passwordlogin;
    JRadioButton radiobmasuk,radiobkeluar;
    private int ceklogin = 0;
    
    public GUI07223() {
        LogReg.setSize(900, 630);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.gray);
        top = new JLabel("Warehouse Puppets Skateboard ");
        top.setBounds(50, 10, 800, 50);
        top.setFont(new Font("Times New Roman", Font.BOLD, 40));
        LogReg.add(top);

        login = new JLabel("LOGIN");
        login.setBounds(100, 50, 200, 100);
        login.setFont(new Font("Times New Roman", Font.BOLD, 30));
        LogReg.add(login);
        
        radiobmasuk = new JRadioButton("Barang Masuk");
    	radiobmasuk.setBounds(30,150,140,30);
    	radiobmasuk.setBackground(Color.gray);
    	LogReg.add(radiobmasuk);
        
        radiobkeluar = new JRadioButton("Barang Keluar");
    	radiobkeluar.setBounds(170,150,140,30);
    	radiobkeluar.setBackground(Color.gray);
    	LogReg.add(radiobkeluar);

        labelnamalogin = new JLabel("NAMA");
        labelnamalogin.setBounds(30, 180, 80, 30);
        LogReg.add(labelnamalogin);

        textnamalogin = new JTextField();
        textnamalogin.setBounds(30, 210, 200, 30);
        LogReg.add(textnamalogin);

        labelpasswordlogin = new JLabel("PASSWORD");
        labelpasswordlogin.setBounds(30, 240, 100, 30);
        LogReg.add(labelpasswordlogin);

        passwordlogin = new JPasswordField();
        passwordlogin.setBounds(30, 270, 200, 30);
        LogReg.add(passwordlogin);

        check = new JButton("LOGIN");
        check.setBounds(90, 320, 100, 40);
        check.setBackground(Color.LIGHT_GRAY);
        LogReg.add(check);

        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);
        radiobmasuk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(radiobmasuk.isSelected()) {
                    radiobkeluar.setSelected(false);
                    ceklogin = 1;
                }
            }
    	});
        radiobkeluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(radiobkeluar.isSelected()) {
                    radiobmasuk.setSelected(false);
                    ceklogin = 2;
                }
            }
    	});
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(ceklogin == 1) {
                    try {
                        allobjctrl07223.admin.DataAdmin();
                        allobjctrl07223.admin.login(textnamalogin.getText(), passwordlogin.getText());
                        String Admin = allobjctrl07223.admin.adminEntity().getAdmin();
                        JOptionPane.showMessageDialog(null, "Selamat Datang "+Admin , "information", JOptionPane.INFORMATION_MESSAGE);
                        BarangMasukGUI07223 barangmasuk = new BarangMasukGUI07223();
                        LogReg.dispose();
                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(null, "Nama atau Password Salah", "information", JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                } else if(ceklogin == 2) {
                    try {
                        allobjctrl07223.admin.DataAdmin();
                        allobjctrl07223.admin.login(textnamalogin.getText(), passwordlogin.getText());
                        String Admin = allobjctrl07223.admin.adminEntity().getAdmin();
                        JOptionPane.showMessageDialog(null, "Selamat Datang "+Admin , "information", JOptionPane.INFORMATION_MESSAGE);
                        BarangKeluarGUI07223 barangkeluar = new BarangKeluarGUI07223();
                        LogReg.dispose();
                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(null, "Nama atau Password Salah", "information", JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Pilih Radio Button Terlebih Dahulu!","information", JOptionPane.INFORMATION_MESSAGE);
                    GUI07223 lanjut = new GUI07223();
                }
            }
        });
    }

    void kosong() {
        textnamalogin.setText(null);
        passwordlogin.setText(null);
    }

}
