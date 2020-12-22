package Controller;

import Entity.DaftarprakEntity07223;
import Entity.PraktikanEntity07223;
import java.util.Date;

public class PraktikanController07223 implements ControllerInterface07223 {
    int indexLogin = 0;
    public PraktikanController07223() {
    }
    
    public PraktikanEntity07223 getData() {
        return AllObjectModel07223.praktikanModel07223.getPraktikanEntityArrayList(indexLogin);
    }
    
    public void daftarPraktikum(int indexPraktikum, PraktikanEntity07223 praktikanEntity, boolean isVerified) {
        AllObjectModel07223.daftarprakModel07223.insertDataDaftarprak(new DaftarprakEntity07223(indexPraktikum,praktikanEntity,isVerified));
    }
    
    @Override
    public void login(String npm, String password) {
        indexLogin = AllObjectModel07223.praktikanModel07223.cekData(npm,password);
    }
    
    public void insert(String npm, String password, String nama, String no_telp, Date tglLahir, String kelas) {
        AllObjectModel07223.praktikanModel07223.insert(new PraktikanEntity07223(npm,password,nama,no_telp,tglLahir,kelas));
    }
    
    public PraktikanEntity07223 praktikanEntity() {
        return AllObjectModel07223.praktikanModel07223.getPraktikanEntityArrayList(indexLogin);
    }
    
    public int cekDaftarprak(String npm) {
        int cek = AllObjectModel07223.daftarprakModel07223.cekData(npm,null);
        return cek;
    }
    
    public DaftarprakEntity07223 showDaftarprak(int index) {
        return AllObjectModel07223.daftarprakModel07223.showDaftarprak(index);
    }
}
