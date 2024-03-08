package com.jagex;

import com.jagex.deob.ObfuscatedName;
import com.jagex.deob.Statics;
import jaclib.nanotime.QueryPerformanceCounter;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;

@ObfuscatedName("sk")
public abstract class class507 implements class509, Runnable, FocusListener, WindowListener {

	@ObfuscatedName("sk.n")
	public static long field6584 = 20000000L;

	@ObfuscatedName("sk.m")
	public static int field6585 = 0;

	@ObfuscatedName("sk.k")
	public static int field6602 = 0;

	@ObfuscatedName("sk.l")
	public static long[] field6589 = new long[32];

	@ObfuscatedName("sk.z")
	public static long[] field6591 = new long[32];

	@ObfuscatedName("sk.y")
	public static int field6596 = 0;

	@ObfuscatedName("sk.q")
	public static int field6597 = 0;

	@ObfuscatedName("sk.b")
	public static String field6598 = null;

	@ObfuscatedName("sk.j")
	public static volatile boolean field6599 = true;

	@ObfuscatedName("sk.ae")
	public static int field6614 = 500;

	@ObfuscatedName("sk.ag")
	public static volatile boolean field6606 = false;

	@ObfuscatedName("sk.ah")
	public static volatile long field6595 = 0L;

	@ObfuscatedName("sk.ac")
	public static boolean field6603 = false;

	@ObfuscatedName("sk.ai")
	public static volatile boolean field6604 = true;

	@ObfuscatedName("sk.aj")
	public static class753 field6613 = null;

	@ObfuscatedName("sk.ay")
	public static class753 field6615 = null;

	@ObfuscatedName("sk.ab")
	public static class753 field6619 = null;

	@ObfuscatedName("sk.bl")
	public static class506 field6618 = null;

	@ObfuscatedName("sk.bk")
	public static long field6609 = 0L;

	@ObfuscatedName("sk.bh")
	public static boolean field6620 = false;

	@ObfuscatedName("sk.bx")
	public boolean field6621 = false;

	@ObfuscatedName("sk.bd")
	public static int field6616 = -1;

	@ObfuscatedName("sk.bc")
	public static int field6623 = 1;

	@ObfuscatedName("sk.bi")
	public boolean field6601 = false;

	public void supplyApplet(Applet arg0) {
		Statics.field11885 = arg0;
	}

