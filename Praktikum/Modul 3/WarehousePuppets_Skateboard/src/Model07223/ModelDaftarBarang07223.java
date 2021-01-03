package Model07223;

import Entity07223.DaftarBarangEntity07223;
import Entity07223.NamaAdminEntity07223;
import Model07223.ModelNamaAdmin07223;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class ModelDaftarBarang07223 implements InterfacesModel07223 {
    private ArrayList<DaftarBarangEntity07223> daftarBarang07223ArrayList;
    private DaftarBarangEntity07223 daftarBarang07223;
    
    ModelNamaAdmin07223 modeladmin = new ModelNamaAdmin07223();

    public ModelDaftarBarang07223() {
        daftarBarang07223ArrayList = new ArrayList<DaftarBarangEntity07223>();
    }

    // mengambil semua daftar barang
    public ArrayList<DaftarBarangEntity07223> getDaftarBarangArrayList() {
        return daftarBarang07223ArrayList;
    }

    // cek daftar barang, penerapan polymorpisme (overriding)
    @Override
    public int cekData(String kode) {
        int loop = 0;
        // pengujian apakah daftar barang kosong atau tidak (if-else)
        if (daftarBarang07223ArrayList.size() == 0) {
            loop = -1;//data kosong
        } else {
            for (int i = 0; i < daftarBarang07223ArrayList.size(); i++) {
                if (daftarBarang07223ArrayList.get(i).getKeluar().getKode().equals(kode)) {
                    loop = i;
                    break;
                } else {
                    loop = -2;
                }
            }
        }
        // mengembalikan nilai loop
        return loop;
    }

    // mengambil daftar barang berdasarkan parameter index data
    public DaftarBarangEntity07223 showDaftarBarang(int index) {
        return daftarBarang07223ArrayList.get(index);
    }
    
    // update daftar barang dengan parameter index data & object barang
    public void updateIsVerified(int index,DaftarBarangEntity07223 daftarBarang07223){
        daftarBarang07223ArrayList.set(index,daftarBarang07223);
    }
    
}