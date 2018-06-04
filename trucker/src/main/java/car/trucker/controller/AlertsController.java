package car.trucker.controller;

import car.trucker.entity.Alerts;
import car.trucker.service.TruckerAlertsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/alerts")
public class AlertsController {

    @Autowired
    TruckerAlertsService service2;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Alerts> findAll() {
        return service2.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{priority}",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Alerts findOne(@PathVariable("priority") String trcpriority) {
        return service2.findOne(trcpriority);
    }


}
