package com.jagex.game.client;

import com.jagex.core.utils.CacheUtil;
import com.jagex.core.utils.FileUtil;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

@ObfuscatedName("ty")
public class HardwarePlatformLoader implements NativeLibraryLoader {

	@ObfuscatedName("ty.e")
	public final Js5 field6764;

	@ObfuscatedName("ty.n")
	public final String field6763;

	@ObfuscatedName("ty.m")
	public Hashtable field6765 = new Hashtable();

	@ObfuscatedName("ty.k")
	public Hashtable field6766 = new Hashtable();

	public HardwarePlatformLoader(Js5 arg0) {
		this.field6764 = arg0;
		String var2 = "";
		if (NativeLibraryConfig.osName.startsWith("win") || NativeLibraryConfig.osName.startsWith("windows 7")) {
			var2 = var2 + "windows/";
		} else if (NativeLibraryConfig.osName.startsWith("linux")) {
			var2 = var2 + "linux/";
		} else if (NativeLibraryConfig.osName.startsWith("mac")) {
			var2 = var2 + "macos/";
		}
		String var3;
		if (NativeLibraryConfig.field5076.startsWith("amd64") || NativeLibraryConfig.field5076.startsWith("x86_64")) {
			var3 = var2 + "x86_64/";
		} else if (NativeLibraryConfig.field5076.startsWith("i386") || NativeLibraryConfig.field5076.startsWith("i486") || NativeLibraryConfig.field5076.startsWith("i586") || NativeLibraryConfig.field5076.startsWith("x86")) {
			var3 = var2 + "x86/";
		} else if (NativeLibraryConfig.field5076.startsWith("ppc")) {
			var3 = var2 + "ppc/";
		} else {
			var3 = var2 + "universal/";
		}
		this.field6763 = var3;
	}

