package jagex3;

import java.util.Iterator;
import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class644 implements Iterable {

	@OriginalMember(owner = "client!wq", name = "n", descriptor = "[Lclient!wd;")
	Class634[] aClass634Array1;

	@OriginalMember(owner = "client!wq", name = "e", descriptor = "[Lclient!wm;")
	Class640[] aClass640Array2;

	@OriginalMember(owner = "client!wq", name = "dv", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method32781(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg0.aBoolean689 = arg2.anIntArray521[(arg2.anInt6052 -= 1189701933) * -1497248091] == 1;
		Class354.method27789(arg0, -1174743804);
	}

	@OriginalMember(owner = "client!wq", name = "er", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V")
	static void method32782(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		arg0.anInt4039 = arg2.anIntArray521[(arg2.anInt6052 -= 1189701933) * -1497248091] * -2118115469;
		Class354.method27789(arg0, -1174743804);
	}

	@OriginalMember(owner = "client!wq", name = "aix", descriptor = "(Lclient!yf;I)V")
	static void method32783(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= 1189701933;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class481.method29935(local13, -478470976);
	}

	@OriginalMember(owner = "client!wq", name = "l", descriptor = "(II)V")
	public static void method32784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28187(23, (long) arg0);
		local4.method21877(2146924869);
	}

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lclient!py;)V")
	public Class644(@OriginalArg(0) Class497 arg0) {
		this.method32768(arg0.method30240(Class649.aClass649_8.anInt5956 * -51136173, (byte) 113), (byte) 43);
	}

	@OriginalMember(owner = "client!wq", name = "iterator", descriptor = "()Ljava/util/Iterator;")
	@Override
	public Iterator iterator() {
		return new Class638(this.aClass640Array2);
	}

	@OriginalMember(owner = "client!wq", name = "e", descriptor = "(S)V")
	void method32765(@OriginalArg(0) short arg0) {
		this.aClass640Array2 = null;
	}

	@OriginalMember(owner = "client!wq", name = "u", descriptor = "(Lclient!alw;)V")
	void method32766(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			@Pc(13) int local13;
			if (local3 == 1) {
				local13 = arg0.method22425((short) 16384);
				@Pc(15) int local15 = 0;
				@Pc(19) LinkedList local19 = new LinkedList();
				for (@Pc(21) int local21 = 0; local21 < local13; local21++) {
					@Pc(28) int local28 = arg0.method22425((short) 16384);
					@Pc(32) int local32 = arg0.method22427(-1434290800);
					@Pc(36) int local36 = arg0.method22425((short) 16384);
					@Pc(38) int local38 = 0;
					@Pc(40) Class634 local40 = Class634.aClass634_1;
					@Pc(42) byte local42 = 1;
					@Pc(51) boolean local51 = (local36 & 0x1) != 0;
					if ((local36 & 0x2) != 0) {
						local38 = arg0.method22425((short) 16384);
					}
					if ((local36 & 0x4) != 0) {
						local40 = this.aClass634Array1[arg0.method22425((short) 16384)];
					}
					if ((local36 & 0x8) != 0) {
						local42 = arg0.method22426(842249368);
					}
					@Pc(87) boolean local87 = arg0.method22425((short) 16384) == 1;
					local19.add(new Class640(local28, local32, local51, local87, local38, local40, local42));
					if (local28 > local15) {
						local15 = local28;
					}
				}
				this.aClass640Array2 = new Class640[local15 + 1];
				@Pc(116) Iterator local116 = local19.iterator();
				while (local116.hasNext()) {
					@Pc(123) Class640 local123 = (Class640) local116.next();
					this.aClass640Array2[local123.method32664(-2000434639)] = local123;
				}
			} else if (local3 == 2) {
				this.aClass634Array1 = new Class634[arg0.method22425((short) 16384)];
				for (local13 = arg0.method22425((short) 16384); local13 != 255; local13 = arg0.method22425((short) 16384)) {
					@Pc(153) int[] local153 = new int[arg0.method22427(-1434290800)];
					for (@Pc(155) int local155 = 0; local155 < local153.length; local155++) {
						local153[local155] = arg0.method22431(-118643075);
					}
					this.aClass634Array1[local13] = new Class634(local153);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "m", descriptor = "(Lclient!alw;I)V")
	void method32767(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			@Pc(13) int local13;
			if (local3 == 1) {
				local13 = arg0.method22425((short) 16384);
				@Pc(15) int local15 = 0;
				@Pc(19) LinkedList local19 = new LinkedList();
				for (@Pc(21) int local21 = 0; local21 < local13; local21++) {
					@Pc(28) int local28 = arg0.method22425((short) 16384);
					@Pc(32) int local32 = arg0.method22427(-1434290800);
					@Pc(36) int local36 = arg0.method22425((short) 16384);
					@Pc(38) int local38 = 0;
					@Pc(40) Class634 local40 = Class634.aClass634_1;
					@Pc(42) byte local42 = 1;
					@Pc(51) boolean local51 = (local36 & 0x1) != 0;
					if ((local36 & 0x2) != 0) {
						local38 = arg0.method22425((short) 16384);
					}
					if ((local36 & 0x4) != 0) {
						local40 = this.aClass634Array1[arg0.method22425((short) 16384)];
					}
					if ((local36 & 0x8) != 0) {
						local42 = arg0.method22426(1844620210);
					}
					@Pc(87) boolean local87 = arg0.method22425((short) 16384) == 1;
					local19.add(new Class640(local28, local32, local51, local87, local38, local40, local42));
					if (local28 > local15) {
						local15 = local28;
					}
				}
				this.aClass640Array2 = new Class640[local15 + 1];
				@Pc(116) Iterator local116 = local19.iterator();
				while (local116.hasNext()) {
					@Pc(123) Class640 local123 = (Class640) local116.next();
					this.aClass640Array2[local123.method32664(-1947180932)] = local123;
				}
			} else if (local3 == 2) {
				this.aClass634Array1 = new Class634[arg0.method22425((short) 16384)];
				for (local13 = arg0.method22425((short) 16384); local13 != 255; local13 = arg0.method22425((short) 16384)) {
					@Pc(153) int[] local153 = new int[arg0.method22427(-1434290800)];
					for (@Pc(155) int local155 = 0; local155 < local153.length; local155++) {
						local153[local155] = arg0.method22431(-118643075);
					}
					this.aClass634Array1[local13] = new Class634(local153);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "n", descriptor = "([BB)V")
	void method32768(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		this.method32765((short) 230);
		if (arg0 == null) {
			this.aClass640Array2 = new Class640[0];
		} else {
			this.method32767(new Class93_Sub41(arg0), -1388469658);
		}
	}

	@OriginalMember(owner = "client!wq", name = "f", descriptor = "(IB)Lclient!wm;")
	public Class640 method32769(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return this.aClass640Array2[arg0];
	}

	@OriginalMember(owner = "client!wq", name = "w", descriptor = "()V")
	void method32770() {
		this.aClass640Array2 = null;
	}

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "()Ljava/util/Iterator;")
	public Iterator method32771() {
		return new Class638(this.aClass640Array2);
	}

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "()Ljava/util/Iterator;")
	public Iterator method32772() {
		return new Class638(this.aClass640Array2);
	}

	@OriginalMember(owner = "client!wq", name = "p", descriptor = "()Ljava/util/Iterator;")
	public Iterator method32773() {
		return new Class638(this.aClass640Array2);
	}

	@OriginalMember(owner = "client!wq", name = "l", descriptor = "(Lclient!alw;)V")
	void method32774(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			@Pc(13) int local13;
			if (local3 == 1) {
				local13 = arg0.method22425((short) 16384);
				@Pc(15) int local15 = 0;
				@Pc(19) LinkedList local19 = new LinkedList();
				for (@Pc(21) int local21 = 0; local21 < local13; local21++) {
					@Pc(28) int local28 = arg0.method22425((short) 16384);
					@Pc(32) int local32 = arg0.method22427(-1434290800);
					@Pc(36) int local36 = arg0.method22425((short) 16384);
					@Pc(38) int local38 = 0;
					@Pc(40) Class634 local40 = Class634.aClass634_1;
					@Pc(42) byte local42 = 1;
					@Pc(51) boolean local51 = (local36 & 0x1) != 0;
					if ((local36 & 0x2) != 0) {
						local38 = arg0.method22425((short) 16384);
					}
					if ((local36 & 0x4) != 0) {
						local40 = this.aClass634Array1[arg0.method22425((short) 16384)];
					}
					if ((local36 & 0x8) != 0) {
						local42 = arg0.method22426(964176216);
					}
					@Pc(87) boolean local87 = arg0.method22425((short) 16384) == 1;
					local19.add(new Class640(local28, local32, local51, local87, local38, local40, local42));
					if (local28 > local15) {
						local15 = local28;
					}
				}
				this.aClass640Array2 = new Class640[local15 + 1];
				@Pc(116) Iterator local116 = local19.iterator();
				while (local116.hasNext()) {
					@Pc(123) Class640 local123 = (Class640) local116.next();
					this.aClass640Array2[local123.method32664(-2039638677)] = local123;
				}
			} else if (local3 == 2) {
				this.aClass634Array1 = new Class634[arg0.method22425((short) 16384)];
				for (local13 = arg0.method22425((short) 16384); local13 != 255; local13 = arg0.method22425((short) 16384)) {
					@Pc(153) int[] local153 = new int[arg0.method22427(-1434290800)];
					for (@Pc(155) int local155 = 0; local155 < local153.length; local155++) {
						local153[local155] = arg0.method22431(-118643075);
					}
					this.aClass634Array1[local13] = new Class634(local153);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "k", descriptor = "(I)I")
	public int method32775(@OriginalArg(0) int arg0) {
		return this.aClass640Array2.length;
	}

	@OriginalMember(owner = "client!wq", name = "z", descriptor = "(I)Lclient!wm;")
	public Class640 method32776(@OriginalArg(0) int arg0) {
		return this.aClass640Array2[arg0];
	}

	@OriginalMember(owner = "client!wq", name = "r", descriptor = "(I)Lclient!wm;")
	public Class640 method32777(@OriginalArg(0) int arg0) {
		return this.aClass640Array2[arg0];
	}

	@OriginalMember(owner = "client!wq", name = "v", descriptor = "(I)Lclient!wm;")
	public Class640 method32778(@OriginalArg(0) int arg0) {
		return this.aClass640Array2[arg0];
	}

	@OriginalMember(owner = "client!wq", name = "o", descriptor = "(I)Lclient!wm;")
	public Class640 method32779(@OriginalArg(0) int arg0) {
		return this.aClass640Array2[arg0];
	}

	@OriginalMember(owner = "client!wq", name = "s", descriptor = "(I)Lclient!wm;")
	public Class640 method32780(@OriginalArg(0) int arg0) {
		return this.aClass640Array2[arg0];
	}
}
