package Controller07223;

import Entity07223.NamaAdminEntity07223;
import java.util.Date;

public class AdminController07223 implements ControllerInterface07223{    
    int indexLogin = 0;
    public AdminController07223(){
    }
    
    // insert data admin
    public void DataAdmin(){
        String Admin []    = {"Aldo","Bima","Tara","Putras"};
        String Password [] = {"01","02","03","04"};

        for(int i = 0; i < Admin.length; i++) {
            // proses insert data dari view(main) -> controller -> model
            NamaAdminEntity07223 namaAdmin = new NamaAdminEntity07223();
            namaAdmin.setAdmin(Admin[i]);
            namaAdmin.setPassword(Password[i]);
            AllObjectModel07223.adminModel.insertAdmin(namaAdmin);
        }
    }

    @Override
    public void login(String Admin, String Password) {
        indexLogin = AllObjectModel07223.adminModel.cekData(Admin,Password);
    }
    public NamaAdminEntity07223 adminEntity() {
        return AllObjectModel07223.adminModel.showData(indexLogin);
    }
}