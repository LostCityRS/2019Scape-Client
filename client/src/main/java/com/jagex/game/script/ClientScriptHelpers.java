package com.jagex.game.script;

import com.jagex.core.datastruct.ClientScriptCache;
import com.jagex.core.io.Packet;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("yw")
public class ClientScriptHelpers {

	@ObfuscatedName("yw.e")
	public static ClientScriptCache cache = new ClientScriptCache(128);

	public ClientScriptHelpers() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ss.e(I)V")
	public static void method8004() {
		cache.removeAll();
	}

	@ObfuscatedName("lv.n(II)Lasc;")
	public static ClientScript getScript(int scriptId) {
		ClientScript cached = (ClientScript) cache.get((long) scriptId);
		if (cached != null) {
			return cached;
		}
		byte[] bytes = Client.clientscriptsJs5.getfile(scriptId, 0);
		if (bytes == null || bytes.length <= 1) {
			return null;
		}
		ClientScript script;
		try {
			script = decode(bytes);
		} catch (Exception var5) {
			throw new RuntimeException(var5.getMessage() + " " + scriptId);
		}
		cache.put(script, (long) scriptId);
		return script;
	}

	@ObfuscatedName("vs.m(Luh;IIS)Lasc;")
	public static ClientScript getByTrigger(ClientTriggerType arg0, int arg1, int arg2) {
		int var3 = arg0.id | arg1 << 10;
		ClientScript var4 = (ClientScript) cache.get((long) var3 << 16);
		if (var4 != null) {
			return var4;
		}
		byte[] var5 = Client.clientscriptsJs5.fetchFile(Client.clientscriptsJs5.getGroupId(var3));
		if (var5 == null) {
			int var8 = arg0.id | arg2 + 65536 << 10;
			ClientScript var9 = (ClientScript) cache.get((long) var8 << 16);
			if (var9 != null) {
				return var9;
			}
			byte[] var10 = Client.clientscriptsJs5.fetchFile(Client.clientscriptsJs5.getGroupId(var8));
			if (var10 == null) {
				int var13 = arg0.id | 0x3FFFC00;
				ClientScript var14 = (ClientScript) cache.get((long) var13 << 16);
				if (var14 != null) {
					return var14;
				}
				byte[] var15 = Client.clientscriptsJs5.fetchFile(Client.clientscriptsJs5.getGroupId(var13));
				if (var15 == null) {
					return null;
				} else if (var15.length <= 1) {
					return null;
				} else {
					ClientScript var16;
					try {
						var16 = decode(var15);
					} catch (Exception var20) {
						throw new RuntimeException(var20.getMessage() + " " + var13);
					}
					var16.field12373 = arg0;
					cache.put(var16, (long) var13 << 16);
					return var16;
				}
			} else if (var10.length <= 1) {
				return null;
			} else {
				ClientScript var11;
				try {
					var11 = decode(var10);
				} catch (Exception var19) {
					throw new RuntimeException(var19.getMessage() + " " + var8);
				}
				var11.field12373 = arg0;
				cache.put(var11, (long) var8 << 16);
				return var11;
			}
		} else if (var5.length <= 1) {
			return null;
		} else {
			ClientScript var6;
			try {
				var6 = decode(var5);
			} catch (Exception var18) {
				throw new RuntimeException(var18.getMessage() + " " + var3);
			}
			var6.field12373 = arg0;
			cache.put(var6, (long) var3 << 16);
			return var6;
		}
	}

	@ObfuscatedName("ek.k([BS)Lasc;")
	public static ClientScript decode(byte[] bytes) {
		return new ClientScript(new Packet(bytes), Client.variableTypeProvider);
	}
}
