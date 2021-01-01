package Controller07223;

import Entity07223.BarangKeluarEntity07223;
import Entity07223.DaftarBarangEntity07223;

public class DaftarBarangController07223 {
    int indexLogin = 0;
    
    public DaftarBarangController07223() {
    }
    
    // menampilkan daftar barang
    public void viewBarang() {
        AllObjectModel07223.daftarBarangModel.view();
    }
    
    // mengambil daftar barang
    public DaftarBarangEntity07223 daftarBarangEntity(int indexLogin) {
        return AllObjectModel07223.daftarBarangModel.showDaftarBarang(indexLogin);
    }
    
    // method untuk update verified barang
    public void verifiedBarang(int index,DaftarBarangEntity07223 daftarBarang07223) {
        AllObjectModel07223.daftarBarangModel.updateIsVerified(index,(DaftarBarangEntity07223) daftarBarang07223);
    }
}
