package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!arn")
public final class Class93_Sub1_Sub8 extends Class93_Sub1 {

	@OriginalMember(owner = "client!arn", name = "z", descriptor = "I")
	int anInt3013;

	@OriginalMember(owner = "client!arn", name = "l", descriptor = "Ljava/lang/String;")
	final String aString101;

	@OriginalMember(owner = "client!arn", name = "u", descriptor = "Lclient!aap;")
	final Class18 aClass18_10;

	@OriginalMember(owner = "client!arn", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	Class93_Sub1_Sub8(@OriginalArg(0) String arg0) {
		this.aString101 = arg0;
		this.aClass18_10 = new Class18();
	}

	@OriginalMember(owner = "client!arn", name = "k", descriptor = "()I")
	int method21727() {
		return this.aClass18_10.aClass93_Sub1_4 == this.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68 ? -1 : ((Class93_Sub1_Sub7) this.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68).anInt3012 * -92627949;
	}

	@OriginalMember(owner = "client!arn", name = "l", descriptor = "(Lclient!arm;)Z")
	boolean method21728(@OriginalArg(0) Class93_Sub1_Sub7 arg0) {
		@Pc(1) boolean local1 = true;
		arg0.method23988((short) 5146);
		@Pc(10) Class93_Sub1_Sub7 local10 = (Class93_Sub1_Sub7) this.aClass18_10.method246(-1771149327);
		while (local10 != null) {
			if (Class19_Sub3.method17567(arg0.anInt3012 * -92627949, local10.anInt3012 * -92627949, 1385938362)) {
				Class615.method32268(arg0, local10, -1869149186);
				this.anInt3013 += -280530287;
				return !local1;
			}
			local10 = (Class93_Sub1_Sub7) this.aClass18_10.method253(765782647);
			local1 = false;
		}
		this.aClass18_10.method268(arg0, 1675024292);
		this.anInt3013 += -280530287;
		return local1;
	}

	@OriginalMember(owner = "client!arn", name = "n", descriptor = "(Lclient!arm;I)Z")
	boolean method21729(@OriginalArg(0) Class93_Sub1_Sub7 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) boolean local1 = true;
		arg0.method23988((short) -3927);
		@Pc(10) Class93_Sub1_Sub7 local10 = (Class93_Sub1_Sub7) this.aClass18_10.method246(1597596279);
		while (local10 != null) {
			if (Class19_Sub3.method17567(arg0.anInt3012 * -92627949, local10.anInt3012 * -92627949, 1385938362)) {
				Class615.method32268(arg0, local10, -2032140513);
				this.anInt3013 += -280530287;
				return !local1;
			}
			local10 = (Class93_Sub1_Sub7) this.aClass18_10.method253(-313381855);
			local1 = false;
		}
		this.aClass18_10.method268(arg0, 1986683831);
		this.anInt3013 += -280530287;
		return local1;
	}

	@OriginalMember(owner = "client!arn", name = "m", descriptor = "(Lclient!arm;S)Z")
	boolean method21730(@OriginalArg(0) Class93_Sub1_Sub7 arg0, @OriginalArg(1) short arg1) {
		@Pc(3) int local3 = this.method21731(2057192320);
		arg0.method23988((short) 21114);
		this.anInt3013 -= -280530287;
		if (this.anInt3013 * -2109043087 != 0) {
			return local3 != this.method21731(-2315352);
		}
		this.method23981(-2099318946);
		this.method23988((short) -10176);
		Class454.anInt5200 -= 1842152815;
		Class454.aClass240_85.method25923(this, arg0.aLong155 * 7070093341456026777L);
		return false;
	}

	@OriginalMember(owner = "client!arn", name = "e", descriptor = "(I)I")
	int method21731(@OriginalArg(0) int arg0) {
		return this.aClass18_10.aClass93_Sub1_4 == this.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68 ? -1 : ((Class93_Sub1_Sub7) this.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68).anInt3012 * -92627949;
	}

	@OriginalMember(owner = "client!arn", name = "w", descriptor = "()I")
	int method21732() {
		return this.aClass18_10.aClass93_Sub1_4 == this.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68 ? -1 : ((Class93_Sub1_Sub7) this.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68).anInt3012 * -92627949;
	}

	@OriginalMember(owner = "client!arn", name = "f", descriptor = "()I")
	int method21733() {
		return this.aClass18_10.aClass93_Sub1_4 == this.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68 ? -1 : ((Class93_Sub1_Sub7) this.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68).anInt3012 * -92627949;
	}

	@OriginalMember(owner = "client!arn", name = "u", descriptor = "(Lclient!arm;)Z")
	boolean method21734(@OriginalArg(0) Class93_Sub1_Sub7 arg0) {
		@Pc(3) int local3 = this.method21731(1246044113);
		arg0.method23988((short) -4317);
		this.anInt3013 -= -280530287;
		if (this.anInt3013 * -2109043087 != 0) {
			return local3 != this.method21731(712876979);
		}
		this.method23981(998860844);
		this.method23988((short) 12981);
		Class454.anInt5200 -= 1842152815;
		Class454.aClass240_85.method25923(this, arg0.aLong155 * 7070093341456026777L);
		return false;
	}
}
