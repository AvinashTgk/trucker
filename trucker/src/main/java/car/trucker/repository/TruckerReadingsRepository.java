package car.trucker.repository;

import car.trucker.entity.TruckerReadings;
import org.springframework.data.repository.CrudRepository;

public interface TruckerReadingsRepository extends CrudRepository<TruckerReadings, String> {
}
