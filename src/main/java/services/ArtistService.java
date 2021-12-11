package services;

import entities.Artist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class ArtistService {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pul");
    EntityManager em = emf.createEntityManager();

    public Artist findById(Integer id) {
        return em.find(Artist.class, id);

    }

    public List<Artist> findAll() {
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Artist> cdCriteriaQuery = criteriaBuilder.createQuery(Artist.class);
        Root<Artist> rootEntry = cdCriteriaQuery.from(Artist.class);
        CriteriaQuery<Artist> all = cdCriteriaQuery.select(rootEntry);
        TypedQuery<Artist> allQuery = em.createQuery(all);
        return allQuery.getResultList();

    }

    public void create(Artist cd) {
        em.getTransaction().begin();
        em.persist(cd);
        em.getTransaction().commit();
    }

    public void update(Integer id, Artist cd) {
        Artist update = em.find(Artist.class, id); //finds Id to update

        update.setFirst_name(cd.getFirst_name());//sets new values
        update.setLast_name(cd.getLast_name());
        update.setInstrument(cd.getInstrument());

        em.getTransaction().begin();
        em.persist(update);
        em.getTransaction().commit();

    }

    public void deleteById(Integer id){
        Artist remove = em.find(Artist.class, id);

        em.getTransaction().begin();
        em.remove(remove);
        em.getTransaction().commit();

    }


}
