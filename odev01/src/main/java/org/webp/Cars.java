package org.webp;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "CARS")
@Entity
public class Cars {

    @Column(name = "CarID")
    @Id
    @GeneratedValue
    private Long CarID;

    @Column(name = "Name")
    @NotBlank
    @Size(max = 50)
    private String Name;

    @Column(name = "CarModelYear")
    @DateTimeFormat("dd/MM/yyyy")
    private Date CarModelYear;

    @Column(name = "CarClass")
    private String CarClass;

    public Cars() {
    }

    public Long getCarID() {
        return CarID;
    }

    public void setCarID(Long CarID) {
        this.CarID = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Date getCarModelYear() {
        return CarModelYear;
    }

    public void setCarModelYear(String CarModelYear) {
        this.CarModelYear = CarModelYear;
    }

    public String getCarClass() {
        return CarClass;
    }

    public void setCarClass(String CarClass) {
        this.Name = CarClass;
    }

}
