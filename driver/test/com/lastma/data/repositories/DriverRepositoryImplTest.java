package com.lastma.data.repositories;

import com.lastma.data.models.Driver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverRepositoryImplTest {
    private   DriverRepositoryImpl driverRepository;
    private Driver driver;

    @BeforeEach
    void setup(){
        driverRepository = new DriverRepositoryImpl();
        driver = new Driver();
    }


    @Test
    public void testThat_whenISaveOneDriverCountIsOne(){
        driverRepository.save(driver);
        assertEquals(1L, driverRepository.count());

    }

    @Test
    public void testThat_WhenISavesTwoDriverCountIsTwo(){
        assertEquals(0L, driverRepository.count());
        Driver driverTwo = new Driver();
        driverRepository.save(driverTwo);
        driverRepository.save(driver);
        assertEquals(2L, driverRepository.count());

    }
    @Test
    public void testThat_whenIsaveDriver_IdIsSaved(){
        driverRepository.save(driver);
        assertEquals(1,driver.getId());
    }
//    @Test
//    public void testThat_whenIFindByIdDriverIsFound(){
//        driver. setId(1);
//        driverRepository.save(driver);
//        assertEquals(driver,driverRepository.findByid());
//    }


}