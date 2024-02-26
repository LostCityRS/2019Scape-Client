package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yl")
public class Class120 {

	@OriginalMember(owner = "client!yl", name = "t", descriptor = "Lclient!oc;")
	Class457 aClass457_88 = new Class457();

	@OriginalMember(owner = "client!yl", name = "f", descriptor = "Lclient!oc;")
	Class457 aClass457_87 = new Class457();

	@OriginalMember(owner = "client!yl", name = "e", descriptor = "Z")
	boolean aBoolean673 = true;

	@OriginalMember(owner = "client!yl", name = "u", descriptor = "Lclient!oc;")
	Class457 aClass457_86 = new Class457();

	@OriginalMember(owner = "client!yl", name = "l", descriptor = "Z")
	boolean aBoolean671 = true;

	@OriginalMember(owner = "client!yl", name = "g", descriptor = "Lclient!ov;")
	Class471 aClass471_46;

	@OriginalMember(owner = "client!yl", name = "i", descriptor = "Z")
	boolean aBoolean670;

	@OriginalMember(owner = "client!yl", name = "m", descriptor = "Z")
	protected boolean aBoolean672;

	@OriginalMember(owner = "client!yl", name = "o", descriptor = "Lclient!yl;")
	Class120 aClass120_65;

	@OriginalMember(owner = "client!yl", name = "j", descriptor = "Lclient!yl;")
	Class120 aClass120_66;

	@OriginalMember(owner = "client!yl", name = "a", descriptor = "Lclient!yl;")
	Class120 aClass120_64;

	@OriginalMember(owner = "client!yl", name = "<init>", descriptor = "()V")
	Class120() {
		new Class487();
		new Class487();
		this.aClass471_46 = new Class471();
		this.aBoolean670 = true;
		this.aBoolean672 = true;
		this.aClass120_65 = null;
		this.aClass120_66 = null;
		this.aClass120_64 = null;
	}

	@OriginalMember(owner = "client!yl", name = "ar", descriptor = "(Lclient!oc;)V")
	final void method24522(@OriginalArg(0) Class457 arg0) {
		this.aClass457_88.method29363(arg0);
		this.method24533();
		if (this.aClass120_66 != null) {
			this.aClass120_66.method24534();
		}
	}

	@OriginalMember(owner = "client!yl", name = "be", descriptor = "()V")
	final void method24523() {
		this.method24533();
		if (this.aClass120_66 != null) {
			this.aClass120_66.method24534();
		}
		if (this.aClass120_64 != null) {
			this.aClass120_64.method24534();
		}
	}

	@OriginalMember(owner = "client!yl", name = "an", descriptor = "()Lclient!ov;")
	final Class471 method24524() {
		if (this.aBoolean670) {
			this.aBoolean670 = false;
			this.aClass471_46.method29762(this.method24552());
		}
		return this.aClass471_46;
	}

	@OriginalMember(owner = "client!yl", name = "aq", descriptor = "()Lclient!oc;")
	final Class457 method24525() {
		if (this.aBoolean671) {
			this.aBoolean671 = false;
			this.aClass457_86.method29363(this.method24552());
			this.aClass457_86.method29364();
		}
		return this.aClass457_87;
	}

	@OriginalMember(owner = "client!yl", name = "ao", descriptor = "()Lclient!ov;")
	final Class471 method24526() {
		if (this.aBoolean670) {
			this.aBoolean670 = false;
			this.aClass471_46.method29762(this.method24552());
		}
		return this.aClass471_46;
	}

	@OriginalMember(owner = "client!yl", name = "aj", descriptor = "(Lclient!oc;)V")
	final void method24527(@OriginalArg(0) Class457 arg0) {
		this.aClass457_88.method29363(arg0);
		this.method24533();
		if (this.aClass120_66 != null) {
			this.aClass120_66.method24534();
		}
	}

	@OriginalMember(owner = "client!yl", name = "ac", descriptor = "(Lclient!oq;)V")
	public final void method24528(@OriginalArg(0) Class466 arg0) {
		this.aClass457_88.aClass466_5.method29647(arg0);
		this.method24533();
		if (this.aClass120_66 != null) {
			this.aClass120_66.method24534();
		}
	}

	@OriginalMember(owner = "client!yl", name = "ae", descriptor = "()Lclient!ov;")
	final Class471 method24529() {
		if (this.aBoolean670) {
			this.aBoolean670 = false;
			this.aClass471_46.method29762(this.method24552());
		}
		return this.aClass471_46;
	}

