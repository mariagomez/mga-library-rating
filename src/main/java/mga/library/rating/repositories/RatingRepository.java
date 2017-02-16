package mga.library.rating.repositories;

import mga.library.rating.models.Rating;
import org.springframework.data.repository.CrudRepository;

public interface RatingRepository extends CrudRepository<Rating, Long> {

}
