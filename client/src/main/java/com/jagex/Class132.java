package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yq")
public class Class132 {

	@OriginalMember(owner = "client!yq", name = "e", descriptor = "Lclient!oe;")
	Class458 aClass458_88 = new Class458();

	@OriginalMember(owner = "client!yq", name = "n", descriptor = "Lclient!oe;")
	Class458 aClass458_86 = new Class458();

	@OriginalMember(owner = "client!yq", name = "m", descriptor = "Z")
	boolean aBoolean559 = true;

	@OriginalMember(owner = "client!yq", name = "k", descriptor = "Lclient!oe;")
	Class458 aClass458_87 = new Class458();

	@OriginalMember(owner = "client!yq", name = "f", descriptor = "Z")
	boolean aBoolean562 = true;

	@OriginalMember(owner = "client!yq", name = "w", descriptor = "Lclient!ou;")
	Class470 aClass470_48;

	@OriginalMember(owner = "client!yq", name = "l", descriptor = "Z")
	boolean aBoolean560;

	@OriginalMember(owner = "client!yq", name = "u", descriptor = "Z")
	protected boolean aBoolean561;

	@OriginalMember(owner = "client!yq", name = "z", descriptor = "Lclient!yq;")
	Class132 aClass132_64;

	@OriginalMember(owner = "client!yq", name = "p", descriptor = "Lclient!yq;")
	Class132 aClass132_66;

	@OriginalMember(owner = "client!yq", name = "d", descriptor = "Lclient!yq;")
	Class132 aClass132_65;

	@OriginalMember(owner = "client!yq", name = "<init>", descriptor = "()V")
	Class132() {
		new Class489();
		new Class489();
		this.aClass470_48 = new Class470();
		this.aBoolean560 = true;
		this.aBoolean561 = true;
		this.aClass132_64 = null;
		this.aClass132_66 = null;
		this.aClass132_65 = null;
	}

	@OriginalMember(owner = "client!yq", name = "ap", descriptor = "()Lclient!oe;")
	public final Class458 method24229() {
		return this.aClass458_88;
	}

	@OriginalMember(owner = "client!yq", name = "ae", descriptor = "()Lclient!oe;")
	public final Class458 method24230() {
		return this.aClass458_88;
	}

	@OriginalMember(owner = "client!yq", name = "ao", descriptor = "()Lclient!oe;")
	public final Class458 method24231() {
		if (this.aBoolean559) {
			this.aBoolean559 = false;
			this.aClass458_86.method29344(this.aClass458_88);
			if (this.aClass132_64 != null) {
				this.aClass458_86.method29356(this.aClass132_64.method24241());
			}
		}
		return this.aClass458_86;
	}

	@OriginalMember(owner = "client!yq", name = "ah", descriptor = "()Lclient!oe;")
	final Class458 method24232() {
		if (this.aBoolean562) {
			this.aBoolean562 = false;
			this.aClass458_87.method29344(this.method24241());
			this.aClass458_87.method29345();
		}
		return this.aClass458_86;
	}

	@OriginalMember(owner = "client!yq", name = "bt", descriptor = "()V")
	final void method24233() {
		this.aBoolean559 = true;
		this.aBoolean562 = true;
		this.aBoolean560 = true;
		this.aBoolean561 = true;
	}

	@OriginalMember(owner = "client!yq", name = "ac", descriptor = "(Lclient!oe;)V")
	final void method24234(@OriginalArg(0) Class458 arg0) {
		this.aClass458_88.method29344(arg0);
		this.method24240();
		if (this.aClass132_66 != null) {
			this.aClass132_66.method24254();
		}
	}

	@OriginalMember(owner = "client!yq", name = "bn", descriptor = "(Lclient!oe;)V")
	final void method24235(@OriginalArg(0) Class458 arg0) {
		if (this.aClass132_64 == null) {
			this.method24234(arg0);
		} else {
			@Pc(7) Class458 local7 = new Class458(arg0);
			local7.method29356(this.aClass132_64.method24232());
			this.method24234(local7);
		}
	}

	@OriginalMember(owner = "client!yq", name = "aw", descriptor = "(Lclient!ox;)V")
	public final void method24236(@OriginalArg(0) Class472 arg0) {
		this.aClass458_88.aClass472_61.method29719(arg0);
		this.method24240();
		if (this.aClass132_66 != null) {
			this.aClass132_66.method24254();
		}
	}

