package Entity07223;

import java.util.Date;

public abstract class AbstractBarang07223 {
     protected String kode, jenis, harga;
    protected Date tanggal;

    public AbstractBarang07223(String kode, String jenis, String harga,Date tanggal) {
        this.kode    = kode;
        this.jenis   = jenis;
        this.harga   = harga;
        this.tanggal = tanggal;
    }

    public AbstractBarang07223() {
        
    }
    
    public abstract String getKode();

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
    
}
