package com.jagex;

import jaclib.ping.IcmpService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alr")
public class IcmpService_Sub1 extends IcmpService {

	@OriginalMember(owner = "client!alr", name = "e", descriptor = "Lclient!alr;")
	static volatile IcmpService_Sub1 anIcmpService_Sub1_1;

	@OriginalMember(owner = "client!alr", name = "n", descriptor = "Ljava/util/List;")
	final List aList2 = new ArrayList();

	@OriginalMember(owner = "client!alr", name = "<init>", descriptor = "()V", line = 10)
	IcmpService_Sub1() {
	}

	@OriginalMember(owner = "client!alr", name = "p", descriptor = "(Lclient!yh;)V", line = 13)
	public static void method14886(@OriginalArg(0) Interface73 arg0) {
		if (anIcmpService_Sub1_1 == null) {
			throw new IllegalStateException("");
		}
		anIcmpService_Sub1_1.aList2.add(arg0);
	}

	@OriginalMember(owner = "client!alr", name = "u", descriptor = "(Lclient!yh;)V", line = 13)
	public static void method14887(@OriginalArg(0) Interface73 arg0) {
		if (anIcmpService_Sub1_1 == null) {
			throw new IllegalStateException("");
		}
		anIcmpService_Sub1_1.aList2.add(arg0);
	}

	@OriginalMember(owner = "client!alr", name = "z", descriptor = "(Lclient!yh;)V", line = 13)
	public static void method14888(@OriginalArg(0) Interface73 arg0) {
		if (anIcmpService_Sub1_1 == null) {
			throw new IllegalStateException("");
		}
		anIcmpService_Sub1_1.aList2.add(arg0);
	}

	@OriginalMember(owner = "client!alr", name = "d", descriptor = "(Lclient!yh;)V", line = 13)
	public static void method14889(@OriginalArg(0) Interface73 arg0) {
		if (anIcmpService_Sub1_1 == null) {
			throw new IllegalStateException("");
		}
		anIcmpService_Sub1_1.aList2.add(arg0);
	}

	@OriginalMember(owner = "client!alr", name = "s", descriptor = "()V", line = 41)
	public static void method14890() {
		if (anIcmpService_Sub1_1 == null) {
			return;
		}
		try {
			anIcmpService_Sub1_1.quit();
		} catch (@Pc(7) Throwable local7) {
		}
		anIcmpService_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!alr", name = "y", descriptor = "()V", line = 41)
	public static void method14891() {
		if (anIcmpService_Sub1_1 == null) {
			return;
		}
		try {
			anIcmpService_Sub1_1.quit();
		} catch (@Pc(7) Throwable local7) {
		}
		anIcmpService_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!alr", name = "notify", descriptor = "(I)V", line = 51)
	@Override
	protected void notify(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.aList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Interface73 local10 = (Interface73) local3.next();
			local10.method32927(arg0 == 0, 103685780);
		}
	}

	@OriginalMember(owner = "client!alr", name = "n", descriptor = "(I)V", line = 51)
	@Override
	protected void n(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.aList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Interface73 local10 = (Interface73) local3.next();
			local10.method32927(arg0 == 0, -616266069);
		}
	}

	@OriginalMember(owner = "client!alr", name = "e", descriptor = "(I)V", line = 51)
	@Override
	protected void e(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.aList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Interface73 local10 = (Interface73) local3.next();
			local10.method32927(arg0 == 0, -1012095198);
		}
	}

	@OriginalMember(owner = "client!alr", name = "m", descriptor = "(III)V", line = 61)
	@Override
	protected void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Iterator local3 = this.aList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Interface73 local10 = (Interface73) local3.next();
			local10.method32928(arg0, arg1, arg2, -575020472);
		}
	}

	@OriginalMember(owner = "client!alr", name = "notify", descriptor = "(III)V", line = 61)
	@Override
	protected void notify(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Iterator local3 = this.aList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Interface73 local10 = (Interface73) local3.next();
			local10.method32928(arg0, arg1, arg2, -575020472);
		}
	}

	@OriginalMember(owner = "client!alr", name = "k", descriptor = "(III)V", line = 61)
	@Override
	protected void k(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Iterator local3 = this.aList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Interface73 local10 = (Interface73) local3.next();
			local10.method32928(arg0, arg1, arg2, -575020472);
		}
	}
}
