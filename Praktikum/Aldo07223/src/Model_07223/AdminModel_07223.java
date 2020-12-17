/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_07223;

import Entity_07223.AdminEntity_07223;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
/**
 *
 * @author aldo
 */
public class AdminModel_07223 implements Modelinterfaces_07223
{
    private ArrayList<AdminEntity_07223> adminEntity_07223ArrayList;
    public AdminModel_07223()
    {
        adminEntity_07223ArrayList = new ArrayList<AdminEntity_07223>();
    }
    
    public void insertAdmin(AdminEntity_07223 admin)
    {
        adminEntity_07223ArrayList.add(admin);
    }
    
    @Override
    public void view()
    {
        for(AdminEntity_07223 adminEntity : adminEntity_07223ArrayList)
        {
            System.out.print(adminEntity.getId());
            System.out.print(adminEntity.getNama());
            System.out.print(adminEntity.getPassword());
            System.out.println();
            
        }
    }
    public int cekData(String id, String password)
    {
      int loop = 0;
      for(AdminEntity_07223 adminEntity : adminEntity_07223ArrayList)
      {
          if(adminEntity.getId().equals(id) && adminEntity.getPassword().equals(password)){
          break;
      }
          else
          {
            loop++;
          }
      }
      return loop;
    }
    public AdminEntity_07223 showDataAdmin(int index)
    {
        return adminEntity_07223ArrayList.get(index);
    }
}
