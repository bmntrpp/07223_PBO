package Entity07223;

import java.util.Date;

public class BarangKeluarEntity07223 extends AbstractBarangEntity07223 {
    private String kota;
    
    public BarangKeluarEntity07223 (String kode, String jenis, String harga,Date tanggal,String kota){
        super (kode,jenis,harga,tanggal);
        this.kota = kota;
    }
    
    public BarangKeluarEntity07223() {
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