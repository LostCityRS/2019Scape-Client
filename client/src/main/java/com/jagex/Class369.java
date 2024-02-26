package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jx")
public final class Class369 implements Runnable {

	@OriginalMember(owner = "client!jx", name = "f", descriptor = "Z")
	boolean aBoolean841;

	@OriginalMember(owner = "client!jx", name = "i", descriptor = "J")
	long aLong371;

	@OriginalMember(owner = "client!jx", name = "l", descriptor = "J")
	long aLong372;

	@OriginalMember(owner = "client!jx", name = "g", descriptor = "I")
	int anInt4503;

	@OriginalMember(owner = "client!jx", name = "m", descriptor = "Ljava/lang/String;")
	String aString198;

	@OriginalMember(owner = "client!jx", name = "t", descriptor = "Z")
	volatile boolean aBoolean842;

	@OriginalMember(owner = "client!jx", name = "o", descriptor = "Ljava/lang/String;")
	String aString199;

	@OriginalMember(owner = "client!jx", name = "j", descriptor = "I")
	int anInt4504;

	@OriginalMember(owner = "client!jx", name = "a", descriptor = "Lclient!jh;")
	Class360 aClass360_20;

	@OriginalMember(owner = "client!jx", name = "e", descriptor = "Lclient!jo;")
	Interface30 anInterface30_1 = new Class370();

	@OriginalMember(owner = "client!jx", name = "u", descriptor = "Lclient!jo;")
	Interface30 anInterface30_2 = null;

