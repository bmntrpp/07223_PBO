package Model07223;

import Entity07223.NamaAdminEntity07223;
import java.util.ArrayList;

public class ModelNamaAdmin07223 {
    private ArrayList<NamaAdminEntity07223> NamaAdmin07223ArrayList;
  
    public ModelNamaAdmin07223() {
        NamaAdmin07223ArrayList = new ArrayList<NamaAdminEntity07223>();
        
    }
    
    // menampilkan daftar admin
    public ArrayList<NamaAdminEntity07223> getListNamaAdmin07223(){
       return NamaAdmin07223ArrayList;
    }
    
    // insert data admin dengan parameter object data admin
    public void insertAdmin(NamaAdminEntity07223 admin) {
        NamaAdmin07223ArrayList.add(admin);
    }
}