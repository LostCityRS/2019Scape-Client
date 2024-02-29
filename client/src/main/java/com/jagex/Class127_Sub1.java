package com.jagex;

import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ahg")
public class Class127_Sub1 extends Class127 {

	@OriginalMember(owner = "client!ahg", name = "jg", descriptor = "I")
	static int anInt1036;

	@OriginalMember(owner = "client!ahg", name = "<init>", descriptor = "(Ljava/util/Map;)V", line = 104)
	Class127_Sub1(@OriginalArg(0) Map arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ahg", name = "v", descriptor = "(ILclient!ao;I)Lclient!ay;", line = 108)
	@Override
	public Interface13 method27703(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) int arg2) {
		return new Class379(arg0, this);
	}

	@OriginalMember(owner = "client!ahg", name = "q", descriptor = "(ILclient!ao;)Lclient!ay;", line = 108)
	@Override
	public Interface13 method27704(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class379(arg0, this);
	}

	@OriginalMember(owner = "client!ahg", name = "s", descriptor = "(ILclient!ao;)Lclient!ay;", line = 108)
	@Override
	public Interface13 method27700(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class379(arg0, this);
	}

	@OriginalMember(owner = "client!ahg", name = "y", descriptor = "(ILclient!ao;)Lclient!ay;", line = 108)
	@Override
	public Interface13 method27702(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class379(arg0, this);
	}

	@OriginalMember(owner = "client!ahg", name = "o", descriptor = "(B)Ljava/lang/Class;", line = 112)
	@Override
	public Class method27701(@OriginalArg(0) byte arg0) {
		return Class379.class;
	}

	@OriginalMember(owner = "client!ahg", name = "x", descriptor = "()Ljava/lang/Class;", line = 112)
	@Override
	public Class method27705() {
		return Class379.class;
	}

	@OriginalMember(owner = "client!ahg", name = "arj", descriptor = "(Lclient!yf;B)V", line = 12931)
	static final void method9265(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		client.aBoolean608 = true;
		Class277.method26359((byte) 0);
	}
}
