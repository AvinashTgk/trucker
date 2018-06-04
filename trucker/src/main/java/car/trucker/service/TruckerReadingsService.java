package car.trucker.service;

import car.trucker.entity.TruckerReadings;

import java.util.List;

public interface TruckerReadingsService {
    List<TruckerReadings> findAll();
    TruckerReadings findOne(String vin);
    TruckerReadings create(TruckerReadings trc1);
    void delete(String vin);
}
