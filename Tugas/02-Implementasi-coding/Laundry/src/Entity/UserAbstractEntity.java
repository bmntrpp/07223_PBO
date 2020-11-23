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
public abstract class UserAbstractEntity {
    protected String id, password,nama;
    protected Date tglLahir;
    
    public UserAbstractEntity(String id, String password, String nama){
        
        this.id = id;
        this.password = password;
        this.nama = nama;
        
    }
    public UserAbstractEntity(){
        
    }
    public abstract String getId();
    public void setId(String id){
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

 

}
