package com.esi.hrservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esi.hrservice.dto.PhDApplicationDto;
import com.esi.hrservice.model.PhDApplication;
import com.esi.hrservice.model.PhDApplicationStatus;
import com.esi.hrservice.repository.HRRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class HRService {

  @Autowired
  private HRRepository HRRepository;

  public void provideDecision(PhDApplicationDto phDApplicationDto) {

  }

}
