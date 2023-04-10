/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import BLL.Traineri;
import java.util.List;

public interface TraineriInterface {
    void create (Traineri t) throws CrudFormException;
    void edit (Traineri t) throws CrudFormException;
    void delete (Traineri t) throws CrudFormException;
    List <Traineri> findAll() throws CrudFormException;
    Traineri findByID (Integer ID) throws CrudFormException;
}
