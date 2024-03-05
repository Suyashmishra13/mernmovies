package dev.uniqueone.mernmovies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private MongoTemplate mongoTemplate; //  a way to interact with the repo using this as a query instead of using the whole repo's already included methods
    public reviews createReview(String reviewBody, String imdbId){
        reviews review = reviewRepository.insert(new reviews(reviewBody));

        mongoTemplate.update(movie.class)
                .matching(Criteria.where("ImdbId").is((imdbId)))
                .apply(new Update().push("reviewIds").value(review))
                .first();

        return review;
    }
}
