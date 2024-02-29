package jagex3;

import java.lang.reflect.Array;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acd")
public class Class55 implements Interface11 {

	@OriginalMember(owner = "client!acd", name = "f", descriptor = "Lclient!ay;")
	Interface13 anInterface13_3;

	@OriginalMember(owner = "client!acd", name = "e", descriptor = "Lclient!abs;")
	final Interface4 anInterface4_26;

	@OriginalMember(owner = "client!acd", name = "n", descriptor = "Lclient!xq;")
	final Class667 aClass667_32;

	@OriginalMember(owner = "client!acd", name = "m", descriptor = "Lclient!py;")
	final Class497 aClass497_86;

	@OriginalMember(owner = "client!acd", name = "k", descriptor = "I")
	protected int anInt2586;

	@OriginalMember(owner = "client!acd", name = "w", descriptor = "[Lclient!ay;")
	Interface13[] anInterface13Array3;

	@OriginalMember(owner = "client!acd", name = "x", descriptor = "(I)V")
	static void method18286(@OriginalArg(0) int arg0) {
		Class93_Sub6.aClass240_19.method25926((byte) -113);
	}

	@OriginalMember(owner = "client!acd", name = "pe", descriptor = "(Lclient!yf;B)V")
	static void method18287(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class183.method24585(local11, local14, arg0, -1854791486);
	}

