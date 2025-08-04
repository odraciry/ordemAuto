package com.example.ordemauto.repository;

import com.example.ordemauto.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Integer> {}
