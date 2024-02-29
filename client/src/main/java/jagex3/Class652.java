package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wz")
public final class Class652 {

	@OriginalMember(owner = "client!wz", name = "k", descriptor = "Lclient!aap;")
	Class18 aClass18_18 = new Class18();

	@OriginalMember(owner = "client!wz", name = "e", descriptor = "I")
	int anInt5965;

	@OriginalMember(owner = "client!wz", name = "n", descriptor = "I")
	int anInt5964;

	@OriginalMember(owner = "client!wz", name = "m", descriptor = "Lclient!aan;")
	Class16 aClass16_37;

	@OriginalMember(owner = "client!wz", name = "<init>", descriptor = "(I)V")
	public Class652(@OriginalArg(0) int arg0) {
		this.anInt5965 = arg0;
		this.anInt5964 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass16_37 = new Class16(local14);
	}

	@OriginalMember(owner = "client!wz", name = "x", descriptor = "(I)V")
	public void method32856(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class93_Sub1_Sub19 local5 = (Class93_Sub1_Sub19) this.aClass18_18.method246(293564399); local5 != null; local5 = (Class93_Sub1_Sub19) this.aClass18_18.method253(-34863491)) {
			if (local5.method23975()) {
				if (local5.method23974() == null) {
					local5.method23981(-523605303);
					local5.method23988((short) -6365);
					this.anInt5964 += local5.anInt3270;
				}
			} else if ((local5.aLong233 += -5463674641158180937L) * -5980455722457358841L > (long) arg0) {
				@Pc(50) Class93_Sub1_Sub19_Sub2 local50 = new Class93_Sub1_Sub19_Sub2(local5.anInterface69_3, local5.method23974(), local5.anInt3270);
				this.aClass16_37.method221(local50, local5.aLong232 * -3750704643647536275L);
				Class658.method32971(local50, local5, 1927313240);
				local5.method23981(-1660833744);
				local5.method23988((short) 6139);
			}
		}
	}

	@OriginalMember(owner = "client!wz", name = "e", descriptor = "(Lclient!wk;)Ljava/lang/Object;")
	public Object method32857(@OriginalArg(0) Interface69 arg0) {
		@Pc(2) long local2 = arg0.method811();
		for (@Pc(8) Class93_Sub1_Sub19 local8 = (Class93_Sub1_Sub19) this.aClass16_37.method215(local2); local8 != null; local8 = (Class93_Sub1_Sub19) this.aClass16_37.method216(-1796956099)) {
			if (local8.anInterface69_3.method808(arg0)) {
				@Pc(19) Object local19 = local8.method23974();
				if (local19 != null) {
					if (local8.method23975()) {
						@Pc(46) Class93_Sub1_Sub19_Sub1 local46 = new Class93_Sub1_Sub19_Sub1(arg0, local19, local8.anInt3270);
						this.aClass16_37.method221(local46, local8.aLong232 * -3750704643647536275L);
						this.aClass18_18.method268(local46, 1896315126);
						local46.aLong233 = 0L;
						local8.method23981(767664854);
						local8.method23988((short) -21649);
					} else {
						this.aClass18_18.method268(local8, 580727473);
						local8.aLong233 = 0L;
					}
					return local19;
				}
				local8.method23981(429577447);
				local8.method23988((short) -14895);
				this.anInt5964 += local8.anInt3270;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wz", name = "z", descriptor = "(Lclient!wk;)Ljava/lang/Object;")
	public Object method32858(@OriginalArg(0) Interface69 arg0) {
		@Pc(2) long local2 = arg0.method811();
		for (@Pc(8) Class93_Sub1_Sub19 local8 = (Class93_Sub1_Sub19) this.aClass16_37.method215(local2); local8 != null; local8 = (Class93_Sub1_Sub19) this.aClass16_37.method216(-1796956099)) {
			if (local8.anInterface69_3.method808(arg0)) {
				@Pc(19) Object local19 = local8.method23974();
				if (local19 != null) {
					if (local8.method23975()) {
						@Pc(46) Class93_Sub1_Sub19_Sub1 local46 = new Class93_Sub1_Sub19_Sub1(arg0, local19, local8.anInt3270);
						this.aClass16_37.method221(local46, local8.aLong232 * -3750704643647536275L);
						this.aClass18_18.method268(local46, 1365088768);
						local46.aLong233 = 0L;
						local8.method23981(1386550028);
						local8.method23988((short) 1110);
					} else {
						this.aClass18_18.method268(local8, 1612342569);
						local8.aLong233 = 0L;
					}
					return local19;
				}
				local8.method23981(578999784);
				local8.method23988((short) 17182);
				this.anInt5964 += local8.anInt3270;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wz", name = "m", descriptor = "(Lclient!asr;)V")
	void method32859(@OriginalArg(0) Class93_Sub1_Sub19 arg0) {
		if (arg0 != null) {
			arg0.method23981(1127486667);
			arg0.method23988((short) -13004);
			this.anInt5964 += arg0.anInt3270;
		}
	}

	@OriginalMember(owner = "client!wz", name = "g", descriptor = "()V")
	public void method32860() {
		for (@Pc(5) Class93_Sub1_Sub19 local5 = (Class93_Sub1_Sub19) this.aClass18_18.method246(13848274); local5 != null; local5 = (Class93_Sub1_Sub19) this.aClass18_18.method253(-2125485082)) {
			if (local5.method23975()) {
				local5.method23981(-1460908123);
				local5.method23988((short) -15495);
				this.anInt5964 += local5.anInt3270;
			}
		}
	}

	@OriginalMember(owner = "client!wz", name = "n", descriptor = "(Lclient!wk;)V")
	void method32861(@OriginalArg(0) Interface69 arg0) {
		@Pc(2) long local2 = arg0.method811();
		for (@Pc(8) Class93_Sub1_Sub19 local8 = (Class93_Sub1_Sub19) this.aClass16_37.method215(local2); local8 != null; local8 = (Class93_Sub1_Sub19) this.aClass16_37.method216(-1796956099)) {
			if (local8.anInterface69_3.method808(arg0)) {
				this.method32859(local8);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!wz", name = "w", descriptor = "(I)V")
	public void method32862(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class93_Sub1_Sub19 local5 = (Class93_Sub1_Sub19) this.aClass18_18.method246(541572270); local5 != null; local5 = (Class93_Sub1_Sub19) this.aClass18_18.method253(451737365)) {
			if (local5.method23975()) {
				if (local5.method23974() == null) {
					local5.method23981(1315474849);
					local5.method23988((short) -11575);
					this.anInt5964 += local5.anInt3270;
				}
			} else if ((local5.aLong233 += -5463674641158180937L) * -5980455722457358841L > (long) arg0) {
				@Pc(50) Class93_Sub1_Sub19_Sub2 local50 = new Class93_Sub1_Sub19_Sub2(local5.anInterface69_3, local5.method23974(), local5.anInt3270);
				this.aClass16_37.method221(local50, local5.aLong232 * -3750704643647536275L);
				Class658.method32971(local50, local5, 2076989856);
				local5.method23981(-1067266761);
				local5.method23988((short) -16239);
			}
		}
	}

	@OriginalMember(owner = "client!wz", name = "l", descriptor = "()V")
	public void method32863() {
		this.aClass18_18.method245(761964362);
		this.aClass16_37.method219((byte) 97);
		this.anInt5964 = this.anInt5965;
	}

	@OriginalMember(owner = "client!wz", name = "u", descriptor = "()V")
	public void method32864() {
		for (@Pc(5) Class93_Sub1_Sub19 local5 = (Class93_Sub1_Sub19) this.aClass18_18.method246(-1188585241); local5 != null; local5 = (Class93_Sub1_Sub19) this.aClass18_18.method253(2028125155)) {
			if (local5.method23975()) {
				local5.method23981(-1152248787);
				local5.method23988((short) 4008);
				this.anInt5964 += local5.anInt3270;
			}
		}
	}

	@OriginalMember(owner = "client!wz", name = "k", descriptor = "(Ljava/lang/Object;Lclient!wk;)V")
	public void method32865(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface69 arg1) {
		this.method32867(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!wz", name = "p", descriptor = "(Lclient!wk;)V")
	void method32866(@OriginalArg(0) Interface69 arg0) {
		@Pc(2) long local2 = arg0.method811();
		for (@Pc(8) Class93_Sub1_Sub19 local8 = (Class93_Sub1_Sub19) this.aClass16_37.method215(local2); local8 != null; local8 = (Class93_Sub1_Sub19) this.aClass16_37.method216(-1796956099)) {
			if (local8.anInterface69_3.method808(arg0)) {
				this.method32859(local8);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!wz", name = "f", descriptor = "(Ljava/lang/Object;Lclient!wk;I)V")
	void method32867(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface69 arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt5965) {
			throw new IllegalStateException();
		}
		this.method32861(arg1);
		this.anInt5964 -= arg2;
		while (this.anInt5964 < 0) {
			@Pc(25) Class93_Sub1_Sub19 local25 = (Class93_Sub1_Sub19) this.aClass18_18.method244((byte) 8);
			this.method32859(local25);
		}
		@Pc(36) Class93_Sub1_Sub19_Sub1 local36 = new Class93_Sub1_Sub19_Sub1(arg1, arg0, arg2);
		this.aClass16_37.method221(local36, arg1.method811());
		this.aClass18_18.method268(local36, 553911009);
		local36.aLong233 = 0L;
	}

	@OriginalMember(owner = "client!wz", name = "q", descriptor = "(Ljava/lang/Object;Lclient!wk;I)V")
	void method32868(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface69 arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt5965) {
			throw new IllegalStateException();
		}
		this.method32861(arg1);
		this.anInt5964 -= arg2;
		while (this.anInt5964 < 0) {
			@Pc(25) Class93_Sub1_Sub19 local25 = (Class93_Sub1_Sub19) this.aClass18_18.method244((byte) 8);
			this.method32859(local25);
		}
		@Pc(36) Class93_Sub1_Sub19_Sub1 local36 = new Class93_Sub1_Sub19_Sub1(arg1, arg0, arg2);
		this.aClass16_37.method221(local36, arg1.method811());
		this.aClass18_18.method268(local36, 1610102872);
		local36.aLong233 = 0L;
	}

	@OriginalMember(owner = "client!wz", name = "v", descriptor = "(Ljava/lang/Object;Lclient!wk;)V")
	public void method32869(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface69 arg1) {
		this.method32867(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!wz", name = "o", descriptor = "(Ljava/lang/Object;Lclient!wk;)V")
	public void method32870(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface69 arg1) {
		this.method32867(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!wz", name = "s", descriptor = "(Ljava/lang/Object;Lclient!wk;I)V")
	void method32871(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface69 arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt5965) {
			throw new IllegalStateException();
		}
		this.method32861(arg1);
		this.anInt5964 -= arg2;
		while (this.anInt5964 < 0) {
			@Pc(25) Class93_Sub1_Sub19 local25 = (Class93_Sub1_Sub19) this.aClass18_18.method244((byte) 8);
			this.method32859(local25);
		}
		@Pc(36) Class93_Sub1_Sub19_Sub1 local36 = new Class93_Sub1_Sub19_Sub1(arg1, arg0, arg2);
		this.aClass16_37.method221(local36, arg1.method811());
		this.aClass18_18.method268(local36, 1661702906);
		local36.aLong233 = 0L;
	}

	@OriginalMember(owner = "client!wz", name = "h", descriptor = "()V")
	public void method32872() {
		this.aClass18_18.method245(-137056348);
		this.aClass16_37.method219((byte) 99);
		this.anInt5964 = this.anInt5965;
	}

	@OriginalMember(owner = "client!wz", name = "c", descriptor = "(Lclient!asr;)V")
	void method32873(@OriginalArg(0) Class93_Sub1_Sub19 arg0) {
		if (arg0 != null) {
			arg0.method23981(-287288427);
			arg0.method23988((short) 10828);
			this.anInt5964 += arg0.anInt3270;
		}
	}

	@OriginalMember(owner = "client!wz", name = "r", descriptor = "(Lclient!asr;)V")
	void method32874(@OriginalArg(0) Class93_Sub1_Sub19 arg0) {
		if (arg0 != null) {
			arg0.method23981(637131924);
			arg0.method23988((short) 25680);
			this.anInt5964 += arg0.anInt3270;
		}
	}

	@OriginalMember(owner = "client!wz", name = "b", descriptor = "()V")
	public void method32875() {
		this.aClass18_18.method245(-1857141166);
		this.aClass16_37.method219((byte) 79);
		this.anInt5964 = this.anInt5965;
	}

	@OriginalMember(owner = "client!wz", name = "d", descriptor = "(Lclient!wk;)V")
	void method32876(@OriginalArg(0) Interface69 arg0) {
		@Pc(2) long local2 = arg0.method811();
		for (@Pc(8) Class93_Sub1_Sub19 local8 = (Class93_Sub1_Sub19) this.aClass16_37.method215(local2); local8 != null; local8 = (Class93_Sub1_Sub19) this.aClass16_37.method216(-1796956099)) {
			if (local8.anInterface69_3.method808(arg0)) {
				this.method32859(local8);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!wz", name = "a", descriptor = "()V")
	public void method32877() {
		this.aClass18_18.method245(-2136611733);
		this.aClass16_37.method219((byte) 64);
		this.anInt5964 = this.anInt5965;
	}

	@OriginalMember(owner = "client!wz", name = "y", descriptor = "(Ljava/lang/Object;Lclient!wk;I)V")
	void method32878(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface69 arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt5965) {
			throw new IllegalStateException();
		}
		this.method32861(arg1);
		this.anInt5964 -= arg2;
		while (this.anInt5964 < 0) {
			@Pc(25) Class93_Sub1_Sub19 local25 = (Class93_Sub1_Sub19) this.aClass18_18.method244((byte) 8);
			this.method32859(local25);
		}
		@Pc(36) Class93_Sub1_Sub19_Sub1 local36 = new Class93_Sub1_Sub19_Sub1(arg1, arg0, arg2);
		this.aClass16_37.method221(local36, arg1.method811());
		this.aClass18_18.method268(local36, 1304489704);
		local36.aLong233 = 0L;
	}

	@OriginalMember(owner = "client!wz", name = "i", descriptor = "()V")
	public void method32879() {
		for (@Pc(5) Class93_Sub1_Sub19 local5 = (Class93_Sub1_Sub19) this.aClass18_18.method246(910409304); local5 != null; local5 = (Class93_Sub1_Sub19) this.aClass18_18.method253(1887296363)) {
			if (local5.method23975()) {
				local5.method23981(-1716758863);
				local5.method23988((short) -20398);
				this.anInt5964 += local5.anInt3270;
			}
		}
	}

	@OriginalMember(owner = "client!wz", name = "j", descriptor = "()V")
	public void method32880() {
		for (@Pc(5) Class93_Sub1_Sub19 local5 = (Class93_Sub1_Sub19) this.aClass18_18.method246(-385478401); local5 != null; local5 = (Class93_Sub1_Sub19) this.aClass18_18.method253(-474891994)) {
			if (local5.method23975()) {
				local5.method23981(383091387);
				local5.method23988((short) 6913);
				this.anInt5964 += local5.anInt3270;
			}
		}
	}

	@OriginalMember(owner = "client!wz", name = "t", descriptor = "()V")
	public void method32881() {
		for (@Pc(5) Class93_Sub1_Sub19 local5 = (Class93_Sub1_Sub19) this.aClass18_18.method246(-2003249610); local5 != null; local5 = (Class93_Sub1_Sub19) this.aClass18_18.method253(2146626397)) {
			if (local5.method23975()) {
				local5.method23981(-513199203);
				local5.method23988((short) -1074);
				this.anInt5964 += local5.anInt3270;
			}
		}
	}
}
