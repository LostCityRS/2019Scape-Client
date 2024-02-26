package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@OriginalClass("client!rh")
public final class Class529 {

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "Lclient!wc;")
	Interface68 anInterface68_1;

	@OriginalMember(owner = "client!rh", name = "x", descriptor = "F")
	float aFloat323;

	@OriginalMember(owner = "client!rh", name = "s", descriptor = "Lclient!rf;")
	Interface55 anInterface55_5;

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "Ljava/lang/Object;")
	Object anObject23;

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
	int anInt5065;

	@OriginalMember(owner = "client!rh", name = "o", descriptor = "Z")
	boolean aBoolean889;

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
	int anInt5066;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "F")
	float aFloat324;

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "F")
	float aFloat325;

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "F")
	float aFloat326;

	@OriginalMember(owner = "client!rh", name = "r", descriptor = "Z")
	boolean aBoolean890;

	@OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
	int anInt5067;

	@OriginalMember(owner = "client!rh", name = "q", descriptor = "Ljava/lang/Object;")
	Object anObject24;

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "Lclient!on;")
	Class463 aClass463_63;

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "Lclient!ra;")
	Class524 aClass524_11 = Class524.aClass524_9;

	@OriginalMember(owner = "client!rh", name = "u", descriptor = "Z")
	boolean aBoolean888 = false;

	@OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
	int anInt5068 = 0;

	@OriginalMember(owner = "client!rh", name = "t", descriptor = "Lclient!mr;")
	Class138 aClass138_2;

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "Ljava/util/List;")
	List aList22;

	@OriginalMember(owner = "client!rh", name = "wv", descriptor = "(Lclient!yp;B)V")
	static void method30809(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class159_Sub1.method15513(local13, local23, false, -1143960985);
	}

	@OriginalMember(owner = "client!rh", name = "auw", descriptor = "(Lclient!yp;B)V")
	static void method30810(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub27_1.method16402((byte) 6);
	}

	@OriginalMember(owner = "client!rh", name = "fu", descriptor = "(Lclient!yp;I)V")
	static void method30811(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class556.method31372(local11, local14, arg0, (byte) 15);
	}

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!mr;)V")
	public Class529(@OriginalArg(0) Class138 arg0) {
		this.aClass138_2 = arg0;
		this.aList22 = new ArrayList();
	}

	@OriginalMember(owner = "client!rh", name = "bl", descriptor = "()Lclient!ra;")
	public Class524 method30721() {
		return this.aClass524_11;
	}

	@OriginalMember(owner = "client!rh", name = "cy", descriptor = "(ZI)V")
	public void method30722(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.aBoolean889 = arg0;
		this.anInt5066 = arg1 * -1392051977;
	}

	@OriginalMember(owner = "client!rh", name = "t", descriptor = "(I)V")
	void method30723(@OriginalArg(0) int arg0) {
		this.anInterface68_1 = null;
		this.aClass524_11 = Class524.aClass524_9;
		this.aBoolean888 = false;
		this.aList22.clear();
		this.anObject23 = null;
		this.aClass463_63 = null;
		this.anInt5065 = -2071145131;
		this.aBoolean889 = false;
		this.anInt5066 = 0;
		this.aFloat324 = 0.0F;
		this.anInterface55_5 = null;
		this.aFloat326 = 0.0F;
		this.aFloat323 = 0.0F;
		this.anInt5067 = 0;
		this.aBoolean890 = false;
		this.anObject24 = null;
		this.anInt5068 = 0;
		this.aFloat325 = 1.0F;
	}

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)V")
	public void method30724(@OriginalArg(0) int arg0) {
		if (this.aClass524_11 != Class524.aClass524_7 && this.aClass524_11 != Class524.aClass524_8) {
			this.method30788(0, -2126468937);
		}
		@Pc(15) Iterator local15 = this.aList22.iterator();
		while (local15.hasNext()) {
			@Pc(22) Class541 local22 = (Class541) local15.next();
			if (local22.method31100(-2118376808) == this) {
				local22.method31146(1896589581);
			} else {
				local15.remove();
			}
		}
		this.method30723(-2066308714);
		this.aClass524_11 = Class524.aClass524_1;
	}

	@OriginalMember(owner = "client!rh", name = "ce", descriptor = "(F)V")
	public void method30725(@OriginalArg(0) float arg0) {
		if (!(arg0 < 0.0F)) {
			this.aFloat325 = arg0;
		}
	}

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "(I)V")
	public void method30726(@OriginalArg(0) int arg0) {
		if (this.aClass524_11 == Class524.aClass524_4 || Class524.aClass524_1 == this.aClass524_11 || this.aClass524_11 == Class524.aClass524_9 || this.aClass524_11 == Class524.aClass524_6) {
			return;
		}
		if ((Class524.aClass524_3 == this.aClass524_11 || Class524.aClass524_10 == this.aClass524_11) && !this.aBoolean888) {
			this.aBoolean888 = true;
		} else if (this.aClass524_11.anInt5060 * 1548726705 < Class524.aClass524_3.anInt5060 * 1548726705 || this.aClass524_11.anInt5060 * 1548726705 >= Class524.aClass524_7.anInt5060 * 1548726705) {
			this.aClass524_11 = Class524.aClass524_3;
			this.aBoolean888 = true;
		}
	}

	@OriginalMember(owner = "client!rh", name = "bi", descriptor = "(F)V")
	public void method30727(@OriginalArg(0) float arg0) {
		this.aFloat323 = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "(I)V")
	public void method30728(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.aList22.iterator();
		this.aClass524_11 = Class524.aClass524_7;
		while (local3.hasNext()) {
			@Pc(13) Class541 local13 = (Class541) local3.next();
			if (local13.method31100(-1986411683) == this) {
				local13.method31088(1441702271);
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "m", descriptor = "(I)V")
	public void method30729(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.aList22.iterator();
		this.aClass524_11 = Class524.aClass524_3;
		while (local3.hasNext()) {
			@Pc(13) Class541 local13 = (Class541) local3.next();
			if (local13.method31100(-2043620405) == this) {
				local13.method31126(-68209108);
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "o", descriptor = "(Lclient!rf;S)V")
	public void method30730(@OriginalArg(0) Interface55 arg0, @OriginalArg(1) short arg1) {
		this.anInterface55_5 = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "(I)V")
	public void method30731(@OriginalArg(0) int arg0) {
		if (Class524.aClass524_3 == this.aClass524_11) {
			@Pc(8) Class646 local8 = this.anInterface68_1.method32968(-82880038);
			if (Class646.aClass646_5 == local8) {
				this.aClass524_11 = Class524.aClass524_10;
			}
		}
		@Pc(38) boolean local38;
		if (this.aClass524_11 == Class524.aClass524_10 && this.aBoolean888) {
			@Pc(31) Class541 local31 = this.aClass138_2.method11508(this.anInterface68_1.method32979(858255933), 1656360987);
			if (local31 != null) {
				local38 = this.anInterface68_1.method32969(275418512);
				@Pc(43) Class513 local43 = new Class513(this);
				@Pc(84) boolean local84 = local31.method31071(local38 ? null : this.anInterface68_1.method32971(0, 349323826), local38 ? local43 : null, this.anInt5065 * 1760788483, this.anInt5068 * -690615879 > 0 ? 0.0F : this.aFloat324, false, this.aBoolean889, this.anInt5066 * 640239815, this.aFloat325, this, -1221873570);
				if (local84) {
					this.aClass524_11 = Class524.aClass524_5;
					local31.method31090(this.anInterface55_5, 1275822955);
					local31.method31069(this.aFloat324, this.anInt5068 * -690615879, (byte) 0);
					local31.method31072((byte) -89);
					this.aList22.add(local31);
					this.aBoolean888 = false;
				} else {
					if (local31.method31063((byte) -91) == Class515.aClass515_8) {
						this.aClass524_11 = Class524.aClass524_8;
					}
					local31.method31146(1896589581);
				}
			}
		}
		@Pc(131) Iterator local131 = this.aList22.iterator();
		local38 = true;
		while (true) {
			while (local131.hasNext()) {
				@Pc(140) Class541 local140 = (Class541) local131.next();
				if (local140.method31100(-2034301937) == this) {
					if (this.aClass524_11 == Class524.aClass524_6) {
						if (local140.method31087(16711935) == 0.0F) {
							local140.method31073(-825189621);
						} else {
							local38 = false;
						}
					}
					if (local140.method31097(-703065216) || local140.method31065(-1270665597)) {
						local140.method31146(1896589581);
						local131.remove();
					} else {
						local38 = false;
					}
				} else {
					local131.remove();
				}
			}
			if (local38 && this.aClass524_11.anInt5060 * 1548726705 >= Class524.aClass524_5.anInt5060 * 1548726705 && this.aClass524_11.anInt5060 * 1548726705 < Class524.aClass524_7.anInt5060 * 1548726705) {
				if (Class524.aClass524_6 == this.aClass524_11) {
					this.aClass524_11 = Class524.aClass524_7;
				} else {
					this.aClass524_11 = Class524.aClass524_8;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)Lclient!ra;")
	public Class524 method30732(@OriginalArg(0) byte arg0) {
		return this.aClass524_11;
	}

	@OriginalMember(owner = "client!rh", name = "s", descriptor = "(Ljava/lang/Object;B)V")
	public void method30733(@OriginalArg(0) Object arg0, @OriginalArg(1) byte arg1) {
		this.anObject23 = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "as", descriptor = "()V")
	public void method30734() {
		if (Class524.aClass524_3 == this.aClass524_11) {
			@Pc(8) Class646 local8 = this.anInterface68_1.method32968(-100267281);
			if (Class646.aClass646_5 == local8) {
				this.aClass524_11 = Class524.aClass524_10;
			}
		}
		@Pc(38) boolean local38;
		if (this.aClass524_11 == Class524.aClass524_10 && this.aBoolean888) {
			@Pc(31) Class541 local31 = this.aClass138_2.method11508(this.anInterface68_1.method32979(858255933), 1656360987);
			if (local31 != null) {
				local38 = this.anInterface68_1.method32969(275418512);
				@Pc(43) Class513 local43 = new Class513(this);
				@Pc(84) boolean local84 = local31.method31071(local38 ? null : this.anInterface68_1.method32971(0, -842609259), local38 ? local43 : null, this.anInt5065 * 1760788483, this.anInt5068 * -690615879 > 0 ? 0.0F : this.aFloat324, false, this.aBoolean889, this.anInt5066 * 640239815, this.aFloat325, this, -1995937235);
				if (local84) {
					this.aClass524_11 = Class524.aClass524_5;
					local31.method31090(this.anInterface55_5, 1275822955);
					local31.method31069(this.aFloat324, this.anInt5068 * -690615879, (byte) 0);
					local31.method31072((byte) 94);
					this.aList22.add(local31);
					this.aBoolean888 = false;
				} else {
					if (local31.method31063((byte) -48) == Class515.aClass515_8) {
						this.aClass524_11 = Class524.aClass524_8;
					}
					local31.method31146(1896589581);
				}
			}
		}
		@Pc(131) Iterator local131 = this.aList22.iterator();
		local38 = true;
		while (true) {
			while (local131.hasNext()) {
				@Pc(140) Class541 local140 = (Class541) local131.next();
				if (local140.method31100(-2047482856) == this) {
					if (this.aClass524_11 == Class524.aClass524_6) {
						if (local140.method31087(16711935) == 0.0F) {
							local140.method31073(-825189621);
						} else {
							local38 = false;
						}
					}
					if (local140.method31097(-703065216) || local140.method31065(655845707)) {
						local140.method31146(1896589581);
						local131.remove();
					} else {
						local38 = false;
					}
				} else {
					local131.remove();
				}
			}
			if (local38 && this.aClass524_11.anInt5060 * 1548726705 >= Class524.aClass524_5.anInt5060 * 1548726705 && this.aClass524_11.anInt5060 * 1548726705 < Class524.aClass524_7.anInt5060 * 1548726705) {
				if (Class524.aClass524_6 == this.aClass524_11) {
					this.aClass524_11 = Class524.aClass524_7;
				} else {
					this.aClass524_11 = Class524.aClass524_8;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!rh", name = "ay", descriptor = "(I)V")
	public void method30735(@OriginalArg(0) int arg0) {
		if (this.anInt5067 * 2022865819 > -1 && !this.aBoolean890) {
			this.anInt5067 -= -1006079341;
		}
		if (this.anInt5067 * 2022865819 == 0) {
			this.method30726(-1957315951);
		}
	}

	@OriginalMember(owner = "client!rh", name = "w", descriptor = "(I)Ljava/lang/Object;")
	public Object method30736(@OriginalArg(0) int arg0) {
		return this.anObject24;
	}

	@OriginalMember(owner = "client!rh", name = "r", descriptor = "(I)I")
	public int method30737(@OriginalArg(0) int arg0) {
		return this.anInt5065 * 1760788483;
	}

	@OriginalMember(owner = "client!rh", name = "q", descriptor = "(II)V")
	public void method30738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5065 = arg0 * 2071145131;
	}

	@OriginalMember(owner = "client!rh", name = "ad", descriptor = "(I)V")
	public void method30739(@OriginalArg(0) int arg0) {
		if (this.aClass524_11.anInt5060 * 1548726705 >= Class524.aClass524_7.anInt5060 * 1548726705) {
			return;
		}
		if (this.aClass524_11.anInt5060 * 1548726705 < Class524.aClass524_5.anInt5060 * 1548726705) {
			this.aClass524_11 = Class524.aClass524_7;
			this.aBoolean888 = false;
			return;
		}
		@Pc(33) Iterator local33;
		@Pc(40) Class541 local40;
		if (arg0 > 0) {
			this.aClass524_11 = Class524.aClass524_6;
			local33 = this.aList22.iterator();
			while (local33.hasNext()) {
				local40 = (Class541) local33.next();
				if (local40.method31100(-1846551327) == this) {
					local40.method31069(0.0F, arg0, (byte) 0);
				} else {
					local33.remove();
				}
			}
			return;
		}
		local33 = this.aList22.iterator();
		while (local33.hasNext()) {
			local40 = (Class541) local33.next();
			if (local40.method31100(-2076918831) == this) {
				local40.method31073(-825189621);
			} else {
				local33.remove();
			}
		}
		this.aClass524_11 = Class524.aClass524_7;
		this.aBoolean888 = false;
	}

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "(B)Lclient!wc;")
	public Interface68 method30740(@OriginalArg(0) byte arg0) {
		return this.anInterface68_1;
	}

	@OriginalMember(owner = "client!rh", name = "z", descriptor = "(Lclient!on;I)V")
	public void method30741(@OriginalArg(0) Class463 arg0, @OriginalArg(1) int arg1) {
		this.aClass463_63 = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "cu", descriptor = "(F)V")
	public void method30742(@OriginalArg(0) float arg0) {
		if (!(arg0 < 0.0F)) {
			this.aFloat325 = arg0;
		}
	}

	@OriginalMember(owner = "client!rh", name = "v", descriptor = "(I)F")
	public float method30743(@OriginalArg(0) int arg0) {
		return this.aFloat326;
	}

	@OriginalMember(owner = "client!rh", name = "y", descriptor = "(B)F")
	public float method30744(@OriginalArg(0) byte arg0) {
		return this.aFloat323;
	}

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "(FI)V")
	public void method30745(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		this.aFloat326 = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(FI)V")
	public void method30746(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		this.aFloat323 = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "p", descriptor = "(I)Lclient!on;")
	public Class463 method30747(@OriginalArg(0) int arg0) {
		return this.aClass463_63;
	}

	@OriginalMember(owner = "client!rh", name = "ax", descriptor = "(I)Z")
	public boolean method30748(@OriginalArg(0) int arg0) {
		this.aBoolean890 = false;
		return this.anInt5067 * 2022865819 != 0;
	}

	@OriginalMember(owner = "client!rh", name = "ai", descriptor = "(FIB)V")
	public void method30749(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		this.aFloat324 = arg0;
		@Pc(4) int local4 = 0;
		@Pc(8) Iterator local8 = this.aList22.iterator();
		while (local8.hasNext()) {
			@Pc(15) Class541 local15 = (Class541) local8.next();
			if (local15.method31100(-2088409834) == this) {
				local15.method31069(this.aFloat324, arg1, (byte) 0);
				local4++;
			} else {
				this.aList22.remove(local15);
			}
		}
		if (local4 == 0) {
			this.anInt5068 = arg1 * -1668207479;
		}
	}

	@OriginalMember(owner = "client!rh", name = "aq", descriptor = "(ZIS)V")
	public void method30750(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		this.aBoolean889 = arg0;
		this.anInt5066 = arg1 * -1392051977;
	}

	@OriginalMember(owner = "client!rh", name = "ao", descriptor = "(FI)V")
	public void method30751(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		if (!(arg0 < 0.0F)) {
			this.aFloat325 = arg0;
		}
	}

	@OriginalMember(owner = "client!rh", name = "aj", descriptor = "()V")
	void method30752() {
		this.anInterface68_1 = null;
		this.aClass524_11 = Class524.aClass524_9;
		this.aBoolean888 = false;
		this.aList22.clear();
		this.anObject23 = null;
		this.aClass463_63 = null;
		this.anInt5065 = -2071145131;
		this.aBoolean889 = false;
		this.anInt5066 = 0;
		this.aFloat324 = 0.0F;
		this.anInterface55_5 = null;
		this.aFloat326 = 0.0F;
		this.aFloat323 = 0.0F;
		this.anInt5067 = 0;
		this.aBoolean890 = false;
		this.anObject24 = null;
		this.anInt5068 = 0;
		this.aFloat325 = 1.0F;
	}

	@OriginalMember(owner = "client!rh", name = "ac", descriptor = "()V")
	void method30753() {
		this.anInterface68_1 = null;
		this.aClass524_11 = Class524.aClass524_9;
		this.aBoolean888 = false;
		this.aList22.clear();
		this.anObject23 = null;
		this.aClass463_63 = null;
		this.anInt5065 = -2071145131;
		this.aBoolean889 = false;
		this.anInt5066 = 0;
		this.aFloat324 = 0.0F;
		this.anInterface55_5 = null;
		this.aFloat326 = 0.0F;
		this.aFloat323 = 0.0F;
		this.anInt5067 = 0;
		this.aBoolean890 = false;
		this.anObject24 = null;
		this.anInt5068 = 0;
		this.aFloat325 = 1.0F;
	}

	@OriginalMember(owner = "client!rh", name = "ag", descriptor = "(Lclient!wc;)V")
	public void method30754(@OriginalArg(0) Interface68 arg0) {
		this.anInterface68_1 = arg0;
		this.aFloat324 = 0.0F;
		this.aClass524_11 = Class524.aClass524_2;
	}

	@OriginalMember(owner = "client!rh", name = "ab", descriptor = "(Lclient!wc;)V")
	public void method30755(@OriginalArg(0) Interface68 arg0) {
		this.anInterface68_1 = arg0;
		this.aFloat324 = 0.0F;
		this.aClass524_11 = Class524.aClass524_2;
	}

	@OriginalMember(owner = "client!rh", name = "aw", descriptor = "()V")
	public void method30756() {
		if (Class524.aClass524_3 == this.aClass524_11) {
			@Pc(8) Class646 local8 = this.anInterface68_1.method32968(-18718178);
			if (Class646.aClass646_5 == local8) {
				this.aClass524_11 = Class524.aClass524_10;
			}
		}
		@Pc(38) boolean local38;
		if (this.aClass524_11 == Class524.aClass524_10 && this.aBoolean888) {
			@Pc(31) Class541 local31 = this.aClass138_2.method11508(this.anInterface68_1.method32979(858255933), 1656360987);
			if (local31 != null) {
				local38 = this.anInterface68_1.method32969(275418512);
				@Pc(43) Class513 local43 = new Class513(this);
				@Pc(84) boolean local84 = local31.method31071(local38 ? null : this.anInterface68_1.method32971(0, -1126282143), local38 ? local43 : null, this.anInt5065 * 1760788483, this.anInt5068 * -690615879 > 0 ? 0.0F : this.aFloat324, false, this.aBoolean889, this.anInt5066 * 640239815, this.aFloat325, this, 1079819764);
				if (local84) {
					this.aClass524_11 = Class524.aClass524_5;
					local31.method31090(this.anInterface55_5, 1275822955);
					local31.method31069(this.aFloat324, this.anInt5068 * -690615879, (byte) 0);
					local31.method31072((byte) -32);
					this.aList22.add(local31);
					this.aBoolean888 = false;
				} else {
					if (local31.method31063((byte) -37) == Class515.aClass515_8) {
						this.aClass524_11 = Class524.aClass524_8;
					}
					local31.method31146(1896589581);
				}
			}
		}
		@Pc(131) Iterator local131 = this.aList22.iterator();
		local38 = true;
		while (true) {
			while (local131.hasNext()) {
				@Pc(140) Class541 local140 = (Class541) local131.next();
				if (local140.method31100(-2075319027) == this) {
					if (this.aClass524_11 == Class524.aClass524_6) {
						if (local140.method31087(16711935) == 0.0F) {
							local140.method31073(-825189621);
						} else {
							local38 = false;
						}
					}
					if (local140.method31097(-703065216) || local140.method31065(-165926406)) {
						local140.method31146(1896589581);
						local131.remove();
					} else {
						local38 = false;
					}
				} else {
					local131.remove();
				}
			}
			if (local38 && this.aClass524_11.anInt5060 * 1548726705 >= Class524.aClass524_5.anInt5060 * 1548726705 && this.aClass524_11.anInt5060 * 1548726705 < Class524.aClass524_7.anInt5060 * 1548726705) {
				if (Class524.aClass524_6 == this.aClass524_11) {
					this.aClass524_11 = Class524.aClass524_7;
				} else {
					this.aClass524_11 = Class524.aClass524_8;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!rh", name = "ah", descriptor = "()V")
	public void method30757() {
		if (this.aClass524_11 != Class524.aClass524_7 && this.aClass524_11 != Class524.aClass524_8) {
			this.method30788(0, -772177256);
		}
		@Pc(15) Iterator local15 = this.aList22.iterator();
		while (local15.hasNext()) {
			@Pc(22) Class541 local22 = (Class541) local15.next();
			if (local22.method31100(-1878555083) == this) {
				local22.method31146(1896589581);
			} else {
				local15.remove();
			}
		}
		this.method30723(1892387693);
		this.aClass524_11 = Class524.aClass524_1;
	}

	@OriginalMember(owner = "client!rh", name = "af", descriptor = "()V")
	public void method30758() {
		if (this.aClass524_11 != Class524.aClass524_7 && this.aClass524_11 != Class524.aClass524_8) {
			this.method30788(0, 524087692);
		}
		@Pc(15) Iterator local15 = this.aList22.iterator();
		while (local15.hasNext()) {
			@Pc(22) Class541 local22 = (Class541) local15.next();
			if (local22.method31100(-2059179038) == this) {
				local22.method31146(1896589581);
			} else {
				local15.remove();
			}
		}
		this.method30723(-1382242406);
		this.aClass524_11 = Class524.aClass524_1;
	}

	@OriginalMember(owner = "client!rh", name = "x", descriptor = "(Ljava/lang/Object;B)V")
	public void method30759(@OriginalArg(0) Object arg0, @OriginalArg(1) byte arg1) {
		this.anObject24 = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "ak", descriptor = "()V")
	public void method30760() {
		if (this.aClass524_11 == Class524.aClass524_4 || Class524.aClass524_1 == this.aClass524_11 || this.aClass524_11 == Class524.aClass524_9 || this.aClass524_11 == Class524.aClass524_6) {
			return;
		}
		if ((Class524.aClass524_3 == this.aClass524_11 || Class524.aClass524_10 == this.aClass524_11) && !this.aBoolean888) {
			this.aBoolean888 = true;
		} else if (this.aClass524_11.anInt5060 * 1548726705 < Class524.aClass524_3.anInt5060 * 1548726705 || this.aClass524_11.anInt5060 * 1548726705 >= Class524.aClass524_7.anInt5060 * 1548726705) {
			this.aClass524_11 = Class524.aClass524_3;
			this.aBoolean888 = true;
		}
	}

	@OriginalMember(owner = "client!rh", name = "at", descriptor = "()V")
	public void method30761() {
		if (this.aClass524_11 == Class524.aClass524_4 || Class524.aClass524_1 == this.aClass524_11 || this.aClass524_11 == Class524.aClass524_9 || this.aClass524_11 == Class524.aClass524_6) {
			return;
		}
		if ((Class524.aClass524_3 == this.aClass524_11 || Class524.aClass524_10 == this.aClass524_11) && !this.aBoolean888) {
			this.aBoolean888 = true;
		} else if (this.aClass524_11.anInt5060 * 1548726705 < Class524.aClass524_3.anInt5060 * 1548726705 || this.aClass524_11.anInt5060 * 1548726705 >= Class524.aClass524_7.anInt5060 * 1548726705) {
			this.aClass524_11 = Class524.aClass524_3;
			this.aBoolean888 = true;
		}
	}

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "(Lclient!wc;B)V")
	public void method30762(@OriginalArg(0) Interface68 arg0, @OriginalArg(1) byte arg1) {
		this.anInterface68_1 = arg0;
		this.aFloat324 = 0.0F;
		this.aClass524_11 = Class524.aClass524_2;
	}

	@OriginalMember(owner = "client!rh", name = "av", descriptor = "(I)V")
	public void method30763(@OriginalArg(0) int arg0) {
		if (this.aClass524_11.anInt5060 * 1548726705 >= Class524.aClass524_7.anInt5060 * 1548726705) {
			return;
		}
		if (this.aClass524_11.anInt5060 * 1548726705 < Class524.aClass524_5.anInt5060 * 1548726705) {
			this.aClass524_11 = Class524.aClass524_7;
			this.aBoolean888 = false;
			return;
		}
		@Pc(33) Iterator local33;
		@Pc(40) Class541 local40;
		if (arg0 > 0) {
			this.aClass524_11 = Class524.aClass524_6;
			local33 = this.aList22.iterator();
			while (local33.hasNext()) {
				local40 = (Class541) local33.next();
				if (local40.method31100(-1970566124) == this) {
					local40.method31069(0.0F, arg0, (byte) 0);
				} else {
					local33.remove();
				}
			}
			return;
		}
		local33 = this.aList22.iterator();
		while (local33.hasNext()) {
			local40 = (Class541) local33.next();
			if (local40.method31100(-2019834882) == this) {
				local40.method31073(-825189621);
			} else {
				local33.remove();
			}
		}
		this.aClass524_11 = Class524.aClass524_7;
		this.aBoolean888 = false;
	}

	@OriginalMember(owner = "client!rh", name = "an", descriptor = "()V")
	public void method30764() {
		@Pc(3) Iterator local3 = this.aList22.iterator();
		this.aClass524_11 = Class524.aClass524_7;
		while (local3.hasNext()) {
			@Pc(13) Class541 local13 = (Class541) local3.next();
			if (local13.method31100(-1954749590) == this) {
				local13.method31088(1441702271);
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "aa", descriptor = "()V")
	public void method30765() {
		@Pc(3) Iterator local3 = this.aList22.iterator();
		this.aClass524_11 = Class524.aClass524_7;
		while (local3.hasNext()) {
			@Pc(13) Class541 local13 = (Class541) local3.next();
			if (local13.method31100(-2008359194) == this) {
				local13.method31088(1441702271);
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "ae", descriptor = "()V")
	public void method30766() {
		@Pc(3) Iterator local3 = this.aList22.iterator();
		this.aClass524_11 = Class524.aClass524_7;
		while (local3.hasNext()) {
			@Pc(13) Class541 local13 = (Class541) local3.next();
			if (local13.method31100(-1916247423) == this) {
				local13.method31088(1441702271);
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "ap", descriptor = "()V")
	public void method30767() {
		@Pc(3) Iterator local3 = this.aList22.iterator();
		this.aClass524_11 = Class524.aClass524_3;
		while (local3.hasNext()) {
			@Pc(13) Class541 local13 = (Class541) local3.next();
			if (local13.method31100(-1911892795) == this) {
				local13.method31126(-579325476);
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "u", descriptor = "(B)V")
	public void method30768(@OriginalArg(0) byte arg0) {
		if (!this.aBoolean888 && (Class524.aClass524_4 != this.aClass524_11 && Class524.aClass524_1 != this.aClass524_11 && Class524.aClass524_9 != this.aClass524_11 && this.aClass524_11 != Class524.aClass524_6 && (this.aClass524_11.anInt5060 * 1548726705 <= Class524.aClass524_2.anInt5060 * 1548726705 || this.aClass524_11.anInt5060 * 1548726705 >= Class524.aClass524_7.anInt5060 * 1548726705))) {
			this.aClass524_11 = Class524.aClass524_3;
		}
	}

	@OriginalMember(owner = "client!rh", name = "au", descriptor = "()V")
	public void method30769() {
		@Pc(3) Iterator local3 = this.aList22.iterator();
		this.aClass524_11 = Class524.aClass524_3;
		while (local3.hasNext()) {
			@Pc(13) Class541 local13 = (Class541) local3.next();
			if (local13.method31100(-2067871816) == this) {
				local13.method31126(2012448685);
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "az", descriptor = "(Lclient!rf;)V")
	public void method30770(@OriginalArg(0) Interface55 arg0) {
		this.anInterface55_5 = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "bp", descriptor = "(Lclient!on;)V")
	public void method30771(@OriginalArg(0) Class463 arg0) {
		this.aClass463_63 = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "bs", descriptor = "(Ljava/lang/Object;)V")
	public void method30772(@OriginalArg(0) Object arg0) {
		this.anObject24 = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "bg", descriptor = "()Lclient!ra;")
	public Class524 method30773() {
		return this.aClass524_11;
	}

	@OriginalMember(owner = "client!rh", name = "by", descriptor = "()I")
	public int method30774() {
		return this.anInt5065 * 1760788483;
	}

	@OriginalMember(owner = "client!rh", name = "al", descriptor = "(Lclient!wc;)V")
	public void method30775(@OriginalArg(0) Interface68 arg0) {
		this.anInterface68_1 = arg0;
		this.aFloat324 = 0.0F;
		this.aClass524_11 = Class524.aClass524_2;
	}

	@OriginalMember(owner = "client!rh", name = "bc", descriptor = "()Lclient!on;")
	public Class463 method30776() {
		return this.aClass463_63;
	}

	@OriginalMember(owner = "client!rh", name = "ba", descriptor = "(Ljava/lang/Object;)V")
	public void method30777(@OriginalArg(0) Object arg0) {
		this.anObject23 = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "bt", descriptor = "()Ljava/lang/Object;")
	public Object method30778() {
		return this.anObject23;
	}

	@OriginalMember(owner = "client!rh", name = "br", descriptor = "()Lclient!ra;")
	public Class524 method30779() {
		return this.aClass524_11;
	}

	@OriginalMember(owner = "client!rh", name = "bj", descriptor = "()Ljava/lang/Object;")
	public Object method30780() {
		return this.anObject24;
	}

	@OriginalMember(owner = "client!rh", name = "bq", descriptor = "(IZ)V")
	public void method30781(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean890 = arg1;
		this.anInt5067 = arg0 * -1006079341;
	}

	@OriginalMember(owner = "client!rh", name = "bb", descriptor = "(Lclient!on;)V")
	public void method30782(@OriginalArg(0) Class463 arg0) {
		this.aClass463_63 = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "bz", descriptor = "(Z)V")
	public void method30783(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rh", name = "be", descriptor = "()Lclient!wc;")
	public Interface68 method30784() {
		return this.anInterface68_1;
	}

	@OriginalMember(owner = "client!rh", name = "bh", descriptor = "()Lclient!wc;")
	public Interface68 method30785() {
		return this.anInterface68_1;
	}

	@OriginalMember(owner = "client!rh", name = "bv", descriptor = "(Lclient!on;)V")
	public void method30786(@OriginalArg(0) Class463 arg0) {
		this.aClass463_63 = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "bx", descriptor = "(F)V")
	public void method30787(@OriginalArg(0) float arg0) {
		this.aFloat326 = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "(II)V")
	public void method30788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass524_11.anInt5060 * 1548726705 >= Class524.aClass524_7.anInt5060 * 1548726705) {
			return;
		}
		if (this.aClass524_11.anInt5060 * 1548726705 < Class524.aClass524_5.anInt5060 * 1548726705) {
			this.aClass524_11 = Class524.aClass524_7;
			this.aBoolean888 = false;
			return;
		}
		@Pc(33) Iterator local33;
		@Pc(40) Class541 local40;
		if (arg0 > 0) {
			this.aClass524_11 = Class524.aClass524_6;
			local33 = this.aList22.iterator();
			while (local33.hasNext()) {
				local40 = (Class541) local33.next();
				if (local40.method31100(-1773996232) == this) {
					local40.method31069(0.0F, arg0, (byte) 0);
				} else {
					local33.remove();
				}
			}
			return;
		}
		local33 = this.aList22.iterator();
		while (local33.hasNext()) {
			local40 = (Class541) local33.next();
			if (local40.method31100(-2080425470) == this) {
				local40.method31073(-825189621);
			} else {
				local33.remove();
			}
		}
		this.aClass524_11 = Class524.aClass524_7;
		this.aBoolean888 = false;
	}

	@OriginalMember(owner = "client!rh", name = "bo", descriptor = "(Lclient!on;)V")
	public void method30789(@OriginalArg(0) Class463 arg0) {
		this.aClass463_63 = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(IZI)V")
	public void method30790(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aBoolean890 = arg1;
		this.anInt5067 = arg0 * -1006079341;
	}

	@OriginalMember(owner = "client!rh", name = "bf", descriptor = "()Lclient!on;")
	public Class463 method30791() {
		return this.aClass463_63;
	}

	@OriginalMember(owner = "client!rh", name = "bw", descriptor = "(F)V")
	public void method30792(@OriginalArg(0) float arg0) {
		this.aFloat326 = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "am", descriptor = "()V")
	public void method30793() {
		if (!this.aBoolean888 && (Class524.aClass524_4 != this.aClass524_11 && Class524.aClass524_1 != this.aClass524_11 && Class524.aClass524_9 != this.aClass524_11 && this.aClass524_11 != Class524.aClass524_6 && (this.aClass524_11.anInt5060 * 1548726705 <= Class524.aClass524_2.anInt5060 * 1548726705 || this.aClass524_11.anInt5060 * 1548726705 >= Class524.aClass524_7.anInt5060 * 1548726705))) {
			this.aClass524_11 = Class524.aClass524_3;
		}
	}

	@OriginalMember(owner = "client!rh", name = "ar", descriptor = "()V")
	public void method30794() {
		@Pc(3) Iterator local3 = this.aList22.iterator();
		this.aClass524_11 = Class524.aClass524_3;
		while (local3.hasNext()) {
			@Pc(13) Class541 local13 = (Class541) local3.next();
			if (local13.method31100(-2106529875) == this) {
				local13.method31126(2041458891);
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "bu", descriptor = "(F)V")
	public void method30795(@OriginalArg(0) float arg0) {
		this.aFloat323 = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "bm", descriptor = "(IZ)V")
	public void method30796(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean890 = arg1;
		this.anInt5067 = arg0 * -1006079341;
	}

	@OriginalMember(owner = "client!rh", name = "bk", descriptor = "(Z)V")
	public void method30797(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rh", name = "h", descriptor = "(ZI)V")
	public void method30798(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!rh", name = "cd", descriptor = "()Z")
	public boolean method30799() {
		this.aBoolean890 = false;
		return this.anInt5067 * 2022865819 != 0;
	}

	@OriginalMember(owner = "client!rh", name = "cv", descriptor = "()Z")
	public boolean method30800() {
		this.aBoolean890 = false;
		return this.anInt5067 * 2022865819 != 0;
	}

	@OriginalMember(owner = "client!rh", name = "ct", descriptor = "()V")
	public void method30801() {
		if (this.anInt5067 * 2022865819 > -1 && !this.aBoolean890) {
			this.anInt5067 -= -1006079341;
		}
		if (this.anInt5067 * 2022865819 == 0) {
			this.method30726(-1877013396);
		}
	}

	@OriginalMember(owner = "client!rh", name = "cn", descriptor = "()V")
	public void method30802() {
		if (this.anInt5067 * 2022865819 > -1 && !this.aBoolean890) {
			this.anInt5067 -= -1006079341;
		}
		if (this.anInt5067 * 2022865819 == 0) {
			this.method30726(-1742108129);
		}
	}

	@OriginalMember(owner = "client!rh", name = "bn", descriptor = "()Lclient!ra;")
	public Class524 method30803() {
		return this.aClass524_11;
	}

	@OriginalMember(owner = "client!rh", name = "ch", descriptor = "(ZI)V")
	public void method30804(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.aBoolean889 = arg0;
		this.anInt5066 = arg1 * -1392051977;
	}

	@OriginalMember(owner = "client!rh", name = "cc", descriptor = "(F)V")
	public void method30805(@OriginalArg(0) float arg0) {
		if (!(arg0 < 0.0F)) {
			this.aFloat325 = arg0;
		}
	}

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "(B)Ljava/lang/Object;")
	public Object method30806(@OriginalArg(0) byte arg0) {
		return this.anObject23;
	}

	@OriginalMember(owner = "client!rh", name = "bd", descriptor = "(IZ)V")
	public void method30807(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean890 = arg1;
		this.anInt5067 = arg0 * -1006079341;
	}

	@OriginalMember(owner = "client!rh", name = "cs", descriptor = "(F)V")
	public void method30808(@OriginalArg(0) float arg0) {
		if (!(arg0 < 0.0F)) {
			this.aFloat325 = arg0;
		}
	}
}
