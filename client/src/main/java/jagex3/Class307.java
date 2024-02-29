package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public final class Class307 {

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
	final int anInt3983;

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
	final int anInt3985;

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
	final int anInt3984;

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
	final int anInt3987;

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
	final int anInt3986;

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "[Lclient!hu;")
	final Class324[] aClass324Array1;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(IIIII[Lclient!hu;)V")
	Class307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class324[] arg5) {
		this.anInt3983 = arg0;
		this.anInt3985 = arg1;
		this.anInt3984 = arg2;
		this.anInt3987 = arg3;
		this.anInt3986 = arg4;
		this.aClass324Array1 = arg5;
	}
}
