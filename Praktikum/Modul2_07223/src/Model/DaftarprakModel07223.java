package Model;


import Entity.DaftarprakEntity07223;
import Entity.PraktikumEntity07223;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class DaftarprakModel07223 implements ModelInterfaces07223 {

    private ArrayList<DaftarprakEntity07223> daftarprak07223ArrayList;

    public DaftarprakModel07223() {
        daftarprak07223ArrayList = new ArrayList<DaftarprakEntity07223>();
    }

    public void insertDataDaftarprak(DaftarprakEntity07223 daftarPrak07223) {
        daftarprak07223ArrayList.add(daftarPrak07223);
    }

    public ArrayList<DaftarprakEntity07223> getDaftarprakArrayList() {
        return daftarprak07223ArrayList;
    }

    @Override
    public void view() {
        for (DaftarprakEntity07223 daftarprak07223 : daftarprak07223ArrayList) {
            System.out.println("===============================================================");
            System.out.println(" NPM : " + daftarprak07223.getPraktikan().getNpm()
                    + "\n Nama : " + daftarprak07223.getPraktikan().getNama()
                    + "\n Password : " + daftarprak07223.getPraktikan().getPassword()
                    + "\n No Telp : " + daftarprak07223.getPraktikan().getNo_telp()
                    + "\n Tanggal Lahir : " + new SimpleDateFormat("dd-MM-yyyy").format(daftarprak07223.getPraktikan().getTgllahir())
                    + "\n Praktikum : " + PraktikumEntity07223.nama[daftarprak07223.getIndexPrak()]
                    + "\n IsVerified : ");
            if (daftarprak07223.isVerified() == false) {
                System.out.println("Belum Di Verifikasi Admin");
            } else {
                System.out.println("Telah Di Verifikasi");
            }
            System.out.println("===============================================================");
        }
    }

    public int cekData(String npm, String password) {
        int loop = 0;
        if (daftarprak07223ArrayList.size() == 0) {
            loop = -1;//data kosong
        } else {
            for (int i = 0; i < daftarprak07223ArrayList.size(); i++) {
                if (daftarprak07223ArrayList.get(i).getPraktikan().getNpm().equals(npm)) {
                    loop = i;
                    break;
                } else {
                    loop = -2;
                }
            }
        }
        return loop;
    }

    public DaftarprakEntity07223 showDaftarprak(int index) {
        return daftarprak07223ArrayList.get(index);
    }
    
    public void updateIsVerified(int index, DaftarprakEntity07223 daftarprak07223){
        daftarprak07223ArrayList.set(index, daftarprak07223);
    }
}
