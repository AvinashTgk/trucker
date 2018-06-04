package car.trucker.service;

import car.trucker.entity.Alerts;
import car.trucker.exception.ResourceNotFoundException;
import car.trucker.repository.TruckerAlertsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TruckerAlertsServiceImpl implements TruckerAlertsService{

    @Autowired
    TruckerAlertsRepository repository;

    @Transactional(readOnly = true)
    public List<Alerts> findAll() {
        return (List<Alerts>) repository.findAll();
    }

    @Transactional(readOnly = true)
    public Alerts findOne(String priority) {
        Optional<Alerts> existing = repository.findById(priority);
        if (!existing.isPresent()) {
            throw new ResourceNotFoundException("Alerts with priority " + priority + " doesn't exist.");
        }
        return existing.get();
    }
}
