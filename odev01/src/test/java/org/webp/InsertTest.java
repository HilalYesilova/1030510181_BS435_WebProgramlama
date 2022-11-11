package org.webp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InsertTest {

    private EntityManagerFactory factory;
    private EntityManager em;

    @BeforeEach
    public void init() {
        factory = Persistence.createEntityManagerFactory("Hibernate");
        em = factory.createEntityManager();
    }

    @AfterEach
    public void tearDown() {
        em.close();
        factory.close();
    }

    private boolean persistInATransaction(Object obj) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            em.persist(obj);
            tx.commit();
        } catch (Exception e) {
            System.out.println("FAILED TRANSACTION: " + e.toString());
            tx.rollback();
            return false;
        }

        return true;
    }


    @Test
    public void insertCar() {

        Cars car = new Cars();
        car.setCarID(101L);
        car.setName("AUDI");

        boolean persisted = persistInATransaction(car);
        assertTrue(persisted);
    }

    @Test
    public void insertCompany() {

        Company company = new Company();
        company.setCompanyID(12L);
        company.setName("Hilal AŞ");

        boolean persisted = persistInATransaction(company);
        assertTrue(persisted);
    }

    @Test
    public void insertDriver() {

        Driver driver = new Driver();
        driver.setID(0151L);
        driver.setName("Hilal Yeşilova");
        driver.setDriverLicense("ABC0123");

        boolean persisted = persistInATransaction(driver);
        assertTrue(persisted);

        Driver driver2 = new Driver();
        driver2.setID(1884L);
        driver2.setName("Yeşilova Hilal");
        driver2.setDriverLicense("123ABC");

        boolean persisted2 = persistInATransaction(driver);
        assertTrue(persisted2); //hata alırız aynı id'ye sahip bir sürücü mevcuttur.

    }



}
