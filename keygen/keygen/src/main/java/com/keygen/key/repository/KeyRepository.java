package com.keygen.key.repository;

import com.keygen.key.model.Key;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface KeyRepository extends CrudRepository<Key, UUID> {
}
