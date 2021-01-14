package Controller07223;

import Entity07223.*;
import View07223.BarangKeluarGUI07223;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

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
    public DefaultTableModel barangkeluar() {
        DefaultTableModel dtmbarangkeluar = new DefaultTableModel();
        Object[] kolom = {"No","Kode","Jenis","Harga","Tanggal","Kota"};
        dtmbarangkeluar.setColumnIdentifiers(kolom);
        int size = AllObjectModel07223.barangKeluarModel.viewAll();
        for(int i=0;i<size;i++) {
            Object[] data = new Object[6];
            data[0] = i;
            data[1] = AllObjectModel07223.barangKeluarModel.showDataBarang(i).getKode();
            data[2] = AllObjectModel07223.barangKeluarModel.showDataBarang(i).getJenis();
            data[3] = AllObjectModel07223.barangKeluarModel.showDataBarang(i).getHarga();
            data[4] = new SimpleDateFormat("dd-MM-yyyy").format(AllObjectModel07223.barangKeluarModel.showDataBarang(i).getTanggal());
            data[5] = AllObjectModel07223.barangKeluarModel.showDataBarang(i).getKota();
            dtmbarangkeluar.addRow(data);
        }
        return dtmbarangkeluar;
    }

    public void updateBarang(int index, BarangKeluarEntity07223 barangKeluarEntity07223) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