	@OriginalMember(owner = "client!yq", name = "as", descriptor = "(FFF)V")
	final void method24237(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method24243(this.aClass458_88.aClass472_61.aFloat325 + arg0, this.aClass458_88.aClass472_61.aFloat326 + arg1, this.aClass458_88.aClass472_61.aFloat327 + arg2);
	}

	@OriginalMember(owner = "client!yq", name = "al", descriptor = "()Lclient!ou;")
	final Class470 method24238() {
		if (this.aBoolean560) {
			this.aBoolean560 = false;
			this.aClass470_48.method29547(this.method24241());
		}
		return this.aClass470_48;
	}

	@OriginalMember(owner = "client!yq", name = "ad", descriptor = "(Lclient!oe;)V")
	final void method24239(@OriginalArg(0) Class458 arg0) {
		if (this.aClass132_64 == null) {
			this.method24234(arg0);
		} else {
			@Pc(7) Class458 local7 = new Class458(arg0);
			local7.method29356(this.aClass132_64.method24232());
			this.method24234(local7);
		}
	}

	@OriginalMember(owner = "client!yq", name = "am", descriptor = "()V")
	final void method24240() {
		this.aBoolean559 = true;
		this.aBoolean562 = true;
		this.aBoolean560 = true;
		this.aBoolean561 = true;
	}

	@OriginalMember(owner = "client!yq", name = "ag", descriptor = "()Lclient!oe;")
	public final Class458 method24241() {
		if (this.aBoolean559) {
			this.aBoolean559 = false;
			this.aClass458_86.method29344(this.aClass458_88);
			if (this.aClass132_64 != null) {
				this.aClass458_86.method29356(this.aClass132_64.method24241());
			}
		}
		return this.aClass458_86;
	}

	@OriginalMember(owner = "client!yq", name = "ar", descriptor = "()V")
	public final void method24242() {
		@Pc(6) Class132 local6;
		if (this.aClass132_64 != null) {
			local6 = this.aClass132_64.aClass132_66;
			if (local6 == this) {
				this.aClass132_64.aClass132_66 = this.aClass132_65;
			} else {
				while (local6.aClass132_65 != this) {
					local6 = local6.aClass132_65;
				}
				local6.aClass132_65 = this.aClass132_65;
			}
		}
		this.method24240();
		if (this.aClass132_66 != null) {
			this.aClass132_66.method24254();
			local6 = this.aClass132_66;
			while (true) {
				local6.aClass458_88.method29356(this.aClass458_88);
				local6.aClass132_64 = this.aClass132_64;
				if (local6.aClass132_65 == null) {
					local6.aClass132_65 = this.aClass132_64.aClass132_66;
					this.aClass132_64.aClass132_66 = this.aClass132_66;
					break;
				}
				local6 = local6.aClass132_65;
			}
		}
		this.aClass132_64 = null;
		this.aClass132_65 = null;
		this.aClass132_66 = null;
	}

	@OriginalMember(owner = "client!yq", name = "at", descriptor = "(FFF)V")
	public final void method24243(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aClass458_88.aClass472_61.method29718(arg0, arg1, arg2);
		this.method24240();
		if (this.aClass132_66 != null) {
			this.aClass132_66.method24254();
		}
	}

	@OriginalMember(owner = "client!yq", name = "aq", descriptor = "()Lclient!oe;")
	public final Class458 method24244() {
		if (this.aBoolean559) {
			this.aBoolean559 = false;
			this.aClass458_86.method29344(this.aClass458_88);
			if (this.aClass132_64 != null) {
				this.aClass458_86.method29356(this.aClass132_64.method24241());
			}
		}
		return this.aClass458_86;
	}

	@OriginalMember(owner = "client!yq", name = "ax", descriptor = "()Lclient!oe;")
	public final Class458 method24245() {
		if (this.aBoolean559) {
			this.aBoolean559 = false;
			this.aClass458_86.method29344(this.aClass458_88);
			if (this.aClass132_64 != null) {
				this.aClass458_86.method29356(this.aClass132_64.method24241());
			}
		}
		return this.aClass458_86;
	}

	@OriginalMember(owner = "client!yq", name = "bd", descriptor = "(FFF)V")
	final void method24246(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method24243(this.aClass458_88.aClass472_61.aFloat325 + arg0, this.aClass458_88.aClass472_61.aFloat326 + arg1, this.aClass458_88.aClass472_61.aFloat327 + arg2);
	}

