package br.com.curso.rentacar.service;

import br.com.curso.rentacar.exceptions.ResourceNotFoundException;
import br.com.curso.rentacar.model.BrandModel;
import br.com.curso.rentacar.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BrandService {
    @Autowired
    private BrandRepository repository;
    public BrandModel save(BrandModel model){
        return repository.save(model);
    }
    public BrandModel findById(int id){
        return repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException(null));
    }
    public List<BrandModel> findByName(String name){
        return repository.findByNameContainsIgnoreCaseOrderByName(name);
    }
}
