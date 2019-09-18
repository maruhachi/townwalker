package work.yk0.townwalker.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import work.yk0.townwalker.entity.Location;
import work.yk0.townwalker.repository.LocationRepository;

import java.util.List;

/**
 * @author ykonno.
 * @since 2019/09/10.
 */
@RestController
@RequestMapping("api")
public class LocationApiController {

    @Autowired
    final LocationRepository locationRepository = null;

    @GetMapping("location")
    public List<Location> location(){
        List<Location> allLocation = locationRepository.findAll();
        return allLocation;
//        return Map.of("data", allLocation);
    }
}
