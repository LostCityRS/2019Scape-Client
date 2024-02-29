package jagex3;

import jaclib.ping.IcmpService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alr")
public final class NativeMouse extends IcmpService {

	@OriginalMember(owner = "client!alr", name = "e", descriptor = "Lclient!alr;")
	public static volatile NativeMouse instance;

	@OriginalMember(owner = "client!alr", name = "n", descriptor = "Ljava/util/List;")
	public final List listeners = new ArrayList();

	@OriginalMember(owner = "client!alr", name = "p", descriptor = "(Lclient!yh;)V")
	public static void method14898(@OriginalArg(0) Interface73 arg0) {
		if (instance == null) {
			throw new IllegalStateException("");
		}
		instance.listeners.add(arg0);
	}

	@OriginalMember(owner = "client!alr", name = "u", descriptor = "(Lclient!yh;)V")
	public static void method14899(@OriginalArg(0) Interface73 arg0) {
		if (instance == null) {
			throw new IllegalStateException("");
		}
		instance.listeners.add(arg0);
	}

	@OriginalMember(owner = "client!alr", name = "z", descriptor = "(Lclient!yh;)V")
	public static void method14900(@OriginalArg(0) Interface73 arg0) {
		if (instance == null) {
			throw new IllegalStateException("");
		}
		instance.listeners.add(arg0);
	}

	@OriginalMember(owner = "client!alr", name = "s", descriptor = "()V")
	public static void method14901() {
		if (instance == null) {
			return;
		}
		try {
			instance.quit();
		} catch (@Pc(7) Throwable local7) {
		}
		instance = null;
	}

	@OriginalMember(owner = "client!alr", name = "y", descriptor = "()V")
	public static void method14902() {
		if (instance == null) {
			return;
		}
		try {
			instance.quit();
		} catch (@Pc(7) Throwable local7) {
		}
		instance = null;
	}

	@OriginalMember(owner = "client!alr", name = "d", descriptor = "(Lclient!yh;)V")
	public static void method14903(@OriginalArg(0) Interface73 arg0) {
		if (instance == null) {
			throw new IllegalStateException("");
		}
		instance.listeners.add(arg0);
	}

	@OriginalMember(owner = "client!alr", name = "<init>", descriptor = "()V")
	NativeMouse() {
	}

	@OriginalMember(owner = "client!alr", name = "m", descriptor = "(III)V")
	@Override
	protected void method14896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Iterator local3 = this.listeners.iterator();
		while (local3.hasNext()) {
			@Pc(10) Interface73 local10 = (Interface73) local3.next();
			local10.method33109(arg0, arg1, arg2, -575020472);
		}
	}

	@OriginalMember(owner = "client!alr", name = "notify", descriptor = "(III)V")
	@Override
	protected void method14893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Iterator local3 = this.listeners.iterator();
		while (local3.hasNext()) {
			@Pc(10) Interface73 local10 = (Interface73) local3.next();
			local10.method33109(arg0, arg1, arg2, -575020472);
		}
	}

	@OriginalMember(owner = "client!alr", name = "notify", descriptor = "(I)V")
	@Override
	protected void method14892(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.listeners.iterator();
		while (local3.hasNext()) {
			@Pc(10) Interface73 local10 = (Interface73) local3.next();
			local10.method33108(arg0 == 0, 103685780);
		}
	}

	@OriginalMember(owner = "client!alr", name = "n", descriptor = "(I)V")
	@Override
	protected void method14895(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.listeners.iterator();
		while (local3.hasNext()) {
			@Pc(10) Interface73 local10 = (Interface73) local3.next();
			local10.method33108(arg0 == 0, -616266069);
		}
	}

	@OriginalMember(owner = "client!alr", name = "e", descriptor = "(I)V")
	@Override
	protected void method14894(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.listeners.iterator();
		while (local3.hasNext()) {
			@Pc(10) Interface73 local10 = (Interface73) local3.next();
			local10.method33108(arg0 == 0, -1012095198);
		}
	}

	@OriginalMember(owner = "client!alr", name = "k", descriptor = "(III)V")
	@Override
	protected void method14897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Iterator local3 = this.listeners.iterator();
		while (local3.hasNext()) {
			@Pc(10) Interface73 local10 = (Interface73) local3.next();
			local10.method33109(arg0, arg1, arg2, -575020472);
		}
	}
}
