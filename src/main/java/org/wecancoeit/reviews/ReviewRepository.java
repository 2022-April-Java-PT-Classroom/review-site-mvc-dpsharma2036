package org.wecancoeit.reviews;


import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

    public Review findOne(long id) {
        return reviewsList.get(id);
    }

    public Collection<Review> findAll() {

        return reviewsList.values();
    }

    public ReviewRepository() {
        Review book = new Review(1L, "Romeo and Juliet: William Shakespeare", "Romantic-Tragedy", "images/romeo-juliet.jpg", "Reviews Source: Reader Digest",
                "Tragedy:Death of both the protagonists at the end brings tears in the eyes of readers.However, " +
                "love between the two makes us feel that the true love can pave the path to sublimity.");
        Review music = new Review(2L, "Aaroha: By Ram Krishna Dhakal", "Soothing and organic feel", "images/singer.jpg", "Reviews Source: Audience poll",
                "Modern songs:Album contains 10 modern Nepali songs by the singer.They are all pleasing to our ears. ");
        Review poem = new Review(3L, "The Waste Land:By T. S. Eliot", "Post-modern Poetry", "images/wasteland.jpg", "Reviews Source: Readers poll",
                "Depicts the post-modern thoughts-where we can clearly find that characters are running for happiness without realising that the happiness dwells within." +
                        "Disjunctive ironies are found in the poem, and are the soul of post-modern poems.");
        Review novel = new Review(4l,"Beloved:By Toni Morrison","Novel based on Slavery System and it's deeply rooted cruelty", "images/beloved.jpg",
                "Reviews Source: Readers poll.", "Portrays  extremely heinous picture of the slavery system with the help of both super-natural " +
                "element, and the reality dwelt in the time. The only book that makes me cry every time I read it. " );

        reviewsList.put(book.getId(), book);
        reviewsList.put(music.getId(), music);
        reviewsList.put(poem.getId(), poem);
        reviewsList.put(novel.getId(),novel);

    }

    public ReviewRepository(Review... reviewsToAdd) {
        for (Review review : reviewsToAdd) {
            reviewsList.put(review.getId(), review);
        }

    }


}
