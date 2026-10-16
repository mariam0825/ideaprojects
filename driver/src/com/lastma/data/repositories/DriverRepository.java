package com.lastma.data.repositories;

import com.lastma.data.models.Driver;

public interface DriverRepository {
    Driver save(Driver driver);

    long count();

   Driver findByid(int id);

   void del(int id);

   Driver existById(int id);
}