	@OriginalMember(owner = "client!yl", name = "ab", descriptor = "(FFF)V")
	final void method24530(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method24531(this.aClass457_88.aClass463_61.aFloat297 + arg0, this.aClass457_88.aClass463_61.aFloat295 + arg1, this.aClass457_88.aClass463_61.aFloat296 + arg2);
	}

	@OriginalMember(owner = "client!yl", name = "al", descriptor = "(FFF)V")
	public final void method24531(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aClass457_88.aClass463_61.method29477(arg0, arg1, arg2);
		this.method24533();
		if (this.aClass120_66 != null) {
			this.aClass120_66.method24534();
		}
	}

	@OriginalMember(owner = "client!yl", name = "ah", descriptor = "(Lclient!oc;)V")
	final void method24532(@OriginalArg(0) Class457 arg0) {
		if (this.aClass120_65 == null) {
			this.method24527(arg0);
		} else {
			@Pc(7) Class457 local7 = new Class457(arg0);
			local7.method29369(this.aClass120_65.method24525());
			this.method24527(local7);
		}
	}

	@OriginalMember(owner = "client!yl", name = "af", descriptor = "()V")
	final void method24533() {
		this.aBoolean673 = true;
		this.aBoolean671 = true;
		this.aBoolean670 = true;
		this.aBoolean672 = true;
	}

	@OriginalMember(owner = "client!yl", name = "am", descriptor = "()V")
	final void method24534() {
		this.method24533();
		if (this.aClass120_66 != null) {
			this.aClass120_66.method24534();
		}
		if (this.aClass120_64 != null) {
			this.aClass120_64.method24534();
		}
	}

	@OriginalMember(owner = "client!yl", name = "ak", descriptor = "()V")
	public final void method24535() {
		@Pc(6) Class120 local6;
		if (this.aClass120_65 != null) {
			local6 = this.aClass120_65.aClass120_66;
			if (local6 == this) {
				this.aClass120_65.aClass120_66 = this.aClass120_64;
			} else {
				while (local6.aClass120_64 != this) {
					local6 = local6.aClass120_64;
				}
				local6.aClass120_64 = this.aClass120_64;
			}
		}
		this.method24533();
		if (this.aClass120_66 != null) {
			this.aClass120_66.method24534();
			local6 = this.aClass120_66;
			while (true) {
				local6.aClass457_88.method29369(this.aClass457_88);
				local6.aClass120_65 = this.aClass120_65;
				if (local6.aClass120_64 == null) {
					local6.aClass120_64 = this.aClass120_65.aClass120_66;
					this.aClass120_65.aClass120_66 = this.aClass120_66;
					break;
				}
				local6 = local6.aClass120_64;
			}
		}
		this.aClass120_65 = null;
		this.aClass120_64 = null;
		this.aClass120_66 = null;
	}

	@OriginalMember(owner = "client!yl", name = "at", descriptor = "()Lclient!oc;")
	public final Class457 method24536() {
		return this.aClass457_88;
	}

	@OriginalMember(owner = "client!yl", name = "ad", descriptor = "()Lclient!oc;")
	public final Class457 method24537() {
		if (this.aBoolean673) {
			this.aBoolean673 = false;
			this.aClass457_87.method29363(this.aClass457_88);
			if (this.aClass120_65 != null) {
				this.aClass457_87.method29369(this.aClass120_65.method24552());
			}
		}
		return this.aClass457_87;
	}

	@OriginalMember(owner = "client!yl", name = "av", descriptor = "()Lclient!oc;")
	final Class457 method24538() {
		if (this.aBoolean671) {
			this.aBoolean671 = false;
			this.aClass457_86.method29363(this.method24552());
			this.aClass457_86.method29364();
		}
		return this.aClass457_87;
	}

	@OriginalMember(owner = "client!yl", name = "bn", descriptor = "(Lclient!on;)V")
	public final void method24539(@OriginalArg(0) Class463 arg0) {
		this.aClass457_88.aClass463_61.method29478(arg0);
		this.method24533();
		if (this.aClass120_66 != null) {
			this.aClass120_66.method24534();
		}
	}

	@OriginalMember(owner = "client!yl", name = "ba", descriptor = "(FFF)V")
	final void method24540(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.method24531(this.aClass457_88.aClass463_61.aFloat297 + arg0, this.aClass457_88.aClass463_61.aFloat295 + arg1, this.aClass457_88.aClass463_61.aFloat296 + arg2);
	}

