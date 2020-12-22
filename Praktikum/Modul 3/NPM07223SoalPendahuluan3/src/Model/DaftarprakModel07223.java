package Model;

import Entity.DaftarprakEntity07223;
import Entity.PraktikumEntity07223;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class DaftarprakModel07223 implements ModelInterfaces07223 {
    private ArrayList<DaftarprakEntity07223> daftarprakArrayList = new ArrayList();
    
    public void DaftarprakModel() {
        daftarprakArrayList = new ArrayList<DaftarprakEntity07223>();
    }
    
    public void insertDataDaftarprak(DaftarprakEntity07223 daftarprak) {
        daftarprakArrayList.add(daftarprak);
    }
    
    public ArrayList<DaftarprakEntity07223> getDaftarprakArrayList() {
        return daftarprakArrayList;
    }
    
    /**
     *
     */
    @Override
    public void view() {
        for(DaftarprakEntity07223 daftarprak : daftarprakArrayList) {
            System.out.println("=============================================");
            System.out.print("NPM : "+daftarprak.getPraktikan().getNpm()+"\n Nama : "+daftarprak.getPraktikan().getNama()+"\n Password : "+daftarprak.getPraktikan().getPassword()+"\n No. Telp : "+daftarprak.getPraktikan().getNo_telp()+"Tanggal Lahir : "+new SimpleDateFormat("dd-MM-yyyy").format(daftarprak.getPraktikan().getTglLahir())+"\n Praktikum : "+PraktikumEntity07223.nama[daftarprak.getIndexPrak()]+"\n IsVerified : ");
            if(daftarprak.isVerified() == false) {
                System.out.println("Belum Di Verifikasi Admin");
            } else {
                System.out.println("Telah Di Verifikasi");
            }
            System.out.println("=============================================");
        }
    }
    
    public int cekData(String npm, String password) {
        int loop = 0;
        if(daftarprakArrayList.size() == 0) {
            loop = -1;
        } else {
            for(int i=0;i<daftarprakArrayList.size();i++) {
                if(daftarprakArrayList.get(i).getPraktikan().getNpm().equals(npm)) {
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
        return daftarprakArrayList.get(index);
    }
    
    public void updateIsVerified(int index, DaftarprakEntity07223 daftarprakEntity) {
        daftarprakArrayList.set(index, daftarprakEntity);
    }
}
