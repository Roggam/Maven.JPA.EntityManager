package mainApp;

import entities.Artist;
import entities.CD;
import services.ArtistService;
import services.CDService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainApp {
    public static void main(String[] args) {

        CDService cdService = new CDService();


        CD cd = new CD();
        cd.setPrice(100);
        cd.setYear(2025);
        cd.setTitle("Gangstagrass");
        cd.setDesc("HIP-HOP");
        cd.setArtist("Dolio");

         //System.out.println( cdService.findById(2)); //WORKS
        //cdService.create(cd); //WORKS
        // cdService.update(2,cd); //WORKS
        // cdService.deleteById(3); //WORKS
        // System.out.println(cdService.findAll()); //WORKS

        ArtistService artistService = new ArtistService();
        Artist artist = new Artist();
        artist.setFirst_name("Leon");
        artist.setLast_name("Hunter");
        artist.setInstrument("Piano");


        // artistService.create(artist); //WORKS
        //artistService.deleteById(3); //WORKS
        //System.out.println(artistService.findById(2)); //WORKS
        //System.out.println(artistService.findAll()); //WORKS


//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pul");   //TESTING
//        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//           em.persist(artist);
//           em.getTransaction().commit();
//       CD cd = em.find(CD.class, 1);
//        System.out.println(cd);


    }


}
