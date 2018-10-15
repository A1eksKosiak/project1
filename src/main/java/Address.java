import javax.persistence.*;

@Entity
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long Id;
    @Column (name="city")
    private String city;
    @Column(name="street")
    private String street;
    @Column (name="number")
    private Integer number;

    public Address() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
