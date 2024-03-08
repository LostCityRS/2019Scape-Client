package jaclib.ping;

import deob.ObfuscatedName;

public class Ping {

	public Ping() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("jaclib/ping/Ping.e(BBBBJ)I")
	public static int method110(byte arg0, byte arg1, byte arg2, byte arg3, long arg4) throws Throwable {
		int var6 = ping0(arg0, arg1, arg2, arg3, arg4);
		if (var6 < 0) {
			throw new Exception(String.valueOf(var6));
		}
		return var6;
	}

	public static native boolean init();

	public static native int ping0(byte arg0, byte arg1, byte arg2, byte arg3, long arg4);

	public static native void quit();
}
