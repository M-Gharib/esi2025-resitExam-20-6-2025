package com.esi.phdservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.esi.phdservice.dto.PhDApplicationDto;
import com.esi.phdservice.model.PhDApplication;
import com.esi.phdservice.repository.PhDApplicationRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PhDApplicationService {

    @Autowired
    private PhDApplicationRepository PhDApplicationRepository;

    public void addPhDApplication(PhDApplicationDto phDApplicationDto) {

    }

}
