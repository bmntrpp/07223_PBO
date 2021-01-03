package Controller07223;

import Entity07223.*;
import java.util.Date;

public class BarangMasukController07223 {
    int indexLogin = 0;
    
    public BarangMasukController07223() {
    }
    
    // get data barang melalui model
    public int view() {
        return AllObjectModel07223.barangMasukModel.viewAll();
    }
    
    // show data barang melalui model berdasarkan index data
    public BarangMasukEntity07223 getData(int index) {
        return AllObjectModel07223.barangMasukModel.showDataBarang(index);
    }
    
    // insert data barang melalui model
    public void insertBarang(String kode,String jenis,String harga,Date tanggal,String gudang) {
        BarangMasukEntity07223 barang = new BarangMasukEntity07223();
        barang.setKode(kode);
        barang.setJenis(jenis);
        barang.setHarga(harga);
        barang.setTanggal(tanggal);
        barang.gudang(gudang);
        AllObjectModel07223.barangMasukModel.insert(barang);
    }
    
    // update data barang melalui model
    public void updateBarang(int index,String kode,String jenis,String harga,Date tanggal,String gudang) {
        BarangMasukEntity07223 barang = new BarangMasukEntity07223();
        barang.setKode(kode);
        barang.setJenis(jenis);
        barang.setHarga(harga);
        barang.setTanggal(tanggal);
        barang.gudang(gudang);
        AllObjectModel07223.barangMasukModel.update(index,barang);
    }

    // delete data barang melalui model
    public void removeBarang(int index) {
        AllObjectModel07223.barangMasukModel.remove(index);
    }
    
    // mengambil data barang melalui model
    public BarangMasukEntity07223 barangMasukEntity() {
        return AllObjectModel07223.barangMasukModel.showDataBarang(indexLogin);
    }
}
