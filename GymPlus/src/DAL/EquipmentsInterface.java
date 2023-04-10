/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;



import BLL.Equipments;
import java.util.List;
public interface EquipmentsInterface   {
    void create (Equipments eq) throws CrudFormException;
    void edit( Equipments eq) throws CrudFormException;
    void delete (Equipments eq) throws CrudFormException;
    List <Equipments> findAll() throws CrudFormException;
    Equipments findByID (Integer ID) throws CrudFormException;
}
