/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author nolife
 */
public class AdminEntity extends UserAbstractEntity{
    public AdminEntity(String id, String password, String nama){
        super(id,password,nama);
    }
    
   
 @Override
    public String getId() {
        return id;
    }
    
    
}
