package Controller07223;

import Entity07223.*;
import java.util.Date;

public class BarangKeluarController07223 {
    int indexLogin = 0;
    
    public BarangKeluarController07223() {
    }
    
    // get data barang melalui model
    public int view() {
        return AllObjectModel07223.barangKeluarModel.viewAll();
    }
    
    // show data barang melalui model berdasarkan index data
    public BarangKeluarEntity07223 getData(int index) {
        return AllObjectModel07223.barangKeluarModel.showDataBarang(index);
    }
    
    // insert data barang melalui model
    public void insertBarang(String kode,String jenis,String harga,Date tanggal,String kota) {
        BarangKeluarEntity07223 barang = new BarangKeluarEntity07223();
        barang.setKode(kode);
        barang.setJenis(jenis);
        barang.setHarga(harga);
        barang.setTanggal(tanggal);
        barang.setKota(kota);
        AllObjectModel07223.barangKeluarModel.insert(barang);
    }
    
    // update data barang melalui model
    public void updateBarang(int index,String kode,String jenis,String harga,Date tanggal,String kota) {
        BarangKeluarEntity07223 barang = new BarangKeluarEntity07223();
        barang.setKode(kode);
        barang.setJenis(jenis);
        barang.setHarga(harga);
        barang.setTanggal(tanggal);
        barang.setKota(kota);
        AllObjectModel07223.barangKeluarModel.update(index,barang);
    }

    // delete data barang melalui model
    public void removeBarang(int index) {
        AllObjectModel07223.barangKeluarModel.remove(index);
    }
    
    // mengambil data barang melalui model
    public BarangKeluarEntity07223 barangKeluarEntity() {
        return AllObjectModel07223.barangKeluarModel.showDataBarang(indexLogin);
    }
}
