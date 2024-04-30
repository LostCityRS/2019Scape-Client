package com.jagex.core.utils;

import deob.ObfuscatedName;

@ObfuscatedName("zc")
public class GpuByteArrayUtil {

	public GpuByteArrayUtil() throws Throwable {
		throw new Error();
	}

    @ObfuscatedName("ie.e([BI)[B")
    public static byte[] method4405(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            byte[] var1 = new byte[arg0.length];
            System.arraycopy(arg0, 0, var1, 0, arg0.length);
            return var1;
        }
    }

    @ObfuscatedName("zd.n([SI)[S")
    public static short[] method13987(short[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            short[] var1 = new short[arg0.length];
            System.arraycopy(arg0, 0, var1, 0, arg0.length);
            return var1;
        }
    }
}
