/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.util.List;
import BLL.Personi;
public interface PersoniInterface {
    void create(Personi p) throws CrudFormException;
    void edit(Personi p) throws CrudFormException;
    void delete(Personi p) throws CrudFormException;
    List<Personi> findAll() throws CrudFormException;
    Personi findByID (Integer ID) throws CrudFormException;
    
}
