package car.trucker.service;

import car.trucker.entity.TruckerReadings;
import car.trucker.exception.ResourceNotFoundException;
import car.trucker.repository.TruckerReadingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TruckerReadingsServiceImpl implements TruckerReadingsService{


    @Autowired
    TruckerReadingsRepository repository;

    @Transactional(readOnly = true)
    public List<TruckerReadings> findAll() {
        return (List<TruckerReadings>) repository.findAll();
    }

    @Transactional(readOnly = true)
    public TruckerReadings findOne(String vin) {
        Optional<TruckerReadings> existing = repository.findById(vin);
        if (!existing.isPresent()) {
            throw new ResourceNotFoundException("TruckerReadings with vin " + vin + " doesn't exist.");
        }
        return existing.get();
    }
    @Transactional
    public TruckerReadings create(TruckerReadings trc1) {
        /*Optional<TruckerVehicles> existing = repository.findByEmail(emp.getEmail());
        if (existing.isPresent()) {
            throw new BadRequestException("Employee with email " + emp.getEmail() + " already exists.");
        }*/
        return repository.save(trc1);
    }

    public void delete(String vin) {
        Optional<TruckerReadings> existing = repository.findById(vin);
        if (!existing.isPresent()) {
            throw new ResourceNotFoundException("TruckerReadings with vin " + vin + " doesn't exist.");
        }
        repository.delete(existing.get());
    }
}