	@OriginalMember(owner = "client!acd", name = "qq", descriptor = "(Lclient!yf;I)V")
	static void method18288(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 736733902);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class389.method28451(local16, local22, arg0, 1298505453);
	}

	@OriginalMember(owner = "client!acd", name = "<init>", descriptor = "(Lclient!zd;Lclient!zt;Lclient!xq;Lclient!py;Lclient!abs;Z)V")
	Class55(@OriginalArg(0) Class702 arg0, @OriginalArg(1) Class717 arg1, @OriginalArg(2) Class667 arg2, @OriginalArg(3) Class497 arg3, @OriginalArg(4) Interface4 arg4, @OriginalArg(5) boolean arg5) {
		this.anInterface4_26 = arg4;
		this.aClass667_32 = arg2;
		this.aClass497_86 = arg3;
		this.anInt2586 = Class546.method31154(this.aClass497_86, this.aClass667_32, (byte) -51) * 1103564513;
		this.anInterface13Array3 = (Interface13[]) Array.newInstance(this.anInterface4_26.method27794((byte) 29), this.anInt2586 * 1007858977);
		if (arg5) {
			for (@Pc(37) int local37 = 0; local37 < this.anInt2586 * 1007858977; local37++) {
				this.method18281(local37, 1252718226);
			}
		}
	}

	@OriginalMember(owner = "client!acd", name = "r", descriptor = "(I)V")
	final void method18280(@OriginalArg(0) int arg0) {
		if (this.anInterface13Array3[arg0] != null) {
			return;
		}
		try {
			this.anInterface13Array3[arg0] = this.anInterface4_26.method27796(arg0, this, -1637363625);
		} catch (@Pc(18) Exception local18) {
			local18.printStackTrace();
			return;
		}
		@Pc(23) Object local23 = null;
		@Pc(31) byte[] local31 = Class650.method32850(this.aClass497_86, this.aClass667_32, arg0, -1497248091);
		if (local31 != null) {
			this.anInterface13Array3[arg0].method36835(new Class93_Sub41(local31), (byte) -27);
		}
		this.anInterface13Array3[arg0].method36834(-806493696);
	}

	@OriginalMember(owner = "client!acd", name = "e", descriptor = "(II)Lclient!ay;")
	@Override
	public final Interface13 method18273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0) {
			if (this.anInterface13_3 == null) {
				this.anInterface13_3 = this.anInterface4_26.method27796(-1, this, -1535866624);
			}
			return this.anInterface13_3;
		} else {
			if (this.anInterface13Array3[arg0] == null) {
				this.method18281(arg0, 1252718226);
			}
			return this.anInterface13Array3[arg0];
		}
	}

	@OriginalMember(owner = "client!acd", name = "u", descriptor = "(II)V")
	final void method18281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInterface13Array3[arg0] != null) {
			return;
		}
		try {
			this.anInterface13Array3[arg0] = this.anInterface4_26.method27796(arg0, this, -1960403326);
		} catch (@Pc(18) Exception local18) {
			local18.printStackTrace();
			return;
		}
		@Pc(23) Object local23 = null;
		@Pc(31) byte[] local31 = Class650.method32850(this.aClass497_86, this.aClass667_32, arg0, -1497248091);
		if (local31 != null) {
			this.anInterface13Array3[arg0].method36835(new Class93_Sub41(local31), (byte) -101);
		}
		this.anInterface13Array3[arg0].method36834(-1447467576);
	}

	@OriginalMember(owner = "client!acd", name = "n", descriptor = "(I)I")
	@Override
	public int method18274(@OriginalArg(0) int arg0) {
		return this.anInterface13Array3.length;
	}

	@OriginalMember(owner = "client!acd", name = "m", descriptor = "(I)Lclient!ay;")
	@Override
	public final Interface13 method18276(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			if (this.anInterface13_3 == null) {
				this.anInterface13_3 = this.anInterface4_26.method27796(-1, this, -1203339946);
			}
			return this.anInterface13_3;
		} else {
			if (this.anInterface13Array3[arg0] == null) {
				this.method18281(arg0, 1252718226);
			}
			return this.anInterface13Array3[arg0];
		}
	}

	@OriginalMember(owner = "client!acd", name = "k", descriptor = "(I)Lclient!ay;")
	@Override
	public final Interface13 method18277(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			if (this.anInterface13_3 == null) {
				this.anInterface13_3 = this.anInterface4_26.method27796(-1, this, -2043031423);
			}
			return this.anInterface13_3;
		} else {
			if (this.anInterface13Array3[arg0] == null) {
				this.method18281(arg0, 1252718226);
			}
			return this.anInterface13Array3[arg0];
		}
	}

	@OriginalMember(owner = "client!acd", name = "f", descriptor = "()I")
	@Override
	public int method18275() {
		return this.anInterface13Array3.length;
	}

	@OriginalMember(owner = "client!acd", name = "w", descriptor = "()I")
	@Override
	public int method18278() {
		return this.anInterface13Array3.length;
	}

	@OriginalMember(owner = "client!acd", name = "l", descriptor = "()I")
	@Override
	public int method18279() {
		return this.anInterface13Array3.length;
	}

	@OriginalMember(owner = "client!acd", name = "p", descriptor = "()Ljava/util/Iterator;")
	public final Iterator method18282() {
		return new Class61(this);
	}

	@OriginalMember(owner = "client!acd", name = "d", descriptor = "()Ljava/util/Iterator;")
	public final Iterator method18283() {
		return new Class61(this);
	}

	@OriginalMember(owner = "client!acd", name = "c", descriptor = "()Ljava/util/Iterator;")
	public final Iterator method18284() {
		return new Class61(this);
	}

	@OriginalMember(owner = "client!acd", name = "z", descriptor = "(I)V")
	final void method18285(@OriginalArg(0) int arg0) {
		if (this.anInterface13Array3[arg0] != null) {
			return;
		}
		try {
			this.anInterface13Array3[arg0] = this.anInterface4_26.method27796(arg0, this, -1922767952);
		} catch (@Pc(18) Exception local18) {
			local18.printStackTrace();
			return;
		}
		@Pc(23) Object local23 = null;
		@Pc(31) byte[] local31 = Class650.method32850(this.aClass497_86, this.aClass667_32, arg0, -1497248091);
		if (local31 != null) {
			this.anInterface13Array3[arg0].method36835(new Class93_Sub41(local31), (byte) -9);
		}
		this.anInterface13Array3[arg0].method36834(-470747290);
	}

	@OriginalMember(owner = "client!acd", name = "iterator", descriptor = "()Ljava/util/Iterator;")
	@Override
	public final Iterator iterator() {
		return new Class61(this);
	}
}