	@OriginalMember(owner = "client!jx", name = "alx", descriptor = "(Lclient!yp;B)V")
	static void method28338(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		System.out.println(arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997]);
	}

	@OriginalMember(owner = "client!jx", name = "bai", descriptor = "(Lclient!yp;I)V")
	static void method28339(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub2_1.method16950(local12, (byte) -9);
	}

	@OriginalMember(owner = "client!jx", name = "u", descriptor = "(III)Lclient!hx;")
	public static Class327 method28340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class327 local3 = Class301.method27041(arg0, 2069780440);
		if (arg1 == -1) {
			return local3;
		} else if (local3 == null || local3.aClass327Array3 == null || arg1 >= local3.aClass327Array3.length) {
			return null;
		} else {
			return local3.aClass327Array3[arg1];
		}
	}

	@OriginalMember(owner = "client!jx", name = "<init>", descriptor = "()V")
	Class369() {
	}

	@OriginalMember(owner = "client!jx", name = "at", descriptor = "()J")
	public long method28296() {
		return this.aLong371 * 7657400427755274165L;
	}

	@OriginalMember(owner = "client!jx", name = "t", descriptor = "(I)I")
	int method28297(@OriginalArg(0) int arg0) {
		return this.anInt4503 * -694909993;
	}

	@OriginalMember(owner = "client!jx", name = "f", descriptor = "(I)V")
	synchronized void method28298(@OriginalArg(0) int arg0) {
		this.aBoolean841 = true;
	}

	@OriginalMember(owner = "client!jx", name = "ad", descriptor = "()Lclient!jh;")
	public Class360 method28299() {
		return this.aClass360_20;
	}

	@OriginalMember(owner = "client!jx", name = "u", descriptor = "(Lclient!jo;B)V")
	synchronized void method28300(@OriginalArg(0) Interface30 arg0, @OriginalArg(1) byte arg1) {
		this.anInterface30_2 = this.anInterface30_1;
		this.anInterface30_1 = arg0;
		this.aLong372 = Class303.method27111((byte) 35) * 1663794655508498245L;
	}

	@OriginalMember(owner = "client!jx", name = "l", descriptor = "(JLjava/lang/String;Ljava/lang/String;ILclient!jh;I)V")
	synchronized void method28301(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class360 arg4, @OriginalArg(5) int arg5) {
		this.aLong371 = arg0 * -3900071808454281571L;
		this.aString199 = arg1;
		this.aString198 = arg2;
		this.anInt4504 = arg3 * 1258786131;
		this.aClass360_20 = arg4;
	}

	@OriginalMember(owner = "client!jx", name = "g", descriptor = "(B)I")
	public int method28302(@OriginalArg(0) byte arg0) {
		if (this.aClass360_20 == null) {
			return 0;
		}
		@Pc(11) int local11 = this.aClass360_20.anInt4490 * 1975723063;
		if (this.aClass360_20.aBoolean836 && this.anInt4504 * 946880219 < this.aClass360_20.anInt4489 * 622296769) {
			return this.anInt4504 * 946880219 + 1;
		} else if (local11 >= 0 && local11 < Class365.aClass360Array1.length - 1) {
			return this.aClass360_20.anInt4491 * 171081043 == this.anInt4504 * 946880219 ? this.aClass360_20.anInt4489 * 622296769 : this.aClass360_20.anInt4491 * 171081043;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!jx", name = "o", descriptor = "(B)Ljava/lang/String;")
	public String method28303(@OriginalArg(0) byte arg0) {
		return this.aString199;
	}

	@OriginalMember(owner = "client!jx", name = "m", descriptor = "(I)Ljava/lang/String;")
	public String method28304(@OriginalArg(0) int arg0) {
		return this.aString198;
	}

	@OriginalMember(owner = "client!jx", name = "al", descriptor = "()Ljava/lang/String;")
	public String method28305() {
		return this.aString198;
	}

	@OriginalMember(owner = "client!jx", name = "j", descriptor = "(I)J")
	public long method28306(@OriginalArg(0) int arg0) {
		return this.aLong371 * 7657400427755274165L;
	}

	@OriginalMember(owner = "client!jx", name = "a", descriptor = "(B)Lclient!jh;")
	public Class360 method28307(@OriginalArg(0) byte arg0) {
		return this.aClass360_20;
	}

	@OriginalMember(owner = "client!jx", name = "s", descriptor = "(I)V")
	void method28308(@OriginalArg(0) int arg0) {
		this.aBoolean842 = true;
	}

	@OriginalMember(owner = "client!jx", name = "p", descriptor = "()Z")
	synchronized boolean method28309() {
		return this.anInterface30_1.method28357(this.aLong372 * -5942248225951353971L);
	}

	@OriginalMember(owner = "client!jx", name = "ab", descriptor = "()Ljava/lang/String;")
	public String method28310() {
		return this.aString198;
	}

	@OriginalMember(owner = "client!jx", name = "h", descriptor = "()V")
	public void method28311() {
		while (!this.aBoolean842) {
			@Pc(5) long local5 = Class303.method27111((byte) 54);
			synchronized (this) {
				try {
					this.anInt4503 += -76931097;
					if (this.anInterface30_1 instanceof Class370) {
						this.anInterface30_1.method28354(this.aBoolean841, -1935419683);
					} else {
						@Pc(29) long local29 = Class303.method27111((byte) 90);
						if (Class279.aClass102_9 == null || this.anInterface30_2 == null || this.anInterface30_2.method28346(-1626957083) == 0 || this.aLong372 * -5942248225951353971L < local29 - (long) this.anInterface30_2.method28346(-1876555553)) {
							if (this.anInterface30_2 != null) {
								this.aBoolean841 = true;
								this.anInterface30_2.method28344(-2071650600);
								this.anInterface30_2 = null;
							}
							if (this.aBoolean841) {
								Class50.method1038(-682818098);
								if (Class279.aClass102_9 != null) {
									Class279.aClass102_9.method20714(1, 0);
								}
							}
							this.anInterface30_1.method28354(this.aBoolean841 || Class279.aClass102_9 != null && Class279.aClass102_9.method20665(), -1300838691);
						} else {
							@Pc(69) int local69 = (int) ((local29 - this.aLong372 * -5942248225951353971L) * 255L / (long) this.anInterface30_2.method28346(-1437192214));
							@Pc(73) int local73 = 255 - local69;
							@Pc(79) int local79 = local69 << 24 | 0xFFFFFF;
							@Pc(85) int local85 = local73 << 24 | 0xFFFFFF;
							Class50.method1038(-132056680);
							Class279.aClass102_9.method20714(1, 0);
							@Pc(102) Class99 local102 = Class279.aClass102_9.method20738(Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103, true, 622173149);
							@Pc(105) Class108_Sub1 local105 = Class279.aClass102_9.method20687();
							local105.method23903(0, local102.method18231());
							Class279.aClass102_9.method20684(local105, -379149831);
							this.anInterface30_2.method28354(true, 1448436553);
							Class279.aClass102_9.method20887(local105, (byte) 1);
							local102.method18226(0, 0, 0, local85, 1);
							Class279.aClass102_9.method20684(local105, -694269776);
							Class279.aClass102_9.method20714(1, 0);
							this.anInterface30_1.method28354(true, -2008036885);
							Class279.aClass102_9.method20887(local105, (byte) 1);
							local102.method18226(0, 0, 0, local79, 1);
						}
						try {
							if (Class279.aClass102_9 != null && !(this.anInterface30_1 instanceof Class370)) {
								Class279.aClass102_9.method20657(-144214843);
							}
						} catch (@Pc(208) Exception_Sub2 local208) {
							Class603.method32133(local208.getMessage() + Class564.aClient1.method25297(-591161260), local208, 839300151);
							Class528.method30719(0, true, -729900767);
						}
					}
					this.aBoolean841 = false;
					if (Class279.aClass102_9 != null && !(this.anInterface30_1 instanceof Class370) && this.aClass360_20.anInt4490 * 1975723063 < Class360.aClass360_7.anInt4490 * 1975723063) {
						Class584.method31848(-1896594360);
					}
				} catch (@Pc(249) Exception local249) {
					continue;
				}
			}
			@Pc(263) long local263 = Class303.method27111((byte) 54);
			@Pc(270) int local270 = (int) (20L - (local263 - local5));
			if (local270 > 0) {
				Class217.method25866((long) local270);
			}
		}
	}

	@OriginalMember(owner = "client!jx", name = "k", descriptor = "()I")
	int method28312() {
		return this.anInt4503 * -694909993;
	}

	@OriginalMember(owner = "client!jx", name = "x", descriptor = "()I")
	int method28313() {
		return this.anInt4503 * -694909993;
	}

	@OriginalMember(owner = "client!jx", name = "v", descriptor = "()Z")
	synchronized boolean method28314() {
		return this.anInterface30_1.method28357(this.aLong372 * -5942248225951353971L);
	}

	@OriginalMember(owner = "client!jx", name = "r", descriptor = "()V")
	synchronized void method28315() {
		this.aBoolean841 = true;
	}

	@OriginalMember(owner = "client!jx", name = "d", descriptor = "()V")
	synchronized void method28316() {
		this.aBoolean841 = true;
	}

	@OriginalMember(owner = "client!jx", name = "ag", descriptor = "()I")
	public int method28317() {
		return this.anInt4504 * 946880219;
	}

	@OriginalMember(owner = "client!jx", name = "am", descriptor = "()J")
	public long method28318() {
		return this.aLong371 * 7657400427755274165L;
	}

	@OriginalMember(owner = "client!jx", name = "af", descriptor = "()Ljava/lang/String;")
	public String method28319() {
		return this.aString199;
	}

	@OriginalMember(owner = "client!jx", name = "y", descriptor = "()Z")
	synchronized boolean method28320() {
		return this.anInterface30_1.method28357(this.aLong372 * -5942248225951353971L);
	}

	@OriginalMember(owner = "client!jx", name = "n", descriptor = "()Z")
	synchronized boolean method28321() {
		return this.anInterface30_1.method28357(this.aLong372 * -5942248225951353971L);
	}

	@OriginalMember(owner = "client!jx", name = "c", descriptor = "()Z")
	synchronized boolean method28322() {
		return this.anInterface30_1.method28357(this.aLong372 * -5942248225951353971L);
	}

	@OriginalMember(owner = "client!jx", name = "ax", descriptor = "(JLjava/lang/String;Ljava/lang/String;ILclient!jh;)V")
	synchronized void method28323(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class360 arg4) {
		this.aLong371 = arg0 * -3900071808454281571L;
		this.aString199 = arg1;
		this.aString198 = arg2;
		this.anInt4504 = arg3 * 1258786131;
		this.aClass360_20 = arg4;
	}

	@OriginalMember(owner = "client!jx", name = "w", descriptor = "()V")
	synchronized void method28324() {
		this.aBoolean841 = true;
	}

	@OriginalMember(owner = "client!jx", name = "ay", descriptor = "(JLjava/lang/String;Ljava/lang/String;ILclient!jh;)V")
	synchronized void method28325(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class360 arg4) {
		this.aLong371 = arg0 * -3900071808454281571L;
		this.aString199 = arg1;
		this.aString198 = arg2;
		this.anInt4504 = arg3 * 1258786131;
		this.aClass360_20 = arg4;
	}

	@OriginalMember(owner = "client!jx", name = "ai", descriptor = "(JLjava/lang/String;Ljava/lang/String;ILclient!jh;)V")
	synchronized void method28326(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class360 arg4) {
		this.aLong371 = arg0 * -3900071808454281571L;
		this.aString199 = arg1;
		this.aString198 = arg2;
		this.anInt4504 = arg3 * 1258786131;
		this.aClass360_20 = arg4;
	}

	@OriginalMember(owner = "client!jx", name = "e", descriptor = "(I)Z")
	synchronized boolean method28327(@OriginalArg(0) int arg0) {
		return this.anInterface30_1.method28357(this.aLong372 * -5942248225951353971L);
	}

	@OriginalMember(owner = "client!jx", name = "ao", descriptor = "()I")
	public int method28328() {
		if (this.aClass360_20 == null) {
			return 0;
		}
		@Pc(11) int local11 = this.aClass360_20.anInt4490 * 1975723063;
		if (this.aClass360_20.aBoolean836 && this.anInt4504 * 946880219 < this.aClass360_20.anInt4489 * 622296769) {
			return this.anInt4504 * 946880219 + 1;
		} else if (local11 >= 0 && local11 < Class365.aClass360Array1.length - 1) {
			return this.aClass360_20.anInt4491 * 171081043 == this.anInt4504 * 946880219 ? this.aClass360_20.anInt4489 * 622296769 : this.aClass360_20.anInt4491 * 171081043;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!jx", name = "aj", descriptor = "()I")
	public int method28329() {
		if (this.aClass360_20 == null) {
			return 0;
		}
		@Pc(11) int local11 = this.aClass360_20.anInt4490 * 1975723063;
		if (this.aClass360_20.aBoolean836 && this.anInt4504 * 946880219 < this.aClass360_20.anInt4489 * 622296769) {
			return this.anInt4504 * 946880219 + 1;
		} else if (local11 >= 0 && local11 < Class365.aClass360Array1.length - 1) {
			return this.aClass360_20.anInt4491 * 171081043 == this.anInt4504 * 946880219 ? this.aClass360_20.anInt4489 * 622296769 : this.aClass360_20.anInt4491 * 171081043;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!jx", name = "ac", descriptor = "()I")
	public int method28330() {
		if (this.aClass360_20 == null) {
			return 0;
		}
		@Pc(11) int local11 = this.aClass360_20.anInt4490 * 1975723063;
		if (this.aClass360_20.aBoolean836 && this.anInt4504 * 946880219 < this.aClass360_20.anInt4489 * 622296769) {
			return this.anInt4504 * 946880219 + 1;
		} else if (local11 >= 0 && local11 < Class365.aClass360Array1.length - 1) {
			return this.aClass360_20.anInt4491 * 171081043 == this.anInt4504 * 946880219 ? this.aClass360_20.anInt4489 * 622296769 : this.aClass360_20.anInt4491 * 171081043;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!jx", name = "aq", descriptor = "(JLjava/lang/String;Ljava/lang/String;ILclient!jh;)V")
	synchronized void method28331(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class360 arg4) {
		this.aLong371 = arg0 * -3900071808454281571L;
		this.aString199 = arg1;
		this.aString198 = arg2;
		this.anInt4504 = arg3 * 1258786131;
		this.aClass360_20 = arg4;
	}

	@OriginalMember(owner = "client!jx", name = "i", descriptor = "(I)I")
	public int method28332(@OriginalArg(0) int arg0) {
		return this.anInt4504 * 946880219;
	}

	@OriginalMember(owner = "client!jx", name = "q", descriptor = "()V")
	public void method28333() {
		while (!this.aBoolean842) {
			@Pc(5) long local5 = Class303.method27111((byte) 13);
			synchronized (this) {
				try {
					this.anInt4503 += -76931097;
					if (this.anInterface30_1 instanceof Class370) {
						this.anInterface30_1.method28354(this.aBoolean841, 1949506982);
					} else {
						@Pc(29) long local29 = Class303.method27111((byte) 101);
						if (Class279.aClass102_9 == null || this.anInterface30_2 == null || this.anInterface30_2.method28346(-1484462313) == 0 || this.aLong372 * -5942248225951353971L < local29 - (long) this.anInterface30_2.method28346(-1929767384)) {
							if (this.anInterface30_2 != null) {
								this.aBoolean841 = true;
								this.anInterface30_2.method28344(202088117);
								this.anInterface30_2 = null;
							}
							if (this.aBoolean841) {
								Class50.method1038(976569994);
								if (Class279.aClass102_9 != null) {
									Class279.aClass102_9.method20714(1, 0);
								}
							}
							this.anInterface30_1.method28354(this.aBoolean841 || Class279.aClass102_9 != null && Class279.aClass102_9.method20665(), 550297496);
						} else {
							@Pc(69) int local69 = (int) ((local29 - this.aLong372 * -5942248225951353971L) * 255L / (long) this.anInterface30_2.method28346(-2069101945));
							@Pc(73) int local73 = 255 - local69;
							@Pc(79) int local79 = local69 << 24 | 0xFFFFFF;
							@Pc(85) int local85 = local73 << 24 | 0xFFFFFF;
							Class50.method1038(-1873731687);
							Class279.aClass102_9.method20714(1, 0);
							@Pc(102) Class99 local102 = Class279.aClass102_9.method20738(Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103, true, -1436774403);
							@Pc(105) Class108_Sub1 local105 = Class279.aClass102_9.method20687();
							local105.method23903(0, local102.method18231());
							Class279.aClass102_9.method20684(local105, 1732304295);
							this.anInterface30_2.method28354(true, -1781823968);
							Class279.aClass102_9.method20887(local105, (byte) 1);
							local102.method18226(0, 0, 0, local85, 1);
							Class279.aClass102_9.method20684(local105, -2083807065);
							Class279.aClass102_9.method20714(1, 0);
							this.anInterface30_1.method28354(true, -377333798);
							Class279.aClass102_9.method20887(local105, (byte) 1);
							local102.method18226(0, 0, 0, local79, 1);
						}
						try {
							if (Class279.aClass102_9 != null && !(this.anInterface30_1 instanceof Class370)) {
								Class279.aClass102_9.method20657(-265227797);
							}
						} catch (@Pc(208) Exception_Sub2 local208) {
							Class603.method32133(local208.getMessage() + Class564.aClient1.method25297(-591161260), local208, 839300151);
							Class528.method30719(0, true, 296883697);
						}
					}
					this.aBoolean841 = false;
					if (Class279.aClass102_9 != null && !(this.anInterface30_1 instanceof Class370) && this.aClass360_20.anInt4490 * 1975723063 < Class360.aClass360_7.anInt4490 * 1975723063) {
						Class584.method31848(-2120046464);
					}
				} catch (@Pc(249) Exception local249) {
					continue;
				}
			}
			@Pc(263) long local263 = Class303.method27111((byte) 96);
			@Pc(270) int local270 = (int) (20L - (local263 - local5));
			if (local270 > 0) {
				Class217.method25866((long) local270);
			}
		}
	}

	@OriginalMember(owner = "client!jx", name = "ah", descriptor = "()Ljava/lang/String;")
	public String method28334() {
		return this.aString199;
	}

	@OriginalMember(owner = "client!jx", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean842) {
			@Pc(5) long local5 = Class303.method27111((byte) 126);
			synchronized (this) {
				try {
					this.anInt4503 += -76931097;
					if (this.anInterface30_1 instanceof Class370) {
						this.anInterface30_1.method28354(this.aBoolean841, 91482235);
					} else {
						@Pc(29) long local29 = Class303.method27111((byte) 90);
						if (Class279.aClass102_9 == null || this.anInterface30_2 == null || this.anInterface30_2.method28346(-2095378057) == 0 || this.aLong372 * -5942248225951353971L < local29 - (long) this.anInterface30_2.method28346(-1776199499)) {
							if (this.anInterface30_2 != null) {
								this.aBoolean841 = true;
								this.anInterface30_2.method28344(1694403202);
								this.anInterface30_2 = null;
							}
							if (this.aBoolean841) {
								Class50.method1038(961334892);
								if (Class279.aClass102_9 != null) {
									Class279.aClass102_9.method20714(1, 0);
								}
							}
							this.anInterface30_1.method28354(this.aBoolean841 || Class279.aClass102_9 != null && Class279.aClass102_9.method20665(), -1899706338);
						} else {
							@Pc(69) int local69 = (int) ((local29 - this.aLong372 * -5942248225951353971L) * 255L / (long) this.anInterface30_2.method28346(-1847011142));
							@Pc(73) int local73 = 255 - local69;
							@Pc(79) int local79 = local69 << 24 | 0xFFFFFF;
							@Pc(85) int local85 = local73 << 24 | 0xFFFFFF;
							Class50.method1038(-14100743);
							Class279.aClass102_9.method20714(1, 0);
							@Pc(102) Class99 local102 = Class279.aClass102_9.method20738(Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103, true, -661610542);
							@Pc(105) Class108_Sub1 local105 = Class279.aClass102_9.method20687();
							local105.method23903(0, local102.method18231());
							Class279.aClass102_9.method20684(local105, -456319274);
							this.anInterface30_2.method28354(true, -901461659);
							Class279.aClass102_9.method20887(local105, (byte) 1);
							local102.method18226(0, 0, 0, local85, 1);
							Class279.aClass102_9.method20684(local105, 467087058);
							Class279.aClass102_9.method20714(1, 0);
							this.anInterface30_1.method28354(true, -1409742302);
							Class279.aClass102_9.method20887(local105, (byte) 1);
							local102.method18226(0, 0, 0, local79, 1);
						}
						try {
							if (Class279.aClass102_9 != null && !(this.anInterface30_1 instanceof Class370)) {
								Class279.aClass102_9.method20657(685978019);
							}
						} catch (@Pc(208) Exception_Sub2 local208) {
							Class603.method32133(local208.getMessage() + Class564.aClient1.method25297(-591161260), local208, 839300151);
							Class528.method30719(0, true, 1660839442);
						}
					}
					this.aBoolean841 = false;
					if (Class279.aClass102_9 != null && !(this.anInterface30_1 instanceof Class370) && this.aClass360_20.anInt4490 * 1975723063 < Class360.aClass360_7.anInt4490 * 1975723063) {
						Class584.method31848(1108810155);
					}
				} catch (@Pc(249) Exception local249) {
					continue;
				}
			}
			@Pc(263) long local263 = Class303.method27111((byte) 10);
			@Pc(270) int local270 = (int) (20L - (local263 - local5));
			if (local270 > 0) {
				Class217.method25866((long) local270);
			}
		}
	}

	@OriginalMember(owner = "client!jx", name = "z", descriptor = "()V")
	synchronized void method28335() {
		this.aBoolean841 = true;
	}

	@OriginalMember(owner = "client!jx", name = "ak", descriptor = "()J")
	public long method28336() {
		return this.aLong371 * 7657400427755274165L;
	}

	@OriginalMember(owner = "client!jx", name = "b", descriptor = "(Lclient!jo;)V")
	synchronized void method28337(@OriginalArg(0) Interface30 arg0) {
		this.anInterface30_2 = this.anInterface30_1;
		this.anInterface30_1 = arg0;
		this.aLong372 = Class303.method27111((byte) 75) * 1663794655508498245L;
	}
}
