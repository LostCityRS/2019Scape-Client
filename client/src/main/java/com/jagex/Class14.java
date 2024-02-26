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

@OriginalClass("client!aam")
public final class Class14 {

	@OriginalMember(owner = "client!aam", name = "tq", descriptor = "[Lclient!am;")
	public static Class164[] aClass164Array1;

	@OriginalMember(owner = "client!aam", name = "f", descriptor = "Ljava/awt/DisplayMode;")
	DisplayMode aDisplayMode1;

	@OriginalMember(owner = "client!aam", name = "t", descriptor = "Ljava/awt/GraphicsDevice;")
	GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "client!aam", name = "n", descriptor = "(I)Lclient!ald;")
	static Packet method366(@OriginalArg(0) int arg0) {
		@Pc(2) Packet local2 = Class41_Sub7.method17258(-844083283);
		if (client.anInt3433 * 1994758437 != 14) {
			@Pc(17) long local17;
			if (-2038590069 * Class238.anInt3815 != -1) {
				local17 = Class238.anInt3815 * -2038590069;
			} else if (Class238.aLong356 * 4843953102412043791L == -1L) {
				local17 = Class663.method33350(Class238.aString154, -1927892248);
			} else {
				local17 = Class238.aLong356 * 4843953102412043791L;
			}
			Class325.aLong368 = local17 * 8373392856619530517L;
			Class420.method29011(local2, local17);
			local2.pbool(false);
			local2.pjstr(Class238.aString155);
			local2.p8(Class238.aLong358 * 860650659264272831L);
			local2.p8(client.aLong350 * 1066294735814990989L);
		}
		local2.rsaenc(Class174.aBigInteger1, Class174.aBigInteger2);
		return local2;
	}

	@OriginalMember(owner = "client!aam", name = "<init>", descriptor = "()V")
	public Class14() throws Exception {
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

	@OriginalMember(owner = "client!aam", name = "u", descriptor = "(Ljava/awt/Frame;I)V")
	void method354(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!aam", name = "a", descriptor = "(Ljava/awt/Frame;)V")
	void method355(@OriginalArg(0) Frame arg0) {
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

	@OriginalMember(owner = "client!aam", name = "f", descriptor = "(Ljava/awt/Frame;IIIII)V")
	void method356(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method354(arg0, 620998383);
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

	@OriginalMember(owner = "client!aam", name = "j", descriptor = "(Ljava/awt/Frame;)V")
	void method357(@OriginalArg(0) Frame arg0) {
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

	@OriginalMember(owner = "client!aam", name = "l", descriptor = "(Ljava/awt/Frame;IIII)V")
	void method358(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method354(arg0, -250589315);
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

	@OriginalMember(owner = "client!aam", name = "g", descriptor = "(Ljava/awt/Frame;IIII)V")
	void method359(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method354(arg0, -257538020);
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

	@OriginalMember(owner = "client!aam", name = "e", descriptor = "(S)V")
	void method360(@OriginalArg(0) short arg0) {
		if (this.aDisplayMode1 != null) {
			@Pc(7) DisplayMode[] local7 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(9) boolean local9 = false;
			@Pc(11) DisplayMode[] local11 = local7;
			for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
				@Pc(21) DisplayMode local21 = local11[local13];
				if (local21.equals(this.aDisplayMode1)) {
					this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
					local9 = true;
					break;
				}
			}
			if (!local9) {
				try {
					@Pc(43) Field local43 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					local43.setAccessible(true);
					local43.set(this.aGraphicsDevice1, null);
				} catch (@Pc(53) Throwable local53) {
				}
			}
			this.aDisplayMode1 = null;
		}
		this.method354(null, -1848839482);
	}

	@OriginalMember(owner = "client!aam", name = "m", descriptor = "()V")
	void method361() {
		if (this.aDisplayMode1 != null) {
			@Pc(7) DisplayMode[] local7 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(9) boolean local9 = false;
			@Pc(11) DisplayMode[] local11 = local7;
			for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
				@Pc(21) DisplayMode local21 = local11[local13];
				if (local21.equals(this.aDisplayMode1)) {
					this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
					local9 = true;
					break;
				}
			}
			if (!local9) {
				try {
					@Pc(43) Field local43 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					local43.setAccessible(true);
					local43.set(this.aGraphicsDevice1, null);
				} catch (@Pc(53) Throwable local53) {
				}
			}
			this.aDisplayMode1 = null;
		}
		this.method354(null, -635489581);
	}

	@OriginalMember(owner = "client!aam", name = "o", descriptor = "(Ljava/awt/Frame;)V")
	void method362(@OriginalArg(0) Frame arg0) {
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

	@OriginalMember(owner = "client!aam", name = "t", descriptor = "(B)[I")
	int[] method363(@OriginalArg(0) byte arg0) {
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

	@OriginalMember(owner = "client!aam", name = "i", descriptor = "()V")
	void method364() {
		if (this.aDisplayMode1 != null) {
			@Pc(7) DisplayMode[] local7 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(9) boolean local9 = false;
			@Pc(11) DisplayMode[] local11 = local7;
			for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
				@Pc(21) DisplayMode local21 = local11[local13];
				if (local21.equals(this.aDisplayMode1)) {
					this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
					local9 = true;
					break;
				}
			}
			if (!local9) {
				try {
					@Pc(43) Field local43 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					local43.setAccessible(true);
					local43.set(this.aGraphicsDevice1, null);
				} catch (@Pc(53) Throwable local53) {
				}
			}
			this.aDisplayMode1 = null;
		}
		this.method354(null, 16626882);
	}

	@OriginalMember(owner = "client!aam", name = "s", descriptor = "(Ljava/awt/Frame;)V")
	void method365(@OriginalArg(0) Frame arg0) {
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
}
