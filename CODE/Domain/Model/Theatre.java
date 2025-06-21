package CODE.Domain.Model;

import java.util.*;

public class Theatre {
    private String theatreID;
    private String theatreName;
    private String location;
    private List<Screen> screens;

    public List<Show> getShows(){
        return new ArrayList();
    }
}
