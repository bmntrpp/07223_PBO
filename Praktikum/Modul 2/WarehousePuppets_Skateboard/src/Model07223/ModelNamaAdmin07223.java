package Model07223;

import Entity07223.NamaAdmin07223;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class ModelNamaAdmin07223 {
    private ArrayList<NamaAdmin07223> NamaAdmin07223ArrayList;
  
    public ModelNamaAdmin07223() {
        NamaAdmin07223ArrayList = new ArrayList<NamaAdmin07223>();
        
    }
    public ArrayList<NamaAdmin07223> getListNamaAdmin07223(){
       return NamaAdmin07223ArrayList;
    }
    public void DataAdmin() {
       String Admin []    = {"Aldo","Bima","Tara","Putras"};
       String Password [] = {"01","02","03","04"};

        for(int i = 0; i < Admin.length; i++) {
            NamaAdmin07223ArrayList.add(new NamaAdmin07223(Admin[i],Password[i]));
        }
    }
}