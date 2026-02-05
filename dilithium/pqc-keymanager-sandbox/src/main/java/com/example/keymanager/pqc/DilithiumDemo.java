package com.example.keymanager.pqc;
import java.nio.charset.StandardCharsets;
import java.security.KeyPair;


import com.example.keymanager.pqc.config.PQCProviderSetup;
import com.example.keymanager.pqc.dilithium.DilithiumKeyGen;
import com.example.keymanager.pqc.dilithium.DilithiumSigner;
import com.example.keymanager.pqc.dilithium.DilithiumVerifier;

public class DilithiumDemo {

    public static void main(String[] args) throws Exception {
        PQCProviderSetup.register();

        KeyPair kp = DilithiumKeyGen.generateKeyPair();
        byte[] message =
                "Post-Quantum Signature Test".getBytes(StandardCharsets.UTF_8);
        byte[] signature =
                DilithiumSigner.sign(message, kp.getPrivate());
        boolean valid =
                DilithiumVerifier.verify(message, signature, kp.getPublic());

        System.out.println("Signature valid: " + valid);
        System.out.println("Public key size: " + kp.getPublic().getEncoded().length + " bytes");
        System.out.println("Signature size: " + signature.length + " bytes");
    }
}
