package io.communify.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
public class IssueReport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(columnDefinition = "TEXT")
    private String description;

    private double latitude;
    private double longitude;
    private String category;
    private String imageUrl;
    private String status = "PENDING";
    private LocalDateTime reportedAt = LocalDateTime.now();


}
