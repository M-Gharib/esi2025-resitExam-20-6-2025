package com.esi.phdservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esi.phdservice.dto.PhDApplicationDto;
import com.esi.phdservice.service.PhDApplicationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class PhDApplicationController {

    @Autowired
    private PhDApplicationService phDApplicationService;

    @PostMapping("/phdapplications")
    public ResponseEntity<String> addPhDApplication(@RequestBody PhDApplicationDto phDApplicationDto) {
        phDApplicationService.addPhDApplication(phDApplicationDto);
        return ResponseEntity.ok("An Application has been created");
    }
}
