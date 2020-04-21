package mainapp.controller;


import mainapp.entity.Location;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import mainapp.services.CrudService;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestAPIController {

  Logger logger = Logger.getLogger(RestAPIController.class.getName());


  @Autowired
  private CrudService locationService;

  @RequestMapping(method = RequestMethod.GET, value = "/locations")
  public List<Location> getLocations() {
    logger.log(Level.INFO, "Getting locations.");
    return locationService.getLocations();
  }

  @RequestMapping("/location/{id}")
  public Location getLocation(@PathVariable("id") int id) {
    logger.log(Level.INFO, "Getting specificlocation.");
    return locationService.getLocation(id);
  }


  @RequestMapping(method = RequestMethod.POST, value = "/location")
  public void addLocation(@RequestBody Location listElement) {
    logger.log(Level.INFO, "Adding location.");
    locationService.addLocation(listElement);
  }


  @RequestMapping(method = RequestMethod.PUT, value = "/location/{id}")
  public void updateLocation(@RequestBody Location post) {
    logger.log(Level.INFO, "Updating location.");
    locationService.updateLocation(post);

  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/location/{id}")
  public void deleteLocation(@PathVariable("id") int id) {
    logger.log(Level.INFO, "Delete specific location.");
    locationService.deleteLocation(id);

  }
}
