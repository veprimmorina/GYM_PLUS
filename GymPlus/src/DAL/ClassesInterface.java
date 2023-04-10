/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;


import BLL.Classes;
import java.util.List;
public interface ClassesInterface {
    void create (Classes c) throws CrudFormException;
    void edit (Classes c) throws CrudFormException;
    void delete (Classes c) throws CrudFormException;
    List<Classes> findAll() throws CrudFormException;
    Classes findByID(Integer ID) throws CrudFormException;
}
