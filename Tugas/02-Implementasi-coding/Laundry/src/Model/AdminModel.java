/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Entity.AdminEntity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


/**
 *
 * @author nolife
 */
public class AdminModel implements Modelinterfaces{
    private ArrayList<AdminEntity> adminEntityArrayList;
    public AdminModel(){
        adminEntityArrayList = new ArrayList<AdminEntity>();
    }
    
    public void insertAdmin(AdminEntity admin){
        adminEntityArrayList.add(admin);
    }
    
    @Override
    public void view(){
        for(AdminEntity adminEntity : adminEntityArrayList){
            System.out.print(adminEntity.getId());
            System.out.print(adminEntity.getNama());
            System.out.print(adminEntity.getPassword());
            System.out.println();
            
        }
    }
    public int cekData(String id, String password){
      int loop = 0;
      for(AdminEntity adminEntity : adminEntityArrayList){
          if(adminEntity.getId().equals(id) && adminEntity.getPassword().equals(password)){
          break;
      }else{
              loop++;
              }
      }
      return loop;
    }
    public AdminEntity showDataAdmin(int index){
        return adminEntityArrayList.get(index);
    }
}
