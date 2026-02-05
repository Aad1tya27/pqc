package com.example.keymanager.pqc.dilithium;
import java.security.PublicKey;
import java.security.Signature;

public class DilithiumVerifier {

    public static boolean verify(
            byte[] message,
            byte[] sigBytes,
            PublicKey publicKey
    ) throws Exception {

        Signature signature =
                Signature.getInstance("Dilithium", "BC");

        signature.initVerify(publicKey);
        signature.update(message);
        return signature.verify(sigBytes);
    }
}
