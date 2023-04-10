/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Traineri;
import java.util.List;
import javax.persistence.Query;
public class TraineriRepository extends EntMngClass implements TraineriInterface {

    @Override
    public void create(Traineri t) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.persist(t);
            em.getTransaction().commit();
        }catch (Exception e){
            throw new CrudFormException ("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Traineri t) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.merge(t);
            em.getTransaction().commit();
        }catch (Exception e){
            throw new CrudFormException ("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Traineri t) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.remove(t);
            em.getTransaction().commit();
        }catch (Exception e){
            throw new CrudFormException ("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Traineri> findAll() throws CrudFormException {
        try{
            return em.createNamedQuery("Traineri.findAll").getResultList();
   
        }catch (Exception e){
            throw new CrudFormException ("Msg \n" + e.getMessage());
        }
    }
    /*
    Query query= em.createQuery("SELECT p FROM Fees p WHERE p.ID= :abc");
            query.setParameter("abc", ID);
            return (Fees) query.getSingleResult();
    */

    @Override
    public Traineri findByID(Integer ID) throws CrudFormException {
        try{
            Query query= em.createQuery("SELECT p FROM Traineri p WHERE p.ID=: abc");
            query.setParameter("abc", ID);
            return (Traineri) query.getSingleResult();
        }catch (Exception e){
            throw new CrudFormException ("Msg \n" + e.getMessage());
        }
    }
    
}
