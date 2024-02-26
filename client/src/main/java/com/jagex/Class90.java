package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Random;

@OriginalClass("client!adw")
public final class Class90 {

	@OriginalMember(owner = "client!adw", name = "o", descriptor = "[Lclient!wq;")
	static Class644[] aClass644Array1;

	@OriginalMember(owner = "client!adw", name = "t", descriptor = "I")
	static final int anInt321 = 0;

	@OriginalMember(owner = "client!adw", name = "kt", descriptor = "I")
	static int anInt323;

	@OriginalMember(owner = "client!adw", name = "f", descriptor = "Lclient!pf;")
	final Class480 aClass480_14;

	@OriginalMember(owner = "client!adw", name = "e", descriptor = "[Lclient!adp;")
	final Class86[] aClass86Array1;

	@OriginalMember(owner = "client!adw", name = "u", descriptor = "I")
	final int anInt322;

	@OriginalMember(owner = "client!adw", name = "azn", descriptor = "(Lclient!yp;I)V")
	static void method1868(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub6_1.method15932(2028401389) ? 1 : 0;
	}

	@OriginalMember(owner = "client!adw", name = "axu", descriptor = "(ILclient!hx;Lclient!yp;B)V")
	static void method1869(@OriginalArg(0) int arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) byte arg3) {
		if (arg0 < 1 || arg0 > 10) {
			throw new RuntimeException();
		}
		Class665.method33454(arg0, arg1.anInt4087 * -2053489901, arg1.anInt4094 * 2071556223, "", 2036048143);
	}

	@OriginalMember(owner = "client!adw", name = "f", descriptor = "(II)Ljava/lang/String;")
	public static String method1870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return "<col=" + Integer.toHexString(arg0) + ">";
	}

	@OriginalMember(owner = "client!adw", name = "od", descriptor = "(Lclient!yp;I)V")
	static void method1871(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2112614029);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class50.method1040(local16, local22, arg0, (byte) -84);
	}

	@OriginalMember(owner = "client!adw", name = "<init>", descriptor = "(Lclient!zy;Lclient!zv;Lclient!pf;)V")
	public Class90(@OriginalArg(0) Class722 arg0, @OriginalArg(1) Class719 arg1, @OriginalArg(2) Class480 arg2) {
		this.aClass480_14 = arg2;
		@Pc(14) Packet local14 = new Packet(this.aClass480_14.method29918(0, 0, 1896589581));
		@Pc(29) int local29 = local14.data == null || local14.data.length < 1 ? -1 : local14.g1();
		if (local29 < 4) {
			this.aClass86Array1 = new Class86[0];
			this.anInt322 = 1269897521;
		} else {
			@Pc(44) int local44 = local14.g1();
			@Pc(47) Class392[] local47 = Class348.method27985(194076605);
			@Pc(49) boolean local49 = true;
			@Pc(58) int local58;
			@Pc(66) int local66;
			if (local44 == local47.length) {
				for (local58 = 0; local58 < local47.length; local58++) {
					local66 = local14.g1();
					if (local66 != local47[local58].anInt4562 * -39715273) {
						local49 = false;
						break;
					}
				}
			} else {
				local49 = false;
			}
			if (local49) {
				local58 = local14.g1();
				local66 = local14.g1();
				@Pc(107) int local107;
				@Pc(103) int local103;
				if (local29 > 2) {
					this.anInt322 = local14.g2s() * -1269897521;
					local103 = local14.g3();
					local107 = local14.g2();
				} else {
					this.anInt322 = 1269897521;
					local103 = 0;
					local107 = 0;
				}
				this.aClass86Array1 = new Class86[local66 + 1];
				@Pc(123) int local123;
				for (local123 = 0; local123 < local58; local123++) {
					@Pc(130) int local130 = local14.g1();
					@Pc(139) boolean local139 = local14.g1() == 1;
					@Pc(143) int local143 = local14.g2();
					@Pc(152) Class92[] local152;
					@Pc(154) int local154;
					@Pc(161) int local161;
					@Pc(165) int local165;
					@Pc(169) int local169;
					if (-1087741905 * this.anInt322 == -1) {
						local152 = new Class92[local143];
						for (local154 = 0; local154 < local143; local154++) {
							local161 = local14.g2();
							local165 = local14.g3();
							local169 = local14.g2();
							local152[local154] = new Class92(local161, local165, local169);
						}
						this.aClass86Array1[local130] = new Class86(local139, local152);
					} else {
						local152 = new Class92[local143 + 1];
						local152[0] = new Class92(this.anInt322 * -1087741905, local103, local107);
						for (local154 = 0; local154 < local143; local154++) {
							local161 = local14.g2();
							local165 = local14.g3();
							local169 = local14.g2();
							local152[local154 + 1] = new Class92(local161, local165, local169);
						}
					}
					this.aClass86Array1[local130] = new Class86(local139, local152);
				}
				for (local123 = 0; local123 < local66 + 1; local123++) {
					if (this.aClass86Array1[local123] == null) {
						this.aClass86Array1[local123] = this.method1859(local103, local107, 541143891);
					}
				}
			} else {
				this.aClass86Array1 = new Class86[0];
				this.anInt322 = 1269897521;
			}
		}
	}

	@OriginalMember(owner = "client!adw", name = "l", descriptor = "(II)Lclient!adp;")
	Class86 method1855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (-1087741905 * this.anInt322 == -1) {
			return new Class86(false, new Class92[0]);
		} else {
			@Pc(22) Class92 local22 = new Class92(this.anInt322 * -1087741905, arg0, arg1);
			return new Class86(false, new Class92[] { local22 });
		}
	}

	@OriginalMember(owner = "client!adw", name = "e", descriptor = "(II)[Lclient!ady;")
	public Class92[] method1856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || arg0 >= this.aClass86Array1.length) {
			return this.method1859(0, 0, 1684478040).aClass92Array1;
		}
		@Pc(18) Class86 local18 = this.aClass86Array1[arg0];
		if (!local18.aBoolean45 || local18.aClass92Array1.length <= 1) {
			return local18.aClass92Array1;
		}
		@Pc(39) int local39 = -1087741905 * this.anInt322 == -1 ? 0 : 1;
		@Pc(43) Random local43 = new Random();
		@Pc(48) Class92[] local48 = new Class92[local18.aClass92Array1.length];
		System.arraycopy(local18.aClass92Array1, 0, local48, 0, local48.length);
		for (@Pc(58) int local58 = local39; local58 < local48.length; local58++) {
			@Pc(72) int local72 = Class169.method21690(local43, local48.length - local39, -787895169) + local39;
			@Pc(77) Class92 local77 = local18.aClass92Array1[local58];
			local48[local58] = local48[local72];
			local48[local72] = local77;
		}
		return local48;
	}

	@OriginalMember(owner = "client!adw", name = "f", descriptor = "(II)Lclient!adc;")
	public Class78 method1857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) byte[] local6 = this.aClass480_14.method29918(arg0, 0, 1896589581);
		@Pc(10) Class78 local10 = new Class78();
		local10.method1371(new Packet(local6), -841090123);
		return local10;
	}

	@OriginalMember(owner = "client!adw", name = "g", descriptor = "(II)Lclient!adp;")
	Class86 method1858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (-1087741905 * this.anInt322 == -1) {
			return new Class86(false, new Class92[0]);
		} else {
			@Pc(22) Class92 local22 = new Class92(this.anInt322 * -1087741905, arg0, arg1);
			return new Class86(false, new Class92[] { local22 });
		}
	}

	@OriginalMember(owner = "client!adw", name = "t", descriptor = "(III)Lclient!adp;")
	Class86 method1859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (-1087741905 * this.anInt322 == -1) {
			return new Class86(false, new Class92[0]);
		} else {
			@Pc(22) Class92 local22 = new Class92(this.anInt322 * -1087741905, arg0, arg1);
			return new Class86(false, new Class92[] { local22 });
		}
	}

	@OriginalMember(owner = "client!adw", name = "u", descriptor = "(B)Z")
	public boolean method1860(@OriginalArg(0) byte arg0) {
		return this.anInt322 * -1087741905 != -1;
	}

	@OriginalMember(owner = "client!adw", name = "i", descriptor = "(I)Lclient!adc;")
	public Class78 method1861(@OriginalArg(0) int arg0) {
		@Pc(6) byte[] local6 = this.aClass480_14.method29918(arg0, 0, 1896589581);
		@Pc(10) Class78 local10 = new Class78();
		local10.method1371(new Packet(local6), -1764740085);
		return local10;
	}

	@OriginalMember(owner = "client!adw", name = "m", descriptor = "(I)Lclient!adc;")
	public Class78 method1862(@OriginalArg(0) int arg0) {
		@Pc(6) byte[] local6 = this.aClass480_14.method29918(arg0, 0, 1896589581);
		@Pc(10) Class78 local10 = new Class78();
		local10.method1371(new Packet(local6), 738396878);
		return local10;
	}

	@OriginalMember(owner = "client!adw", name = "o", descriptor = "(I)[Lclient!ady;")
	public Class92[] method1863(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.aClass86Array1.length) {
			return this.method1859(0, 0, -794627006).aClass92Array1;
		}
		@Pc(18) Class86 local18 = this.aClass86Array1[arg0];
		if (!local18.aBoolean45 || local18.aClass92Array1.length <= 1) {
			return local18.aClass92Array1;
		}
		@Pc(39) int local39 = -1087741905 * this.anInt322 == -1 ? 0 : 1;
		@Pc(43) Random local43 = new Random();
		@Pc(48) Class92[] local48 = new Class92[local18.aClass92Array1.length];
		System.arraycopy(local18.aClass92Array1, 0, local48, 0, local48.length);
		for (@Pc(58) int local58 = local39; local58 < local48.length; local58++) {
			@Pc(72) int local72 = Class169.method21690(local43, local48.length - local39, -787895169) + local39;
			@Pc(77) Class92 local77 = local18.aClass92Array1[local58];
			local48[local58] = local48[local72];
			local48[local72] = local77;
		}
		return local48;
	}

	@OriginalMember(owner = "client!adw", name = "j", descriptor = "(I)[Lclient!ady;")
	public Class92[] method1864(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.aClass86Array1.length) {
			return this.method1859(0, 0, -1306112075).aClass92Array1;
		}
		@Pc(18) Class86 local18 = this.aClass86Array1[arg0];
		if (!local18.aBoolean45 || local18.aClass92Array1.length <= 1) {
			return local18.aClass92Array1;
		}
		@Pc(39) int local39 = -1087741905 * this.anInt322 == -1 ? 0 : 1;
		@Pc(43) Random local43 = new Random();
		@Pc(48) Class92[] local48 = new Class92[local18.aClass92Array1.length];
		System.arraycopy(local18.aClass92Array1, 0, local48, 0, local48.length);
		for (@Pc(58) int local58 = local39; local58 < local48.length; local58++) {
			@Pc(72) int local72 = Class169.method21690(local43, local48.length - local39, -787895169) + local39;
			@Pc(77) Class92 local77 = local18.aClass92Array1[local58];
			local48[local58] = local48[local72];
			local48[local72] = local77;
		}
		return local48;
	}

	@OriginalMember(owner = "client!adw", name = "a", descriptor = "(I)[Lclient!ady;")
	public Class92[] method1865(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.aClass86Array1.length) {
			return this.method1859(0, 0, 1714191103).aClass92Array1;
		}
		@Pc(18) Class86 local18 = this.aClass86Array1[arg0];
		if (!local18.aBoolean45 || local18.aClass92Array1.length <= 1) {
			return local18.aClass92Array1;
		}
		@Pc(39) int local39 = -1087741905 * this.anInt322 == -1 ? 0 : 1;
		@Pc(43) Random local43 = new Random();
		@Pc(48) Class92[] local48 = new Class92[local18.aClass92Array1.length];
		System.arraycopy(local18.aClass92Array1, 0, local48, 0, local48.length);
		for (@Pc(58) int local58 = local39; local58 < local48.length; local58++) {
			@Pc(72) int local72 = Class169.method21690(local43, local48.length - local39, -787895169) + local39;
			@Pc(77) Class92 local77 = local18.aClass92Array1[local58];
			local48[local58] = local48[local72];
			local48[local72] = local77;
		}
		return local48;
	}

	@OriginalMember(owner = "client!adw", name = "s", descriptor = "(I)[Lclient!ady;")
	public Class92[] method1866(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.aClass86Array1.length) {
			return this.method1859(0, 0, -515496405).aClass92Array1;
		}
		@Pc(18) Class86 local18 = this.aClass86Array1[arg0];
		if (!local18.aBoolean45 || local18.aClass92Array1.length <= 1) {
			return local18.aClass92Array1;
		}
		@Pc(39) int local39 = -1087741905 * this.anInt322 == -1 ? 0 : 1;
		@Pc(43) Random local43 = new Random();
		@Pc(48) Class92[] local48 = new Class92[local18.aClass92Array1.length];
		System.arraycopy(local18.aClass92Array1, 0, local48, 0, local48.length);
		for (@Pc(58) int local58 = local39; local58 < local48.length; local58++) {
			@Pc(72) int local72 = Class169.method21690(local43, local48.length - local39, -787895169) + local39;
			@Pc(77) Class92 local77 = local18.aClass92Array1[local58];
			local48[local58] = local48[local72];
			local48[local72] = local77;
		}
		return local48;
	}

	@OriginalMember(owner = "client!adw", name = "k", descriptor = "()Z")
	public boolean method1867() {
		return this.anInt322 * -1087741905 != -1;
	}
}
