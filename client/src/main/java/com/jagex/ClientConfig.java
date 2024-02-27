package com.jagex;

public class ClientConfig {

    public static final boolean VERBOSE = true;
    public static final boolean DEBUG = true;

    public static final boolean SKIP_HOST_CHECK = true;
    public static final boolean USE_HTTP_JS5 = false;

    public static final boolean DISABLE_RSA = true;
    public static final boolean DISABLE_JS5_XOR = true;

    public static void printVerbose(String message) {
        if (VERBOSE) {
            System.out.println(message);
        }
    }

}
