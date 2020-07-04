package back.servidos.accessingdatamysql;

import java.util.List;
import java.util.Optional;

public interface IProduService {
    List<Producto> findAll();
    Optional<Producto> findById(Integer id);
}