	@OriginalMember(owner = "client!yl", name = "ap", descriptor = "(Lclient!oc;)V")
	final void method24541(@OriginalArg(0) Class457 arg0) {
		this.aClass457_88.method29363(arg0);
		this.method24533();
		if (this.aClass120_66 != null) {
			this.aClass120_66.method24534();
		}
	}

	@OriginalMember(owner = "client!yl", name = "ag", descriptor = "(Lclient!on;)V")
	public final void method24542(@OriginalArg(0) Class463 arg0) {
		this.aClass457_88.aClass463_61.method29478(arg0);
		this.method24533();
		if (this.aClass120_66 != null) {
			this.aClass120_66.method24534();
		}
	}

	@OriginalMember(owner = "client!yl", name = "au", descriptor = "(Lclient!oc;)V")
	final void method24543(@OriginalArg(0) Class457 arg0) {
		this.aClass457_88.method29363(arg0);
		this.method24533();
		if (this.aClass120_66 != null) {
			this.aClass120_66.method24534();
		}
	}

	@OriginalMember(owner = "client!yl", name = "az", descriptor = "(Lclient!oc;)V")
	final void method24544(@OriginalArg(0) Class457 arg0) {
		this.aClass457_88.method29363(arg0);
		this.method24533();
		if (this.aClass120_66 != null) {
			this.aClass120_66.method24534();
		}
	}

	@OriginalMember(owner = "client!yl", name = "as", descriptor = "(Lclient!oq;)V")
	public final void method24545(@OriginalArg(0) Class466 arg0) {
		this.aClass457_88.aClass466_5.method29647(arg0);
		this.method24533();
		if (this.aClass120_66 != null) {
			this.aClass120_66.method24534();
		}
	}

	@OriginalMember(owner = "client!yl", name = "aw", descriptor = "(Lclient!oq;)V")
	public final void method24546(@OriginalArg(0) Class466 arg0) {
		this.aClass457_88.aClass466_5.method29647(arg0);
		this.method24533();
		if (this.aClass120_66 != null) {
			this.aClass120_66.method24534();
		}
	}

	@OriginalMember(owner = "client!yl", name = "bg", descriptor = "(Lclient!oq;)V")
	public final void method24547(@OriginalArg(0) Class466 arg0) {
		this.aClass457_88.aClass466_5.method29647(arg0);
		this.method24533();
		if (this.aClass120_66 != null) {
			this.aClass120_66.method24534();
		}
	}

	@OriginalMember(owner = "client!yl", name = "bl", descriptor = "(Lclient!on;)V")
	public final void method24548(@OriginalArg(0) Class463 arg0) {
		this.aClass457_88.aClass463_61.method29478(arg0);
		this.method24533();
		if (this.aClass120_66 != null) {
			this.aClass120_66.method24534();
		}
	}

	@OriginalMember(owner = "client!yl", name = "bj", descriptor = "(FFF)V")
	public final void method24549(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aClass457_88.aClass463_61.method29477(arg0, arg1, arg2);
		this.method24533();
		if (this.aClass120_66 != null) {
			this.aClass120_66.method24534();
		}
	}

	@OriginalMember(owner = "client!yl", name = "br", descriptor = "(Lclient!on;)V")
	public final void method24550(@OriginalArg(0) Class463 arg0) {
		this.aClass457_88.aClass463_61.method29478(arg0);
		this.method24533();
		if (this.aClass120_66 != null) {
			this.aClass120_66.method24534();
		}
	}

	@OriginalMember(owner = "client!yl", name = "bt", descriptor = "(FFF)V")
	public final void method24551(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aClass457_88.aClass463_61.method29477(arg0, arg1, arg2);
		this.method24533();
		if (this.aClass120_66 != null) {
			this.aClass120_66.method24534();
		}
	}

	@OriginalMember(owner = "client!yl", name = "ai", descriptor = "()Lclient!oc;")
	public final Class457 method24552() {
		if (this.aBoolean673) {
			this.aBoolean673 = false;
			this.aClass457_87.method29363(this.aClass457_88);
			if (this.aClass120_65 != null) {
				this.aClass457_87.method29369(this.aClass120_65.method24552());
			}
		}
		return this.aClass457_87;
	}

