package CODE.Infrastructure.Repository.TheatreRepository;

import CODE.Domain.Model.Theatre;


import java.util.*;

public class TheatreRepository implements ITheatreRepository {
    private final Map<String, Theatre> theatreMap = new HashMap<>();

    @Override
    public void save(Theatre theatre) {
        theatreMap.put(theatre.getTheatreID(), theatre);
    }

    @Override
    public Optional<Theatre> findById(String theatreID) {
        return Optional.ofNullable(theatreMap.get(theatreID));
    }

    @Override
    public List<Theatre> findAll() {
        return new ArrayList<>(theatreMap.values());
    }

    @Override
    public void delete(String theatreID) {
        theatreMap.remove(theatreID);
    }

    @Override
    public void update(Theatre updatedTheatre) {
        String id = updatedTheatre.getTheatreID();
        if (theatreMap.containsKey(id)) {
            theatreMap.put(id, updatedTheatre);
        } else {
            throw new NoSuchElementException("Theatre not found with ID: " + id);
        }
    }
}
