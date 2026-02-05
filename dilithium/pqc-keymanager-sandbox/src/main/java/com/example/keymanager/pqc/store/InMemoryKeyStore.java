package com.example.keymanager.pqc.store;

import java.security.KeyPair;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryKeyStore {

    private final ConcurrentHashMap<String, KeyPair> keys = new ConcurrentHashMap<>();

    public void store(String keyId, KeyPair keyPair) {
        keys.put(keyId, keyPair);
    }

    public KeyPair load(String keyId) {
        return keys.get(keyId);
    }
}
