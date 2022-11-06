package org.webp;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Driver")
@Entity
public class Driver {

    @Column(name = "ID")
    @Id
    @GeneratedValue
    private Long ID;

    @Column(name = "Name")
    @NotBlank
    @Size(max = 50)
    private String Name;

    @Column(name = "CompanyID")
    private Long CompanyID;

    @Column(name = "CarID")
    private Long CarID;

    @Column(name = "DriverLicense")
    @NotBlank
    @Size(max = 50)
    private String DriverLicense;

    public Driver() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Long getCompanyID() {
        return CompanyID;
    }

    public void setCompanyID(Long CompanyID) {
        this.CompanyID = CompanyID;
    }

    public Long getCarID() {
        return CarID;
    }

    public void setCarID(String CarID) {
        this.CarID = CarID;
    }

    public String getDriverLicense() {
            return DriverLicense;
        }

    public void setDriverLicense(String DriverLicense) {
        this.DriverLicense = DriverLicense;
    }

}
