package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!atg")
public final class Class93_Sub33_Sub1_Sub1 extends Class93_Sub33_Sub1 {

	@OriginalMember(owner = "client!atg", name = "c", descriptor = "[I")
	int[] anIntArray273 = null;

	@OriginalMember(owner = "client!atg", name = "r", descriptor = "[I")
	int[] anIntArray274 = null;

	@OriginalMember(owner = "client!atg", name = "d", descriptor = "Lclient!agc;")
	Class115_Sub1 aClass115_Sub1_2;

	@OriginalMember(owner = "client!atg", name = "<init>", descriptor = "(Lclient!agc;Lclient!hv;)V")
	Class93_Sub33_Sub1_Sub1(@OriginalArg(0) Class115_Sub1 arg0, @OriginalArg(1) Class325 arg1) {
		super(arg1);
		this.aClass115_Sub1_2 = arg0;
		this.anIntArray273 = arg1.anIntArray406;
		this.anIntArray274 = arg1.anIntArray407;
	}

	@OriginalMember(owner = "client!atg", name = "u", descriptor = "(I)Z")
	@Override
	public boolean method23670(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!atg", name = "a", descriptor = "()I")
	int method23420() {
		return this.anIntArray273[this.aClass115_Sub1_2.method8253(-416489462)];
	}

	@OriginalMember(owner = "client!atg", name = "g", descriptor = "()I")
	int method23421() {
		return this.anIntArray274[this.aClass115_Sub1_2.method8253(-1167296788)];
	}

	@OriginalMember(owner = "client!atg", name = "w", descriptor = "(I)I")
	@Override
	public int method23668(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.anIntArray273[arg0];
		@Pc(9) int local9 = this.anIntArray274[arg0];
		if (local4 == -1) {
			return local9 == -1 ? -1 : local9 | 0x10000;
		} else {
			return local4;
		}
	}

	@OriginalMember(owner = "client!atg", name = "j", descriptor = "()I")
	int method23422() {
		return this.anIntArray274[this.aClass115_Sub1_2.method8253(-1735511863)];
	}

	@OriginalMember(owner = "client!atg", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method23663(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!atg", name = "z", descriptor = "(I)Z")
	@Override
	public boolean method23672(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!atg", name = "x", descriptor = "(I)I")
	@Override
	public int method23677(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.anIntArray273[arg0];
		@Pc(9) int local9 = this.anIntArray274[arg0];
		if (local4 == -1) {
			return local9 == -1 ? -1 : local9 | 0x10000;
		} else {
			return local4;
		}
	}

	@OriginalMember(owner = "client!atg", name = "h", descriptor = "(I)I")
	@Override
	public int method23664(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.anIntArray273[arg0];
		@Pc(9) int local9 = this.anIntArray274[arg0];
		if (local4 == -1) {
			return local9 == -1 ? -1 : local9 | 0x10000;
		} else {
			return local4;
		}
	}

	@OriginalMember(owner = "client!atg", name = "i", descriptor = "()I")
	int method23423() {
		return this.anIntArray274[this.aClass115_Sub1_2.method8253(-359345275)];
	}

	@OriginalMember(owner = "client!atg", name = "l", descriptor = "(I)Z")
	@Override
	public boolean method23669(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!atg", name = "t", descriptor = "()I")
	int method23424() {
		return this.anIntArray274[this.aClass115_Sub1_2.method8253(-1238996386)];
	}
}
