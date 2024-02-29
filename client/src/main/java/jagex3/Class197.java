package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class197 {

	@OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
	int anInt3368 = 0;

	@OriginalMember(owner = "client!bw", name = "m", descriptor = "I")
	int anInt3369 = 0;

	@OriginalMember(owner = "client!bw", name = "k", descriptor = "I")
	int anInt3367 = 0;

	@OriginalMember(owner = "client!bw", name = "f", descriptor = "Lclient!afa;")
	final Class104_Sub1 aClass104_Sub1_43;

	@OriginalMember(owner = "client!bw", name = "w", descriptor = "Lclient!bz;")
	final Class199 aClass199_6;

	@OriginalMember(owner = "client!bw", name = "e", descriptor = "[Lclient!by;")
	Class97[] aClass97Array1;

	@OriginalMember(owner = "client!bw", name = "l", descriptor = "Lclient!aes;")
	final Class97_Sub5 aClass97_Sub5_1;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lclient!afa;)V")
	Class197(@OriginalArg(0) Class104_Sub1 arg0) {
		this.aClass104_Sub1_43 = arg0;
		this.aClass199_6 = new Class199(arg0);
		this.aClass97Array1 = new Class97[16];
		this.aClass97Array1[1] = new Class97_Sub1(arg0);
		this.aClass97Array1[2] = new Class97_Sub7(arg0, this.aClass199_6);
		this.aClass97Array1[4] = new Class97_Sub6(arg0, this.aClass199_6);
		this.aClass97Array1[5] = new Class97_Sub2(arg0, this.aClass199_6);
		this.aClass97Array1[6] = new Class97_Sub3(arg0);
		this.aClass97Array1[7] = new Class97_Sub9(arg0);
		this.aClass97Array1[3] = this.aClass97_Sub5_1 = new Class97_Sub5(arg0);
		this.aClass97Array1[8] = new Class97_Sub8(arg0, this.aClass199_6);
		this.aClass97Array1[9] = new Class97_Sub4(arg0, this.aClass199_6);
		if (!this.aClass97Array1[8].method2790()) {
			this.aClass97Array1[8] = this.aClass97Array1[4];
		}
		if (!this.aClass97Array1[9].method2790()) {
			this.aClass97Array1[9] = this.aClass97Array1[8];
		}
	}

	@OriginalMember(owner = "client!bw", name = "m", descriptor = "(Lclient!bq;I)Z")
	boolean method24631(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3367 == 0) {
			return false;
		} else {
			this.aClass97Array1[this.anInt3367 & Integer.MAX_VALUE].method2789(arg0, arg1);
			return true;
		}
	}

	@OriginalMember(owner = "client!bw", name = "e", descriptor = "(I)Z")
	boolean method24632(@OriginalArg(0) int arg0) {
		return this.aClass97Array1[arg0].method2790();
	}

	@OriginalMember(owner = "client!bw", name = "n", descriptor = "(IIIZZ)V")
	void method24633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		@Pc(5) boolean local5 = arg4 & this.aClass104_Sub1_43.method3757();
		if (!local5 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			if (arg0 == 4) {
				arg2 = arg1;
			}
			arg0 = 2;
		}
		if (arg0 != 0 && arg3) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (this.anInt3367 != arg0) {
			if (this.anInt3367 != 0) {
				this.aClass97Array1[this.anInt3367 & Integer.MAX_VALUE].method2793();
			}
			if (arg0 != 0) {
				this.aClass97Array1[arg0 & Integer.MAX_VALUE].method2801(arg3);
				this.aClass97Array1[arg0 & Integer.MAX_VALUE].method2792(arg3);
				this.aClass97Array1[arg0 & Integer.MAX_VALUE].method2794(arg1, arg2);
			}
			this.anInt3367 = arg0;
			this.anInt3368 = arg1;
			this.anInt3369 = arg2;
		} else if (this.anInt3367 != 0) {
			this.aClass97Array1[this.anInt3367 & Integer.MAX_VALUE].method2792(arg3);
			if (this.anInt3368 != arg1 || this.anInt3369 != arg2) {
				this.aClass97Array1[this.anInt3367 & Integer.MAX_VALUE].method2794(arg1, arg2);
				this.anInt3368 = arg1;
				this.anInt3369 = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "w", descriptor = "(IIIZZ)V")
	void method24634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		@Pc(5) boolean local5 = arg4 & this.aClass104_Sub1_43.method3757();
		if (!local5 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			if (arg0 == 4) {
				arg2 = arg1;
			}
			arg0 = 2;
		}
		if (arg0 != 0 && arg3) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (this.anInt3367 != arg0) {
			if (this.anInt3367 != 0) {
				this.aClass97Array1[this.anInt3367 & Integer.MAX_VALUE].method2793();
			}
			if (arg0 != 0) {
				this.aClass97Array1[arg0 & Integer.MAX_VALUE].method2801(arg3);
				this.aClass97Array1[arg0 & Integer.MAX_VALUE].method2792(arg3);
				this.aClass97Array1[arg0 & Integer.MAX_VALUE].method2794(arg1, arg2);
			}
			this.anInt3367 = arg0;
			this.anInt3368 = arg1;
			this.anInt3369 = arg2;
		} else if (this.anInt3367 != 0) {
			this.aClass97Array1[this.anInt3367 & Integer.MAX_VALUE].method2792(arg3);
			if (this.anInt3368 != arg1 || this.anInt3369 != arg2) {
				this.aClass97Array1[this.anInt3367 & Integer.MAX_VALUE].method2794(arg1, arg2);
				this.anInt3368 = arg1;
				this.anInt3369 = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "k", descriptor = "(I)Z")
	boolean method24635(@OriginalArg(0) int arg0) {
		return this.aClass97Array1[arg0].method2790();
	}

	@OriginalMember(owner = "client!bw", name = "f", descriptor = "(I)Z")
	boolean method24636(@OriginalArg(0) int arg0) {
		return this.aClass97Array1[arg0].method2790();
	}

	@OriginalMember(owner = "client!bw", name = "l", descriptor = "(Lclient!bq;I)Z")
	boolean method24637(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3367 == 0) {
			return false;
		} else {
			this.aClass97Array1[this.anInt3367 & Integer.MAX_VALUE].method2789(arg0, arg1);
			return true;
		}
	}
}
