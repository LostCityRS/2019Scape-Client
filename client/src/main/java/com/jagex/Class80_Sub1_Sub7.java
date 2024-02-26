package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!arn")
public final class Class80_Sub1_Sub7 extends Class80_Sub1 {

	@OriginalMember(owner = "client!arn", name = "j", descriptor = "[[B")
	byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!arn", name = "a", descriptor = "[Lclient!dz;")
	Class237[] aClass237Array1;

	@OriginalMember(owner = "client!arn", name = "o", descriptor = "I")
	int anInt3039;

	@OriginalMember(owner = "client!arn", name = "i", descriptor = "(Lclient!pf;Lclient!pf;I)V")
	public static void method21971(@OriginalArg(0) Class480 arg0, @OriginalArg(1) Class480 arg1, @OriginalArg(2) int arg2) {
		Class103_Sub7.aClass480_19 = arg0;
		Class337.aClass480_96 = arg1;
	}

	@OriginalMember(owner = "client!arn", name = "g", descriptor = "(Lclient!pf;Lclient!pf;I)V")
	public static void method21976(@OriginalArg(0) Class480 arg0, @OriginalArg(1) Class480 arg1, @OriginalArg(2) int arg2) {
		Class103_Sub7.aClass480_19 = arg0;
		Class337.aClass480_96 = arg1;
	}

	@OriginalMember(owner = "client!arn", name = "<init>", descriptor = "(I)V")
	public Class80_Sub1_Sub7(@OriginalArg(0) int arg0) {
		this.anInt3039 = arg0 * 1617221693;
	}

	@OriginalMember(owner = "client!arn", name = "l", descriptor = "(II)Z")
	public boolean method21964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass237Array1[arg0].aBoolean765;
	}

	@OriginalMember(owner = "client!arn", name = "p", descriptor = "(I)Z")
	public boolean method21965(@OriginalArg(0) int arg0) {
		return this.aClass237Array1[arg0].aBoolean767;
	}

