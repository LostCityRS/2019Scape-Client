package jaclib.hardware_info;

public class HardwareInfo {

	public HardwareInfo() throws Throwable {
		throw new Error();
	}

	public static final native int[] getCPUInfo();

	public static final native int[] getRawCPUInfo();

	public static final native String[] getDXDiagSystemProps();

	public static final native String[][] getDXDiagDisplayDevicesProps();

	public static final native String[] getOpenGLProps();
}
