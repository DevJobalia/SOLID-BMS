package CODE.Domain.Model;
import java.util.ArrayList;
import java.util.List;

import CODE.Domain.Enum.Genre;

public class Movie {
    private String movieID;
    private String title;
    private Genre genre;
    private float duration;
    private float rating;

    public void getMovie () {
        // RETURN MOVIE DETAILS
    }
    

    public List<Show> getShows() {
        List<Show> shows = new ArrayList<>();
        return shows;

    }

    public String getId(){
        return movieID;
    }
}
