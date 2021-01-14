package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;
import Controller.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AslabGUI07223 {

    private static PraktikanController07223 praktikan = new PraktikanController07223();
    JFrame Aslab = new JFrame();
    JTable tabelpraktikan = new JTable();
    JScrollPane scrollaslab = new JScrollPane(tabelpraktikan);
    JButton back, verif;
    JLabel admin, npmlabel, passlabel;
    JTextField npmtext, passtext;

    public AslabGUI07223() {
        Aslab.setSize(650, 500);
        Aslab.setLayout(null);
        Aslab.getContentPane().setBackground(Color.PINK);
        admin = new JLabel("Admin");
        admin.setBounds(250, 30, 200, 30);
        admin.setFont(new Font("Times New Roman", Font.BOLD, 40));
        Aslab.add(admin);

        scrollaslab.setBounds(30, 100, 570, 200);
        tabelpraktikan.setModel(praktikan.daftarprak());
        Aslab.add(scrollaslab);

        npmlabel = new JLabel("NPM");
        npmlabel.setBounds(50, 320, 100, 30);
        Aslab.add(npmlabel);

        npmtext = new JTextField();
        npmtext.setBounds(50, 350, 100, 30);
        Aslab.add(npmtext);

        passlabel = new JLabel("Password");
        passlabel.setBounds(200, 320, 100, 30);
        Aslab.add(passlabel);

        passtext = new JTextField();
        passtext.setBounds(200, 350, 100, 30);
        Aslab.add(passtext);

        verif = new JButton("verif");
        verif.setBounds(350, 350, 100, 30);
        verif.setBackground(Color.GREEN);
        Aslab.add(verif);

        back = new JButton("back");
        back.setBounds(50, 400, 100, 30);
        back.setBackground(Color.red);
        Aslab.add(back);

        Aslab.setLocationRelativeTo(null);
        Aslab.setVisible(true);
        Aslab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Aslab.dispose();
                GUI07223 men = new GUI07223();
            }
        });
        verif.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String npm = npmtext.getText();
                String pass = passtext.getText();
                int index = AllObjectModel07223.daftarprakModel.cekData(npm, pass);
                allobjctrl07223.admin.updateIsVerified(index,
                        allobjctrl07223.praktikan.showDaftarprak(index).getIndexPrak(),
                        allobjctrl07223.praktikan.showDaftarprak(index).getPraktikan());

                tabelpraktikan.setModel(praktikan.daftarprak());
            }
        });

        tabelpraktikan.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabelpraktikan.getSelectedRow();
                npmtext.setText(allobjctrl07223.praktikan.daftarprak().getValueAt(i, 0).toString());
                passtext.setText(allobjctrl07223.praktikan.daftarprak().getValueAt(i, 1).toString());
            }
        });
    }
}
