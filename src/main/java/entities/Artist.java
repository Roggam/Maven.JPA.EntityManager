package entities;

import javax.persistence.*;

@Entity
@Table(name = "Artist", schema = "JpaDB")
public class Artist {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String first_name;
    private String last_name;
    private String instrument;

    public Artist(){

    }

    public Artist(String first_name, String last_name, String instrument) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.instrument = instrument;
    }

    public Artist(Integer id, String first_name, String last_name, String instrument) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.instrument = instrument;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", instrument='" + instrument + '\'' +
                '}';
    }
}
