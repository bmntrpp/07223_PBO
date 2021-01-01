package Controller07223;

import Entity07223.*;

public class BarangKeluarController07223 {
    int indexLogin = 0;
    
    public BarangKeluarController07223() {
    }
    
    // insert data barang melalui model
    public void insertBarang(BarangKeluarEntity07223 barangkeluar07223) {
        AllObjectModel07223.barangKeluarModel.insert(barangkeluar07223);
    }
    
    // update data barang melalui model
    public void updateBarang(int index, BarangKeluarEntity07223 barangKeluar07223) {
        AllObjectModel07223.barangKeluarModel.update(index,(BarangKeluarEntity07223) barangKeluar07223);
    }

    // delete data barang melalui model
    public void removeBarang(int index) {
        AllObjectModel07223.barangKeluarModel.remove(index);
    }
    
    // view data barang melalui model
    public void viewBarang() {
        AllObjectModel07223.barangKeluarModel.view();
    }
    
    // mengambil data barang melalui model
    public BarangKeluarEntity07223 barangKeluarEntity() {
        return AllObjectModel07223.barangKeluarModel.showDataBarang(indexLogin);
    }
}
