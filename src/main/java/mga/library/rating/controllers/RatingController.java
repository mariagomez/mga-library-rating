package mga.library.rating.controllers;

import mga.library.rating.models.Rating;
import mga.library.rating.repositories.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class RatingController {

    @Autowired
    private RatingRepository ratingRepository;

    @RequestMapping(path = "/rating/{id}", method = GET, produces = "application/json; charset=UTF-8")
    public Rating rating(@PathVariable long id) {
        Rating rating = ratingRepository.findOne(id);
        return rating;
    }

}
