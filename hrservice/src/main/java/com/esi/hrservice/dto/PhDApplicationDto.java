package com.esi.hrservice.dto;

import com.esi.hrservice.model.PhDApplicationStatus;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhDApplicationDto {
    private String announcementId;
    private String applicantName;
    private String applicantCv;
    private String motivation;
    private String decision;
    @Enumerated(EnumType.STRING)
    private PhDApplicationStatus taApplicationStatus;
}
