package com.keygen.keygen.repository;

import com.keygen.keygen.model.Key;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface KeyRepository extends CrudRepository<Key, UUID> {
}
