package Model07223;

import Entity07223.BarangMasukEntity07223;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ModelBarangMasuk07223 implements InterfacesModel07223 {
    private ArrayList<BarangMasukEntity07223> BarangMasuk07223ArrayList;

    public ModelBarangMasuk07223() {
        BarangMasuk07223ArrayList = new ArrayList<BarangMasukEntity07223>();
    }
    
    // get jumlah data
    public int viewAll() {
        return BarangMasuk07223ArrayList.size();
    }

    // insert data barang, dengan parameter object barang
    public void insert(BarangMasukEntity07223 Barang) {
        BarangMasuk07223ArrayList.add(Barang);
    }
    
    // update data barang, dengan parameter index data & object barang
    public void update(int index, BarangMasukEntity07223 barangMasuk07223) {
        BarangMasuk07223ArrayList.set(index,(BarangMasukEntity07223) barangMasuk07223);
    }

    // delete data barang, dengan parameter index data
    public void remove(int index) {
        BarangMasuk07223ArrayList.remove(index);
    }

    // cek data barang, penerapan polymorpisme (overriding)
    @Override
    public int cekData(String kode) {
        int loop = 0;
        for (BarangMasukEntity07223 barangmasuk07223 : BarangMasuk07223ArrayList) {
            if (barangmasuk07223.getKode().equals(kode)) {
                break;
            } else {
                loop++;
            }
        }
        return loop;
    }
    
    // mengambil data barang berdasarkan parameter index data
    public BarangMasukEntity07223 showDataBarang(int index){
        return BarangMasuk07223ArrayList.get(index);
    }
}