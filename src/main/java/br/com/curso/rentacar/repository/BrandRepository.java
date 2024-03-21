package br.com.curso.rentacar.repository;


import br.com.curso.rentacar.model.BrandModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrandRepository extends JpaRepository<BrandModel, Integer> {
    public List<BrandModel> findByNameContainsIgnoreCaseOrderByName(String name);
}
