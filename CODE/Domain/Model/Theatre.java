package CODE.Domain.Model;

import java.util.*;

public class Theatre {
    private String theatreID;
    private String theatreName;
    private String location;
    private List<Screen> screens;

    public Theatre( String _theatreID, String _theatreName, String _location, List<Screen> _screens){
        this.theatreID = _theatreID;
        this.theatreName = _theatreName;
        this.location = _location;
        this.screens = _screens;
    }

    public List<Show> getShows(){
        return new ArrayList();
    }

    public String getTheatreID() {
    return theatreID;
}
}