	@OriginalMember(owner = "client!yq", name = "ak", descriptor = "(Lclient!oe;)V")
	final void method24247(@OriginalArg(0) Class458 arg0) {
		this.aClass458_88.method29344(arg0);
		this.method24240();
		if (this.aClass132_66 != null) {
			this.aClass132_66.method24254();
		}
	}

	@OriginalMember(owner = "client!yq", name = "aj", descriptor = "()Lclient!oe;")
	final Class458 method24248() {
		if (this.aBoolean562) {
			this.aBoolean562 = false;
			this.aClass458_87.method29344(this.method24241());
			this.aClass458_87.method29345();
		}
		return this.aClass458_86;
	}

	@OriginalMember(owner = "client!yq", name = "ay", descriptor = "()Lclient!oe;")
	final Class458 method24249() {
		if (this.aBoolean562) {
			this.aBoolean562 = false;
			this.aClass458_87.method29344(this.method24241());
			this.aClass458_87.method29345();
		}
		return this.aClass458_86;
	}

	@OriginalMember(owner = "client!yq", name = "ab", descriptor = "()Lclient!ou;")
	final Class470 method24250() {
		if (this.aBoolean560) {
			this.aBoolean560 = false;
			this.aClass470_48.method29547(this.method24241());
		}
		return this.aClass470_48;
	}

	@OriginalMember(owner = "client!yq", name = "az", descriptor = "()Lclient!ou;")
	final Class470 method24251() {
		if (this.aBoolean560) {
			this.aBoolean560 = false;
			this.aClass470_48.method29547(this.method24241());
		}
		return this.aClass470_48;
	}

	@OriginalMember(owner = "client!yq", name = "aa", descriptor = "()Lclient!ou;")
	final Class470 method24252() {
		if (this.aBoolean560) {
			this.aBoolean560 = false;
			this.aClass470_48.method29547(this.method24241());
		}
		return this.aClass470_48;
	}

	@OriginalMember(owner = "client!yq", name = "af", descriptor = "(Lclient!oe;)V")
	final void method24253(@OriginalArg(0) Class458 arg0) {
		this.aClass458_88.method29344(arg0);
		this.method24240();
		if (this.aClass132_66 != null) {
			this.aClass132_66.method24254();
		}
	}

	@OriginalMember(owner = "client!yq", name = "au", descriptor = "()V")
	final void method24254() {
		this.method24240();
		if (this.aClass132_66 != null) {
			this.aClass132_66.method24254();
		}
		if (this.aClass132_65 != null) {
			this.aClass132_65.method24254();
		}
	}

	@OriginalMember(owner = "client!yq", name = "an", descriptor = "(Lclient!oe;)V")
	final void method24255(@OriginalArg(0) Class458 arg0) {
		this.aClass458_88.method29344(arg0);
		this.method24240();
		if (this.aClass132_66 != null) {
			this.aClass132_66.method24254();
		}
	}

	@OriginalMember(owner = "client!yq", name = "bf", descriptor = "(Lclient!ov;)V")
	public final void method24256(@OriginalArg(0) Class471 arg0) {
		this.aClass458_88.aClass471_5.method29645(arg0);
		this.method24240();
		if (this.aClass132_66 != null) {
			this.aClass132_66.method24254();
		}
	}

	@OriginalMember(owner = "client!yq", name = "bl", descriptor = "(Lclient!ov;)V")
	public final void method24257(@OriginalArg(0) Class471 arg0) {
		this.aClass458_88.aClass471_5.method29645(arg0);
		this.method24240();
		if (this.aClass132_66 != null) {
			this.aClass132_66.method24254();
		}
	}

	@OriginalMember(owner = "client!yq", name = "bc", descriptor = "(FFF)V")
	public final void method24258(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aClass458_88.aClass472_61.method29718(arg0, arg1, arg2);
		this.method24240();
		if (this.aClass132_66 != null) {
			this.aClass132_66.method24254();
		}
	}

	@OriginalMember(owner = "client!yq", name = "bh", descriptor = "(Lclient!ox;)V")
	public final void method24259(@OriginalArg(0) Class472 arg0) {
		this.aClass458_88.aClass472_61.method29719(arg0);
		this.method24240();
		if (this.aClass132_66 != null) {
			this.aClass132_66.method24254();
		}
	}

	@OriginalMember(owner = "client!yq", name = "bx", descriptor = "(Lclient!ox;)V")
	public final void method24260(@OriginalArg(0) Class472 arg0) {
		this.aClass458_88.aClass472_61.method29719(arg0);
		this.method24240();
		if (this.aClass132_66 != null) {
			this.aClass132_66.method24254();
		}
	}