	@OriginalMember(owner = "client!yl", name = "bs", descriptor = "(FFF)V")
	public final void method24553(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aClass457_88.aClass463_61.method29477(arg0, arg1, arg2);
		this.method24533();
		if (this.aClass120_66 != null) {
			this.aClass120_66.method24534();
		}
	}

	@OriginalMember(owner = "client!yl", name = "ay", descriptor = "()Lclient!oc;")
	public final Class457 method24554() {
		return this.aClass457_88;
	}

	@OriginalMember(owner = "client!yl", name = "by", descriptor = "(FFF)V")
	public final void method24555(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aClass457_88.aClass463_61.method29477(arg0, arg1, arg2);
		this.method24533();
		if (this.aClass120_66 != null) {
			this.aClass120_66.method24534();
		}
	}

	@OriginalMember(owner = "client!yl", name = "bk", descriptor = "(Lclient!oc;)V")
	final void method24556(@OriginalArg(0) Class457 arg0) {
		if (this.aClass120_65 == null) {
			this.method24527(arg0);
		} else {
			@Pc(7) Class457 local7 = new Class457(arg0);
			local7.method29369(this.aClass120_65.method24525());
			this.method24527(local7);
		}
	}

	@OriginalMember(owner = "client!yl", name = "bz", descriptor = "()V")
	final void method24557() {
		this.aBoolean673 = true;
		this.aBoolean671 = true;
		this.aBoolean670 = true;
		this.aBoolean672 = true;
	}

	@OriginalMember(owner = "client!yl", name = "aa", descriptor = "()Lclient!ov;")
	final Class471 method24558() {
		if (this.aBoolean670) {
			this.aBoolean670 = false;
			this.aClass471_46.method29762(this.method24552());
		}
		return this.aClass471_46;
	}

	@OriginalMember(owner = "client!yl", name = "bh", descriptor = "()V")
	final void method24559() {
		this.method24533();
		if (this.aClass120_66 != null) {
			this.aClass120_66.method24534();
		}
		if (this.aClass120_64 != null) {
			this.aClass120_64.method24534();
		}
	}

	@OriginalMember(owner = "client!yl", name = "bv", descriptor = "()V")
	public final void method24560() {
		@Pc(6) Class120 local6;
		if (this.aClass120_65 != null) {
			local6 = this.aClass120_65.aClass120_66;
			if (local6 == this) {
				this.aClass120_65.aClass120_66 = this.aClass120_64;
			} else {
				while (local6.aClass120_64 != this) {
					local6 = local6.aClass120_64;
				}
				local6.aClass120_64 = this.aClass120_64;
			}
		}
		this.method24533();
		if (this.aClass120_66 != null) {
			this.aClass120_66.method24534();
			local6 = this.aClass120_66;
			while (true) {
				local6.aClass457_88.method29369(this.aClass457_88);
				local6.aClass120_65 = this.aClass120_65;
				if (local6.aClass120_64 == null) {
					local6.aClass120_64 = this.aClass120_65.aClass120_66;
					this.aClass120_65.aClass120_66 = this.aClass120_66;
					break;
				}
				local6 = local6.aClass120_64;
			}
		}
		this.aClass120_65 = null;
		this.aClass120_64 = null;
		this.aClass120_66 = null;
	}

	@OriginalMember(owner = "client!yl", name = "bp", descriptor = "()V")
	public final void method24561() {
		@Pc(6) Class120 local6;
		if (this.aClass120_65 != null) {
			local6 = this.aClass120_65.aClass120_66;
			if (local6 == this) {
				this.aClass120_65.aClass120_66 = this.aClass120_64;
			} else {
				while (local6.aClass120_64 != this) {
					local6 = local6.aClass120_64;
				}
				local6.aClass120_64 = this.aClass120_64;
			}
		}
		this.method24533();
		if (this.aClass120_66 != null) {
			this.aClass120_66.method24534();
			local6 = this.aClass120_66;
			while (true) {
				local6.aClass457_88.method29369(this.aClass457_88);
				local6.aClass120_65 = this.aClass120_65;
				if (local6.aClass120_64 == null) {
					local6.aClass120_64 = this.aClass120_65.aClass120_66;
					this.aClass120_65.aClass120_66 = this.aClass120_66;
					break;
				}
				local6 = local6.aClass120_64;
			}
		}
		this.aClass120_65 = null;
		this.aClass120_64 = null;
		this.aClass120_66 = null;
	}
}
