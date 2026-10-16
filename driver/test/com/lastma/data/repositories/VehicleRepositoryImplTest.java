package com.lastma.data.repositories;

import com.lastma.data.models.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleRepositoryImplTest {
    private VehicleRepositoryImpl vehicleRepository;
    private Vehicle vehicle;

    @BeforeEach
    public void setUp() {
        vehicleRepository = new VehicleRepositoryImpl();
        vehicle = new Vehicle();

    }

    @Test
    public void testThatVehicleCanBeSavedInTheSystem() {
        Vehicle savedVehicle = vehicleRepository.save(vehicle);
        assertNotNull(savedVehicle);
        assertEquals(1, savedVehicle.getType());
    }

    @Test
    public void testThatVehicleCountIsOneAfterSaving() {
        vehicleRepository.save(vehicle);
        assertEquals(1, vehicleRepository.count());
    }

    @Test
    public void testThatTicketCanBeFoundByVehicleType() {
        vehicleRepository.save(vehicle);
        Vehicle foundVehicle = vehicleRepository.findByType("Toyota");
        assertNotNull(foundVehicle);
        assertEquals("Toyota", foundVehicle.getType());
    }

    @Test
    public void testThatDifferentVehiclesHaveDifferentType() {
        Vehicle firstVehicle = new Vehicle();
        Vehicle secondVehicle = new Vehicle();
        vehicleRepository.save(firstVehicle);
        vehicleRepository.save(secondVehicle);
        assertEquals(1, firstVehicle.getType());
        assertEquals(2, secondVehicle.getType());
    }
    @Test
    public void testThatVehicleCanBeDeletedByTypeFromTheSystem() {
        vehicleRepository.save(vehicle);
        vehicleRepository.del(1);
        assertEquals(1, vehicleRepository.count());
    }
    @Test
    public void testThatAllVehicleCanBeDeletedFromTheSystem() {
        vehicleRepository.save(vehicle);
        vehicleRepository.save(new Vehicle());
        vehicleRepository.deleteAll(2);
        assertEquals(2, vehicleRepository.count());
    }

}