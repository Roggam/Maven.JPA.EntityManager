package services;

import entities.CD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class CDService {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pul");
    EntityManager em = emf.createEntityManager();

    public CD findById(Integer id) {
        return em.find(CD.class, id);

    }

    public List<CD> findAll() {
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<CD> cdCriteriaQuery = criteriaBuilder.createQuery(CD.class);
        Root<CD> rootEntry = cdCriteriaQuery.from(CD.class);
        CriteriaQuery<CD> all = cdCriteriaQuery.select(rootEntry);
        TypedQuery<CD> allQuery = em.createQuery(all);
        return allQuery.getResultList();

    }

    public void create(CD cd) {
        em.getTransaction().begin();
        em.persist(cd);
        em.getTransaction().commit();
    }

    public void update(Integer id, CD cd) {
     CD update = em.find(CD.class, id); //finds Id to update

        update.setPrice(cd.getPrice());//sets new values
        update.setYear(cd.getYear());
        update.setTitle(cd.getTitle());
        update.setDesc(cd.getDesc());
        update.setArtist(cd.getArtist());


        em.getTransaction().begin();
        em.persist(update);
        em.getTransaction().commit();

    }

    public void deleteById(Integer id){
       CD remove = em.find(CD.class, id);

       em.getTransaction().begin();
       em.remove(remove);
       em.getTransaction().commit();

    }

//source https://www.youtube.com/watch?v=otinfgwkMbY
}