	@ObfuscatedName("nn.c(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method6049(String arg0) {
		if (NativeLibraryConfig.osName.startsWith("win")) {
			return arg0 + ".dll";
		} else if (NativeLibraryConfig.osName.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (NativeLibraryConfig.osName.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@ObfuscatedName("ty.r(Ljava/lang/String;ZI)I")
	public int method8464(String arg0, boolean arg1) throws HardwarePlatformLoaderException {
		if (this.field6765.containsKey(arg0)) {
			return 100;
		}
		String var3 = null;
		Object var4 = null;
		String var5;
		if (arg1) {
			var3 = arg0;
			var5 = arg0;
		} else {
			var5 = method6049(arg0);
			if (var5 == null) {
				throw new HardwarePlatformLoaderException(1, arg0);
			}
			if (var3 == null) {
				var3 = this.field6763 + var5;
				if (this.field6764 == null || !this.field6764.isFileNameValid(var3, "")) {
					throw new HardwarePlatformLoaderException(2, arg0);
				}
			}
		}
		if (!this.field6764.isGroupReady(var3)) {
			return this.field6764.getPercentageComplete(var3);
		}
		byte[] var6 = this.field6764.getfile(var3, "");
		if (var6 == null) {
			throw new HardwarePlatformLoaderException(3, arg0);
		}
		Object var7 = null;
		File var8;
		try {
			var8 = CacheUtil.method18852(var5);
		} catch (RuntimeException var16) {
			throw new HardwarePlatformLoaderException(4, arg0, var16);
		}
		if (var8 == null) {
			throw new HardwarePlatformLoaderException(5, arg0);
		}
		boolean var10 = true;
		byte[] var11 = FileUtil.method3587(var8);
		if (var11 != null && var6.length == var11.length) {
			for (int var12 = 0; var12 < var11.length; var12++) {
				if (var6[var12] != var11[var12]) {
					var10 = false;
					break;
				}
			}
		} else {
			var10 = false;
		}
		if (!var10) {
			try {
				FileOutputStream var13 = new FileOutputStream(var8);
				var13.write(var6, 0, var6.length);
				var13.close();
			} catch (Throwable var15) {
				throw new HardwarePlatformLoaderException(6, arg0, var15);
			}
		}
		this.method8465(arg0, var8);
		return 100;
	}

	@ObfuscatedName("ty.v(Ljava/lang/String;Ljava/io/File;I)V")
	public void method8465(String arg0, File arg1) {
		this.field6765.put(arg0, arg1);
	}

	@ObfuscatedName("ty.n(Ljava/lang/String;I)Z")
	public boolean method7900(String arg0) {
		return this.field6765.containsKey(arg0);
	}

	@ObfuscatedName("ty.e(Ljava/lang/String;B)V")
	public void load(String arg0) throws NativeLibraryException {
		this.method8467(arg0, HardwarePlatformLoaderRelated.class);
	}

	@ObfuscatedName("ty.o(Ljava/lang/String;Ljava/lang/Class;I)V")
	public void method8467(String arg0, Class arg1) throws NativeLibraryException {
		Class var3 = (Class) this.field6766.get(arg0);
		if (var3 != null && var3.getClassLoader() != arg1.getClassLoader()) {
			throw new NativeLibraryException(1, arg0);
		}
		File var4 = null;
		if (var4 == null) {
			var4 = (File) this.field6765.get(arg0);
		}
		if (var4 == null) {
			throw new NativeLibraryException(4, arg0);
		}
		try {
			/*var4 = new File(var4.getCanonicalPath());
			Class var5 = Class.forName("java.lang.Runtime");
			Class var6 = Class.forName("java.lang.reflect.AccessibleObject");
			Method var7 = var6.getDeclaredMethod("setAccessible", Boolean.TYPE);
			Method var8 = var5.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
			var7.invoke(var8, Boolean.TRUE);
			var8.invoke(Runtime.getRuntime(), arg1, var4.getPath());
			var7.invoke(var8, Boolean.FALSE);
			this.field6766.put(arg0, arg1);
		} catch (NoSuchMethodException var11) {*/
			System.load(var4.getPath());
			this.field6766.put(arg0, HardwarePlatformLoaderRelated.class);
		} catch (Throwable ex) {
			ex.printStackTrace();
			throw new NativeLibraryException(3, arg0, ex);
		}
	}

	@ObfuscatedName("ty.m(I)Z")
	public boolean method7909() {
		Hashtable var1 = new Hashtable();
		Enumeration var2 = this.field6766.keys();
		while (var2.hasMoreElements()) {
			String var3 = (String) var2.nextElement();
			var1.put(var3, this.field6766.get(var3));
		}
		try {
			Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
			Class var5 = Class.forName("java.lang.ClassLoader");
			Field var6 = var5.getDeclaredField("nativeLibraries");
			Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
			var7.invoke(var6, Boolean.TRUE);
			try {
				Enumeration var8 = this.field6766.keys();
				while (var8.hasMoreElements()) {
					String var9 = (String) var8.nextElement();
					try {
						File var10 = (File) this.field6765.get(var9);
						Class var11 = (Class) this.field6766.get(var9);
						Vector var12 = (Vector) var6.get(var11.getClassLoader());
						for (int var13 = 0; var13 < var12.size(); var13++) {
							try {
								Object var14 = var12.elementAt(var13);
								Field var15 = var14.getClass().getDeclaredField("name");
								var7.invoke(var15, Boolean.TRUE);
								try {
									String var16 = (String) var15.get(var14);
									if (var16 != null && var16.equalsIgnoreCase(var10.getCanonicalPath())) {
										Field var17 = var14.getClass().getDeclaredField("handle");
										Method var18 = var14.getClass().getDeclaredMethod("finalize");
										var7.invoke(var17, Boolean.TRUE);
										var7.invoke(var18, Boolean.TRUE);
										try {
											var18.invoke(var14);
											var17.set(var14, Integer.valueOf(0));
											var1.remove(var9);
										} catch (Throwable var25) {
										}
										var7.invoke(var18, Boolean.FALSE);
										var7.invoke(var17, Boolean.FALSE);
									}
								} catch (Throwable var26) {
								}
								var7.invoke(var15, Boolean.FALSE);
							} catch (Throwable var27) {
							}
						}
					} catch (Throwable var28) {
					}
				}
			} catch (Throwable var29) {
			}
			var7.invoke(var6, Boolean.FALSE);
		} catch (Throwable var30) {
		}
		this.field6766 = var1;
		return this.field6766.isEmpty();
	}
}
