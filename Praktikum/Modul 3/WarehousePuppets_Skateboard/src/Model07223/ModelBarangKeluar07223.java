package Model07223;

import Entity07223.BarangKeluarEntity07223;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class ModelBarangKeluar07223 implements InterfacesModel07223 {
    private ArrayList<BarangKeluarEntity07223> BarangKeluar07223ArrayList;

    public ModelBarangKeluar07223() {
        BarangKeluar07223ArrayList = new ArrayList<BarangKeluarEntity07223>();
    }
    
    // get jumlah data
    public int viewAll() {
        return BarangKeluar07223ArrayList.size();
    }

    // insert data barang, dengan parameter object barang
    public void insert(BarangKeluarEntity07223 barangkeluar07223) {
        BarangKeluar07223ArrayList.add(barangkeluar07223);
    }
    
    // update data barang, dengan parameter index data & object barang
    public void update(int index, BarangKeluarEntity07223 barangKeluar07223) {
        BarangKeluar07223ArrayList.set(index,(BarangKeluarEntity07223) barangKeluar07223);
    }

    // delete data barang, dengan parameter index data
    public void remove(int index) {
        BarangKeluar07223ArrayList.remove(index);
    }

    // cek data barang, penerapan polymorpisme (overriding)
    @Override
    public int cekData(String kode) {
        int loop = 0;
        while (!BarangKeluar07223ArrayList.get(loop).getKode().equals(kode)) {
            loop++;
        }
        return loop;
    }
    
    // mengambil data barang berdasarkan parameter index data
    public BarangKeluarEntity07223 showDataBarang(int index){
        return BarangKeluar07223ArrayList.get(index);
    }
}