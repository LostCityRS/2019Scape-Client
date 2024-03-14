package com.jagex.core.io;

import com.jagex.game.client.ProxyAuthenticationRequiredException;
import deob.ObfuscatedName;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.*;
import java.net.Proxy.Type;
import java.nio.charset.Charset;
import java.util.List;

@ObfuscatedName("aob")
public class ProxySocket extends AbstractSocket {

	@ObfuscatedName("aob.m")
	public final ProxySelector field11880 = ProxySelector.getDefault();

	@ObfuscatedName("aob.n(I)Ljava/net/Socket;")
	public Socket getSocket() throws IOException {
		boolean var1 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!var1) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		boolean var2 = this.port == 443;
		List var3 = null;
		List var4 = null;
		try {
			try {
				var3 = this.field11880.select(new URI((var2 ? "https" : "http") + "://" + this.host));
				var4 = this.field11880.select(new URI((var2 ? "http" : "https") + "://" + this.host));
			} catch (URISyntaxException var17) {
				return this.createSocket();
			}
			var3.addAll(var4);
		} catch (UnsupportedOperationException ex) {
			ex.printStackTrace();
		}
		Object[] var6 = var3.toArray();
		ProxyAuthenticationRequiredException var7 = null;
		Object[] var8 = var6;
		for (int var9 = 0; var9 < var8.length; var9++) {
			Object var10 = var8[var9];
			Proxy var11 = (Proxy) var10;
			try {
				Socket var12 = this.method18856(var11);
				if (var12 != null) {
					return var12;
				}
			} catch (ProxyAuthenticationRequiredException var15) {
				var7 = var15;
			} catch (IOException var16) {
			}
		}
		if (var7 != null) {
			throw var7;
		}
		return this.createSocket();
	}

	@ObfuscatedName("aob.o(Ljava/net/Proxy;B)Ljava/net/Socket;")
	public Socket method18856(Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.createSocket();
		}
		SocketAddress var2 = arg0.address();
		if (!(var2 instanceof InetSocketAddress)) {
			return null;
		}
		InetSocketAddress var3 = (InetSocketAddress) var2;
		if (arg0.type() == Type.HTTP) {
			String var4 = null;
			try {
				Class var5 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				Method var6 = var5.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				var6.setAccessible(true);
				Object var7 = var6.invoke(null, var3.getHostName(), Integer.valueOf(var3.getPort()));
				if (var7 != null) {
					Method var8 = var5.getDeclaredMethod("supportsPreemptiveAuthorization");
					var8.setAccessible(true);
					if ((Boolean) var8.invoke(var7)) {
						Method var9 = var5.getDeclaredMethod("getHeaderName");
						var9.setAccessible(true);
						Method var10 = var5.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						var10.setAccessible(true);
						String var11 = (String) var9.invoke(var7);
						String var12 = (String) var10.invoke(var7, new URL("https://" + this.host + "/"), "https");
						var4 = var11 + ": " + var12;
					}
				}
			} catch (Exception var15) {
			}
			return this.method18860(var3.getHostName(), var3.getPort(), var4);
		} else if (arg0.type() == Type.SOCKS) {
			Socket var14 = new Socket(arg0);
			var14.connect(new InetSocketAddress(this.host, this.port));
			return var14;
		} else {
			return null;
		}
	}

	@ObfuscatedName("aob.s(Ljava/lang/String;ILjava/lang/String;I)Ljava/net/Socket;")
	public Socket method18860(String arg0, int arg1, String arg2) throws IOException {
		Socket var4 = new Socket(arg0, arg1);
		var4.setSoTimeout(10000);
		OutputStream var5 = var4.getOutputStream();
		if (arg2 == null) {
			var5.write(("CONNECT " + this.host + ":" + this.port + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			var5.write(("CONNECT " + this.host + ":" + this.port + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		var5.flush();
		BufferedReader var6 = new BufferedReader(new InputStreamReader(var4.getInputStream()));
		String var7 = var6.readLine();
		if (var7 != null) {
			if (var7.startsWith("HTTP/1.0 200") || var7.startsWith("HTTP/1.1 200")) {
				return var4;
			}
			if (var7.startsWith("HTTP/1.0 407") || var7.startsWith("HTTP/1.1 407")) {
				int var8 = 0;
				String var9 = "proxy-authenticate: ";
				String var10 = var6.readLine();
				while (var10 != null && var8 < 50) {
					if (var10.toLowerCase().startsWith(var9)) {
						String var11 = var10.substring(var9.length()).trim();
						int var12 = var11.indexOf(32);
						if (var12 != -1) {
							var11 = var11.substring(0, var12);
						}
						throw new ProxyAuthenticationRequiredException(var11);
					}
					var10 = var6.readLine();
					var8++;
				}
				throw new ProxyAuthenticationRequiredException("");
			}
		}
		var5.close();
		var6.close();
		var4.close();
		return null;
	}
}
