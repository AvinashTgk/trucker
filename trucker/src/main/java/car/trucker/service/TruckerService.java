package car.trucker.service;

import car.trucker.entity.TruckerReadings;
import car.trucker.entity.TruckerVehicles;

import java.util.List;

public interface TruckerService {

    List<TruckerVehicles> findAll();
    TruckerVehicles findOne(String vin);


    TruckerVehicles create(TruckerVehicles trc);

    TruckerVehicles update(String vin, TruckerVehicles trc);
    void delete(String vin);
}
