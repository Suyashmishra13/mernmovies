package dev.uniqueone.mernmovies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class reviews {
    @Id
    private ObjectId id;
    private String body;

    public reviews(String body) {
        this.body = body;
    }
}
