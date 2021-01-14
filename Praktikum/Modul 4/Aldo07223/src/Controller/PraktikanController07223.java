package Controller;

import Entity.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class PraktikanController07223 implements ControllerInterface07223 {

    int indexLogin = 0;

    public PraktikanController07223() {
    }

    public PraktikanEntity07223 getData() {
        return AllObjectModel07223.praktikanModel.getPraktikanEntityArrayList(indexLogin);
    }

    public void daftarPraktikum(int indexPraktikum, PraktikanEntity07223 praktikanEntity, boolean isVerified) {
        AllObjectModel07223.daftarprakModel.insertDataDaftarprak(new DaftarprakEntity07223(indexPraktikum, praktikanEntity, isVerified));
    }

    @Override
    public void login(String npm, String password) {
        indexLogin = AllObjectModel07223.praktikanModel.cekData(npm, password);
    }

    public void insert(String npm, String password, String nama, String no_telp, Date tglLahir, String kelas) {
        AllObjectModel07223.praktikanModel.insert(new PraktikanEntity07223(npm, password, nama, no_telp, tglLahir, kelas));
    }

    public PraktikanEntity07223 praktikanEntity() {
        return AllObjectModel07223.praktikanModel.getPraktikanEntityArrayList(indexLogin);
    }

    public int cekDaftarprak(String npm) {
        int cek = AllObjectModel07223.daftarprakModel.cekData(npm, null);
        return cek;
    }

    public DaftarprakEntity07223 showDaftarprak(int index) {
        return AllObjectModel07223.daftarprakModel.showDaftarprak(index);
    }

    public DefaultTableModel daftarprak() {
        DefaultTableModel dtmdaftarprak = new DefaultTableModel();
        Object[] kolom = {"NPM", "Nama", "Password", "No Telp", "Tgl Lahir", "praktikum", "Verified", "Kelas"};
        dtmdaftarprak.setColumnIdentifiers(kolom);
        int size = AllObjectModel07223.daftarprakModel.alldataprak().size();
        String verif = null;
        for (int i = 0; i < size; i++) {
            if (AllObjectModel07223.daftarprakModel.alldataprak().get(i).isVerified() == false) {
                verif = "no";
            } else {
                verif = "yes";
            }
            Object[] data = new Object[8];
            data[0] = AllObjectModel07223.daftarprakModel.alldataprak().get(i).getPraktikan().getNpm();
            data[1] = AllObjectModel07223.daftarprakModel.alldataprak().get(i).getPraktikan().getNama();
            data[2] = AllObjectModel07223.daftarprakModel.alldataprak().get(i).getPraktikan().getPassword();
            data[3] = AllObjectModel07223.daftarprakModel.alldataprak().get(i).getPraktikan().getNo_telp();
            data[4] = new SimpleDateFormat("dd-mm-yyy").format(AllObjectModel07223.daftarprakModel.alldataprak().get(i).getPraktikan().getTgllahir());
            data[5] = PraktikumEntity07223.nama[AllObjectModel07223.daftarprakModel.alldataprak().get(i).getIndexPrak()];
            data[6] = verif;
            data[7] = AllObjectModel07223.daftarprakModel.alldataprak().get(i).getPraktikan().getKelas();
            dtmdaftarprak.addRow(data);
        }
        return dtmdaftarprak;
    }
}
