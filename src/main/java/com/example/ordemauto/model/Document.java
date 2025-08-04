package com.example.ordemauto.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String filePath; // caminho do arquivo PDF no servidor ou bucket

    @Enumerated(EnumType.STRING)
    private DocumentStatus status;

    @ManyToOne
    private User createdBy;

    @OneToMany(mappedBy = "document", cascade = CascadeType.ALL)
    private List<Signature> signatures = new ArrayList<>();

    private LocalDateTime createdAt = LocalDateTime.now();
}
