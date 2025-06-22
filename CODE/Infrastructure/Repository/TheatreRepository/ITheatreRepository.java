package CODE.Infrastructure.Repository.TheatreRepository;

import CODE.Domain.Model.Theatre;
import java.util.*;

public interface ITheatreRepository {
    void save(Theatre theatre);
    Optional<Theatre> findById(String theatreID);
    List<Theatre> findAll();
    void delete(String theatreID);
    void update(Theatre updatedTheatre);
}
