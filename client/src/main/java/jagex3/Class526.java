package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class526 {

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "Lclient!rc;")
	public static final Class526 aClass526_1 = new Class526(false, false);

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "Lclient!rc;")
	public static final Class526 aClass526_2 = new Class526(true, false);

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "Lclient!rc;")
	public static final Class526 aClass526_8 = new Class526(false, false);

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "Lclient!rc;")
	public static final Class526 aClass526_3 = new Class526(true, false);

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "Lclient!rc;")
	static final Class526 aClass526_4 = new Class526(true, false);

	@OriginalMember(owner = "client!rc", name = "w", descriptor = "Lclient!rc;")
	static final Class526 aClass526_5 = new Class526(true, true);

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "Lclient!rc;")
	static final Class526 aClass526_6 = new Class526(true, true);

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "Lclient!rc;")
	public static final Class526 aClass526_7 = new Class526(false, false);

	@OriginalMember(owner = "client!rc", name = "z", descriptor = "Z")
	boolean aBoolean797;

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "Z")
	boolean aBoolean796;

	@OriginalMember(owner = "client!rc", name = "aip", descriptor = "(Lclient!yf;I)V")
	static void method30566(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(34) int local34 = Class372.aClass58_2.method1097(local13, -737304293).method22934(local23, (byte) -56).anInt6013 * 1337578489;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local34;
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(ZZ)V")
	Class526(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean797 = arg0;
		this.aBoolean796 = arg1;
	}

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "()Z")
	public boolean method30561() {
		return this.aBoolean796;
	}

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)Z")
	boolean method30562(@OriginalArg(0) int arg0) {
		return this.aBoolean797;
	}

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "(B)Z")
	public boolean method30563(@OriginalArg(0) byte arg0) {
		return this.aBoolean796;
	}

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "()Z")
	boolean method30564() {
		return this.aBoolean797;
	}

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "()Z")
	public boolean method30565() {
		return this.aBoolean796;
	}
}
