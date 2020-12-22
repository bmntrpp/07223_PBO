package Entity;

public class DaftarprakEntity07223 {
    private PraktikanEntity07223 praktikan;
    private boolean isVerified;
    private int indexPraktikum;

    public DaftarprakEntity07223(int indexPraktikum,PraktikanEntity07223 praktikan, boolean isVerified) {
        this.praktikan = praktikan;
        this.isVerified = isVerified;
        this.indexPraktikum = indexPraktikum;
    }
    
    public PraktikanEntity07223 getPraktikan() {
        return this.praktikan;
    }
    
    public void setPraktikan(PraktikanEntity07223 praktikan) {
        this.praktikan = praktikan;
    }
    
    public boolean isVerified() {
        return isVerified;
    }
    
    public void setVerified(boolean verified) {
        this.isVerified = verified;
    }
    
    public int getIndexPrak() {
        return indexPraktikum;
    }
    
    public void setIndexPrak(int indexPrak) {
        this.indexPraktikum = indexPrak;
    }
}
