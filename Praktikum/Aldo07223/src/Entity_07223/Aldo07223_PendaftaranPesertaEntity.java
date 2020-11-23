package Entity_07223;

public class Aldo07223_PendaftaranPesertaEntity {
    private Aldo07223_PesertaEntity peserta;
    private boolean isVerified;
    private int indexUCL;

    public Aldo07223_PendaftaranPesertaEntity(int indexUCL, Aldo07223_PesertaEntity peserta, boolean isVerified) {
        this.peserta = peserta;
        this.isVerified = isVerified;
        this.indexUCL = indexUCL;
}
    
 public Aldo07223_PesertaEntity getPeserta() {
        return peserta;
    }

    public void setPeserta(Aldo07223_PesertaEntity peserta) {
        this.peserta = peserta;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public int getIndexUCLTeam() {
        return indexUCL;
    }

    public void setIndexUCLTeam(int indexUCL) {
        this.indexUCL = indexUCL;
    }
}


   