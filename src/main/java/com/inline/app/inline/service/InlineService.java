package com.inline.app.inline.service;

import com.inline.app.inline.controller.InlineRequest;
import com.inline.app.inline.entity.FactoryDefect;
import com.inline.app.inline.repository.FactoryDefectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InlineService {

    @Autowired
    FactoryDefectRepository factoryDefectRepository;

    public void addDefect(InlineRequest request){
        FactoryDefect factoryDefect = new FactoryDefect();
        factoryDefect.setBrand(request.getBrand());
        factoryDefect.setValue(request.getValue());
        factoryDefectRepository.save(factoryDefect);
    }

    public List<FactoryDefect> getDefects(){
        return factoryDefectRepository.findAll();
    }
}
