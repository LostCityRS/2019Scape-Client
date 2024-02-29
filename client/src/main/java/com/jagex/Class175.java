package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ax")
public class Class175 {

	@OriginalMember(owner = "client!ax", name = "uw", descriptor = "I")
	public static int anInt3306;

	@OriginalMember(owner = "client!ax", name = "y", descriptor = "Lclient!nz;")
	Class453 aClass453_1;

	@OriginalMember(owner = "client!ax", name = "f", descriptor = "Lclient!aav;")
	public Class24 aClass24_2;

	@OriginalMember(owner = "client!ax", name = "o", descriptor = "I")
	int anInt3302;

	@OriginalMember(owner = "client!ax", name = "e", descriptor = "Lclient!uz;")
	Class160 aClass160_3;

	@OriginalMember(owner = "client!ax", name = "r", descriptor = "I")
	int anInt3303;

	@OriginalMember(owner = "client!ax", name = "v", descriptor = "I")
	int anInt3304;

	@OriginalMember(owner = "client!ax", name = "s", descriptor = "I")
	int anInt3305;

	@OriginalMember(owner = "client!ax", name = "x", descriptor = "Lclient!nz;")
	Class453 aClass453_3;

	@OriginalMember(owner = "client!ax", name = "q", descriptor = "Lclient!nz;")
	Class453 aClass453_4;

	@OriginalMember(owner = "client!ax", name = "l", descriptor = "Lclient!aav;")
	Class24 aClass24_3;

	@OriginalMember(owner = "client!ax", name = "n", descriptor = "Lclient!aat;")
	Class22 aClass22_44 = new Class22();

	@OriginalMember(owner = "client!ax", name = "m", descriptor = "I")
	public int anInt3299 = 0;

	@OriginalMember(owner = "client!ax", name = "k", descriptor = "Lclient!alw;")
	Class93_Sub41 aClass93_Sub41_14 = new Class93_Sub41(1700);

	@OriginalMember(owner = "client!ax", name = "w", descriptor = "Lclient!ase;")
	Class93_Sub41_Sub2 aClass93_Sub41_Sub2_2 = new Class93_Sub41_Sub2(40000);

	@OriginalMember(owner = "client!ax", name = "u", descriptor = "Lclient!nz;")
	Class453 aClass453_2 = null;

	@OriginalMember(owner = "client!ax", name = "z", descriptor = "I")
	int anInt3301 = 0;

	@OriginalMember(owner = "client!ax", name = "p", descriptor = "Z")
	boolean aBoolean563 = true;

	@OriginalMember(owner = "client!ax", name = "d", descriptor = "I")
	int anInt3298 = 0;

	@OriginalMember(owner = "client!ax", name = "c", descriptor = "I")
	public int anInt3300 = 0;

	@OriginalMember(owner = "client!ax", name = "b", descriptor = "Z")
	public boolean aBoolean564 = false;

	@OriginalMember(owner = "client!ax", name = "h", descriptor = "Lclient!e;")
	Class238 aClass238_1 = new Class238();

	@OriginalMember(owner = "client!ax", name = "<init>", descriptor = "()V", line = 36)
	Class175() {
		@Pc(50) Thread local50 = new Thread(this.aClass238_1);
		local50.setDaemon(true);
		local50.setPriority(1);
		local50.start();
	}

	@OriginalMember(owner = "client!ax", name = "p", descriptor = "()V", line = 44)
	final void method24348() {
		this.aClass22_44.method405(-2037259486);
		this.anInt3299 = 0;
	}

	@OriginalMember(owner = "client!ax", name = "z", descriptor = "()V", line = 44)
	final void method24349() {
		this.aClass22_44.method405(-2037259486);
		this.anInt3299 = 0;
	}

	@OriginalMember(owner = "client!ax", name = "d", descriptor = "()V", line = 44)
	final void method24350() {
		this.aClass22_44.method405(-2037259486);
		this.anInt3299 = 0;
	}

	@OriginalMember(owner = "client!ax", name = "e", descriptor = "(I)V", line = 44)
	final void method24351(@OriginalArg(0) int arg0) {
		this.aClass22_44.method405(-2037259486);
		this.anInt3299 = 0;
	}

