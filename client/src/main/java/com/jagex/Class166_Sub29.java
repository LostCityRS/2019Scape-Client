package com.jagex;

import java.io.EOFException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ane")
public final class Class166_Sub29 extends Class166 {

	@OriginalMember(owner = "client!ane", name = "l", descriptor = "I")
	public static final int anInt2259 = 0;

	@OriginalMember(owner = "client!ane", name = "w", descriptor = "I")
	public static final int anInt2260 = 1;

	@OriginalMember(owner = "client!ane", name = "auv", descriptor = "(Lclient!yf;S)V")
	static void method16079(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub12_1.method15623((byte) 56);
	}

	@OriginalMember(owner = "client!ane", name = "bao", descriptor = "(Lclient!yf;I)V")
	static void method16080(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!ane", name = "f", descriptor = "(I)Lclient!h;")
	public static Class306 method16081(@OriginalArg(0) int arg0) {
		@Pc(1) Class38 local1 = null;
		boolean var13 = false;
		@Pc(50) Class306 var20;
		label114: {
			@Pc(65) Class306 local65;
			try {
				var13 = true;
				local1 = Class166_Sub18.method15755("3", client.aClass702_4.aString250, false, 199047110);
				@Pc(16) byte[] local16 = new byte[(int) local1.method735(2081698296)];
				@Pc(30) int local30;
				for (int var19 = 0; var19 < local16.length; var19 += local30) {
					local30 = local1.method726(local16, var19, local16.length - var19, (byte) 87);
					if (local30 == -1) {
						throw new EOFException();
					}
				}
				var20 = new Class306(new Class93_Sub41(local16));
				var13 = false;
				break label114;
			} catch (@Pc(61) Exception local61) {
				local65 = new Class306();
				var13 = false;
			} finally {
				if (var13) {
					try {
						if (local1 != null) {
							local1.method732(-2140128624);
						}
					} catch (@Pc(84) Exception local84) {
					}
				}
			}
			try {
				if (local1 != null) {
					local1.method732(-1731447876);
				}
			} catch (@Pc(73) Exception local73) {
			}
			return local65;
		}
		try {
			if (local1 != null) {
				local1.method732(540504422);
			}
		} catch (@Pc(58) Exception local58) {
		}
		return var20;
	}

	@OriginalMember(owner = "client!ane", name = "sp", descriptor = "(Lclient!yf;I)V")
	static void method16082(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(20) Class327 local20 = local11.method26971(Class694.aClass104_14, (byte) 24);
		if (local20 != null) {
			local13 = local20.anInt4181 * -814657375;
			local15 = local20.anInt4182 * -764381181;
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local13;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local15;
	}

	@OriginalMember(owner = "client!ane", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ane", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub29(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ane", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return 1;
	}

	@OriginalMember(owner = "client!ane", name = "s", descriptor = "(I)Z")
	public boolean method16069(@OriginalArg(0) int arg0) {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15436((byte) 30), 1894706074);
	}

	@OriginalMember(owner = "client!ane", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ane", name = "n", descriptor = "(II)I")
	@Override
	public int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15436((byte) 125), 54425272) ? 1 : 3;
	}

	@OriginalMember(owner = "client!ane", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return 1;
	}

	@OriginalMember(owner = "client!ane", name = "y", descriptor = "(I)I")
	public int method16070(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ane", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return 1;
	}

	@OriginalMember(owner = "client!ane", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return 1;
	}

	@OriginalMember(owner = "client!ane", name = "o", descriptor = "(I)V")
	public void method16071(@OriginalArg(0) int arg0) {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 1) {
			this.anInt2379 = this.method16554((byte) -60) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ane", name = "p", descriptor = "(I)I")
	@Override
	public int method16552(@OriginalArg(0) int arg0) {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15436((byte) 47), 895813589) ? 1 : 3;
	}

	@OriginalMember(owner = "client!ane", name = "z", descriptor = "(I)I")
	@Override
	public int method16561(@OriginalArg(0) int arg0) {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15436((byte) 37), -314662094) ? 1 : 3;
	}

	@OriginalMember(owner = "client!ane", name = "x", descriptor = "()V")
	public void method16072() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 1) {
			this.anInt2379 = this.method16554((byte) -6) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ane", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ane", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ane", name = "q", descriptor = "()V")
	public void method16073() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 1) {
			this.anInt2379 = this.method16554((byte) -102) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ane", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ane", name = "b", descriptor = "()V")
	public void method16074() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 1) {
			this.anInt2379 = this.method16554((byte) -67) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ane", name = "h", descriptor = "()Z")
	public boolean method16075() {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15436((byte) 66), -383574561);
	}

	@OriginalMember(owner = "client!ane", name = "a", descriptor = "()Z")
	public boolean method16076() {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15436((byte) 95), 216465914);
	}

	@OriginalMember(owner = "client!ane", name = "g", descriptor = "()I")
	public int method16077() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ane", name = "i", descriptor = "()I")
	public int method16078() {
		return this.anInt2379 * 960141055;
	}
}
