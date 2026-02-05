package com.example.keymanager.pqc.dilithium;
import java.security.PrivateKey;
import java.security.Signature;

public class DilithiumSigner {

    public static byte[] sign(byte[] message, PrivateKey privateKey) throws Exception {
        Signature signature =
                Signature.getInstance("Dilithium", "BC");

        signature.initSign(privateKey);
        signature.update(message);
        return signature.sign();
    }
}
