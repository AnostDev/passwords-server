package com.keygen.key.service;

import com.keygen.key.model.Key;
import com.keygen.key.repository.KeyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class KeyServiceImpl implements KeyService {

    @Autowired
    private KeyRepository kr;

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
        Key newKey = kr.save(key);
        return newKey;
    }
}
