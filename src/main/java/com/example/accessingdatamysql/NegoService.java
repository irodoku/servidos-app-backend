package com.example.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NegoService implements INegoService {

    @Autowired
    private NegoRepository negoRepository;

    @Override
    public List<Negocio> findAll() {
        return (List<Negocio>) negoRepository.findAll();
    }

    @Override
    public Optional<Negocio> findById(Integer id) {
        return negoRepository.findById(id);
    }
}