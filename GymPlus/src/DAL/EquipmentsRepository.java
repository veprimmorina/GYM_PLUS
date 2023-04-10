/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Equipments;
import java.util.List;
import javax.persistence.Query;
public class EquipmentsRepository extends EntMngClass implements EquipmentsInterface {

    @Override
    public void create(Equipments eq) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.persist(eq);
            em.getTransaction().commit();
        }catch (Exception e){
            throw new CrudFormException ("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Equipments eq) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.merge(eq);
            em.getTransaction().commit();
        }catch (Exception e) {
            throw new CrudFormException ("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Equipments eq) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.remove(eq);
            em.getTransaction().commit();
        }catch (Exception e) {
            throw new CrudFormException ("Msg \n" + e.getMessage());
        }
    }
    

    @Override
    public List<Equipments> findAll() throws CrudFormException {
       try{
           return em.createNamedQuery("Equipments.findAll").getResultList();
       }catch (Exception e) {
           throw new CrudFormException ("Msg \n" + e.getMessage());
       }
    }
    

    @Override
    public Equipments findByID(Integer ID) throws CrudFormException {
        try{
            Query query= em.createQuery("SELECT p FROM Equipments p WHERE p.ID= :abc" );
            query.setParameter("abc", ID);
            return(Equipments) query.getSingleResult();
        }catch (Exception e){
            throw new CrudFormException ("Msg \n" + e.getMessage());
        }
    }
    
    
}
