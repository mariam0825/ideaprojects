package com.lastma.data.repositories;

import com.lastma.data.models.Driver;

import java.util.ArrayList;
import java.util.List;

public class DriverRepositoryImpl implements DriverRepository {
   private List<Driver> drivers = new ArrayList<>();
   private int numberOfDrivers = 0;

    @Override
    public Driver save(Driver driver) {
    driver.setId(++numberOfDrivers);
    drivers.add(driver);
    return driver;
    }

    @Override
    public long count() {
        return numberOfDrivers;
    }

//    @Override
//    public Driver findByid() {
//        return null;
//    }
}
