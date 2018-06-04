package car.trucker.controller;

import car.trucker.entity.TruckerVehicles;
import car.trucker.service.TruckerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/vehicles")
public class TruckerVehiclesController {

    @Autowired
    TruckerService service;


    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<TruckerVehicles> findAll() {
        return service.findAll();
    }


    @RequestMapping(method = RequestMethod.GET, value = "/{vin}",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public TruckerVehicles findOne(@PathVariable("vin") String trcId) {

        return service.findOne(trcId);
    }



    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public TruckerVehicles create(@RequestBody TruckerVehicles trc1) {
        return service.create(trc1);
    }

    @CrossOrigin(origins = "http://mocker.egen.io")
    @RequestMapping(method = RequestMethod.PUT, value = "/{vin}",
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public TruckerVehicles update(@PathVariable("vin") String trcId, @RequestBody TruckerVehicles trc) {
        return service.update(trcId, trc);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{vin}")
    public void delete(@PathVariable("vin") String trcId) {
        service.delete(trcId);
    }
}
