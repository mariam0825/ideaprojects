package com.lastma.data.repositories;

import com.lastma.data.models.Driver;

public interface DriverRepository {
    Driver save(Driver driver);


    long count();

//    Driver findByid();
}
