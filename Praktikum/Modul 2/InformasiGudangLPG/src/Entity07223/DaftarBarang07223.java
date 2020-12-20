package Entity07223;

public class DaftarBarang07223 {
    
    private BarangKeluar07223 keluar;
    private boolean isVerified;
    private int indexBarang;

    public DaftarBarang07223(int indexBarang, BarangKeluar07223 keluar, boolean isVerified) {
        this.keluar = keluar;
        this.isVerified = isVerified;
        this.indexBarang = indexBarang;
    }

    public BarangKeluar07223 getKeluar() {
        return keluar;
    }

    public void setKeluar(BarangKeluar07223 keluar) {
        this.keluar = keluar;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setIsVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public int getIndexBarang() {
        return indexBarang;
    }

    public void setIndexBarang(int indexBarang) {
        this.indexBarang = indexBarang;
    }

    
}
