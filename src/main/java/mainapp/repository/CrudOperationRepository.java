package mainapp.repository;

import mainapp.entity.Location;
import org.springframework.data.repository.CrudRepository;

public interface CrudOperationRepository extends CrudRepository<Location, Integer> {
}
