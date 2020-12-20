/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity_07223;

import java.util.Date;
/**
 *
 * @author aldo
 */
public class AdminEntity_07223 extends PesertaAbstractEntity_07223
{
    public AdminEntity_07223 (String id,String password,String nama)
    {
        super(id,password,nama);
    }
    
    @Override
    public String getId()
    {
        return id;
    }
}
