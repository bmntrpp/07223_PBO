package Model07223;

import Entity07223.DaftarBarang07223;
import Entity07223.NamaAdmin07223;
import Model07223.ModelNamaAdmin07223;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class ModelDaftarBarang07223 implements Interfaces07223 {
    private ArrayList<DaftarBarang07223> daftarBarang07223ArrayList;
    private DaftarBarang07223 daftarBarang07223;
    
    ModelNamaAdmin07223 modeladmin = new ModelNamaAdmin07223();

    public ModelDaftarBarang07223() {
        daftarBarang07223ArrayList = new ArrayList<DaftarBarang07223>();
    }

    public void insertDataDaftar(DaftarBarang07223 daftarBarang07223) {
        daftarBarang07223ArrayList.add(daftarBarang07223);
    }

    public ArrayList<DaftarBarang07223> getDaftarBarangArrayList() {
        return daftarBarang07223ArrayList;
    }

    @Override
    public void view() {
         for (DaftarBarang07223 daftarBarang07223 : daftarBarang07223ArrayList) {
            System.out.println("===============================================================");
            System.out.println(" Kode Barang : " + daftarBarang07223.getKeluar().getKode()
                    + "\n Jenis Barang : " + daftarBarang07223.getKeluar().getJenis()
                    + "\n Harga Barang : " + daftarBarang07223.getKeluar().getHarga()
                    + "\n Tanggal Barang : " + new SimpleDateFormat("dd-MM-yyyy").format(daftarBarang07223.getKeluar().getTanggal())
                    + "\n Nama Admin : " + modeladmin.getListNamaAdmin07223().get(daftarBarang07223.getIndexBarang())
                    + "\n IsVerified : ");
            if (daftarBarang07223.isVerified() == false) {
                System.out.println("Belum Di Verifikasi Admin");
            } else {
                System.out.println("Telah Di Verifikasi");
            }
            System.out.println("===============================================================");
        }
    }

    @Override
    
        public int cekData(String kode) {
        int loop = 0;
        if (daftarBarang07223ArrayList.size() == 0) {
            loop = -1;//data kosong
        } else {
            for (int i = 0; i < daftarBarang07223ArrayList.size(); i++) {
                if (daftarBarang07223ArrayList.get(i).getKeluar().getKode().equals(kode)) {
                    loop = i;
                    break;
                } else {
                    loop = -2;
                }
            }
        }
        return loop;
    }

    public DaftarBarang07223 showDaftarBarang(int index) {
        return daftarBarang07223ArrayList.get(index);
    }
    
    public void updateIsVerified(int index,DaftarBarang07223 daftarBarang07223){
        daftarBarang07223ArrayList.set(index,daftarBarang07223);
    }
    
    }
        
