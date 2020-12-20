package Model07223;

import Entity07223.BarangKeluar07223;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class ModelBarangKeluar07223 implements Interfaces07223 {
    private ArrayList<BarangKeluar07223> BarangKeluar07223ArrayList;

    public ModelBarangKeluar07223() {
        BarangKeluar07223ArrayList = new ArrayList<BarangKeluar07223>();
    }

    public void insert(BarangKeluar07223 barangkeluar07223) {
        BarangKeluar07223ArrayList.add(barangkeluar07223);
    }
    
    public void update(int index, BarangKeluar07223 barangKeluar07223) {
        BarangKeluar07223ArrayList.set(index,(BarangKeluar07223) barangKeluar07223);
    }

    public void remove(int index) {
        BarangKeluar07223ArrayList.remove(index);
    }

    @Override
    public void view() {
        if(BarangKeluar07223ArrayList.isEmpty()) {
            System.out.println("Data Barang Keluar Kosong!");
        } else {
            int i=0;
            for (BarangKeluar07223 barangkeluar07223 : BarangKeluar07223ArrayList) {
                System.out.println("\nData Barang Ke "+i);
                System.out.println("===============================================================");
                System.out.println(" Kode Barang : " + barangkeluar07223.getKode()
                        + "\n Jenis Barang : " + barangkeluar07223.getJenis()
                        + "\n Harga Barang : " + barangkeluar07223.getHarga()
                        + "\n Tanggal Barang : " + new SimpleDateFormat("dd-MM-yyyy").format(barangkeluar07223.getTanggal())
                        + "\n Kota : " + barangkeluar07223.getKota());
                System.out.println("===============================================================");
                i++;
            }
        }
    }

    @Override
    public int cekData(String kode) {
        int loop = 0;
        while (!BarangKeluar07223ArrayList.get(loop).getKode().equals(kode)) {
            loop++;
        }
        return loop;
    }
    
    public BarangKeluar07223 getBarangKeluarArrayList(int index){
        return BarangKeluar07223ArrayList.get(index);
    }
}
