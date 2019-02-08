package com.keygen.keygen.service;

import com.keygen.keygen.model.Key;
import com.keygen.keygen.repository.KeyRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class KeyServiceImpl implements KeyService {

    @Autowired
    KeyRepository kr;

    @Override
    public Key findKey(UUID id) {
        return kr.findById(id).orElse(null);
    }

    @Override
    public Iterable<Key> findAllKeys() {
        return kr.findAll();
    }

    @Override
    public Key createKey(Key key) {
        return kr.save(key);
    }
}
