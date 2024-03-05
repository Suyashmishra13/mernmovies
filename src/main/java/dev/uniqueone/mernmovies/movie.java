package dev.uniqueone.mernmovies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;
@Document(collection = "movies")
@Data //takes care of all the getter setters for all the vars
@AllArgsConstructor
@NoArgsConstructor
public class movie {
    @Id // Defines that the id which distinguishes each movie is the ObjectId;
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference // causes only the ids to be accessed and the reviews are actually in a different collection;
    private List<reviews> reviewIds;
    // Also called manual reference relationship;
}
