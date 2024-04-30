package com.jagex.game.client;

import com.jagex.core.io.BufferedFile;
import com.jagex.core.io.Packet;
import com.jagex.core.utils.*;
import com.jagex.game.fullscreen.Fullscreen;
import com.jagex.graphics.FullscreenImpl;
import deob.ObfuscatedName;
import jaclib.nanotime.QueryPerformanceCounter;
import rs2.client.Client;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;

@ObfuscatedName("sk")
public abstract class GameShell implements GameShellStub, Runnable, FocusListener, WindowListener {

	@ObfuscatedName("sk.e")
	public static int field6624;

	@ObfuscatedName("sk.n")
	public static long logicUpdateInterval = 20000000L;

	@ObfuscatedName("sk.m")
	public static int fps = 0;

	@ObfuscatedName("sk.k")
	public static int fpsAverage = 0;

	@ObfuscatedName("sk.f")
	public static Timer field6594;

	@ObfuscatedName("sk.l")
	public static long[] field6589 = new long[32];

	@ObfuscatedName("sk.u")
	public static int field6590;

	@ObfuscatedName("sk.z")
	public static long[] field6591 = new long[32];

	@ObfuscatedName("sk.p")
	public static int field6587;

	@ObfuscatedName("sk.d")
	public static int frameWid;

	@ObfuscatedName("qf.c")
	public static int frameHei;

	@ObfuscatedName("sk.r")
	public static int canvasWid;

	@ObfuscatedName("sk.v")
	public static int canvasHei;

	@ObfuscatedName("yz.o")
	public static int lastFullscreenWidth;

	@ObfuscatedName("adj.s")
	public static int lastFullscreenHeight;

	@ObfuscatedName("sk.y")
	public static int leftMargin = 0;

	@ObfuscatedName("sk.q")
	public static int topMargin = 0;

	@ObfuscatedName("acr.x")
	public static Font field9147;

	@ObfuscatedName("sk.b")
	public static String field6598 = null;

	@ObfuscatedName("vy.h")
	public static Frame frame;

	@ObfuscatedName("aqy.a")
	public static Frame fsframe;

	@ObfuscatedName("ahs.g")
	public static Canvas canvas;

	@ObfuscatedName("aol.i")
	public static Applet field11885;

	@ObfuscatedName("sk.j")
	public static volatile boolean fullredraw = true;

	@ObfuscatedName("ho.t")
	public static Image field2575;

	@ObfuscatedName("sk.ae")
	public static int field6614 = 500;

	@ObfuscatedName("sk.ag")
	public static volatile boolean canvasReplaceRecommended = false;

	@ObfuscatedName("sk.ah")
	public static volatile long lastCanvasReplace = 0L;

	@ObfuscatedName("sn.al")
	public static FullscreenImpl fsimp14;

	@ObfuscatedName("sk.ac")
	public static boolean windowClosing = false;

	@ObfuscatedName("sk.ai")
	public static volatile boolean focus_in = true;

	@ObfuscatedName("aar.aw")
	public static boolean focus;

	@ObfuscatedName("fo.as")
	public static CursorManager mouseImp;

	@ObfuscatedName("sk.au")
	public static File cacheLocator;

	@ObfuscatedName("sx.ar")
	public static File cacheDirectory;

	@ObfuscatedName("b.ap")
	public static int archiveCount;

	@ObfuscatedName("vs.az")
	public static BufferedFile[] cacheIndex;

	@ObfuscatedName("jr.aa")
	public static int historicCacheId;

	@ObfuscatedName("y.af")
	public static String[] historicCacheLocations;

	@ObfuscatedName("la.ak")
	public static String[] historicCacheDirectories;

	@ObfuscatedName("sk.aj")
	public static BufferedFile uidDat = null;

	@ObfuscatedName("sk.ay")
	public static BufferedFile cacheDat = null;

	@ObfuscatedName("sk.ab")
	public static BufferedFile masterIndex = null;

