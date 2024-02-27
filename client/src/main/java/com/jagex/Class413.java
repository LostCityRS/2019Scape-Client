package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;

@OriginalClass("client!mb")
public final class Class413 {

	@OriginalMember(owner = "client!mb", name = "nk", descriptor = "[Lclient!aaz;")
	static Class26[] aClass26Array1;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "Lclient!mb;")
	Class413 aClass413_1;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "Lclient!ms;")
	Interface43 anInterface43_1;

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "F")
	float aFloat287;

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "F")
	float aFloat290;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "F")
	float aFloat289;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "F")
	float aFloat288;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "J")
	long aLong380;

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "J")
	long aLong379;

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "(Ljava/awt/Component;ZI)Lclient!um;")
	public static Class152 method28988(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		return new Class152_Sub1(arg0, arg1);
	}

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method28989(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			@Pc(13) char local13 = arg0.charAt(local6);
			if (local13 == '<' || local13 == '>') {
				local4 += 3;
			}
		}
		@Pc(29) StringBuilder local29 = new StringBuilder(local4 + local2);
		for (@Pc(31) int local31 = 0; local31 < local2; local31++) {
			@Pc(38) char local38 = arg0.charAt(local31);
			if (local38 == '<') {
				local29.append("<lt>");
			} else if (local38 == '>') {
				local29.append("<gt>");
			} else {
				local29.append(local38);
			}
		}
		return local29.toString();
	}

	@OriginalMember(owner = "client!mb", name = "ii", descriptor = "(Lclient!yp;B)V")
	static void method28990(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2055392566);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class642.method32960(local16, local22, arg0, -1116459810);
	}

	@OriginalMember(owner = "client!mb", name = "ba", descriptor = "(Lclient!arz;Lclient!aan;B)I")
	static int method28991(@OriginalArg(0) Class80_Sub1_Sub11 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) byte arg2) {
		@Pc(3) String local3 = Class665.method33451(arg0, (byte) 8);
		@Pc(7) int[] local7 = Class357.method28122(arg0, 1012231181);
		if (local7 != null) {
			local3 = local3 + Class279.method26846(local7, 1903719770);
		}
		@Pc(26) int local26 = arg1.method374(local3, Class344.aClass99Array6, -1892446301);
		if (arg0.aBoolean588) {
			local26 += Class11.aClass99_1.method18218() + 4;
		}
		return local26;
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IFLjava/lang/Object;Lclient!mt;Lclient!ms;Lclient!mb;)V")
	Class413(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) Class425 arg3, @OriginalArg(4) Interface43 arg4, @OriginalArg(5) Class413 arg5) {
		this.aClass413_1 = arg5;
		this.anInterface43_1 = arg4;
		this.aFloat287 = 1.0F;
		this.aFloat290 = arg1;
		this.aFloat289 = -1.0F;
		this.aFloat288 = -1.0F;
		this.aLong380 = -3830625284655284973L;
		this.aLong379 = 9117440030483080801L;
	}

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "(I)F")
	float method28968(@OriginalArg(0) int arg0) {
		return this.aFloat290;
	}

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "(F)V")
	public void method28969(@OriginalArg(0) float arg0) {
		if (this.anInterface43_1 == null) {
			this.aFloat288 = arg0;
			this.aFloat289 = this.aFloat287;
			this.aLong380 = Class303.currentTimeMillis((byte) 67) * 3830625284655284973L;
			this.aLong379 = this.aLong380 * -2505719051048353477L + -7853543436540050916L;
		}
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)F")
	public float method28970(@OriginalArg(0) int arg0) {
		@Pc(1) float local1 = 1.0F;
		for (@Pc(3) Class413 local3 = this; local3 != null; local3 = local3.method28974((short) -28759)) {
			local1 *= local3.method28968(778870839);
		}
		return local1;
	}

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "(F)V")
	public void method28971(@OriginalArg(0) float arg0) {
		if (this.anInterface43_1 == null) {
			this.aFloat288 = arg0;
			this.aFloat289 = this.aFloat287;
			this.aLong380 = Class303.currentTimeMillis((byte) 30) * 3830625284655284973L;
			this.aLong379 = this.aLong380 * -2505719051048353477L + -7853543436540050916L;
		}
	}

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "(S)F")
	public float method28972(@OriginalArg(0) short arg0) {
		@Pc(2) float local2 = this.aFloat287;
		for (@Pc(5) Class413 local5 = this.aClass413_1; local5 != null; local5 = local5.method28974((short) -18901)) {
			local2 *= local5.method28978(-1106986504);
		}
		return Math.min(Math.max(local2, 0.0F), 1.0F);
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(FI)V")
	public void method28973(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		if (this.anInterface43_1 == null) {
			this.aFloat288 = arg0;
			this.aFloat289 = this.aFloat287;
			this.aLong380 = Class303.currentTimeMillis((byte) 105) * 3830625284655284973L;
			this.aLong379 = this.aLong380 * -2505719051048353477L + -7853543436540050916L;
		}
	}

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "(S)Lclient!mb;")
	public Class413 method28974(@OriginalArg(0) short arg0) {
		return this.aClass413_1;
	}

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "()F")
	float method28975() {
		return this.aFloat290;
	}

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "()F")
	float method28976() {
		return this.aFloat290;
	}

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "()F")
	public float method28977() {
		@Pc(2) float local2 = this.aFloat287;
		for (@Pc(5) Class413 local5 = this.aClass413_1; local5 != null; local5 = local5.method28974((short) -393)) {
			local2 *= local5.method28978(627177536);
		}
		return Math.min(Math.max(local2, 0.0F), 1.0F);
	}

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "(I)F")
	public float method28978(@OriginalArg(0) int arg0) {
		return this.aFloat287;
	}

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "()V")
	void method28979() {
		if (this.anInterface43_1 != null) {
			@Pc(8) float local8 = this.anInterface43_1.method26841(440266876);
			if (this.aFloat287 != local8 && this.aFloat288 < 0.0F) {
				this.aFloat289 = this.aFloat287;
				this.aFloat288 = local8;
				this.aLong380 = Class303.currentTimeMillis((byte) 77) * 3830625284655284973L;
				this.aLong379 = this.aLong380 * -2505719051048353477L + -7853543436540050916L;
			}
		}
		if (this.aFloat288 >= 0.0F) {
			@Pc(47) long local47 = Class303.currentTimeMillis((byte) 100);
			if (local47 > this.aLong379 * -6383271465288744353L) {
				this.aFloat287 = this.aFloat288;
				this.aFloat288 = -1.0F;
			} else {
				@Pc(68) float local68 = this.aFloat288 - this.aFloat289;
				@Pc(78) long local78 = this.aLong379 * -6383271465288744353L - this.aLong380 * 6089770044387666661L;
				@Pc(83) float local83 = local68 / (float) local78;
				this.aFloat287 = (float) (local47 - this.aLong380 * 6089770044387666661L) * local83 + this.aFloat289;
				if (this.aFloat287 == this.aFloat288) {
					this.aFloat288 = -1.0F;
				}
			}
		}
		this.aFloat287 = Math.min(1.0F, Math.max(this.aFloat287, 0.0F));
	}

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "()V")
	void method28980() {
		if (this.anInterface43_1 != null) {
			@Pc(8) float local8 = this.anInterface43_1.method26841(-1120669985);
			if (this.aFloat287 != local8 && this.aFloat288 < 0.0F) {
				this.aFloat289 = this.aFloat287;
				this.aFloat288 = local8;
				this.aLong380 = Class303.currentTimeMillis((byte) 86) * 3830625284655284973L;
				this.aLong379 = this.aLong380 * -2505719051048353477L + -7853543436540050916L;
			}
		}
		if (this.aFloat288 >= 0.0F) {
			@Pc(47) long local47 = Class303.currentTimeMillis((byte) 68);
			if (local47 > this.aLong379 * -6383271465288744353L) {
				this.aFloat287 = this.aFloat288;
				this.aFloat288 = -1.0F;
			} else {
				@Pc(68) float local68 = this.aFloat288 - this.aFloat289;
				@Pc(78) long local78 = this.aLong379 * -6383271465288744353L - this.aLong380 * 6089770044387666661L;
				@Pc(83) float local83 = local68 / (float) local78;
				this.aFloat287 = (float) (local47 - this.aLong380 * 6089770044387666661L) * local83 + this.aFloat289;
				if (this.aFloat287 == this.aFloat288) {
					this.aFloat288 = -1.0F;
				}
			}
		}
		this.aFloat287 = Math.min(1.0F, Math.max(this.aFloat287, 0.0F));
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "()F")
	float method28981() {
		return this.aFloat290;
	}

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "()F")
	public float method28982() {
		return this.aFloat287;
	}

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "(F)V")
	public void method28983(@OriginalArg(0) float arg0) {
		if (this.anInterface43_1 == null) {
			this.aFloat288 = arg0;
			this.aFloat289 = this.aFloat287;
			this.aLong380 = Class303.currentTimeMillis((byte) 9) * 3830625284655284973L;
			this.aLong379 = this.aLong380 * -2505719051048353477L + -7853543436540050916L;
		}
	}

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "(F)V")
	public void method28984(@OriginalArg(0) float arg0) {
		if (this.anInterface43_1 == null) {
			this.aFloat288 = arg0;
			this.aFloat289 = this.aFloat287;
			this.aLong380 = Class303.currentTimeMillis((byte) 85) * 3830625284655284973L;
			this.aLong379 = this.aLong380 * -2505719051048353477L + -7853543436540050916L;
		}
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V")
	void method28985(@OriginalArg(0) int arg0) {
		if (this.anInterface43_1 != null) {
			@Pc(8) float local8 = this.anInterface43_1.method26841(255523116);
			if (this.aFloat287 != local8 && this.aFloat288 < 0.0F) {
				this.aFloat289 = this.aFloat287;
				this.aFloat288 = local8;
				this.aLong380 = Class303.currentTimeMillis((byte) 41) * 3830625284655284973L;
				this.aLong379 = this.aLong380 * -2505719051048353477L + -7853543436540050916L;
			}
		}
		if (this.aFloat288 >= 0.0F) {
			@Pc(47) long local47 = Class303.currentTimeMillis((byte) 17);
			if (local47 > this.aLong379 * -6383271465288744353L) {
				this.aFloat287 = this.aFloat288;
				this.aFloat288 = -1.0F;
			} else {
				@Pc(68) float local68 = this.aFloat288 - this.aFloat289;
				@Pc(78) long local78 = this.aLong379 * -6383271465288744353L - this.aLong380 * 6089770044387666661L;
				@Pc(83) float local83 = local68 / (float) local78;
				this.aFloat287 = (float) (local47 - this.aLong380 * 6089770044387666661L) * local83 + this.aFloat289;
				if (this.aFloat287 == this.aFloat288) {
					this.aFloat288 = -1.0F;
				}
			}
		}
		this.aFloat287 = Math.min(1.0F, Math.max(this.aFloat287, 0.0F));
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(F)V")
	public void method28986(@OriginalArg(0) float arg0) {
		if (this.anInterface43_1 == null) {
			this.aFloat288 = arg0;
			this.aFloat289 = this.aFloat287;
			this.aLong380 = Class303.currentTimeMillis((byte) 109) * 3830625284655284973L;
			this.aLong379 = this.aLong380 * -2505719051048353477L + -7853543436540050916L;
		}
	}

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "()F")
	float method28987() {
		return this.aFloat290;
	}
}
