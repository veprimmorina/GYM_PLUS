/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import BLL.Fees;
import java.util.List;
import javax.persistence.Query;
public class FeesRepository extends EntMngClass implements FeesInterface {

    @Override
    public void create(Fees f) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.persist(f);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CrudFormException ("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Fees f) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.merge(f);
            em.getTransaction().commit();           
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Fees f) throws CrudFormException {
        try{
            em.getTransaction().begin();
            em.remove(f);
            em.getTransaction().commit();
        }catch (Exception e){
            throw new CrudFormException ("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Fees> findAll() throws CrudFormException {
        try{
            return em.createNamedQuery("Fees.findAll").getResultList();
        }catch(Exception e){
            throw new CrudFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Fees findByID(Integer ID) throws CrudFormException {
        try{
            Query query= em.createQuery("SELECT p FROM Fees p WHERE p.ID= :abc");
            query.setParameter("abc", ID);
            return (Fees) query.getSingleResult();
        }catch(Exception e) {
            throw new CrudFormException ("Msg \n" + e.getMessage());
        }
    }
    
}
