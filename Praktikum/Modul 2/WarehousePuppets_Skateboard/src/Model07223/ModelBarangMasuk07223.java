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

    public ModelBarangMasuk07223(String kodeAdmin, String passwordAdmin, String namaAdmin, String notelpAdmin, Date date, String gudang) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void insertBarang(BarangMasukEntity07223 Barang ) {
        BarangMasuk07223ArrayList.add(Barang);
    }
    
    public void update(int index, BarangMasukEntity07223 barangMasuk07223) {
        BarangMasuk07223ArrayList.set(index,(BarangMasukEntity07223) barangMasuk07223);
    }

    public void remove(int index) {
        BarangMasuk07223ArrayList.remove(index);
    }

    @Override
    public void view() {
        if(BarangMasuk07223ArrayList.isEmpty()) {
            System.out.println("Data Barang Masuk Kosong!");
        } else {
            int i=0;
            for (BarangMasukEntity07223 barangmasuk07223 : BarangMasuk07223ArrayList) {
                System.out.println("\nData Barang Ke "+i);
                System.out.println("===============================================================");
                System.out.println(" Kode Barang : " + barangmasuk07223.getKode()
                        + "\n Jenis Barang : " + barangmasuk07223.getJenis()
                        + "\n Harga Barang : " + barangmasuk07223.getHarga()
                        + "\n Tanggal Barang : " + new SimpleDateFormat("dd-MM-yyyy").format(barangmasuk07223.getTanggal())
                        + "\n Gudang : " + barangmasuk07223.getGudang());
                System.out.println("===============================================================");
                i++;
            }
        }
    }

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
    
    public BarangMasukEntity07223 showDataBarang(int index){
        return BarangMasuk07223ArrayList.get(index);
    }
}
