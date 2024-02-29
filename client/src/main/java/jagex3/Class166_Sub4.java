package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amd")
public final class Class166_Sub4 extends Class166 {

	@OriginalMember(owner = "client!amd", name = "w", descriptor = "Z")
	boolean aBoolean367 = true;

	@OriginalMember(owner = "client!amd", name = "l", descriptor = "Z")
	public boolean aBoolean366 = false;

	@OriginalMember(owner = "client!amd", name = "k", descriptor = "(B)V")
	static void method15448(@OriginalArg(0) byte arg0) {
		Class168.aBoolean381 = false;
		Class635.method32622((short) 255);
	}

	@OriginalMember(owner = "client!amd", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amd", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub4(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amd", name = "t", descriptor = "()Z")
	boolean method15434() {
		return this.aBoolean367;
	}

	@OriginalMember(owner = "client!amd", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		this.aBoolean366 = true;
		return this.aClass93_Sub36_49.method14365(828224754).method140(-703678419) ? 3 : 1;
	}

	@OriginalMember(owner = "client!amd", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		this.aBoolean366 = true;
		return this.aClass93_Sub36_49.method14365(2118501330).method140(-703678419) ? 3 : 1;
	}

	@OriginalMember(owner = "client!amd", name = "x", descriptor = "(ZB)V")
	public void method15435(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		this.aBoolean367 = arg0;
	}

	@OriginalMember(owner = "client!amd", name = "n", descriptor = "(II)I")
	@Override
	public int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 3 && !Class376.method28227(672839876).method31796("jagdx", -2105855919) ? 3 : 2;
	}

	@OriginalMember(owner = "client!amd", name = "z", descriptor = "(I)I")
	@Override
	public int method16561(@OriginalArg(0) int arg0) {
		return arg0 == 3 && !Class376.method28227(672839876).method31796("jagdx", 97963460) ? 3 : 2;
	}

	@OriginalMember(owner = "client!amd", name = "y", descriptor = "(B)I")
	public int method15436(@OriginalArg(0) byte arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amd", name = "q", descriptor = "(I)Z")
	boolean method15437(@OriginalArg(0) int arg0) {
		return this.aBoolean367;
	}

	@OriginalMember(owner = "client!amd", name = "s", descriptor = "(B)Z")
	public boolean method15438(@OriginalArg(0) byte arg0) {
		return true;
	}

	@OriginalMember(owner = "client!amd", name = "i", descriptor = "()I")
	public int method15439() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amd", name = "o", descriptor = "(I)V")
	public void method15440(@OriginalArg(0) int arg0) {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 5 || this.anInt2379 * 960141055 == 2) {
			this.anInt2379 = this.method16554((byte) -113) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amd", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		this.aBoolean366 = true;
		return this.aClass93_Sub36_49.method14365(-1352885634).method140(-703678419) ? 3 : 1;
	}

	@OriginalMember(owner = "client!amd", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		this.aBoolean366 = true;
		return this.aClass93_Sub36_49.method14365(-746306849).method140(-703678419) ? 3 : 1;
	}

	@OriginalMember(owner = "client!amd", name = "a", descriptor = "()I")
	public int method15441() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amd", name = "p", descriptor = "(I)I")
	@Override
	public int method16552(@OriginalArg(0) int arg0) {
		return arg0 == 3 && !Class376.method28227(672839876).method31796("jagdx", -1839070977) ? 3 : 2;
	}

	@OriginalMember(owner = "client!amd", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.aBoolean366 = false;
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amd", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.aBoolean366 = false;
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amd", name = "b", descriptor = "()V")
	public void method15442() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 5 || this.anInt2379 * 960141055 == 2) {
			this.anInt2379 = this.method16554((byte) -40) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amd", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aBoolean366 = false;
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amd", name = "g", descriptor = "()I")
	public int method15443() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amd", name = "h", descriptor = "()Z")
	public boolean method15444() {
		return true;
	}

	@OriginalMember(owner = "client!amd", name = "j", descriptor = "()I")
	public int method15445() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amd", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		this.aBoolean366 = true;
		return this.aClass93_Sub36_49.method14365(834967183).method140(-703678419) ? 3 : 1;
	}

	@OriginalMember(owner = "client!amd", name = "ae", descriptor = "(Z)V")
	public void method15446(@OriginalArg(0) boolean arg0) {
		this.aBoolean367 = arg0;
	}

	@OriginalMember(owner = "client!amd", name = "ag", descriptor = "(Z)V")
	public void method15447(@OriginalArg(0) boolean arg0) {
		this.aBoolean367 = arg0;
	}
}
