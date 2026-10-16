package com.lastma.data.repositories;

import com.lastma.data.models.Driver;
import com.lastma.data.models.Officer;

public interface OfficerRepository {
    Officer save(Officer Officer);

    long count();

    Officer findById(int id);

    Officer existById(int id);

    void del(int id);

    void deleteAll(int id, String fullName);

}
