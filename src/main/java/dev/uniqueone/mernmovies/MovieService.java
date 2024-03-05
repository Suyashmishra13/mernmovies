package dev.uniqueone.mernmovies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
// Inside this class we have the database access methods
public class MovieService {
    // we need a reference of a repository
    @Autowired // This tells Java to automatically instantiate the below private function without the need for us to make a contructor to define it
    private MovieRepository movieRepository;
    public List<movie> allMovies(){
        return movieRepository.findAll();
    }

    public Optional<movie> singlemovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
