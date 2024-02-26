package com.jagex;

import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class480 {

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
	static final int anInt4989 = 2;

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
	static final int anInt4990 = 0;

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
	public static final int anInt4991 = 1;

	@OriginalMember(owner = "client!pf", name = "ge", descriptor = "Lclient!pf;")
	public static Class480 aClass480_120;

	@OriginalMember(owner = "client!pf", name = "u", descriptor = "Lclient!adl;")
	static Class83 aClass83_1 = new Class83();

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "Z")
	static boolean aBoolean880 = false;

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
	static int anInt4993 = 0;

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "[[Ljava/lang/Object;")
	Object[][] anObjectArrayArray3;

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "[Ljava/lang/Object;")
	Object[] anObjectArray43;

	@OriginalMember(owner = "client!pf", name = "t", descriptor = "Lclient!ps;")
	Class492 aClass492_2 = null;

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "Lclient!pn;")
	Class141 aClass141_1;

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "Z")
	boolean aBoolean879;

	@OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
	int anInt4992;

	@OriginalMember(owner = "client!pf", name = "ck", descriptor = "([B)[B")
	static byte[] method29911(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Packet local4 = new Packet(arg0);
		@Pc(9) Class489 local9 = new Class489(local4);
		@Pc(13) Class486 local13 = local9.method30214((byte) 0);
		@Pc(17) int local17 = local9.method30216(-1063256912);
		if (local17 < 0 || anInt4993 * -214443435 != 0 && local17 > anInt4993 * -214443435) {
			throw new RuntimeException();
		} else if (local13 == Class486.aClass486_4) {
			@Pc(38) byte[] local38 = new byte[local17];
			local4.gdata(local38, 0, local17);
			return local38;
		} else {
			@Pc(50) int local50 = local9.method30215(706172889);
			if (local50 < 0 || anInt4993 * -214443435 != 0 && local50 > anInt4993 * -214443435) {
				throw new RuntimeException();
			}
			@Pc(72) byte[] local72;
			if (Class486.aClass486_1 == local13) {
				local72 = new byte[local50];
				Class19.method462(local72, local50, arg0, local17, 9);
			} else if (Class486.aClass486_3 == local13) {
				local72 = new byte[local50];
				@Pc(89) Class83 local89 = aClass83_1;
				synchronized (aClass83_1) {
					aClass83_1.method1562(local4, local72, -751441187);
				}
			} else if (Class486.aClass486_2 == local13) {
				try {
					local72 = Class169.method21687(local4, local50, -1668908582);
				} catch (@Pc(114) IOException local114) {
					throw new RuntimeException(local114);
				}
			} else {
				throw new RuntimeException();
			}
			return local72;
		}
	}

	@OriginalMember(owner = "client!pf", name = "cj", descriptor = "([B)[B")
	static byte[] method29950(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Packet local4 = new Packet(arg0);
		@Pc(9) Class489 local9 = new Class489(local4);
		@Pc(13) Class486 local13 = local9.method30214((byte) 0);
		@Pc(17) int local17 = local9.method30216(-1485545155);
		if (local17 < 0 || anInt4993 * -214443435 != 0 && local17 > anInt4993 * -214443435) {
			throw new RuntimeException();
		} else if (local13 == Class486.aClass486_4) {
			@Pc(38) byte[] local38 = new byte[local17];
			local4.gdata(local38, 0, local17);
			return local38;
		} else {
			@Pc(50) int local50 = local9.method30215(151960323);
			if (local50 < 0 || anInt4993 * -214443435 != 0 && local50 > anInt4993 * -214443435) {
				throw new RuntimeException();
			}
			@Pc(72) byte[] local72;
			if (Class486.aClass486_1 == local13) {
				local72 = new byte[local50];
				Class19.method462(local72, local50, arg0, local17, 9);
			} else if (Class486.aClass486_3 == local13) {
				local72 = new byte[local50];
				@Pc(89) Class83 local89 = aClass83_1;
				synchronized (aClass83_1) {
					aClass83_1.method1562(local4, local72, -333596490);
				}
			} else if (Class486.aClass486_2 == local13) {
				try {
					local72 = Class169.method21687(local4, local50, 1240999624);
				} catch (@Pc(114) IOException local114) {
					throw new RuntimeException(local114);
				}
			} else {
				throw new RuntimeException();
			}
			return local72;
		}
	}

	@OriginalMember(owner = "client!pf", name = "cs", descriptor = "([B)[B")
	static byte[] method29997(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Packet local4 = new Packet(arg0);
		@Pc(9) Class489 local9 = new Class489(local4);
		@Pc(13) Class486 local13 = local9.method30214((byte) 0);
		@Pc(17) int local17 = local9.method30216(-1901212010);
		if (local17 < 0 || anInt4993 * -214443435 != 0 && local17 > anInt4993 * -214443435) {
			throw new RuntimeException();
		} else if (local13 == Class486.aClass486_4) {
			@Pc(38) byte[] local38 = new byte[local17];
			local4.gdata(local38, 0, local17);
			return local38;
		} else {
			@Pc(50) int local50 = local9.method30215(-1783560694);
			if (local50 < 0 || anInt4993 * -214443435 != 0 && local50 > anInt4993 * -214443435) {
				throw new RuntimeException();
			}
			@Pc(72) byte[] local72;
			if (Class486.aClass486_1 == local13) {
				local72 = new byte[local50];
				Class19.method462(local72, local50, arg0, local17, 9);
			} else if (Class486.aClass486_3 == local13) {
				local72 = new byte[local50];
				@Pc(89) Class83 local89 = aClass83_1;
				synchronized (aClass83_1) {
					aClass83_1.method1562(local4, local72, 1204877204);
				}
			} else if (Class486.aClass486_2 == local13) {
				try {
					local72 = Class169.method21687(local4, local50, 1451864669);
				} catch (@Pc(114) IOException local114) {
					throw new RuntimeException(local114);
				}
			} else {
				throw new RuntimeException();
			}
			return local72;
		}
	}

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "(Lclient!ald;II)V")
	static void method30000(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Class554.aClass36_4 == null) {
			return;
		}
		try {
			Class554.aClass36_4.method762(0L);
			Class554.aClass36_4.method767(arg0.data, arg1, 24, (byte) 103);
		} catch (@Pc(13) Exception local13) {
		}
	}

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "(Lclient!yp;I)V")
	static void method30001(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class340.method27905(1808823068);
	}

	@OriginalMember(owner = "client!pf", name = "lt", descriptor = "(Lclient!hx;[B[BLclient!yp;S)V")
	static void method30002(@OriginalArg(0) Class327 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) Class690 arg3, @OriginalArg(4) short arg4) {
		@Pc(14) int local14 = arg3.anIntArray525[(arg3.anInt5778 -= 2036747717) * 1896589581] - 1;
		if (local14 < 0 || local14 > 9) {
			throw new RuntimeException();
		}
		Class491.method30253(arg0, local14, arg1, arg2, arg3, 2131129656);
	}

	@OriginalMember(owner = "client!pf", name = "air", descriptor = "(Lclient!yp;B)V")
	static void method30003(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		@Pc(31) boolean local31 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] == 1;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class546.method31211(local13, local31, (byte) 110);
	}

	@OriginalMember(owner = "client!pf", name = "ayp", descriptor = "(Lclient!yp;S)V")
	static void method30004(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(2) int local2 = Class665.method33455(-1884195175);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (Class254.anInt3885 = Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(1838671268) * 803260607) * -272193729;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local2;
		RuntimeException_Sub2.method23509(-590969940);
		client.aClass539_1.method30938(519646779);
		Class719.method37291(1496373113);
		client.aBoolean714 = false;
	}

	@OriginalMember(owner = "client!pf", name = "ne", descriptor = "(B)V")
	public static void method30005(@OriginalArg(0) byte arg0) {
		if (Class651.method33131(-123272225) == Class544.aClass544_3) {
			return;
		}
		try {
			@Pc(9) String local9 = Class306.anApplet1.getParameter(Class469.aClass469_26.aString210);
			@Pc(17) int local17 = (int) (Class303.method27111((byte) 66) / 86400000L) - 11745;
			@Pc(30) String local30 = "usrdob=" + local17 + "; version=1; path=/; domain=" + local9;
			Class64.method1225(Class306.anApplet1, "document.cookie=\"" + local30 + "\"", (byte) 0);
		} catch (@Pc(45) Throwable local45) {
		}
	}

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "(Ljava/io/File;I)[B")
	public static byte[] method30006(@OriginalArg(0) File arg0, @OriginalArg(1) int arg1) {
		return Class695.method37034(arg0, (int) arg0.length(), 1141465155);
	}

	@OriginalMember(owner = "client!pf", name = "ew", descriptor = "(II)V")
	public static void method30007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 1) {
			Class159_Sub1.anInt2023 = Class159_Sub1.anInt2013 * -37559507;
		} else {
			Class159_Sub1.anInt2023 = arg0 * -105631365;
		}
	}

	@OriginalMember(owner = "client!pf", name = "zq", descriptor = "(Lclient!yp;I)V")
	static void method30008(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		Class655.method33217(local13, -60627303);
	}

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lclient!pn;ZI)V")
	public Class480(@OriginalArg(0) Class141 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("");
		}
		this.aClass141_1 = arg0;
		this.aBoolean879 = arg1;
		this.anInt4992 = arg2 * 883822825;
	}

	@OriginalMember(owner = "client!pf", name = "t", descriptor = "(I)Z")
	synchronized boolean method29912(@OriginalArg(0) int arg0) {
		if (this.aClass492_2 == null) {
			this.aClass492_2 = this.aClass141_1.method10894(1936242940);
			if (this.aClass492_2 == null) {
				return false;
			}
			this.anObjectArray43 = new Object[this.aClass492_2.anInt5025 * 183068259];
			this.anObjectArrayArray3 = new Object[this.aClass492_2.anInt5025 * 183068259][];
		}
		return true;
	}

	@OriginalMember(owner = "client!pf", name = "bd", descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z")
	public boolean method29913(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method29912(337529426)) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass492_2.aClass349_1.method27995(Class536.method30875(local8, -2084753460), 600500347);
		if (local20 < 0) {
			return false;
		} else {
			@Pc(35) int local35 = this.aClass492_2.aClass349Array1[local20].method27995(Class536.method30875(local11, -1996879008), -182418223);
			return local35 >= 0;
		}
	}

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "(IB)Z")
	synchronized boolean method29914(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (!this.method29912(337529426)) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass492_2.anIntArray463.length && this.aClass492_2.anIntArray463[arg0] != 0) {
			return true;
		} else if (aBoolean880) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pf", name = "u", descriptor = "(IIB)Z")
	public synchronized boolean method29915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (!this.method29912(337529426)) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass492_2.anIntArray463.length && arg1 < this.aClass492_2.anIntArray463[arg0]) {
			return true;
		} else if (aBoolean880) {
			throw new IllegalArgumentException(arg0 + " " + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "(II)V")
	synchronized void method29916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean879) {
			this.anObjectArray43[arg0] = this.aClass141_1.method10891(arg0, (byte) -27);
		} else {
			this.anObjectArray43[arg0] = Class696.method37040(this.aClass141_1.method10891(arg0, (byte) -48), false, (short) 256);
		}
	}

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "(IB)V")
	public void method29917(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aClass141_1.method10902(arg0, (byte) -112);
	}

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "(III)[B")
	public byte[] method29918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.method29919(arg0, arg1, null, (byte) -108);
	}

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "(II[IB)[B")
	public synchronized byte[] method29919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte arg3) {
		if (!this.method29915(arg0, arg1, (byte) -38)) {
			return null;
		}
		@Pc(9) byte[] local9 = null;
		if (this.anObjectArrayArray3[arg0] == null || this.anObjectArrayArray3[arg0][arg1] == null) {
			@Pc(30) boolean local30 = this.method29933(arg0, arg1, arg2, 1895895703);
			if (!local30) {
				this.method29916(arg0, -2068852384);
				local30 = this.method29933(arg0, arg1, arg2, 1836960269);
				if (!local30) {
					return null;
				}
			}
		}
		if (this.anObjectArrayArray3[arg0] == null) {
			throw new RuntimeException("");
		}
		if (this.anObjectArrayArray3[arg0][arg1] != null) {
			local9 = Class217.method25867(this.anObjectArrayArray3[arg0][arg1], false, (byte) 2);
			if (local9 == null) {
				throw new RuntimeException("");
			}
		}
		if (local9 != null) {
			if (this.anInt4992 * 524273497 == 1) {
				this.anObjectArrayArray3[arg0][arg1] = null;
				if (this.aClass492_2.anIntArray463[arg0] == 1) {
					this.anObjectArrayArray3[arg0] = null;
				}
			} else if (this.anInt4992 * 524273497 == 2) {
				this.anObjectArrayArray3[arg0] = null;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!pf", name = "ba", descriptor = "()Z")
	public synchronized boolean method29920() {
		if (!this.method29912(337529426)) {
			return false;
		}
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.aClass492_2.anIntArray459.length; local9++) {
			@Pc(21) int local21 = this.aClass492_2.anIntArray459[local9];
			if (this.anObjectArray43[local21] == null) {
				this.method29916(local21, -2068852384);
				if (this.anObjectArray43[local21] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pf", name = "ai", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method29921(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.method29934("", (byte) 105);
		return local4 == -1 ? this.method29939(arg0, "", (byte) -74) : this.method29939("", arg0, (byte) -115);
	}

	@OriginalMember(owner = "client!pf", name = "bj", descriptor = "()I")
	public synchronized int method29922() {
		if (!this.method29912(337529426)) {
			return 0;
		}
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArray43.length; local11++) {
			if (this.aClass492_2.anIntArray462[local11] > 0) {
				local7 += 100;
				local9 += this.method29924(local11, (byte) 87);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!pf", name = "al", descriptor = "(II)Z")
	public synchronized boolean method29923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method29912(337529426)) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass492_2.anIntArray463.length && arg1 < this.aClass492_2.anIntArray463[arg0]) {
			return true;
		} else if (aBoolean880) {
			throw new IllegalArgumentException(arg0 + " " + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pf", name = "k", descriptor = "(IB)I")
	public synchronized int method29924(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (this.method29914(arg0, (byte) -14)) {
			return this.anObjectArray43[arg0] == null ? this.aClass141_1.method10893(arg0, (byte) -35) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pf", name = "o", descriptor = "(III)Z")
	public synchronized boolean method29925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.method29915(arg0, arg1, (byte) -60)) {
			return false;
		} else if (this.anObjectArrayArray3[arg0] != null && this.anObjectArrayArray3[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray43[arg0] == null) {
			this.method29916(arg0, -2068852384);
			return this.anObjectArray43[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pf", name = "w", descriptor = "(II)[B")
	public synchronized byte[] method29926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method29912(337529426)) {
			return null;
		} else if (this.aClass492_2.anIntArray463.length == 1) {
			return this.method29918(0, arg0, 1896589581);
		} else if (!this.method29914(arg0, (byte) 12)) {
			return null;
		} else if (this.aClass492_2.anIntArray463[arg0] == 1) {
			return this.method29918(arg0, 0, 1896589581);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pf", name = "r", descriptor = "(IB)[I")
	public synchronized int[] method29927(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (!this.method29914(arg0, (byte) -30)) {
			return null;
		}
		@Pc(12) int[] local12 = this.aClass492_2.anIntArrayArray58[arg0];
		if (local12 == null) {
			local12 = new int[this.aClass492_2.anIntArray462[arg0]];
			@Pc(24) int local24 = 0;
			while (local24 < local12.length) {
				local12[local24] = local24++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "(II)Z")
	public boolean method29928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method29912(337529426)) {
			return false;
		} else if (this.aClass492_2.anIntArray463.length == 1) {
			return this.method29915(0, arg0, (byte) -97);
		} else if (!this.method29914(arg0, (byte) 40)) {
			return false;
		} else if (this.aClass492_2.anIntArray463[arg0] == 1) {
			return this.method29915(arg0, 0, (byte) -11);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "(II)I")
	public int method29929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method29914(arg0, (byte) -16) ? this.aClass492_2.anIntArray463[arg0] : 0;
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)I")
	public int method29930(@OriginalArg(0) int arg0) {
		return this.method29912(337529426) ? this.aClass492_2.anIntArray463.length : -1;
	}

	@OriginalMember(owner = "client!pf", name = "z", descriptor = "(II)V")
	public synchronized void method29931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.method29914(arg0, (byte) 23) && this.anObjectArrayArray3 != null) {
			this.anObjectArrayArray3[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "(ZZI)V")
	public void method29932(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (!this.method29912(337529426)) {
			return;
		}
		if (arg0) {
			this.aClass492_2.anIntArray456 = null;
			this.aClass492_2.aClass349_1 = null;
		}
		if (arg1) {
			this.aClass492_2.anIntArrayArray59 = null;
			this.aClass492_2.aClass349Array1 = null;
		}
	}

	@OriginalMember(owner = "client!pf", name = "v", descriptor = "(II[II)Z")
	synchronized boolean method29933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		if (!this.method29914(arg0, (byte) 88)) {
			return false;
		} else if (this.anObjectArray43[arg0] == null) {
			return false;
		} else {
			@Pc(19) int local19 = this.aClass492_2.anIntArray462[arg0];
			@Pc(25) int[] local25 = this.aClass492_2.anIntArrayArray58[arg0];
			if (this.anObjectArrayArray3[arg0] == null) {
				this.anObjectArrayArray3[arg0] = new Object[this.aClass492_2.anIntArray463[arg0]];
			}
			@Pc(45) Object[] local45 = this.anObjectArrayArray3[arg0];
			@Pc(47) boolean local47 = true;
			for (@Pc(49) int local49 = 0; local49 < local19; local49++) {
				@Pc(56) int local56;
				if (local25 == null) {
					local56 = local49;
				} else {
					local56 = local25[local49];
				}
				if (local45[local56] == null) {
					local47 = false;
					break;
				}
			}
			if (local47) {
				return true;
			}
			@Pc(112) int local112;
			@Pc(116) int local116;
			@Pc(103) byte[] local103;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local103 = Class217.method25867(this.anObjectArray43[arg0], false, (byte) -30);
			} else {
				local103 = Class217.method25867(this.anObjectArray43[arg0], true, (byte) 40);
				@Pc(108) Packet local108 = new Packet(local103);
				local112 = local108.g1();
				local116 = local108.g4();
				@Pc(126) int local126 = (local112 == Class486.aClass486_4.method37268() ? 5 : 9) + local116;
				local108.tinydec(arg2, 5, local126);
			}
			@Pc(145) byte[] local145;
			try {
				local145 = Class306.method27214(local103, 1972376445);
			} catch (@Pc(147) RuntimeException local147) {
				throw Class271.method26705(local147, (arg2 != null) + " " + arg0 + " " + local103.length + " " + Packet.getcrc(local103, local103.length) + " " + Packet.getcrc(local103, local103.length - 2) + " " + this.aClass492_2.anIntArray455[arg0] + " " + this.aClass492_2.anInt5026 * 457348257);
			}
			if (this.aBoolean879) {
				this.anObjectArray43[arg0] = null;
			}
			if (local19 > 1) {
				@Pc(254) int local254;
				@Pc(259) int local259;
				@Pc(261) int local261;
				@Pc(316) int local316;
				@Pc(318) int local318;
				@Pc(244) Packet local244;
				if (this.anInt4992 * 524273497 == 2) {
					local112 = local145.length;
					local112--;
					local116 = local145[local112] & 0xFF;
					local112 -= local116 * 4 * local19;
					local244 = new Packet(local145);
					@Pc(417) int local417 = 0;
					local254 = 0;
					local244.pos = local112 * 1034180571;
					for (local259 = 0; local259 < local116; local259++) {
						local261 = 0;
						for (local316 = 0; local316 < local19; local316++) {
							local261 += local244.g4();
							if (local25 == null) {
								local318 = local316;
							} else {
								local318 = local25[local316];
							}
							if (local318 == arg1) {
								local417 += local261;
								local254 = local318;
							}
						}
					}
					if (local417 == 0) {
						return true;
					}
					@Pc(473) byte[] local473 = new byte[local417];
					local417 = 0;
					local244.pos = local112 * 1034180571;
					local261 = 0;
					for (local316 = 0; local316 < local116; local316++) {
						local318 = 0;
						for (@Pc(491) int local491 = 0; local491 < local19; local491++) {
							local318 += local244.g4();
							@Pc(504) int local504;
							if (local25 == null) {
								local504 = local491;
							} else {
								local504 = local25[local491];
							}
							if (local504 == arg1) {
								System.arraycopy(local145, local261, local473, local417, local318);
								local417 += local318;
							}
							local261 += local318;
						}
					}
					local45[local254] = local473;
				} else {
					local112 = local145.length;
					local112--;
					local116 = local145[local112] & 0xFF;
					local112 -= local19 * local116 * 4;
					local244 = new Packet(local145);
					@Pc(247) int[] local247 = new int[local19];
					local244.pos = local112 * 1034180571;
					for (local254 = 0; local254 < local116; local254++) {
						local259 = 0;
						for (local261 = 0; local261 < local19; local261++) {
							local259 += local244.g4();
							local247[local261] += local259;
						}
					}
					@Pc(284) byte[][] local284 = new byte[local19][];
					for (local259 = 0; local259 < local19; local259++) {
						local284[local259] = new byte[local247[local259]];
						local247[local259] = 0;
					}
					local244.pos = local112 * 1034180571;
					local259 = 0;
					for (local261 = 0; local261 < local116; local261++) {
						local316 = 0;
						for (local318 = 0; local318 < local19; local318++) {
							local316 += local244.g4();
							System.arraycopy(local145, local259, local284[local318], local247[local318], local316);
							local247[local318] += local316;
							local259 += local316;
						}
					}
					for (local261 = 0; local261 < local19; local261++) {
						if (local25 == null) {
							local316 = local261;
						} else {
							local316 = local25[local261];
						}
						if (this.anInt4992 * 524273497 == 0) {
							local45[local316] = Class696.method37040(local284[local261], false, (short) 256);
						} else {
							local45[local316] = local284[local261];
						}
					}
				}
			} else {
				if (local25 == null) {
					local112 = 0;
				} else {
					local112 = local25[0];
				}
				if (this.anInt4992 * 524273497 == 0) {
					local45[local112] = Class696.method37040(local145, false, (short) 256);
				} else {
					local45[local112] = local145;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!pf", name = "y", descriptor = "(Ljava/lang/String;B)I")
	public int method29934(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (this.method29912(337529426)) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass492_2.aClass349_1.method27995(Class536.method30875(local8, -2096255705), -1783390357);
			return this.method29914(local17, (byte) 14) ? local17 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!pf", name = "n", descriptor = "(II)I")
	public int method29935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.method29912(337529426)) {
			@Pc(12) int local12 = this.aClass492_2.aClass349_1.method27995(arg0, -931794011);
			return this.method29914(local12, (byte) -107) ? local12 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!pf", name = "x", descriptor = "(I)I")
	public synchronized int method29936(@OriginalArg(0) int arg0) {
		if (!this.method29912(337529426)) {
			return 0;
		}
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArray43.length; local11++) {
			if (this.aClass492_2.anIntArray462[local11] > 0) {
				local7 += 100;
				local9 += this.method29924(local11, (byte) 64);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z")
	public boolean method29937(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte arg2) {
		if (!this.method29912(337529426)) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass492_2.aClass349_1.method27995(Class536.method30875(local8, -2063903163), 339828066);
		if (local20 < 0) {
			return false;
		} else {
			@Pc(35) int local35 = this.aClass492_2.aClass349Array1[local20].method27995(Class536.method30875(local11, -2000415577), -381632471);
			return local35 >= 0;
		}
	}

	@OriginalMember(owner = "client!pf", name = "ax", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
	public synchronized byte[] method29938(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (!this.method29912(337529426)) {
			return null;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass492_2.aClass349_1.method27995(Class536.method30875(local8, -1881945646), -1968220838);
		if (this.method29914(local20, (byte) 47)) {
			@Pc(38) int local38 = this.aClass492_2.aClass349Array1[local20].method27995(Class536.method30875(local11, -2067019555), -1538485970);
			return this.method29918(local20, local38, 1896589581);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pf", name = "ay", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z")
	boolean method29939(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte arg2) {
		if (!this.method29912(337529426)) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass492_2.aClass349_1.method27995(Class536.method30875(local8, -1901256779), -578738905);
		if (this.method29914(local20, (byte) 33)) {
			@Pc(38) int local38 = this.aClass492_2.aClass349Array1[local20].method27995(Class536.method30875(local11, -1973321995), 1001035445);
			return this.method29925(local20, local38, -131330030);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pf", name = "bk", descriptor = "()I")
	public synchronized int method29940() {
		if (!this.method29912(337529426)) {
			return 0;
		}
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArray43.length; local11++) {
			if (this.aClass492_2.anIntArray462[local11] > 0) {
				local7 += 100;
				local9 += this.method29924(local11, (byte) 15);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!pf", name = "az", descriptor = "(I)Z")
	public synchronized boolean method29941(@OriginalArg(0) int arg0) {
		if (!this.method29912(337529426)) {
			return false;
		} else if (this.aClass492_2.anIntArray463.length == 1) {
			return this.method29925(0, arg0, 1937972701);
		} else if (!this.method29914(arg0, (byte) -96)) {
			return false;
		} else if (this.aClass492_2.anIntArray463[arg0] == 1) {
			return this.method29925(arg0, 0, 384093741);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pf", name = "ao", descriptor = "(Ljava/lang/String;I)I")
	public int method29942(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.method29912(337529426)) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass492_2.aClass349_1.method27995(Class536.method30875(local8, -1932830386), -1020647405);
			return this.method29924(local17, (byte) 118);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pf", name = "ac", descriptor = "()Z")
	synchronized boolean method29943() {
		if (this.aClass492_2 == null) {
			this.aClass492_2 = this.aClass141_1.method10894(714743103);
			if (this.aClass492_2 == null) {
				return false;
			}
			this.anObjectArray43 = new Object[this.aClass492_2.anInt5025 * 183068259];
			this.anObjectArrayArray3 = new Object[this.aClass492_2.anInt5025 * 183068259][];
		}
		return true;
	}

	@OriginalMember(owner = "client!pf", name = "ag", descriptor = "()I")
	public int method29944() {
		if (!this.method29912(337529426)) {
			throw new IllegalStateException("");
		}
		return this.aClass492_2.anInt5026 * 457348257;
	}

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "(IB)Z")
	public synchronized boolean method29945(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (!this.method29912(337529426)) {
			return false;
		} else if (this.aClass492_2.anIntArray463.length == 1) {
			return this.method29925(0, arg0, 1814107649);
		} else if (!this.method29914(arg0, (byte) 42)) {
			return false;
		} else if (this.aClass492_2.anIntArray463[arg0] == 1) {
			return this.method29925(arg0, 0, -2048965803);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pf", name = "aa", descriptor = "(I)V")
	public void method29946(@OriginalArg(0) int arg0) {
		this.aClass141_1.method10902(arg0, (byte) -108);
	}

	@OriginalMember(owner = "client!pf", name = "ah", descriptor = "(II)Z")
	public synchronized boolean method29947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method29912(337529426)) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass492_2.anIntArray463.length && arg1 < this.aClass492_2.anIntArray463[arg0]) {
			return true;
		} else if (aBoolean880) {
			throw new IllegalArgumentException(arg0 + " " + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pf", name = "af", descriptor = "(I)V")
	synchronized void method29948(@OriginalArg(0) int arg0) {
		if (this.aBoolean879) {
			this.anObjectArray43[arg0] = this.aClass141_1.method10891(arg0, (byte) -43);
		} else {
			this.anObjectArray43[arg0] = Class696.method37040(this.aClass141_1.method10891(arg0, (byte) -100), false, (short) 256);
		}
	}

	@OriginalMember(owner = "client!pf", name = "av", descriptor = "(I)V")
	public void method29949(@OriginalArg(0) int arg0) {
		this.aClass141_1.method10902(arg0, (byte) -124);
	}

	@OriginalMember(owner = "client!pf", name = "ak", descriptor = "(I)V")
	public void method29951(@OriginalArg(0) int arg0) {
		this.aClass141_1.method10902(arg0, (byte) -29);
	}

	@OriginalMember(owner = "client!pf", name = "ad", descriptor = "(I)V")
	public void method29952(@OriginalArg(0) int arg0) {
		this.aClass141_1.method10902(arg0, (byte) -111);
	}

	@OriginalMember(owner = "client!pf", name = "an", descriptor = "(I)V")
	public void method29953(@OriginalArg(0) int arg0) {
		this.aClass141_1.method10902(arg0, (byte) -86);
	}

	@OriginalMember(owner = "client!pf", name = "bz", descriptor = "()I")
	public synchronized int method29954() {
		if (!this.method29912(337529426)) {
			return 0;
		}
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArray43.length; local11++) {
			if (this.aClass492_2.anIntArray462[local11] > 0) {
				local7 += 100;
				local9 += this.method29924(local11, (byte) 73);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!pf", name = "ae", descriptor = "(II)[B")
	public byte[] method29955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method29919(arg0, arg1, null, (byte) -127);
	}

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "(I)Z")
	public synchronized boolean method29956(@OriginalArg(0) int arg0) {
		if (!this.method29912(337529426)) {
			return false;
		}
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.aClass492_2.anIntArray459.length; local9++) {
			@Pc(21) int local21 = this.aClass492_2.anIntArray459[local9];
			if (this.anObjectArray43[local21] == null) {
				this.method29916(local21, -2068852384);
				if (this.anObjectArray43[local21] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pf", name = "ar", descriptor = "(II[I)[B")
	public synchronized byte[] method29957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method29915(arg0, arg1, (byte) -27)) {
			return null;
		}
		@Pc(9) byte[] local9 = null;
		if (this.anObjectArrayArray3[arg0] == null || this.anObjectArrayArray3[arg0][arg1] == null) {
			@Pc(30) boolean local30 = this.method29933(arg0, arg1, arg2, 1999079612);
			if (!local30) {
				this.method29916(arg0, -2068852384);
				local30 = this.method29933(arg0, arg1, arg2, 1903275974);
				if (!local30) {
					return null;
				}
			}
		}
		if (this.anObjectArrayArray3[arg0] == null) {
			throw new RuntimeException("");
		}
		if (this.anObjectArrayArray3[arg0][arg1] != null) {
			local9 = Class217.method25867(this.anObjectArrayArray3[arg0][arg1], false, (byte) -84);
			if (local9 == null) {
				throw new RuntimeException("");
			}
		}
		if (local9 != null) {
			if (this.anInt4992 * 524273497 == 1) {
				this.anObjectArrayArray3[arg0][arg1] = null;
				if (this.aClass492_2.anIntArray463[arg0] == 1) {
					this.anObjectArrayArray3[arg0] = null;
				}
			} else if (this.anInt4992 * 524273497 == 2) {
				this.anObjectArrayArray3[arg0] = null;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!pf", name = "bo", descriptor = "(I)I")
	public int method29958(@OriginalArg(0) int arg0) {
		return this.method29914(arg0, (byte) -101) ? this.aClass492_2.anIntArray463[arg0] : 0;
	}

	@OriginalMember(owner = "client!pf", name = "cy", descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z")
	boolean method29959(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method29912(337529426)) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass492_2.aClass349_1.method27995(Class536.method30875(local8, -2126334957), 690721609);
		if (this.method29914(local20, (byte) 1)) {
			@Pc(38) int local38 = this.aClass492_2.aClass349Array1[local20].method27995(Class536.method30875(local11, -1946218269), 885704406);
			return this.method29925(local20, local38, -384789105);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pf", name = "as", descriptor = "(I)Z")
	public synchronized boolean method29960(@OriginalArg(0) int arg0) {
		if (!this.method29912(337529426)) {
			return false;
		} else if (this.aClass492_2.anIntArray463.length == 1) {
			return this.method29925(0, arg0, -1902074535);
		} else if (!this.method29914(arg0, (byte) -36)) {
			return false;
		} else if (this.aClass492_2.anIntArray463[arg0] == 1) {
			return this.method29925(arg0, 0, 392555199);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pf", name = "aw", descriptor = "(I)Z")
	public synchronized boolean method29961(@OriginalArg(0) int arg0) {
		if (!this.method29912(337529426)) {
			return false;
		} else if (this.aClass492_2.anIntArray463.length == 1) {
			return this.method29925(0, arg0, 1678207830);
		} else if (!this.method29914(arg0, (byte) -36)) {
			return false;
		} else if (this.aClass492_2.anIntArray463[arg0] == 1) {
			return this.method29925(arg0, 0, 1838127272);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pf", name = "bg", descriptor = "(I)Z")
	public synchronized boolean method29962(@OriginalArg(0) int arg0) {
		if (!this.method29914(arg0, (byte) 9)) {
			return false;
		} else if (this.anObjectArray43[arg0] == null) {
			this.method29916(arg0, -2068852384);
			return this.anObjectArray43[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pf", name = "bl", descriptor = "(I)Z")
	public synchronized boolean method29963(@OriginalArg(0) int arg0) {
		if (!this.method29914(arg0, (byte) -15)) {
			return false;
		} else if (this.anObjectArray43[arg0] == null) {
			this.method29916(arg0, -2068852384);
			return this.anObjectArray43[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pf", name = "br", descriptor = "()Z")
	public synchronized boolean method29964() {
		if (!this.method29912(337529426)) {
			return false;
		}
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.aClass492_2.anIntArray459.length; local9++) {
			@Pc(21) int local21 = this.aClass492_2.anIntArray459[local9];
			if (this.anObjectArray43[local21] == null) {
				this.method29916(local21, -2068852384);
				if (this.anObjectArray43[local21] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pf", name = "bn", descriptor = "()Z")
	public synchronized boolean method29965() {
		if (!this.method29912(337529426)) {
			return false;
		}
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.aClass492_2.anIntArray459.length; local9++) {
			@Pc(21) int local21 = this.aClass492_2.anIntArray459[local9];
			if (this.anObjectArray43[local21] == null) {
				this.method29916(local21, -2068852384);
				if (this.anObjectArray43[local21] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pf", name = "bv", descriptor = "(I)[I")
	public synchronized int[] method29966(@OriginalArg(0) int arg0) {
		if (!this.method29914(arg0, (byte) -60)) {
			return null;
		}
		@Pc(12) int[] local12 = this.aClass492_2.anIntArrayArray58[arg0];
		if (local12 == null) {
			local12 = new int[this.aClass492_2.anIntArray462[arg0]];
			@Pc(24) int local24 = 0;
			while (local24 < local12.length) {
				local12[local24] = local24++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!pf", name = "bt", descriptor = "(I)I")
	public synchronized int method29967(@OriginalArg(0) int arg0) {
		if (this.method29914(arg0, (byte) -33)) {
			return this.anObjectArray43[arg0] == null ? this.aClass141_1.method10893(arg0, (byte) 68) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pf", name = "ap", descriptor = "(II[I)[B")
	public synchronized byte[] method29968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method29915(arg0, arg1, (byte) -20)) {
			return null;
		}
		@Pc(9) byte[] local9 = null;
		if (this.anObjectArrayArray3[arg0] == null || this.anObjectArrayArray3[arg0][arg1] == null) {
			@Pc(30) boolean local30 = this.method29933(arg0, arg1, arg2, 1876924342);
			if (!local30) {
				this.method29916(arg0, -2068852384);
				local30 = this.method29933(arg0, arg1, arg2, 1926052884);
				if (!local30) {
					return null;
				}
			}
		}
		if (this.anObjectArrayArray3[arg0] == null) {
			throw new RuntimeException("");
		}
		if (this.anObjectArrayArray3[arg0][arg1] != null) {
			local9 = Class217.method25867(this.anObjectArrayArray3[arg0][arg1], false, (byte) -23);
			if (local9 == null) {
				throw new RuntimeException("");
			}
		}
		if (local9 != null) {
			if (this.anInt4992 * 524273497 == 1) {
				this.anObjectArrayArray3[arg0][arg1] = null;
				if (this.aClass492_2.anIntArray463[arg0] == 1) {
					this.anObjectArrayArray3[arg0] = null;
				}
			} else if (this.anInt4992 * 524273497 == 2) {
				this.anObjectArrayArray3[arg0] = null;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "(I)I")
	public int method29969(@OriginalArg(0) int arg0) {
		if (!this.method29912(337529426)) {
			throw new IllegalStateException("");
		}
		return this.aClass492_2.anInt5026 * 457348257;
	}

	@OriginalMember(owner = "client!pf", name = "be", descriptor = "(I)[B")
	public synchronized byte[] method29970(@OriginalArg(0) int arg0) {
		if (!this.method29912(337529426)) {
			return null;
		} else if (this.aClass492_2.anIntArray463.length == 1) {
			return this.method29918(0, arg0, 1896589581);
		} else if (!this.method29914(arg0, (byte) 64)) {
			return null;
		} else if (this.aClass492_2.anIntArray463[arg0] == 1) {
			return this.method29918(arg0, 0, 1896589581);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pf", name = "by", descriptor = "()I")
	public synchronized int method29971() {
		if (!this.method29912(337529426)) {
			return 0;
		}
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArray43.length; local11++) {
			if (this.aClass492_2.anIntArray462[local11] > 0) {
				local7 += 100;
				local9 += this.method29924(local11, (byte) 35);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method29972(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.method29912(337529426)) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass492_2.aClass349_1.method27995(Class536.method30875(local8, -1949820957), 286917540);
			return local17 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pf", name = "bb", descriptor = "(I)Z")
	public boolean method29973(@OriginalArg(0) int arg0) {
		if (!this.method29912(337529426)) {
			return false;
		} else if (this.aClass492_2.anIntArray463.length == 1) {
			return this.method29915(0, arg0, (byte) -52);
		} else if (!this.method29914(arg0, (byte) 31)) {
			return false;
		} else if (this.aClass492_2.anIntArray463[arg0] == 1) {
			return this.method29915(arg0, 0, (byte) -120);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pf", name = "bh", descriptor = "(I)[B")
	public synchronized byte[] method29974(@OriginalArg(0) int arg0) {
		if (!this.method29912(337529426)) {
			return null;
		} else if (this.aClass492_2.anIntArray463.length == 1) {
			return this.method29918(0, arg0, 1896589581);
		} else if (!this.method29914(arg0, (byte) -25)) {
			return null;
		} else if (this.aClass492_2.anIntArray463[arg0] == 1) {
			return this.method29918(arg0, 0, 1896589581);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)Z")
	public synchronized boolean method29975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method29914(arg0, (byte) -47)) {
			return false;
		} else if (this.anObjectArray43[arg0] == null) {
			this.method29916(arg0, -2068852384);
			return this.anObjectArray43[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pf", name = "bp", descriptor = "(I)Z")
	public boolean method29976(@OriginalArg(0) int arg0) {
		if (!this.method29912(337529426)) {
			return false;
		} else if (this.aClass492_2.anIntArray463.length == 1) {
			return this.method29915(0, arg0, (byte) -107);
		} else if (!this.method29914(arg0, (byte) 27)) {
			return false;
		} else if (this.aClass492_2.anIntArray463[arg0] == 1) {
			return this.method29915(arg0, 0, (byte) -55);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pf", name = "at", descriptor = "(I)V")
	public void method29977(@OriginalArg(0) int arg0) {
		this.aClass141_1.method10902(arg0, (byte) -101);
	}

	@OriginalMember(owner = "client!pf", name = "ab", descriptor = "(I)Z")
	synchronized boolean method29978(@OriginalArg(0) int arg0) {
		if (!this.method29912(337529426)) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass492_2.anIntArray463.length && this.aClass492_2.anIntArray463[arg0] != 0) {
			return true;
		} else if (aBoolean880) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pf", name = "bc", descriptor = "()I")
	public int method29979() {
		return this.method29912(337529426) ? this.aClass492_2.anIntArray463.length : -1;
	}

	@OriginalMember(owner = "client!pf", name = "bf", descriptor = "()I")
	public int method29980() {
		return this.method29912(337529426) ? this.aClass492_2.anIntArray463.length : -1;
	}

	@OriginalMember(owner = "client!pf", name = "bw", descriptor = "()I")
	public int method29981() {
		return this.method29912(337529426) ? this.aClass492_2.anIntArray463.length : -1;
	}

	@OriginalMember(owner = "client!pf", name = "bx", descriptor = "(I)V")
	public synchronized void method29982(@OriginalArg(0) int arg0) {
		if (this.method29914(arg0, (byte) 5) && this.anObjectArrayArray3 != null) {
			this.anObjectArrayArray3[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!pf", name = "bi", descriptor = "(ZZ)V")
	public void method29983(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (!this.method29912(337529426)) {
			return;
		}
		if (arg0) {
			this.aClass492_2.anIntArray456 = null;
			this.aClass492_2.aClass349_1 = null;
		}
		if (arg1) {
			this.aClass492_2.anIntArrayArray59 = null;
			this.aClass492_2.aClass349Array1 = null;
		}
	}

	@OriginalMember(owner = "client!pf", name = "bu", descriptor = "(II[I)Z")
	synchronized boolean method29984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method29914(arg0, (byte) -21)) {
			return false;
		} else if (this.anObjectArray43[arg0] == null) {
			return false;
		} else {
			@Pc(19) int local19 = this.aClass492_2.anIntArray462[arg0];
			@Pc(25) int[] local25 = this.aClass492_2.anIntArrayArray58[arg0];
			if (this.anObjectArrayArray3[arg0] == null) {
				this.anObjectArrayArray3[arg0] = new Object[this.aClass492_2.anIntArray463[arg0]];
			}
			@Pc(45) Object[] local45 = this.anObjectArrayArray3[arg0];
			@Pc(47) boolean local47 = true;
			for (@Pc(49) int local49 = 0; local49 < local19; local49++) {
				@Pc(56) int local56;
				if (local25 == null) {
					local56 = local49;
				} else {
					local56 = local25[local49];
				}
				if (local45[local56] == null) {
					local47 = false;
					break;
				}
			}
			if (local47) {
				return true;
			}
			@Pc(112) int local112;
			@Pc(116) int local116;
			@Pc(103) byte[] local103;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local103 = Class217.method25867(this.anObjectArray43[arg0], false, (byte) 4);
			} else {
				local103 = Class217.method25867(this.anObjectArray43[arg0], true, (byte) -46);
				@Pc(108) Packet local108 = new Packet(local103);
				local112 = local108.g1();
				local116 = local108.g4();
				@Pc(126) int local126 = (local112 == Class486.aClass486_4.method37268() ? 5 : 9) + local116;
				local108.tinydec(arg2, 5, local126);
			}
			@Pc(145) byte[] local145;
			try {
				local145 = Class306.method27214(local103, 1972376445);
			} catch (@Pc(147) RuntimeException local147) {
				throw Class271.method26705(local147, (arg2 != null) + " " + arg0 + " " + local103.length + " " + Packet.getcrc(local103, local103.length) + " " + Packet.getcrc(local103, local103.length - 2) + " " + this.aClass492_2.anIntArray455[arg0] + " " + this.aClass492_2.anInt5026 * 457348257);
			}
			if (this.aBoolean879) {
				this.anObjectArray43[arg0] = null;
			}
			if (local19 > 1) {
				@Pc(254) int local254;
				@Pc(259) int local259;
				@Pc(261) int local261;
				@Pc(316) int local316;
				@Pc(318) int local318;
				@Pc(244) Packet local244;
				if (this.anInt4992 * 524273497 == 2) {
					local112 = local145.length;
					local112--;
					local116 = local145[local112] & 0xFF;
					local112 -= local116 * 4 * local19;
					local244 = new Packet(local145);
					@Pc(417) int local417 = 0;
					local254 = 0;
					local244.pos = local112 * 1034180571;
					for (local259 = 0; local259 < local116; local259++) {
						local261 = 0;
						for (local316 = 0; local316 < local19; local316++) {
							local261 += local244.g4();
							if (local25 == null) {
								local318 = local316;
							} else {
								local318 = local25[local316];
							}
							if (local318 == arg1) {
								local417 += local261;
								local254 = local318;
							}
						}
					}
					if (local417 == 0) {
						return true;
					}
					@Pc(473) byte[] local473 = new byte[local417];
					local417 = 0;
					local244.pos = local112 * 1034180571;
					local261 = 0;
					for (local316 = 0; local316 < local116; local316++) {
						local318 = 0;
						for (@Pc(491) int local491 = 0; local491 < local19; local491++) {
							local318 += local244.g4();
							@Pc(504) int local504;
							if (local25 == null) {
								local504 = local491;
							} else {
								local504 = local25[local491];
							}
							if (local504 == arg1) {
								System.arraycopy(local145, local261, local473, local417, local318);
								local417 += local318;
							}
							local261 += local318;
						}
					}
					local45[local254] = local473;
				} else {
					local112 = local145.length;
					local112--;
					local116 = local145[local112] & 0xFF;
					local112 -= local19 * local116 * 4;
					local244 = new Packet(local145);
					@Pc(247) int[] local247 = new int[local19];
					local244.pos = local112 * 1034180571;
					for (local254 = 0; local254 < local116; local254++) {
						local259 = 0;
						for (local261 = 0; local261 < local19; local261++) {
							local259 += local244.g4();
							local247[local261] += local259;
						}
					}
					@Pc(284) byte[][] local284 = new byte[local19][];
					for (local259 = 0; local259 < local19; local259++) {
						local284[local259] = new byte[local247[local259]];
						local247[local259] = 0;
					}
					local244.pos = local112 * 1034180571;
					local259 = 0;
					for (local261 = 0; local261 < local116; local261++) {
						local316 = 0;
						for (local318 = 0; local318 < local19; local318++) {
							local316 += local244.g4();
							System.arraycopy(local145, local259, local284[local318], local247[local318], local316);
							local247[local318] += local316;
							local259 += local316;
						}
					}
					for (local261 = 0; local261 < local19; local261++) {
						if (local25 == null) {
							local316 = local261;
						} else {
							local316 = local25[local261];
						}
						if (this.anInt4992 * 524273497 == 0) {
							local45[local316] = Class696.method37040(local284[local261], false, (short) 256);
						} else {
							local45[local316] = local284[local261];
						}
					}
				}
			} else {
				if (local25 == null) {
					local112 = 0;
				} else {
					local112 = local25[0];
				}
				if (this.anInt4992 * 524273497 == 0) {
					local45[local112] = Class696.method37040(local145, false, (short) 256);
				} else {
					local45[local112] = local145;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!pf", name = "bm", descriptor = "(I)I")
	public int method29985(@OriginalArg(0) int arg0) {
		if (this.method29912(337529426)) {
			@Pc(12) int local12 = this.aClass492_2.aClass349_1.method27995(arg0, 1292025317);
			return this.method29914(local12, (byte) -102) ? local12 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!pf", name = "bq", descriptor = "(Ljava/lang/String;)Z")
	public boolean method29986(@OriginalArg(0) String arg0) {
		if (this.method29912(337529426)) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass492_2.aClass349_1.method27995(Class536.method30875(local8, -1909716579), 1677086857);
			return local17 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pf", name = "aq", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method29987(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.method29912(337529426)) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass492_2.aClass349_1.method27995(Class536.method30875(local8, -1928157037), -1704010286);
			return this.method29975(local17, -1403081456);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pf", name = "cd", descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z")
	public boolean method29988(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method29912(337529426)) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass492_2.aClass349_1.method27995(Class536.method30875(local8, -2142563697), 1112898895);
		if (local20 < 0) {
			return false;
		} else {
			@Pc(35) int local35 = this.aClass492_2.aClass349Array1[local20].method27995(Class536.method30875(local11, -2011739568), -1158209107);
			return local35 >= 0;
		}
	}

	@OriginalMember(owner = "client!pf", name = "cv", descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z")
	public boolean method29989(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method29912(337529426)) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass492_2.aClass349_1.method27995(Class536.method30875(local8, -1879668153), 1385963983);
		if (local20 < 0) {
			return false;
		} else {
			@Pc(35) int local35 = this.aClass492_2.aClass349Array1[local20].method27995(Class536.method30875(local11, -1970340610), -444906631);
			return local35 >= 0;
		}
	}

	@OriginalMember(owner = "client!pf", name = "ct", descriptor = "(Ljava/lang/String;Ljava/lang/String;)[B")
	public synchronized byte[] method29990(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method29912(337529426)) {
			return null;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass492_2.aClass349_1.method27995(Class536.method30875(local8, -2033842842), 331680554);
		if (this.method29914(local20, (byte) 13)) {
			@Pc(38) int local38 = this.aClass492_2.aClass349Array1[local20].method27995(Class536.method30875(local11, -1963033711), -1376614727);
			return this.method29918(local20, local38, 1896589581);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pf", name = "cn", descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z")
	boolean method29991(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method29912(337529426)) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass492_2.aClass349_1.method27995(Class536.method30875(local8, -1926558222), -1569679012);
		if (this.method29914(local20, (byte) 25)) {
			@Pc(38) int local38 = this.aClass492_2.aClass349Array1[local20].method27995(Class536.method30875(local11, -2124876363), 1825194411);
			return this.method29925(local20, local38, -1117316256);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pf", name = "am", descriptor = "(I)V")
	public void method29992(@OriginalArg(0) int arg0) {
		this.aClass141_1.method10902(arg0, (byte) -21);
	}

	@OriginalMember(owner = "client!pf", name = "ch", descriptor = "(Ljava/lang/String;)Z")
	public boolean method29993(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = this.method29934("", (byte) -6);
		return local4 == -1 ? this.method29939(arg0, "", (byte) -18) : this.method29939("", arg0, (byte) -86);
	}

	@OriginalMember(owner = "client!pf", name = "cc", descriptor = "(Ljava/lang/String;)Z")
	public boolean method29994(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = this.method29934("", (byte) 69);
		return local4 == -1 ? this.method29939(arg0, "", (byte) -125) : this.method29939("", arg0, (byte) -112);
	}

	@OriginalMember(owner = "client!pf", name = "cu", descriptor = "(Ljava/lang/String;)Z")
	public boolean method29995(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = this.method29934("", (byte) -56);
		return local4 == -1 ? this.method29939(arg0, "", (byte) -101) : this.method29939("", arg0, (byte) -97);
	}

	@OriginalMember(owner = "client!pf", name = "ce", descriptor = "(Ljava/lang/String;)Z")
	public boolean method29996(@OriginalArg(0) String arg0) {
		if (this.method29912(337529426)) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass492_2.aClass349_1.method27995(Class536.method30875(local8, -2050715341), -1089530944);
			return this.method29975(local17, -1403081456);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pf", name = "au", descriptor = "(II)Z")
	public synchronized boolean method29998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method29915(arg0, arg1, (byte) -85)) {
			return false;
		} else if (this.anObjectArrayArray3[arg0] != null && this.anObjectArrayArray3[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray43[arg0] == null) {
			this.method29916(arg0, -2068852384);
			return this.anObjectArray43[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pf", name = "bs", descriptor = "()I")
	public synchronized int method29999() {
		if (!this.method29912(337529426)) {
			return 0;
		}
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArray43.length; local11++) {
			if (this.aClass492_2.anIntArray462[local11] > 0) {
				local7 += 100;
				local9 += this.method29924(local11, (byte) 64);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}
}
