package org.webp;


import org.eclipse.persistence.jpa.jpql.parser.DateTime;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

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
    private String CarModelYear;

    @Column(name = "CarClass")
    private String CarClass;

    public Cars() {
    }

    public Long getCarID() {
        return CarID;
    }

    public void setCarID(Long CarID) {
        this.CarID = CarID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCarModelYear() {
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
