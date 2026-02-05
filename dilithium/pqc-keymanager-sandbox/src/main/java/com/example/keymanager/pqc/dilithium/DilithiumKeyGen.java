package com.example.keymanager.pqc.dilithium;
import org.bouncycastle.pqc.jcajce.spec.DilithiumParameterSpec;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;

public class DilithiumKeyGen {

    public static KeyPair generateKeyPair() throws Exception {
        KeyPairGenerator kpg =
                KeyPairGenerator.getInstance("Dilithium", "BC");

        kpg.initialize(DilithiumParameterSpec.dilithium3, new SecureRandom());
        return kpg.generateKeyPair();
    }
}
