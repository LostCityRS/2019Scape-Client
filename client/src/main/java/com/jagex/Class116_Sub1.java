package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agy")
public final class Class116_Sub1 extends Class116 {

	@OriginalMember(owner = "client!agy", name = "p", descriptor = "J")
	static long aLong33;

	@OriginalMember(owner = "client!agy", name = "sx", descriptor = "(Lclient!hx;Lclient!yp;I)V")
	static void method8761(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class690 arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class15 local5 = arg0.method27636(Class317.aClass464_1, client.anInterface49_1, -1021164669);
		@Pc(18) int local18 = arg1.anIntArray525[(arg1.anInt5778 -= 2036747717) * 1896589581];
		@Pc(31) int local31 = arg1.anIntArray525[(arg1.anInt5778 -= 2036747717) * 1896589581];
		@Pc(48) int local48 = local5.method382(arg0.aString183, arg0.anInt4103 * 1892149809, arg0.anInt4175 * -141942121, local31, local18, Class344.aClass99Array6, (byte) 109);
		arg1.anIntArray525[(arg1.anInt5778 += 2036747717) * 1896589581 - 1] = local48;
	}

	@OriginalMember(owner = "client!agy", name = "aqr", descriptor = "(Lclient!yp;I)V")
	static void method8762(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!agy", name = "<init>", descriptor = "(ZLclient!pf;Lclient!zv;Lclient!zy;)V")
	Class116_Sub1(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class480 arg1, @OriginalArg(2) Class719 arg2, @OriginalArg(3) Class722 arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!agy", name = "d", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method28278() {
		return Class335.class;
	}

	@OriginalMember(owner = "client!agy", name = "q", descriptor = "(I)Ljava/lang/Class;")
	@Override
	public Class method28275(@OriginalArg(0) int arg0) {
		return Class335.class;
	}

	@OriginalMember(owner = "client!agy", name = "h", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method28277() {
		return Class335.class;
	}

	@OriginalMember(owner = "client!agy", name = "p", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28280(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class335(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agy", name = "z", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28279(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class335(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agy", name = "v", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28281(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class335(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agy", name = "r", descriptor = "(ILclient!an;B)Lclient!ae;")
	@Override
	public Interface11 method28276(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1, @OriginalArg(2) byte arg2) {
		return new Class335(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agy", name = "y", descriptor = "(ILclient!an;)Lclient!ae;")
	@Override
	public Interface11 method28282(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		return new Class335(arg0, this, arg1);
	}
}