	@OriginalMember(owner = "client!ax", name = "n", descriptor = "(B)V", line = 49)
	public final void method24352(@OriginalArg(0) byte arg0) throws IOException {
		if (this.aClass160_3 == null || this.anInt3299 * 195575097 <= 0) {
			return;
		}
		this.aClass93_Sub41_14.anInt3070 = 0;
		while (true) {
			@Pc(17) Class93_Sub22 local17 = (Class93_Sub22) this.aClass22_44.method428((byte) 24);
			if (local17 == null || local17.anInt1569 * -1609174005 > this.aClass93_Sub41_14.aByteArray58.length - this.aClass93_Sub41_14.anInt3070 * 212851357) {
				this.aClass160_3.method14721(this.aClass93_Sub41_14.aByteArray58, 0, this.aClass93_Sub41_14.anInt3070 * 212851357, 597469915);
				this.anInt3303 += this.aClass93_Sub41_14.anInt3070 * 1323994419;
				this.anInt3300 = 0;
				break;
			}
			this.aClass93_Sub41_14.method22439(local17.aClass93_Sub41_Sub2_1.aByteArray58, 0, local17.anInt1569 * -1609174005, 2026842986);
			this.anInt3299 -= local17.anInt1569 * -337674397;
			local17.method23969(-1674819412);
			local17.aClass93_Sub41_Sub2_1.method22392((byte) 1);
			local17.method13717(-915434420);
		}
	}

	@OriginalMember(owner = "client!ax", name = "c", descriptor = "()V", line = 49)
	public final void method24353() throws IOException {
		if (this.aClass160_3 == null || this.anInt3299 * 195575097 <= 0) {
			return;
		}
		this.aClass93_Sub41_14.anInt3070 = 0;
		while (true) {
			@Pc(17) Class93_Sub22 local17 = (Class93_Sub22) this.aClass22_44.method428((byte) 49);
			if (local17 == null || local17.anInt1569 * -1609174005 > this.aClass93_Sub41_14.aByteArray58.length - this.aClass93_Sub41_14.anInt3070 * 212851357) {
				this.aClass160_3.method14721(this.aClass93_Sub41_14.aByteArray58, 0, this.aClass93_Sub41_14.anInt3070 * 212851357, -145339264);
				this.anInt3303 += this.aClass93_Sub41_14.anInt3070 * 1323994419;
				this.anInt3300 = 0;
				break;
			}
			this.aClass93_Sub41_14.method22439(local17.aClass93_Sub41_Sub2_1.aByteArray58, 0, local17.anInt1569 * -1609174005, 2026842986);
			this.anInt3299 -= local17.anInt1569 * -337674397;
			local17.method23969(-2064695648);
			local17.aClass93_Sub41_Sub2_1.method22392((byte) 1);
			local17.method13717(-915434420);
		}
	}

	@OriginalMember(owner = "client!ax", name = "r", descriptor = "()V", line = 49)
	public final void method24354() throws IOException {
		if (this.aClass160_3 == null || this.anInt3299 * 195575097 <= 0) {
			return;
		}
		this.aClass93_Sub41_14.anInt3070 = 0;
		while (true) {
			@Pc(17) Class93_Sub22 local17 = (Class93_Sub22) this.aClass22_44.method428((byte) 19);
			if (local17 == null || local17.anInt1569 * -1609174005 > this.aClass93_Sub41_14.aByteArray58.length - this.aClass93_Sub41_14.anInt3070 * 212851357) {
				this.aClass160_3.method14721(this.aClass93_Sub41_14.aByteArray58, 0, this.aClass93_Sub41_14.anInt3070 * 212851357, 631640877);
				this.anInt3303 += this.aClass93_Sub41_14.anInt3070 * 1323994419;
				this.anInt3300 = 0;
				break;
			}
			this.aClass93_Sub41_14.method22439(local17.aClass93_Sub41_Sub2_1.aByteArray58, 0, local17.anInt1569 * -1609174005, 2026842986);
			this.anInt3299 -= local17.anInt1569 * -337674397;
			local17.method23969(-635188353);
			local17.aClass93_Sub41_Sub2_1.method22392((byte) 1);
			local17.method13717(-915434420);
		}
	}

	@OriginalMember(owner = "client!ax", name = "v", descriptor = "()V", line = 49)
	public final void method24355() throws IOException {
		if (this.aClass160_3 == null || this.anInt3299 * 195575097 <= 0) {
			return;
		}
		this.aClass93_Sub41_14.anInt3070 = 0;
		while (true) {
			@Pc(17) Class93_Sub22 local17 = (Class93_Sub22) this.aClass22_44.method428((byte) 45);
			if (local17 == null || local17.anInt1569 * -1609174005 > this.aClass93_Sub41_14.aByteArray58.length - this.aClass93_Sub41_14.anInt3070 * 212851357) {
				this.aClass160_3.method14721(this.aClass93_Sub41_14.aByteArray58, 0, this.aClass93_Sub41_14.anInt3070 * 212851357, 1992464729);
				this.anInt3303 += this.aClass93_Sub41_14.anInt3070 * 1323994419;
				this.anInt3300 = 0;
				break;
			}
			this.aClass93_Sub41_14.method22439(local17.aClass93_Sub41_Sub2_1.aByteArray58, 0, local17.anInt1569 * -1609174005, 2026842986);
			this.anInt3299 -= local17.anInt1569 * -337674397;
			local17.method23969(1768156483);
			local17.aClass93_Sub41_Sub2_1.method22392((byte) 1);
			local17.method13717(-915434420);
		}
	}

