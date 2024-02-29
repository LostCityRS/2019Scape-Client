package jagex3;

import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public abstract class Class153 {

	@OriginalMember(owner = "client!uj", name = "ag", descriptor = "Lclient!cm;")
	static Class100 aClass100_18;

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(Ljava/awt/Component;Z)Lclient!uj;")
	public static Class153 method14067(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		return new Class153_Sub1(arg0, arg1);
	}

	@OriginalMember(owner = "client!uj", name = "r", descriptor = "(Ljava/awt/Component;Z)Lclient!uj;")
	public static Class153 method14068(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		return new Class153_Sub1(arg0, arg1);
	}

	@OriginalMember(owner = "client!uj", name = "v", descriptor = "(Ljava/awt/Component;Z)Lclient!uj;")
	public static Class153 method14069(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		return new Class153_Sub1(arg0, arg1);
	}

	@OriginalMember(owner = "client!uj", name = "o", descriptor = "(I)V")
	public static void method14070(@OriginalArg(0) int arg0) {
		Class32.method17839(arg0, 1073689301);
	}

	@OriginalMember(owner = "client!uj", name = "s", descriptor = "(I)V")
	public static void method14071(@OriginalArg(0) int arg0) {
		Class32.method17839(arg0, 363443849);
	}

	@OriginalMember(owner = "client!uj", name = "y", descriptor = "(I)V")
	public static void method14072(@OriginalArg(0) int arg0) {
		Class32.method17839(arg0, 1298076560);
	}

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "(Lclient!adi;B)I")
	static int method14099(@OriginalArg(0) Class83 arg0, @OriginalArg(1) byte arg1) {
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

	@OriginalMember(owner = "client!uj", name = "p", descriptor = "(I)V")
	public static void method14100(@OriginalArg(0) int arg0) {
		if (!Class625.aBoolean857) {
			return;
		}
		@Pc(4) int local4 = Class166_Sub13.aTwitchTV1.ShutdownTTV();
		if (local4 == 0) {
			Class166_Sub13.aTwitchTV1 = null;
			Class625.aBoolean857 = false;
		}
	}

	@OriginalMember(owner = "client!uj", name = "bcj", descriptor = "(Lclient!yf;I)V")
	static void method14101(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class5.method78((Class132_Sub1) arg0.anInterface61_1, arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091], true, 1684091977);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = (int) client.aFloatArray93[0];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = (int) client.aFloatArray93[1];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = (int) client.aFloatArray93[2];
	}

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
	Class153() {
	}

	@OriginalMember(owner = "client!uj", name = "u", descriptor = "(I)I")
	public abstract int method14058(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uj", name = "m", descriptor = "(I)V")
	public abstract void method14059(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uj", name = "aw", descriptor = "()Lclient!akm;")
	public abstract Class93_Sub23 method14060();

	@OriginalMember(owner = "client!uj", name = "ar", descriptor = "()Z")
	public abstract boolean method14061();

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "(I)Z")
	public final boolean method14062(@OriginalArg(0) int arg0) {
		return this.method14073((byte) -53) || this.method14093(587477869) || this.method14097(-91350178);
	}

	@OriginalMember(owner = "client!uj", name = "am", descriptor = "()V")
	public abstract void method14063();

	@OriginalMember(owner = "client!uj", name = "z", descriptor = "(I)I")
	public abstract int method14064(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uj", name = "p", descriptor = "(I)Lclient!akm;")
	public abstract Class93_Sub23 method14065(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uj", name = "ax", descriptor = "()I")
	public abstract int method14066();

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "(B)Z")
	public abstract boolean method14073(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!uj", name = "ai", descriptor = "()Lclient!akm;")
	public abstract Class93_Sub23 method14074();

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "()V")
	public abstract void method14075();

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "()Z")
	public abstract boolean method14076();

	@OriginalMember(owner = "client!uj", name = "t", descriptor = "()Z")
	public abstract boolean method14077();

	@OriginalMember(owner = "client!uj", name = "av", descriptor = "()I")
	public abstract int method14078();

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "()Z")
	public abstract boolean method14079();

	@OriginalMember(owner = "client!uj", name = "j", descriptor = "()Z")
	public abstract boolean method14080();

	@OriginalMember(owner = "client!uj", name = "x", descriptor = "()V")
	public abstract void method14081();

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "()Z")
	public abstract boolean method14082();

	@OriginalMember(owner = "client!uj", name = "ag", descriptor = "()Z")
	public final boolean method14083() {
		return this.method14073((byte) -28) || this.method14093(-425385280) || this.method14097(140450660);
	}

	@OriginalMember(owner = "client!uj", name = "ah", descriptor = "()I")
	public abstract int method14084();

	@OriginalMember(owner = "client!uj", name = "al", descriptor = "()I")
	public abstract int method14085();

	@OriginalMember(owner = "client!uj", name = "au", descriptor = "()Z")
	public abstract boolean method14086();

	@OriginalMember(owner = "client!uj", name = "q", descriptor = "()V")
	public abstract void method14087();

	@OriginalMember(owner = "client!uj", name = "ae", descriptor = "()Z")
	public final boolean method14088() {
		return this.method14073((byte) -99) || this.method14093(-993282129) || this.method14097(1532651056);
	}

	@OriginalMember(owner = "client!uj", name = "as", descriptor = "()V")
	public abstract void method14089();

	@OriginalMember(owner = "client!uj", name = "at", descriptor = "()V")
	public abstract void method14090();

	@OriginalMember(owner = "client!uj", name = "ad", descriptor = "()V")
	public abstract void method14091();

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "(I)V")
	public abstract void method14092(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "(I)Z")
	public abstract boolean method14093(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uj", name = "ac", descriptor = "()Lclient!akm;")
	public abstract Class93_Sub23 method14094();

	@OriginalMember(owner = "client!uj", name = "ap", descriptor = "()Z")
	public abstract boolean method14095();

	@OriginalMember(owner = "client!uj", name = "aq", descriptor = "()I")
	public abstract int method14096();

	@OriginalMember(owner = "client!uj", name = "w", descriptor = "(I)Z")
	public abstract boolean method14097(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "()Z")
	public abstract boolean method14098();
}