	@OriginalMember(owner = "client!yq", name = "ai", descriptor = "(Lclient!ov;)V")
	public final void method24261(@OriginalArg(0) Class471 arg0) {
		this.aClass458_88.aClass471_5.method29645(arg0);
		this.method24240();
		if (this.aClass132_66 != null) {
			this.aClass132_66.method24254();
		}
	}

	@OriginalMember(owner = "client!yq", name = "av", descriptor = "()Lclient!oe;")
	public final Class458 method24262() {
		if (this.aBoolean559) {
			this.aBoolean559 = false;
			this.aClass458_86.method29344(this.aClass458_88);
			if (this.aClass132_64 != null) {
				this.aClass458_86.method29356(this.aClass132_64.method24241());
			}
		}
		return this.aClass458_86;
	}

	@OriginalMember(owner = "client!yq", name = "bi", descriptor = "(FFF)V")
	public final void method24263(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aClass458_88.aClass472_61.method29718(arg0, arg1, arg2);
		this.method24240();
		if (this.aClass132_66 != null) {
			this.aClass132_66.method24254();
		}
	}

	@OriginalMember(owner = "client!yq", name = "bk", descriptor = "(Lclient!ov;)V")
	public final void method24264(@OriginalArg(0) Class471 arg0) {
		this.aClass458_88.aClass471_5.method29645(arg0);
		this.method24240();
		if (this.aClass132_66 != null) {
			this.aClass132_66.method24254();
		}
	}

	@OriginalMember(owner = "client!yq", name = "bq", descriptor = "()V")
	final void method24265() {
		this.aBoolean559 = true;
		this.aBoolean562 = true;
		this.aBoolean560 = true;
		this.aBoolean561 = true;
	}

	@OriginalMember(owner = "client!yq", name = "bm", descriptor = "()V")
	final void method24266() {
		this.method24240();
		if (this.aClass132_66 != null) {
			this.aClass132_66.method24254();
		}
		if (this.aClass132_65 != null) {
			this.aClass132_65.method24254();
		}
	}

	@OriginalMember(owner = "client!yq", name = "bb", descriptor = "()V")
	public final void method24267() {
		@Pc(6) Class132 local6;
		if (this.aClass132_64 != null) {
			local6 = this.aClass132_64.aClass132_66;
			if (local6 == this) {
				this.aClass132_64.aClass132_66 = this.aClass132_65;
			} else {
				while (local6.aClass132_65 != this) {
					local6 = local6.aClass132_65;
				}
				local6.aClass132_65 = this.aClass132_65;
			}
		}
		this.method24240();
		if (this.aClass132_66 != null) {
			this.aClass132_66.method24254();
			local6 = this.aClass132_66;
			while (true) {
				local6.aClass458_88.method29356(this.aClass458_88);
				local6.aClass132_64 = this.aClass132_64;
				if (local6.aClass132_65 == null) {
					local6.aClass132_65 = this.aClass132_64.aClass132_66;
					this.aClass132_64.aClass132_66 = this.aClass132_66;
					break;
				}
				local6 = local6.aClass132_65;
			}
		}
		this.aClass132_64 = null;
		this.aClass132_65 = null;
		this.aClass132_66 = null;
	}

	@OriginalMember(owner = "client!yq", name = "be", descriptor = "()V")
	public final void method24268() {
		@Pc(6) Class132 local6;
		if (this.aClass132_64 != null) {
			local6 = this.aClass132_64.aClass132_66;
			if (local6 == this) {
				this.aClass132_64.aClass132_66 = this.aClass132_65;
			} else {
				while (local6.aClass132_65 != this) {
					local6 = local6.aClass132_65;
				}
				local6.aClass132_65 = this.aClass132_65;
			}
		}
		this.method24240();
		if (this.aClass132_66 != null) {
			this.aClass132_66.method24254();
			local6 = this.aClass132_66;
			while (true) {
				local6.aClass458_88.method29356(this.aClass458_88);
				local6.aClass132_64 = this.aClass132_64;
				if (local6.aClass132_65 == null) {
					local6.aClass132_65 = this.aClass132_64.aClass132_66;
					this.aClass132_64.aClass132_66 = this.aClass132_66;
					break;
				}
				local6 = local6.aClass132_65;
			}
		}
		this.aClass132_64 = null;
		this.aClass132_65 = null;
		this.aClass132_66 = null;
	}
}
