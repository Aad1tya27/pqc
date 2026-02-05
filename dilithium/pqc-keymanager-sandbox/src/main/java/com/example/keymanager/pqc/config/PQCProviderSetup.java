package com.example.keymanager.pqc.config;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import java.security.Security;

public final class PQCProviderSetup {

    private PQCProviderSetup() {}

    public static void register() {
        if (Security.getProvider("BC") == null) {
            Security.addProvider(new BouncyCastleProvider());
        }
    }
}
