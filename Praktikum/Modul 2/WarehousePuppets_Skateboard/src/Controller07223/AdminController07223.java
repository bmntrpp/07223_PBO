package Controller07223;

import Entity07223.NamaAdminEntity07223;
import Entity07223.BarangKeluarEntity07223;
import java.util.Date;
import java.util.ArrayList;

public class AdminController07223 implements ControllerInterface07223{
    int indexLogin = 0;
    
    public AdminController07223(){
    }
    
    public void DataAdmin(){
       String Admin []    = {"Aldo","Bima","Tara","Putras"};
       String Password [] = {"01","02","03","04"};

        for(int i = 0; i < Admin.length; i++) {
            NamaAdmin07223ArrayList.add(new NamaAdminEntity07223(Admin[i],Password[i]));
        }
    }
    
    public void
    }
