/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.util.List;
import BLL.Personi;
import javax.persistence.Query;
public class PersoniRepository extends EntMngClass implements PersoniInterface{

    @Override
    public void create(Personi p) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            
        }catch (Exception e) {
            throw new CrudFormException ("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Personi p) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException ("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Personi p) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
        }catch (Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Personi> findAll() throws CrudFormException {
        try{
            return em.createNamedQuery("Personi.findAll").getResultList();
        }catch (Exception e){
            throw new CrudFormException ("Msg \n" + e.getMessage());
        }
    }
    /*
    try {
        Query query= em.createQuery("SELECT p FROM Roli p WHERE p.ID = :abc");
        query.setParameter("abc", ID);
        return(Roli) query.getSingleResult();
    }catch (Exception e) {
    */

    @Override
    public Personi findByID(Integer ID) throws CrudFormException {
        try{
            Query query= em.createQuery("SELECT p FROM Peroni p WHERE p.ID=: abc");
            query.setParameter("abc", ID);
            return (Personi) query.getSingleResult();
        }catch (Exception e){
            throw new CrudFormException ("Msg \n" + e.getMessage());
        }
    }
    
}
