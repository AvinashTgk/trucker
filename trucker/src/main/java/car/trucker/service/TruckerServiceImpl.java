package car.trucker.service;

import car.trucker.entity.TruckerVehicles;
import car.trucker.exception.ResourceNotFoundException;
import car.trucker.repository.TruckerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TruckerServiceImpl implements TruckerService {

    @Autowired
    TruckerRepository repository;


    @Transactional(readOnly = true)
    public List<TruckerVehicles> findAll() {
        return (List<TruckerVehicles>) repository.findAll();
    }

    @Transactional(readOnly = true)
    public TruckerVehicles findOne(String vin) {
        Optional<TruckerVehicles> existing = repository.findById(vin);
        if (!existing.isPresent()) {
            throw new ResourceNotFoundException("TruckerVehicles with vin " + vin + " doesn't exist.");
        }

        return existing.get();
    }

    @Transactional
    public TruckerVehicles create(TruckerVehicles trc) {
        /*Optional<TruckerVehicles> existing = repository.findByEmail(emp.getEmail());
        if (existing.isPresent()) {
            throw new BadRequestException("Employee with email " + emp.getEmail() + " already exists.");
        }*/
        return repository.save(trc);
    }



    @Transactional
    public TruckerVehicles update(String vin, TruckerVehicles trc) {
        Optional<TruckerVehicles> existing = repository.findById(vin);
        if (!existing.isPresent()) {
            throw new ResourceNotFoundException("TruckerVehicles with vin " + vin + " doesn't exist.");
        }
        return repository.save(trc);
    }

    @Transactional
    public void delete(String vin) {
        Optional<TruckerVehicles> existing = repository.findById(vin);
        if (!existing.isPresent()) {
            throw new ResourceNotFoundException("TruckerVehicles with vin " + vin + " doesn't exist.");
        }
        repository.delete(existing.get());
    }
}
