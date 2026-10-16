package com.lastma.data.repositories;

import com.lastma.data.models.Vehicle;
import com.lastma.data.models.vehicleType;

public interface VehicleRepository {
    Vehicle save(Vehicle vehicle);

    long count();

    Vehicle findByType(vehicleType type);

    void del(vehicleType type);

    Vehicle existByType(vehicleType type);

    void deleteAll(vehicleType type);
}
