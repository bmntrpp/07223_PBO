package Entity07223;

public class DaftarBarangEntity07223 {
    
    private BarangKeluarEntity07223 keluar;
    private boolean isVerified;
    private int indexBarang;

    public DaftarBarangEntity07223(int indexBarang, BarangKeluarEntity07223 keluar, boolean isVerified) {
        this.keluar = keluar;
        this.isVerified = isVerified;
        this.indexBarang = indexBarang;
    }

    public BarangKeluarEntity07223 getKeluar() {
        return keluar;
    }

    public void setKeluar(BarangKeluarEntity07223 keluar) {
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
