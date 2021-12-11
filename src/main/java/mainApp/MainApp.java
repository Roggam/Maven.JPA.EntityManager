package mainApp;

import entities.Artist;
import entities.CD;
import services.CDRepo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainApp {
    public static void main(String[] args) {
  CD cd = new CD();
        cd.setPrice(100);
        cd.setYear(2022);
        cd.setTitle("Gangstagrass");
        cd.setDesc("rock");
        cd.setArtist("Dolio");


        Artist artist = new Artist();
        artist.setFirst_name("Dolio");
        artist.setLast_name("Durant");
        artist.setInstrument("Guitar");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pul");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
           em.persist(artist);
           em.getTransaction().commit();
//       CD cd = em.find(CD.class, 1);
//        System.out.println(cd);
    }


}
