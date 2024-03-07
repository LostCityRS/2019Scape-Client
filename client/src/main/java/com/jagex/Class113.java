package com.jagex;

import java.nio.ByteBuffer;
import java.util.Arrays;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public class Class113 implements Interface20 {

	@OriginalMember(owner = "client!ek", name = "ix", descriptor = "Lclient!wy;")
	public static Class651 aClass651_2;

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "Lclient!abj;")
	public final Interface3 anInterface3_2;

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "([BZI)Ljava/lang/Object;", line = 12)
	public static Object method7407(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return null;
		} else if (arg0.length > 136) {
			@Pc(12) ByteBuffer local12 = ByteBuffer.allocateDirect(arg0.length);
			local12.position(0);
			local12.put(arg0);
			return local12;
		} else if (arg1) {
			return Arrays.copyOf(arg0, arg0.length);
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!add;)V", line = 13)
	public Class113(@OriginalArg(0) Class79_Sub1 arg0) {
		this(arg0, new Class40(arg0));
	}

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!add;Lclient!abn;)V", line = 17)
	Class113(@OriginalArg(0) Class79_Sub1 arg0, @OriginalArg(1) Class40 arg1) {
		this(arg0.aClass138_3, arg1);
	}

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!qe;Lclient!abn;)V", line = 20)
	public Class113(@OriginalArg(0) Class138 arg0, @OriginalArg(1) Class40 arg1) {
		this.anInterface3_2 = arg1;
	}

	@OriginalMember(owner = "client!ek", name = "u", descriptor = "(Lclient!ec;I)I", line = 25)
	@Override
	public int method33455(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1) {
		return this.anInterface3_2.method781(arg0.anInt867 * -1284841473, -1267242705);
	}

	@OriginalMember(owner = "client!ek", name = "ah", descriptor = "(Lclient!ec;)I", line = 25)
	@Override
	public int method33456(@OriginalArg(0) Class108 arg0) {
		return this.anInterface3_2.method781(arg0.anInt867 * -1284841473, -1267242705);
	}

	@OriginalMember(owner = "client!ek", name = "al", descriptor = "(Lclient!ec;)I", line = 25)
	@Override
	public int method33457(@OriginalArg(0) Class108 arg0) {
		return this.anInterface3_2.method781(arg0.anInt867 * -1284841473, -1267242705);
	}

	@OriginalMember(owner = "client!ek", name = "ac", descriptor = "(Lclient!ec;)I", line = 25)
	@Override
	public int method33458(@OriginalArg(0) Class108 arg0) {
		return this.anInterface3_2.method781(arg0.anInt867 * -1284841473, -1267242705);
	}

	@OriginalMember(owner = "client!ek", name = "ai", descriptor = "(Lclient!ec;)I", line = 25)
	@Override
	public int method33459(@OriginalArg(0) Class108 arg0) {
		return this.anInterface3_2.method781(arg0.anInt867 * -1284841473, -1267242705);
	}

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "(Lclient!ec;II)V", line = 29)
	@Override
	public void method33464(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInterface3_2.method772(arg0.anInt867 * -1284841473, arg1, (byte) -1);
	}

	@OriginalMember(owner = "client!ek", name = "l", descriptor = "(Lclient!ec;I)V", line = 29)
	@Override
	public void method33470(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1) {
		this.anInterface3_2.method772(arg0.anInt867 * -1284841473, arg1, (byte) -1);
	}

	@OriginalMember(owner = "client!ek", name = "n", descriptor = "(Lclient!ec;I)J", line = 33)
	@Override
	public long method33465(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1) {
		return this.anInterface3_2.method779(arg0.anInt867 * -1284841473, 1308842198);
	}

	@OriginalMember(owner = "client!ek", name = "p", descriptor = "(Lclient!ec;)J", line = 33)
	@Override
	public long method33473(@OriginalArg(0) Class108 arg0) {
		return this.anInterface3_2.method779(arg0.anInt867 * -1284841473, 1899499644);
	}

	@OriginalMember(owner = "client!ek", name = "m", descriptor = "(Lclient!ec;J)V", line = 37)
	@Override
	public void method33466(@OriginalArg(0) Class108 arg0, @OriginalArg(1) long arg1) {
		this.anInterface3_2.method787(arg0.anInt867 * -1284841473, arg1);
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(Lclient!ec;J)V", line = 37)
	@Override
	public void method33475(@OriginalArg(0) Class108 arg0, @OriginalArg(1) long arg1) {
		this.anInterface3_2.method787(arg0.anInt867 * -1284841473, arg1);
	}

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "(Lclient!ec;J)V", line = 37)
	@Override
	public void method33474(@OriginalArg(0) Class108 arg0, @OriginalArg(1) long arg1) {
		this.anInterface3_2.method787(arg0.anInt867 * -1284841473, arg1);
	}

	@OriginalMember(owner = "client!ek", name = "k", descriptor = "(Lclient!ec;B)Ljava/lang/Object;", line = 41)
	@Override
	public Object method33467(@OriginalArg(0) Class108 arg0, @OriginalArg(1) byte arg1) {
		return this.anInterface3_2.method775(arg0.anInt867 * -1284841473, 2007776752);
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(Lclient!ec;)Ljava/lang/Object;", line = 41)
	@Override
	public Object method33481(@OriginalArg(0) Class108 arg0) {
		return this.anInterface3_2.method775(arg0.anInt867 * -1284841473, -967718867);
	}

	@OriginalMember(owner = "client!ek", name = "h", descriptor = "(Lclient!ec;)Ljava/lang/Object;", line = 41)
	@Override
	public Object method33482(@OriginalArg(0) Class108 arg0) {
		return this.anInterface3_2.method775(arg0.anInt867 * -1284841473, -1479505925);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!ec;)Ljava/lang/Object;", line = 41)
	@Override
	public Object method33480(@OriginalArg(0) Class108 arg0) {
		return this.anInterface3_2.method775(arg0.anInt867 * -1284841473, -1346279048);
	}

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "(Lclient!ec;)Ljava/lang/Object;", line = 41)
	@Override
	public Object method33471(@OriginalArg(0) Class108 arg0) {
		return this.anInterface3_2.method775(arg0.anInt867 * -1284841473, 925835624);
	}

	@OriginalMember(owner = "client!ek", name = "r", descriptor = "(Lclient!ec;Ljava/lang/Object;)V", line = 45)
	@Override
	public void method33476(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1) {
		this.anInterface3_2.method776(arg0.anInt867 * -1284841473, arg1, (byte) 17);
	}

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "(Lclient!ec;Ljava/lang/Object;I)V", line = 45)
	@Override
	public void method33468(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		this.anInterface3_2.method776(arg0.anInt867 * -1284841473, arg1, (byte) 74);
	}

	@OriginalMember(owner = "client!ek", name = "v", descriptor = "(Lclient!ec;Ljava/lang/Object;)V", line = 45)
	@Override
	public void method33477(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1) {
		this.anInterface3_2.method776(arg0.anInt867 * -1284841473, arg1, (byte) 101);
	}

	@OriginalMember(owner = "client!ek", name = "s", descriptor = "(Lclient!ec;Ljava/lang/Object;)V", line = 45)
	@Override
	public void method33483(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1) {
		this.anInterface3_2.method776(arg0.anInt867 * -1284841473, arg1, (byte) 11);
	}

	@OriginalMember(owner = "client!ek", name = "o", descriptor = "(Lclient!ec;Ljava/lang/Object;)V", line = 45)
	@Override
	public void method33478(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1) {
		this.anInterface3_2.method776(arg0.anInt867 * -1284841473, arg1, (byte) 122);
	}

	@OriginalMember(owner = "client!ek", name = "as", descriptor = "(Lclient!kh;)I", line = 49)
	@Override
	public int method33460(@OriginalArg(0) Class379 arg0) {
		return arg0.method28089(this.method33455(arg0.aClass108_1, 96794047), 1645126520);
	}

	@OriginalMember(owner = "client!ek", name = "aw", descriptor = "(Lclient!kh;)I", line = 49)
	@Override
	public int method33461(@OriginalArg(0) Class379 arg0) {
		return arg0.method28089(this.method33455(arg0.aClass108_1, 457508088), 106367721);
	}

	@OriginalMember(owner = "client!ek", name = "at", descriptor = "(Lclient!kh;)I", line = 49)
	@Override
	public int method33462(@OriginalArg(0) Class379 arg0) {
		return arg0.method28089(this.method33455(arg0.aClass108_1, 1838569600), 1316247786);
	}

	@OriginalMember(owner = "client!ek", name = "z", descriptor = "(Lclient!kh;I)I", line = 49)
	@Override
	public int method33454(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1) {
		return arg0.method28089(this.method33455(arg0.aClass108_1, -12187856), 774139946);
	}

	@OriginalMember(owner = "client!ek", name = "y", descriptor = "(Lclient!kh;I)V", line = 53)
	@Override
	public void method33479(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1) throws Exception_Sub7 {
		this.method33464(arg0.aClass108_1, arg0.method28094(this.method33455(arg0.aClass108_1, 1916942414), arg1, -2002624152), 908369267);
	}

	@OriginalMember(owner = "client!ek", name = "w", descriptor = "(Lclient!kh;II)V", line = 53)
	@Override
	public void method33469(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws Exception_Sub7 {
		this.method33464(arg0.aClass108_1, arg0.method28094(this.method33455(arg0.aClass108_1, -187351012), arg1, -2058420383), 908369267);
	}

	@OriginalMember(owner = "client!ek", name = "q", descriptor = "(Lclient!kh;I)V", line = 53)
	@Override
	public void method33463(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1) throws Exception_Sub7 {
		this.method33464(arg0.aClass108_1, arg0.method28094(this.method33455(arg0.aClass108_1, -1833851763), arg1, -2117347028), 908369267);
	}

	@OriginalMember(owner = "client!ek", name = "x", descriptor = "(Lclient!kh;I)V", line = 53)
	@Override
	public void method33472(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1) throws Exception_Sub7 {
		this.method33464(arg0.aClass108_1, arg0.method28094(this.method33455(arg0.aClass108_1, 2143845029), arg1, -2107677091), 908369267);
	}

	@OriginalMember(owner = "client!ek", name = "k", descriptor = "([BS)Lclient!asc;", line = 89)
	static Class93_Sub1_Sub13 method7408(@OriginalArg(0) byte[] arg0, @OriginalArg(1) short arg1) {
		return new Class93_Sub1_Sub13(new Packet(arg0), Class506.anInterface21_4);
	}

	@OriginalMember(owner = "client!ek", name = "mh", descriptor = "(Lclient!yf;I)V", line = 7153)
	static final void method7409(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 558428714);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class623.method32149(local16, local22, arg0, -1878678180);
	}

	@OriginalMember(owner = "client!ek", name = "aib", descriptor = "(Lclient!yf;I)V", line = 11373)
	static final void method7410(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.aClass434_1.anIntArray445[local13] = local23;
	}

	@OriginalMember(owner = "client!ek", name = "apo", descriptor = "(Lclient!yf;I)V", line = 12722)
	static final void method7411(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (!Class251.method25969(660486859)) {
			Class594.method31724(1789993859);
		}
	}
}
