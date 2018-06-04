package car.trucker.repository;

import car.trucker.entity.Alerts;
import org.springframework.data.repository.CrudRepository;

public interface TruckerAlertsRepository extends CrudRepository<Alerts, String> {
}
