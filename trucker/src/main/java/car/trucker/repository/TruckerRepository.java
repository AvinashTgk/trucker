package car.trucker.repository;

import car.trucker.entity.TruckerVehicles;
import org.springframework.data.repository.CrudRepository;

public interface TruckerRepository extends CrudRepository<TruckerVehicles, String> {
}
