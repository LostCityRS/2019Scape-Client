package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public class Class316 {

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "[I")
	int[] anIntArray388;

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "[I")
	int[] anIntArray389;

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "[I")
	int[] anIntArray390;

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
	int anInt4092;

	@OriginalMember(owner = "client!hl", name = "w", descriptor = "Lclient!hk;")
	Class315 aClass315_2;

	@OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
	int anInt4093;

	@OriginalMember(owner = "client!hl", name = "u", descriptor = "[I")
	int[] anIntArray391;

	@OriginalMember(owner = "client!hl", name = "m", descriptor = "[I")
	int[] anIntArray387 = null;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V", line = 15)
	Class316() {
	}

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "([I)V", line = 18)
	void method27158(@OriginalArg(0) int[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				arg0[local4] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "([I)V", line = 18)
	void method27159(@OriginalArg(0) int[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				arg0[local4] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hl", name = "w", descriptor = "(Lclient!hk;)V", line = 25)
	void method27160(@OriginalArg(0) Class315 arg0) {
		this.aClass315_2 = arg0;
		@Pc(6) int local6 = this.aClass315_2.method27064();
		this.aClass315_2.method27116(16);
		this.anInt4092 = this.aClass315_2.method27112() == 0 ? 1 : this.aClass315_2.method27116(4) + 1;
		@Pc(77) int local77;
		if (this.aClass315_2.method27112() == 0) {
			this.anInt4093 = 0;
		} else {
			this.anInt4093 = this.aClass315_2.method27116(8) + 1;
			if (this.anIntArray388 != null && this.anIntArray388.length == this.anInt4093) {
				this.method27159(this.anIntArray388);
			} else {
				this.anIntArray388 = new int[this.anInt4093];
			}
			if (this.anIntArray391 != null && this.anIntArray391.length == this.anInt4093) {
				this.method27159(this.anIntArray391);
			} else {
				this.anIntArray391 = new int[this.anInt4093];
			}
			for (local77 = 0; local77 < this.anInt4093; local77++) {
				this.anIntArray388[local77] = this.aClass315_2.method27116(this.method27166(local6 - 1));
				this.anIntArray391[local77] = this.aClass315_2.method27116(this.method27166(local6 - 1));
			}
		}
		this.aClass315_2.method27116(2);
		if (this.anInt4092 > 1) {
			this.anIntArray387 = new int[local6];
			for (local77 = 0; local77 < local6; local77++) {
				this.anIntArray387[local77] = this.aClass315_2.method27116(4);
			}
		}
		if (this.anIntArray390 != null && this.anIntArray390.length == this.anInt4092) {
			this.method27159(this.anIntArray390);
		} else {
			this.anIntArray390 = new int[this.anInt4092];
		}
		if (this.anIntArray389 != null && this.anIntArray389.length == this.anInt4092) {
			this.method27159(this.anIntArray389);
		} else {
			this.anIntArray389 = new int[this.anInt4092];
		}
		for (local77 = 0; local77 < this.anInt4092; local77++) {
			this.aClass315_2.method27116(8);
			this.anIntArray390[local77] = this.aClass315_2.method27116(8);
			this.anIntArray389[local77] = this.aClass315_2.method27116(8);
		}
	}

	@OriginalMember(owner = "client!hl", name = "z", descriptor = "(Lclient!hk;)V", line = 25)
	void method27161(@OriginalArg(0) Class315 arg0) {
		this.aClass315_2 = arg0;
		@Pc(6) int local6 = this.aClass315_2.method27064();
		this.aClass315_2.method27116(16);
		this.anInt4092 = this.aClass315_2.method27112() == 0 ? 1 : this.aClass315_2.method27116(4) + 1;
		@Pc(77) int local77;
		if (this.aClass315_2.method27112() == 0) {
			this.anInt4093 = 0;
		} else {
			this.anInt4093 = this.aClass315_2.method27116(8) + 1;
			if (this.anIntArray388 != null && this.anIntArray388.length == this.anInt4093) {
				this.method27159(this.anIntArray388);
			} else {
				this.anIntArray388 = new int[this.anInt4093];
			}
			if (this.anIntArray391 != null && this.anIntArray391.length == this.anInt4093) {
				this.method27159(this.anIntArray391);
			} else {
				this.anIntArray391 = new int[this.anInt4093];
			}
			for (local77 = 0; local77 < this.anInt4093; local77++) {
				this.anIntArray388[local77] = this.aClass315_2.method27116(this.method27166(local6 - 1));
				this.anIntArray391[local77] = this.aClass315_2.method27116(this.method27166(local6 - 1));
			}
		}
		this.aClass315_2.method27116(2);
		if (this.anInt4092 > 1) {
			this.anIntArray387 = new int[local6];
			for (local77 = 0; local77 < local6; local77++) {
				this.anIntArray387[local77] = this.aClass315_2.method27116(4);
			}
		}
		if (this.anIntArray390 != null && this.anIntArray390.length == this.anInt4092) {
			this.method27159(this.anIntArray390);
		} else {
			this.anIntArray390 = new int[this.anInt4092];
		}
		if (this.anIntArray389 != null && this.anIntArray389.length == this.anInt4092) {
			this.method27159(this.anIntArray389);
		} else {
			this.anIntArray389 = new int[this.anInt4092];
		}
		for (local77 = 0; local77 < this.anInt4092; local77++) {
			this.aClass315_2.method27116(8);
			this.anIntArray390[local77] = this.aClass315_2.method27116(8);
			this.anIntArray389[local77] = this.aClass315_2.method27116(8);
		}
	}

	@OriginalMember(owner = "client!hl", name = "n", descriptor = "(Lclient!hk;)V", line = 25)
	void method27162(@OriginalArg(0) Class315 arg0) {
		this.aClass315_2 = arg0;
		@Pc(6) int local6 = this.aClass315_2.method27064();
		this.aClass315_2.method27116(16);
		this.anInt4092 = this.aClass315_2.method27112() == 0 ? 1 : this.aClass315_2.method27116(4) + 1;
		@Pc(77) int local77;
		if (this.aClass315_2.method27112() == 0) {
			this.anInt4093 = 0;
		} else {
			this.anInt4093 = this.aClass315_2.method27116(8) + 1;
			if (this.anIntArray388 != null && this.anIntArray388.length == this.anInt4093) {
				this.method27159(this.anIntArray388);
			} else {
				this.anIntArray388 = new int[this.anInt4093];
			}
			if (this.anIntArray391 != null && this.anIntArray391.length == this.anInt4093) {
				this.method27159(this.anIntArray391);
			} else {
				this.anIntArray391 = new int[this.anInt4093];
			}
			for (local77 = 0; local77 < this.anInt4093; local77++) {
				this.anIntArray388[local77] = this.aClass315_2.method27116(this.method27166(local6 - 1));
				this.anIntArray391[local77] = this.aClass315_2.method27116(this.method27166(local6 - 1));
			}
		}
		this.aClass315_2.method27116(2);
		if (this.anInt4092 > 1) {
			this.anIntArray387 = new int[local6];
			for (local77 = 0; local77 < local6; local77++) {
				this.anIntArray387[local77] = this.aClass315_2.method27116(4);
			}
		}
		if (this.anIntArray390 != null && this.anIntArray390.length == this.anInt4092) {
			this.method27159(this.anIntArray390);
		} else {
			this.anIntArray390 = new int[this.anInt4092];
		}
		if (this.anIntArray389 != null && this.anIntArray389.length == this.anInt4092) {
			this.method27159(this.anIntArray389);
		} else {
			this.anIntArray389 = new int[this.anInt4092];
		}
		for (local77 = 0; local77 < this.anInt4092; local77++) {
			this.aClass315_2.method27116(8);
			this.anIntArray390[local77] = this.aClass315_2.method27116(8);
			this.anIntArray389[local77] = this.aClass315_2.method27116(8);
		}
	}

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "(Lclient!hk;)V", line = 25)
	void method27163(@OriginalArg(0) Class315 arg0) {
		this.aClass315_2 = arg0;
		@Pc(6) int local6 = this.aClass315_2.method27064();
		this.aClass315_2.method27116(16);
		this.anInt4092 = this.aClass315_2.method27112() == 0 ? 1 : this.aClass315_2.method27116(4) + 1;
		@Pc(77) int local77;
		if (this.aClass315_2.method27112() == 0) {
			this.anInt4093 = 0;
		} else {
			this.anInt4093 = this.aClass315_2.method27116(8) + 1;
			if (this.anIntArray388 != null && this.anIntArray388.length == this.anInt4093) {
				this.method27159(this.anIntArray388);
			} else {
				this.anIntArray388 = new int[this.anInt4093];
			}
			if (this.anIntArray391 != null && this.anIntArray391.length == this.anInt4093) {
				this.method27159(this.anIntArray391);
			} else {
				this.anIntArray391 = new int[this.anInt4093];
			}
			for (local77 = 0; local77 < this.anInt4093; local77++) {
				this.anIntArray388[local77] = this.aClass315_2.method27116(this.method27166(local6 - 1));
				this.anIntArray391[local77] = this.aClass315_2.method27116(this.method27166(local6 - 1));
			}
		}
		this.aClass315_2.method27116(2);
		if (this.anInt4092 > 1) {
			this.anIntArray387 = new int[local6];
			for (local77 = 0; local77 < local6; local77++) {
				this.anIntArray387[local77] = this.aClass315_2.method27116(4);
			}
		}
		if (this.anIntArray390 != null && this.anIntArray390.length == this.anInt4092) {
			this.method27159(this.anIntArray390);
		} else {
			this.anIntArray390 = new int[this.anInt4092];
		}
		if (this.anIntArray389 != null && this.anIntArray389.length == this.anInt4092) {
			this.method27159(this.anIntArray389);
		} else {
			this.anIntArray389 = new int[this.anInt4092];
		}
		for (local77 = 0; local77 < this.anInt4092; local77++) {
			this.aClass315_2.method27116(8);
			this.anIntArray390[local77] = this.aClass315_2.method27116(8);
			this.anIntArray389[local77] = this.aClass315_2.method27116(8);
		}
	}

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "(Lclient!hk;)V", line = 25)
	void method27164(@OriginalArg(0) Class315 arg0) {
		this.aClass315_2 = arg0;
		@Pc(6) int local6 = this.aClass315_2.method27064();
		this.aClass315_2.method27116(16);
		this.anInt4092 = this.aClass315_2.method27112() == 0 ? 1 : this.aClass315_2.method27116(4) + 1;
		@Pc(77) int local77;
		if (this.aClass315_2.method27112() == 0) {
			this.anInt4093 = 0;
		} else {
			this.anInt4093 = this.aClass315_2.method27116(8) + 1;
			if (this.anIntArray388 != null && this.anIntArray388.length == this.anInt4093) {
				this.method27159(this.anIntArray388);
			} else {
				this.anIntArray388 = new int[this.anInt4093];
			}
			if (this.anIntArray391 != null && this.anIntArray391.length == this.anInt4093) {
				this.method27159(this.anIntArray391);
			} else {
				this.anIntArray391 = new int[this.anInt4093];
			}
			for (local77 = 0; local77 < this.anInt4093; local77++) {
				this.anIntArray388[local77] = this.aClass315_2.method27116(this.method27166(local6 - 1));
				this.anIntArray391[local77] = this.aClass315_2.method27116(this.method27166(local6 - 1));
			}
		}
		this.aClass315_2.method27116(2);
		if (this.anInt4092 > 1) {
			this.anIntArray387 = new int[local6];
			for (local77 = 0; local77 < local6; local77++) {
				this.anIntArray387[local77] = this.aClass315_2.method27116(4);
			}
		}
		if (this.anIntArray390 != null && this.anIntArray390.length == this.anInt4092) {
			this.method27159(this.anIntArray390);
		} else {
			this.anIntArray390 = new int[this.anInt4092];
		}
		if (this.anIntArray389 != null && this.anIntArray389.length == this.anInt4092) {
			this.method27159(this.anIntArray389);
		} else {
			this.anIntArray389 = new int[this.anInt4092];
		}
		for (local77 = 0; local77 < this.anInt4092; local77++) {
			this.aClass315_2.method27116(8);
			this.anIntArray390[local77] = this.aClass315_2.method27116(8);
			this.anIntArray389[local77] = this.aClass315_2.method27116(8);
		}
	}

	@OriginalMember(owner = "client!hl", name = "u", descriptor = "(Lclient!hk;)V", line = 25)
	void method27165(@OriginalArg(0) Class315 arg0) {
		this.aClass315_2 = arg0;
		@Pc(6) int local6 = this.aClass315_2.method27064();
		this.aClass315_2.method27116(16);
		this.anInt4092 = this.aClass315_2.method27112() == 0 ? 1 : this.aClass315_2.method27116(4) + 1;
		@Pc(77) int local77;
		if (this.aClass315_2.method27112() == 0) {
			this.anInt4093 = 0;
		} else {
			this.anInt4093 = this.aClass315_2.method27116(8) + 1;
			if (this.anIntArray388 != null && this.anIntArray388.length == this.anInt4093) {
				this.method27159(this.anIntArray388);
			} else {
				this.anIntArray388 = new int[this.anInt4093];
			}
			if (this.anIntArray391 != null && this.anIntArray391.length == this.anInt4093) {
				this.method27159(this.anIntArray391);
			} else {
				this.anIntArray391 = new int[this.anInt4093];
			}
			for (local77 = 0; local77 < this.anInt4093; local77++) {
				this.anIntArray388[local77] = this.aClass315_2.method27116(this.method27166(local6 - 1));
				this.anIntArray391[local77] = this.aClass315_2.method27116(this.method27166(local6 - 1));
			}
		}
		this.aClass315_2.method27116(2);
		if (this.anInt4092 > 1) {
			this.anIntArray387 = new int[local6];
			for (local77 = 0; local77 < local6; local77++) {
				this.anIntArray387[local77] = this.aClass315_2.method27116(4);
			}
		}
		if (this.anIntArray390 != null && this.anIntArray390.length == this.anInt4092) {
			this.method27159(this.anIntArray390);
		} else {
			this.anIntArray390 = new int[this.anInt4092];
		}
		if (this.anIntArray389 != null && this.anIntArray389.length == this.anInt4092) {
			this.method27159(this.anIntArray389);
		} else {
			this.anIntArray389 = new int[this.anInt4092];
		}
		for (local77 = 0; local77 < this.anInt4092; local77++) {
			this.aClass315_2.method27116(8);
			this.anIntArray390[local77] = this.aClass315_2.method27116(8);
			this.anIntArray389[local77] = this.aClass315_2.method27116(8);
		}
	}

	@OriginalMember(owner = "client!hl", name = "m", descriptor = "(I)I", line = 78)
	int method27166(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		while (arg0 > 0) {
			local1++;
			arg0 >>= 0x1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hl", name = "p", descriptor = "(I)I", line = 78)
	int method27167(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		while (arg0 > 0) {
			local1++;
			arg0 >>= 0x1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)I", line = 78)
	int method27168(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		while (arg0 > 0) {
			local1++;
			arg0 >>= 0x1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)I", line = 78)
	int method27169(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		while (arg0 > 0) {
			local1++;
			arg0 >>= 0x1;
		}
		return local1;
	}
}
