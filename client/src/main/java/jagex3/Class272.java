package jagex3;

import jagex3.twitchtv.TwitchWebcamDevice;
import jagex3.twitchtv.TwitchWebcamDeviceCapability;
import java.util.ArrayList;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class272 {

	@OriginalMember(owner = "client!fq", name = "y", descriptor = "Lclient!arm;")
	static Class93_Sub1_Sub7 aClass93_Sub1_Sub7_5;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fq", name = "this$0", descriptor = "Lclient!fb;")
	final Class258 aClass258_9;

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "Ljava/util/List;")
	List aList9;

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "(Lclient!yf;B)V")
	static void method26412(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(27) TwitchWebcamDevice local27 = Class108_Sub1.method5224(local13, (byte) -13);
		@Pc(29) TwitchWebcamDeviceCapability local29 = null;
		if (local27 != null) {
			local29 = local27.method25485(local23);
		}
		if (local29 != null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local29.anInt3626 * -344415541;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local29.anInt3627 * -959530973;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local29.anInt3628 * -1121660407;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local29.anInt3629 * -576563203;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local29.anInt3630 * -2127096581;
			return;
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
	}

	@OriginalMember(owner = "client!fq", name = "avo", descriptor = "(Lclient!yf;I)V")
	static void method26413(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!fq", name = "am", descriptor = "(I)I")
	public static int method26414(@OriginalArg(0) int arg0) {
		return Class625.aTwitchWebcamDeviceArray1 == null ? 0 : Class625.aTwitchWebcamDeviceArray1.length;
	}

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!fb;)V")
	Class272(@OriginalArg(0) Class258 arg0) {
		this.aClass258_9 = arg0;
		this.aList9 = new ArrayList();
	}

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "(Lclient!rw;I)V")
	void method26401(@OriginalArg(0) Class539 arg0, @OriginalArg(1) int arg1) {
		this.aList9.add(arg0);
	}

	@OriginalMember(owner = "client!fq", name = "l", descriptor = "(Lclient!rw;)V")
	void method26402(@OriginalArg(0) Class539 arg0) {
		this.aList9.add(arg0);
	}

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "(Lclient!rw;)V")
	void method26403(@OriginalArg(0) Class539 arg0) {
		this.aList9.add(arg0);
	}

	@OriginalMember(owner = "client!fq", name = "k", descriptor = "(Lclient!rw;I)Z")
	boolean method26404(@OriginalArg(0) Class539 arg0, @OriginalArg(1) int arg1) {
		return this.aList9.contains(arg0);
	}

	@OriginalMember(owner = "client!fq", name = "n", descriptor = "(Lclient!rw;I)V")
	void method26405(@OriginalArg(0) Class539 arg0, @OriginalArg(1) int arg1) {
		this.aList9.remove(arg0);
	}

	@OriginalMember(owner = "client!fq", name = "w", descriptor = "(Lclient!rw;)V")
	void method26406(@OriginalArg(0) Class539 arg0) {
		this.aList9.add(arg0);
	}

	@OriginalMember(owner = "client!fq", name = "z", descriptor = "()Ljava/util/List;")
	List method26407() {
		return this.aList9;
	}

	@OriginalMember(owner = "client!fq", name = "u", descriptor = "(Lclient!rw;)V")
	void method26408(@OriginalArg(0) Class539 arg0) {
		this.aList9.add(arg0);
	}

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "(Lclient!rw;)Z")
	boolean method26409(@OriginalArg(0) Class539 arg0) {
		return this.aList9.contains(arg0);
	}

	@OriginalMember(owner = "client!fq", name = "p", descriptor = "(Lclient!rw;)Z")
	boolean method26410(@OriginalArg(0) Class539 arg0) {
		return this.aList9.contains(arg0);
	}

	@OriginalMember(owner = "client!fq", name = "m", descriptor = "(B)Ljava/util/List;")
	List method26411(@OriginalArg(0) byte arg0) {
		return this.aList9;
	}
}
