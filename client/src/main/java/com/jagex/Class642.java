package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.ArrayList;
import java.util.List;

@OriginalClass("client!wn")
public final class Class642 implements Interface68 {

	@OriginalMember(owner = "client!wn", name = "y", descriptor = "Lclient!pf;")
	static Class480 aClass480_131;

	@OriginalMember(owner = "client!wn", name = "i", descriptor = "Z")
	boolean aBoolean966;

	@OriginalMember(owner = "client!wn", name = "g", descriptor = "[B")
	byte[] aByteArray112;

	@OriginalMember(owner = "client!wn", name = "m", descriptor = "I")
	int anInt5642;

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "Lclient!ws;")
	Class646 aClass646_1 = Class646.aClass646_4;

	@OriginalMember(owner = "client!wn", name = "u", descriptor = "Lclient!pf;")
	Class480 aClass480_130;

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
	int anInt5641;

	@OriginalMember(owner = "client!wn", name = "t", descriptor = "Lclient!mr;")
	Class138 aClass138_4;

	@OriginalMember(owner = "client!wn", name = "l", descriptor = "Lclient!wp;")
	Interface70 anInterface70_1;

	@OriginalMember(owner = "client!wn", name = "o", descriptor = "Lclient!ej;")
	Class243 aClass243_90;

	@OriginalMember(owner = "client!wn", name = "j", descriptor = "Z")
	boolean aBoolean967;

	@OriginalMember(owner = "client!wn", name = "ik", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method32960(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg0.anInt4113 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581] * -1878285435;
	}

	@OriginalMember(owner = "client!wn", name = "jg", descriptor = "(Lclient!yp;I)V")
	static void method32961(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!wn", name = "aed", descriptor = "(Lclient!yp;I)V")
	static void method32962(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) (Math.random() * (double) local12);
	}

	@OriginalMember(owner = "client!wn", name = "axn", descriptor = "(Lclient!yp;I)V")
	static void method32963(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		Class665.method33454(10, local13, local23, "", 848165715);
	}

	@OriginalMember(owner = "client!wn", name = "bdc", descriptor = "(Lclient!yp;I)V")
	static void method32964(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		Class480.method30007(local12, -823046357);
	}

	@OriginalMember(owner = "client!wn", name = "bel", descriptor = "(Lclient!yp;ZI)V")
	static void method32965(@OriginalArg(0) Class690 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(27) Class88 local27 = Class483.method30029(local13, -531396114);
		if (local27 == null) {
			throw new RuntimeException();
		}
		Class245.aList4 = local27.method1783(local23, 1948804526);
		if (Class245.aList4 != null) {
			client.anInt3451 = Class603.method32130(local13, 504309486) * 2033239385;
			Class411.anIterator2 = Class245.aList4.iterator();
			if (arg1) {
				arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class245.aList4.size();
			}
			return;
		}
		client.anInt3451 = -2033239385;
		Class411.anIterator2 = null;
		if (arg1) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!wn", name = "u", descriptor = "(Lclient!ald;B)Lclient!kn;")
	public static Class125 method32966(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class125 local3 = Class524.method30653(arg0, (byte) -29);
		@Pc(7) int local7 = arg0.g4();
		@Pc(11) int local11 = arg0.g4();
		@Pc(15) int local15 = arg0.gSmart2or4null();
		return new Class125_Sub1(local3.aClass391_8, local3.aClass383_8, local3.anInt2899 * 808275465, local3.anInt2901 * 1789354437, local3.anInt2900 * 199320851, local3.anInt2903 * 1087492339, local3.anInt2902 * -173381277, local3.anInt2904 * -176628393, local3.anInt2905 * -1330014629, local7, local11, local15);
	}

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lclient!pf;ILclient!mr;Lclient!wp;Lclient!ej;)V")
	public Class642(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class138 arg2, @OriginalArg(3) Interface70 arg3, @OriginalArg(4) Class243 arg4) {
		this.aClass480_130 = arg0;
		this.anInt5641 = arg1 * 1401090769;
		this.aClass138_4 = arg2;
		this.anInterface70_1 = arg3;
		this.aClass243_90 = arg4;
		this.aBoolean967 = this.aClass243_90 != null;
		this.aClass646_1 = Class646.aClass646_3;
	}

	@OriginalMember(owner = "client!wn", name = "as", descriptor = "(Z)V")
	@Override
	public void method33011(@OriginalArg(0) boolean arg0) {
		if (this.anInterface70_1 != null) {
			this.anInterface70_1.method26675(this, 1866555279);
		}
		this.aBoolean966 = arg0;
	}

	@OriginalMember(owner = "client!wn", name = "t", descriptor = "(I)V")
	@Override
	public void method32986(@OriginalArg(0) int arg0) {
		if (this.aClass646_1 != Class646.aClass646_3) {
			return;
		}
		@Pc(12) byte[] local12 = this.aClass480_130.method29926(this.anInt5641 * 2042406449, 1472047355);
		if (local12 == null) {
			return;
		}
		this.aByteArray112 = local12;
		this.method32957(1584541948);
		this.aClass646_1 = Class646.aClass646_5;
		if (this.anInterface70_1 != null) {
			this.anInterface70_1.method26676(this, local12.length, this.anInt5641 * 2042406449, false, (byte) 4);
		}
	}

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "(I)Lclient!rh;")
	@Override
	public Class529 method33013(@OriginalArg(0) int arg0) {
		@Pc(5) Class529 local5 = new Class529(this.aClass138_4);
		local5.method30762(this, (byte) 3);
		return local5;
	}

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "(I)Lclient!ws;")
	@Override
	public Class646 method32968(@OriginalArg(0) int arg0) {
		return this.aClass646_1;
	}

	@OriginalMember(owner = "client!wn", name = "q", descriptor = "(Ljava/util/List;II)V")
	void method32952(@OriginalArg(0) List arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass243_90 == null || arg0 == null || arg1 < 0) {
			return;
		}
		@Pc(11) Class243 local11 = this.aClass243_90;
		synchronized (this.aClass243_90) {
			this.aClass243_90.method26251((long) (this.anInt5641 * 2042406449));
			if (arg1 <= this.aClass243_90.method26279((byte) 0)) {
				this.aClass243_90.method26254(arg0, (long) (this.anInt5641 * 2042406449), arg1, (byte) -121);
			} else {
				this.aBoolean967 = false;
				this.aBoolean966 = false;
				this.anInt5642 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wn", name = "g", descriptor = "(II)[B")
	@Override
	public byte[] method32971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInterface70_1 != null) {
			this.anInterface70_1.method26675(this, -1419423093);
		}
		return this.aByteArray112;
	}

	@OriginalMember(owner = "client!wn", name = "i", descriptor = "(B)I")
	@Override
	public int method32970(@OriginalArg(0) byte arg0) {
		return this.aByteArray112 == null ? 0 : this.aByteArray112.length;
	}

	@OriginalMember(owner = "client!wn", name = "m", descriptor = "(I)Lclient!qr;")
	@Override
	public Class516 method32979(@OriginalArg(0) int arg0) {
		return Class516.aClass516_2;
	}

	@OriginalMember(owner = "client!wn", name = "o", descriptor = "(B)I")
	@Override
	public int method32994(@OriginalArg(0) byte arg0) {
		return this.anInt5641 * 2042406449;
	}

	@OriginalMember(owner = "client!wn", name = "j", descriptor = "(Lclient!ald;I)V")
	@Override
	public void method32975(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (this.aClass243_90 == null) {
			return;
		}
		if (this.anInterface70_1 != null) {
			this.anInterface70_1.method26675(this, -716508451);
		}
		if (this.aBoolean966) {
			throw new RuntimeException("");
		}
		@Pc(23) Class243 local23 = this.aClass243_90;
		synchronized (this.aClass243_90) {
			@Pc(28) List local28 = this.method32954(336223606);
			if (local28 != null) {
				local28.add(arg0);
				this.anInt5642 += arg0.data.length * 829546407;
				this.method32952(local28, this.anInt5642 * 2003884055, -2046853039);
			}
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IB)Lclient!ald;")
	@Override
	public Packet method32976(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (this.aClass243_90 == null) {
			return null;
		}
		@Pc(6) Packet local6 = null;
		if (this.anInterface70_1 != null) {
			this.anInterface70_1.method26675(this, -1475227784);
		}
		@Pc(19) Class243 local19 = this.aClass243_90;
		synchronized (this.aClass243_90) {
			@Pc(24) List local24 = this.method32954(336223606);
			if (local24.size() > arg0) {
				local6 = (Packet) local24.get(arg0);
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!wn", name = "s", descriptor = "(IB)Z")
	@Override
	public boolean method32978(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (this.aClass243_90 == null) {
			return false;
		}
		@Pc(6) boolean local6 = false;
		@Pc(10) Class243 local10 = this.aClass243_90;
		synchronized (this.aClass243_90) {
			@Pc(15) List local15 = this.method32954(336223606);
			if (local15 != null && local15.size() > arg0) {
				local6 = local15.get(arg0) != null;
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!wn", name = "k", descriptor = "(B)Z")
	@Override
	public boolean method32977(@OriginalArg(0) byte arg0) {
		return this.aClass243_90 != null && this.aBoolean967;
	}

	@OriginalMember(owner = "client!wn", name = "ao", descriptor = "()V")
	void method32953() {
	}

	@OriginalMember(owner = "client!wn", name = "w", descriptor = "(ZI)V")
	@Override
	public void method32980(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (this.anInterface70_1 != null) {
			this.anInterface70_1.method26675(this, 387522706);
		}
		this.aBoolean966 = arg0;
	}

	@OriginalMember(owner = "client!wn", name = "r", descriptor = "(I)Z")
	@Override
	public boolean method32972(@OriginalArg(0) int arg0) {
		if (this.aClass243_90 == null) {
			return false;
		}
		@Pc(8) List local8 = this.method32954(336223606);
		if (local8 == null || local8.size() <= 0) {
			this.aBoolean966 = false;
		}
		return this.aBoolean966;
	}

	@OriginalMember(owner = "client!wn", name = "ae", descriptor = "(I)Z")
	@Override
	public boolean method33006(@OriginalArg(0) int arg0) {
		if (this.aClass243_90 == null) {
			return false;
		}
		@Pc(6) boolean local6 = false;
		@Pc(10) Class243 local10 = this.aClass243_90;
		synchronized (this.aClass243_90) {
			@Pc(15) List local15 = this.method32954(336223606);
			if (local15 != null && local15.size() > arg0) {
				local6 = local15.get(arg0) != null;
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!wn", name = "n", descriptor = "()Lclient!rh;")
	@Override
	public Class529 method33015() {
		@Pc(5) Class529 local5 = new Class529(this.aClass138_4);
		local5.method30762(this, (byte) 3);
		return local5;
	}

	@OriginalMember(owner = "client!wn", name = "h", descriptor = "(I)Ljava/util/List;")
	List method32954(@OriginalArg(0) int arg0) {
		if (this.aClass243_90 == null || !this.aBoolean967) {
			return null;
		}
		@Pc(11) List local11 = null;
		@Pc(15) Class243 local15 = this.aClass243_90;
		synchronized (this.aClass243_90) {
			local11 = (List) this.aClass243_90.method26282((long) (this.anInt5641 * 2042406449));
			if (local11 == null && this.aBoolean967) {
				local11 = new ArrayList();
				this.aClass243_90.method26254(local11, (long) (this.anInt5641 * 2042406449), 0, (byte) -87);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!wn", name = "aa", descriptor = "(I)Lclient!ald;")
	@Override
	public Packet method33005(@OriginalArg(0) int arg0) {
		if (this.aClass243_90 == null) {
			return null;
		}
		@Pc(6) Packet local6 = null;
		if (this.anInterface70_1 != null) {
			this.anInterface70_1.method26675(this, -1904204740);
		}
		@Pc(19) Class243 local19 = this.aClass243_90;
		synchronized (this.aClass243_90) {
			@Pc(24) List local24 = this.method32954(336223606);
			if (local24.size() > arg0) {
				local6 = (Packet) local24.get(arg0);
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!wn", name = "aw", descriptor = "(Z)V")
	@Override
	public void method33012(@OriginalArg(0) boolean arg0) {
		if (this.anInterface70_1 != null) {
			this.anInterface70_1.method26675(this, 1431992136);
		}
		this.aBoolean966 = arg0;
	}

	@OriginalMember(owner = "client!wn", name = "au", descriptor = "()Z")
	@Override
	public boolean method33009() {
		return this.aClass243_90 != null && this.aBoolean967;
	}

	@OriginalMember(owner = "client!wn", name = "y", descriptor = "()Lclient!rh;")
	@Override
	public Class529 method32967() {
		@Pc(5) Class529 local5 = new Class529(this.aClass138_4);
		local5.method30762(this, (byte) 3);
		return local5;
	}

	@OriginalMember(owner = "client!wn", name = "z", descriptor = "()V")
	@Override
	public void method32983() {
		if (this.aClass646_1 != Class646.aClass646_3) {
			return;
		}
		@Pc(12) byte[] local12 = this.aClass480_130.method29926(this.anInt5641 * 2042406449, 1472047355);
		if (local12 == null) {
			return;
		}
		this.aByteArray112 = local12;
		this.method32957(407577310);
		this.aClass646_1 = Class646.aClass646_5;
		if (this.anInterface70_1 != null) {
			this.anInterface70_1.method26676(this, local12.length, this.anInt5641 * 2042406449, false, (byte) 4);
		}
	}

	@OriginalMember(owner = "client!wn", name = "ay", descriptor = "()Lclient!ws;")
	@Override
	public Class646 method32991() {
		return this.aClass646_1;
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "()Lclient!ws;")
	@Override
	public Class646 method33016() {
		return this.aClass646_1;
	}

	@OriginalMember(owner = "client!wn", name = "ax", descriptor = "()Lclient!ws;")
	@Override
	public Class646 method33001() {
		return this.aClass646_1;
	}

	@OriginalMember(owner = "client!wn", name = "ac", descriptor = "()V")
	void method32955() {
	}

	@OriginalMember(owner = "client!wn", name = "ai", descriptor = "()Z")
	@Override
	public boolean method33007() {
		return false;
	}

	@OriginalMember(owner = "client!wn", name = "aq", descriptor = "()Z")
	@Override
	public boolean method32993() {
		return false;
	}

	@OriginalMember(owner = "client!wn", name = "an", descriptor = "(I)Lclient!ald;")
	@Override
	public Packet method33014(@OriginalArg(0) int arg0) {
		if (this.aClass243_90 == null) {
			return null;
		}
		@Pc(6) Packet local6 = null;
		if (this.anInterface70_1 != null) {
			this.anInterface70_1.method26675(this, -432861109);
		}
		@Pc(19) Class243 local19 = this.aClass243_90;
		synchronized (this.aClass243_90) {
			@Pc(24) List local24 = this.method32954(336223606);
			if (local24.size() > arg0) {
				local6 = (Packet) local24.get(arg0);
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!wn", name = "aj", descriptor = "()V")
	void method32956() {
	}

	@OriginalMember(owner = "client!wn", name = "p", descriptor = "()Lclient!rh;")
	@Override
	public Class529 method32984() {
		@Pc(5) Class529 local5 = new Class529(this.aClass138_4);
		local5.method30762(this, (byte) 3);
		return local5;
	}

	@OriginalMember(owner = "client!wn", name = "ag", descriptor = "(I)[B")
	@Override
	public byte[] method32981(@OriginalArg(0) int arg0) {
		if (this.anInterface70_1 != null) {
			this.anInterface70_1.method26675(this, -2136950119);
		}
		return this.aByteArray112;
	}

	@OriginalMember(owner = "client!wn", name = "ab", descriptor = "(I)[B")
	@Override
	public byte[] method32995(@OriginalArg(0) int arg0) {
		if (this.anInterface70_1 != null) {
			this.anInterface70_1.method26675(this, -58141484);
		}
		return this.aByteArray112;
	}

	@OriginalMember(owner = "client!wn", name = "al", descriptor = "(I)[B")
	@Override
	public byte[] method32996(@OriginalArg(0) int arg0) {
		if (this.anInterface70_1 != null) {
			this.anInterface70_1.method26675(this, 338473321);
		}
		return this.aByteArray112;
	}

	@OriginalMember(owner = "client!wn", name = "ah", descriptor = "()I")
	@Override
	public int method32997() {
		return this.aByteArray112 == null ? 0 : this.aByteArray112.length;
	}

	@OriginalMember(owner = "client!wn", name = "af", descriptor = "()I")
	@Override
	public int method32998() {
		return this.aByteArray112 == null ? 0 : this.aByteArray112.length;
	}

	@OriginalMember(owner = "client!wn", name = "am", descriptor = "()I")
	@Override
	public int method32999() {
		return this.aByteArray112 == null ? 0 : this.aByteArray112.length;
	}

	@OriginalMember(owner = "client!wn", name = "ak", descriptor = "()I")
	@Override
	public int method32987() {
		return this.aByteArray112 == null ? 0 : this.aByteArray112.length;
	}

	@OriginalMember(owner = "client!wn", name = "at", descriptor = "()Lclient!qr;")
	@Override
	public Class516 method32973() {
		return Class516.aClass516_2;
	}

	@OriginalMember(owner = "client!wn", name = "ad", descriptor = "()Lclient!qr;")
	@Override
	public Class516 method33002() {
		return Class516.aClass516_2;
	}

	@OriginalMember(owner = "client!wn", name = "av", descriptor = "(Lclient!ald;)V")
	@Override
	public void method33003(@OriginalArg(0) Packet arg0) {
		if (this.aClass243_90 == null) {
			return;
		}
		if (this.anInterface70_1 != null) {
			this.anInterface70_1.method26675(this, 2022809440);
		}
		if (this.aBoolean966) {
			throw new RuntimeException("");
		}
		@Pc(23) Class243 local23 = this.aClass243_90;
		synchronized (this.aClass243_90) {
			@Pc(28) List local28 = this.method32954(336223606);
			if (local28 != null) {
				local28.add(arg0);
				this.anInt5642 += arg0.data.length * 829546407;
				this.method32952(local28, this.anInt5642 * 2003884055, -2023114604);
			}
		}
	}

	@OriginalMember(owner = "client!wn", name = "az", descriptor = "()I")
	@Override
	public int method33010() {
		if (this.aClass243_90 == null) {
			return 0;
		}
		@Pc(7) int local7 = 0;
		@Pc(11) Class243 local11 = this.aClass243_90;
		synchronized (this.aClass243_90) {
			@Pc(16) List local16 = this.method32954(336223606);
			if (local16 != null) {
				local7 = local16.size();
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!wn", name = "br", descriptor = "()Z")
	@Override
	public boolean method33004() {
		if (this.aClass243_90 == null) {
			return false;
		}
		@Pc(8) List local8 = this.method32954(336223606);
		if (local8 == null || local8.size() <= 0) {
			this.aBoolean966 = false;
		}
		return this.aBoolean966;
	}

	@OriginalMember(owner = "client!wn", name = "l", descriptor = "(I)V")
	void method32957(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!wn", name = "ap", descriptor = "()Z")
	@Override
	public boolean method33008() {
		return this.aClass243_90 != null && this.aBoolean967;
	}

	@OriginalMember(owner = "client!wn", name = "ar", descriptor = "()Z")
	@Override
	public boolean method32992() {
		return this.aClass243_90 != null && this.aBoolean967;
	}

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "()V")
	@Override
	public void method32982() {
		if (this.aClass646_1 != Class646.aClass646_3) {
			return;
		}
		@Pc(12) byte[] local12 = this.aClass480_130.method29926(this.anInt5641 * 2042406449, 1472047355);
		if (local12 == null) {
			return;
		}
		this.aByteArray112 = local12;
		this.method32957(1097377481);
		this.aClass646_1 = Class646.aClass646_5;
		if (this.anInterface70_1 != null) {
			this.anInterface70_1.method26676(this, local12.length, this.anInt5641 * 2042406449, false, (byte) 4);
		}
	}

	@OriginalMember(owner = "client!wn", name = "u", descriptor = "(I)Z")
	@Override
	public boolean method32969(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!wn", name = "ba", descriptor = "()Ljava/util/List;")
	List method32958() {
		if (this.aClass243_90 == null || !this.aBoolean967) {
			return null;
		}
		@Pc(11) List local11 = null;
		@Pc(15) Class243 local15 = this.aClass243_90;
		synchronized (this.aClass243_90) {
			local11 = (List) this.aClass243_90.method26282((long) (this.anInt5641 * 2042406449));
			if (local11 == null && this.aBoolean967) {
				local11 = new ArrayList();
				this.aClass243_90.method26254(local11, (long) (this.anInt5641 * 2042406449), 0, (byte) -126);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!wn", name = "v", descriptor = "()Lclient!rh;")
	@Override
	public Class529 method32985() {
		@Pc(5) Class529 local5 = new Class529(this.aClass138_4);
		local5.method30762(this, (byte) 3);
		return local5;
	}

	@OriginalMember(owner = "client!wn", name = "bg", descriptor = "(Z)V")
	@Override
	public void method33000(@OriginalArg(0) boolean arg0) {
		if (this.anInterface70_1 != null) {
			this.anInterface70_1.method26675(this, 45253000);
		}
		this.aBoolean966 = arg0;
	}

	@OriginalMember(owner = "client!wn", name = "bl", descriptor = "()Z")
	@Override
	public boolean method32989() {
		if (this.aClass243_90 == null) {
			return false;
		}
		@Pc(8) List local8 = this.method32954(336223606);
		if (local8 == null || local8.size() <= 0) {
			this.aBoolean966 = false;
		}
		return this.aBoolean966;
	}

	@OriginalMember(owner = "client!wn", name = "x", descriptor = "(I)I")
	@Override
	public int method32974(@OriginalArg(0) int arg0) {
		if (this.aClass243_90 == null) {
			return 0;
		}
		@Pc(7) int local7 = 0;
		@Pc(11) Class243 local11 = this.aClass243_90;
		synchronized (this.aClass243_90) {
			@Pc(16) List local16 = this.method32954(336223606);
			if (local16 != null) {
				local7 = local16.size();
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!wn", name = "bn", descriptor = "()Ljava/util/List;")
	List method32959() {
		if (this.aClass243_90 == null || !this.aBoolean967) {
			return null;
		}
		@Pc(11) List local11 = null;
		@Pc(15) Class243 local15 = this.aClass243_90;
		synchronized (this.aClass243_90) {
			local11 = (List) this.aClass243_90.method26282((long) (this.anInt5641 * 2042406449));
			if (local11 == null && this.aBoolean967) {
				local11 = new ArrayList();
				this.aClass243_90.method26254(local11, (long) (this.anInt5641 * 2042406449), 0, (byte) -126);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "()Lclient!rh;")
	@Override
	public Class529 method32988() {
		@Pc(5) Class529 local5 = new Class529(this.aClass138_4);
		local5.method30762(this, (byte) 3);
		return local5;
	}

	@OriginalMember(owner = "client!wn", name = "bt", descriptor = "()I")
	@Override
	public int method32990() {
		return this.anInt5641 * 2042406449;
	}

	@OriginalMember(owner = "client!wn", name = "bs", descriptor = "()I")
	@Override
	public int method33017() {
		return this.anInt5641 * 2042406449;
	}
}
