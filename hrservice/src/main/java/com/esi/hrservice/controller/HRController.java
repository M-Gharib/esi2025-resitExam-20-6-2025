package com.esi.hrservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esi.hrservice.dto.PhDApplicationDto;
import com.esi.hrservice.service.HRService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class HRController {

    @Autowired
    private HRService HRService;

    @PutMapping("/phdaresponse")
    public ResponseEntity<String> provideDecision(@RequestBody PhDApplicationDto tAApplicationDto) {

        return ResponseEntity.ok("An application has been concluded");

    }
}
