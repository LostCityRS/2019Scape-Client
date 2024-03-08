package jaclib.nanotime;

public class QueryPerformanceCounter {

	public QueryPerformanceCounter() throws Throwable {
		throw new Error();
	}

	public static native boolean init();

	public static native long nanoTime();

	public static native void quit();
}
