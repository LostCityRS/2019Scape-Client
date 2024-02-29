import java.applet.Applet;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.AccessControlException;
import java.security.AllPermission;
import java.security.CodeSource;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Permissions;
import java.security.ProtectionDomain;
import java.security.cert.Certificate;
import java.util.Hashtable;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.util.jar.JarOutputStream;
import java.util.jar.Pack200;
import java.util.jar.Pack200.Unpacker;
import java.util.zip.GZIPInputStream;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!Rs2Applet")
public final class Rs2Applet extends Applet {

	@OriginalMember(owner = "loader!Rs2Applet", name = "d", descriptor = "I")
	static int anInt5969;

	@OriginalMember(owner = "loader!Rs2Applet", name = "j", descriptor = "I")
	static int anInt5970;

	@OriginalMember(owner = "loader!Rs2Applet", name = "m", descriptor = "I")
	static int anInt5971;

	@OriginalMember(owner = "loader!Rs2Applet", name = "a", descriptor = "I")
	static int anInt5972;

	@OriginalMember(owner = "loader!Rs2Applet", name = "c", descriptor = "I")
	static int anInt5973;

	@OriginalMember(owner = "loader!Rs2Applet", name = "o", descriptor = "I")
	static int anInt5974;

	@OriginalMember(owner = "loader!Rs2Applet", name = "h", descriptor = "I")
	static int anInt5975;

	@OriginalMember(owner = "loader!Rs2Applet", name = "n", descriptor = "I")
	static int anInt5976;

	@OriginalMember(owner = "loader!Rs2Applet", name = "f", descriptor = "I")
	static int anInt5977;

	@OriginalMember(owner = "loader!Rs2Applet", name = "p", descriptor = "I")
	static int anInt5978;

	@OriginalMember(owner = "loader!Rs2Applet", name = "l", descriptor = "I")
	static int anInt5979;

	@OriginalMember(owner = "loader!Rs2Applet", name = "e", descriptor = "[C")
	private static char[] aCharArray10 = new char[64];

	@OriginalMember(owner = "loader!Rs2Applet", name = "i", descriptor = "Lloader!e;")
	private Class724 aClass724_1;

	@OriginalMember(owner = "loader!Rs2Applet", name = "g", descriptor = "Lloader!e;")
	private Class724 aClass724_2;

	@OriginalMember(owner = "loader!Rs2Applet", name = "q", descriptor = "Z")
	private boolean aBoolean882 = false;

	@OriginalMember(owner = "loader!Rs2Applet", name = "b", descriptor = "Ljava/lang/Class;")
	private Class aClass3 = null;

	@OriginalMember(owner = "loader!Rs2Applet", name = "k", descriptor = "Ljava/lang/Object;")
	private Object anObject28 = null;

