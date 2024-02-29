package com.jagex;

import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aae")
public class Class7 {

	@OriginalMember(owner = "client!aae", name = "w", descriptor = "Lclient!py;")
	static Class497 aClass497_1;

	@OriginalMember(owner = "client!aae", name = "s", descriptor = "Ljava/lang/String;")
	static String aString2;

	@OriginalMember(owner = "client!aae", name = "n", descriptor = "Ljava/awt/DisplayMode;")
	DisplayMode aDisplayMode1;

	@OriginalMember(owner = "client!aae", name = "e", descriptor = "Ljava/awt/GraphicsDevice;")
	GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "client!aae", name = "<init>", descriptor = "()V", line = 13)
	public Class7() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(14) GraphicsDevice[] local14 = local3.getScreenDevices();
			@Pc(16) GraphicsDevice[] local16 = local14;
			for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
				@Pc(26) GraphicsDevice local26 = local16[local18];
				if (local26 != null && local26.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local26;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "client!aae", name = "w", descriptor = "()[I", line = 35)
	int[] method106() {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(9) int[] local9 = new int[local3.length << 2];
		for (@Pc(11) int local11 = 0; local11 < local3.length; local11++) {
			local9[local11 << 2] = local3[local11].getWidth();
			local9[(local11 << 2) + 1] = local3[local11].getHeight();
			local9[(local11 << 2) + 2] = local3[local11].getBitDepth();
			local9[(local11 << 2) + 3] = local3[local11].getRefreshRate();
		}
		return local9;
	}

	@OriginalMember(owner = "client!aae", name = "e", descriptor = "(I)[I", line = 35)
	int[] method107(@OriginalArg(0) int arg0) {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(9) int[] local9 = new int[local3.length << 2];
		for (@Pc(11) int local11 = 0; local11 < local3.length; local11++) {
			local9[local11 << 2] = local3[local11].getWidth();
			local9[(local11 << 2) + 1] = local3[local11].getHeight();
			local9[(local11 << 2) + 2] = local3[local11].getBitDepth();
			local9[(local11 << 2) + 3] = local3[local11].getRefreshRate();
		}
		return local9;
	}

	@OriginalMember(owner = "client!aae", name = "f", descriptor = "()[I", line = 35)
	int[] method108() {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(9) int[] local9 = new int[local3.length << 2];
		for (@Pc(11) int local11 = 0; local11 < local3.length; local11++) {
			local9[local11 << 2] = local3[local11].getWidth();
			local9[(local11 << 2) + 1] = local3[local11].getHeight();
			local9[(local11 << 2) + 2] = local3[local11].getBitDepth();
			local9[(local11 << 2) + 3] = local3[local11].getRefreshRate();
		}
		return local9;
	}

	@OriginalMember(owner = "client!aae", name = "u", descriptor = "(Ljava/awt/Frame;IIII)V", line = 47)
	void method109(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method117(arg0, -1476386037);
		if (arg4 == 0) {
			@Pc(28) int local28 = this.aDisplayMode1.getRefreshRate();
			@Pc(32) DisplayMode[] local32 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(34) boolean local34 = false;
			for (@Pc(36) int local36 = 0; local36 < local32.length; local36++) {
				if (local32[local36].getWidth() == arg1 && local32[local36].getHeight() == arg2 && local32[local36].getBitDepth() == arg3) {
					@Pc(63) int local63 = local32[local36].getRefreshRate();
					if (!local34 || Math.abs(local63 - local28) < Math.abs(arg4 - local28)) {
						arg4 = local63;
						local34 = true;
					}
				}
			}
			if (!local34) {
				arg4 = local28;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
	}

	@OriginalMember(owner = "client!aae", name = "l", descriptor = "(Ljava/awt/Frame;IIII)V", line = 47)
	void method110(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method117(arg0, -1476386037);
		if (arg4 == 0) {
			@Pc(28) int local28 = this.aDisplayMode1.getRefreshRate();
			@Pc(32) DisplayMode[] local32 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(34) boolean local34 = false;
			for (@Pc(36) int local36 = 0; local36 < local32.length; local36++) {
				if (local32[local36].getWidth() == arg1 && local32[local36].getHeight() == arg2 && local32[local36].getBitDepth() == arg3) {
					@Pc(63) int local63 = local32[local36].getRefreshRate();
					if (!local34 || Math.abs(local63 - local28) < Math.abs(arg4 - local28)) {
						arg4 = local63;
						local34 = true;
					}
				}
			}
			if (!local34) {
				arg4 = local28;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
	}

	@OriginalMember(owner = "client!aae", name = "z", descriptor = "(Ljava/awt/Frame;IIII)V", line = 47)
	void method111(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method117(arg0, -1476386037);
		if (arg4 == 0) {
			@Pc(28) int local28 = this.aDisplayMode1.getRefreshRate();
			@Pc(32) DisplayMode[] local32 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(34) boolean local34 = false;
			for (@Pc(36) int local36 = 0; local36 < local32.length; local36++) {
				if (local32[local36].getWidth() == arg1 && local32[local36].getHeight() == arg2 && local32[local36].getBitDepth() == arg3) {
					@Pc(63) int local63 = local32[local36].getRefreshRate();
					if (!local34 || Math.abs(local63 - local28) < Math.abs(arg4 - local28)) {
						arg4 = local63;
						local34 = true;
					}
				}
			}
			if (!local34) {
				arg4 = local28;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
	}

	@OriginalMember(owner = "client!aae", name = "n", descriptor = "(Ljava/awt/Frame;IIIII)V", line = 47)
	void method112(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method117(arg0, -1476386037);
		if (arg4 == 0) {
			@Pc(28) int local28 = this.aDisplayMode1.getRefreshRate();
			@Pc(32) DisplayMode[] local32 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(34) boolean local34 = false;
			for (@Pc(36) int local36 = 0; local36 < local32.length; local36++) {
				if (local32[local36].getWidth() == arg1 && local32[local36].getHeight() == arg2 && local32[local36].getBitDepth() == arg3) {
					@Pc(63) int local63 = local32[local36].getRefreshRate();
					if (!local34 || Math.abs(local63 - local28) < Math.abs(arg4 - local28)) {
						arg4 = local63;
						local34 = true;
					}
				}
			}
			if (!local34) {
				arg4 = local28;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
	}

	@OriginalMember(owner = "client!aae", name = "m", descriptor = "(I)V", line = 74)
	void method113(@OriginalArg(0) int arg0) {
		if (this.aDisplayMode1 != null) {
			@Pc(6) DisplayMode[] local6 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(8) boolean local8 = false;
			@Pc(10) DisplayMode[] local10 = local6;
			for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
				@Pc(20) DisplayMode local20 = local10[local12];
				if (local20.equals(this.aDisplayMode1)) {
					this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
					local8 = true;
					break;
				}
			}
			if (!local8) {
				try {
					@Pc(42) Field local42 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					local42.setAccessible(true);
					local42.set(this.aGraphicsDevice1, null);
				} catch (@Pc(52) Throwable local52) {
				}
			}
			this.aDisplayMode1 = null;
		}
		this.method117(null, -1476386037);
	}

	@OriginalMember(owner = "client!aae", name = "p", descriptor = "()V", line = 74)
	void method114() {
		if (this.aDisplayMode1 != null) {
			@Pc(6) DisplayMode[] local6 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(8) boolean local8 = false;
			@Pc(10) DisplayMode[] local10 = local6;
			for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
				@Pc(20) DisplayMode local20 = local10[local12];
				if (local20.equals(this.aDisplayMode1)) {
					this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
					local8 = true;
					break;
				}
			}
			if (!local8) {
				try {
					@Pc(42) Field local42 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					local42.setAccessible(true);
					local42.set(this.aGraphicsDevice1, null);
				} catch (@Pc(52) Throwable local52) {
				}
			}
			this.aDisplayMode1 = null;
		}
		this.method117(null, -1476386037);
	}

	@OriginalMember(owner = "client!aae", name = "d", descriptor = "()V", line = 74)
	void method115() {
		if (this.aDisplayMode1 != null) {
			@Pc(6) DisplayMode[] local6 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(8) boolean local8 = false;
			@Pc(10) DisplayMode[] local10 = local6;
			for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
				@Pc(20) DisplayMode local20 = local10[local12];
				if (local20.equals(this.aDisplayMode1)) {
					this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
					local8 = true;
					break;
				}
			}
			if (!local8) {
				try {
					@Pc(42) Field local42 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					local42.setAccessible(true);
					local42.set(this.aGraphicsDevice1, null);
				} catch (@Pc(52) Throwable local52) {
				}
			}
			this.aDisplayMode1 = null;
		}
		this.method117(null, -1476386037);
	}

	@OriginalMember(owner = "client!aae", name = "v", descriptor = "(Ljava/awt/Frame;)V", line = 104)
	void method116(@OriginalArg(0) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(16) boolean local16 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local16) {
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
				local1 = true;
			}
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(54) Field local54 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local54.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(61) Throwable local61) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!aae", name = "k", descriptor = "(Ljava/awt/Frame;I)V", line = 104)
	void method117(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(16) boolean local16 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local16) {
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
				local1 = true;
			}
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(54) Field local54 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local54.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(61) Throwable local61) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!aae", name = "c", descriptor = "(Ljava/awt/Frame;)V", line = 104)
	void method118(@OriginalArg(0) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(16) boolean local16 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local16) {
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
				local1 = true;
			}
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(54) Field local54 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local54.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(61) Throwable local61) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!aae", name = "r", descriptor = "(Ljava/awt/Frame;)V", line = 104)
	void method119(@OriginalArg(0) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(16) boolean local16 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local16) {
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
				local1 = true;
			}
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(54) Field local54 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local54.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(61) Throwable local61) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!aae", name = "o", descriptor = "(Ljava/awt/Frame;)V", line = 104)
	void method120(@OriginalArg(0) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(16) boolean local16 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local16) {
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
				local1 = true;
			}
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(54) Field local54 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local54.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(61) Throwable local61) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!aae", name = "s", descriptor = "(Ljava/awt/Frame;)V", line = 104)
	void method121(@OriginalArg(0) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(16) boolean local16 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local16) {
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
				local1 = true;
			}
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(54) Field local54 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local54.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(61) Throwable local61) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!aae", name = "bd", descriptor = "([II)Ljava/lang/String;", line = 1390)
	static String method122(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(3) StringBuilder local3 = new StringBuilder();
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			@Pc(17) Class347 local17 = (Class347) Class288.aClass55_Sub2_1.method18261(arg0[local5], -1871632979);
			if (-941975975 * local17.anInt4198 != -1) {
				local3.append(" <sprite=").append(local17.anInt4198 * -941975975).append(">");
			}
		}
		return local3.toString();
	}

	@OriginalMember(owner = "client!aae", name = "ard", descriptor = "(Lclient!yf;I)V", line = 13036)
	static final void method123(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub8_1, arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091], (byte) 71);
		client.aClass532_1.method30533((byte) 0);
		Class106_Sub1.method5135(300192766);
		client.aBoolean601 = false;
	}
}
