package car.trucker.controller;

import car.trucker.entity.TruckerReadings;
import car.trucker.service.TruckerReadingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/readings")
public class TruckerReadingsController {

    @Autowired
    TruckerReadingsService service1;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<TruckerReadings> findAll() {
        return service1.findAll();
    }


    @RequestMapping(method = RequestMethod.GET, value = "/{vin}",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public TruckerReadings findOne(@PathVariable("vin") String trcId) {
        return service1.findOne(trcId);
    }

    @CrossOrigin(origins = "http://mocker.egen.io")
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public TruckerReadings create(@RequestBody TruckerReadings trc1) {
        return service1.create(trc1);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{vin}")
    public void delete(@PathVariable("vin") String trcId) {
        service1.delete(trcId);
    }

    }

