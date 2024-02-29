package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aql")
public abstract class Class93_Sub33_Sub1 extends Class93_Sub33 {

	@OriginalMember(owner = "client!aql", name = "w", descriptor = "Lclient!ht;")
	Class323 aClass323_5;

	@OriginalMember(owner = "client!aql", name = "l", descriptor = "Ljava/lang/String;")
	String aString122;

	@OriginalMember(owner = "client!aql", name = "u", descriptor = "Ljava/lang/String;")
	String aString121;

	@OriginalMember(owner = "client!aql", name = "z", descriptor = "I")
	int anInt3227;

	@OriginalMember(owner = "client!aql", name = "p", descriptor = "Lclient!ht;")
	Class323 aClass323_6;

	@OriginalMember(owner = "client!aql", name = "<init>", descriptor = "(Lclient!hv;)V")
	Class93_Sub33_Sub1(@OriginalArg(0) Class325 arg0) {
		this.aClass323_5 = arg0.aClass323_133;
		this.aString122 = arg0.aString182;
		this.aString121 = arg0.aString183;
		this.anInt3227 = arg0.anInt4179 * -1666310801;
		this.aClass323_6 = arg0.aClass323_132;
	}

	@OriginalMember(owner = "client!aql", name = "r", descriptor = "()Lclient!ht;")
	public final Class323 method23662() {
		return this.aClass323_6;
	}

	@OriginalMember(owner = "client!aql", name = "e", descriptor = "(I)Z")
	public abstract boolean method23663(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aql", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public final String toString() {
		@Pc(13) String local13 = this.aClass323_5.toString() + " " + this.aString122;
		if (this.aString121 != null && !"".equals(this.aString121)) {
			local13 = local13 + " : " + this.aString121;
		}
		return local13;
	}

	@OriginalMember(owner = "client!aql", name = "h", descriptor = "(I)I")
	public abstract int method23664(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aql", name = "m", descriptor = "(I)Lclient!ht;")
	public final Class323 method23665(@OriginalArg(0) int arg0) {
		return this.aClass323_5;
	}

	@OriginalMember(owner = "client!aql", name = "k", descriptor = "(S)Lclient!ht;")
	public final Class323 method23666(@OriginalArg(0) short arg0) {
		return this.aClass323_6;
	}

	@OriginalMember(owner = "client!aql", name = "rj", descriptor = "()Ljava/lang/String;")
	public final String method23667() {
		@Pc(13) String local13 = this.aClass323_5.toString() + " " + this.aString122;
		if (this.aString121 != null && !"".equals(this.aString121)) {
			local13 = local13 + " : " + this.aString121;
		}
		return local13;
	}

	@OriginalMember(owner = "client!aql", name = "w", descriptor = "(I)I")
	public abstract int method23668(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aql", name = "l", descriptor = "(I)Z")
	public abstract boolean method23669(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aql", name = "u", descriptor = "(I)Z")
	public abstract boolean method23670(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aql", name = "v", descriptor = "()Lclient!ht;")
	public final Class323 method23671() {
		return this.aClass323_6;
	}

	@OriginalMember(owner = "client!aql", name = "z", descriptor = "(I)Z")
	public abstract boolean method23672(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aql", name = "c", descriptor = "()Lclient!ht;")
	public final Class323 method23673() {
		return this.aClass323_5;
	}

	@OriginalMember(owner = "client!aql", name = "f", descriptor = "(I)I")
	public final int method23674(@OriginalArg(0) int arg0) {
		if (Class323.aClass323_9 != this.aClass323_5) {
			throw new IllegalArgumentException_Sub1(this, this.aClass323_5.toString().toLowerCase());
		}
		return this.anInt3227 * -2132066709;
	}

	@OriginalMember(owner = "client!aql", name = "n", descriptor = "(I)Ljava/lang/String;")
	final String method23675(@OriginalArg(0) int arg0) {
		return this.aString122;
	}

	@OriginalMember(owner = "client!aql", name = "y", descriptor = "()I")
	public final int method23676() {
		if (Class323.aClass323_9 != this.aClass323_5) {
			throw new IllegalArgumentException_Sub1(this, this.aClass323_5.toString().toLowerCase());
		}
		return this.anInt3227 * -2132066709;
	}

	@OriginalMember(owner = "client!aql", name = "x", descriptor = "(I)I")
	public abstract int method23677(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aql", name = "d", descriptor = "()Ljava/lang/String;")
	final String method23678() {
		return this.aString122;
	}

	@OriginalMember(owner = "client!aql", name = "p", descriptor = "()Ljava/lang/String;")
	final String method23679() {
		return this.aString122;
	}
}
