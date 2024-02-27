package com.jagex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aob")
public final class Class49_Sub1 extends Class49 {

	@OriginalMember(owner = "client!aob", name = "k", descriptor = "Ljava/lang/String;")
	static final String aString59 = "java.net.useSystemProxies";

	@OriginalMember(owner = "client!aob", name = "m", descriptor = "Ljava/net/ProxySelector;")
	final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!aob", name = "zj", descriptor = "(Lclient!yf;I)V")
	static void method16631(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(29) Class39 local29 = (Class39) Class19.aClass32_Sub7_5.method18273(local13, 1759496810);
		if (local29.aClass519_1 != Class519.aClass519_7) {
		}
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local29.method749(local23, -1899126758);
	}

	@OriginalMember(owner = "client!aob", name = "<init>", descriptor = "()V")
	Class49_Sub1() {
	}

	@OriginalMember(owner = "client!aob", name = "o", descriptor = "(Ljava/net/Proxy;B)Ljava/net/Socket;")
	Socket method16624(@OriginalArg(0) Proxy arg0, @OriginalArg(1) byte arg1) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method16608(2127330538);
		}
		@Pc(10) SocketAddress local10 = arg0.address();
		if (!(local10 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(18) InetSocketAddress local18 = (InetSocketAddress) local10;
		if (arg0.type() == Type.HTTP) {
			@Pc(24) String local24 = null;
			try {
				@Pc(27) Class local27 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(41) Method local41 = local27.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				local41.setAccessible(true);
				@Pc(63) Object local63 = local41.invoke(null, local18.getHostName(), Integer.valueOf(local18.getPort()));
				if (local63 != null) {
					@Pc(72) Method local72 = local27.getDeclaredMethod("supportsPreemptiveAuthorization");
					local72.setAccessible(true);
					if ((Boolean) local72.invoke(local63)) {
						@Pc(89) Method local89 = local27.getDeclaredMethod("getHeaderName");
						local89.setAccessible(true);
						@Pc(106) Method local106 = local27.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local106.setAccessible(true);
						@Pc(116) String local116 = (String) local89.invoke(local63);
						@Pc(144) String local144 = (String) local106.invoke(local63, new URL("https://" + this.aString58 + "/"), "https");
						local24 = local116 + ": " + local144;
					}
				}
			} catch (@Pc(157) Exception local157) {
			}
			return this.method16628(local18.getHostName(), local18.getPort(), local24, -337914294);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(175) Socket local175 = new Socket(arg0);
			local175.connect(new InetSocketAddress(this.aString58, this.anInt2384 * -872061967));
			return local175;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aob", name = "n", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method16611(@OriginalArg(0) int arg0) throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(19) boolean local19 = this.anInt2384 * -872061967 == 443;
		@Pc(41) List local41;
		@Pc(63) List local63;
		try {
			local41 = this.aProxySelector1.select(new URI((local19 ? "https" : "http") + "://" + this.aString58));
			local63 = this.aProxySelector1.select(new URI((local19 ? "http" : "https") + "://" + this.aString58));
		} catch (@Pc(65) URISyntaxException local65) {
			return this.method16608(2055205362);
		}
		local41.addAll(local63);
		@Pc(76) Object[] local76 = local41.toArray();
		@Pc(78) IOException_Sub1 local78 = null;
		@Pc(80) Object[] local80 = local76;
		for (@Pc(82) int local82 = 0; local82 < local80.length; local82++) {
			@Pc(90) Object local90 = local80[local82];
			@Pc(93) Proxy local93 = (Proxy) local90;
			try {
				@Pc(98) Socket local98 = this.method16624(local93, (byte) 76);
				if (local98 != null) {
					return local98;
				}
			} catch (@Pc(104) IOException_Sub1 local104) {
				local78 = local104;
			} catch (@Pc(108) IOException local108) {
			}
		}
		if (local78 != null) {
			throw local78;
		}
		return this.method16608(2095754772);
	}

	@OriginalMember(owner = "client!aob", name = "y", descriptor = "(Ljava/net/Proxy;)Ljava/net/Socket;")
	Socket method16625(@OriginalArg(0) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method16608(2074283699);
		}
		@Pc(10) SocketAddress local10 = arg0.address();
		if (!(local10 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(18) InetSocketAddress local18 = (InetSocketAddress) local10;
		if (arg0.type() == Type.HTTP) {
			@Pc(24) String local24 = null;
			try {
				@Pc(27) Class local27 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(41) Method local41 = local27.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				local41.setAccessible(true);
				@Pc(63) Object local63 = local41.invoke(null, local18.getHostName(), Integer.valueOf(local18.getPort()));
				if (local63 != null) {
					@Pc(72) Method local72 = local27.getDeclaredMethod("supportsPreemptiveAuthorization");
					local72.setAccessible(true);
					if ((Boolean) local72.invoke(local63)) {
						@Pc(89) Method local89 = local27.getDeclaredMethod("getHeaderName");
						local89.setAccessible(true);
						@Pc(106) Method local106 = local27.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local106.setAccessible(true);
						@Pc(116) String local116 = (String) local89.invoke(local63);
						@Pc(144) String local144 = (String) local106.invoke(local63, new URL("https://" + this.aString58 + "/"), "https");
						local24 = local116 + ": " + local144;
					}
				}
			} catch (@Pc(157) Exception local157) {
			}
			return this.method16628(local18.getHostName(), local18.getPort(), local24, 2115244260);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(175) Socket local175 = new Socket(arg0);
			local175.connect(new InetSocketAddress(this.aString58, this.anInt2384 * -872061967));
			return local175;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aob", name = "q", descriptor = "(Ljava/net/Proxy;)Ljava/net/Socket;")
	Socket method16626(@OriginalArg(0) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method16608(2135888376);
		}
		@Pc(10) SocketAddress local10 = arg0.address();
		if (!(local10 instanceof InetSocketAddress)) {
			return null;
		}
		@Pc(18) InetSocketAddress local18 = (InetSocketAddress) local10;
		if (arg0.type() == Type.HTTP) {
			@Pc(24) String local24 = null;
			try {
				@Pc(27) Class local27 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				@Pc(41) Method local41 = local27.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
				local41.setAccessible(true);
				@Pc(63) Object local63 = local41.invoke(null, local18.getHostName(), Integer.valueOf(local18.getPort()));
				if (local63 != null) {
					@Pc(72) Method local72 = local27.getDeclaredMethod("supportsPreemptiveAuthorization");
					local72.setAccessible(true);
					if ((Boolean) local72.invoke(local63)) {
						@Pc(89) Method local89 = local27.getDeclaredMethod("getHeaderName");
						local89.setAccessible(true);
						@Pc(106) Method local106 = local27.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local106.setAccessible(true);
						@Pc(116) String local116 = (String) local89.invoke(local63);
						@Pc(144) String local144 = (String) local106.invoke(local63, new URL("https://" + this.aString58 + "/"), "https");
						local24 = local116 + ": " + local144;
					}
				}
			} catch (@Pc(157) Exception local157) {
			}
			return this.method16628(local18.getHostName(), local18.getPort(), local24, -1409837262);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(175) Socket local175 = new Socket(arg0);
			local175.connect(new InetSocketAddress(this.aString58, this.anInt2384 * -872061967));
			return local175;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aob", name = "k", descriptor = "()Ljava/net/Socket;")
	@Override
	public Socket method16609() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(19) boolean local19 = this.anInt2384 * -872061967 == 443;
		@Pc(41) List local41;
		@Pc(63) List local63;
		try {
			local41 = this.aProxySelector1.select(new URI((local19 ? "https" : "http") + "://" + this.aString58));
			local63 = this.aProxySelector1.select(new URI((local19 ? "http" : "https") + "://" + this.aString58));
		} catch (@Pc(65) URISyntaxException local65) {
			return this.method16608(2055233548);
		}
		local41.addAll(local63);
		@Pc(76) Object[] local76 = local41.toArray();
		@Pc(78) IOException_Sub1 local78 = null;
		@Pc(80) Object[] local80 = local76;
		for (@Pc(82) int local82 = 0; local82 < local80.length; local82++) {
			@Pc(90) Object local90 = local80[local82];
			@Pc(93) Proxy local93 = (Proxy) local90;
			try {
				@Pc(98) Socket local98 = this.method16624(local93, (byte) 22);
				if (local98 != null) {
					return local98;
				}
			} catch (@Pc(104) IOException_Sub1 local104) {
				local78 = local104;
			} catch (@Pc(108) IOException local108) {
			}
		}
		if (local78 != null) {
			throw local78;
		}
		return this.method16608(2114740619);
	}

	@OriginalMember(owner = "client!aob", name = "f", descriptor = "()Ljava/net/Socket;")
	@Override
	public Socket method16614() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(19) boolean local19 = this.anInt2384 * -872061967 == 443;
		@Pc(41) List local41;
		@Pc(63) List local63;
		try {
			local41 = this.aProxySelector1.select(new URI((local19 ? "https" : "http") + "://" + this.aString58));
			local63 = this.aProxySelector1.select(new URI((local19 ? "http" : "https") + "://" + this.aString58));
		} catch (@Pc(65) URISyntaxException local65) {
			return this.method16608(2023867919);
		}
		local41.addAll(local63);
		@Pc(76) Object[] local76 = local41.toArray();
		@Pc(78) IOException_Sub1 local78 = null;
		@Pc(80) Object[] local80 = local76;
		for (@Pc(82) int local82 = 0; local82 < local80.length; local82++) {
			@Pc(90) Object local90 = local80[local82];
			@Pc(93) Proxy local93 = (Proxy) local90;
			try {
				@Pc(98) Socket local98 = this.method16624(local93, (byte) 13);
				if (local98 != null) {
					return local98;
				}
			} catch (@Pc(104) IOException_Sub1 local104) {
				local78 = local104;
			} catch (@Pc(108) IOException local108) {
			}
		}
		if (local78 != null) {
			throw local78;
		}
		return this.method16608(2116811866);
	}

	@OriginalMember(owner = "client!aob", name = "w", descriptor = "()Ljava/net/Socket;")
	@Override
	public Socket method16610() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(19) boolean local19 = this.anInt2384 * -872061967 == 443;
		@Pc(41) List local41;
		@Pc(63) List local63;
		try {
			local41 = this.aProxySelector1.select(new URI((local19 ? "https" : "http") + "://" + this.aString58));
			local63 = this.aProxySelector1.select(new URI((local19 ? "http" : "https") + "://" + this.aString58));
		} catch (@Pc(65) URISyntaxException local65) {
			return this.method16608(2073201035);
		}
		local41.addAll(local63);
		@Pc(76) Object[] local76 = local41.toArray();
		@Pc(78) IOException_Sub1 local78 = null;
		@Pc(80) Object[] local80 = local76;
		for (@Pc(82) int local82 = 0; local82 < local80.length; local82++) {
			@Pc(90) Object local90 = local80[local82];
			@Pc(93) Proxy local93 = (Proxy) local90;
			try {
				@Pc(98) Socket local98 = this.method16624(local93, (byte) 64);
				if (local98 != null) {
					return local98;
				}
			} catch (@Pc(104) IOException_Sub1 local104) {
				local78 = local104;
			} catch (@Pc(108) IOException local108) {
			}
		}
		if (local78 != null) {
			throw local78;
		}
		return this.method16608(2028304160);
	}

	@OriginalMember(owner = "client!aob", name = "l", descriptor = "()Ljava/net/Socket;")
	@Override
	public Socket method16607() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(19) boolean local19 = this.anInt2384 * -872061967 == 443;
		@Pc(41) List local41;
		@Pc(63) List local63;
		try {
			local41 = this.aProxySelector1.select(new URI((local19 ? "https" : "http") + "://" + this.aString58));
			local63 = this.aProxySelector1.select(new URI((local19 ? "http" : "https") + "://" + this.aString58));
		} catch (@Pc(65) URISyntaxException local65) {
			return this.method16608(2094547765);
		}
		local41.addAll(local63);
		@Pc(76) Object[] local76 = local41.toArray();
		@Pc(78) IOException_Sub1 local78 = null;
		@Pc(80) Object[] local80 = local76;
		for (@Pc(82) int local82 = 0; local82 < local80.length; local82++) {
			@Pc(90) Object local90 = local80[local82];
			@Pc(93) Proxy local93 = (Proxy) local90;
			try {
				@Pc(98) Socket local98 = this.method16624(local93, (byte) 4);
				if (local98 != null) {
					return local98;
				}
			} catch (@Pc(104) IOException_Sub1 local104) {
				local78 = local104;
			} catch (@Pc(108) IOException local108) {
			}
		}
		if (local78 != null) {
			throw local78;
		}
		return this.method16608(2093991578);
	}

	@OriginalMember(owner = "client!aob", name = "x", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	Socket method16627(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString58 + ":" + this.anInt2384 * -872061967 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString58 + ":" + this.anInt2384 * -872061967 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(76) BufferedReader local76 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(79) String local79 = local76.readLine();
		if (local79 != null) {
			label52: {
				if (!local79.startsWith("HTTP/1.0 200") && !local79.startsWith("HTTP/1.1 200")) {
					if (!local79.startsWith("HTTP/1.0 407") && !local79.startsWith("HTTP/1.1 407")) {
						break label52;
					}
					@Pc(101) int local101 = 0;
					@Pc(103) String local103 = "proxy-authenticate: ";
					local79 = local76.readLine();
					while (local79 != null && local101 < 50) {
						if (local79.toLowerCase().startsWith(local103)) {
							local79 = local79.substring(local103.length()).trim();
							@Pc(127) int local127 = local79.indexOf(32);
							if (local127 != -1) {
								local79 = local79.substring(0, local127);
							}
							throw new IOException_Sub1(local79);
						}
						local79 = local76.readLine();
						local101++;
					}
					throw new IOException_Sub1("");
				}
				return local5;
			}
		}
		local11.close();
		local76.close();
		local5.close();
		return null;
	}

	@OriginalMember(owner = "client!aob", name = "s", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/net/Socket;")
	Socket method16628(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString58 + ":" + this.anInt2384 * -872061967 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString58 + ":" + this.anInt2384 * -872061967 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(76) BufferedReader local76 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(79) String local79 = local76.readLine();
		if (local79 != null) {
			if (local79.startsWith("HTTP/1.0 200") || local79.startsWith("HTTP/1.1 200")) {
				return local5;
			}
			if (local79.startsWith("HTTP/1.0 407") || local79.startsWith("HTTP/1.1 407")) {
				@Pc(101) int local101 = 0;
				@Pc(103) String local103 = "proxy-authenticate: ";
				local79 = local76.readLine();
				while (local79 != null && local101 < 50) {
					if (local79.toLowerCase().startsWith(local103)) {
						local79 = local79.substring(local103.length()).trim();
						@Pc(127) int local127 = local79.indexOf(32);
						if (local127 != -1) {
							local79 = local79.substring(0, local127);
						}
						throw new IOException_Sub1(local79);
					}
					local79 = local76.readLine();
					local101++;
				}
				throw new IOException_Sub1("");
			}
		}
		local11.close();
		local76.close();
		local5.close();
		return null;
	}

	@OriginalMember(owner = "client!aob", name = "b", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	Socket method16629(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString58 + ":" + this.anInt2384 * -872061967 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString58 + ":" + this.anInt2384 * -872061967 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(76) BufferedReader local76 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(79) String local79 = local76.readLine();
		if (local79 != null) {
			label52: {
				if (!local79.startsWith("HTTP/1.0 200") && !local79.startsWith("HTTP/1.1 200")) {
					if (!local79.startsWith("HTTP/1.0 407") && !local79.startsWith("HTTP/1.1 407")) {
						break label52;
					}
					@Pc(101) int local101 = 0;
					@Pc(103) String local103 = "proxy-authenticate: ";
					local79 = local76.readLine();
					while (local79 != null && local101 < 50) {
						if (local79.toLowerCase().startsWith(local103)) {
							local79 = local79.substring(local103.length()).trim();
							@Pc(127) int local127 = local79.indexOf(32);
							if (local127 != -1) {
								local79 = local79.substring(0, local127);
							}
							throw new IOException_Sub1(local79);
						}
						local79 = local76.readLine();
						local101++;
					}
					throw new IOException_Sub1("");
				}
				return local5;
			}
		}
		local11.close();
		local76.close();
		local5.close();
		return null;
	}

	@OriginalMember(owner = "client!aob", name = "h", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	Socket method16630(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString58 + ":" + this.anInt2384 * -872061967 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString58 + ":" + this.anInt2384 * -872061967 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(76) BufferedReader local76 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(79) String local79 = local76.readLine();
		if (local79 != null) {
			label52: {
				if (!local79.startsWith("HTTP/1.0 200") && !local79.startsWith("HTTP/1.1 200")) {
					if (!local79.startsWith("HTTP/1.0 407") && !local79.startsWith("HTTP/1.1 407")) {
						break label52;
					}
					@Pc(101) int local101 = 0;
					@Pc(103) String local103 = "proxy-authenticate: ";
					local79 = local76.readLine();
					while (local79 != null && local101 < 50) {
						if (local79.toLowerCase().startsWith(local103)) {
							local79 = local79.substring(local103.length()).trim();
							@Pc(127) int local127 = local79.indexOf(32);
							if (local127 != -1) {
								local79 = local79.substring(0, local127);
							}
							throw new IOException_Sub1(local79);
						}
						local79 = local76.readLine();
						local101++;
					}
					throw new IOException_Sub1("");
				}
				return local5;
			}
		}
		local11.close();
		local76.close();
		local5.close();
		return null;
	}
}