	@OriginalMember(owner = "loader!Rs2Applet", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 9)
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anObject28 != null) {
			this.method36947(new Class[] { Graphics.class }, new Object[] { arg0 }, "paint", -97);
		}
		anInt5970++;
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "a", descriptor = "(Ljava/lang/Throwable;B)V", line = 29)
	private final void method36944(@OriginalArg(0) Throwable arg0, @OriginalArg(1) byte arg1) {
		anInt5977++;
		this.method36946((byte) -48, arg0, Class724_Sub1_Sub1_Sub1.aClass724_12);
		if (arg1 != -36) {
			method36948(null, null, true);
		}
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "a", descriptor = "(ILjava/lang/String;)V", line = 40)
	private final void method36945(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		anInt5971++;
		if (this.aBoolean882) {
			return;
		}
		this.aBoolean882 = true;
		if (arg0 != 20000) {
			return;
		}
		System.out.println("error_game_" + arg1);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "start", descriptor = "()V", line = 60)
	@Override
	public final void start() {
		if (this.anObject28 != null) {
			this.method36947(null, null, "start", -71);
		}
		anInt5976++;
	}

	static {
		@Pc(271) int local271;
		for (local271 = 0; local271 < 26; local271++) {
			aCharArray10[local271] = (char) (local271 + 65);
		}
		for (local271 = 26; local271 < 52; local271++) {
			aCharArray10[local271] = (char) (local271 + -26 + 97);
		}
		for (local271 = 52; local271 < 62; local271++) {
			aCharArray10[local271] = (char) (local271 + -4);
		}
		aCharArray10[62] = '-';
		aCharArray10[63] = '_';
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 96)
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (this.anObject28 != null) {
			this.method36947(new Class[] { Graphics.class }, new Object[] { arg0 }, "update", -75);
		}
		anInt5979++;
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "destroy", descriptor = "()V", line = 110)
	@Override
	public final void destroy() {
		anInt5972++;
		if (this.anObject28 != null) {
			this.method36947(null, null, "destroy", -55);
		}
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "a", descriptor = "(BLjava/lang/Throwable;Lloader!e;)V", line = 120)
	private final void method36946(@OriginalArg(0) byte arg0, @OriginalArg(1) Throwable arg1, @OriginalArg(2) Class724 arg2) {
		method36948(arg1, null, true);
		anInt5969++;
		if (Class724_Sub1_Sub1_Sub1.aClass724_12 == arg2 && arg1 instanceof AccessControlException) {
			arg2 = Class724_Sub1_Sub1.aClass724_11;
		}
		this.method36945(20000, (String) ((Class724_Sub1) arg2).anObject39);
		if (arg0 < -10) {
			throw new RuntimeException(arg1);
		}
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "a", descriptor = "([Ljava/lang/Class;[Ljava/lang/Object;Ljava/lang/String;I)V", line = 141)
	private final void method36947(@OriginalArg(0) Class[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		anInt5973++;
		if (arg3 >= -43) {
			this.method36945(1, null);
		}
		try {
			@Pc(19) Method local19 = this.aClass3.getMethod(arg2, arg0);
			local19.invoke(this.anObject28, arg1);
		} catch (@Pc(27) NoSuchMethodException local27) {
			this.method36944(local27, (byte) -36);
		} catch (@Pc(33) IllegalAccessException local33) {
			this.method36944(local33, (byte) -36);
		} catch (@Pc(39) InvocationTargetException local39) {
			this.method36944(local39, (byte) -36);
		} catch (@Pc(45) Throwable local45) {
			this.method36944(local45, (byte) -36);
		}
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "<init>", descriptor = "()V", line = 167)
	public Rs2Applet() {
		Class724_Sub1_Sub1.anInt6000 = 178548606;
		Class724_Sub1.anInt5998 = 595355181;
		Class726.anApplet4 = this;
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "stop", descriptor = "()V", line = 178)
	@Override
	public final void stop() {
		anInt5974++;
		if (this.anObject28 != null) {
			this.method36947(null, null, "stop", -69);
		}
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "init", descriptor = "()V", line = 191)
	@Override
	public final void init() {
		@Pc(1) boolean local1 = Class724.aBoolean888;
		try {
			@Pc(7) byte[] var1;
			@Pc(29) byte[] var2;
			label393: {
				var1 = Class724_Sub1_Sub1_Sub1_Sub1_Sub1.method36968((byte) 105, this.getParameter("0"));
				@Pc(13) String local13 = this.getParameter("-1");
				@Pc(21) int local21 = local13 == null ? 0 : local13.length();
				if (local21 == 0) {
					var2 = new byte[0];
					if (!local1) {
						break label393;
					}
				}
				@Pc(43) int var6;
				label404: {
					@Pc(37) int local37 = local21 + 3 & 0xFFFFFFFC;
					var6 = local37 / 4 * 3;
					if (local21 <= local37 - 2 || Class724_Sub1_Sub1.method36964(local13.charAt(local37 + -2), -69) == -1) {
						var6 -= 2;
						if (!local1) {
							break label404;
						}
					}
					if (local21 <= local37 - 1 || Class724_Sub1_Sub1.method36964(local13.charAt(-1 + local37), -121) == -1) {
						var6--;
					}
				}
				@Pc(92) byte[] local92 = new byte[var6];
				var2 = local92;
				ClassLoader_Sub1.method36955(local92, 0, local13, (byte) -87);
			}
			@Pc(102) byte[] local102 = var2;
			try {
				@Pc(107) Class724_Sub1 local107 = new Class724_Sub1(-121);
				@Pc(115) SecretKeySpec local115 = new SecretKeySpec(var1, "AES");
				((Class724_Sub1) local107).anObject39 = Cipher.getInstance("AES/CBC/PKCS5Padding");
				((Cipher) ((Class724_Sub1) local107).anObject39).init(2, local115, new IvParameterSpec(local102));
				this.aClass724_1 = local107;
			} catch (@Pc(140) NoSuchPaddingException local140) {
				this.method36946((byte) -26, local140, Class725.aClass724_7);
			} catch (@Pc(147) NoSuchAlgorithmException local147) {
				this.method36946((byte) -113, local147, Class725.aClass724_7);
			} catch (@Pc(154) ExceptionInInitializerError local154) {
				this.method36946((byte) -92, local154, Class725.aClass724_7);
			} catch (@Pc(161) NoClassDefFoundError local161) {
				this.method36946((byte) -17, local161, Class725.aClass724_7);
			} catch (@Pc(168) InvalidAlgorithmParameterException local168) {
				this.method36946((byte) -57, local168, Class724_Sub1_Sub1_Sub1.aClass724_12);
			} catch (@Pc(175) InvalidKeyException local175) {
				this.method36946((byte) -31, local175, Class724_Sub1_Sub1_Sub1.aClass724_12);
			}
			@Pc(185) Class724_Sub1_Sub1_Sub1_Sub1_Sub1 local185 = new Class724_Sub1_Sub1_Sub1_Sub1_Sub1(107);
			@Pc(188) Class724 local188 = this.aClass724_1;
			@Pc(191) Class724_Sub1_Sub1_Sub1_Sub1 local191 = (Class724_Sub1_Sub1_Sub1_Sub1) local185;
			@Pc(196) ClassLoader_Sub1 local196 = new ClassLoader_Sub1(local185);
			local191.anObject42 = local196;
			((Class724_Sub1_Sub1_Sub1_Sub1_Sub1) local185).anObject43 = local188;
			((Class724_Sub1_Sub1) local185).anObject40 = new Hashtable();
			((Class724_Sub1) local185).anObject39 = new Hashtable();
			@Pc(219) Permissions local219 = new Permissions();
			local219.add(new AllPermission());
			((Class724_Sub1_Sub1_Sub1) local185).anObject41 = new ProtectionDomain(new CodeSource(null, (Certificate[]) null), local219);
			this.aClass724_2 = local185;
			@Pc(250) InputStream local250 = this.getClass().getClassLoader().getResourceAsStream("inner.pack.gz");
			if (local250 == null) {
				this.method36944(new RuntimeException(), (byte) -36);
				System.exit(1);
			}
			@Pc(266) byte[] local266 = new byte[5242880];
			@Pc(268) int local268 = 0;
			try {
				@Pc(277) int local277 = local250.read(local266, local268, -local268 + 5242880);
				while (local277 != -1) {
					local268 += local277;
					local277 = local250.read(local266, local268, 5242880 - local268);
					if (local1 || local1) {
						break;
					}
				}
			} catch (@Pc(300) IOException local300) {
				this.method36944(local300, (byte) -36);
			}
			@Pc(307) byte[] local307 = new byte[local268];
			System.arraycopy(local266, 0, local307, 0, local268);
			@Pc(319) byte[] local319 = Class727.method36971(local307, (byte) -76, this.aClass724_1);
			@Pc(321) Unpacker local321 = Pack200.newUnpacker();
			@Pc(326) ByteArrayOutputStream local326 = new ByteArrayOutputStream(5242880);
			try {
				@Pc(331) JarOutputStream local331 = new JarOutputStream(local326);
				@Pc(339) GZIPInputStream local339 = new GZIPInputStream(new ByteArrayInputStream(local319));
				local321.unpack(local339, local331);
				local331.close();
			} catch (@Pc(347) IOException local347) {
				this.method36944(local347, (byte) -36);
			}
			@Pc(353) JarInputStream local353 = null;
			boolean var40 = false;
			label353: {
				@Pc(380) int var10000;
				label396: {
					label351: {
						label350: {
							label349: {
								try {
									var40 = true;
									local353 = new JarInputStream(new ByteArrayInputStream(local326.toByteArray()));
									label341: do {
										@Pc(367) JarEntry local367;
										if ((local367 = local353.getNextJarEntry()) == null) {
											var40 = false;
											break label350;
										}
										@Pc(371) String local371 = local367.getName();
										local268 = 0;
										var10000 = local353.read(local266, local268, 5242880 - local268);
										if (local1) {
											var40 = false;
											break label396;
										}
										@Pc(383) int local383 = var10000;
										while (true) {
											if (local383 != -1) {
												local268 += local383;
												local383 = local353.read(local266, local268, -local268 + 5242880);
												if (local1) {
													break;
												}
												if (!local1) {
													continue;
												}
											}
											if (!local371.endsWith(".class")) {
												continue label341;
											}
											local371 = local371.replace('/', '.');
											break;
										}
										@Pc(422) byte[] local422 = new byte[local268];
										System.arraycopy(local266, 0, local422, 0, local268);
										RuntimeException_Sub5.method36951(local371.substring(0, local371.length() + -6), 63, this.aClass724_2, local422);
									} while (!local1);
									var40 = false;
									break label350;
								} catch (@Pc(450) IOException local450) {
									this.method36944(local450, (byte) -36);
									var40 = false;
									break label349;
								} catch (@Pc(461) Throwable local461) {
									this.method36944(local461, (byte) -36);
									var40 = false;
								} finally {
									if (var40 && local353 != null) {
										local353.close();
									}
								}
								if (local353 != null) {
									local353.close();
								}
								break label351;
							}
							if (local353 != null) {
								local353.close();
							}
							break label351;
						}
						if (local353 != null) {
							local353.close();
						}
					}
					try {
						this.aClass3 = ((ClassLoader) (this.aClass724_2 == null ? null : ((Class724_Sub1_Sub1_Sub1_Sub1) this.aClass724_2).anObject42)).loadClass("client");
					} catch (@Pc(500) ClassNotFoundException local500) {
						this.method36944(local500, (byte) -36);
					}
					if (this.aClass3 != null) {
						break label353;
					}
					this.method36944(new RuntimeException(), (byte) -36);
					var10000 = 1;
				}
				System.exit(var10000);
			}
			try {
				@Pc(524) Constructor local524 = this.aClass3.getConstructor(null);
				this.anObject28 = local524.newInstance((Object[]) null);
			} catch (@Pc(532) NoSuchMethodException local532) {
				this.method36944(local532, (byte) -36);
			} catch (@Pc(538) InvocationTargetException local538) {
				this.method36944(local538, (byte) -36);
			} catch (@Pc(544) IllegalAccessException local544) {
				this.method36944(local544, (byte) -36);
			} catch (@Pc(550) InstantiationException local550) {
				this.method36944(local550, (byte) -36);
			} catch (@Pc(556) Throwable local556) {
				this.method36944(local556, (byte) -36);
			}
			if (this.anObject28 == null) {
				this.method36944(new RuntimeException(), (byte) -36);
				System.exit(1);
			}
			this.method36947(new Class[] { Applet.class }, new Object[] { this }, "supplyApplet", -78);
			this.method36947(null, null, "init", -94);
		} catch (@Pc(601) Throwable local601) {
			this.method36944(local601, (byte) -36);
		}
		anInt5978++;
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;Z)V", line = 405)
	private static final void method36948(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) boolean local1 = Class724.aBoolean888;
		anInt5975++;
		try {
			@Pc(7) String local7 = "";
			@Pc(17) String local17;
			if (arg0 != null) {
				@Pc(12) Throwable var5;
				label92: {
					var5 = arg0;
					if (!(arg0 instanceof RuntimeException_Sub5)) {
						local17 = "";
						if (!local1) {
							break label92;
						}
					}
					@Pc(22) RuntimeException_Sub5 local22 = (RuntimeException_Sub5) arg0;
					local17 = local22.aString246 + " | ";
					var5 = local22.aThrowable2;
				}
				@Pc(41) StringWriter local41 = new StringWriter();
				@Pc(46) PrintWriter local46 = new PrintWriter(local41);
				var5.printStackTrace(local46);
				local46.close();
				@Pc(54) String local54 = local41.toString();
				@Pc(62) BufferedReader local62 = new BufferedReader(new StringReader(local54));
				@Pc(65) String local65 = local62.readLine();
				while (true) {
					@Pc(68) String local68 = local62.readLine();
					if (local68 != null) {
						@Pc(74) int local74 = local68.indexOf(40);
						@Pc(82) int local82 = local68.indexOf(41, 1 - -local74);
						if (local1) {
							break;
						}
						@Pc(91) String var15;
						label81: {
							if (local74 == -1) {
								var15 = local68;
								if (!local1) {
									break label81;
								}
							}
							var15 = local68.substring(0, local74);
						}
						var15 = var15.trim();
						var15 = var15.substring(var15.lastIndexOf(32) + 1);
						var15 = var15.substring(var15.lastIndexOf(9) + 1);
						local17 = local17 + var15;
						if (local74 != -1 && local82 != -1) {
							@Pc(143) int local143 = local68.indexOf(".java:", local74);
							if (local143 >= 0) {
								local17 = local17 + local68.substring(local143 + 5, local82);
							}
						}
						local17 = local17 + ' ';
						if (!local1) {
							continue;
						}
					}
					local17 = local17 + "| " + local65;
					break;
				}
				local7 = local17;
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			System.out.println("Error: " + Class724_Sub1_Sub1_Sub1_Sub1_Sub1.method36969("%0a", local7, "\n", false));
			local7 = Class724_Sub1_Sub1_Sub1_Sub1.method36967(local7, (byte) -124);
			@Pc(244) URL local244 = null;
			if (Class726.anApplet4 != null) {
				local244 = Class726.anApplet4.getCodeBase();
			} else if (Class724_Sub1_Sub1_Sub1_Sub1.aClass724_13 != null) {
				throw new IllegalStateException();
			}
			if (!arg2) {
				aCharArray10 = null;
			}
			if (local244 == null) {
				return;
			}
			@Pc(274) String local274 = "Unknown";
			local17 = "1.1";
			try {
				local274 = System.getProperty("java.vendor");
				local17 = System.getProperty("java.version");
			} catch (@Pc(290) Exception local290) {
			}
			@Pc(359) URL local359 = new URL(local244, "clienterror.ws?c=" + Class724_Sub1_Sub1.anInt6000 * 1013086201 + "&cs=" + Class724_Sub1.anInt5998 * 248437157 + "&u=" + (Class724_Sub1_Sub1_Sub1_Sub1.aString248 == null ? "" + Class724_Sub1.aLong313 * 4011307936987254977L : Class724_Sub1_Sub1_Sub1_Sub1.method36967(Class724_Sub1_Sub1_Sub1_Sub1.aString248, (byte) -127)) + "&v1=" + Class724_Sub1_Sub1_Sub1_Sub1.method36967(local274, (byte) -126) + "&v2=" + Class724_Sub1_Sub1_Sub1_Sub1.method36967(local17, (byte) -127) + "&e=" + local7);
			@Pc(365) DataInputStream local365 = new DataInputStream(local359.openStream());
			local365.read();
			local365.close();
		} catch (@Pc(372) Exception local372) {
			local372.printStackTrace();
		}
	}
}
