package Controller07223;

import Entity07223.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

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
     public DefaultTableModel barangmasuk() {
        DefaultTableModel dtmbarangmasuk = new DefaultTableModel();
        Object[] kolom = {"No","Kode","Jenis","Harga","Tanggal","Gudang"};
        dtmbarangmasuk.setColumnIdentifiers(kolom);
        int size = AllObjectModel07223.barangMasukModel.viewAll();
        for(int i=0;i<size;i++) {
            Object[] data = new Object[6];
            data[0] = i;
            data[1] = AllObjectModel07223.barangMasukModel.showDataBarang(i).getKode();
            data[2] = AllObjectModel07223.barangMasukModel.showDataBarang(i).getJenis();
            data[3] = AllObjectModel07223.barangMasukModel.showDataBarang(i).getHarga();
            data[4] = new SimpleDateFormat("dd-MM-yyyy").format(AllObjectModel07223.barangMasukModel.showDataBarang(i).getTanggal());
            data[5] = AllObjectModel07223.barangMasukModel.showDataBarang(i).getGudang();
            dtmbarangmasuk.addRow(data);
        }
        return dtmbarangmasuk;
    }
}
