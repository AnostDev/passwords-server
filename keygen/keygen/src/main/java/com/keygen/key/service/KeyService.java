package com.keygen.key.service;

import com.keygen.key.model.Key;
import java.util.UUID;

public interface KeyService {
    Key findKey(UUID id);
    Iterable<Key> findAllKeys();
    Key createKey(Key key);
}
