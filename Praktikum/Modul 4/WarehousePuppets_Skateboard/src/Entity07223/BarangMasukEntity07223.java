package Entity07223;

import java.util.Date;

public class BarangMasukEntity07223 extends AbstractBarangEntity07223 {
    private String gudang;
    
    public BarangMasukEntity07223 (String kode, String jenis, String harga,Date tanggal,String gudang){
        super (kode,jenis,harga,tanggal);
        this.gudang = gudang;
    }
    
    public BarangMasukEntity07223() {
    }

    @Override

    public String getKode() {
        return kode;
    }

    public String getGudang() {
        return gudang;
    }
    public void gudang(String gudang){
        this.gudang = gudang;
    }
           
}