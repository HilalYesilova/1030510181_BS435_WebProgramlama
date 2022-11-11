package org.webp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Table(name = "COMPANY")
@Entity
public class Company {

    @Column(name = "CompanyID")
    @Id
    @GeneratedValue
    private Long CompanyID;

    @Column(name = "Name")
    @NotBlank
    @Size(max=50)
    private String Name;

    @Column(name = "CarID")
    private Long CarID;

    @Column(name = "CompanyCiy")
    @Size(max=50)
    private String CompanyCiy;

    @Column(name = "CarLimit")
    private Long CarLimit;


    public Company(){}

    public Long getCompanyID() {
        return CompanyID;
    }

    public void setCompanyID(Long CompanyID) {
        this.CompanyID = CompanyID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Long getCarID() {
        return CarID;
    }

    public void setCarID(String CarID) {
        this.CarID = Long.valueOf(CarID);
    }

    public String getCompanyCiy() {
        return CompanyCiy;
    }

    public void setCompanyCiy(String CompanyCiy) {
        this.CompanyCiy = CompanyCiy;
    }

    public Long getCarLimit() {
        return CarLimit;
    }

    public void setCarLimit(String CarLimit) {
        this.CarLimit = Long.valueOf(CarLimit);
    }

}

