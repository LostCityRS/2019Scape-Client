package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public abstract class Class113 {

	@OriginalMember(owner = "client!hb", name = "w", descriptor = "S")
	static short aShort23;

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "Lclient!ip;")
	static final Interface28 anInterface28_3 = new Class328();

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
	protected int anInt993 = 822875393;

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "Ljava/lang/String;")
	String aString31;

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
	int anInt992;

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "Lclient!ir;")
	Class346 aClass346_5;

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
	int anInt991;

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "Lclient!ir;")
	Class346 aClass346_6;

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "[Lclient!ht;")
	Class114[] aClass114Array3;

	@OriginalMember(owner = "client!hb", name = "abw", descriptor = "(Lclient!yp;B)V")
	static void method8378(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class134.aClass305_1.method27140(local12, 988927035).method27061((byte) -54).method37268();
	}

	@OriginalMember(owner = "client!hb", name = "act", descriptor = "(Lclient!yp;I)V")
	static void method8379(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = arg0.aClass378_3.aByte140;
	}

	@OriginalMember(owner = "client!hb", name = "aju", descriptor = "(Lclient!yp;B)V")
	static void method8380(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		Class550.method31319(arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], -1, -1, false, -716486127);
	}

	@OriginalMember(owner = "client!hb", name = "akr", descriptor = "(Lclient!yp;B)V")
	static void method8381(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(15) Class80_Sub1_Sub12 local15 = Class159.method15423(local12);
		if (local15 == null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local15.anInt3092 * -1799444681;
		}
	}

	@OriginalMember(owner = "client!hb", name = "li", descriptor = "(Lclient!hx;I)Z")
	static boolean method8382(@OriginalArg(0) Class327 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class80_Sub27 local2 = client.method25326(arg0);
		if (local2.method14315(-1032692011) > 0) {
			return true;
		} else if (local2.method14317(-1950660893)) {
			return true;
		} else {
			return arg0.aClass327_11 != null;
		}
	}

	@OriginalMember(owner = "client!hb", name = "xp", descriptor = "(Lclient!yp;I)V")
	static void method8383(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class626 local3 = new Class626();
		local3.method32509((Class80_Sub33) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997], 28118111);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local3.method32524(707544296);
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!afa;Lclient!hs;)V")
	Class113(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) Class324 arg1) {
		this.aString31 = arg1.aString180;
		this.anInt992 = arg1.aClass314Array2.length * -1538125621;
		this.aClass346_5 = new Class346(this.anInt992 * 1687803107, anInterface28_3);
		@Pc(27) int local27;
		for (local27 = 0; local27 < this.anInt992 * 1687803107; local27++) {
			this.aClass346_5.method27964(local27, arg1.aClass314Array2[local27].aString173, this.method8348(arg1.aClass314Array2[local27]), 472904725);
		}
		this.anInt991 = arg1.aClass314Array1.length * 1534344025;
		this.aClass346_6 = new Class346(this.anInt991 * 1253203177, anInterface28_3);
		for (local27 = 0; local27 < this.anInt991 * 1253203177; local27++) {
			this.aClass346_6.method27964(local27, arg1.aClass314Array1[local27].aString173, this.method8348(arg1.aClass314Array1[local27]), 472904725);
		}
		this.aClass114Array3 = new Class114[arg1.aClass315Array1.length];
		for (local27 = 0; local27 < arg1.aClass315Array1.length; local27++) {
			this.aClass114Array3[local27] = this.method8260(arg0, arg1.aClass315Array1[local27]);
		}
	}

	@OriginalMember(owner = "client!hb", name = "do", descriptor = "()V")
	void method8255() {
	}

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "()V")
	public abstract void method8256();

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "()V")
	public abstract void method8257();

	@OriginalMember(owner = "client!hb", name = "cm", descriptor = "(Lclient!aqv;ILclient!mf;)V")
	public final void method8258(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface39 arg2) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8581(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "(I)Ljava/lang/String;")
	public final String method8259(@OriginalArg(0) int arg0) {
		return this.aString31;
	}

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "(Lclient!afa;Lclient!hj;)Lclient!ht;")
	abstract Class114 method8260(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) Class315 arg1);

	@OriginalMember(owner = "client!hb", name = "y", descriptor = "(Lclient!aqv;Lclient!pm;I)V")
	public final void method8261(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) Class487 arg1, @OriginalArg(2) int arg2) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8582(arg0, arg1);
	}

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "(B)I")
	public final int method8262(@OriginalArg(0) byte arg0) {
		return this.aClass114Array3.length;
	}

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "(IB)Lclient!ht;")
	public final Class114 method8263(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return this.aClass114Array3[arg0];
	}

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "(Lclient!ht;I)I")
	public final int method8264(@OriginalArg(0) Class114 arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass114Array3.length; local1++) {
			if (arg0 == this.aClass114Array3[local1]) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hb", name = "dq", descriptor = "()V")
	void method8265() {
	}

	@OriginalMember(owner = "client!hb", name = "bn", descriptor = "()I")
	public final int method8266() {
		return this.aClass114Array3.length;
	}

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "(I)Lclient!ht;")
	public final Class114 method8267(@OriginalArg(0) int arg0) {
		return this.anInt993 * 1683166463 >= 0 ? this.aClass114Array3[this.anInt993 * 1683166463] : null;
	}

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "(Lclient!aqv;Lclient!pm;I)V")
	public final void method8268(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) Class487 arg1, @OriginalArg(2) int arg2) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8583(arg0, arg1);
	}

	@OriginalMember(owner = "client!hb", name = "ci", descriptor = "(Lclient!aqv;Lclient!pm;)V")
	public final void method8269(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) Class487 arg1) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8583(arg0, arg1);
	}

	@OriginalMember(owner = "client!hb", name = "w", descriptor = "(Lclient!aqv;FI)V")
	public final void method8270(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8578(arg0, arg1);
	}

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "(Lclient!aqv;FFI)V")
	public final void method8271(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8592(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "(Lclient!aqv;FFFI)V")
	public final void method8272(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8580(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "(Lclient!aqv;FFFFI)V")
	public final void method8273(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8611(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!hb", name = "dn", descriptor = "(ILclient!pm;)V")
	public final void method8274(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8618(arg0, arg1);
	}

	@OriginalMember(owner = "client!hb", name = "z", descriptor = "(Lclient!aqv;Lclient!ob;S)V")
	public final void method8275(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) Class456 arg1, @OriginalArg(2) short arg2) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8611(arg0, arg1.aFloat294, arg1.aFloat292, arg1.aFloat291, arg1.aFloat293);
	}

	@OriginalMember(owner = "client!hb", name = "dd", descriptor = "(ILclient!pm;)V")
	public final void method8276(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8589(arg0, arg1);
	}

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "(Lclient!aqv;II)V")
	public final void method8277(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) float local8 = (float) (arg1 >> 16 & 0xFF) / 255.0F;
		@Pc(17) float local17 = (float) (arg1 >> 8 & 0xFF) / 255.0F;
		@Pc(24) float local24 = (float) (arg1 & 0xFF) / 255.0F;
		@Pc(33) float local33 = (float) (arg1 >> 24 & 0xFF) / 255.0F;
		this.method8273(arg0, local8, local17, local24, local33, 2125336629);
	}

	@OriginalMember(owner = "client!hb", name = "dx", descriptor = "(I)Lclient!aqv;")
	public final Class80_Sub13_Sub1 method8278(@OriginalArg(0) int arg0) {
		return (Class80_Sub13_Sub1) this.aClass346_6.method27962(arg0, 1352971689);
	}

	@OriginalMember(owner = "client!hb", name = "be", descriptor = "(Lclient!ht;)Z")
	public abstract boolean method8279(@OriginalArg(0) Class114 arg0);

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(Lclient!aqv;ILclient!mf;S)V")
	public final void method8280(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface39 arg2, @OriginalArg(3) short arg3) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8581(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(IFFFI)V")
	public final void method8281(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8585(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hb", name = "ax", descriptor = "(IFFFFI)V")
	public final void method8282(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8586(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!hb", name = "ay", descriptor = "(ILclient!on;I)V")
	public final void method8283(@OriginalArg(0) int arg0, @OriginalArg(1) Class463 arg1, @OriginalArg(2) int arg2) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8585(arg0, arg1.aFloat297, arg1.aFloat295, arg1.aFloat296);
	}

	@OriginalMember(owner = "client!hb", name = "ai", descriptor = "(I[FIS)V")
	public final void method8284(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) short arg3) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8587(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hb", name = "aq", descriptor = "(ILclient!pm;I)V")
	public final void method8285(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1, @OriginalArg(2) int arg2) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8608(arg0, arg1);
	}

	@OriginalMember(owner = "client!hb", name = "ao", descriptor = "(ILclient!pm;I)V")
	public final void method8286(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1, @OriginalArg(2) int arg2) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8589(arg0, arg1);
	}

	@OriginalMember(owner = "client!hb", name = "aj", descriptor = "(ILclient!pm;I)V")
	public final void method8287(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1, @OriginalArg(2) int arg2) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8618(arg0, arg1);
	}

	@OriginalMember(owner = "client!hb", name = "bv", descriptor = "()Lclient!ht;")
	public final Class114 method8288() {
		return this.anInt993 * 1683166463 >= 0 ? this.aClass114Array3[this.anInt993 * 1683166463] : null;
	}

	@OriginalMember(owner = "client!hb", name = "bf", descriptor = "(Lclient!aqv;F)V")
	public final void method8289(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8578(arg0, arg1);
	}

	@OriginalMember(owner = "client!hb", name = "bt", descriptor = "(I)Lclient!ht;")
	public final Class114 method8290(@OriginalArg(0) int arg0) {
		return this.aClass114Array3[arg0];
	}

	@OriginalMember(owner = "client!hb", name = "al", descriptor = "(II)Lclient!aqv;")
	public final Class80_Sub13_Sub1 method8291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Class80_Sub13_Sub1) this.aClass346_6.method27962(arg0, 1352971689);
	}

	@OriginalMember(owner = "client!hb", name = "ah", descriptor = "(Ljava/lang/String;I)Lclient!aqv;")
	public final Class80_Sub13_Sub1 method8292(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return (Class80_Sub13_Sub1) this.aClass346_6.method27965(arg0, 1216441218);
	}

	@OriginalMember(owner = "client!hb", name = "du", descriptor = "(Ljava/lang/String;)Lclient!aqv;")
	public final Class80_Sub13_Sub1 method8293(@OriginalArg(0) String arg0) throws Exception_Sub5_Sub2 {
		@Pc(6) Class80_Sub13_Sub1 local6 = (Class80_Sub13_Sub1) this.aClass346_5.method27965(arg0, 1216441218);
		if (local6 == null) {
			throw new Exception_Sub5_Sub2(arg0);
		}
		return local6;
	}

	@OriginalMember(owner = "client!hb", name = "am", descriptor = "(II)Lclient!aqv;")
	public final Class80_Sub13_Sub1 method8294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Class80_Sub13_Sub1) this.aClass346_5.method27962(arg0, 1352971689);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!ht;)Z")
	public abstract boolean method8295(@OriginalArg(0) Class114 arg0);

	@OriginalMember(owner = "client!hb", name = "at", descriptor = "()V")
	public abstract void method8296();

	@OriginalMember(owner = "client!hb", name = "ad", descriptor = "()V")
	public abstract void method8297();

	@OriginalMember(owner = "client!hb", name = "av", descriptor = "()V")
	public abstract void method8298();

	@OriginalMember(owner = "client!hb", name = "an", descriptor = "()Z")
	public abstract boolean method8299();

	@OriginalMember(owner = "client!hb", name = "ac", descriptor = "(IILclient!mf;I)V")
	public final void method8300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface39 arg2, @OriginalArg(3) int arg3) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8591(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hb", name = "ap", descriptor = "()Ljava/lang/String;")
	public final String method8301() {
		return this.aString31;
	}

	@OriginalMember(owner = "client!hb", name = "ag", descriptor = "(Ljava/lang/String;I)Lclient!aqv;")
	public final Class80_Sub13_Sub1 method8302(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) throws Exception_Sub5_Sub2 {
		@Pc(6) Class80_Sub13_Sub1 local6 = (Class80_Sub13_Sub1) this.aClass346_5.method27965(arg0, 1216441218);
		if (local6 == null) {
			throw new Exception_Sub5_Sub2(arg0);
		}
		return local6;
	}

	@OriginalMember(owner = "client!hb", name = "ar", descriptor = "()Ljava/lang/String;")
	public final String method8303() {
		return this.aString31;
	}

	@OriginalMember(owner = "client!hb", name = "aa", descriptor = "()Z")
	public abstract boolean method8304();

	@OriginalMember(owner = "client!hb", name = "az", descriptor = "()Ljava/lang/String;")
	public final String method8305() {
		return this.aString31;
	}

	@OriginalMember(owner = "client!hb", name = "as", descriptor = "(Lclient!afa;Lclient!hj;)Lclient!ht;")
	abstract Class114 method8306(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) Class315 arg1);

	@OriginalMember(owner = "client!hb", name = "aw", descriptor = "(Lclient!afa;Lclient!hj;)Lclient!ht;")
	abstract Class114 method8307(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) Class315 arg1);

	@OriginalMember(owner = "client!hb", name = "bg", descriptor = "(Ljava/lang/String;)Lclient!ht;")
	public final Class114 method8308(@OriginalArg(0) String arg0) throws Exception_Sub5_Sub1 {
		@Pc(2) Class114[] local2 = this.aClass114Array3;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class114 local12 = local2[local4];
			@Pc(16) String local16 = local12.method8576((byte) -69);
			if (local16 != null && local16.equals(arg0)) {
				if (!local12.method8577()) {
					throw new Exception_Sub5_Sub1(arg0);
				}
				return local12;
			}
		}
		throw new Exception_Sub5_Sub1(arg0);
	}

	@OriginalMember(owner = "client!hb", name = "bl", descriptor = "(Ljava/lang/String;)Lclient!ht;")
	public final Class114 method8309(@OriginalArg(0) String arg0) throws Exception_Sub5_Sub1 {
		@Pc(2) Class114[] local2 = this.aClass114Array3;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class114 local12 = local2[local4];
			@Pc(16) String local16 = local12.method8576((byte) -76);
			if (local16 != null && local16.equals(arg0)) {
				if (!local12.method8577()) {
					throw new Exception_Sub5_Sub1(arg0);
				}
				return local12;
			}
		}
		throw new Exception_Sub5_Sub1(arg0);
	}

	@OriginalMember(owner = "client!hb", name = "br", descriptor = "()I")
	public final int method8310() {
		return this.aClass114Array3.length;
	}

	@OriginalMember(owner = "client!hb", name = "dv", descriptor = "()I")
	public final int method8311() {
		return this.anInt992 * 1687803107;
	}

	@OriginalMember(owner = "client!hb", name = "ba", descriptor = "(I)Lclient!ht;")
	public final Class114 method8312(@OriginalArg(0) int arg0) {
		return this.aClass114Array3[arg0];
	}

	@OriginalMember(owner = "client!hb", name = "co", descriptor = "(I[FI)V")
	public final void method8313(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8587(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hb", name = "bs", descriptor = "(I)Lclient!ht;")
	public final Class114 method8314(@OriginalArg(0) int arg0) {
		return this.aClass114Array3[arg0];
	}

	@OriginalMember(owner = "client!hb", name = "bj", descriptor = "(Lclient!ht;)I")
	public final int method8315(@OriginalArg(0) Class114 arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass114Array3.length; local1++) {
			if (arg0 == this.aClass114Array3[local1]) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hb", name = "bk", descriptor = "()Lclient!ht;")
	public final Class114 method8316() {
		@Pc(2) Class114[] local2 = this.aClass114Array3;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class114 local12 = local2[local4];
			if (local12.method8577()) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hb", name = "bz", descriptor = "()Lclient!ht;")
	public final Class114 method8317() {
		@Pc(2) Class114[] local2 = this.aClass114Array3;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class114 local12 = local2[local4];
			if (local12.method8577()) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hb", name = "bb", descriptor = "()I")
	public final int method8318() {
		return this.anInt993 * 1683166463;
	}

	@OriginalMember(owner = "client!hb", name = "bh", descriptor = "(Lclient!ht;)Z")
	public abstract boolean method8319(@OriginalArg(0) Class114 arg0);

	@OriginalMember(owner = "client!hb", name = "ck", descriptor = "(Lclient!aqv;Lclient!pm;)V")
	public final void method8320(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) Class487 arg1) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8582(arg0, arg1);
	}

	@OriginalMember(owner = "client!hb", name = "bp", descriptor = "()Lclient!ht;")
	public final Class114 method8321() {
		return this.anInt993 * 1683166463 >= 0 ? this.aClass114Array3[this.anInt993 * 1683166463] : null;
	}

	@OriginalMember(owner = "client!hb", name = "bu", descriptor = "(Lclient!aqv;FFF)V")
	public final void method8322(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8580(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hb", name = "bo", descriptor = "(Lclient!hi;)Lclient!aqv;")
	abstract Class80_Sub13_Sub1 method8323(@OriginalArg(0) Class314 arg0);

	@OriginalMember(owner = "client!hb", name = "bc", descriptor = "(Lclient!aqv;F)V")
	public final void method8324(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8578(arg0, arg1);
	}

	@OriginalMember(owner = "client!hb", name = "ak", descriptor = "()V")
	void method8325() {
	}

	@OriginalMember(owner = "client!hb", name = "bw", descriptor = "(Lclient!aqv;F)V")
	public final void method8326(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8578(arg0, arg1);
	}

	@OriginalMember(owner = "client!hb", name = "bx", descriptor = "(Lclient!aqv;FF)V")
	public final void method8327(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8592(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hb", name = "bi", descriptor = "(Lclient!aqv;FFF)V")
	public final void method8328(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8580(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hb", name = "de", descriptor = "(Ljava/lang/String;)Lclient!aqv;")
	public final Class80_Sub13_Sub1 method8329(@OriginalArg(0) String arg0) {
		return (Class80_Sub13_Sub1) this.aClass346_6.method27965(arg0, 1216441218);
	}

	@OriginalMember(owner = "client!hb", name = "bm", descriptor = "(Lclient!aqv;FFFF)V")
	public final void method8330(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8611(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!hb", name = "df", descriptor = "(IILclient!mf;)V")
	public final void method8331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface39 arg2) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8591(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hb", name = "bd", descriptor = "(Lclient!aqv;FFFF)V")
	public final void method8332(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8611(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!hb", name = "cd", descriptor = "(Lclient!aqv;Lclient!on;)V")
	public final void method8333(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) Class463 arg1) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8580(arg0, arg1.aFloat297, arg1.aFloat295, arg1.aFloat296);
	}

	@OriginalMember(owner = "client!hb", name = "cf", descriptor = "(I[FI)V")
	public final void method8334(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8587(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hb", name = "ct", descriptor = "(Lclient!aqv;Lclient!ob;)V")
	public final void method8335(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) Class456 arg1) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8611(arg0, arg1.aFloat294, arg1.aFloat292, arg1.aFloat291, arg1.aFloat293);
	}

	@OriginalMember(owner = "client!hb", name = "cn", descriptor = "(Lclient!aqv;Lclient!ob;)V")
	public final void method8336(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) Class456 arg1) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8611(arg0, arg1.aFloat294, arg1.aFloat292, arg1.aFloat291, arg1.aFloat293);
	}

	@OriginalMember(owner = "client!hb", name = "cy", descriptor = "(Lclient!aqv;[F)V")
	public final void method8337(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float[] arg1) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8604(arg0, arg1, arg1.length);
	}

	@OriginalMember(owner = "client!hb", name = "ca", descriptor = "(Lclient!aqv;Lclient!pm;)V")
	public final void method8338(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) Class487 arg1) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8582(arg0, arg1);
	}

	@OriginalMember(owner = "client!hb", name = "cc", descriptor = "(Lclient!aqv;[F)V")
	public final void method8339(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float[] arg1) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8604(arg0, arg1, arg1.length);
	}

	@OriginalMember(owner = "client!hb", name = "cu", descriptor = "(Lclient!aqv;I)V")
	public final void method8340(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float local8 = (float) (arg1 >> 16 & 0xFF) / 255.0F;
		@Pc(17) float local17 = (float) (arg1 >> 8 & 0xFF) / 255.0F;
		@Pc(24) float local24 = (float) (arg1 & 0xFF) / 255.0F;
		@Pc(33) float local33 = (float) (arg1 >> 24 & 0xFF) / 255.0F;
		this.method8273(arg0, local8, local17, local24, local33, 359058308);
	}

	@OriginalMember(owner = "client!hb", name = "ce", descriptor = "(Lclient!aqv;I)V")
	public final void method8341(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float local8 = (float) (arg1 >> 16 & 0xFF) / 255.0F;
		@Pc(17) float local17 = (float) (arg1 >> 8 & 0xFF) / 255.0F;
		@Pc(24) float local24 = (float) (arg1 & 0xFF) / 255.0F;
		@Pc(33) float local33 = (float) (arg1 >> 24 & 0xFF) / 255.0F;
		this.method8273(arg0, local8, local17, local24, local33, -426902681);
	}

	@OriginalMember(owner = "client!hb", name = "cs", descriptor = "(Lclient!aqv;I)V")
	public final void method8342(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float local8 = (float) (arg1 >> 16 & 0xFF) / 255.0F;
		@Pc(17) float local17 = (float) (arg1 >> 8 & 0xFF) / 255.0F;
		@Pc(24) float local24 = (float) (arg1 & 0xFF) / 255.0F;
		@Pc(33) float local33 = (float) (arg1 >> 24 & 0xFF) / 255.0F;
		this.method8273(arg0, local8, local17, local24, local33, -461410047);
	}

	@OriginalMember(owner = "client!hb", name = "cj", descriptor = "(Lclient!aqv;Lclient!pm;)V")
	public final void method8343(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) Class487 arg1) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8582(arg0, arg1);
	}

	@OriginalMember(owner = "client!hb", name = "af", descriptor = "(B)I")
	public final int method8344(@OriginalArg(0) byte arg0) {
		return this.anInt992 * 1687803107;
	}

	@OriginalMember(owner = "client!hb", name = "cp", descriptor = "(Lclient!aqv;ILclient!mf;)V")
	public final void method8345(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface39 arg2) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8581(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hb", name = "cr", descriptor = "(Lclient!aqv;Lclient!pm;)V")
	public final void method8346(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) Class487 arg1) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8582(arg0, arg1);
	}

	@OriginalMember(owner = "client!hb", name = "cz", descriptor = "(I[FI)V")
	public final void method8347(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8587(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hb", name = "x", descriptor = "(Lclient!hi;)Lclient!aqv;")
	abstract Class80_Sub13_Sub1 method8348(@OriginalArg(0) Class314 arg0);

	@OriginalMember(owner = "client!hb", name = "cv", descriptor = "(Lclient!aqv;Lclient!on;)V")
	public final void method8349(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) Class463 arg1) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8580(arg0, arg1.aFloat297, arg1.aFloat295, arg1.aFloat296);
	}

	@OriginalMember(owner = "client!hb", name = "cg", descriptor = "(IFFF)V")
	public final void method8350(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8585(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hb", name = "cb", descriptor = "(IFFFF)V")
	public final void method8351(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8586(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!hb", name = "cw", descriptor = "(IFFFF)V")
	public final void method8352(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8586(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "(Lclient!aqv;[FI)V")
	public final void method8353(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8604(arg0, arg1, arg1.length);
	}

	@OriginalMember(owner = "client!hb", name = "cx", descriptor = "(ILclient!on;)V")
	public final void method8354(@OriginalArg(0) int arg0, @OriginalArg(1) Class463 arg1) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8585(arg0, arg1.aFloat297, arg1.aFloat295, arg1.aFloat296);
	}

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "(B)I")
	public final int method8355(@OriginalArg(0) byte arg0) {
		return this.anInt993 * 1683166463;
	}

	@OriginalMember(owner = "client!hb", name = "bq", descriptor = "(Lclient!aqv;FFFF)V")
	public final void method8356(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8611(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "()Z")
	public abstract boolean method8357();

	@OriginalMember(owner = "client!hb", name = "cq", descriptor = "(ILclient!pm;)V")
	public final void method8358(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8608(arg0, arg1);
	}

	@OriginalMember(owner = "client!hb", name = "dg", descriptor = "(ILclient!pm;)V")
	public final void method8359(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8608(arg0, arg1);
	}

	@OriginalMember(owner = "client!hb", name = "dh", descriptor = "(ILclient!pm;)V")
	public final void method8360(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8589(arg0, arg1);
	}

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "(I)Lclient!ht;")
	public final Class114 method8361(@OriginalArg(0) int arg0) {
		@Pc(2) Class114[] local2 = this.aClass114Array3;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class114 local12 = local2[local4];
			if (local12.method8577()) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hb", name = "dc", descriptor = "(ILclient!pm;)V")
	public final void method8362(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8589(arg0, arg1);
	}

	@OriginalMember(owner = "client!hb", name = "cl", descriptor = "(IFFFF)V")
	public final void method8363(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8586(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!hb", name = "ab", descriptor = "(I)I")
	public final int method8364(@OriginalArg(0) int arg0) {
		return this.anInt991 * 1253203177;
	}

	@OriginalMember(owner = "client!hb", name = "dl", descriptor = "(IILclient!mf;)V")
	public final void method8365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface39 arg2) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8591(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hb", name = "db", descriptor = "(Ljava/lang/String;)Lclient!aqv;")
	public final Class80_Sub13_Sub1 method8366(@OriginalArg(0) String arg0) throws Exception_Sub5_Sub2 {
		@Pc(6) Class80_Sub13_Sub1 local6 = (Class80_Sub13_Sub1) this.aClass346_5.method27965(arg0, 1216441218);
		if (local6 == null) {
			throw new Exception_Sub5_Sub2(arg0);
		}
		return local6;
	}

	@OriginalMember(owner = "client!hb", name = "dt", descriptor = "(Ljava/lang/String;)Lclient!aqv;")
	public final Class80_Sub13_Sub1 method8367(@OriginalArg(0) String arg0) throws Exception_Sub5_Sub2 {
		@Pc(6) Class80_Sub13_Sub1 local6 = (Class80_Sub13_Sub1) this.aClass346_5.method27965(arg0, 1216441218);
		if (local6 == null) {
			throw new Exception_Sub5_Sub2(arg0);
		}
		return local6;
	}

	@OriginalMember(owner = "client!hb", name = "ch", descriptor = "(Lclient!aqv;[F)V")
	public final void method8368(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float[] arg1) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8604(arg0, arg1, arg1.length);
	}

	@OriginalMember(owner = "client!hb", name = "ds", descriptor = "()I")
	public final int method8369() {
		return this.anInt991 * 1253203177;
	}

	@OriginalMember(owner = "client!hb", name = "dw", descriptor = "()I")
	public final int method8370() {
		return this.anInt991 * 1253203177;
	}

	@OriginalMember(owner = "client!hb", name = "dr", descriptor = "()I")
	public final int method8371() {
		return this.anInt991 * 1253203177;
	}

	@OriginalMember(owner = "client!hb", name = "ae", descriptor = "()Z")
	public abstract boolean method8372();

	@OriginalMember(owner = "client!hb", name = "by", descriptor = "(Lclient!ht;)I")
	public final int method8373(@OriginalArg(0) Class114 arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass114Array3.length; local1++) {
			if (arg0 == this.aClass114Array3[local1]) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hb", name = "au", descriptor = "()Ljava/lang/String;")
	public final String method8374() {
		return this.aString31;
	}

	@OriginalMember(owner = "client!hb", name = "dm", descriptor = "(I)Lclient!aqv;")
	public final Class80_Sub13_Sub1 method8375(@OriginalArg(0) int arg0) {
		return (Class80_Sub13_Sub1) this.aClass346_5.method27962(arg0, 1352971689);
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(Lclient!aqv;Lclient!on;I)V")
	public final void method8376(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) Class463 arg1, @OriginalArg(2) int arg2) {
		this.aClass114Array3[this.anInt993 * 1683166463].method8580(arg0, arg1.aFloat297, arg1.aFloat295, arg1.aFloat296);
	}

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "(Ljava/lang/String;B)Lclient!ht;")
	public final Class114 method8377(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) throws Exception_Sub5_Sub1 {
		@Pc(2) Class114[] local2 = this.aClass114Array3;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class114 local12 = local2[local4];
			@Pc(16) String local16 = local12.method8576((byte) -33);
			if (local16 != null && local16.equals(arg0)) {
				if (!local12.method8577()) {
					throw new Exception_Sub5_Sub1(arg0);
				}
				return local12;
			}
		}
		throw new Exception_Sub5_Sub1(arg0);
	}
}
