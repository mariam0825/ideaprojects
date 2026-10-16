package com.lastma.data.repositories;

import com.lastma.data.models.Driver;
import com.lastma.data.models.Officer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfficerRepositoryImplTest {
    private OfficerRepositoryImpl officerRepository;
    private Officer officer;

    @BeforeEach
    void setup() {
        officerRepository = new OfficerRepositoryImpl();
        officer = new Officer();
    }

    @Test
    public void testThat_whenISaveOneOfficerCountIsOne() {
        officerRepository.save(officer);
        assertEquals(1L, officerRepository.count());

    }

    @Test
    public void testThat_TwoOfficerIsSavedAndCountIsTwo() {
        assertEquals(0L, officerRepository.count());
        Officer officerTwo = new Officer();
        officerRepository.save(officerTwo);
        officerRepository.save(officer);
        assertEquals(2L, officerRepository.count());

    }

    @Test
    public void testThat_OfficersCanBeSavedByIdAlso() {
        officer.setId(1);
        officerRepository.save(officer);
        assertEquals(1, officer.getId());
    }

    @Test
    public void testThat_whenIFindByIdOfficerIsFound() {
        officer.setId(1);
        officerRepository.save(officer);
        assertEquals(officer, officerRepository.findById(1));
    }

    @Test
    public void testThat_OfficersExistById() {
        officer.setId(1);
        officerRepository.save(officer);
        assertEquals(officer, officerRepository.existById(1));

    }

    @Test
    public void testThat_YouCanDeleteOfficerId() {
        officer.setId(1);
        officerRepository.save(officer);
        officerRepository.del(1);
        assertEquals(0, officerRepository.count());


    }

    @Test
    public void testThat_YouCanDeleteOfficerByIdAndFullName() {
        officer.setId(1);
        officer.setGetFullName("Mariam");
        officerRepository.save(officer);
        officerRepository.deleteAll(1, "Mariam");
        assertEquals(0, officerRepository.count());
    }
}