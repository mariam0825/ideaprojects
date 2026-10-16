package com.lastma.data.repositories;
import com.lastma.data.models.Officer;

import java.util.ArrayList;
import java.util.List;

public class OfficerRepositoryImpl implements OfficerRepository {
    private List<Officer> officers = new ArrayList<>();
    private int numberOfOfficers = 0;

    @Override
    public Officer save(Officer officer) {
        officer.setId(++numberOfOfficers);
        officers.add(officer);
        return officer;

    }

    public long count() {
        return numberOfOfficers;
    }

    public Officer findById(int id) {
        for (Officer officer : officers) {
            if (officer.getId() == id) {
                return officer;
            }
        }
        throw new IllegalArgumentException("id not found");
    }

    public Officer existById(int id) {
        for (Officer officer : officers) {
            if (officer.getId() == id) {
                return officer;
            }
        }
        throw new IllegalArgumentException("id not found");

    }

    public void del(int id) {
        for (Officer officer : officers) {
            if (officer.getId() == id) {
                officers.remove(officer);
                numberOfOfficers--;
                break;
            }
        }
    }

    public void deleteAll(int id,String fullName) {
        for (Officer officer : officers) {
            if (officer.getId() == id && officer.getGetFullName() == fullName) {
                officers.remove(officer);
                numberOfOfficers--;
                break;
            }
        }

    }
}

