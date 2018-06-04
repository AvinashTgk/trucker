package car.trucker.service;

import car.trucker.entity.Alerts;

import java.util.List;

public interface TruckerAlertsService {
    List<Alerts> findAll();
    Alerts findOne(String priority);
}
