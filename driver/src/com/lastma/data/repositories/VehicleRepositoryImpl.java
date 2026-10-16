package com.lastma.data.repositories;

import com.lastma.data.models.Vehicle;
import com.lastma.data.models.vehicleType;

import java.util.ArrayList;
import java.util.List;

public class VehicleRepositoryImpl implements VehicleRepository{
    private final List<Vehicle> vehicles = new ArrayList<>();
    private int numberOfVehicle = 0;

    @Override
    public Vehicle save(Vehicle vehicle) {
        vehicles.add(vehicle);
        numberOfVehicle++;
        return vehicle;
    }
    @Override
    public long count() {
        return numberOfVehicle;
    }

    @Override
    public Vehicle findByType(vehicleType type) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType() == type) {
                return vehicle;
            }
        }
        throw new IllegalArgumentException("Vehicle not found");
    }
    public void del(vehicleType type) {
        for(Vehicle vehicle: vehicles) {
            if(Vehicle.getType() == type){
                vehicles.remove(vehicle);
                numberOfVehicle--;
                break;
            }
        }
    }

    public Vehicle existByType(vehicleType type) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType() == type) {
                return vehicle;
            }
        }
        throw new IllegalArgumentException("Vehicle not found");
    }

    @Override
    public void deleteAll(vehicleType type) {
        vehicles.clear();
    }
}
