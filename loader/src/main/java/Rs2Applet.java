import java.applet.Applet;
import java.awt.Graphics;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.AccessControlException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
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
	static int anInt1;

	@OriginalMember(owner = "loader!Rs2Applet", name = "o", descriptor = "I")
	static int anInt2;

	@OriginalMember(owner = "loader!Rs2Applet", name = "m", descriptor = "J")
	static long aLong1;

	@OriginalMember(owner = "loader!Rs2Applet", name = "c", descriptor = "I")
	static int anInt3;

	@OriginalMember(owner = "loader!Rs2Applet", name = "q", descriptor = "I")
	static int anInt4;

	@OriginalMember(owner = "loader!Rs2Applet", name = "k", descriptor = "I")
	static int anInt5;

	@OriginalMember(owner = "loader!Rs2Applet", name = "f", descriptor = "I")
	static int anInt6;

	@OriginalMember(owner = "loader!Rs2Applet", name = "b", descriptor = "I")
	static int anInt7;

	@OriginalMember(owner = "loader!Rs2Applet", name = "j", descriptor = "I")
	static int anInt8;

	@OriginalMember(owner = "loader!Rs2Applet", name = "a", descriptor = "I")
	static int anInt9;

	@OriginalMember(owner = "loader!Rs2Applet", name = "g", descriptor = "I")
	static int anInt10;

	@OriginalMember(owner = "loader!Rs2Applet", name = "p", descriptor = "Lloader!d;")
	private Class1 aClass1_1;

	@OriginalMember(owner = "loader!Rs2Applet", name = "e", descriptor = "Lloader!d;")
	private Class1 aClass1_2;

	@OriginalMember(owner = "loader!Rs2Applet", name = "i", descriptor = "Ljava/lang/Object;")
	private Object anObject1 = null;

	@OriginalMember(owner = "loader!Rs2Applet", name = "n", descriptor = "Ljava/lang/Class;")
	private Class aClass1 = null;

	@OriginalMember(owner = "loader!Rs2Applet", name = "h", descriptor = "Z")
	private boolean aBoolean1 = false;

	@OriginalMember(owner = "loader!Rs2Applet", name = "<init>", descriptor = "()V")
	public Rs2Applet() {
		Class1_Sub1.anInt53 = 1167538543;
		Class1_Sub1.anInt52 = -365896410;
		Class1_Sub1_Sub1.anApplet4 = this;
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "a", descriptor = "(Lloader!d;Ljava/lang/Throwable;I)V")
	private void method1(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Throwable arg1, @OriginalArg(2) int arg2) {
		anInt5++;
		Class1.method30(arg1, null, arg2 + -69);
		if (arg2 != 0) {
			return;
		}
		if (Class6.aClass1_7 == arg0 && arg1 instanceof AccessControlException) {
			arg0 = Class4.aClass1_4;
		}
		this.method4(47, (String) ((Class1_Sub1) arg0).anObject12);
		throw new RuntimeException(arg1);
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "a", descriptor = "([Ljava/lang/Object;[Ljava/lang/Class;BLjava/lang/String;)V")
	private void method2(@OriginalArg(0) Object[] arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) String arg3) {
		anInt2++;
		try {
			@Pc(9) Method local9 = this.aClass1.getMethod(arg3, arg1);
			local9.invoke(this.anObject1, arg0);
		} catch (@Pc(17) NoSuchMethodException local17) {
			this.method3(5242880, local17);
		} catch (@Pc(23) IllegalAccessException local23) {
			this.method3(arg2 + 5242817, local23);
		} catch (@Pc(31) InvocationTargetException local31) {
			this.method3(arg2 + 5242817, local31);
		} catch (@Pc(39) Throwable local39) {
			this.method3(5242880, local39);
		}
		if (arg2 != 63) {
			this.method2(null, null, (byte) -14, null);
		}
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "stop", descriptor = "()V")
	@Override
	public void stop() {
		if (this.anObject1 != null) {
			this.method2(null, null, (byte) 63, "stop");
		}
		anInt8++;
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "destroy", descriptor = "()V")
	@Override
	public void destroy() {
		if (this.anObject1 != null) {
			this.method2(null, null, (byte) 63, "destroy");
		}
		anInt4++;
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "start", descriptor = "()V")
	@Override
	public void start() {
		if (this.anObject1 != null) {
			this.method2(null, null, (byte) 63, "start");
		}
		anInt10++;
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "a", descriptor = "(ILjava/lang/Throwable;)V")
	private void method3(@OriginalArg(0) int arg0, @OriginalArg(1) Throwable arg1) {
		this.method1(Class6.aClass1_7, arg1, 0);
		anInt1++;
		if (arg0 != 5242880) {
			this.init();
		}
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anObject1 != null) {
			this.method2(new Object[] { arg0 }, new Class[] { Graphics.class }, (byte) 63, "paint");
		}
		anInt9++;
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anObject1 != null) {
			this.method2(new Object[] { arg0 }, new Class[] { Graphics.class }, (byte) 63, "update");
		}
		anInt7++;
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method4(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		anInt6++;
		if (this.aBoolean1) {
			return;
		}
		this.aBoolean1 = true;
		System.out.println("error_game_" + arg1);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
		} catch (@Pc(50) Exception local50) {
		}
		if (arg0 != 47) {
			this.anObject1 = null;
		}
	}

	@OriginalMember(owner = "loader!Rs2Applet", name = "init", descriptor = "()V")
	@Override
	public void init() {
		anInt3++;
		try {
			@Pc(11) byte[] local11 = Class7.method40((byte) 32, this.getParameter("0"));
			@Pc(19) byte[] local19 = Class7.method40((byte) 32, this.getParameter("-1"));
			try {
				@Pc(24) Class1_Sub1 local24 = new Class1_Sub1(-93);
				@Pc(32) SecretKeySpec local32 = new SecretKeySpec(local11, "AES");
				((Class1_Sub1) local24).anObject12 = Cipher.getInstance("AES/CBC/PKCS5Padding");
				((Cipher) ((Class1_Sub1) local24).anObject12).init(2, local32, new IvParameterSpec(local19));
				this.aClass1_2 = local24;
			} catch (@Pc(57) NoSuchPaddingException local57) {
				this.method1(Class1_Sub1_Sub1_Sub1_Sub1.aClass1_5, local57, 0);
			} catch (@Pc(64) NoSuchAlgorithmException local64) {
				this.method1(Class1_Sub1_Sub1_Sub1_Sub1.aClass1_5, local64, 0);
			} catch (@Pc(71) ExceptionInInitializerError local71) {
				this.method1(Class1_Sub1_Sub1_Sub1_Sub1.aClass1_5, local71, 0);
			} catch (@Pc(78) NoClassDefFoundError local78) {
				this.method1(Class1_Sub1_Sub1_Sub1_Sub1.aClass1_5, local78, 0);
			} catch (@Pc(85) InvalidAlgorithmParameterException local85) {
				this.method1(Class6.aClass1_7, local85, 0);
			} catch (@Pc(92) InvalidKeyException local92) {
				this.method1(Class6.aClass1_7, local92, 0);
			}
			this.aClass1_1 = Class1_Sub1_Sub1_Sub1_Sub1_Sub1.method35(true, new Class1_Sub1_Sub1_Sub1_Sub1_Sub1(52), this.aClass1_2);
			@Pc(115) InputStream local115 = this.getClass().getClassLoader().getResourceAsStream("inner.pack.gz");
			if (local115 == null) {
				this.method3(5242880, new RuntimeException());
				System.exit(1);
			}
			@Pc(131) byte[] local131 = new byte[5242880];
			@Pc(133) int local133 = 0;
			try {
				for (@Pc(142) int local142 = local115.read(local131, local133, -local133 + 5242880); local142 != -1; local142 = local115.read(local131, local133, -local133 + 5242880)) {
					local133 += local142;
				}
			} catch (@Pc(167) IOException local167) {
				this.method3(5242880, local167);
			}
			@Pc(174) byte[] local174 = new byte[local133];
			System.arraycopy(local131, 0, local174, 0, local133);
			@Pc(186) byte[] local186 = Class5.method29(local174, this.aClass1_2, true);
			@Pc(188) Unpacker local188 = Pack200.newUnpacker();
			@Pc(193) ByteArrayOutputStream local193 = new ByteArrayOutputStream(5242880);
			try {
				@Pc(198) JarOutputStream local198 = new JarOutputStream(local193);
				@Pc(206) GZIPInputStream local206 = new GZIPInputStream(new ByteArrayInputStream(local186));
				local188.unpack(local206, local198);
				local198.close();
			} catch (@Pc(214) IOException local214) {
				this.method3(5242880, local214);
			}
			@Pc(220) JarInputStream local220 = null;
			try {
				local220 = new JarInputStream(new ByteArrayInputStream(local193.toByteArray()));
				@Pc(233) JarEntry local233;
				while ((local233 = local220.getNextJarEntry()) != null) {
					@Pc(237) String local237 = local233.getName();
					local133 = 0;
					for (@Pc(250) int local250 = local220.read(local131, local133, -local133 + 5242880); local250 != -1; local250 = local220.read(local131, local133, -local133 + 5242880)) {
						local133 += local250;
					}
					if (local237.endsWith(".class")) {
						local237 = local237.replace('/', '.');
						@Pc(288) byte[] local288 = new byte[local133];
						System.arraycopy(local131, 0, local288, 0, local133);
						Class1.method31(this.aClass1_1, true, local237.substring(0, local237.length() - 6), local288);
					}
				}
			} catch (@Pc(315) IOException local315) {
				this.method3(5242880, local315);
			} catch (@Pc(325) Throwable local325) {
				this.method3(5242880, local325);
			} finally {
				if (local220 != null) {
					local220.close();
				}
			}
			try {
				this.aClass1 = ((ClassLoader) (this.aClass1_1 == null ? null : ((Class1_Sub1_Sub1) this.aClass1_1).anObject13)).loadClass("client");
			} catch (@Pc(363) ClassNotFoundException local363) {
				this.method3(5242880, local363);
			}
			if (this.aClass1 == null) {
				this.method3(5242880, new RuntimeException());
				System.exit(1);
			}
			try {
				@Pc(386) Constructor local386 = this.aClass1.getConstructor(null);
				this.anObject1 = local386.newInstance((Object[]) null);
			} catch (@Pc(394) NoSuchMethodException local394) {
				this.method3(5242880, local394);
			} catch (@Pc(400) InvocationTargetException local400) {
				this.method3(5242880, local400);
			} catch (@Pc(406) IllegalAccessException local406) {
				this.method3(5242880, local406);
			} catch (@Pc(412) InstantiationException local412) {
				this.method3(5242880, local412);
			} catch (@Pc(418) Throwable local418) {
				this.method3(5242880, local418);
			}
			if (this.anObject1 == null) {
				this.method3(5242880, new RuntimeException());
				System.exit(1);
			}
			this.method2(new Object[] { this }, new Class[] { Applet.class }, (byte) 63, "supplyApplet");
			this.method2(null, null, (byte) 63, "init");
		} catch (@Pc(463) Throwable local463) {
			this.method3(5242880, local463);
		}
	}
}
