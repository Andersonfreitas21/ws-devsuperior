package com.devsuperir.dsvendas.services;

import com.devsuperir.dsvendas.dto.SellerDTO;
import com.devsuperir.dsvendas.mapper.SellerMapper;
import com.devsuperir.dsvendas.repositories.SellerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerService {

    private final SellerRepository repository;
    private final SellerMapper mapper;

    public SellerService(SellerRepository repository, SellerMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<SellerDTO> findAll(){
        return mapper.toDto(repository.findAll());
    }
}
