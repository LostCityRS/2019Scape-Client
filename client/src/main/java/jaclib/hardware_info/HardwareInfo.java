package jaclib.hardware_info;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/hardware_info/HardwareInfo")
public class HardwareInfo {

	@OriginalMember(owner = "client!jaclib/hardware_info/HardwareInfo", name = "<init>", descriptor = "()V", line = 8)
	private HardwareInfo() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!jaclib/hardware_info/HardwareInfo", name = "getCPUInfo", descriptor = "()[I")
	public static final native int[] getCPUInfo();

	@OriginalMember(owner = "client!jaclib/hardware_info/HardwareInfo", name = "getRawCPUInfo", descriptor = "()[I")
	public static final native int[] getRawCPUInfo();

	@OriginalMember(owner = "client!jaclib/hardware_info/HardwareInfo", name = "getDXDiagSystemProps", descriptor = "()[Ljava/lang/String;")
	public static final native String[] getDXDiagSystemProps();

	@OriginalMember(owner = "client!jaclib/hardware_info/HardwareInfo", name = "getDXDiagDisplayDevicesProps", descriptor = "()[[Ljava/lang/String;")
	public static final native String[][] getDXDiagDisplayDevicesProps();

	@OriginalMember(owner = "client!jaclib/hardware_info/HardwareInfo", name = "getOpenGLProps", descriptor = "()[Ljava/lang/String;")
	public static final native String[] getOpenGLProps();
}
