/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;


import BLL.Classes;
import java.util.List;
import javax.persistence.Query;

public class ClassesRepository extends EntMngClass implements ClassesInterface {

    @Override
    public void create(Classes c) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
        }catch (Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Classes c) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.merge(c);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException ("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Classes c) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.remove(c);
            em.getTransaction().commit();
        }catch (Exception e){
            throw new CrudFormException ("Msg \n" + e.getMessage());
        }
    }
    

    @Override
    public List<Classes> findAll() throws CrudFormException {
        try{
            return em.createNamedQuery("Classes.findAll").getResultList();
        }catch(Exception e){
            throw new CrudFormException ("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Classes findByID(Integer ID) throws CrudFormException {
        try{
            Query query= em.createQuery("SELECT p FROM Classes p WHERE p.ID= :abc");
            query.setParameter("abc", ID);
            return(Classes) query.getSingleResult();
        }catch(Exception e) {
            throw new CrudFormException ("Msg \n" + e.getMessage());
        }
    }
    
}
