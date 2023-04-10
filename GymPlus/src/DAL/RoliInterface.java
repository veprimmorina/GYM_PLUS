/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;


import BLL.Roli ;
import java.util.List;
public interface RoliInterface {
    void create(Roli r) throws CrudFormException;
    void edit (Roli r) throws CrudFormException;
    void delete (Roli r) throws CrudFormException;
    List <Roli> findAll() throws CrudFormException;
    Roli findByID (Integer ID) throws CrudFormException;
}
