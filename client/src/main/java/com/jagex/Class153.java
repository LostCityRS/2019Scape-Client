package com.jagex;

import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public abstract class Class153 {

	@OriginalMember(owner = "client!uj", name = "ag", descriptor = "Lclient!cm;")
	static Class100 aClass100_18;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V", line = 9)
	Class153() {
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(Ljava/awt/Component;Z)Lclient!uj;", line = 12)
	public static Class153 method14058(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		return new Class153_Sub1(arg0, arg1);
	}

	@OriginalMember(owner = "client!uj", name = "r", descriptor = "(Ljava/awt/Component;Z)Lclient!uj;", line = 12)
	public static Class153 method14059(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		return new Class153_Sub1(arg0, arg1);
	}

	@OriginalMember(owner = "client!uj", name = "v", descriptor = "(Ljava/awt/Component;Z)Lclient!uj;", line = 12)
	public static Class153 method14060(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		return new Class153_Sub1(arg0, arg1);
	}

	@OriginalMember(owner = "client!uj", name = "o", descriptor = "(I)V", line = 16)
	public static void method14061(@OriginalArg(0) int arg0) {
		Class32.method17827(arg0, 1073689301);
	}

	@OriginalMember(owner = "client!uj", name = "s", descriptor = "(I)V", line = 16)
	public static void method14062(@OriginalArg(0) int arg0) {
		Class32.method17827(arg0, 363443849);
	}

	@OriginalMember(owner = "client!uj", name = "y", descriptor = "(I)V", line = 16)
	public static void method14063(@OriginalArg(0) int arg0) {
		Class32.method17827(arg0, 1298076560);
	}

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "(Lclient!adi;B)I", line = 16)
	static final int method14064(@OriginalArg(0) Class83 arg0, @OriginalArg(1) byte arg1) {
		if (arg0 == null) {
			return 12;
		} else {
			switch(arg0.anInt253 * 2075397759) {
				case 2:
					return 20;
				default:
					return 12;
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "(I)Z", line = 25)
	public boolean method14065(@OriginalArg(0) int arg0) {
		return this.method14078((byte) -53) || this.method14096(587477869) || this.method14100(-91350178);
	}

	@OriginalMember(owner = "client!uj", name = "ag", descriptor = "()Z", line = 25)
	public boolean method14066() {
		return this.method14078((byte) -28) || this.method14096(-425385280) || this.method14100(140450660);
	}

	@OriginalMember(owner = "client!uj", name = "ae", descriptor = "()Z", line = 25)
	public boolean method14067() {
		return this.method14078((byte) -99) || this.method14096(-993282129) || this.method14100(1532651056);
	}

	@OriginalMember(owner = "client!uj", name = "p", descriptor = "(I)V", line = 173)
	public static void method14068(@OriginalArg(0) int arg0) {
		if (!Class625.aBoolean848) {
			return;
		}
		@Pc(4) int local4 = Class166_Sub13.aTwitchTV1.ShutdownTTV();
		if (local4 == 0) {
			Class166_Sub13.aTwitchTV1 = null;
			Class625.aBoolean848 = false;
		}
	}

	@OriginalMember(owner = "client!uj", name = "bcj", descriptor = "(Lclient!yf;I)V", line = 14508)
	static final void method14069(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class5.method79((Class132_Sub1) arg0.anInterface61_1, arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091], true, 1684091977);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = (int) client.aFloatArray93[0];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = (int) client.aFloatArray93[1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = (int) client.aFloatArray93[2];
	}

	@OriginalMember(owner = "client!uj", name = "u", descriptor = "(I)I")
	public abstract int method14070(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uj", name = "m", descriptor = "(I)V")
	public abstract void method14071(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uj", name = "aw", descriptor = "()Lclient!akm;")
	public abstract Class93_Sub23 method14072();

	@OriginalMember(owner = "client!uj", name = "ar", descriptor = "()Z")
	public abstract boolean method14073();

	@OriginalMember(owner = "client!uj", name = "am", descriptor = "()V")
	public abstract void method14074();

	@OriginalMember(owner = "client!uj", name = "z", descriptor = "(I)I")
	public abstract int method14075(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uj", name = "p", descriptor = "(I)Lclient!akm;")
	public abstract Class93_Sub23 method14076(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uj", name = "ax", descriptor = "()I")
	public abstract int method14077();

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "(B)Z")
	public abstract boolean method14078(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!uj", name = "ai", descriptor = "()Lclient!akm;")
	public abstract Class93_Sub23 method14079();

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "()V")
	public abstract void method14080();

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "()Z")
	public abstract boolean method14081();

	@OriginalMember(owner = "client!uj", name = "t", descriptor = "()Z")
	public abstract boolean method14082();

	@OriginalMember(owner = "client!uj", name = "av", descriptor = "()I")
	public abstract int method14083();

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "()Z")
	public abstract boolean method14084();

	@OriginalMember(owner = "client!uj", name = "j", descriptor = "()Z")
	public abstract boolean method14085();

	@OriginalMember(owner = "client!uj", name = "x", descriptor = "()V")
	public abstract void method14086();

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "()Z")
	public abstract boolean method14087();

	@OriginalMember(owner = "client!uj", name = "ah", descriptor = "()I")
	public abstract int method14088();

	@OriginalMember(owner = "client!uj", name = "al", descriptor = "()I")
	public abstract int method14089();

	@OriginalMember(owner = "client!uj", name = "au", descriptor = "()Z")
	public abstract boolean method14090();

	@OriginalMember(owner = "client!uj", name = "q", descriptor = "()V")
	public abstract void method14091();

	@OriginalMember(owner = "client!uj", name = "as", descriptor = "()V")
	public abstract void method14092();

	@OriginalMember(owner = "client!uj", name = "at", descriptor = "()V")
	public abstract void method14093();

	@OriginalMember(owner = "client!uj", name = "ad", descriptor = "()V")
	public abstract void method14094();

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "(I)V")
	public abstract void method14095(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "(I)Z")
	public abstract boolean method14096(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uj", name = "ac", descriptor = "()Lclient!akm;")
	public abstract Class93_Sub23 method14097();

	@OriginalMember(owner = "client!uj", name = "ap", descriptor = "()Z")
	public abstract boolean method14098();

	@OriginalMember(owner = "client!uj", name = "aq", descriptor = "()I")
	public abstract int method14099();

	@OriginalMember(owner = "client!uj", name = "w", descriptor = "(I)Z")
	public abstract boolean method14100(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "()Z")
	public abstract boolean method14101();
}
