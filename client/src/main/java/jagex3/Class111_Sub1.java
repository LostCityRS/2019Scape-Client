package jagex3;

import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afm")
public final class Class111_Sub1 extends Class111 {

	@OriginalMember(owner = "client!afm", name = "er", descriptor = "Ljava/net/Socket;")
	static Socket aSocket1;

	@OriginalMember(owner = "client!afm", name = "m", descriptor = "Lclient!py;")
	Class497 aClass497_20;

	@OriginalMember(owner = "client!afm", name = "<init>", descriptor = "(Lclient!py;)V")
	public Class111_Sub1(@OriginalArg(0) Class497 arg0) {
		this.aClass497_20 = arg0;
	}

	@OriginalMember(owner = "client!afm", name = "o", descriptor = "(Lclient!vk;IILclient!vc;FIIZ)Z")
	@Override
	public boolean method6770(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class609 arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(1) boolean local1 = true;
		if (Class616.aClass616_2 == arg0) {
			if (arg2 > -1 && this.aClass497_20.method30275(arg2, -1170599515)) {
				local1 = this.aClass497_20.method30235(arg2, -512225963);
			}
			return local1 & this.aClass497_20.method30235(arg1, -512225963);
		} else if (Class616.aClass616_1 == arg0) {
			return this.aClass497_20.method30235(arg1, -512225963);
		} else if (arg0 == Class616.aClass616_3) {
			return this.aClass497_20.method30235(arg2, -512225963);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!afm", name = "m", descriptor = "(Lclient!vk;IILclient!vc;FIIZI)Z")
	@Override
	public boolean method6765(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class609 arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		@Pc(1) boolean local1 = true;
		if (Class616.aClass616_2 == arg0) {
			if (arg2 > -1 && this.aClass497_20.method30275(arg2, -1170599515)) {
				local1 = this.aClass497_20.method30235(arg2, -512225963);
			}
			return local1 & this.aClass497_20.method30235(arg1, -512225963);
		} else if (Class616.aClass616_1 == arg0) {
			return this.aClass497_20.method30235(arg1, -512225963);
		} else if (arg0 == Class616.aClass616_3) {
			return this.aClass497_20.method30235(arg2, -512225963);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!afm", name = "r", descriptor = "(Lclient!vk;IILclient!vc;FIIZ)Z")
	@Override
	public boolean method6768(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class609 arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(1) boolean local1 = true;
		if (Class616.aClass616_2 == arg0) {
			if (arg2 > -1 && this.aClass497_20.method30275(arg2, -1170599515)) {
				local1 = this.aClass497_20.method30235(arg2, -512225963);
			}
			return local1 & this.aClass497_20.method30235(arg1, -512225963);
		} else if (Class616.aClass616_1 == arg0) {
			return this.aClass497_20.method30235(arg1, -512225963);
		} else if (arg0 == Class616.aClass616_3) {
			return this.aClass497_20.method30235(arg2, -512225963);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!afm", name = "s", descriptor = "(Lclient!vk;I)[B")
	@Override
	byte[] method6784(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1) {
		return this.aClass497_20.method30275(arg1, -1170599515) ? this.aClass497_20.method30240(arg1, (byte) 23) : null;
	}

	@OriginalMember(owner = "client!afm", name = "n", descriptor = "(Lclient!vk;IB)[B")
	@Override
	byte[] method6794(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		return this.aClass497_20.method30275(arg1, -1170599515) ? this.aClass497_20.method30240(arg1, (byte) 103) : null;
	}

	@OriginalMember(owner = "client!afm", name = "v", descriptor = "(Lclient!vk;IILclient!vc;FIIZ)Z")
	@Override
	public boolean method6769(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class609 arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(1) boolean local1 = true;
		if (Class616.aClass616_2 == arg0) {
			if (arg2 > -1 && this.aClass497_20.method30275(arg2, -1170599515)) {
				local1 = this.aClass497_20.method30235(arg2, -512225963);
			}
			return local1 & this.aClass497_20.method30235(arg1, -512225963);
		} else if (Class616.aClass616_1 == arg0) {
			return this.aClass497_20.method30235(arg1, -512225963);
		} else if (arg0 == Class616.aClass616_3) {
			return this.aClass497_20.method30235(arg2, -512225963);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!afm", name = "y", descriptor = "(Lclient!vk;I)[B")
	@Override
	byte[] method6785(@OriginalArg(0) Class616 arg0, @OriginalArg(1) int arg1) {
		return this.aClass497_20.method30275(arg1, -1170599515) ? this.aClass497_20.method30240(arg1, (byte) 94) : null;
	}
}
