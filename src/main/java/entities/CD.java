package entities;

import javax.persistence.*;

@Entity
@Table(name = "CD", schema = "JpaDB")
public class CD {
  @Id
  @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;
    private Integer price;
    private Integer year;
    private String title;
    private String description;
    private String artist;


    public CD(){

    }


    public CD(Integer price, Integer year, String title, String description, String artist) {
        this.price = price;
        this.year = year;
        this.title = title;
        this.description = description;
        this.artist = artist;
    }

    public CD(Integer id, Integer price, Integer year, String title, String desc, String artist) {
        this.id = id;
        this.price = price;
        this.year = year;
        this.title = title;
        this.description = desc;
        this.artist = artist;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return description;
    }

    public void setDesc(String desc) {
        this.description = desc;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "CD{" +
                "id=" + id +
                ", price=" + price +
                ", year=" + year +
                ", title='" + title + '\'' +
                ", desc='" + description + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
