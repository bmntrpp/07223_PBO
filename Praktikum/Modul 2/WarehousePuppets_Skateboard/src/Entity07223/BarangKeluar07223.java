package Entity07223;

import java.util.Date;

public class BarangKeluar07223 extends AbstractBarang07223 {
    private String kota;
    
     public BarangKeluar07223 (String kode, String jenis, String harga,Date tanggal,String kota){
        super (kode,jenis,harga,tanggal);
        this.kota = kota;
    }
     
    @Override

    public String getKode() {
        return kode;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }
    
    
}