	@ObfuscatedName("sk.e(Lsq;Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
	public final void method8066(class512 arg0, String arg1, String arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
		try {
			this.method8051(class506.field6581, arg7);
			Statics.field6593 = Statics.field6586 = arg0.method8179();
			Statics.field4827 = Statics.field6600 = arg0.method8180();
			field6596 = 0;
			field6597 = 0;
			if (method4419() == class506.field6582) {
				Statics.field6593 += arg0.method8181() * 2;
				Statics.field4827 += arg0.method8182() * 2;
				this.method8029(arg0.method8183());
			}
			Statics.field9164 = Statics.field11885;
			this.method8026(arg1, arg2, arg3, arg4, arg5, arg6);
		} catch (Throwable var10) {
			class1211.method9845(null, var10);
			this.method8087("crash");
		}
	}

	@ObfuscatedName("sk.n(Ljava/lang/String;Ljava/lang/String;IIIII)V")
	public final void method8026(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) throws Exception {
		Statics.field599 = arg3;
		Statics.field2935 = arg2;
		Statics.field12493 = arg4;
		Statics.field12494 = arg5;
		Statics.field3182 = "Unknown";
		Statics.field628 = "1.1";
		try {
			Statics.field3182 = System.getProperty("java.vendor");
			Statics.field628 = System.getProperty("java.version");
		} catch (Exception var33) {
		}
		try {
			Statics.field11708 = System.getProperty("os.name");
		} catch (Exception var32) {
			Statics.field11708 = "Unknown";
		}
		Statics.field2601 = Statics.field11708.toLowerCase();
		try {
			Statics.field2153 = System.getProperty("os.arch").toLowerCase();
		} catch (Exception var31) {
			Statics.field2153 = "";
		}
		try {
			Statics.field7881 = System.getProperty("os.version").toLowerCase();
		} catch (Exception var30) {
			Statics.field7881 = "";
		}
		try {
			Statics.field4331 = System.getProperty("user.home");
			if (Statics.field4331 != null) {
				Statics.field4331 = Statics.field4331 + "/";
			}
		} catch (Exception var29) {
		}
		try {
			if (Statics.field2601.startsWith("win")) {
				if (Statics.field4331 == null) {
					Statics.field4331 = System.getenv("USERPROFILE");
				}
			} else if (Statics.field4331 == null) {
				Statics.field4331 = System.getenv("HOME");
			}
			if (Statics.field4331 != null) {
				Statics.field4331 = Statics.field4331 + "/";
			}
		} catch (Exception var28) {
		}
		if (Statics.field4331 == null) {
			Statics.field4331 = "~/";
		}
		try {
			Statics.field7240 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var27) {
		}
		Statics.field586 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field4331, "/tmp/", "" };
		Statics.field3219 = new String[] { ".jagex_cache_" + Statics.field2935, ".file_store_" + Statics.field2935 };
		int var14 = 0;
		label131: while (var14 < 4) {
			Statics.field6579 = this.method8034(arg0, arg1, var14);
			if (!Statics.field6579.exists()) {
				Statics.field6579.mkdirs();
			}
			File[] var15 = Statics.field6579.listFiles();
			if (var15 == null) {
				break;
			}
			File[] var16 = var15;
			int var17 = 0;
			while (true) {
				if (var17 >= var16.length) {
					break label131;
				}
				File var18 = var16[var17];
				if (!this.method8028(var18, false)) {
					var14++;
					break;
				}
				var17++;
			}
		}
		class510.method3546(Statics.field6579);
		method141();
		field6615 = new class753(new class752(class510.method18852("main_file_cache.dat2"), "rw", 3221225472L), 5200, 0);
		field6619 = new class753(new class752(class510.method18852("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		Statics.field7422 = new class753[Statics.field599];
		for (int var19 = 0; var19 < Statics.field599; var19++) {
			Statics.field7422[var19] = new class753(new class752(class510.method18852("main_file_cache.idx" + var19), "rw", 1048576L), 6000, 0);
		}
		try {
			Statics.field6629 = new class726();
		} catch (Exception var26) {
			class725.field8531 = false;
		}
		Statics.field1880 = new class508();
		ThreadGroup var21 = Thread.currentThread().getThreadGroup();
		for (ThreadGroup var22 = var21.getParent(); var22 != null; var22 = var22.getParent()) {
			var21 = var22;
		}
		Thread[] var23 = new Thread[1000];
		var21.enumerate(var23);
		for (int var24 = 0; var24 < var23.length; var24++) {
			if (var23[var24] != null && var23[var24].getName().startsWith("AWT")) {
				var23[var24].setPriority(1);
			}
		}
		Thread var25 = new Thread(this);
		var25.setDaemon(true);
		var25.start();
		var25.setPriority(1);
	}

	@ObfuscatedName("sk.m(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
	public File method8034(String arg0, String arg1, int arg2) {
		String var4 = arg2 == 0 ? "" : "" + arg2;
		Statics.field6608 = new File(Statics.field4331, "jagex_cl_" + arg0 + "_" + arg1 + var4 + ".dat");
		String var5 = null;
		String var6 = null;
		boolean var7 = false;
		if (Statics.field6608.exists()) {
			try {
				class752 var8 = new class752(Statics.field6608, "rw", 10000L);
				class997 var9 = new class997((int) var8.method14821());
				while (var9.field11503 * 212851357 < var9.field11502.length) {
					int var10 = var8.method14812(var9.field11502, var9.field11503 * 212851357, var9.field11502.length - var9.field11503 * 212851357);
					if (var10 == -1) {
						throw new IOException();
					}
					var9.field11503 += var10 * -1445626955;
				}
				var9.field11503 = 0;
				int var11 = var9.method17904();
				if (var11 < 1 || var11 > 3) {
					throw new IOException("" + var11);
				}
				int var12 = 0;
				if (var11 > 1) {
					var12 = var9.method17904();
				}
				if (var11 <= 2) {
					var5 = var9.method17919();
					if (var12 == 1) {
						var6 = var9.method17919();
					}
				} else {
					var5 = var9.method17920();
					if (var12 == 1) {
						var6 = var9.method17920();
					}
				}
				var8.method14818();
			} catch (IOException var29) {
				var29.printStackTrace();
			}
			if (var5 != null) {
				File var14 = new File(var5);
				if (!var14.exists()) {
					var5 = null;
				}
			}
			if (var5 != null) {
				File var15 = new File(var5, "test.dat");
				if (!this.method8028(var15, true)) {
					var5 = null;
				}
			}
		}
		if (var5 == null && arg2 == 0) {
			label103: for (int var16 = 0; var16 < Statics.field3219.length; var16++) {
				for (int var17 = 0; var17 < Statics.field586.length; var17++) {
					File var18 = new File(Statics.field586[var17] + Statics.field3219[var16] + File.separatorChar + arg0 + File.separatorChar);
					if (var18.exists() && this.method8028(new File(var18, "test.dat"), true)) {
						var5 = var18.toString();
						var7 = true;
						break label103;
					}
				}
			}
		}
		if (var5 == null) {
			var5 = Statics.field4331 + File.separatorChar + "jagexcache" + var4 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
			var7 = true;
		}
		if (var6 != null) {
			File var19 = new File(var6);
			File var20 = new File(var5);
			try {
				File[] var21 = var19.listFiles();
				File[] var22 = var21;
				for (int var23 = 0; var23 < var22.length; var23++) {
					File var24 = var22[var23];
					File var25 = new File(var20, var24.getName());
					boolean var26 = var24.renameTo(var25);
					if (!var26) {
						throw new IOException();
					}
				}
			} catch (Exception var28) {
				var28.printStackTrace();
			}
			var7 = true;
		}
		if (var7) {
			this.method8027(new File(var5), null);
		}
		return new File(var5);
	}

	@ObfuscatedName("sk.k(Ljava/io/File;Ljava/io/File;I)V")
	public void method8027(File arg0, File arg1) {
		try {
			class752 var3 = new class752(Statics.field6608, "rw", 10000L);
			class997 var4 = new class997(500);
			var4.method18001(3);
			var4.method18001(arg1 == null ? 0 : 1);
			var4.method17895(arg0.getPath());
			if (arg1 != null) {
				var4.method17895(arg1.getPath());
			}
			var3.method14808(var4.field11502, 0, var4.field11503 * 212851357);
			var3.method14818();
		} catch (IOException var6) {
			var6.printStackTrace();
		}
	}

	@ObfuscatedName("sk.f(Ljava/io/File;ZB)Z")
	public boolean method8028(File arg0, boolean arg1) {
		try {
			RandomAccessFile var3 = new RandomAccessFile(arg0, "rw");
			int var4 = var3.read();
			var3.seek(0L);
			var3.write(var4);
			var3.seek(0L);
			var3.close();
			if (arg1) {
				arg0.delete();
			}
			return true;
		} catch (Exception var6) {
			return false;
		}
	}

	@ObfuscatedName("amr.l(Ljava/lang/String;Ljava/lang/String;ZI)Labl;")
	public static class752 method18567(String arg0, String arg1, boolean arg2) {
		File var3 = new File(Statics.field6579, "preferences" + arg0 + ".dat");
		if (var3.exists()) {
			try {
				return new class752(var3, "rw", 10000L);
			} catch (IOException var14) {
			}
		}
		String var6 = "";
		if (Statics.field2935 == 33) {
			var6 = "_rc";
		} else if (Statics.field2935 == 34) {
			var6 = "_wip";
		}
		File var7 = new File(Statics.field4331, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
		if (!arg2 && var7.exists()) {
			try {
				return new class752(var7, "rw", 10000L);
			} catch (IOException var13) {
			}
		}
		try {
			return new class752(var3, "rw", 10000L);
		} catch (IOException var12) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("n.u(I)V")
	public static void method141() {
		try {
			File var0 = new File(Statics.field4331, "random.dat");
			if (var0.exists()) {
				field6613 = new class753(new class752(var0, "rw", 25L), 24, 0);
			} else {
				label34: for (int var1 = 0; var1 < Statics.field3219.length; var1++) {
					for (int var2 = 0; var2 < Statics.field586.length; var2++) {
						File var3 = new File(Statics.field586[var2] + Statics.field3219[var1] + File.separatorChar + "random.dat");
						if (var3.exists()) {
							field6613 = new class753(new class752(var3, "rw", 25L), 24, 0);
							break label34;
						}
					}
				}
			}
			if (field6613 == null) {
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
				int var5 = var4.read();
				var4.seek(0L);
				var4.write(var5);
				var4.seek(0L);
				var4.close();
				field6613 = new class753(new class752(var0, "rw", 25L), 24, 0);
			}
		} catch (IOException var7) {
		}
	}

	@ObfuscatedName("hj.z(Lalw;I)V")
	public static void method4286(class997 arg0) {
		byte[] var1 = new byte[24];
		try {
			field6613.method14824(0L);
			field6613.method14826(var1);
			int var2;
			for (var2 = 0; var2 < 24 && var1[var2] == 0; var2++) {
			}
			if (var2 >= 24) {
				throw new IOException();
			}
		} catch (Exception var5) {
			for (int var4 = 0; var4 < 24; var4++) {
				var1[var4] = -1;
			}
		}
		arg0.method17896(var1, 0, 24);
	}

	@ObfuscatedName("az.p(Lalw;II)V")
	public static void method1001(class997 arg0, int arg1) {
		if (field6613 == null) {
			return;
		}
		try {
			field6613.method14824(0L);
			field6613.method14828(arg0.field11502, arg1, 24);
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("sk.d(Ljava/lang/String;B)V")
	public synchronized void method8029(String arg0) {
		Statics.field7425 = new Frame();
		Statics.field7425.setTitle(arg0);
		Statics.field7425.setResizable(true);
		Statics.field7425.addWindowListener(this);
		Statics.field7425.setBackground(Color.black);
		Statics.field7425.setVisible(true);
		Statics.field7425.toFront();
		Insets var2 = Statics.field7425.getInsets();
		Statics.field7425.setSize(Statics.field6593 + var2.left + var2.right, Statics.field4827 + var2.top + var2.bottom);
	}

	@ObfuscatedName("sk.s(I)V")
	public synchronized void method8030() {
		this.method8032();
		Container var1 = method7321();
		Statics.field10578 = new class1206(var1);
		this.method8129(var1);
	}

	@ObfuscatedName("qf.y(I)Ljava/awt/Container;")
	public static Container method7321() {
		if (Statics.field12101 == null) {
			return Statics.field7425 == null ? Statics.field11885 : Statics.field7425;
		} else {
			return Statics.field12101;
		}
	}

	@ObfuscatedName("sk.q(Ljava/awt/Container;I)V")
	public void method8129(Container arg0) {
		arg0.setBackground(Color.black);
		arg0.setLayout(null);
		arg0.add(Statics.field10578);
		Statics.field10578.setSize(Statics.field6586, Statics.field6600);
		Statics.field10578.setVisible(true);
		if (Statics.field7425 == arg0) {
			Insets var2 = Statics.field7425.getInsets();
			Statics.field10578.setLocation(field6596 + var2.left, field6597 + var2.top);
		} else {
			Statics.field10578.setLocation(field6596, field6597);
		}
		Statics.field10578.addFocusListener(this);
		Statics.field10578.requestFocus();
		Statics.field8491 = true;
		field6604 = true;
		Statics.field10578.setFocusTraversalKeysEnabled(false);
		field6599 = true;
		field6606 = false;
		field6595 = class213.method3655();
	}

	@ObfuscatedName("sk.x(I)V")
	public void method8032() {
		if (Statics.field10578 != null) {
			Statics.field10578.removeFocusListener(this);
			Statics.field10578.getParent().setBackground(Color.black);
			Statics.field10578.getParent().remove(Statics.field10578);
		}
	}

	@ObfuscatedName("sk.b(I)Z")
	public final boolean method8033() {
		if (!client.ENABLE_HOST_CHECK) {
			return true;
		}

		String var1 = Statics.field11885.getDocumentBase().getHost().toLowerCase();
		if (var1.equals("jagex.com") || var1.endsWith(".jagex.com")) {
			return true;
		} else if (var1.equals("runescape.com") || var1.endsWith(".runescape.com")) {
			return true;
		} else if (var1.equals("stellardawn.com") || var1.endsWith(".stellardawn.com")) {
			return true;
		} else if (var1.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
				var1 = var1.substring(0, var1.length() - 1);
			}
			if (var1.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method8087("invalidhost");
				return false;
			}
		}
	}

	public void run() {
		try {
			this.method8035();
		} catch (ThreadDeath var7) {
			throw var7;
		} catch (Throwable var8) {
			class1211.method9845(this.method8038(), var8);
			this.method8087("crash");
		} finally {
			this.method8085(true);
		}
	}

	@ObfuscatedName("sk.h(I)V")
	public void method8035() {
		if (Statics.field3182 != null) {
			String var1 = Statics.field3182.toLowerCase();
			if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
				String var2 = Statics.field628;
				if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
					this.method8087("wrongjava");
					return;
				}
				if (var2.startsWith("1.6.0_")) {
					int var3;
					for (var3 = 6; var3 < var2.length() && class695.method6819(var2.charAt(var3)); var3++) {
					}
					String var4 = var2.substring(6, var3);
					if (class695.method9836(var4) && class695.method9595(var4) < 10) {
						this.method8087("wrongjava");
						return;
					}
				}
			}
		}
		method7321().setFocusCycleRoot(true);
		field6616 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
		field6623 = Runtime.getRuntime().availableProcessors();
		this.method8030();
		this.method8045();
		Statics.field6594 = class511.method6109();
		while (field6609 == 0L || class213.method3655() < field6609) {
			Statics.field6624 = Statics.field6594.method8158(field6584);
			for (int var5 = 0; var5 < Statics.field6624; var5++) {
				this.method8036();
			}
			this.method8037();
			Statics.method218(Statics.field10578);
		}
	}

	@ObfuscatedName("sk.g(B)V")
	public void method8036() {
		long var1 = class213.method3655();
		long var3 = field6591[Statics.field6587];
		field6591[Statics.field6587] = var1;
		Statics.field6587 = Statics.field6587 + 1 & 0x1F;
		if (var3 != 0L && var1 > var3) {
		}
		synchronized (this) {
			Statics.field8491 = field6604;
		}
		this.method8046();
	}

	@ObfuscatedName("sk.i(I)V")
	public void method8037() {
		long var1 = class213.method3655();
		long var3 = field6589[Statics.field6590 - 1 & 0x1F];
		long var5 = field6589[Statics.field6590];
		field6589[Statics.field6590] = var1;
		Statics.field6590 = Statics.field6590 + 1 & 0x1F;
		if (var5 != 0L && var1 > var5) {
			int var7 = (int) (var1 - var5);
			field6602 = (int) (var1 - var3);
			field6585 = ((var7 >> 1) + 32000) / var7;
		}
		if (++field6614 - 1 > 50) {
			field6614 -= 50;
			field6599 = true;
			Statics.field10578.setSize(Statics.field6586, Statics.field6600);
			Statics.field10578.setVisible(true);
			if (Statics.field7425 != null && Statics.field12101 == null) {
				Insets var8 = Statics.field7425.getInsets();
				Statics.field10578.setLocation(field6596 + var8.left, field6597 + var8.top);
			} else {
				Statics.field10578.setLocation(field6596, field6597);
			}
		}
		this.method8047();
	}

	@ObfuscatedName("sk.j(B)Ljava/lang/String;")
	public String method8038() {
		return null;
	}

	@ObfuscatedName("sk.t(ZI)V")
	public final void method8085(boolean arg0) {
		synchronized (this) {
			if (field6620) {
				return;
			}
			field6620 = true;
		}
		try {
			this.method8048();
		} catch (Exception var11) {
		}
		try {
			field6615.method14834();
			for (int var5 = 0; var5 < Statics.field599; var5++) {
				Statics.field7422[var5].method14834();
			}
			field6619.method14834();
			field6613.method14834();
		} catch (Exception var12) {
		}
		if (this.field6601) {
			try {
				QueryPerformanceCounter.quit();
			} catch (Throwable var10) {
			}
		}
		if (class500.method14526()) {
			Statics.method5134().method7909();
		}
		if (Statics.field10578 != null) {
			try {
				Statics.field10578.removeFocusListener(this);
				Statics.field10578.getParent().remove(Statics.field10578);
			} catch (Exception var9) {
			}
		}
		if (Statics.field7425 != null) {
			Statics.field7425.setVisible(false);
			Statics.field7425.dispose();
			Statics.field7425 = null;
		}
	}

	@ObfuscatedName("nw.ae(B)I")
	public static final int method6016() {
		return (int) (1000000000L / field6584);
	}

	@ObfuscatedName("e.ag(B)V")
	public static final void method135() {
		Statics.field6594.method8156();
		for (int var0 = 0; var0 < 32; var0++) {
			field6589[var0] = 0L;
		}
		for (int var1 = 0; var1 < 32; var1++) {
			field6591[var1] = 0L;
		}
		Statics.field6624 = 0;
	}

	@ObfuscatedName("ts.ah(B)J")
	public static long method8660() {
		return Statics.field6594.method8173();
	}

	public void start() {
		if (!field6620) {
			field6609 = 0L;
		}
	}

	public void stop() {
		if (!field6620) {
			field6609 = class213.method3655() + 4000L;
		}
	}

	public void destroy() {
		if (!field6620) {
			field6609 = class213.method3655();
			class214.method1571(5000L);
			this.method8085(false);
		}
	}

	public final void update(Graphics arg0) {
		this.paint(arg0);
	}

	public final synchronized void paint(Graphics arg0) {
		if (field6620) {
			return;
		}
		field6599 = true;
		if (class213.method3655() - field6595 > 1000L) {
			Rectangle var2 = arg0.getClipBounds();
			if (var2 == null || var2.width >= Statics.field6593 && var2.height >= Statics.field4827) {
				field6606 = true;
			}
		}
	}

	public final void focusGained(FocusEvent arg0) {
		field6604 = true;
		field6599 = true;
	}

	public final void focusLost(FocusEvent arg0) {
		field6604 = false;
	}

	public final void windowActivated(WindowEvent arg0) {
	}

	public final void windowClosed(WindowEvent arg0) {
	}

	public final void windowClosing(WindowEvent arg0) {
		field6603 = true;
		this.destroy();
	}

	public final void windowDeactivated(WindowEvent arg0) {
	}

	public final void windowDeiconified(WindowEvent arg0) {
	}

	public final void windowIconified(WindowEvent arg0) {
	}

	public final void windowOpened(WindowEvent arg0) {
	}

	@ObfuscatedName("ul.as(ILjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;I)V")
	public static final void method8913(int arg0, String arg1, Color arg2, Color arg3, Color arg4) {
		try {
			Graphics var5 = Statics.field10578.getGraphics();
			if (Statics.field9147 == null) {
				Statics.field9147 = new Font("Helvetica", 1, 13);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(255, 255, 255);
			}
			try {
				if (Statics.field2575 == null) {
					Statics.field2575 = Statics.field10578.createImage(Statics.field6586, Statics.field6600);
				}
				Graphics var6 = Statics.field2575.getGraphics();
				var6.setColor(Color.black);
				var6.fillRect(0, 0, Statics.field6586, Statics.field6600);
				int var7 = Statics.field6586 / 2 - 152;
				int var8 = Statics.field6600 / 2 - 18;
				var6.setColor(arg3);
				var6.drawRect(var7, var8, 303, 33);
				var6.setColor(arg2);
				var6.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
				var6.setColor(Color.black);
				var6.drawRect(var7 + 1, var8 + 1, 301, 31);
				var6.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
				var6.setFont(Statics.field9147);
				var6.setColor(arg4);
				var6.drawString(arg1, var7 + (304 - arg1.length() * 6) / 2, var8 + 22);
				if (field6598 != null) {
					var6.setFont(Statics.field9147);
					var6.setColor(arg4);
					var6.drawString(field6598, Statics.field6586 / 2 - field6598.length() * 6 / 2, Statics.field6600 / 2 - 26);
				}
				var5.drawImage(Statics.field2575, 0, 0, null);
			} catch (Exception var13) {
				var5.setColor(Color.black);
				var5.fillRect(0, 0, Statics.field6586, Statics.field6600);
				int var10 = Statics.field6586 / 2 - 152;
				int var11 = Statics.field6600 / 2 - 18;
				var5.setColor(arg3);
				var5.drawRect(var10, var11, 303, 33);
				var5.setColor(arg2);
				var5.fillRect(var10 + 2, var11 + 2, arg0 * 3, 30);
				var5.setColor(Color.black);
				var5.drawRect(var10 + 1, var11 + 1, 301, 31);
				var5.fillRect(arg0 * 3 + var10 + 2, var11 + 2, 300 - arg0 * 3, 30);
				var5.setFont(Statics.field9147);
				var5.setColor(arg4);
				if (field6598 != null) {
					var5.setFont(Statics.field9147);
					var5.setColor(arg4);
					var5.drawString(field6598, Statics.field6586 / 2 - field6598.length() * 6 / 2, Statics.field6600 / 2 - 26);
				}
				var5.drawString(arg1, var10 + (304 - arg1.length() * 6) / 2, var11 + 22);
			}
		} catch (Exception var14) {
			Statics.field10578.repaint();
		}
	}

	@ObfuscatedName("ew.at(B)V")
	public static final void method2901() {
		Statics.field2575 = null;
		Statics.field9147 = null;
	}

	@ObfuscatedName("sk.ad(Ljava/lang/String;I)V")
	public void method8087(String arg0) {
		if (this.field6621) {
			return;
		}
		this.field6621 = true;
		System.out.println("error_game_" + arg0);
		try {
			class766.method14969(Statics.field11885, "loggedout");
		} catch (Throwable var5) {
		}
		try {
			Statics.field11885.getAppletContext().showDocument(new URL(Statics.field11885.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (Exception var4) {
		}
	}

	@ObfuscatedName("sk.am(Ljava/lang/String;Ljava/lang/String;B)V")
	public void method8071(String arg0, String arg1) {
		if (this.field6621) {
			return;
		}
		this.field6621 = true;
		System.out.println("error_game_" + arg0);
		try {
			class766.method14969(Statics.field11885, "loggedout");
		} catch (Throwable var6) {
		}
		try {
			Statics.field11885.getAppletContext().showDocument(new URL(Statics.field11885.getCodeBase(), "error_game_" + arg0 + ".ws?" + arg1), "_top");
		} catch (Exception var5) {
		}
	}

	@ObfuscatedName("sk.au(B)V")
	public void method8050() throws class1111 {
		if (this.field6601) {
			return;
		}
		Statics.method5134().method7902("jaclib");
		try {
			QueryPerformanceCounter.init();
		} catch (Throwable var2) {
			if (Statics.field2601.startsWith("win")) {
				throw new class1111(128, "jaclib");
			}
		}
		this.field6601 = true;
	}

	@ObfuscatedName("sk.ar(Lsm;ZI)V")
	public void method8051(class506 arg0, boolean arg1) {
		if (arg0 == null) {
			throw new NullPointerException();
		} else if (class506.field6581 == arg0 || class506.field6580 == arg0) {
			field6618 = arg0;
			if (field6618 != class506.field6580 && arg1) {
				field6618 = class506.field6582;
			}
		} else {
			throw new IllegalStateException();
		}
	}

	@ObfuscatedName("in.ap(B)Lsm;")
	public static class506 method4419() {
		return field6618;
	}

	@ObfuscatedName("sk.al(I)V")
	public abstract void method8045();

	@ObfuscatedName("sk.ac(I)V")
	public abstract void method8046();

	@ObfuscatedName("sk.ai(I)V")
	public abstract void method8047();

	@ObfuscatedName("sk.aw(B)V")
	public abstract void method8048();

	public abstract void init();
}
