package mga.library.rating.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rating {

    @Id
    private long bookId;

    private int rating;

    protected Rating() {
    }

    public Rating(long bookId, int rating) {
        this.bookId = bookId;
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public long getBookId() {
        return bookId;
    }
}
