/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;


import BLL.Fees;
import java.util.List;
public interface FeesInterface {
    void create (Fees f) throws CrudFormException;
    void edit (Fees f) throws CrudFormException;
    void delete (Fees f) throws CrudFormException;
    List <Fees> findAll() throws CrudFormException;
    Fees findByID (Integer ID) throws CrudFormException;
            
}
