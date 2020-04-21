package mainapp.services;

import mainapp.entity.Location;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mainapp.repository.CrudOperationRepository;

@Service
public class CrudService {


  @Autowired
  private CrudOperationRepository repo;


  //GET all posts
  public List<Location> getLocations() {
    List<Location> list = new ArrayList<>();
    for (Location location : repo.findAll()) {
      list.add(location);
    }
    return list;
  }

  //GET single post by id
  public Location getLocation(int id) {
    return repo.findById(id).get();
  }

  //CREATE single post
  public void addLocation(Location listElement) {
    repo.save(listElement);
  }

  //UPDATE specific post
  public void updateLocation(Location location) {
    repo.save(location);
  }

  //DELETE post by id
  public void deleteLocation(int id) {
    repo.deleteById(id);
  }
}


