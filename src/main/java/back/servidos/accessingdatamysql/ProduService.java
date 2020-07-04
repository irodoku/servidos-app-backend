package back.servidos.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduService implements IProduService {

    @Autowired
    private ProduRepository produRepository;


    @Override
    public List<Producto> findAll() {
        return (List<Producto>) produRepository.findAll();
    }

    @Override
    public Optional<Producto> findById(Integer id) {
        return produRepository.findById(id);
    }
}