	@ObfuscatedName("sk.bl")
	public static GameShell3$Environment environment = null;

	@ObfuscatedName("sk.bk")
	public static long killtime = 0L;

	@ObfuscatedName("sk.bh")
	public static boolean shutdown = false;

	@ObfuscatedName("sk.bx")
	public boolean alreadyerrored = false;

	@ObfuscatedName("sk.bd")
	public static int maxmemory = -1;

	@ObfuscatedName("sk.bc")
	public static int cpucount = 1;

	@ObfuscatedName("sk.bi")
	public boolean field6601 = false;

	@ObfuscatedName("ky.bn")
	public static String javaVendor;

	@ObfuscatedName("ae.bt")
	public static String javaVersion;

	@ObfuscatedName("ij.bq")
	public static String osName;

	@ObfuscatedName("alc.bm")
	public static String osNameRaw;

	@ObfuscatedName("hq.bb")
	public static String osArchRaw;

	@ObfuscatedName("xv.be")
	public static String osVersionRaw;

	@ObfuscatedName("pk.by")
	public static String homeDir;

	@ObfuscatedName("uw.bu")
	public static EventQueue eventQueue;

	public void supplyApplet(Applet arg0) {
		field11885 = arg0;
	}

	@ObfuscatedName("sk.e(Lsq;Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
	public final void startApplet(GameShell3$FrameParameters arg0, String arg1, String arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
		try {
			this.setEnvironment(GameShell3$Environment.APPLET, arg7);
			frameWid = canvasWid = arg0.getWidth();
			frameHei = canvasHei = arg0.getHeight();
			leftMargin = 0;
			topMargin = 0;
			if (getEnvironment() == GameShell3$Environment.APPLET_WITH_EXTERNAL_FRAME) {
				frameWid += arg0.getXMargin() * 2;
				frameHei += arg0.getYMargin() * 2;
				this.createAndShowFrame(arg0.getTitle());
			}
			JagException.field9164 = field11885;
			this.startCommon(arg1, arg2, arg3, arg4, arg5, arg6);
		} catch (Throwable var10) {
            // logger.error("", throwable);
			JagException.report(null, var10);
			this.error("crash");
		}
	}

	@ObfuscatedName("sk.n(Ljava/lang/String;Ljava/lang/String;IIIII)V")
	public final void startCommon(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) throws Exception {
		archiveCount = arg3;
		historicCacheId = arg2;
		JagException.field12493 = arg4;
		JagException.field12494 = arg5;
		javaVendor = "Unknown";
		javaVersion = "1.1";
		try {
			javaVendor = System.getProperty("java.vendor");
			javaVersion = System.getProperty("java.version");
		} catch (Exception var33) {
		}
		try {
			osNameRaw = System.getProperty("os.name");
		} catch (Exception var32) {
			osNameRaw = "Unknown";
		}
		osName = osNameRaw.toLowerCase();
		try {
			osArchRaw = System.getProperty("os.arch").toLowerCase();
		} catch (Exception var31) {
			osArchRaw = "";
		}
		try {
			osVersionRaw = System.getProperty("os.version").toLowerCase();
		} catch (Exception var30) {
			osVersionRaw = "";
		}
		try {
			homeDir = System.getProperty("user.home");
			if (homeDir != null) {
				homeDir = homeDir + "/";
			}
		} catch (Exception var29) {
		}
		try {
			if (osName.startsWith("win")) {
				if (homeDir == null) {
					homeDir = System.getenv("USERPROFILE");
				}
			} else if (homeDir == null) {
				homeDir = System.getenv("HOME");
			}
			if (homeDir != null) {
				homeDir = homeDir + "/";
			}
		} catch (Exception var28) {
		}
		if (homeDir == null) {
			homeDir = "~/";
		}
		try {
			eventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var27) {
		}
		historicCacheLocations = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", homeDir, "/tmp/", "" };
		historicCacheDirectories = new String[] { ".jagex_cache_" + historicCacheId, ".file_store_" + historicCacheId};
		int var14 = 0;
		label131: while (var14 < 4) {
			cacheDirectory = this.getCacheDirectory(arg0, arg1, var14);
			if (!cacheDirectory.exists()) {
				cacheDirectory.mkdirs();
			}
			File[] var15 = cacheDirectory.listFiles();
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
				if (!this.checkWritable(var18, false)) {
					var14++;
					break;
				}
				var17++;
			}
		}
		CacheUtil.method3546(cacheDirectory);
		openUID();
		cacheDat = new BufferedFile(new FileOnDisk(CacheUtil.method18852("main_file_cache.dat2"), "rw", 3221225472L), 5200, 0);
		masterIndex = new BufferedFile(new FileOnDisk(CacheUtil.method18852("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		cacheIndex = new BufferedFile[archiveCount];
		for (int var19 = 0; var19 < archiveCount; var19++) {
			cacheIndex[var19] = new BufferedFile(new FileOnDisk(CacheUtil.method18852("main_file_cache.idx" + var19), "rw", 1048576L), 6000, 0);
		}
		try {
			fsimp14 = new FullscreenImpl();
		} catch (Exception ex) {
			Fullscreen.allowed = false;
		}
		mouseImp = new CursorManager();
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
	public File getCacheDirectory(String arg0, String arg1, int arg2) {
		String var4 = arg2 == 0 ? "" : "" + arg2;
		cacheLocator = new File(homeDir, "jagex_cl_" + arg0 + "_" + arg1 + var4 + ".dat");
		String var5 = null;
		String var6 = null;
		boolean var7 = false;
		if (cacheLocator.exists()) {
			try {
				FileOnDisk var8 = new FileOnDisk(cacheLocator, "rw", 10000L);
				Packet var9 = new Packet((int) var8.length());
				while (var9.pos < var9.data.length) {
					int var10 = var8.read(var9.data, var9.pos, var9.data.length - var9.pos);
					if (var10 == -1) {
						throw new IOException();
					}
					var9.pos += var10;
				}
				var9.pos = 0;
				int var11 = var9.g1();
				if (var11 < 1 || var11 > 3) {
					throw new IOException("" + var11);
				}
				int var12 = 0;
				if (var11 > 1) {
					var12 = var9.g1();
				}
				if (var11 <= 2) {
					var5 = var9.gjstr2();
					if (var12 == 1) {
						var6 = var9.gjstr2();
					}
				} else {
					var5 = var9.gUTF8();
					if (var12 == 1) {
						var6 = var9.gUTF8();
					}
				}
				var8.close();
                // logger.debug("Cache: Read cache locator file from: {}, state: {}", cacheLocator, (Object)n3);
			} catch (IOException var29) {
                // logger.error("Cache: Error opening cache locator file.", iOException);
				var29.printStackTrace();
			}
			if (var5 != null) {
				File var14 = new File(var5);
				if (!var14.exists()) {
	                // logger.debug("Cache: Cache locator location does not exist: {}", string4);
					var5 = null;
				}
			}
			if (var5 != null) {
				File var15 = new File(var5, "test.dat");
				if (!this.checkWritable(var15, true)) {
	                // logger.debug("Cache: Cache locator location not writable: {}", string4);
					var5 = null;
				}
			}
		}
		if (var5 == null && arg2 == 0) {
			label103: for (int var16 = 0; var16 < historicCacheDirectories.length; var16++) {
				for (int var17 = 0; var17 < historicCacheLocations.length; var17++) {
					File var18 = new File(historicCacheLocations[var17] + historicCacheDirectories[var16] + File.separatorChar + arg0 + File.separatorChar);
					if (var18.exists() && this.checkWritable(new File(var18, "test.dat"), true)) {
						var5 = var18.toString();
						var7 = true;
	                    // logger.debug("Cache: Legacy cache found: {}", (Object)string4);
						break label103;
					}
				}
			}
		}
		if (var5 == null) {
            // logger.debug("Cache: No previous cache found, using default.");
			var5 = homeDir + File.separatorChar + "jagexcache" + var4 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
			var7 = true;
		}
		if (var6 != null) {
            // logger.debug("Cache: Copying cache from old location: {}", string5);
			File var19 = new File(var6);
			File var20 = new File(var5);
			try {
				File[] var21 = var19.listFiles();
				File[] var22 = var21;
				for (int var23 = 0; var23 < var22.length; var23++) {
					File var24 = var22[var23];
					File var25 = new File(var20, var24.getName());
                    // logger.debug("Cache: Copying old file: {} to {}", file, (Object)file2);
					boolean var26 = var24.renameTo(var25);
					if (!var26) {
						throw new IOException();
					}
				}
			} catch (Exception var28) {
                // logger.error("Cache: Error when copying cache from old location.", exception);
				var28.printStackTrace();
			}
			var7 = true;
		}
		if (var7) {
			this.writeCacheLocator(new File(var5), null);
		}
        // logger.debug("Cache: Using cache at: {}", string4);
		return new File(var5);
	}

	@ObfuscatedName("sk.k(Ljava/io/File;Ljava/io/File;I)V")
	public void writeCacheLocator(File arg0, File arg1) {
		try {
            // logger.debug("Cache: Writing cache locator file with new location: {} old location: {}", file, file2 == null ? "N/A" : file2);
			FileOnDisk var3 = new FileOnDisk(cacheLocator, "rw", 10000L);
			Packet var4 = new Packet(500);
			var4.p1(3);
			var4.p1(arg1 == null ? 0 : 1);
			var4.pUTF8(arg0.getPath());
			if (arg1 != null) {
				var4.pUTF8(arg1.getPath());
			}
			var3.write(var4.data, 0, var4.pos);
			var3.close();
		} catch (IOException var6) {
            // logger.error("Cache: Error writing cache locator file.", iOException);
			var6.printStackTrace();
		}
	}

	@ObfuscatedName("sk.f(Ljava/io/File;ZB)Z")
	public boolean checkWritable(File arg0, boolean arg1) {
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

	@ObfuscatedName("fi.w(S)Ljava/io/File;")
	public static File method3068() {
		return cacheDirectory;
	}

	@ObfuscatedName("amr.l(Ljava/lang/String;Ljava/lang/String;ZI)Labl;")
	public static FileOnDisk openPrefs(String arg0, String arg1, boolean arg2) {
		File var3 = new File(cacheDirectory, "preferences" + arg0 + ".dat");
		if (var3.exists()) {
			try {
                // logger.debug("Prefs: Opening existing prefs {} in modern location: {}", (Object)string, (Object)file);
				return new FileOnDisk(var3, "rw", 10000L);
			} catch (IOException var14) {
			}
		}
		String var6 = "";
		if (historicCacheId == 33) {
			var6 = "_rc";
		} else if (historicCacheId == 34) {
			var6 = "_wip";
		}
		File var7 = new File(homeDir, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
		if (!arg2 && var7.exists()) {
			try {
                // logger.debug("Prefs: Opening existing prefs {} in historic location: {}", (Object)string, (Object)file2);
				return new FileOnDisk(var7, "rw", 10000L);
			} catch (IOException var13) {
			}
		}
		try {
            // logger.debug("Prefs: Opening new prefs {} in modern location: {}", (Object)string, (Object)file);
			return new FileOnDisk(var3, "rw", 10000L);
		} catch (IOException var12) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("n.u(I)V")
	public static void openUID() {
		try {
			File var0 = new File(homeDir, "random.dat");
			if (var0.exists()) {
				uidDat = new BufferedFile(new FileOnDisk(var0, "rw", 25L), 24, 0);
                // logger.debug("UID: Opening UID in user's home directory: {}", file);
			} else {
				label34: for (int var1 = 0; var1 < historicCacheDirectories.length; var1++) {
					for (int var2 = 0; var2 < historicCacheLocations.length; var2++) {
						File var3 = new File(historicCacheLocations[var2] + historicCacheDirectories[var1] + File.separatorChar + "random.dat");
						if (var3.exists()) {
							uidDat = new BufferedFile(new FileOnDisk(var3, "rw", 25L), 24, 0);
	                        // logger.debug("UID: Opening UID in historic directory: {}", file2);
							break label34;
						}
					}
				}
			}
			if (uidDat == null) {
                // logger.debug("UID: Couldn't find existing UID, creating new one in user's home directory: {}", file);
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
				int var5 = var4.read();
				var4.seek(0L);
				var4.write(var5);
				var4.seek(0L);
				var4.close();
				uidDat = new BufferedFile(new FileOnDisk(var0, "rw", 25L), 24, 0);
			}
		} catch (IOException var7) {
            // logger.error("Error opening random.dat", iOException);
		}
	}

	@ObfuscatedName("hj.z(Lalw;I)V")
	public static void pushUID192(Packet arg0) {
		byte[] var1 = new byte[24];
		try {
			uidDat.method14824(0L);
			uidDat.method14826(var1);
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
		arg0.pdata(var1, 0, 24);
	}

	@ObfuscatedName("az.p(Lalw;II)V")
	public static void storeUID192(Packet arg0, int arg1) {
		if (uidDat == null) {
			return;
		}
		try {
			uidDat.method14824(0L);
			uidDat.method14828(arg0.data, arg1, 24);
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("sk.d(Ljava/lang/String;B)V")
	public synchronized void createAndShowFrame(String arg0) {
		frame = new Frame();
		frame.setTitle(arg0);
		frame.setResizable(true);
		frame.addWindowListener(this);
		frame.setBackground(Color.black);
		frame.setVisible(true);
		frame.toFront();
		Insets var2 = frame.getInsets();
		frame.setSize(frameWid + var2.left + var2.right, frameHei + var2.top + var2.bottom);
	}

	@ObfuscatedName("sk.s(I)V")
	public synchronized void addcanvas() {
		this.removeCanvas();
		Container var1 = getTopContainer();
		canvas = new GameCanvas(var1);
		this.addCanvas(var1);
	}

	@ObfuscatedName("qf.y(I)Ljava/awt/Container;")
	public static Container getTopContainer() {
		if (fsframe == null) {
			return frame == null ? field11885 : frame;
		} else {
			return fsframe;
		}
	}

	@ObfuscatedName("sk.q(Ljava/awt/Container;I)V")
	public void addCanvas(Container arg0) {
		arg0.setBackground(Color.black);
		arg0.setLayout(null);
		arg0.add(canvas);
		canvas.setSize(canvasWid, canvasHei);
		canvas.setVisible(true);
		if (frame == arg0) {
			Insets var2 = frame.getInsets();
			canvas.setLocation(leftMargin + var2.left, topMargin + var2.top);
		} else {
			canvas.setLocation(leftMargin, topMargin);
		}
		canvas.addFocusListener(this);
		canvas.requestFocus();
		focus = true;
		focus_in = true;
		canvas.setFocusTraversalKeysEnabled(false);
		fullredraw = true;
		canvasReplaceRecommended = false;
		lastCanvasReplace = MonotonicTime.get();
	}

	@ObfuscatedName("sk.x(I)V")
	public void removeCanvas() {
		if (canvas != null) {
			canvas.removeFocusListener(this);
			canvas.getParent().setBackground(Color.black);
			canvas.getParent().remove(canvas);
		}
	}

	@ObfuscatedName("sk.b(I)Z")
	public final boolean checkhost() {
		if (!Client.ENABLE_HOST_CHECK) {
			return true;
		}

		String var1 = field11885.getDocumentBase().getHost().toLowerCase();
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
				this.error("invalidhost");
				return false;
			}
		}
	}

	public void run() {
        // logger.debug("run");
		try {
			this.run_inner();
		} catch (ThreadDeath var7) {
			throw var7;
		} catch (Throwable var8) {
			JagException.report(this.method8038(), var8);
			this.error("crash");
		} finally {
			this.shutdown(true);
		}
	}

	@ObfuscatedName("sk.h(I)V")
	public void run_inner() {
        // logger.debug("run_inner");
		if (javaVendor != null) {
			String var1 = javaVendor.toLowerCase();
			if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
				String var2 = javaVersion;
				if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
					this.error("wrongjava");
					return;
				}
				if (var2.startsWith("1.6.0_")) {
					int var3;
					for (var3 = 6; var3 < var2.length() && StringTools.charIsNumeric(var2.charAt(var3)); var3++) {
					}
					String var4 = var2.substring(6, var3);
					if (StringTools.method9836(var4) && StringTools.parseInt(var4) < 10) {
						this.error("wrongjava");
						return;
					}
				}
			}
		}
		getTopContainer().setFocusCycleRoot(true);
		maxmemory = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
		cpucount = Runtime.getRuntime().availableProcessors();
		this.addcanvas();
        // logger.debug("maininit");
		this.maininit();
		field6594 = Timer.method6109();
        // logger.debug("mainloop");
		while (killtime == 0L || MonotonicTime.get() < killtime) {
			field6624 = field6594.method8158(logicUpdateInterval);
			for (int var5 = 0; var5 < field6624; var5++) {
				this.mainloopwrapper();
			}
			this.mainredrawwrapper();
			method218(canvas);
		}
	}

	@ObfuscatedName("f.a(Ljava/lang/Object;I)V")
	public static void method218(Object arg0) {
		if (eventQueue == null) {
			return;
		}
		for (int var1 = 0; var1 < 50 && eventQueue.peekEvent() != null; var1++) {
			PreciseSleep.sleep(1L);
		}
		try {
			if (arg0 != null) {
				eventQueue.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("sk.g(B)V")
	public void mainloopwrapper() {
		long var1 = MonotonicTime.get();
		long var3 = field6591[field6587];
		field6591[field6587] = var1;
		field6587 = field6587 + 1 & 0x1F;
		if (var3 != 0L && var1 > var3) {
		}
		synchronized (this) {
			focus = focus_in;
		}
		this.mainloop();
	}

	@ObfuscatedName("sk.i(I)V")
	public void mainredrawwrapper() {
		long var1 = MonotonicTime.get();
		long var3 = field6589[field6590 - 1 & 0x1F];
		long var5 = field6589[field6590];
		field6589[field6590] = var1;
		field6590 = field6590 + 1 & 0x1F;
		if (var5 != 0L && var1 > var5) {
			int var7 = (int) (var1 - var5);
			fpsAverage = (int) (var1 - var3);
			fps = ((var7 >> 1) + 32000) / var7;
		}
		if (++field6614 - 1 > 50) {
			field6614 -= 50;
			fullredraw = true;
			canvas.setSize(canvasWid, canvasHei);
			canvas.setVisible(true);
			if (frame != null && fsframe == null) {
				Insets var8 = frame.getInsets();
				canvas.setLocation(leftMargin + var8.left, topMargin + var8.top);
			} else {
				canvas.setLocation(leftMargin, topMargin);
			}
		}
		this.mainredraw();
	}

	@ObfuscatedName("sk.j(B)Ljava/lang/String;")
	public String method8038() {
		return null;
	}

	@ObfuscatedName("sk.t(ZI)V")
	public final void shutdown(boolean arg0) {
		synchronized (this) {
			if (shutdown) {
				return;
			}
			shutdown = true;
		}
        // logger.debug("Shutdown start - clean:{}", bl);
		try {
			this.mainquit();
		} catch (Exception var11) {
		}
		try {
			cacheDat.method14834();
			for (int var5 = 0; var5 < archiveCount; var5++) {
				cacheIndex[var5].method14834();
			}
			masterIndex.method14834();
			uidDat.method14834();
		} catch (Exception var12) {
		}
		if (this.field6601) {
			try {
				QueryPerformanceCounter.quit();
			} catch (Throwable var10) {
			}
		}
		if (NativeLibraries.method14526()) {
			NativeLibraries.getLoader().method7909();
		}
		if (canvas != null) {
			try {
				canvas.removeFocusListener(this);
				canvas.getParent().remove(canvas);
			} catch (Exception var9) {
			}
		}
		if (frame != null) {
			frame.setVisible(false);
			frame.dispose();
			frame = null;
		}
        // logger.debug("Shutdown complete - clean:{}", bl);
	}

	@ObfuscatedName("nw.ae(B)I")
	public static final int getLogicRate() {
		return (int) (1000000000L / logicUpdateInterval);
	}

	@ObfuscatedName("e.ag(B)V")
	public static final void method135() {
		field6594.method8156();
		for (int var0 = 0; var0 < 32; var0++) {
			field6589[var0] = 0L;
		}
		for (int var1 = 0; var1 < 32; var1++) {
			field6591[var1] = 0L;
		}
		field6624 = 0;
	}

	@ObfuscatedName("ts.ah(B)J")
	public static long method8660() {
		return field6594.method8173();
	}

	public void start() {
		if (!shutdown) {
			killtime = 0L;
		}
	}

	public void stop() {
		if (!shutdown) {
			killtime = MonotonicTime.get() + 4000L;
		}
	}

	public void destroy() {
		if (!shutdown) {
			killtime = MonotonicTime.get();
			PreciseSleep.sleep(5000L);
			this.shutdown(false);
		}
	}

	public final void update(Graphics arg0) {
		this.paint(arg0);
	}

	public final synchronized void paint(Graphics arg0) {
		if (shutdown) {
			return;
		}
		fullredraw = true;
		if (MonotonicTime.get() - lastCanvasReplace > 1000L) {
			Rectangle var2 = arg0.getClipBounds();
			if (var2 == null || var2.width >= frameWid && var2.height >= frameHei) {
				canvasReplaceRecommended = true;
			}
		}
	}

	public final void focusGained(FocusEvent arg0) {
		focus_in = true;
		fullredraw = true;
	}

	public final void focusLost(FocusEvent arg0) {
		focus_in = false;
	}

	public final void windowActivated(WindowEvent arg0) {
	}

	public final void windowClosed(WindowEvent arg0) {
	}

	public final void windowClosing(WindowEvent arg0) {
		windowClosing = true;
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
			Graphics var5 = canvas.getGraphics();
			if (field9147 == null) {
				field9147 = new java.awt.Font("Helvetica", 1, 13);
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
				if (field2575 == null) {
					field2575 = canvas.createImage(canvasWid, canvasHei);
				}
				Graphics var6 = field2575.getGraphics();
				var6.setColor(Color.black);
				var6.fillRect(0, 0, canvasWid, canvasHei);
				int var7 = canvasWid / 2 - 152;
				int var8 = canvasHei / 2 - 18;
				var6.setColor(arg3);
				var6.drawRect(var7, var8, 303, 33);
				var6.setColor(arg2);
				var6.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
				var6.setColor(Color.black);
				var6.drawRect(var7 + 1, var8 + 1, 301, 31);
				var6.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
				var6.setFont(field9147);
				var6.setColor(arg4);
				var6.drawString(arg1, var7 + (304 - arg1.length() * 6) / 2, var8 + 22);
				if (field6598 != null) {
					var6.setFont(field9147);
					var6.setColor(arg4);
					var6.drawString(field6598, canvasWid / 2 - field6598.length() * 6 / 2, canvasHei / 2 - 26);
				}
				var5.drawImage(field2575, 0, 0, null);
			} catch (Exception var13) {
				var5.setColor(Color.black);
				var5.fillRect(0, 0, canvasWid, canvasHei);
				int var10 = canvasWid / 2 - 152;
				int var11 = canvasHei / 2 - 18;
				var5.setColor(arg3);
				var5.drawRect(var10, var11, 303, 33);
				var5.setColor(arg2);
				var5.fillRect(var10 + 2, var11 + 2, arg0 * 3, 30);
				var5.setColor(Color.black);
				var5.drawRect(var10 + 1, var11 + 1, 301, 31);
				var5.fillRect(arg0 * 3 + var10 + 2, var11 + 2, 300 - arg0 * 3, 30);
				var5.setFont(field9147);
				var5.setColor(arg4);
				if (field6598 != null) {
					var5.setFont(field9147);
					var5.setColor(arg4);
					var5.drawString(field6598, canvasWid / 2 - field6598.length() * 6 / 2, canvasHei / 2 - 26);
				}
				var5.drawString(arg1, var10 + (304 - arg1.length() * 6) / 2, var11 + 22);
			}
		} catch (Exception var14) {
			canvas.repaint();
		}
	}

	@ObfuscatedName("ew.at(B)V")
	public static final void method2901() {
		field2575 = null;
		field9147 = null;
	}

	@ObfuscatedName("sk.ad(Ljava/lang/String;I)V")
	public void error(String arg0) {
		if (this.alreadyerrored) {
			return;
		}
		this.alreadyerrored = true;
        // logger.debug("error_game_{}", (Object)string);
		System.out.println("error_game_" + arg0);
		try {
			BrowserControl.call(field11885, "loggedout");
		} catch (Throwable var5) {
		}
		try {
			field11885.getAppletContext().showDocument(new URL(field11885.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (Exception var4) {
            // logger.error("", exception);
		}
	}

	@ObfuscatedName("sk.am(Ljava/lang/String;Ljava/lang/String;B)V")
	public void error(String arg0, String arg1) {
		if (this.alreadyerrored) {
			return;
		}
		this.alreadyerrored = true;
		System.out.println("error_game_" + arg0 + "?" + arg1);
		try {
			BrowserControl.call(field11885, "loggedout");
		} catch (Throwable var6) {
		}
		try {
			field11885.getAppletContext().showDocument(new URL(field11885.getCodeBase(), "error_game_" + arg0 + ".ws?" + arg1), "_top");
		} catch (Exception var5) {
		}
	}

	@ObfuscatedName("sk.au(B)V")
	public void method8050() throws NativeLibraryException {
		if (this.field6601) {
			return;
		}
		NativeLibraries.getLoader().load("jaclib");
		try {
			QueryPerformanceCounter.init();
		} catch (Throwable var2) {
			if (osName.startsWith("win")) {
				throw new NativeLibraryException(128, "jaclib");
			}
		}
		this.field6601 = true;
	}

	@ObfuscatedName("sk.ar(Lsm;ZI)V")
	public void setEnvironment(GameShell3$Environment arg0, boolean arg1) {
		if (arg0 == null) {
			throw new NullPointerException();
		} else if (GameShell3$Environment.APPLET == arg0 || GameShell3$Environment.APPLICATION == arg0) {
			environment = arg0;
			if (environment != GameShell3$Environment.APPLICATION && arg1) {
				environment = GameShell3$Environment.APPLET_WITH_EXTERNAL_FRAME;
			}
		} else {
			throw new IllegalStateException();
		}
	}

	@ObfuscatedName("in.ap(B)Lsm;")
	public static GameShell3$Environment getEnvironment() {
		return environment;
	}

	@ObfuscatedName("sk.al(I)V")
	public abstract void maininit();

	@ObfuscatedName("sk.ac(I)V")
	public abstract void mainloop();

	@ObfuscatedName("sk.ai(I)V")
	public abstract void mainredraw();

	@ObfuscatedName("sk.aw(B)V")
	public abstract void mainquit();

	public abstract void init();
}
