package Entity07223;

import java.util.Date;

public class BarangMasuk07223 extends AbstractBarang07223 {
    private String gudang;
    
    public BarangMasuk07223 (String kode, String jenis, String harga,Date tanggal,String gudang){
        super (kode,jenis,harga,tanggal);
        this.gudang = gudang;
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
