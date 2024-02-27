package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class316 {

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "[I")
	int[] anIntArray390;

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "[I")
	int[] anIntArray391;

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "[I")
	int[] anIntArray392;

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
	int anInt4133;

	@OriginalMember(owner = "client!hl", name = "w", descriptor = "Lclient!hk;")
	Class315 aClass315_3;

	@OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
	int anInt4134;

	@OriginalMember(owner = "client!hl", name = "u", descriptor = "[I")
	int[] anIntArray393;

	@OriginalMember(owner = "client!hl", name = "m", descriptor = "[I")
	int[] anIntArray389 = null;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V")
	Class316() {
	}

	@OriginalMember(owner = "client!hl", name = "w", descriptor = "(Lclient!hk;)V")
	void method27251(@OriginalArg(0) Class315 arg0) {
		this.aClass315_3 = arg0;
		@Pc(6) int local6 = this.aClass315_3.method27227();
		this.aClass315_3.method27229(16);
		this.anInt4133 = this.aClass315_3.method27223() == 0 ? 1 : this.aClass315_3.method27229(4) + 1;
		@Pc(77) int local77;
		if (this.aClass315_3.method27223() == 0) {
			this.anInt4134 = 0;
		} else {
			this.anInt4134 = this.aClass315_3.method27229(8) + 1;
			if (this.anIntArray390 != null && this.anIntArray390.length == this.anInt4134) {
				this.method27260(this.anIntArray390);
			} else {
				this.anIntArray390 = new int[this.anInt4134];
			}
			if (this.anIntArray393 != null && this.anIntArray393.length == this.anInt4134) {
				this.method27260(this.anIntArray393);
			} else {
				this.anIntArray393 = new int[this.anInt4134];
			}
			for (local77 = 0; local77 < this.anInt4134; local77++) {
				this.anIntArray390[local77] = this.aClass315_3.method27229(this.method27254(local6 - 1));
				this.anIntArray393[local77] = this.aClass315_3.method27229(this.method27254(local6 - 1));
			}
		}
		this.aClass315_3.method27229(2);
		if (this.anInt4133 > 1) {
			this.anIntArray389 = new int[local6];
			for (local77 = 0; local77 < local6; local77++) {
				this.anIntArray389[local77] = this.aClass315_3.method27229(4);
			}
		}
		if (this.anIntArray392 != null && this.anIntArray392.length == this.anInt4133) {
			this.method27260(this.anIntArray392);
		} else {
			this.anIntArray392 = new int[this.anInt4133];
		}
		if (this.anIntArray391 != null && this.anIntArray391.length == this.anInt4133) {
			this.method27260(this.anIntArray391);
		} else {
			this.anIntArray391 = new int[this.anInt4133];
		}
		for (local77 = 0; local77 < this.anInt4133; local77++) {
			this.aClass315_3.method27229(8);
			this.anIntArray392[local77] = this.aClass315_3.method27229(8);
			this.anIntArray391[local77] = this.aClass315_3.method27229(8);
		}
	}

	@OriginalMember(owner = "client!hl", name = "z", descriptor = "(Lclient!hk;)V")
	void method27252(@OriginalArg(0) Class315 arg0) {
		this.aClass315_3 = arg0;
		@Pc(6) int local6 = this.aClass315_3.method27227();
		this.aClass315_3.method27229(16);
		this.anInt4133 = this.aClass315_3.method27223() == 0 ? 1 : this.aClass315_3.method27229(4) + 1;
		@Pc(77) int local77;
		if (this.aClass315_3.method27223() == 0) {
			this.anInt4134 = 0;
		} else {
			this.anInt4134 = this.aClass315_3.method27229(8) + 1;
			if (this.anIntArray390 != null && this.anIntArray390.length == this.anInt4134) {
				this.method27260(this.anIntArray390);
			} else {
				this.anIntArray390 = new int[this.anInt4134];
			}
			if (this.anIntArray393 != null && this.anIntArray393.length == this.anInt4134) {
				this.method27260(this.anIntArray393);
			} else {
				this.anIntArray393 = new int[this.anInt4134];
			}
			for (local77 = 0; local77 < this.anInt4134; local77++) {
				this.anIntArray390[local77] = this.aClass315_3.method27229(this.method27254(local6 - 1));
				this.anIntArray393[local77] = this.aClass315_3.method27229(this.method27254(local6 - 1));
			}
		}
		this.aClass315_3.method27229(2);
		if (this.anInt4133 > 1) {
			this.anIntArray389 = new int[local6];
			for (local77 = 0; local77 < local6; local77++) {
				this.anIntArray389[local77] = this.aClass315_3.method27229(4);
			}
		}
		if (this.anIntArray392 != null && this.anIntArray392.length == this.anInt4133) {
			this.method27260(this.anIntArray392);
		} else {
			this.anIntArray392 = new int[this.anInt4133];
		}
		if (this.anIntArray391 != null && this.anIntArray391.length == this.anInt4133) {
			this.method27260(this.anIntArray391);
		} else {
			this.anIntArray391 = new int[this.anInt4133];
		}
		for (local77 = 0; local77 < this.anInt4133; local77++) {
			this.aClass315_3.method27229(8);
			this.anIntArray392[local77] = this.aClass315_3.method27229(8);
			this.anIntArray391[local77] = this.aClass315_3.method27229(8);
		}
	}

	@OriginalMember(owner = "client!hl", name = "n", descriptor = "(Lclient!hk;)V")
	void method27253(@OriginalArg(0) Class315 arg0) {
		this.aClass315_3 = arg0;
		@Pc(6) int local6 = this.aClass315_3.method27227();
		this.aClass315_3.method27229(16);
		this.anInt4133 = this.aClass315_3.method27223() == 0 ? 1 : this.aClass315_3.method27229(4) + 1;
		@Pc(77) int local77;
		if (this.aClass315_3.method27223() == 0) {
			this.anInt4134 = 0;
		} else {
			this.anInt4134 = this.aClass315_3.method27229(8) + 1;
			if (this.anIntArray390 != null && this.anIntArray390.length == this.anInt4134) {
				this.method27260(this.anIntArray390);
			} else {
				this.anIntArray390 = new int[this.anInt4134];
			}
			if (this.anIntArray393 != null && this.anIntArray393.length == this.anInt4134) {
				this.method27260(this.anIntArray393);
			} else {
				this.anIntArray393 = new int[this.anInt4134];
			}
			for (local77 = 0; local77 < this.anInt4134; local77++) {
				this.anIntArray390[local77] = this.aClass315_3.method27229(this.method27254(local6 - 1));
				this.anIntArray393[local77] = this.aClass315_3.method27229(this.method27254(local6 - 1));
			}
		}
		this.aClass315_3.method27229(2);
		if (this.anInt4133 > 1) {
			this.anIntArray389 = new int[local6];
			for (local77 = 0; local77 < local6; local77++) {
				this.anIntArray389[local77] = this.aClass315_3.method27229(4);
			}
		}
		if (this.anIntArray392 != null && this.anIntArray392.length == this.anInt4133) {
			this.method27260(this.anIntArray392);
		} else {
			this.anIntArray392 = new int[this.anInt4133];
		}
		if (this.anIntArray391 != null && this.anIntArray391.length == this.anInt4133) {
			this.method27260(this.anIntArray391);
		} else {
			this.anIntArray391 = new int[this.anInt4133];
		}
		for (local77 = 0; local77 < this.anInt4133; local77++) {
			this.aClass315_3.method27229(8);
			this.anIntArray392[local77] = this.aClass315_3.method27229(8);
			this.anIntArray391[local77] = this.aClass315_3.method27229(8);
		}
	}

	@OriginalMember(owner = "client!hl", name = "m", descriptor = "(I)I")
	int method27254(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		while (arg0 > 0) {
			local1++;
			arg0 >>= 0x1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hl", name = "p", descriptor = "(I)I")
	int method27255(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		while (arg0 > 0) {
			local1++;
			arg0 >>= 0x1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "(Lclient!hk;)V")
	void method27256(@OriginalArg(0) Class315 arg0) {
		this.aClass315_3 = arg0;
		@Pc(6) int local6 = this.aClass315_3.method27227();
		this.aClass315_3.method27229(16);
		this.anInt4133 = this.aClass315_3.method27223() == 0 ? 1 : this.aClass315_3.method27229(4) + 1;
		@Pc(77) int local77;
		if (this.aClass315_3.method27223() == 0) {
			this.anInt4134 = 0;
		} else {
			this.anInt4134 = this.aClass315_3.method27229(8) + 1;
			if (this.anIntArray390 != null && this.anIntArray390.length == this.anInt4134) {
				this.method27260(this.anIntArray390);
			} else {
				this.anIntArray390 = new int[this.anInt4134];
			}
			if (this.anIntArray393 != null && this.anIntArray393.length == this.anInt4134) {
				this.method27260(this.anIntArray393);
			} else {
				this.anIntArray393 = new int[this.anInt4134];
			}
			for (local77 = 0; local77 < this.anInt4134; local77++) {
				this.anIntArray390[local77] = this.aClass315_3.method27229(this.method27254(local6 - 1));
				this.anIntArray393[local77] = this.aClass315_3.method27229(this.method27254(local6 - 1));
			}
		}
		this.aClass315_3.method27229(2);
		if (this.anInt4133 > 1) {
			this.anIntArray389 = new int[local6];
			for (local77 = 0; local77 < local6; local77++) {
				this.anIntArray389[local77] = this.aClass315_3.method27229(4);
			}
		}
		if (this.anIntArray392 != null && this.anIntArray392.length == this.anInt4133) {
			this.method27260(this.anIntArray392);
		} else {
			this.anIntArray392 = new int[this.anInt4133];
		}
		if (this.anIntArray391 != null && this.anIntArray391.length == this.anInt4133) {
			this.method27260(this.anIntArray391);
		} else {
			this.anIntArray391 = new int[this.anInt4133];
		}
		for (local77 = 0; local77 < this.anInt4133; local77++) {
			this.aClass315_3.method27229(8);
			this.anIntArray392[local77] = this.aClass315_3.method27229(8);
			this.anIntArray391[local77] = this.aClass315_3.method27229(8);
		}
	}

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "(Lclient!hk;)V")
	void method27257(@OriginalArg(0) Class315 arg0) {
		this.aClass315_3 = arg0;
		@Pc(6) int local6 = this.aClass315_3.method27227();
		this.aClass315_3.method27229(16);
		this.anInt4133 = this.aClass315_3.method27223() == 0 ? 1 : this.aClass315_3.method27229(4) + 1;
		@Pc(77) int local77;
		if (this.aClass315_3.method27223() == 0) {
			this.anInt4134 = 0;
		} else {
			this.anInt4134 = this.aClass315_3.method27229(8) + 1;
			if (this.anIntArray390 != null && this.anIntArray390.length == this.anInt4134) {
				this.method27260(this.anIntArray390);
			} else {
				this.anIntArray390 = new int[this.anInt4134];
			}
			if (this.anIntArray393 != null && this.anIntArray393.length == this.anInt4134) {
				this.method27260(this.anIntArray393);
			} else {
				this.anIntArray393 = new int[this.anInt4134];
			}
			for (local77 = 0; local77 < this.anInt4134; local77++) {
				this.anIntArray390[local77] = this.aClass315_3.method27229(this.method27254(local6 - 1));
				this.anIntArray393[local77] = this.aClass315_3.method27229(this.method27254(local6 - 1));
			}
		}
		this.aClass315_3.method27229(2);
		if (this.anInt4133 > 1) {
			this.anIntArray389 = new int[local6];
			for (local77 = 0; local77 < local6; local77++) {
				this.anIntArray389[local77] = this.aClass315_3.method27229(4);
			}
		}
		if (this.anIntArray392 != null && this.anIntArray392.length == this.anInt4133) {
			this.method27260(this.anIntArray392);
		} else {
			this.anIntArray392 = new int[this.anInt4133];
		}
		if (this.anIntArray391 != null && this.anIntArray391.length == this.anInt4133) {
			this.method27260(this.anIntArray391);
		} else {
			this.anIntArray391 = new int[this.anInt4133];
		}
		for (local77 = 0; local77 < this.anInt4133; local77++) {
			this.aClass315_3.method27229(8);
			this.anIntArray392[local77] = this.aClass315_3.method27229(8);
			this.anIntArray391[local77] = this.aClass315_3.method27229(8);
		}
	}

	@OriginalMember(owner = "client!hl", name = "u", descriptor = "(Lclient!hk;)V")
	void method27258(@OriginalArg(0) Class315 arg0) {
		this.aClass315_3 = arg0;
		@Pc(6) int local6 = this.aClass315_3.method27227();
		this.aClass315_3.method27229(16);
		this.anInt4133 = this.aClass315_3.method27223() == 0 ? 1 : this.aClass315_3.method27229(4) + 1;
		@Pc(77) int local77;
		if (this.aClass315_3.method27223() == 0) {
			this.anInt4134 = 0;
		} else {
			this.anInt4134 = this.aClass315_3.method27229(8) + 1;
			if (this.anIntArray390 != null && this.anIntArray390.length == this.anInt4134) {
				this.method27260(this.anIntArray390);
			} else {
				this.anIntArray390 = new int[this.anInt4134];
			}
			if (this.anIntArray393 != null && this.anIntArray393.length == this.anInt4134) {
				this.method27260(this.anIntArray393);
			} else {
				this.anIntArray393 = new int[this.anInt4134];
			}
			for (local77 = 0; local77 < this.anInt4134; local77++) {
				this.anIntArray390[local77] = this.aClass315_3.method27229(this.method27254(local6 - 1));
				this.anIntArray393[local77] = this.aClass315_3.method27229(this.method27254(local6 - 1));
			}
		}
		this.aClass315_3.method27229(2);
		if (this.anInt4133 > 1) {
			this.anIntArray389 = new int[local6];
			for (local77 = 0; local77 < local6; local77++) {
				this.anIntArray389[local77] = this.aClass315_3.method27229(4);
			}
		}
		if (this.anIntArray392 != null && this.anIntArray392.length == this.anInt4133) {
			this.method27260(this.anIntArray392);
		} else {
			this.anIntArray392 = new int[this.anInt4133];
		}
		if (this.anIntArray391 != null && this.anIntArray391.length == this.anInt4133) {
			this.method27260(this.anIntArray391);
		} else {
			this.anIntArray391 = new int[this.anInt4133];
		}
		for (local77 = 0; local77 < this.anInt4133; local77++) {
			this.aClass315_3.method27229(8);
			this.anIntArray392[local77] = this.aClass315_3.method27229(8);
			this.anIntArray391[local77] = this.aClass315_3.method27229(8);
		}
	}

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "([I)V")
	void method27259(@OriginalArg(0) int[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				arg0[local4] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "([I)V")
	void method27260(@OriginalArg(0) int[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				arg0[local4] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)I")
	int method27261(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		while (arg0 > 0) {
			local1++;
			arg0 >>= 0x1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)I")
	int method27262(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		while (arg0 > 0) {
			local1++;
			arg0 >>= 0x1;
		}
		return local1;
	}
}
