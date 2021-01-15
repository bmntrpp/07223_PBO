package View07223;

import Controller07223.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BarangMasukGUI07223 {
    private static BarangMasukController07223 masuk = new BarangMasukController07223();
    private int barang = 0;
    JFrame LogReg = new JFrame();
    JTable tabelbmasuk = new JTable();
    JScrollPane scrollbmasuk = new JScrollPane(tabelbmasuk);
    JLabel top,lindex,lkode,ljenis,lharga,ltanggal,lgudang,lbarang;
    JTextField nomor,tindex,tkode,tjenis,tharga,ttanggal,tgudang;
    JButton create,read,update,delete,back;

    public BarangMasukGUI07223() {
        LogReg.setSize(800, 700);
    	LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.gray);
        
        top = new JLabel("Data Barang Masuk");
    	top.setBounds(200,30,500,40);
    	top.setFont(new Font("Times New Roman",Font.BOLD,40));
    	LogReg.add(top);

    	scrollbmasuk.setBounds(30,130,720,150);
    	tabelbmasuk.setModel(masuk.barangmasuk());
    	LogReg.add(scrollbmasuk);
        
        nomor = new JTextField();
    	nomor.setBounds(0,0,0,0);
    	LogReg.add(nomor);

    	lkode = new JLabel("KODE");
    	lkode.setBounds(50,270,150,30);
    	LogReg.add(lkode);

    	tkode = new JTextField();
    	tkode.setBounds(50,300,150,30);
    	LogReg.add(tkode);
        
        ljenis = new JLabel("JENIS");
    	ljenis.setBounds(220,270,150,30);
    	LogReg.add(ljenis);

    	tjenis = new JTextField();
    	tjenis.setBounds(220,300,150,30);
    	LogReg.add(tjenis);

    	lharga = new JLabel("HARGA");
    	lharga.setBounds(50,330,150,30);
    	LogReg.add(lharga);

    	tharga = new JTextField();
    	tharga.setBounds(50,360,150,30);
    	LogReg.add(tharga);
        
        ltanggal = new JLabel("TANGGAL (dd/mm/yyyy)");
    	ltanggal.setBounds(220,330,150,30);
    	LogReg.add(ltanggal);

    	ttanggal = new JTextField();
    	ttanggal.setBounds(220,360,150,30);
    	LogReg.add(ttanggal);
        
        lgudang = new JLabel("GUDANG");
    	lgudang.setBounds(50,390,150,30);
    	LogReg.add(lgudang);

    	tgudang = new JTextField();
    	tgudang.setBounds(50,420,150,30);
    	LogReg.add(tgudang);
        
        create = new JButton("CREATE");
    	create.setBounds(390,600,100,30);
    	create.setBackground(Color.LIGHT_GRAY);
    	LogReg.add(create);
        
    	update = new JButton("UPDATE");
    	update.setBounds(520,600,100,30);
    	update.setBackground(Color.LIGHT_GRAY);
    	LogReg.add(update);
        
        delete = new JButton("DELETE");
    	delete.setBounds(650,600,100,30);
    	delete.setBackground(Color.LIGHT_GRAY);
    	LogReg.add(delete);

    	back = new JButton("BACK");
    	back.setBounds(50,600,100,30);
    	back.setBackground(Color.LIGHT_GRAY);
    	LogReg.add(back);
    	
    	LogReg.setLocationRelativeTo(null);
    	LogReg.setVisible(true);
    	LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tabelbmasuk.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabelbmasuk.getSelectedRow();
                nomor.setText(allobjctrl07223.barangMasukModel.barangmasuk().getValueAt(i,0).toString());
                tkode.setText(allobjctrl07223.barangMasukModel.barangmasuk().getValueAt(i,1).toString());
                tjenis.setText(allobjctrl07223.barangMasukModel.barangmasuk().getValueAt(i,2).toString());
                tharga.setText(allobjctrl07223.barangMasukModel.barangmasuk().getValueAt(i,3).toString());
                ttanggal.setText(allobjctrl07223.barangMasukModel.barangmasuk().getValueAt(i,4).toString());
                tgudang.setText(allobjctrl07223.barangMasukModel.barangmasuk().getValueAt(i,5).toString());
            }
    	});
        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String kode = tkode.getText();
                    String jenis = tjenis.getText();
                    String harga = tharga.getText();
                    Date tanggal = new Date(ttanggal.getText());
                    String gudang = tgudang.getText();
                    allobjctrl07223.barangMasukModel.insertBarang(kode,jenis,harga,tanggal,gudang);
                    JOptionPane.showMessageDialog(null, "Input data Berhasil!","information",JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                    LogReg.dispose();
                    BarangMasukGUI07223 gui = new BarangMasukGUI07223();
                } catch(Exception exception) {
                    JOptionPane.showMessageDialog(null, "Format Penulisan Salah!","Registrasi Gagal",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int index = Integer.parseInt(nomor.getText());
                String kode = tkode.getText();
                String jenis = tjenis.getText();
                String harga = tharga.getText();
                Date tanggal = new Date(ttanggal.getText());
                String gudang = tgudang.getText();
                allobjctrl07223.barangMasukModel.updateBarang(index,kode,jenis,harga,tanggal,gudang);
                JOptionPane.showMessageDialog(null, "Update data Berhasil!","information",JOptionPane.INFORMATION_MESSAGE);
                LogReg.dispose();
                BarangMasukGUI07223 gui = new BarangMasukGUI07223();
            }
    	});
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int index = Integer.parseInt(nomor.getText());
                allobjctrl07223.barangMasukModel.removeBarang(index);
                JOptionPane.showMessageDialog(null, "Delete Data Berhasil!","Status",JOptionPane.INFORMATION_MESSAGE);
                LogReg.dispose();
                BarangMasukGUI07223 gui = new BarangMasukGUI07223();
            }
    	});
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                LogReg.dispose();
                GUI07223 index = new GUI07223();
            }
    	});
    }    
    void kosong() {
      tkode.setText(null);
      tjenis.setText(null);
      tharga.setText(null);
      ttanggal.setText(null);
      tgudang.setText(null);
    }
}