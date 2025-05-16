package com.esi.phdservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "phdapptable")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhDApplication {
    @Id
    private String announcementId;
    private String applicantName;
    private String applicantCv;
    private String motivation;
    private String decision;
    @Enumerated(EnumType.STRING)
    private PhDApplicationStatus phDApplicationStatus;
}
