package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.*;
import java.net.Proxy.Type;
import java.nio.charset.Charset;
import java.util.List;

@OriginalClass("client!aoj")
public final class Class45_Sub1 extends Class45 {

	@OriginalMember(owner = "client!aoj", name = "u", descriptor = "Ljava/lang/String;")
	static final String aString69 = "java.net.useSystemProxies";

	@OriginalMember(owner = "client!aoj", name = "e", descriptor = "Ljava/net/ProxySelector;")
	final ProxySelector aProxySelector1 = ProxySelector.getDefault();

	@OriginalMember(owner = "client!aoj", name = "aci", descriptor = "(Lclient!yp;S)V")
	static void method17304(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = arg0.aClass378_3.aByte137;
	}

	@OriginalMember(owner = "client!aoj", name = "<init>", descriptor = "()V")
	Class45_Sub1() {
	}

	@OriginalMember(owner = "client!aoj", name = "l", descriptor = "()Ljava/net/Socket;")
	@Override
	public Socket method17287() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(19) boolean local19 = this.anInt2422 * 279443859 == 443;
		@Pc(41) List local41;
		@Pc(63) List local63;
		try {
			local41 = this.aProxySelector1.select(new URI((local19 ? "https" : "http") + "://" + this.aString68));
			local63 = this.aProxySelector1.select(new URI((local19 ? "http" : "https") + "://" + this.aString68));
		} catch (@Pc(65) URISyntaxException local65) {
			return this.method17285((byte) 97);
		}
		local41.addAll(local63);
		@Pc(76) Object[] local76 = local41.toArray();
		@Pc(78) IOException_Sub1 local78 = null;
		@Pc(80) Object[] local80 = local76;
		for (@Pc(82) int local82 = 0; local82 < local80.length; local82++) {
			@Pc(90) Object local90 = local80[local82];
			@Pc(93) Proxy local93 = (Proxy) local90;
			try {
				@Pc(98) Socket local98 = this.method17299(local93, 1544291491);
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
		return this.method17285((byte) 92);
	}

	@OriginalMember(owner = "client!aoj", name = "f", descriptor = "(I)Ljava/net/Socket;")
	@Override
	public Socket method17286(@OriginalArg(0) int arg0) throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(19) boolean local19 = this.anInt2422 * 279443859 == 443;
		@Pc(41) List local41;
		@Pc(63) List local63;
		try {
			local41 = this.aProxySelector1.select(new URI((local19 ? "https" : "http") + "://" + this.aString68));
			local63 = this.aProxySelector1.select(new URI((local19 ? "http" : "https") + "://" + this.aString68));
		} catch (@Pc(65) URISyntaxException local65) {
			return this.method17285((byte) 10);
		}
		local41.addAll(local63);
		@Pc(76) Object[] local76 = local41.toArray();
		@Pc(78) IOException_Sub1 local78 = null;
		@Pc(80) Object[] local80 = local76;
		for (@Pc(82) int local82 = 0; local82 < local80.length; local82++) {
			@Pc(90) Object local90 = local80[local82];
			@Pc(93) Proxy local93 = (Proxy) local90;
			try {
				@Pc(98) Socket local98 = this.method17299(local93, 1544291491);
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
		return this.method17285((byte) 97);
	}

	@OriginalMember(owner = "client!aoj", name = "w", descriptor = "(Ljava/net/Proxy;I)Ljava/net/Socket;")
	Socket method17299(@OriginalArg(0) Proxy arg0, @OriginalArg(1) int arg1) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method17285((byte) 123);
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
					@Pc(71) Method local71 = local27.getDeclaredMethod("supportsPreemptiveAuthorization");
					local71.setAccessible(true);
					if ((Boolean) local71.invoke(local63)) {
						@Pc(88) Method local88 = local27.getDeclaredMethod("getHeaderName");
						local88.setAccessible(true);
						@Pc(105) Method local105 = local27.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local105.setAccessible(true);
						@Pc(115) String local115 = (String) local88.invoke(local63);
						@Pc(143) String local143 = (String) local105.invoke(local63, new URL("https://" + this.aString68 + "/"), "https");
						local24 = local115 + ": " + local143;
					}
				}
			} catch (@Pc(156) Exception local156) {
			}
			return this.method17301(local18.getHostName(), local18.getPort(), local24, 1361539180);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(174) Socket local174 = new Socket(arg0);
			local174.connect(new InetSocketAddress(this.aString68, this.anInt2422 * 279443859));
			return local174;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aoj", name = "u", descriptor = "()Ljava/net/Socket;")
	@Override
	public Socket method17288() throws IOException {
		@Pc(3) boolean local3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!local3) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		@Pc(19) boolean local19 = this.anInt2422 * 279443859 == 443;
		@Pc(41) List local41;
		@Pc(63) List local63;
		try {
			local41 = this.aProxySelector1.select(new URI((local19 ? "https" : "http") + "://" + this.aString68));
			local63 = this.aProxySelector1.select(new URI((local19 ? "http" : "https") + "://" + this.aString68));
		} catch (@Pc(65) URISyntaxException local65) {
			return this.method17285((byte) 99);
		}
		local41.addAll(local63);
		@Pc(76) Object[] local76 = local41.toArray();
		@Pc(78) IOException_Sub1 local78 = null;
		@Pc(80) Object[] local80 = local76;
		for (@Pc(82) int local82 = 0; local82 < local80.length; local82++) {
			@Pc(90) Object local90 = local80[local82];
			@Pc(93) Proxy local93 = (Proxy) local90;
			try {
				@Pc(98) Socket local98 = this.method17299(local93, 1544291491);
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
		return this.method17285((byte) 104);
	}

	@OriginalMember(owner = "client!aoj", name = "q", descriptor = "(Ljava/net/Proxy;)Ljava/net/Socket;")
	Socket method17300(@OriginalArg(0) Proxy arg0) throws IOException {
		if (arg0.type() == Type.DIRECT) {
			return this.method17285((byte) 122);
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
					@Pc(71) Method local71 = local27.getDeclaredMethod("supportsPreemptiveAuthorization");
					local71.setAccessible(true);
					if ((Boolean) local71.invoke(local63)) {
						@Pc(88) Method local88 = local27.getDeclaredMethod("getHeaderName");
						local88.setAccessible(true);
						@Pc(105) Method local105 = local27.getDeclaredMethod("getHeaderValue", URL.class, String.class);
						local105.setAccessible(true);
						@Pc(115) String local115 = (String) local88.invoke(local63);
						@Pc(143) String local143 = (String) local105.invoke(local63, new URL("https://" + this.aString68 + "/"), "https");
						local24 = local115 + ": " + local143;
					}
				}
			} catch (@Pc(156) Exception local156) {
			}
			return this.method17301(local18.getHostName(), local18.getPort(), local24, 1827744226);
		} else if (arg0.type() == Type.SOCKS) {
			@Pc(174) Socket local174 = new Socket(arg0);
			local174.connect(new InetSocketAddress(this.aString68, this.anInt2422 * 279443859));
			return local174;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aoj", name = "r", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/net/Socket;")
	Socket method17301(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString68 + ":" + this.anInt2422 * 279443859 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString68 + ":" + this.anInt2422 * 279443859 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
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
					@Pc(102) int local102 = 0;
					@Pc(104) String local104 = "proxy-authenticate: ";
					local79 = local76.readLine();
					while (local79 != null && local102 < 50) {
						if (local79.toLowerCase().startsWith(local104)) {
							local79 = local79.substring(local104.length()).trim();
							@Pc(127) int local127 = local79.indexOf(32);
							if (local127 != -1) {
								local79 = local79.substring(0, local127);
							}
							throw new IOException_Sub1(local79);
						}
						local79 = local76.readLine();
						local102++;
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

	@OriginalMember(owner = "client!aoj", name = "h", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	Socket method17302(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString68 + ":" + this.anInt2422 * 279443859 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString68 + ":" + this.anInt2422 * 279443859 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(76) BufferedReader local76 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(79) String local79 = local76.readLine();
		if (local79 != null) {
			if (local79.startsWith("HTTP/1.0 200") || local79.startsWith("HTTP/1.1 200")) {
				return local5;
			}
			if (local79.startsWith("HTTP/1.0 407") || local79.startsWith("HTTP/1.1 407")) {
				@Pc(102) int local102 = 0;
				@Pc(104) String local104 = "proxy-authenticate: ";
				local79 = local76.readLine();
				while (local79 != null && local102 < 50) {
					if (local79.toLowerCase().startsWith(local104)) {
						local79 = local79.substring(local104.length()).trim();
						@Pc(127) int local127 = local79.indexOf(32);
						if (local127 != -1) {
							local79 = local79.substring(0, local127);
						}
						throw new IOException_Sub1(local79);
					}
					local79 = local76.readLine();
					local102++;
				}
				throw new IOException_Sub1("");
			}
		}
		local11.close();
		local76.close();
		local5.close();
		return null;
	}

	@OriginalMember(owner = "client!aoj", name = "d", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
	Socket method17303(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) throws IOException {
		@Pc(5) Socket local5 = new Socket(arg0, arg1);
		local5.setSoTimeout(10000);
		@Pc(11) OutputStream local11 = local5.getOutputStream();
		if (arg2 == null) {
			local11.write(("CONNECT " + this.aString68 + ":" + this.anInt2422 * 279443859 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			local11.write(("CONNECT " + this.aString68 + ":" + this.anInt2422 * 279443859 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		local11.flush();
		@Pc(76) BufferedReader local76 = new BufferedReader(new InputStreamReader(local5.getInputStream()));
		@Pc(79) String local79 = local76.readLine();
		if (local79 != null) {
			if (local79.startsWith("HTTP/1.0 200") || local79.startsWith("HTTP/1.1 200")) {
				return local5;
			}
			if (local79.startsWith("HTTP/1.0 407") || local79.startsWith("HTTP/1.1 407")) {
				@Pc(102) int local102 = 0;
				@Pc(104) String local104 = "proxy-authenticate: ";
				local79 = local76.readLine();
				while (local79 != null && local102 < 50) {
					if (local79.toLowerCase().startsWith(local104)) {
						local79 = local79.substring(local104.length()).trim();
						@Pc(127) int local127 = local79.indexOf(32);
						if (local127 != -1) {
							local79 = local79.substring(0, local127);
						}
						throw new IOException_Sub1(local79);
					}
					local79 = local76.readLine();
					local102++;
				}
				throw new IOException_Sub1("");
			}
		}
		local11.close();
		local76.close();
		local5.close();
		return null;
	}
}
