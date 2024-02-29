package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wz")
public class Class652 {

	@OriginalMember(owner = "client!wz", name = "k", descriptor = "Lclient!aap;")
	Class18 aClass18_18 = new Class18();

	@OriginalMember(owner = "client!wz", name = "e", descriptor = "I")
	int anInt5804;

	@OriginalMember(owner = "client!wz", name = "n", descriptor = "I")
	int anInt5803;

	@OriginalMember(owner = "client!wz", name = "m", descriptor = "Lclient!aan;")
	Class16 aClass16_37;

	@OriginalMember(owner = "client!wz", name = "<init>", descriptor = "(I)V", line = 12)
	public Class652(@OriginalArg(0) int arg0) {
		this.anInt5804 = arg0;
		this.anInt5803 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass16_37 = new Class16(local14);
	}

	@OriginalMember(owner = "client!wz", name = "e", descriptor = "(Lclient!wk;)Ljava/lang/Object;", line = 21)
	public final Object method32675(@OriginalArg(0) Interface69 arg0) {
		@Pc(2) long local2 = arg0.method811();
		for (@Pc(8) Class93_Sub1_Sub19 local8 = (Class93_Sub1_Sub19) this.aClass16_37.method214(local2); local8 != null; local8 = (Class93_Sub1_Sub19) this.aClass16_37.method216(-1796956099)) {
			if (local8.anInterface69_3.method808(arg0)) {
				@Pc(19) Object local19 = local8.method23962();
				if (local19 != null) {
					if (local8.method23963()) {
						@Pc(46) Class93_Sub1_Sub19_Sub1 local46 = new Class93_Sub1_Sub19_Sub1(arg0, local19, local8.anInt3270);
						this.aClass16_37.method220(local46, local8.aLong232 * -3750704643647536275L);
						this.aClass18_18.method250(local46, 1896315126);
						local46.aLong233 = 0L;
						local8.method23969(767664854);
						local8.method23976((short) -21649);
					} else {
						this.aClass18_18.method250(local8, 580727473);
						local8.aLong233 = 0L;
					}
					return local19;
				}
				local8.method23969(429577447);
				local8.method23976((short) -14895);
				this.anInt5803 += local8.anInt3270;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wz", name = "z", descriptor = "(Lclient!wk;)Ljava/lang/Object;", line = 21)
	public final Object method32676(@OriginalArg(0) Interface69 arg0) {
		@Pc(2) long local2 = arg0.method811();
		for (@Pc(8) Class93_Sub1_Sub19 local8 = (Class93_Sub1_Sub19) this.aClass16_37.method214(local2); local8 != null; local8 = (Class93_Sub1_Sub19) this.aClass16_37.method216(-1796956099)) {
			if (local8.anInterface69_3.method808(arg0)) {
				@Pc(19) Object local19 = local8.method23962();
				if (local19 != null) {
					if (local8.method23963()) {
						@Pc(46) Class93_Sub1_Sub19_Sub1 local46 = new Class93_Sub1_Sub19_Sub1(arg0, local19, local8.anInt3270);
						this.aClass16_37.method220(local46, local8.aLong232 * -3750704643647536275L);
						this.aClass18_18.method250(local46, 1365088768);
						local46.aLong233 = 0L;
						local8.method23969(1386550028);
						local8.method23976((short) 1110);
					} else {
						this.aClass18_18.method250(local8, 1612342569);
						local8.aLong233 = 0L;
					}
					return local19;
				}
				local8.method23969(578999784);
				local8.method23976((short) 17182);
				this.anInt5803 += local8.anInt3270;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wz", name = "n", descriptor = "(Lclient!wk;)V", line = 49)
	final void method32677(@OriginalArg(0) Interface69 arg0) {
		@Pc(2) long local2 = arg0.method811();
		for (@Pc(8) Class93_Sub1_Sub19 local8 = (Class93_Sub1_Sub19) this.aClass16_37.method214(local2); local8 != null; local8 = (Class93_Sub1_Sub19) this.aClass16_37.method216(-1796956099)) {
			if (local8.anInterface69_3.method808(arg0)) {
				this.method32680(local8);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!wz", name = "p", descriptor = "(Lclient!wk;)V", line = 49)
	final void method32678(@OriginalArg(0) Interface69 arg0) {
		@Pc(2) long local2 = arg0.method811();
		for (@Pc(8) Class93_Sub1_Sub19 local8 = (Class93_Sub1_Sub19) this.aClass16_37.method214(local2); local8 != null; local8 = (Class93_Sub1_Sub19) this.aClass16_37.method216(-1796956099)) {
			if (local8.anInterface69_3.method808(arg0)) {
				this.method32680(local8);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!wz", name = "d", descriptor = "(Lclient!wk;)V", line = 49)
	final void method32679(@OriginalArg(0) Interface69 arg0) {
		@Pc(2) long local2 = arg0.method811();
		for (@Pc(8) Class93_Sub1_Sub19 local8 = (Class93_Sub1_Sub19) this.aClass16_37.method214(local2); local8 != null; local8 = (Class93_Sub1_Sub19) this.aClass16_37.method216(-1796956099)) {
			if (local8.anInterface69_3.method808(arg0)) {
				this.method32680(local8);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!wz", name = "m", descriptor = "(Lclient!asr;)V", line = 58)
	final void method32680(@OriginalArg(0) Class93_Sub1_Sub19 arg0) {
		if (arg0 != null) {
			arg0.method23969(1127486667);
			arg0.method23976((short) -13004);
			this.anInt5803 += arg0.anInt3270;
		}
	}

	@OriginalMember(owner = "client!wz", name = "c", descriptor = "(Lclient!asr;)V", line = 58)
	final void method32681(@OriginalArg(0) Class93_Sub1_Sub19 arg0) {
		if (arg0 != null) {
			arg0.method23969(-287288427);
			arg0.method23976((short) 10828);
			this.anInt5803 += arg0.anInt3270;
		}
	}

	@OriginalMember(owner = "client!wz", name = "r", descriptor = "(Lclient!asr;)V", line = 58)
	final void method32682(@OriginalArg(0) Class93_Sub1_Sub19 arg0) {
		if (arg0 != null) {
			arg0.method23969(637131924);
			arg0.method23976((short) 25680);
			this.anInt5803 += arg0.anInt3270;
		}
	}

	@OriginalMember(owner = "client!wz", name = "k", descriptor = "(Ljava/lang/Object;Lclient!wk;)V", line = 66)
	public final void method32683(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface69 arg1) {
		this.method32686(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!wz", name = "v", descriptor = "(Ljava/lang/Object;Lclient!wk;)V", line = 66)
	public final void method32684(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface69 arg1) {
		this.method32686(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!wz", name = "o", descriptor = "(Ljava/lang/Object;Lclient!wk;)V", line = 66)
	public final void method32685(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface69 arg1) {
		this.method32686(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!wz", name = "f", descriptor = "(Ljava/lang/Object;Lclient!wk;I)V", line = 70)
	final void method32686(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface69 arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt5804) {
			throw new IllegalStateException();
		}
		this.method32677(arg1);
		this.anInt5803 -= arg2;
		while (this.anInt5803 < 0) {
			@Pc(25) Class93_Sub1_Sub19 local25 = (Class93_Sub1_Sub19) this.aClass18_18.method254((byte) 8);
			this.method32680(local25);
		}
		@Pc(36) Class93_Sub1_Sub19_Sub1 local36 = new Class93_Sub1_Sub19_Sub1(arg1, arg0, arg2);
		this.aClass16_37.method220(local36, arg1.method811());
		this.aClass18_18.method250(local36, 553911009);
		local36.aLong233 = 0L;
	}

	@OriginalMember(owner = "client!wz", name = "q", descriptor = "(Ljava/lang/Object;Lclient!wk;I)V", line = 70)
	final void method32687(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface69 arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt5804) {
			throw new IllegalStateException();
		}
		this.method32677(arg1);
		this.anInt5803 -= arg2;
		while (this.anInt5803 < 0) {
			@Pc(25) Class93_Sub1_Sub19 local25 = (Class93_Sub1_Sub19) this.aClass18_18.method254((byte) 8);
			this.method32680(local25);
		}
		@Pc(36) Class93_Sub1_Sub19_Sub1 local36 = new Class93_Sub1_Sub19_Sub1(arg1, arg0, arg2);
		this.aClass16_37.method220(local36, arg1.method811());
		this.aClass18_18.method250(local36, 1610102872);
		local36.aLong233 = 0L;
	}

	@OriginalMember(owner = "client!wz", name = "s", descriptor = "(Ljava/lang/Object;Lclient!wk;I)V", line = 70)
	final void method32688(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface69 arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt5804) {
			throw new IllegalStateException();
		}
		this.method32677(arg1);
		this.anInt5803 -= arg2;
		while (this.anInt5803 < 0) {
			@Pc(25) Class93_Sub1_Sub19 local25 = (Class93_Sub1_Sub19) this.aClass18_18.method254((byte) 8);
			this.method32680(local25);
		}
		@Pc(36) Class93_Sub1_Sub19_Sub1 local36 = new Class93_Sub1_Sub19_Sub1(arg1, arg0, arg2);
		this.aClass16_37.method220(local36, arg1.method811());
		this.aClass18_18.method250(local36, 1661702906);
		local36.aLong233 = 0L;
	}

	@OriginalMember(owner = "client!wz", name = "y", descriptor = "(Ljava/lang/Object;Lclient!wk;I)V", line = 70)
	final void method32689(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface69 arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt5804) {
			throw new IllegalStateException();
		}
		this.method32677(arg1);
		this.anInt5803 -= arg2;
		while (this.anInt5803 < 0) {
			@Pc(25) Class93_Sub1_Sub19 local25 = (Class93_Sub1_Sub19) this.aClass18_18.method254((byte) 8);
			this.method32680(local25);
		}
		@Pc(36) Class93_Sub1_Sub19_Sub1 local36 = new Class93_Sub1_Sub19_Sub1(arg1, arg0, arg2);
		this.aClass16_37.method220(local36, arg1.method811());
		this.aClass18_18.method250(local36, 1304489704);
		local36.aLong233 = 0L;
	}

	@OriginalMember(owner = "client!wz", name = "x", descriptor = "(I)V", line = 84)
	public final void method32690(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class93_Sub1_Sub19 local5 = (Class93_Sub1_Sub19) this.aClass18_18.method256(293564399); local5 != null; local5 = (Class93_Sub1_Sub19) this.aClass18_18.method264(-34863491)) {
			if (local5.method23963()) {
				if (local5.method23962() == null) {
					local5.method23969(-523605303);
					local5.method23976((short) -6365);
					this.anInt5803 += local5.anInt3270;
				}
			} else if ((local5.aLong233 += -5463674641158180937L) * -5980455722457358841L > (long) arg0) {
				@Pc(50) Class93_Sub1_Sub19_Sub2 local50 = new Class93_Sub1_Sub19_Sub2(local5.anInterface69_3, local5.method23962(), local5.anInt3270);
				this.aClass16_37.method220(local50, local5.aLong232 * -3750704643647536275L);
				Class658.method32758(local50, local5, 1927313240);
				local5.method23969(-1660833744);
				local5.method23976((short) 6139);
			}
		}
	}

	@OriginalMember(owner = "client!wz", name = "w", descriptor = "(I)V", line = 84)
	public final void method32691(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class93_Sub1_Sub19 local5 = (Class93_Sub1_Sub19) this.aClass18_18.method256(541572270); local5 != null; local5 = (Class93_Sub1_Sub19) this.aClass18_18.method264(451737365)) {
			if (local5.method23963()) {
				if (local5.method23962() == null) {
					local5.method23969(1315474849);
					local5.method23976((short) -11575);
					this.anInt5803 += local5.anInt3270;
				}
			} else if ((local5.aLong233 += -5463674641158180937L) * -5980455722457358841L > (long) arg0) {
				@Pc(50) Class93_Sub1_Sub19_Sub2 local50 = new Class93_Sub1_Sub19_Sub2(local5.anInterface69_3, local5.method23962(), local5.anInt3270);
				this.aClass16_37.method220(local50, local5.aLong232 * -3750704643647536275L);
				Class658.method32758(local50, local5, 2076989856);
				local5.method23969(-1067266761);
				local5.method23976((short) -16239);
			}
		}
	}

	@OriginalMember(owner = "client!wz", name = "l", descriptor = "()V", line = 106)
	public final void method32692() {
		this.aClass18_18.method244(761964362);
		this.aClass16_37.method225((byte) 97);
		this.anInt5803 = this.anInt5804;
	}

	@OriginalMember(owner = "client!wz", name = "h", descriptor = "()V", line = 106)
	public final void method32693() {
		this.aClass18_18.method244(-137056348);
		this.aClass16_37.method225((byte) 99);
		this.anInt5803 = this.anInt5804;
	}

	@OriginalMember(owner = "client!wz", name = "b", descriptor = "()V", line = 106)
	public final void method32694() {
		this.aClass18_18.method244(-1857141166);
		this.aClass16_37.method225((byte) 79);
		this.anInt5803 = this.anInt5804;
	}

	@OriginalMember(owner = "client!wz", name = "a", descriptor = "()V", line = 106)
	public final void method32695() {
		this.aClass18_18.method244(-2136611733);
		this.aClass16_37.method225((byte) 64);
		this.anInt5803 = this.anInt5804;
	}

	@OriginalMember(owner = "client!wz", name = "g", descriptor = "()V", line = 112)
	public final void method32696() {
		for (@Pc(5) Class93_Sub1_Sub19 local5 = (Class93_Sub1_Sub19) this.aClass18_18.method256(13848274); local5 != null; local5 = (Class93_Sub1_Sub19) this.aClass18_18.method264(-2125485082)) {
			if (local5.method23963()) {
				local5.method23969(-1460908123);
				local5.method23976((short) -15495);
				this.anInt5803 += local5.anInt3270;
			}
		}
	}

	@OriginalMember(owner = "client!wz", name = "u", descriptor = "()V", line = 112)
	public final void method32697() {
		for (@Pc(5) Class93_Sub1_Sub19 local5 = (Class93_Sub1_Sub19) this.aClass18_18.method256(-1188585241); local5 != null; local5 = (Class93_Sub1_Sub19) this.aClass18_18.method264(2028125155)) {
			if (local5.method23963()) {
				local5.method23969(-1152248787);
				local5.method23976((short) 4008);
				this.anInt5803 += local5.anInt3270;
			}
		}
	}

	@OriginalMember(owner = "client!wz", name = "i", descriptor = "()V", line = 112)
	public final void method32698() {
		for (@Pc(5) Class93_Sub1_Sub19 local5 = (Class93_Sub1_Sub19) this.aClass18_18.method256(910409304); local5 != null; local5 = (Class93_Sub1_Sub19) this.aClass18_18.method264(1887296363)) {
			if (local5.method23963()) {
				local5.method23969(-1716758863);
				local5.method23976((short) -20398);
				this.anInt5803 += local5.anInt3270;
			}
		}
	}

	@OriginalMember(owner = "client!wz", name = "j", descriptor = "()V", line = 112)
	public final void method32699() {
		for (@Pc(5) Class93_Sub1_Sub19 local5 = (Class93_Sub1_Sub19) this.aClass18_18.method256(-385478401); local5 != null; local5 = (Class93_Sub1_Sub19) this.aClass18_18.method264(-474891994)) {
			if (local5.method23963()) {
				local5.method23969(383091387);
				local5.method23976((short) 6913);
				this.anInt5803 += local5.anInt3270;
			}
		}
	}

	@OriginalMember(owner = "client!wz", name = "t", descriptor = "()V", line = 112)
	public final void method32700() {
		for (@Pc(5) Class93_Sub1_Sub19 local5 = (Class93_Sub1_Sub19) this.aClass18_18.method256(-2003249610); local5 != null; local5 = (Class93_Sub1_Sub19) this.aClass18_18.method264(2146626397)) {
			if (local5.method23963()) {
				local5.method23969(-513199203);
				local5.method23976((short) -1074);
				this.anInt5803 += local5.anInt3270;
			}
		}
	}
}
