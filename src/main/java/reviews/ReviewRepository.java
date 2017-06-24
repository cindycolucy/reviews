package reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {

	//Creating review map
	Map<Long,Review> reviewMap = new HashMap<Long, Review>();
	
	//Constructor
	public ReviewRepository() {
    
	//Constructor
	Review review1 = new Review(12345, "Saving Private Ryan (1998)", "/images/privateryan.jpg", "Drama", "R", "A touching tale of war and redemption.", "Following the Normandy Landings, a group of U.S. soldiers go behind enemy lines to retrieve a paratrooper whose brothers have been killed in action.", "tag");
	reviewMap.put(review1.getId(),review1);
	Review review2 = new Review(13579, "The Lego Movie (2014)", "/images/lego.jpg", "Comedy", "PG", "Great family entertainment.", "An ordinary Lego construction worker, thought to be the prophesied 'Special', is recruited to join a quest to stop an evil tyrant from gluing the Lego universe into eternal stasis.", "tag");
	reviewMap.put(review2.getId(),review2);
	Review review3 = new Review(17777, "Batman (1989)", "/images/batman.jpg", "Action", "PG-13", "Action-packed bat adventure.", "The Dark Knight of Gotham City begins his war on crime with his first major enemy being the clownishly homicidal Joker.", "tag");
	reviewMap.put(review3.getId(),review3);
	Review review4 = new Review(16234, "The Martian (2015)", "/images/martian.jpg", "Sci-fi", "PG-13", "Thoughtful and entertaining. Charlie's favorite movie.", "An astronaut becomes stranded on Mars after his team assume him dead, and must rely on his ingenuity to find a way to signal to Earth that he is alive.", "tag");
	reviewMap.put(review4.getId(),review4);
	Review review5 = new Review(18888, "Pride & Prejudice (2005)", "/images/pride.jpg", "Drama", "PG", "Romantic period drama.", "Sparks fly when spirited Elizabeth Bennet meets single, rich, and proud Mr. Darcy. But Mr. Darcy reluctantly finds himself falling in love with a woman beneath his class. Can each overcome their own pride and prejudice?", "tag");
	reviewMap.put(review5.getId(),review5);
	Review review6 = new Review(12468, "Pulp Fiction (1994)", "/images/pulp.jpg", "Crime", "R", "A twisty tale.", "The lives of two mob hit men, a boxer, a gangster's wife, and a pair of diner bandits intertwine in four tales of violence and redemption.", "tag");
	reviewMap.put(review6.getId(),review6);
	
	}	
	//Method find all values in review map
    public Collection<Review> findAll() {
    	return reviewMap.values();
    }
    //Find one review in the map
    public Review findOne(Long id) {
    	return reviewMap.get(id);
    }
}
