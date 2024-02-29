package com.jagex;

import java.awt.Frame;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public abstract class Class115 {

	@OriginalMember(owner = "client!ho", name = "t", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!ho", name = "ah", descriptor = "I")
	static int anInt972;

	@OriginalMember(owner = "client!ho", name = "u", descriptor = "Lclient!it;")
	static final Interface28 anInterface28_3 = new Class311();

	@OriginalMember(owner = "client!ho", name = "l", descriptor = "I")
	protected int anInt971 = -571593063;

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "Ljava/lang/String;")
	String aString38;

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
	int anInt969;

	@OriginalMember(owner = "client!ho", name = "m", descriptor = "Lclient!ix;")
	Class352 aClass352_6;

	@OriginalMember(owner = "client!ho", name = "w", descriptor = "I")
	int anInt970;

	@OriginalMember(owner = "client!ho", name = "k", descriptor = "Lclient!ix;")
	Class352 aClass352_5;

	@OriginalMember(owner = "client!ho", name = "n", descriptor = "[Lclient!hi;")
	Class116[] aClass116Array3;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!afc;Lclient!hj;)V", line = 24)
	Class115(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class314 arg1) {
		this.aString38 = arg1.aString169;
		this.anInt969 = arg1.aClass325Array1.length * 630083593;
		this.aClass352_6 = new Class352(this.anInt969 * 1811824185, anInterface28_3);
		@Pc(27) int local27;
		for (local27 = 0; local27 < this.anInt969 * 1811824185; local27++) {
			this.aClass352_6.method27668(local27, arg1.aClass325Array1[local27].aString176, this.method8302(arg1.aClass325Array1[local27]), (byte) 58);
		}
		this.anInt970 = arg1.aClass325Array2.length * 1160678747;
		this.aClass352_5 = new Class352(this.anInt970 * 1281809107, anInterface28_3);
		for (local27 = 0; local27 < this.anInt970 * 1281809107; local27++) {
			this.aClass352_5.method27668(local27, arg1.aClass325Array2[local27].aString176, this.method8302(arg1.aClass325Array2[local27]), (byte) 95);
		}
		this.aClass116Array3 = new Class116[arg1.aClass318Array1.length];
		for (local27 = 0; local27 < arg1.aClass318Array1.length; local27++) {
			this.aClass116Array3[local27] = this.method8299(arg0, arg1.aClass318Array1[local27]);
		}
	}

	@OriginalMember(owner = "client!ho", name = "ab", descriptor = "()Ljava/lang/String;", line = 47)
	public String method8192() {
		return this.aString38;
	}

	@OriginalMember(owner = "client!ho", name = "k", descriptor = "(I)Ljava/lang/String;", line = 47)
	public String method8193(@OriginalArg(0) int arg0) {
		return this.aString38;
	}

	@OriginalMember(owner = "client!ho", name = "az", descriptor = "()Ljava/lang/String;", line = 47)
	public String method8194() {
		return this.aString38;
	}

	@OriginalMember(owner = "client!ho", name = "aa", descriptor = "()Ljava/lang/String;", line = 47)
	public String method8195() {
		return this.aString38;
	}

	@OriginalMember(owner = "client!ho", name = "n", descriptor = "(Lclient!abv;Lclient!alw;II)Lclient!abw;", line = 48)
	static Class48 method8196(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class93_Sub41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class48 local4 = new Class48(arg0);
		@Pc(8) int local8 = arg1.method22465((short) 16384);
		@Pc(16) boolean local16 = (local8 & 0x1) != 0;
		@Pc(24) boolean local24 = (local8 & 0x2) != 0;
		@Pc(32) boolean local32 = (local8 & 0x4) != 0;
		@Pc(41) boolean local41 = (local8 & 0x8) != 0;
		if (local16) {
			if (arg2 <= 1) {
				local4.anIntArray14[0] = arg1.method22472(-1434290800);
				local4.anIntArray12[0] = arg1.method22472(-1434290800);
			} else {
				local4.anIntArray14[0] = arg1.method22542(-776001146);
				local4.anIntArray12[0] = arg1.method22542(-497046281);
			}
			if (arg0.anInt143 * 876926327 != -1 || arg0.anInt158 * 61740559 != -1) {
				if (arg2 <= 1) {
					local4.anIntArray14[1] = arg1.method22472(-1434290800);
					local4.anIntArray12[1] = arg1.method22472(-1434290800);
				} else {
					local4.anIntArray14[1] = arg1.method22542(-1520765468);
					local4.anIntArray12[1] = arg1.method22542(-548476675);
				}
			}
			if (arg0.anInt159 * -606200001 != -1 || arg0.anInt160 * -492567931 != -1) {
				if (arg2 <= 1) {
					local4.anIntArray14[2] = arg1.method22472(-1434290800);
					local4.anIntArray12[2] = arg1.method22472(-1434290800);
				} else {
					local4.anIntArray14[2] = arg1.method22542(-256435210);
					local4.anIntArray12[2] = arg1.method22542(-1341653095);
				}
			}
		}
		if (local24) {
			if (arg2 <= 1) {
				local4.anIntArray13[0] = arg1.method22472(-1434290800);
				local4.anIntArray15[0] = arg1.method22472(-1434290800);
			} else {
				local4.anIntArray13[0] = arg1.method22542(-1405354356);
				local4.anIntArray15[0] = arg1.method22542(-872500586);
			}
			if (arg0.anInt141 * 1052917305 != -1 || arg0.anInt168 * -1920351591 != -1) {
				if (arg2 <= 1) {
					local4.anIntArray13[1] = arg1.method22472(-1434290800);
					local4.anIntArray15[1] = arg1.method22472(-1434290800);
				} else {
					local4.anIntArray13[1] = arg1.method22542(-1817063843);
					local4.anIntArray15[1] = arg1.method22542(-1454531620);
				}
			}
		}
		@Pc(247) int local247;
		@Pc(250) int[] local250;
		@Pc(282) int local282;
		if (local32) {
			local247 = arg1.method22472(-1434290800);
			local250 = new int[] { local247 & 0xF, local247 >> 4 & 0xF, local247 >> 8 & 0xF, local247 >> 12 & 0xF };
			for (local282 = 0; local282 < 4; local282++) {
				if (local250[local282] != 15) {
					local4.aShortArray6[local250[local282]] = (short) arg1.method22472(-1434290800);
				}
			}
		}
		if (local41) {
			local247 = arg1.method22465((short) 16384);
			local250 = new int[] { local247 & 0xF, local247 >> 4 & 0xF };
			for (local282 = 0; local282 < 2; local282++) {
				if (local250[local282] != 15) {
					local4.aShortArray7[local250[local282]] = (short) arg1.method22472(-1434290800);
				}
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!ho", name = "m", descriptor = "(Lclient!aae;Ljava/awt/Frame;I)V", line = 52)
	public static void method8197(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Frame arg1, @OriginalArg(2) int arg2) {
		arg0.method113(1128822054);
		arg1.setVisible(false);
		arg1.dispose();
	}

	@OriginalMember(owner = "client!ho", name = "an", descriptor = "(Ljava/lang/String;)Lclient!hi;", line = 54)
	public Class116 method8198(@OriginalArg(0) String arg0) throws Exception_Sub2_Sub2 {
		@Pc(2) Class116[] local2 = this.aClass116Array3;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class116 local12 = local2[local4];
			@Pc(16) String local16 = local12.method8436((short) 256);
			if (local16 != null && local16.equals(arg0)) {
				if (!local12.method8444()) {
					throw new Exception_Sub2_Sub2(arg0);
				}
				return local12;
			}
		}
		throw new Exception_Sub2_Sub2(arg0);
	}

	@OriginalMember(owner = "client!ho", name = "w", descriptor = "(Ljava/lang/String;I)Lclient!hi;", line = 54)
	public Class116 method8199(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) throws Exception_Sub2_Sub2 {
		@Pc(2) Class116[] local2 = this.aClass116Array3;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class116 local12 = local2[local4];
			@Pc(16) String local16 = local12.method8436((short) 256);
			if (local16 != null && local16.equals(arg0)) {
				if (!local12.method8444()) {
					throw new Exception_Sub2_Sub2(arg0);
				}
				return local12;
			}
		}
		throw new Exception_Sub2_Sub2(arg0);
	}

	@OriginalMember(owner = "client!ho", name = "l", descriptor = "(B)I", line = 70)
	public final int method8200(@OriginalArg(0) byte arg0) {
		return this.aClass116Array3.length;
	}

	@OriginalMember(owner = "client!ho", name = "bf", descriptor = "()I", line = 70)
	public final int method8201() {
		return this.aClass116Array3.length;
	}

	@OriginalMember(owner = "client!ho", name = "bl", descriptor = "()I", line = 70)
	public final int method8202() {
		return this.aClass116Array3.length;
	}

	@OriginalMember(owner = "client!ho", name = "u", descriptor = "(II)Lclient!hi;", line = 74)
	public final Class116 method8203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass116Array3[arg0];
	}

	@OriginalMember(owner = "client!ho", name = "bk", descriptor = "(I)Lclient!hi;", line = 74)
	public final Class116 method8204(@OriginalArg(0) int arg0) {
		return this.aClass116Array3[arg0];
	}

	@OriginalMember(owner = "client!ho", name = "z", descriptor = "(Lclient!hi;I)I", line = 78)
	public int method8205(@OriginalArg(0) Class116 arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass116Array3.length; local1++) {
			if (arg0 == this.aClass116Array3[local1]) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ho", name = "bh", descriptor = "(Lclient!hi;)I", line = 78)
	public int method8206(@OriginalArg(0) Class116 arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass116Array3.length; local1++) {
			if (arg0 == this.aClass116Array3[local1]) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ho", name = "bx", descriptor = "(Lclient!hi;)I", line = 78)
	public int method8207(@OriginalArg(0) Class116 arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass116Array3.length; local1++) {
			if (arg0 == this.aClass116Array3[local1]) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ho", name = "bd", descriptor = "()Lclient!hi;", line = 86)
	public Class116 method8208() {
		@Pc(2) Class116[] local2 = this.aClass116Array3;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class116 local12 = local2[local4];
			if (local12.method8444()) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ho", name = "bc", descriptor = "()Lclient!hi;", line = 86)
	public Class116 method8209() {
		@Pc(2) Class116[] local2 = this.aClass116Array3;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class116 local12 = local2[local4];
			if (local12.method8444()) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ho", name = "bi", descriptor = "()Lclient!hi;", line = 86)
	public Class116 method8210() {
		@Pc(2) Class116[] local2 = this.aClass116Array3;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class116 local12 = local2[local4];
			if (local12.method8444()) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ho", name = "p", descriptor = "(I)Lclient!hi;", line = 86)
	public Class116 method8211(@OriginalArg(0) int arg0) {
		@Pc(2) Class116[] local2 = this.aClass116Array3;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class116 local12 = local2[local4];
			if (local12.method8444()) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ho", name = "bm", descriptor = "()Lclient!hi;", line = 100)
	public final Class116 method8212() {
		return this.anInt971 * 1454094935 >= 0 ? this.aClass116Array3[this.anInt971 * 1454094935] : null;
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(B)Lclient!hi;", line = 100)
	public final Class116 method8213(@OriginalArg(0) byte arg0) {
		return this.anInt971 * 1454094935 >= 0 ? this.aClass116Array3[this.anInt971 * 1454094935] : null;
	}

	@OriginalMember(owner = "client!ho", name = "bb", descriptor = "()Lclient!hi;", line = 100)
	public final Class116 method8214() {
		return this.anInt971 * 1454094935 >= 0 ? this.aClass116Array3[this.anInt971 * 1454094935] : null;
	}

	@OriginalMember(owner = "client!ho", name = "by", descriptor = "()I", line = 104)
	public final int method8215() {
		return this.anInt971 * 1454094935;
	}

	@OriginalMember(owner = "client!ho", name = "r", descriptor = "(I)I", line = 104)
	public final int method8216(@OriginalArg(0) int arg0) {
		return this.anInt971 * 1454094935;
	}

	@OriginalMember(owner = "client!ho", name = "be", descriptor = "()I", line = 104)
	public final int method8217() {
		return this.anInt971 * 1454094935;
	}

	@OriginalMember(owner = "client!ho", name = "bo", descriptor = "(Lclient!aql;F)V", line = 110)
	public final void method8218(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8445(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "bz", descriptor = "(Lclient!aql;F)V", line = 110)
	public final void method8219(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8445(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "o", descriptor = "(Lclient!aql;FB)V", line = 110)
	public final void method8220(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) byte arg2) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8445(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "s", descriptor = "(Lclient!aql;FFB)V", line = 114)
	public final void method8221(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) byte arg3) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8446(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ho", name = "y", descriptor = "(Lclient!aql;FFFI)V", line = 118)
	public final void method8222(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8467(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ho", name = "bv", descriptor = "(Lclient!aql;FFF)V", line = 118)
	public final void method8223(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8467(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ho", name = "br", descriptor = "(Lclient!aql;FFF)V", line = 118)
	public final void method8224(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8467(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ho", name = "bg", descriptor = "(Lclient!aql;FFF)V", line = 118)
	public final void method8225(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8467(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ho", name = "q", descriptor = "(Lclient!aql;FFFFI)V", line = 122)
	public final void method8226(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8448(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ho", name = "ba", descriptor = "(Lclient!aql;FFFF)V", line = 122)
	public final void method8227(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8448(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ho", name = "bp", descriptor = "(Lclient!aql;Lclient!ox;)V", line = 126)
	public final void method8228(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class472 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8467(arg0, arg1.aFloat317, arg1.aFloat318, arg1.aFloat319);
	}

	@OriginalMember(owner = "client!ho", name = "x", descriptor = "(Lclient!aql;Lclient!ox;I)V", line = 126)
	public final void method8229(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) int arg2) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8467(arg0, arg1.aFloat317, arg1.aFloat318, arg1.aFloat319);
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(Lclient!aql;Lclient!og;I)V", line = 130)
	public final void method8230(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class460 arg1, @OriginalArg(2) int arg2) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8448(arg0, arg1.aFloat293, arg1.aFloat292, arg1.aFloat291, arg1.aFloat294);
	}

	@OriginalMember(owner = "client!ho", name = "bs", descriptor = "(Lclient!aql;Lclient!og;)V", line = 130)
	public final void method8231(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class460 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8448(arg0, arg1.aFloat293, arg1.aFloat292, arg1.aFloat291, arg1.aFloat294);
	}

	@OriginalMember(owner = "client!ho", name = "bj", descriptor = "(Lclient!aql;Lclient!og;)V", line = 130)
	public final void method8232(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class460 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8448(arg0, arg1.aFloat293, arg1.aFloat292, arg1.aFloat291, arg1.aFloat294);
	}

	@OriginalMember(owner = "client!ho", name = "h", descriptor = "(Lclient!aql;[FI)V", line = 134)
	public final void method8233(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8447(arg0, arg1, arg1.length);
	}

	@OriginalMember(owner = "client!ho", name = "cl", descriptor = "(Lclient!aql;[F)V", line = 134)
	public final void method8234(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float[] arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8447(arg0, arg1, arg1.length);
	}

	@OriginalMember(owner = "client!ho", name = "cg", descriptor = "(Lclient!aql;[F)V", line = 134)
	public final void method8235(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float[] arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8447(arg0, arg1, arg1.length);
	}

	@OriginalMember(owner = "client!ho", name = "ce", descriptor = "(Lclient!aql;[F)V", line = 134)
	public final void method8236(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float[] arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8447(arg0, arg1, arg1.length);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lclient!aql;IB)V", line = 138)
	public final void method8237(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		@Pc(8) float local8 = (float) (arg1 >> 16 & 0xFF) / 255.0F;
		@Pc(17) float local17 = (float) (arg1 >> 8 & 0xFF) / 255.0F;
		@Pc(24) float local24 = (float) (arg1 & 0xFF) / 255.0F;
		@Pc(33) float local33 = (float) (arg1 >> 24 & 0xFF) / 255.0F;
		this.method8226(arg0, local8, local17, local24, local33, 961483772);
	}

	@OriginalMember(owner = "client!ho", name = "cu", descriptor = "(Lclient!aql;I)V", line = 138)
	public final void method8238(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float local8 = (float) (arg1 >> 16 & 0xFF) / 255.0F;
		@Pc(17) float local17 = (float) (arg1 >> 8 & 0xFF) / 255.0F;
		@Pc(24) float local24 = (float) (arg1 & 0xFF) / 255.0F;
		@Pc(33) float local33 = (float) (arg1 >> 24 & 0xFF) / 255.0F;
		this.method8226(arg0, local8, local17, local24, local33, -239304559);
	}

	@OriginalMember(owner = "client!ho", name = "ci", descriptor = "(Lclient!aql;I)V", line = 138)
	public final void method8239(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float local8 = (float) (arg1 >> 16 & 0xFF) / 255.0F;
		@Pc(17) float local17 = (float) (arg1 >> 8 & 0xFF) / 255.0F;
		@Pc(24) float local24 = (float) (arg1 & 0xFF) / 255.0F;
		@Pc(33) float local33 = (float) (arg1 >> 24 & 0xFF) / 255.0F;
		this.method8226(arg0, local8, local17, local24, local33, 87818938);
	}

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "(Lclient!aql;Lclient!pq;I)V", line = 146)
	public final void method8240(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) int arg2) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8450(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "cv", descriptor = "(Lclient!aql;Lclient!pq;)V", line = 146)
	public final void method8241(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8450(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "cn", descriptor = "(Lclient!aql;Lclient!pq;)V", line = 146)
	public final void method8242(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8450(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "i", descriptor = "(Lclient!aql;Lclient!pq;I)V", line = 150)
	public final void method8243(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) int arg2) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8461(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "ca", descriptor = "(Lclient!aql;Lclient!pq;)V", line = 150)
	public final void method8244(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8461(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "cp", descriptor = "(Lclient!aql;Lclient!pq;)V", line = 150)
	public final void method8245(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8461(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "cx", descriptor = "(Lclient!aql;Lclient!pq;)V", line = 150)
	public final void method8246(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8461(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "cw", descriptor = "(Lclient!aql;ILclient!mq;)V", line = 154)
	public final void method8247(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface43 arg2) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8443(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ho", name = "j", descriptor = "(Lclient!aql;ILclient!mq;I)V", line = 154)
	public final void method8248(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface43 arg2, @OriginalArg(3) int arg3) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8443(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ho", name = "ct", descriptor = "(Lclient!aql;ILclient!mq;)V", line = 154)
	public final void method8249(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface43 arg2) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8443(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ho", name = "cr", descriptor = "(IFFF)V", line = 158)
	public final void method8250(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8449(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ho", name = "co", descriptor = "(IFFF)V", line = 158)
	public final void method8251(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8449(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ho", name = "t", descriptor = "(IFFFI)V", line = 158)
	public final void method8252(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8449(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ho", name = "cm", descriptor = "(IFFF)V", line = 158)
	public final void method8253(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8449(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ho", name = "cf", descriptor = "(IFFF)V", line = 158)
	public final void method8254(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8449(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ho", name = "ae", descriptor = "(IFFFFI)V", line = 162)
	public final void method8255(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8482(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ho", name = "ag", descriptor = "(ILclient!ox;B)V", line = 166)
	public final void method8256(@OriginalArg(0) int arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) byte arg2) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8449(arg0, arg1.aFloat317, arg1.aFloat318, arg1.aFloat319);
	}

	@OriginalMember(owner = "client!ho", name = "cq", descriptor = "(ILclient!ox;)V", line = 166)
	public final void method8257(@OriginalArg(0) int arg0, @OriginalArg(1) Class472 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8449(arg0, arg1.aFloat317, arg1.aFloat318, arg1.aFloat319);
	}

	@OriginalMember(owner = "client!ho", name = "ch", descriptor = "(ILclient!ox;)V", line = 166)
	public final void method8258(@OriginalArg(0) int arg0, @OriginalArg(1) Class472 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8449(arg0, arg1.aFloat317, arg1.aFloat318, arg1.aFloat319);
	}

	@OriginalMember(owner = "client!ho", name = "cb", descriptor = "(ILclient!ox;)V", line = 166)
	public final void method8259(@OriginalArg(0) int arg0, @OriginalArg(1) Class472 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8449(arg0, arg1.aFloat317, arg1.aFloat318, arg1.aFloat319);
	}

	@OriginalMember(owner = "client!ho", name = "cs", descriptor = "(I[FI)V", line = 170)
	public final void method8260(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8454(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ho", name = "ah", descriptor = "(I[FII)V", line = 170)
	public final void method8261(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8454(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ho", name = "cy", descriptor = "(I[FI)V", line = 170)
	public final void method8262(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8454(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ho", name = "al", descriptor = "(ILclient!pq;I)V", line = 174)
	public final void method8263(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) int arg2) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8455(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "cz", descriptor = "(ILclient!pq;)V", line = 174)
	public final void method8264(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8455(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "cc", descriptor = "(ILclient!pq;)V", line = 174)
	public final void method8265(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8455(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "cj", descriptor = "(ILclient!pq;)V", line = 178)
	public final void method8266(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8456(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "ac", descriptor = "(ILclient!pq;I)V", line = 178)
	public final void method8267(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) int arg2) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8456(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "ck", descriptor = "(ILclient!pq;)V", line = 178)
	public final void method8268(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8456(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "dd", descriptor = "(ILclient!pq;)V", line = 182)
	public final void method8269(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8457(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "ai", descriptor = "(ILclient!pq;I)V", line = 182)
	public final void method8270(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) int arg2) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8457(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "da", descriptor = "(ILclient!pq;)V", line = 182)
	public final void method8271(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8457(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "cd", descriptor = "(ILclient!pq;)V", line = 182)
	public final void method8272(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8457(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "dr", descriptor = "(ILclient!pq;)V", line = 182)
	public final void method8273(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8457(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "aw", descriptor = "(IILclient!mq;B)V", line = 186)
	public final void method8274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface43 arg2, @OriginalArg(3) byte arg3) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8458(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ho", name = "dt", descriptor = "(IILclient!mq;)V", line = 186)
	public final void method8275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface43 arg2) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8458(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ho", name = "as", descriptor = "(Ljava/lang/String;B)Lclient!aql;", line = 190)
	public Class93_Sub33_Sub1 method8276(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) throws Exception_Sub2_Sub1 {
		@Pc(6) Class93_Sub33_Sub1 local6 = (Class93_Sub33_Sub1) this.aClass352_6.method27658(arg0, (byte) 45);
		if (local6 == null) {
			throw new Exception_Sub2_Sub1(arg0);
		}
		return local6;
	}

	@OriginalMember(owner = "client!ho", name = "at", descriptor = "(I)I", line = 196)
	public int method8277(@OriginalArg(0) int arg0) {
		return this.anInt970 * 1281809107;
	}

	@OriginalMember(owner = "client!ho", name = "dz", descriptor = "()I", line = 196)
	public int method8278() {
		return this.anInt970 * 1281809107;
	}

	@OriginalMember(owner = "client!ho", name = "do", descriptor = "()I", line = 196)
	public int method8279() {
		return this.anInt970 * 1281809107;
	}

	@OriginalMember(owner = "client!ho", name = "dv", descriptor = "()I", line = 196)
	public int method8280() {
		return this.anInt970 * 1281809107;
	}

	@OriginalMember(owner = "client!ho", name = "dm", descriptor = "()I", line = 196)
	public int method8281() {
		return this.anInt970 * 1281809107;
	}

	@OriginalMember(owner = "client!ho", name = "ad", descriptor = "(IB)Lclient!aql;", line = 200)
	public Class93_Sub33_Sub1 method8282(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return (Class93_Sub33_Sub1) this.aClass352_5.method27656(arg0, 306803012);
	}

	@OriginalMember(owner = "client!ho", name = "dq", descriptor = "(I)Lclient!aql;", line = 200)
	public Class93_Sub33_Sub1 method8283(@OriginalArg(0) int arg0) {
		return (Class93_Sub33_Sub1) this.aClass352_5.method27656(arg0, 541698169);
	}

	@OriginalMember(owner = "client!ho", name = "am", descriptor = "(Ljava/lang/String;S)Lclient!aql;", line = 204)
	public Class93_Sub33_Sub1 method8284(@OriginalArg(0) String arg0, @OriginalArg(1) short arg1) {
		return (Class93_Sub33_Sub1) this.aClass352_5.method27658(arg0, (byte) 104);
	}

	@OriginalMember(owner = "client!ho", name = "au", descriptor = "(I)I", line = 208)
	public int method8285(@OriginalArg(0) int arg0) {
		return this.anInt969 * 1811824185;
	}

	@OriginalMember(owner = "client!ho", name = "dc", descriptor = "()I", line = 208)
	public int method8286() {
		return this.anInt969 * 1811824185;
	}

	@OriginalMember(owner = "client!ho", name = "di", descriptor = "()I", line = 208)
	public int method8287() {
		return this.anInt969 * 1811824185;
	}

	@OriginalMember(owner = "client!ho", name = "ar", descriptor = "(II)Lclient!aql;", line = 212)
	public Class93_Sub33_Sub1 method8288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Class93_Sub33_Sub1) this.aClass352_6.method27656(arg0, -803804167);
	}

	@OriginalMember(owner = "client!ho", name = "dk", descriptor = "(I)Lclient!aql;", line = 212)
	public Class93_Sub33_Sub1 method8289(@OriginalArg(0) int arg0) {
		return (Class93_Sub33_Sub1) this.aClass352_6.method27656(arg0, -518017370);
	}

	@OriginalMember(owner = "client!ho", name = "dn", descriptor = "(I)Lclient!aql;", line = 212)
	public Class93_Sub33_Sub1 method8290(@OriginalArg(0) int arg0) {
		return (Class93_Sub33_Sub1) this.aClass352_6.method27656(arg0, -1147879684);
	}

	@OriginalMember(owner = "client!ho", name = "df", descriptor = "()V", line = 215)
	void method8291() {
	}

	@OriginalMember(owner = "client!ho", name = "ap", descriptor = "()V", line = 215)
	void method8292() {
	}

	@OriginalMember(owner = "client!ho", name = "ay", descriptor = "(Lclient!yf;ZI)V", line = 5042)
	static final void method8293(@OriginalArg(0) Class681 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0.anIntArray520[arg0.anInt5889 * -709694321];
		arg0.anInt5891 -= -1915563430;
		@Pc(21) int local21 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(31) int local31 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		if (local21 < 0 || local21 >= arg0.anIntArray518[local7]) {
			throw new RuntimeException();
		}
		arg0.anIntArrayArray67[local7][local21] = local31;
		if (arg1) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local31;
		}
	}

	@OriginalMember(owner = "client!ho", name = "tb", descriptor = "(Lclient!yf;I)V", line = 8413)
	static final void method8294(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1121503173);
		Class202.method24646(local16, arg0, 211290235);
	}

	@OriginalMember(owner = "client!ho", name = "acl", descriptor = "(Lclient!yf;I)V", line = 10050)
	static final void method8295(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = arg0.aClass386_3.method28171((String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375], (byte) 26);
	}

	@OriginalMember(owner = "client!ho", name = "aid", descriptor = "(Lclient!yf;S)V", line = 11269)
	static final void method8296(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = Class372.aClass58_2.method1094(local12, -737304293).method22931(-1491104235);
	}

	@OriginalMember(owner = "client!ho", name = "apy", descriptor = "(Lclient!yf;I)V", line = 12676)
	static final void method8297(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		arg0.anInt5891 -= -725861497;
		Class65.aClass123_Sub1_2.method8962((float) arg0.anIntArray519[arg0.anInt5891 * -1497248091], (float) arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1], (float) arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2], (byte) 0);
	}

	@OriginalMember(owner = "client!ho", name = "bex", descriptor = "(Lclient!yf;B)V", line = 14882)
	static final void method8298(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class146.aClass344_3.method27541(65280);
	}

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "(Lclient!afc;Lclient!hn;)Lclient!hi;")
	abstract Class116 method8299(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class318 arg1);

	@OriginalMember(owner = "client!ho", name = "bn", descriptor = "(Lclient!hi;)Z")
	public abstract boolean method8300(@OriginalArg(0) Class116 arg0);

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "(Lclient!hi;)Z")
	public abstract boolean method8301(@OriginalArg(0) Class116 arg0);

	@OriginalMember(owner = "client!ho", name = "v", descriptor = "(Lclient!hv;)Lclient!aql;")
	abstract Class93_Sub33_Sub1 method8302(@OriginalArg(0) Class325 arg0);

	@OriginalMember(owner = "client!ho", name = "m", descriptor = "()Z")
	public abstract boolean method8303();

	@OriginalMember(owner = "client!ho", name = "aq", descriptor = "()V")
	public abstract void method8304();

	@OriginalMember(owner = "client!ho", name = "ax", descriptor = "()V")
	public abstract void method8305();

	@OriginalMember(owner = "client!ho", name = "av", descriptor = "()V")
	public abstract void method8306();

	@OriginalMember(owner = "client!ho", name = "ao", descriptor = "()V")
	public abstract void method8307();

	@OriginalMember(owner = "client!ho", name = "aj", descriptor = "()V")
	public abstract void method8308();

	@OriginalMember(owner = "client!ho", name = "ak", descriptor = "(Lclient!afc;Lclient!hn;)Lclient!hi;")
	abstract Class116 method8309(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class318 arg1);

	@OriginalMember(owner = "client!ho", name = "n", descriptor = "()V")
	public abstract void method8310();

	@OriginalMember(owner = "client!ho", name = "bu", descriptor = "(Lclient!hv;)Lclient!aql;")
	abstract Class93_Sub33_Sub1 method8311(@OriginalArg(0) Class325 arg0);

	@OriginalMember(owner = "client!ho", name = "bw", descriptor = "(Lclient!hv;)Lclient!aql;")
	abstract Class93_Sub33_Sub1 method8312(@OriginalArg(0) Class325 arg0);

	@OriginalMember(owner = "client!ho", name = "ay", descriptor = "()V")
	public abstract void method8313();

	@OriginalMember(owner = "client!ho", name = "af", descriptor = "(Lclient!afc;Lclient!hn;)Lclient!hi;")
	abstract Class116 method8314(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class318 arg1);

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "()V")
	public abstract void method8315();

	@OriginalMember(owner = "client!ho", name = "bq", descriptor = "(Lclient!hi;)Z")
	public abstract boolean method8316(@OriginalArg(0) Class116 arg0);

	@OriginalMember(owner = "client!ho", name = "bt", descriptor = "(Lclient!hi;)Z")
	public abstract boolean method8317(@OriginalArg(0) Class116 arg0);

	@OriginalMember(owner = "client!ho", name = "ds", descriptor = "()Z")
	public abstract boolean method8318();

	@OriginalMember(owner = "client!ho", name = "dw", descriptor = "()Z")
	public abstract boolean method8319();
}
