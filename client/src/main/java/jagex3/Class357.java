package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class357 implements Runnable {

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
	int anInt4725;

	@OriginalMember(owner = "client!jb", name = "u", descriptor = "Ljava/lang/String;")
	String aString194;

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "J")
	long aLong264;

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
	int anInt4726;

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "J")
	long aLong265;

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "Z")
	boolean aBoolean736;

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "Ljava/lang/String;")
	String aString195;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "Lclient!jw;")
	Class370 aClass370_4;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "Z")
	volatile boolean aBoolean737;

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "Lclient!jt;")
	Interface30 anInterface30_2 = new Class364();

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "Lclient!jt;")
	Interface30 anInterface30_1 = null;

	@OriginalMember(owner = "client!jb", name = "ht", descriptor = "(Lclient!yf;I)V")
	static void method27949(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, -590070381);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class453.method29146(local16, local22, arg0, Class310.aClass310_2, (byte) -46);
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V")
	public static void method27950(@OriginalArg(0) int arg0) {
		Class362.aBoolean739 = true;
		Class7.aString2 = Class411.aString209;
		Class490.aString226 = Class411.aString210;
		Class642.method32703(false, (short) 9562);
		Class283.method26570((byte) -12);
		Class362.aClass370Array1 = null;
		Class275.aClass496_1 = null;
		Class481.method29937(5, 1823202236);
	}

	@OriginalMember(owner = "client!jb", name = "bfn", descriptor = "(Lclient!yf;B)V")
	static void method27951(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 100;
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
	Class357() {
	}

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "(I)V")
	synchronized void method27912(@OriginalArg(0) int arg0) {
		this.aBoolean736 = true;
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)I")
	int method27913(@OriginalArg(0) int arg0) {
		return this.anInt4726 * 722299905;
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "()V")
	public void method27914() {
		while (!this.aBoolean737) {
			@Pc(5) long local5 = Class305.method26889(1168522581);
			synchronized (this) {
				try {
					this.anInt4726 += 981636097;
					if (this.anInterface30_2 instanceof Class364) {
						this.anInterface30_2.method28105(this.aBoolean736, -1275334566);
					} else {
						@Pc(29) long local29 = Class305.method26889(235605169);
						if (Class694.aClass104_14 == null || this.anInterface30_1 == null || this.anInterface30_1.method28103((byte) 2) == 0 || this.aLong264 * -3552011952240075205L < local29 - (long) this.anInterface30_1.method28103((byte) 34)) {
							if (this.anInterface30_1 != null) {
								this.aBoolean736 = true;
								this.anInterface30_1.method28106((byte) -91);
								this.anInterface30_1 = null;
							}
							if (this.aBoolean736) {
								Class555.method31234(-478558870);
								if (Class694.aClass104_14 != null) {
									Class694.aClass104_14.method20786(1, 0);
								}
							}
							this.anInterface30_2.method28105(this.aBoolean736 || Class694.aClass104_14 != null && Class694.aClass104_14.method20434(), -1275334566);
						} else {
							@Pc(69) int local69 = (int) ((local29 - this.aLong264 * -3552011952240075205L) * 255L / (long) this.anInterface30_1.method28103((byte) -72));
							@Pc(73) int local73 = 255 - local69;
							@Pc(79) int local79 = local69 << 24 | 0xFFFFFF;
							@Pc(85) int local85 = local73 << 24 | 0xFFFFFF;
							Class555.method31234(853275626);
							Class694.aClass104_14.method20786(1, 0);
							@Pc(102) Class100 local102 = Class694.aClass104_14.method20676(Class553.anInt3408 * -1378711501, Class553.anInt3416 * 2091353777, true, -533073351);
							@Pc(105) Class112_Sub1 local105 = Class694.aClass104_14.method20456();
							local105.method23446(0, local102.method18179());
							Class694.aClass104_14.method20453(local105, (byte) 1);
							this.anInterface30_1.method28105(true, -1275334566);
							Class694.aClass104_14.method20454(local105, -1497248091);
							local102.method18185(0, 0, 0, local85, 1);
							Class694.aClass104_14.method20453(local105, (byte) 1);
							Class694.aClass104_14.method20786(1, 0);
							this.anInterface30_2.method28105(true, -1275334566);
							Class694.aClass104_14.method20454(local105, -1497248091);
							local102.method18185(0, 0, 0, local79, 1);
						}
						try {
							if (Class694.aClass104_14 != null && !(this.anInterface30_2 instanceof Class364)) {
								Class694.aClass104_14.method20426(-910309966);
							}
						} catch (@Pc(206) Exception_Sub4 local206) {
							Class646.method32791(local206.getMessage() + Class717.aClient1.method24865((byte) 31), local206, 1910940570);
							Class543.method31129(0, true, 1945646779);
						}
					}
					this.aBoolean736 = false;
					if (Class694.aClass104_14 != null && !(this.anInterface30_2 instanceof Class364) && this.aClass370_4.anInt4751 * -909097621 < Class370.aClass370_19.anInt4751 * -909097621) {
						Class274.method26433((byte) 0);
					}
				} catch (@Pc(248) Exception local248) {
					continue;
				}
			}
			@Pc(262) long local262 = Class305.method26889(1397119412);
			@Pc(269) int local269 = (int) (20L - (local262 - local5));
			if (local269 > 0) {
				Class212.method25532((long) local269);
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "ag", descriptor = "()I")
	public int method27915() {
		if (this.aClass370_4 == null) {
			return 0;
		}
		@Pc(11) int local11 = this.aClass370_4.anInt4751 * -909097621;
		if (this.aClass370_4.aBoolean746 && this.anInt4725 * -741905967 < this.aClass370_4.anInt4753 * -1203887493) {
			return this.anInt4725 * -741905967 + 1;
		} else if (local11 >= 0 && local11 < Class362.aClass370Array1.length - 1) {
			return this.aClass370_4.anInt4752 * 903713925 == this.anInt4725 * -741905967 ? this.aClass370_4.anInt4753 * -1203887493 : this.aClass370_4.anInt4752 * 903713925;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "(JLjava/lang/String;Ljava/lang/String;ILclient!jw;S)V")
	synchronized void method27916(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class370 arg4, @OriginalArg(5) short arg5) {
		this.aLong265 = arg0 * -5183479944850458591L;
		this.aString195 = arg1;
		this.aString194 = arg2;
		this.anInt4725 = arg3 * -328626383;
		this.aClass370_4 = arg4;
	}

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "(Lclient!jt;)V")
	synchronized void method27917(@OriginalArg(0) Interface30 arg0) {
		this.anInterface30_1 = this.anInterface30_2;
		this.anInterface30_2 = arg0;
		this.aLong264 = Class305.method26889(955414758) * 5216009802569698035L;
	}

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "(I)I")
	public int method27918(@OriginalArg(0) int arg0) {
		return this.anInt4725 * -741905967;
	}

	@OriginalMember(owner = "client!jb", name = "u", descriptor = "(B)Ljava/lang/String;")
	public String method27919(@OriginalArg(0) byte arg0) {
		return this.aString194;
	}

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "(I)Ljava/lang/String;")
	public String method27920(@OriginalArg(0) int arg0) {
		return this.aString195;
	}

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "()V")
	public void method27921() {
		while (!this.aBoolean737) {
			@Pc(5) long local5 = Class305.method26889(234060216);
			synchronized (this) {
				try {
					this.anInt4726 += 981636097;
					if (this.anInterface30_2 instanceof Class364) {
						this.anInterface30_2.method28105(this.aBoolean736, -1275334566);
					} else {
						@Pc(29) long local29 = Class305.method26889(865938140);
						if (Class694.aClass104_14 == null || this.anInterface30_1 == null || this.anInterface30_1.method28103((byte) -74) == 0 || this.aLong264 * -3552011952240075205L < local29 - (long) this.anInterface30_1.method28103((byte) 55)) {
							if (this.anInterface30_1 != null) {
								this.aBoolean736 = true;
								this.anInterface30_1.method28106((byte) -89);
								this.anInterface30_1 = null;
							}
							if (this.aBoolean736) {
								Class555.method31234(-1043386495);
								if (Class694.aClass104_14 != null) {
									Class694.aClass104_14.method20786(1, 0);
								}
							}
							this.anInterface30_2.method28105(this.aBoolean736 || Class694.aClass104_14 != null && Class694.aClass104_14.method20434(), -1275334566);
						} else {
							@Pc(69) int local69 = (int) ((local29 - this.aLong264 * -3552011952240075205L) * 255L / (long) this.anInterface30_1.method28103((byte) 66));
							@Pc(73) int local73 = 255 - local69;
							@Pc(79) int local79 = local69 << 24 | 0xFFFFFF;
							@Pc(85) int local85 = local73 << 24 | 0xFFFFFF;
							Class555.method31234(1819369552);
							Class694.aClass104_14.method20786(1, 0);
							@Pc(102) Class100 local102 = Class694.aClass104_14.method20676(Class553.anInt3408 * -1378711501, Class553.anInt3416 * 2091353777, true, -1919413746);
							@Pc(105) Class112_Sub1 local105 = Class694.aClass104_14.method20456();
							local105.method23446(0, local102.method18179());
							Class694.aClass104_14.method20453(local105, (byte) 1);
							this.anInterface30_1.method28105(true, -1275334566);
							Class694.aClass104_14.method20454(local105, -1497248091);
							local102.method18185(0, 0, 0, local85, 1);
							Class694.aClass104_14.method20453(local105, (byte) 1);
							Class694.aClass104_14.method20786(1, 0);
							this.anInterface30_2.method28105(true, -1275334566);
							Class694.aClass104_14.method20454(local105, -1497248091);
							local102.method18185(0, 0, 0, local79, 1);
						}
						try {
							if (Class694.aClass104_14 != null && !(this.anInterface30_2 instanceof Class364)) {
								Class694.aClass104_14.method20426(-1230170726);
							}
						} catch (@Pc(206) Exception_Sub4 local206) {
							Class646.method32791(local206.getMessage() + Class717.aClient1.method24865((byte) 45), local206, 1196238268);
							Class543.method31129(0, true, 1945646779);
						}
					}
					this.aBoolean736 = false;
					if (Class694.aClass104_14 != null && !(this.anInterface30_2 instanceof Class364) && this.aClass370_4.anInt4751 * -909097621 < Class370.aClass370_19.anInt4751 * -909097621) {
						Class274.method26433((byte) 0);
					}
				} catch (@Pc(248) Exception local248) {
					continue;
				}
			}
			@Pc(262) long local262 = Class305.method26889(216206636);
			@Pc(269) int local269 = (int) (20L - (local262 - local5));
			if (local269 > 0) {
				Class212.method25532((long) local269);
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)Lclient!jw;")
	public Class370 method27922(@OriginalArg(0) int arg0) {
		return this.aClass370_4;
	}

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "(B)V")
	void method27923(@OriginalArg(0) byte arg0) {
		this.aBoolean737 = true;
	}

	@OriginalMember(owner = "client!jb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean737) {
			@Pc(5) long local5 = Class305.method26889(325451001);
			synchronized (this) {
				try {
					this.anInt4726 += 981636097;
					if (this.anInterface30_2 instanceof Class364) {
						this.anInterface30_2.method28105(this.aBoolean736, -1275334566);
					} else {
						@Pc(29) long local29 = Class305.method26889(1742187087);
						if (Class694.aClass104_14 == null || this.anInterface30_1 == null || this.anInterface30_1.method28103((byte) -51) == 0 || this.aLong264 * -3552011952240075205L < local29 - (long) this.anInterface30_1.method28103((byte) 47)) {
							if (this.anInterface30_1 != null) {
								this.aBoolean736 = true;
								this.anInterface30_1.method28106((byte) 32);
								this.anInterface30_1 = null;
							}
							if (this.aBoolean736) {
								Class555.method31234(17102272);
								if (Class694.aClass104_14 != null) {
									Class694.aClass104_14.method20786(1, 0);
								}
							}
							this.anInterface30_2.method28105(this.aBoolean736 || Class694.aClass104_14 != null && Class694.aClass104_14.method20434(), -1275334566);
						} else {
							@Pc(69) int local69 = (int) ((local29 - this.aLong264 * -3552011952240075205L) * 255L / (long) this.anInterface30_1.method28103((byte) 14));
							@Pc(73) int local73 = 255 - local69;
							@Pc(79) int local79 = local69 << 24 | 0xFFFFFF;
							@Pc(85) int local85 = local73 << 24 | 0xFFFFFF;
							Class555.method31234(1929758039);
							Class694.aClass104_14.method20786(1, 0);
							@Pc(102) Class100 local102 = Class694.aClass104_14.method20676(Class553.anInt3408 * -1378711501, Class553.anInt3416 * 2091353777, true, -1398219634);
							@Pc(105) Class112_Sub1 local105 = Class694.aClass104_14.method20456();
							local105.method23446(0, local102.method18179());
							Class694.aClass104_14.method20453(local105, (byte) 1);
							this.anInterface30_1.method28105(true, -1275334566);
							Class694.aClass104_14.method20454(local105, -1497248091);
							local102.method18185(0, 0, 0, local85, 1);
							Class694.aClass104_14.method20453(local105, (byte) 1);
							Class694.aClass104_14.method20786(1, 0);
							this.anInterface30_2.method28105(true, -1275334566);
							Class694.aClass104_14.method20454(local105, -1497248091);
							local102.method18185(0, 0, 0, local79, 1);
						}
						try {
							if (Class694.aClass104_14 != null && !(this.anInterface30_2 instanceof Class364)) {
								Class694.aClass104_14.method20426(-19284232);
							}
						} catch (@Pc(206) Exception_Sub4 local206) {
							Class646.method32791(local206.getMessage() + Class717.aClient1.method24865((byte) 31), local206, 1676172092);
							Class543.method31129(0, true, 1945646779);
						}
					}
					this.aBoolean736 = false;
					if (Class694.aClass104_14 != null && !(this.anInterface30_2 instanceof Class364) && this.aClass370_4.anInt4751 * -909097621 < Class370.aClass370_19.anInt4751 * -909097621) {
						Class274.method26433((byte) 0);
					}
				} catch (@Pc(248) Exception local248) {
					continue;
				}
			}
			@Pc(262) long local262 = Class305.method26889(1718853786);
			@Pc(269) int local269 = (int) (20L - (local262 - local5));
			if (local269 > 0) {
				Class212.method25532((long) local269);
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "(B)Z")
	synchronized boolean method27924(@OriginalArg(0) byte arg0) {
		return this.anInterface30_2.method28107(this.aLong264 * -3552011952240075205L);
	}

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "()I")
	public int method27925() {
		if (this.aClass370_4 == null) {
			return 0;
		}
		@Pc(11) int local11 = this.aClass370_4.anInt4751 * -909097621;
		if (this.aClass370_4.aBoolean746 && this.anInt4725 * -741905967 < this.aClass370_4.anInt4753 * -1203887493) {
			return this.anInt4725 * -741905967 + 1;
		} else if (local11 >= 0 && local11 < Class362.aClass370Array1.length - 1) {
			return this.aClass370_4.anInt4752 * 903713925 == this.anInt4725 * -741905967 ? this.aClass370_4.anInt4753 * -1203887493 : this.aClass370_4.anInt4752 * 903713925;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!jb", name = "al", descriptor = "()Ljava/lang/String;")
	public String method27926() {
		return this.aString194;
	}

	@OriginalMember(owner = "client!jb", name = "at", descriptor = "()J")
	public long method27927() {
		return this.aLong265 * -1766001740248134687L;
	}

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "()I")
	int method27928() {
		return this.anInt4726 * 722299905;
	}

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "()V")
	synchronized void method27929() {
		this.aBoolean736 = true;
	}

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "(Lclient!jt;)V")
	synchronized void method27930(@OriginalArg(0) Interface30 arg0) {
		this.anInterface30_1 = this.anInterface30_2;
		this.anInterface30_2 = arg0;
		this.aLong264 = Class305.method26889(1191946527) * 5216009802569698035L;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(Lclient!jt;)V")
	synchronized void method27931(@OriginalArg(0) Interface30 arg0) {
		this.anInterface30_1 = this.anInterface30_2;
		this.anInterface30_2 = arg0;
		this.aLong264 = Class305.method26889(482494208) * 5216009802569698035L;
	}

	@OriginalMember(owner = "client!jb", name = "ah", descriptor = "()I")
	public int method27932() {
		return this.anInt4725 * -741905967;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!jt;)V")
	synchronized void method27933(@OriginalArg(0) Interface30 arg0) {
		this.anInterface30_1 = this.anInterface30_2;
		this.anInterface30_2 = arg0;
		this.aLong264 = Class305.method26889(385003710) * 5216009802569698035L;
	}

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "(JLjava/lang/String;Ljava/lang/String;ILclient!jw;)V")
	synchronized void method27934(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class370 arg4) {
		this.aLong265 = arg0 * -5183479944850458591L;
		this.aString195 = arg1;
		this.aString194 = arg2;
		this.anInt4725 = arg3 * -328626383;
		this.aClass370_4 = arg4;
	}

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "(JLjava/lang/String;Ljava/lang/String;ILclient!jw;)V")
	synchronized void method27935(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class370 arg4) {
		this.aLong265 = arg0 * -5183479944850458591L;
		this.aString195 = arg1;
		this.aString194 = arg2;
		this.anInt4725 = arg3 * -328626383;
		this.aClass370_4 = arg4;
	}

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "()I")
	public int method27936() {
		if (this.aClass370_4 == null) {
			return 0;
		}
		@Pc(11) int local11 = this.aClass370_4.anInt4751 * -909097621;
		if (this.aClass370_4.aBoolean746 && this.anInt4725 * -741905967 < this.aClass370_4.anInt4753 * -1203887493) {
			return this.anInt4725 * -741905967 + 1;
		} else if (local11 >= 0 && local11 < Class362.aClass370Array1.length - 1) {
			return this.aClass370_4.anInt4752 * 903713925 == this.anInt4725 * -741905967 ? this.aClass370_4.anInt4753 * -1203887493 : this.aClass370_4.anInt4752 * 903713925;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "()V")
	public void method27937() {
		while (!this.aBoolean737) {
			@Pc(5) long local5 = Class305.method26889(956135349);
			synchronized (this) {
				try {
					this.anInt4726 += 981636097;
					if (this.anInterface30_2 instanceof Class364) {
						this.anInterface30_2.method28105(this.aBoolean736, -1275334566);
					} else {
						@Pc(29) long local29 = Class305.method26889(485899402);
						if (Class694.aClass104_14 == null || this.anInterface30_1 == null || this.anInterface30_1.method28103((byte) 28) == 0 || this.aLong264 * -3552011952240075205L < local29 - (long) this.anInterface30_1.method28103((byte) -93)) {
							if (this.anInterface30_1 != null) {
								this.aBoolean736 = true;
								this.anInterface30_1.method28106((byte) 41);
								this.anInterface30_1 = null;
							}
							if (this.aBoolean736) {
								Class555.method31234(1467225442);
								if (Class694.aClass104_14 != null) {
									Class694.aClass104_14.method20786(1, 0);
								}
							}
							this.anInterface30_2.method28105(this.aBoolean736 || Class694.aClass104_14 != null && Class694.aClass104_14.method20434(), -1275334566);
						} else {
							@Pc(69) int local69 = (int) ((local29 - this.aLong264 * -3552011952240075205L) * 255L / (long) this.anInterface30_1.method28103((byte) 20));
							@Pc(73) int local73 = 255 - local69;
							@Pc(79) int local79 = local69 << 24 | 0xFFFFFF;
							@Pc(85) int local85 = local73 << 24 | 0xFFFFFF;
							Class555.method31234(-542212805);
							Class694.aClass104_14.method20786(1, 0);
							@Pc(102) Class100 local102 = Class694.aClass104_14.method20676(Class553.anInt3408 * -1378711501, Class553.anInt3416 * 2091353777, true, -1026105753);
							@Pc(105) Class112_Sub1 local105 = Class694.aClass104_14.method20456();
							local105.method23446(0, local102.method18179());
							Class694.aClass104_14.method20453(local105, (byte) 1);
							this.anInterface30_1.method28105(true, -1275334566);
							Class694.aClass104_14.method20454(local105, -1497248091);
							local102.method18185(0, 0, 0, local85, 1);
							Class694.aClass104_14.method20453(local105, (byte) 1);
							Class694.aClass104_14.method20786(1, 0);
							this.anInterface30_2.method28105(true, -1275334566);
							Class694.aClass104_14.method20454(local105, -1497248091);
							local102.method18185(0, 0, 0, local79, 1);
						}
						try {
							if (Class694.aClass104_14 != null && !(this.anInterface30_2 instanceof Class364)) {
								Class694.aClass104_14.method20426(-532722249);
							}
						} catch (@Pc(206) Exception_Sub4 local206) {
							Class646.method32791(local206.getMessage() + Class717.aClient1.method24865((byte) 25), local206, 1584413220);
							Class543.method31129(0, true, 1945646779);
						}
					}
					this.aBoolean736 = false;
					if (Class694.aClass104_14 != null && !(this.anInterface30_2 instanceof Class364) && this.aClass370_4.anInt4751 * -909097621 < Class370.aClass370_19.anInt4751 * -909097621) {
						Class274.method26433((byte) 0);
					}
				} catch (@Pc(248) Exception local248) {
					continue;
				}
			}
			@Pc(262) long local262 = Class305.method26889(1372637249);
			@Pc(269) int local269 = (int) (20L - (local262 - local5));
			if (local269 > 0) {
				Class212.method25532((long) local269);
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "ae", descriptor = "()I")
	public int method27938() {
		if (this.aClass370_4 == null) {
			return 0;
		}
		@Pc(11) int local11 = this.aClass370_4.anInt4751 * -909097621;
		if (this.aClass370_4.aBoolean746 && this.anInt4725 * -741905967 < this.aClass370_4.anInt4753 * -1203887493) {
			return this.anInt4725 * -741905967 + 1;
		} else if (local11 >= 0 && local11 < Class362.aClass370Array1.length - 1) {
			return this.aClass370_4.anInt4752 * 903713925 == this.anInt4725 * -741905967 ? this.aClass370_4.anInt4753 * -1203887493 : this.aClass370_4.anInt4752 * 903713925;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "(I)J")
	public long method27939(@OriginalArg(0) int arg0) {
		return this.aLong265 * -1766001740248134687L;
	}

	@OriginalMember(owner = "client!jb", name = "r", descriptor = "()V")
	public void method27940() {
		while (!this.aBoolean737) {
			@Pc(5) long local5 = Class305.method26889(2118340663);
			synchronized (this) {
				try {
					this.anInt4726 += 981636097;
					if (this.anInterface30_2 instanceof Class364) {
						this.anInterface30_2.method28105(this.aBoolean736, -1275334566);
					} else {
						@Pc(29) long local29 = Class305.method26889(340006400);
						if (Class694.aClass104_14 == null || this.anInterface30_1 == null || this.anInterface30_1.method28103((byte) -23) == 0 || this.aLong264 * -3552011952240075205L < local29 - (long) this.anInterface30_1.method28103((byte) -49)) {
							if (this.anInterface30_1 != null) {
								this.aBoolean736 = true;
								this.anInterface30_1.method28106((byte) 6);
								this.anInterface30_1 = null;
							}
							if (this.aBoolean736) {
								Class555.method31234(1578589551);
								if (Class694.aClass104_14 != null) {
									Class694.aClass104_14.method20786(1, 0);
								}
							}
							this.anInterface30_2.method28105(this.aBoolean736 || Class694.aClass104_14 != null && Class694.aClass104_14.method20434(), -1275334566);
						} else {
							@Pc(69) int local69 = (int) ((local29 - this.aLong264 * -3552011952240075205L) * 255L / (long) this.anInterface30_1.method28103((byte) -108));
							@Pc(73) int local73 = 255 - local69;
							@Pc(79) int local79 = local69 << 24 | 0xFFFFFF;
							@Pc(85) int local85 = local73 << 24 | 0xFFFFFF;
							Class555.method31234(1162632401);
							Class694.aClass104_14.method20786(1, 0);
							@Pc(102) Class100 local102 = Class694.aClass104_14.method20676(Class553.anInt3408 * -1378711501, Class553.anInt3416 * 2091353777, true, -1321456634);
							@Pc(105) Class112_Sub1 local105 = Class694.aClass104_14.method20456();
							local105.method23446(0, local102.method18179());
							Class694.aClass104_14.method20453(local105, (byte) 1);
							this.anInterface30_1.method28105(true, -1275334566);
							Class694.aClass104_14.method20454(local105, -1497248091);
							local102.method18185(0, 0, 0, local85, 1);
							Class694.aClass104_14.method20453(local105, (byte) 1);
							Class694.aClass104_14.method20786(1, 0);
							this.anInterface30_2.method28105(true, -1275334566);
							Class694.aClass104_14.method20454(local105, -1497248091);
							local102.method18185(0, 0, 0, local79, 1);
						}
						try {
							if (Class694.aClass104_14 != null && !(this.anInterface30_2 instanceof Class364)) {
								Class694.aClass104_14.method20426(-2050557166);
							}
						} catch (@Pc(206) Exception_Sub4 local206) {
							Class646.method32791(local206.getMessage() + Class717.aClient1.method24865((byte) 95), local206, 579646961);
							Class543.method31129(0, true, 1945646779);
						}
					}
					this.aBoolean736 = false;
					if (Class694.aClass104_14 != null && !(this.anInterface30_2 instanceof Class364) && this.aClass370_4.anInt4751 * -909097621 < Class370.aClass370_19.anInt4751 * -909097621) {
						Class274.method26433((byte) 0);
					}
				} catch (@Pc(248) Exception local248) {
					continue;
				}
			}
			@Pc(262) long local262 = Class305.method26889(1217017609);
			@Pc(269) int local269 = (int) (20L - (local262 - local5));
			if (local269 > 0) {
				Class212.method25532((long) local269);
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "(I)I")
	public int method27941(@OriginalArg(0) int arg0) {
		if (this.aClass370_4 == null) {
			return 0;
		}
		@Pc(11) int local11 = this.aClass370_4.anInt4751 * -909097621;
		if (this.aClass370_4.aBoolean746 && this.anInt4725 * -741905967 < this.aClass370_4.anInt4753 * -1203887493) {
			return this.anInt4725 * -741905967 + 1;
		} else if (local11 >= 0 && local11 < Class362.aClass370Array1.length - 1) {
			return this.aClass370_4.anInt4752 * 903713925 == this.anInt4725 * -741905967 ? this.aClass370_4.anInt4753 * -1203887493 : this.aClass370_4.anInt4752 * 903713925;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!jb", name = "ac", descriptor = "()Ljava/lang/String;")
	public String method27942() {
		return this.aString194;
	}

	@OriginalMember(owner = "client!jb", name = "ai", descriptor = "()Ljava/lang/String;")
	public String method27943() {
		return this.aString195;
	}

	@OriginalMember(owner = "client!jb", name = "aw", descriptor = "()Ljava/lang/String;")
	public String method27944() {
		return this.aString195;
	}

	@OriginalMember(owner = "client!jb", name = "as", descriptor = "()J")
	public long method27945() {
		return this.aLong265 * -1766001740248134687L;
	}

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "(Lclient!jt;S)V")
	synchronized void method27946(@OriginalArg(0) Interface30 arg0, @OriginalArg(1) short arg1) {
		this.anInterface30_1 = this.anInterface30_2;
		this.anInterface30_2 = arg0;
		this.aLong264 = Class305.method26889(2088979507) * 5216009802569698035L;
	}

	@OriginalMember(owner = "client!jb", name = "ad", descriptor = "()Lclient!jw;")
	public Class370 method27947() {
		return this.aClass370_4;
	}

	@OriginalMember(owner = "client!jb", name = "am", descriptor = "()Lclient!jw;")
	public Class370 method27948() {
		return this.aClass370_4;
	}
}