	@OriginalMember(owner = "client!ax", name = "m", descriptor = "(Lclient!akl;I)V", line = 68)
	public final void method24356(@OriginalArg(0) Class93_Sub22 arg0, @OriginalArg(1) int arg1) {
		this.aClass22_44.method408(arg0, -664094901);
		arg0.anInt1569 = arg0.aClass93_Sub41_Sub2_1.anInt3070 * 1658760439;
		arg0.aClass93_Sub41_Sub2_1.anInt3070 = 0;
		this.anInt3299 += arg0.anInt1569 * -337674397;
	}

	@OriginalMember(owner = "client!ax", name = "s", descriptor = "(Lclient!akl;)V", line = 68)
	public final void method24357(@OriginalArg(0) Class93_Sub22 arg0) {
		this.aClass22_44.method408(arg0, -1320871128);
		arg0.anInt1569 = arg0.aClass93_Sub41_Sub2_1.anInt3070 * 1658760439;
		arg0.aClass93_Sub41_Sub2_1.anInt3070 = 0;
		this.anInt3299 += arg0.anInt1569 * -337674397;
	}

	@OriginalMember(owner = "client!ax", name = "o", descriptor = "(Lclient!akl;)V", line = 68)
	public final void method24358(@OriginalArg(0) Class93_Sub22 arg0) {
		this.aClass22_44.method408(arg0, -942047023);
		arg0.anInt1569 = arg0.aClass93_Sub41_Sub2_1.anInt3070 * 1658760439;
		arg0.aClass93_Sub41_Sub2_1.anInt3070 = 0;
		this.anInt3299 += arg0.anInt1569 * -337674397;
	}

	@OriginalMember(owner = "client!ax", name = "y", descriptor = "()V", line = 75)
	void method24359() {
		if (client.anInt3485 % 50 == 0) {
			this.anInt3302 = this.anInt3303 * -1435834729;
			this.anInt3303 = 0;
			this.anInt3305 = this.anInt3304 * -1325632603;
			this.anInt3304 = 0;
		}
	}

	@OriginalMember(owner = "client!ax", name = "k", descriptor = "(I)V", line = 75)
	void method24360(@OriginalArg(0) int arg0) {
		if (client.anInt3485 % 50 == 0) {
			this.anInt3302 = this.anInt3303 * -1435834729;
			this.anInt3303 = 0;
			this.anInt3305 = this.anInt3304 * -1325632603;
			this.anInt3304 = 0;
		}
	}

	@OriginalMember(owner = "client!ax", name = "q", descriptor = "()V", line = 75)
	void method24361() {
		if (client.anInt3485 % 50 == 0) {
			this.anInt3302 = this.anInt3303 * -1435834729;
			this.anInt3303 = 0;
			this.anInt3305 = this.anInt3304 * -1325632603;
			this.anInt3304 = 0;
		}
	}

	@OriginalMember(owner = "client!ax", name = "b", descriptor = "()V", line = 75)
	void method24362() {
		if (client.anInt3485 % 50 == 0) {
			this.anInt3302 = this.anInt3303 * -1435834729;
			this.anInt3303 = 0;
			this.anInt3305 = this.anInt3304 * -1325632603;
			this.anInt3304 = 0;
		}
	}

	@OriginalMember(owner = "client!ax", name = "x", descriptor = "()V", line = 75)
	void method24363() {
		if (client.anInt3485 % 50 == 0) {
			this.anInt3302 = this.anInt3303 * -1435834729;
			this.anInt3303 = 0;
			this.anInt3305 = this.anInt3304 * -1325632603;
			this.anInt3304 = 0;
		}
	}

	@OriginalMember(owner = "client!ax", name = "f", descriptor = "(Lclient!uz;Ljava/lang/String;I)V", line = 84)
	void method24364(@OriginalArg(0) Class160 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		this.aClass160_3 = arg0;
		this.aClass238_1.method25779(arg1, 1786592897);
	}

	@OriginalMember(owner = "client!ax", name = "a", descriptor = "(Lclient!uz;Ljava/lang/String;)V", line = 84)
	void method24365(@OriginalArg(0) Class160 arg0, @OriginalArg(1) String arg1) {
		this.aClass160_3 = arg0;
		this.aClass238_1.method25779(arg1, -55849145);
	}

