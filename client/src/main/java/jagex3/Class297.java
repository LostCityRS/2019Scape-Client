package jagex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class297 {

	@OriginalMember(owner = "client!gq", name = "n", descriptor = "I")
	static final int anInt3961 = 1;

	@OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
	static final int anInt3962 = 2;

	@OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
	static final int anInt3963 = 4;

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "I")
	static final int anInt3965 = 1;

	@OriginalMember(owner = "client!gq", name = "th", descriptor = "B")
	public static byte aByte124;

	@OriginalMember(owner = "client!gq", name = "o", descriptor = "I")
	int anInt3966 = 123819125;

	@OriginalMember(owner = "client!gq", name = "f", descriptor = "J")
	final long aLong252;

	@OriginalMember(owner = "client!gq", name = "u", descriptor = "Z")
	final boolean aBoolean678;

	@OriginalMember(owner = "client!gq", name = "r", descriptor = "Z")
	boolean aBoolean679;

	@OriginalMember(owner = "client!gq", name = "v", descriptor = "Z")
	boolean aBoolean680;

	@OriginalMember(owner = "client!gq", name = "s", descriptor = "I")
	int anInt3967;

	@OriginalMember(owner = "client!gq", name = "w", descriptor = "J")
	final long aLong253;

	@OriginalMember(owner = "client!gq", name = "l", descriptor = "Ljava/lang/String;")
	final String aString164;

	@OriginalMember(owner = "client!gq", name = "z", descriptor = "I")
	final int anInt3964;

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "Ljava/util/ArrayList;")
	final ArrayList anArrayList3;

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "Ljava/util/ArrayList;")
	final ArrayList anArrayList4;

	@OriginalMember(owner = "client!gq", name = "p", descriptor = "Lclient!abn;")
	final Class40 aClass40_1;

	@OriginalMember(owner = "client!gq", name = "dg", descriptor = "(Lclient!yf;I)V")
	static void method26787(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class237.method25864(local11, local14, arg0, (short) 5134);
	}

	@OriginalMember(owner = "client!gq", name = "age", descriptor = "(Lclient!yf;B)V")
	static void method26788(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class440.method29033((long) arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091] * 60000L, Class106.aClass717_8.getId(), true, (byte) -125) + " UTC";
	}

	@OriginalMember(owner = "client!gq", name = "aoi", descriptor = "(Lclient!yf;I)V")
	static void method26789(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (!Class65.aClass123_Sub1_2.method9023(-1662199153).method27598(406481090)) {
			throw new RuntimeException();
		}
		@Pc(14) Class124_Sub3 local14 = (Class124_Sub3) Class65.aClass123_Sub1_2.method8952((byte) -51);
		local14.method21444(Class382.aClass479_2, -1, 0.0F, 1457100682);
		client.aBoolean621 = true;
	}

	@OriginalMember(owner = "client!gq", name = "awn", descriptor = "(Lclient!yf;B)V")
	static void method26790(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= -725861497;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2];
		@Pc(42) long local42 = Class569.method31492(0, 0, 12, local13, local23, local33, -230131351);
		@Pc(45) int local45 = Class706.method36922(local42);
		if (local33 < 1970) {
			local45--;
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local45;
	}

	@OriginalMember(owner = "client!gq", name = "w", descriptor = "(Lclient!py;II)Lclient!asy;")
	static Class93_Sub1_Sub20 method26791(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class93_Sub41 local8 = new Class93_Sub41(arg0.method30225(0, arg1, (byte) 0));
		return Class44_Sub1.method17444(local8, arg1, -1804936624);
	}

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(JLclient!alw;ZLclient!gu;)V")
	public Class297(@OriginalArg(0) long arg0, @OriginalArg(1) Class93_Sub41 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Interface27 arg3) {
		this.aLong252 = arg0 * -1593019501305181665L;
		@Pc(13) int local13 = arg1.method22425((short) 16384);
		if (local13 <= 0 || local13 > 1) {
			throw new IllegalStateException("");
		}
		@Pc(27) int local27 = arg1.method22425((short) 16384);
		this.aBoolean678 = (local27 & 0x1) != 0;
		this.aBoolean679 = (local27 & 0x2) != 0;
		this.aBoolean680 = (local27 & 0x4) != 0;
		this.anInt3967 = arg1.method22431(-118643075) * -2007260593;
		this.aLong253 = arg1.method22435(1417271561) * 2406700482966643721L;
		this.aString164 = arg1.method22439(1568738619);
		this.anInt3964 = arg1.method22494((byte) -9) * 786987457;
		arg1.method22431(-118643075);
		arg1.method22435(464392751);
		@Pc(94) int local94 = arg1.method22427(-1434290800);
		this.anArrayList3 = new ArrayList(local94);
		@Pc(102) int local102;
		for (local102 = 0; local102 < local94; local102++) {
			this.anArrayList3.add(new Class304(arg1, this.aBoolean679, this.aBoolean680, arg3));
		}
		local102 = arg1.method22427(-1434290800);
		this.anArrayList4 = new ArrayList(local102);
		@Pc(132) int local132;
		for (local132 = 0; local132 < local102; local132++) {
			this.anArrayList4.add(new Class282(arg1, this.aBoolean679, this.aBoolean680));
		}
		this.aClass40_1 = new Class40(arg3.method25621((byte) 50));
		local132 = arg1.method22427(-1434290800);
		for (@Pc(163) int local163 = 0; local163 < local132; local163++) {
			@Pc(173) Class466 local173 = arg3.method25621((byte) -91).method1463(arg1, (byte) 28);
			this.aClass40_1.method776(local173.anInt5253 * -1181855333, local173.anObject19, (byte) 67);
		}
		if (!arg2) {
			arg1.method22427(-1434290800);
			arg1.method22427(-1434290800);
			arg1.method22427(-1434290800);
			arg1.method22427(-1434290800);
			arg1.method22427(-1434290800);
		}
		this.method26706(-935677119);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIB)V")
	void method26704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		((Class304) this.anArrayList3.get(arg0)).method26848(arg1, -1062072040);
	}

	@OriginalMember(owner = "client!gq", name = "ak", descriptor = "()Lclient!eh;")
	public Interface20 method26705() {
		return new Class113(Class138.aClass138_70, this.aClass40_1);
	}

	@OriginalMember(owner = "client!gq", name = "u", descriptor = "(I)V")
	void method26706(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		@Pc(3) int local3 = -1;
		for (@Pc(5) int local5 = 0; local5 < this.anArrayList3.size(); local5++) {
			@Pc(16) Class304 local16 = (Class304) this.anArrayList3.get(local5);
			@Pc(20) int local20 = local16.method26843((short) -11420);
			if (local20 > local1) {
				local1 = local20;
				local3 = local5;
			}
		}
		this.anInt3966 = local3 * -123819125;
	}

	@OriginalMember(owner = "client!gq", name = "m", descriptor = "(I)I")
	int method26707(@OriginalArg(0) int arg0) {
		return this.anInt3967 * -1470352209;
	}

	@OriginalMember(owner = "client!gq", name = "bu", descriptor = "(I)V")
	void method26708(@OriginalArg(0) int arg0) {
		@Pc(5) Class304 local5 = (Class304) this.anArrayList3.get(arg0);
		local5.method26857(false, (byte) -128);
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)Ljava/lang/String;")
	public String method26709(@OriginalArg(0) int arg0) {
		return this.aString164;
	}

	@OriginalMember(owner = "client!gq", name = "w", descriptor = "(I)I")
	public int method26710(@OriginalArg(0) int arg0) {
		return this.anInt3964 * -1272801727;
	}

	@OriginalMember(owner = "client!gq", name = "l", descriptor = "(I)J")
	public long method26711(@OriginalArg(0) int arg0) {
		return this.aLong253 * 8873518649050786361L;
	}

	@OriginalMember(owner = "client!gq", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return (int) (this.aLong252 * 2439707864836714975L);
	}

	@OriginalMember(owner = "client!gq", name = "au", descriptor = "()I")
	public int method26712() {
		return this.anInt3964 * -1272801727;
	}

	@OriginalMember(owner = "client!gq", name = "z", descriptor = "(B)I")
	public int method26713(@OriginalArg(0) byte arg0) {
		return this.anInt3966 * -127065053;
	}

	@OriginalMember(owner = "client!gq", name = "ai", descriptor = "()I")
	int method26714() {
		return this.anInt3967 * -1470352209;
	}

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "(II)Lclient!gy;")
	public Class304 method26715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == -1 ? null : (Class304) this.anArrayList3.get(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "bw", descriptor = "(IZ)V")
	void method26716(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(5) Class304 local5 = (Class304) this.anArrayList3.get(arg0);
		local5.method26846(arg1 ? Class301.aClass301_2 : Class301.aClass301_3, 2077060238);
	}

	@OriginalMember(owner = "client!gq", name = "r", descriptor = "(I)Lclient!eh;")
	public Interface20 method26717(@OriginalArg(0) int arg0) {
		return new Class113(Class138.aClass138_70, this.aClass40_1);
	}

	@OriginalMember(owner = "client!gq", name = "v", descriptor = "(Lclient!gy;B)V")
	void method26718(@OriginalArg(0) Class304 arg0, @OriginalArg(1) byte arg1) {
		this.anArrayList3.add(arg0);
		this.method26706(758577125);
	}

	@OriginalMember(owner = "client!gq", name = "bn", descriptor = "(Lclient!ga;)V")
	void method26719(@OriginalArg(0) Class282 arg0) {
		this.anArrayList4.add(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "(B)Ljava/util/List;")
	public List method26720(@OriginalArg(0) byte arg0) {
		return Collections.unmodifiableList(this.anArrayList3);
	}

	@OriginalMember(owner = "client!gq", name = "y", descriptor = "(II)V")
	void method26721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anArrayList4.remove(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "q", descriptor = "(III)V")
	void method26722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		((Class304) this.anArrayList3.get(arg0)).method26839(arg1, (byte) 83);
		this.method26706(-1882768024);
	}

	@OriginalMember(owner = "client!gq", name = "x", descriptor = "(III)V")
	void method26723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class304 local5 = (Class304) this.anArrayList3.get(arg0);
		local5.method26885(arg1, 1886652544);
		local5.method26857(true, (byte) -128);
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(II)V")
	void method26724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class304 local5 = (Class304) this.anArrayList3.get(arg0);
		local5.method26857(false, (byte) -128);
	}

	@OriginalMember(owner = "client!gq", name = "h", descriptor = "(IZS)V")
	void method26725(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) short arg2) {
		@Pc(5) Class304 local5 = (Class304) this.anArrayList3.get(arg0);
		local5.method26846(arg1 ? Class301.aClass301_2 : Class301.aClass301_3, 2140516169);
	}

	@OriginalMember(owner = "client!gq", name = "j", descriptor = "(ILclient!gy;I)V")
	void method26726(@OriginalArg(0) int arg0, @OriginalArg(1) Class304 arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class304 local5 = (Class304) this.anArrayList3.get(arg0);
		local5.method26852(arg1, -103983867);
	}

	@OriginalMember(owner = "client!gq", name = "bd", descriptor = "(I)V")
	void method26727(@OriginalArg(0) int arg0) {
		this.anArrayList3.remove(arg0);
		this.method26706(-1140541464);
	}

	@OriginalMember(owner = "client!gq", name = "i", descriptor = "(B)V")
	void method26728(@OriginalArg(0) byte arg0) {
		@Pc(3) Iterator local3 = this.anArrayList3.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class304 local10 = (Class304) local3.next();
			local10.method26846(Class301.aClass301_1, 2114728482);
		}
	}

	@OriginalMember(owner = "client!gq", name = "ab", descriptor = "(I)Lclient!gy;")
	public Class304 method26729(@OriginalArg(0) int arg0) {
		return arg0 == -1 ? null : (Class304) this.anArrayList3.get(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "t", descriptor = "()Ljava/util/List;")
	public List method26730() {
		return Collections.unmodifiableList(this.anArrayList3);
	}

	@OriginalMember(owner = "client!gq", name = "ae", descriptor = "()Ljava/util/List;")
	public List method26731() {
		return Collections.unmodifiableList(this.anArrayList3);
	}

	@OriginalMember(owner = "client!gq", name = "ba", descriptor = "()V")
	void method26732() {
		@Pc(3) Iterator local3 = this.anArrayList3.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class304 local10 = (Class304) local3.next();
			local10.method26846(Class301.aClass301_4, 1911069056);
		}
	}

	@OriginalMember(owner = "client!gq", name = "ah", descriptor = "()Ljava/util/List;")
	public List method26733() {
		return Collections.unmodifiableList(this.anArrayList4);
	}

	@OriginalMember(owner = "client!gq", name = "al", descriptor = "()I")
	int method26734() {
		return this.anInt3967 * -1470352209;
	}

	@OriginalMember(owner = "client!gq", name = "ac", descriptor = "()I")
	int method26735() {
		return this.anInt3967 * -1470352209;
	}

	@OriginalMember(owner = "client!gq", name = "k", descriptor = "(B)V")
	void method26736(@OriginalArg(0) byte arg0) {
		this.anInt3967 += -2007260593;
	}

	@OriginalMember(owner = "client!gq", name = "ay", descriptor = "()Lclient!gv;")
	public Class301 method26737() {
		if (this.anArrayList3.isEmpty()) {
			return Class301.aClass301_3;
		}
		@Pc(13) Class301 local13 = ((Class304) this.anArrayList3.get(0)).method26845((short) -25757);
		switch(local13.anInt3970 * 1122922251) {
			case 1:
			case 2:
				return local13;
			default:
				@Pc(22) Iterator local22 = this.anArrayList3.iterator();
				@Pc(29) Class304 local29;
				do {
					if (!local22.hasNext()) {
						return Class301.aClass301_2;
					}
					local29 = (Class304) local22.next();
				} while (local29.method26845((short) 14451) != Class301.aClass301_3);
				return Class301.aClass301_3;
		}
	}

	@OriginalMember(owner = "client!gq", name = "as", descriptor = "()V")
	void method26738() {
		this.anInt3967 += -2007260593;
	}

	@OriginalMember(owner = "client!gq", name = "at", descriptor = "()V")
	void method26739() {
		this.anInt3967 += -2007260593;
	}

	@OriginalMember(owner = "client!gq", name = "ad", descriptor = "()Z")
	public boolean method26740() {
		return this.aBoolean678;
	}

	@OriginalMember(owner = "client!gq", name = "am", descriptor = "()I")
	public int method26741() {
		return this.anInt3964 * -1272801727;
	}

	@OriginalMember(owner = "client!gq", name = "ar", descriptor = "()J")
	public long method26742() {
		return this.aLong253 * 8873518649050786361L;
	}

	@OriginalMember(owner = "client!gq", name = "ap", descriptor = "()J")
	public long method26743() {
		return this.aLong253 * 8873518649050786361L;
	}

	@OriginalMember(owner = "client!gq", name = "rk", descriptor = "()I")
	public int method26744() {
		return (int) (this.aLong252 * 2439707864836714975L);
	}

	@OriginalMember(owner = "client!gq", name = "rm", descriptor = "()I")
	public int method26745() {
		return (int) (this.aLong252 * 2439707864836714975L);
	}

	@OriginalMember(owner = "client!gq", name = "ri", descriptor = "()I")
	public int method26746() {
		return (int) (this.aLong252 * 2439707864836714975L);
	}

	@OriginalMember(owner = "client!gq", name = "aw", descriptor = "()V")
	void method26747() {
		this.anInt3967 += -2007260593;
	}

	@OriginalMember(owner = "client!gq", name = "ax", descriptor = "()I")
	public int method26748() {
		return this.anInt3966 * -127065053;
	}

	@OriginalMember(owner = "client!gq", name = "av", descriptor = "()I")
	public int method26749() {
		return this.anInt3966 * -127065053;
	}

	@OriginalMember(owner = "client!gq", name = "ao", descriptor = "()I")
	public int method26750() {
		return this.anInt3966 * -127065053;
	}

	@OriginalMember(owner = "client!gq", name = "aj", descriptor = "()Lclient!gv;")
	public Class301 method26751() {
		if (this.anArrayList3.isEmpty()) {
			return Class301.aClass301_3;
		}
		@Pc(13) Class301 local13 = ((Class304) this.anArrayList3.get(0)).method26845((short) 15601);
		switch(local13.anInt3970 * 1122922251) {
			case 1:
			case 2:
				return local13;
			default:
				@Pc(22) Iterator local22 = this.anArrayList3.iterator();
				@Pc(29) Class304 local29;
				do {
					if (!local22.hasNext()) {
						return Class301.aClass301_2;
					}
					local29 = (Class304) local22.next();
				} while (local29.method26845((short) -10793) != Class301.aClass301_3);
				return Class301.aClass301_3;
		}
	}

	@OriginalMember(owner = "client!gq", name = "n", descriptor = "(B)Ljava/util/List;")
	public List method26752(@OriginalArg(0) byte arg0) {
		return Collections.unmodifiableList(this.anArrayList4);
	}

	@OriginalMember(owner = "client!gq", name = "o", descriptor = "(II)V")
	void method26753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anArrayList3.remove(arg0);
		this.method26706(1642011608);
	}

	@OriginalMember(owner = "client!gq", name = "az", descriptor = "(I)Lclient!gy;")
	public Class304 method26754(@OriginalArg(0) int arg0) {
		return arg0 == -1 ? null : (Class304) this.anArrayList3.get(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "aa", descriptor = "(I)Lclient!gy;")
	public Class304 method26755(@OriginalArg(0) int arg0) {
		return arg0 == -1 ? null : (Class304) this.anArrayList3.get(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "af", descriptor = "()Ljava/lang/String;")
	public String method26756() {
		return this.aString164;
	}

	@OriginalMember(owner = "client!gq", name = "br", descriptor = "(II)V")
	void method26757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		((Class304) this.anArrayList3.get(arg0)).method26848(arg1, -2129539254);
	}

	@OriginalMember(owner = "client!gq", name = "an", descriptor = "()Lclient!eh;")
	public Interface20 method26758() {
		return new Class113(Class138.aClass138_70, this.aClass40_1);
	}

	@OriginalMember(owner = "client!gq", name = "bo", descriptor = "(IZ)V")
	void method26759(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(5) Class304 local5 = (Class304) this.anArrayList3.get(arg0);
		local5.method26846(arg1 ? Class301.aClass301_2 : Class301.aClass301_3, 2052817658);
	}

	@OriginalMember(owner = "client!gq", name = "bm", descriptor = "(II)V")
	void method26760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		((Class304) this.anArrayList3.get(arg0)).method26839(arg1, (byte) 43);
		this.method26706(894631263);
	}

	@OriginalMember(owner = "client!gq", name = "bk", descriptor = "(Lclient!gy;)V")
	void method26761(@OriginalArg(0) Class304 arg0) {
		this.anArrayList3.add(arg0);
		this.method26706(-129078341);
	}

	@OriginalMember(owner = "client!gq", name = "bh", descriptor = "(Lclient!gy;)V")
	void method26762(@OriginalArg(0) Class304 arg0) {
		this.anArrayList3.add(arg0);
		this.method26706(667972257);
	}

	@OriginalMember(owner = "client!gq", name = "bx", descriptor = "(I)V")
	void method26763(@OriginalArg(0) int arg0) {
		this.anArrayList3.remove(arg0);
		this.method26706(1537900990);
	}

	@OriginalMember(owner = "client!gq", name = "f", descriptor = "(I)Z")
	public boolean method26764(@OriginalArg(0) int arg0) {
		return this.aBoolean678;
	}

	@OriginalMember(owner = "client!gq", name = "bc", descriptor = "(Lclient!ga;)V")
	void method26765(@OriginalArg(0) Class282 arg0) {
		this.anArrayList4.add(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "bi", descriptor = "(Lclient!ga;)V")
	void method26766(@OriginalArg(0) Class282 arg0) {
		this.anArrayList4.add(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "p", descriptor = "(B)Lclient!gv;")
	public Class301 method26767(@OriginalArg(0) byte arg0) {
		if (this.anArrayList3.isEmpty()) {
			return Class301.aClass301_3;
		}
		@Pc(13) Class301 local13 = ((Class304) this.anArrayList3.get(0)).method26845((short) -826);
		switch(local13.anInt3970 * 1122922251) {
			case 1:
			case 2:
				return local13;
			default:
				@Pc(22) Iterator local22 = this.anArrayList3.iterator();
				@Pc(29) Class304 local29;
				do {
					if (!local22.hasNext()) {
						return Class301.aClass301_2;
					}
					local29 = (Class304) local22.next();
				} while (local29.method26845((short) -9472) != Class301.aClass301_3);
				return Class301.aClass301_3;
		}
	}

	@OriginalMember(owner = "client!gq", name = "bt", descriptor = "(Lclient!ga;)V")
	void method26768(@OriginalArg(0) Class282 arg0) {
		this.anArrayList4.add(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "bq", descriptor = "(I)V")
	void method26769(@OriginalArg(0) int arg0) {
		this.anArrayList4.remove(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "aq", descriptor = "()V")
	void method26770() {
		@Pc(1) int local1 = -1;
		@Pc(3) int local3 = -1;
		for (@Pc(5) int local5 = 0; local5 < this.anArrayList3.size(); local5++) {
			@Pc(16) Class304 local16 = (Class304) this.anArrayList3.get(local5);
			@Pc(20) int local20 = local16.method26843((short) -10914);
			if (local20 > local1) {
				local1 = local20;
				local3 = local5;
			}
		}
		this.anInt3966 = local3 * -123819125;
	}

	@OriginalMember(owner = "client!gq", name = "ag", descriptor = "()Ljava/util/List;")
	public List method26771() {
		return Collections.unmodifiableList(this.anArrayList3);
	}

	@OriginalMember(owner = "client!gq", name = "be", descriptor = "(II)V")
	void method26772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class304 local5 = (Class304) this.anArrayList3.get(arg0);
		local5.method26885(arg1, 1259943580);
		local5.method26857(true, (byte) -128);
	}

	@OriginalMember(owner = "client!gq", name = "by", descriptor = "(II)V")
	void method26773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class304 local5 = (Class304) this.anArrayList3.get(arg0);
		local5.method26885(arg1, 1042683699);
		local5.method26857(true, (byte) -128);
	}

	@OriginalMember(owner = "client!gq", name = "s", descriptor = "(Lclient!ga;S)V")
	void method26774(@OriginalArg(0) Class282 arg0, @OriginalArg(1) short arg1) {
		this.anArrayList4.add(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "cl", descriptor = "()V")
	void method26775() {
		@Pc(3) Iterator local3 = this.anArrayList3.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class304 local10 = (Class304) local3.next();
			local10.method26846(Class301.aClass301_1, 1985270339);
		}
	}

	@OriginalMember(owner = "client!gq", name = "bf", descriptor = "(Lclient!gy;)V")
	void method26776(@OriginalArg(0) Class304 arg0) {
		this.anArrayList3.add(arg0);
		this.method26706(1801809986);
	}

	@OriginalMember(owner = "client!gq", name = "bz", descriptor = "(IZ)V")
	void method26777(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(5) Class304 local5 = (Class304) this.anArrayList3.get(arg0);
		local5.method26846(arg1 ? Class301.aClass301_2 : Class301.aClass301_3, 2069668649);
	}

	@OriginalMember(owner = "client!gq", name = "bv", descriptor = "(II)V")
	void method26778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		((Class304) this.anArrayList3.get(arg0)).method26848(arg1, -129455002);
	}

	@OriginalMember(owner = "client!gq", name = "bb", descriptor = "(II)V")
	void method26779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		((Class304) this.anArrayList3.get(arg0)).method26839(arg1, (byte) 11);
		this.method26706(987414438);
	}

	@OriginalMember(owner = "client!gq", name = "bg", descriptor = "(II)V")
	void method26780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		((Class304) this.anArrayList3.get(arg0)).method26848(arg1, 1560713515);
	}

	@OriginalMember(owner = "client!gq", name = "cg", descriptor = "(ILclient!gy;)V")
	void method26781(@OriginalArg(0) int arg0, @OriginalArg(1) Class304 arg1) {
		@Pc(5) Class304 local5 = (Class304) this.anArrayList3.get(arg0);
		local5.method26852(arg1, -1358627470);
	}

	@OriginalMember(owner = "client!gq", name = "bp", descriptor = "()V")
	void method26782() {
		@Pc(3) Iterator local3 = this.anArrayList3.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class304 local10 = (Class304) local3.next();
			local10.method26846(Class301.aClass301_1, 2134856380);
		}
	}

	@OriginalMember(owner = "client!gq", name = "bj", descriptor = "()V")
	void method26783() {
		@Pc(3) Iterator local3 = this.anArrayList3.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class304 local10 = (Class304) local3.next();
			local10.method26846(Class301.aClass301_1, 2117640521);
		}
	}

	@OriginalMember(owner = "client!gq", name = "bs", descriptor = "()V")
	void method26784() {
		@Pc(3) Iterator local3 = this.anArrayList3.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class304 local10 = (Class304) local3.next();
			local10.method26846(Class301.aClass301_1, 2121721680);
		}
	}

	@OriginalMember(owner = "client!gq", name = "bl", descriptor = "(Lclient!gy;)V")
	void method26785(@OriginalArg(0) Class304 arg0) {
		this.anArrayList3.add(arg0);
		this.method26706(-1246665786);
	}

	@OriginalMember(owner = "client!gq", name = "g", descriptor = "(I)V")
	void method26786(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.anArrayList3.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class304 local10 = (Class304) local3.next();
			local10.method26846(Class301.aClass301_4, 2062967067);
		}
	}
}
