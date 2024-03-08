package jaclib.ping;

public abstract class IcmpService implements Runnable {

	public abstract void notify(int arg0);

	public abstract void notify(int arg0, int arg1, int arg2);

	public native void run();

	public native void quit();

	public static native boolean available();
}
