package Controller07223;

import Entity07223.*;

public class BarangMasukController07223 {
    int indexLogin = 0;
    
    public BarangMasukController07223() {
    }
    
    // insert data barang melalui model
    public void insertBarang(BarangMasukEntity07223 barangmasuk07223) {
        AllObjectModel07223.barangMasukModel.insert(barangmasuk07223);
    }
    
    // update data barang melalui model
    public void updateBarang(int index, BarangMasukEntity07223 barangmasuk07223) {
        AllObjectModel07223.barangMasukModel.update(index,(BarangMasukEntity07223) barangmasuk07223);
    }

    // delete data barang melalui model
    public void removeBarang(int index) {
        AllObjectModel07223.barangMasukModel.remove(index);
    }
    
    // view data barang melalui model
    public void viewBarang() {
        AllObjectModel07223.barangMasukModel.view();
    }
    
    // mengambil data barang melalui model
    public BarangMasukEntity07223 barangMasukEntity() {
        return AllObjectModel07223.barangMasukModel.showDataBarang(indexLogin);
    }
}
