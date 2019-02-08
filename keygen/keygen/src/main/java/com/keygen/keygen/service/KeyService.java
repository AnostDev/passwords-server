package com.keygen.keygen.service;

import com.keygen.keygen.model.Key;

import java.util.UUID;

public interface KeyService {
    Key findKey(UUID id);
    Iterable<Key> findAllKeys();
    Key createKey(Key key);
}