	@OriginalMember(owner = "client!arn", name = "e", descriptor = "(II)Z")
	public boolean method21966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass237Array1[arg0].aBoolean766;
	}

	@OriginalMember(owner = "client!arn", name = "u", descriptor = "(II)Z")
	public boolean method21967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass237Array1[arg0].aBoolean767;
	}

	@OriginalMember(owner = "client!arn", name = "j", descriptor = "(I)Z")
	public boolean method21968(@OriginalArg(0) int arg0) {
		return this.aClass237Array1[arg0].aBoolean766;
	}

	@OriginalMember(owner = "client!arn", name = "f", descriptor = "(B)Z")
	public boolean method21969(@OriginalArg(0) byte arg0) {
		if (this.aClass237Array1 != null) {
			return true;
		}
		if (this.aByteArrayArray13 == null) {
			@Pc(10) Class480 local10 = Class103_Sub7.aClass480_19;
			synchronized (Class103_Sub7.aClass480_19) {
				if (!Class103_Sub7.aClass480_19.method29975(this.anInt3039 * -444301547, -1403081456)) {
					return false;
				}
				@Pc(31) int[] local31 = Class103_Sub7.aClass480_19.method29927(this.anInt3039 * -444301547, (byte) 1);
				this.aByteArrayArray13 = new byte[local31.length][];
				for (@Pc(38) int local38 = 0; local38 < local31.length; local38++) {
					this.aByteArrayArray13[local38] = Class103_Sub7.aClass480_19.method29918(this.anInt3039 * -444301547, local31[local38], 1896589581);
				}
			}
		}
		@Pc(68) boolean local68 = true;
		@Pc(92) int local92;
		for (@Pc(70) int local70 = 0; local70 < this.aByteArrayArray13.length; local70++) {
			@Pc(80) byte[] local80 = this.aByteArrayArray13[local70];
			@Pc(85) Class80_Sub36 local85 = new Class80_Sub36(local80);
			local85.anInt3152 = 1034180571;
			local92 = local85.method23178((byte) -63);
			@Pc(95) Class480 local95 = Class337.aClass480_96;
			synchronized (Class337.aClass480_96) {
				local68 &= Class337.aClass480_96.method29945(local92, (byte) 1);
			}
		}
		if (!local68) {
			return false;
		}
		@Pc(121) Class8 local121 = new Class8();
		@Pc(124) Class480 local124 = Class103_Sub7.aClass480_19;
		@Pc(145) int[] local145;
		synchronized (Class103_Sub7.aClass480_19) {
			local92 = Class103_Sub7.aClass480_19.method29929(this.anInt3039 * -444301547, -561697017);
			this.aClass237Array1 = new Class237[local92];
			local145 = Class103_Sub7.aClass480_19.method29927(this.anInt3039 * -444301547, (byte) 1);
		}
		for (@Pc(155) int local155 = 0; local155 < local145.length; local155++) {
			@Pc(164) byte[] local164 = this.aByteArrayArray13[local155];
			@Pc(169) Class80_Sub36 local169 = new Class80_Sub36(local164);
			local169.anInt3152 = 1034180571;
			@Pc(176) int local176 = local169.method23178((byte) -118);
			@Pc(178) Class80_Sub23 local178 = null;
			for (@Pc(183) Class80_Sub23 local183 = (Class80_Sub23) local121.method247(129206984); local183 != null; local183 = (Class80_Sub23) local121.method237(-489424900)) {
				if (local176 == local183.anInt1618 * -1003076639) {
					local178 = local183;
					break;
				}
			}
			if (local178 == null) {
				@Pc(207) Class480 local207 = Class337.aClass480_96;
				synchronized (Class337.aClass480_96) {
					local178 = new Class80_Sub23(local176, Class337.aClass480_96.method29926(local176, 1472047355));
				}
				local121.method232(local178, 1610571828);
			}
			this.aClass237Array1[local145[local155]] = new Class237(local164, local178);
		}
		this.aByteArrayArray13 = null;
		return true;
	}

	@OriginalMember(owner = "client!arn", name = "o", descriptor = "()Z")
	public boolean method21970() {
		if (this.aClass237Array1 != null) {
			return true;
		}
		if (this.aByteArrayArray13 == null) {
			@Pc(10) Class480 local10 = Class103_Sub7.aClass480_19;
			synchronized (Class103_Sub7.aClass480_19) {
				if (!Class103_Sub7.aClass480_19.method29975(this.anInt3039 * -444301547, -1403081456)) {
					return false;
				}
				@Pc(31) int[] local31 = Class103_Sub7.aClass480_19.method29927(this.anInt3039 * -444301547, (byte) 1);
				this.aByteArrayArray13 = new byte[local31.length][];
				for (@Pc(38) int local38 = 0; local38 < local31.length; local38++) {
					this.aByteArrayArray13[local38] = Class103_Sub7.aClass480_19.method29918(this.anInt3039 * -444301547, local31[local38], 1896589581);
				}
			}
		}
		@Pc(68) boolean local68 = true;
		@Pc(92) int local92;
		for (@Pc(70) int local70 = 0; local70 < this.aByteArrayArray13.length; local70++) {
			@Pc(80) byte[] local80 = this.aByteArrayArray13[local70];
			@Pc(85) Class80_Sub36 local85 = new Class80_Sub36(local80);
			local85.anInt3152 = 1034180571;
			local92 = local85.method23178((byte) -29);
			@Pc(95) Class480 local95 = Class337.aClass480_96;
			synchronized (Class337.aClass480_96) {
				local68 &= Class337.aClass480_96.method29945(local92, (byte) 1);
			}
		}
		if (!local68) {
			return false;
		}
		@Pc(121) Class8 local121 = new Class8();
		@Pc(124) Class480 local124 = Class103_Sub7.aClass480_19;
		@Pc(145) int[] local145;
		synchronized (Class103_Sub7.aClass480_19) {
			local92 = Class103_Sub7.aClass480_19.method29929(this.anInt3039 * -444301547, -561697017);
			this.aClass237Array1 = new Class237[local92];
			local145 = Class103_Sub7.aClass480_19.method29927(this.anInt3039 * -444301547, (byte) 1);
		}
		for (@Pc(155) int local155 = 0; local155 < local145.length; local155++) {
			@Pc(164) byte[] local164 = this.aByteArrayArray13[local155];
			@Pc(169) Class80_Sub36 local169 = new Class80_Sub36(local164);
			local169.anInt3152 = 1034180571;
			@Pc(176) int local176 = local169.method23178((byte) -52);
			@Pc(178) Class80_Sub23 local178 = null;
			for (@Pc(183) Class80_Sub23 local183 = (Class80_Sub23) local121.method247(129206984); local183 != null; local183 = (Class80_Sub23) local121.method237(746198787)) {
				if (local176 == local183.anInt1618 * -1003076639) {
					local178 = local183;
					break;
				}
			}
			if (local178 == null) {
				@Pc(207) Class480 local207 = Class337.aClass480_96;
				synchronized (Class337.aClass480_96) {
					local178 = new Class80_Sub23(local176, Class337.aClass480_96.method29926(local176, 1472047355));
				}
				local121.method232(local178, 1235246344);
			}
			this.aClass237Array1[local145[local155]] = new Class237(local164, local178);
		}
		this.aByteArrayArray13 = null;
		return true;
	}

	@OriginalMember(owner = "client!arn", name = "x", descriptor = "(I)Z")
	public boolean method21972(@OriginalArg(0) int arg0) {
		return this.aClass237Array1[arg0].aBoolean767;
	}

	@OriginalMember(owner = "client!arn", name = "m", descriptor = "()Z")
	public boolean method21973() {
		if (this.aClass237Array1 != null) {
			return true;
		}
		if (this.aByteArrayArray13 == null) {
			@Pc(10) Class480 local10 = Class103_Sub7.aClass480_19;
			synchronized (Class103_Sub7.aClass480_19) {
				if (!Class103_Sub7.aClass480_19.method29975(this.anInt3039 * -444301547, -1403081456)) {
					return false;
				}
				@Pc(31) int[] local31 = Class103_Sub7.aClass480_19.method29927(this.anInt3039 * -444301547, (byte) 1);
				this.aByteArrayArray13 = new byte[local31.length][];
				for (@Pc(38) int local38 = 0; local38 < local31.length; local38++) {
					this.aByteArrayArray13[local38] = Class103_Sub7.aClass480_19.method29918(this.anInt3039 * -444301547, local31[local38], 1896589581);
				}
			}
		}
		@Pc(68) boolean local68 = true;
		@Pc(92) int local92;
		for (@Pc(70) int local70 = 0; local70 < this.aByteArrayArray13.length; local70++) {
			@Pc(80) byte[] local80 = this.aByteArrayArray13[local70];
			@Pc(85) Class80_Sub36 local85 = new Class80_Sub36(local80);
			local85.anInt3152 = 1034180571;
			local92 = local85.method23178((byte) -62);
			@Pc(95) Class480 local95 = Class337.aClass480_96;
			synchronized (Class337.aClass480_96) {
				local68 &= Class337.aClass480_96.method29945(local92, (byte) 1);
			}
		}
		if (!local68) {
			return false;
		}
		@Pc(121) Class8 local121 = new Class8();
		@Pc(124) Class480 local124 = Class103_Sub7.aClass480_19;
		@Pc(145) int[] local145;
		synchronized (Class103_Sub7.aClass480_19) {
			local92 = Class103_Sub7.aClass480_19.method29929(this.anInt3039 * -444301547, -561697017);
			this.aClass237Array1 = new Class237[local92];
			local145 = Class103_Sub7.aClass480_19.method29927(this.anInt3039 * -444301547, (byte) 1);
		}
		for (@Pc(155) int local155 = 0; local155 < local145.length; local155++) {
			@Pc(164) byte[] local164 = this.aByteArrayArray13[local155];
			@Pc(169) Class80_Sub36 local169 = new Class80_Sub36(local164);
			local169.anInt3152 = 1034180571;
			@Pc(176) int local176 = local169.method23178((byte) -32);
			@Pc(178) Class80_Sub23 local178 = null;
			for (@Pc(183) Class80_Sub23 local183 = (Class80_Sub23) local121.method247(129206984); local183 != null; local183 = (Class80_Sub23) local121.method237(-1188836221)) {
				if (local176 == local183.anInt1618 * -1003076639) {
					local178 = local183;
					break;
				}
			}
			if (local178 == null) {
				@Pc(207) Class480 local207 = Class337.aClass480_96;
				synchronized (Class337.aClass480_96) {
					local178 = new Class80_Sub23(local176, Class337.aClass480_96.method29926(local176, 1472047355));
				}
				local121.method232(local178, 1567047682);
			}
			this.aClass237Array1[local145[local155]] = new Class237(local164, local178);
		}
		this.aByteArrayArray13 = null;
		return true;
	}

	@OriginalMember(owner = "client!arn", name = "a", descriptor = "(I)Z")
	public boolean method21974(@OriginalArg(0) int arg0) {
		return this.aClass237Array1[arg0].aBoolean766;
	}

	@OriginalMember(owner = "client!arn", name = "s", descriptor = "(I)Z")
	public boolean method21975(@OriginalArg(0) int arg0) {
		return this.aClass237Array1[arg0].aBoolean766;
	}

	@OriginalMember(owner = "client!arn", name = "z", descriptor = "(I)Z")
	public boolean method21977(@OriginalArg(0) int arg0) {
		return this.aClass237Array1[arg0].aBoolean767;
	}

	@OriginalMember(owner = "client!arn", name = "v", descriptor = "(I)Z")
	public boolean method21978(@OriginalArg(0) int arg0) {
		return this.aClass237Array1[arg0].aBoolean765;
	}
}
