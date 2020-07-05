package back.servidos.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestService implements IRestService {

    @Autowired
    private RestRepository restRepository;

    @Override
    public List<Restaurante> findAll() {
        return (List<Restaurante>) restRepository.findAll();
    }

    @Override
    public Optional<Restaurante> findById(Integer id) {
        return restRepository.findById(id);
    }
}