	@OriginalMember(owner = "client!ax", name = "h", descriptor = "(Lclient!uz;Ljava/lang/String;)V", line = 84)
	void method24366(@OriginalArg(0) Class160 arg0, @OriginalArg(1) String arg1) {
		this.aClass160_3 = arg0;
		this.aClass238_1.method25779(arg1, 1921861521);
	}

	@OriginalMember(owner = "client!ax", name = "w", descriptor = "(B)V", line = 89)
	void method24367(@OriginalArg(0) byte arg0) {
		if (this.aClass160_3 != null) {
			this.aClass160_3.method14722(1225840225);
			this.aClass160_3 = null;
		}
		this.aClass238_1.method25779(null, 1005916089);
	}

	@OriginalMember(owner = "client!ax", name = "l", descriptor = "(B)V", line = 97)
	void method24368(@OriginalArg(0) byte arg0) {
		this.aClass160_3 = null;
		this.aClass238_1.method25779(null, 1316327137);
	}

	@OriginalMember(owner = "client!ax", name = "g", descriptor = "()V", line = 97)
	void method24369() {
		this.aClass160_3 = null;
		this.aClass238_1.method25779(null, 341825435);
	}

	@OriginalMember(owner = "client!ax", name = "i", descriptor = "()V", line = 97)
	void method24370() {
		this.aClass160_3 = null;
		this.aClass238_1.method25779(null, 73996478);
	}

	@OriginalMember(owner = "client!ax", name = "j", descriptor = "()V", line = 97)
	void method24371() {
		this.aClass160_3 = null;
		this.aClass238_1.method25779(null, 1436018187);
	}

	@OriginalMember(owner = "client!ax", name = "u", descriptor = "(B)Lclient!uz;", line = 102)
	public Class160 method24372(@OriginalArg(0) byte arg0) {
		return this.aClass160_3;
	}

	@OriginalMember(owner = "client!ax", name = "ae", descriptor = "()Lclient!uz;", line = 102)
	public Class160 method24373() {
		return this.aClass160_3;
	}

	@OriginalMember(owner = "client!ax", name = "t", descriptor = "()Lclient!uz;", line = 102)
	public Class160 method24374() {
		return this.aClass160_3;
	}

	@OriginalMember(owner = "client!ax", name = "ag", descriptor = "()Lclient!uz;", line = 102)
	public Class160 method24375() {
		return this.aClass160_3;
	}

	@OriginalMember(owner = "client!ax", name = "at", descriptor = "(IIB)Z", line = 1039)
	public static boolean method24376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (!Class454.aBoolean773) {
			return false;
		}
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Class166_Sub1.aClass320Array1[local7] == null || Class166_Sub1.aClass320Array1[local7].aClass312Array3[local11] == null) {
			return false;
		}
		@Pc(33) Class312 local33 = Class166_Sub1.aClass320Array1[local7].aClass312Array3[local11];
		@Pc(46) Class93_Sub1_Sub7 local46;
		if (arg1 == -1 && local33.anInt3971 * -158526639 == 0) {
			for (local46 = (Class93_Sub1_Sub7) Class454.aClass22_55.method428((byte) 82); local46 != null; local46 = (Class93_Sub1_Sub7) Class454.aClass22_55.method442(129192974)) {
				if (local46.anInt3012 * -92627949 == 58 || local46.anInt3012 * -92627949 == 1007 || local46.anInt3012 * -92627949 == 25 || local46.anInt3012 * -92627949 == 57 || local46.anInt3012 * -92627949 == 30) {
					for (@Pc(147) Class312 local147 = Class659.method32808(local46.anInt3009 * -1970204471, 1113430832); local147 != null; local147 = Class431.method28780(Class166_Sub1.aClass320Array1[local147.anInt3953 * -1549590237 >> 16], local147, -1843399743)) {
						if (local33.anInt3953 * -1549590237 == local147.anInt3953 * -1549590237) {
							return true;
						}
					}
				}
			}
		} else {
			for (local46 = (Class93_Sub1_Sub7) Class454.aClass22_55.method428((byte) 73); local46 != null; local46 = (Class93_Sub1_Sub7) Class454.aClass22_55.method442(644934239)) {
				if (arg1 == local46.anInt3011 * 1966667949 && local33.anInt3953 * -1549590237 == local46.anInt3009 * -1970204471 && (local46.anInt3012 * -92627949 == 58 || local46.anInt3012 * -92627949 == 1007 || local46.anInt3012 * -92627949 == 25 || local46.anInt3012 * -92627949 == 57 || local46.anInt3012 * -92627949 == 30)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ax", name = "ew", descriptor = "(Lclient!yf;I)V", line = 5826)
	static final void method24377(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class129.method21471(local11, local14, arg0, (byte) 126);
	}

	@OriginalMember(owner = "client!ax", name = "baj", descriptor = "(Lclient!yf;I)V", line = 14233)
	static final void method24378(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
