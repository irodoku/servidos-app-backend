package back.servidos.accessingdatamysql;

import java.util.List;
import java.util.Optional;

public interface IRestService {
    List<Restaurante> findAll();
    Optional<Restaurante> findById(Integer ID);
}

