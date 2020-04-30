package com.example.accessingdatamysql;

import java.util.List;
import java.util.Optional;

public interface INegoService {
    List<Negocio> findAll();
    Optional<Negocio> findById(Integer id);
}

