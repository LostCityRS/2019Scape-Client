package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amd")
public class Class166_Sub4 extends Class166 {

	@OriginalMember(owner = "client!amd", name = "w", descriptor = "Z")
	boolean aBoolean366 = true;

	@OriginalMember(owner = "client!amd", name = "l", descriptor = "Z")
	public boolean aBoolean365 = false;

	@OriginalMember(owner = "client!amd", name = "<init>", descriptor = "(Lclient!ali;)V", line = 13)
	public Class166_Sub4(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amd", name = "<init>", descriptor = "(ILclient!ali;)V", line = 17)
	public Class166_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amd", name = "o", descriptor = "(I)V", line = 21)
	public void method15422(@OriginalArg(0) int arg0) {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 5 || this.anInt2379 * 960141055 == 2) {
			this.anInt2379 = this.method16545((byte) -113) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amd", name = "b", descriptor = "()V", line = 21)
	public void method15423() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 5 || this.anInt2379 * 960141055 == 2) {
			this.anInt2379 = this.method16545((byte) -40) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amd", name = "f", descriptor = "()I", line = 25)
	@Override
	int method16544() {
		this.aBoolean365 = true;
		return this.aClass93_Sub36_49.method14378(828224754).method145(-703678419) ? 3 : 1;
	}

	@OriginalMember(owner = "client!amd", name = "e", descriptor = "(B)I", line = 25)
	@Override
	int method16545(@OriginalArg(0) byte arg0) {
		this.aBoolean365 = true;
		return this.aClass93_Sub36_49.method14378(2118501330).method145(-703678419) ? 3 : 1;
	}

	@OriginalMember(owner = "client!amd", name = "l", descriptor = "()I", line = 25)
	@Override
	int method16549() {
		this.aBoolean365 = true;
		return this.aClass93_Sub36_49.method14378(-1352885634).method145(-703678419) ? 3 : 1;
	}

	@OriginalMember(owner = "client!amd", name = "u", descriptor = "()I", line = 25)
	@Override
	int method16550() {
		this.aBoolean365 = true;
		return this.aClass93_Sub36_49.method14378(-746306849).method145(-703678419) ? 3 : 1;
	}

	@OriginalMember(owner = "client!amd", name = "w", descriptor = "()I", line = 25)
	@Override
	int method16552() {
		this.aBoolean365 = true;
		return this.aClass93_Sub36_49.method14378(834967183).method145(-703678419) ? 3 : 1;
	}

	@OriginalMember(owner = "client!amd", name = "s", descriptor = "(B)Z", line = 31)
	public boolean method15424(@OriginalArg(0) byte arg0) {
		return true;
	}

	@OriginalMember(owner = "client!amd", name = "h", descriptor = "()Z", line = 31)
	public boolean method15425() {
		return true;
	}

	@OriginalMember(owner = "client!amd", name = "n", descriptor = "(II)I", line = 35)
	@Override
	public int method16546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 3 && !Class376.method28043(672839876).method31615("jagdx", -2105855919) ? 3 : 2;
	}

	@OriginalMember(owner = "client!amd", name = "z", descriptor = "(I)I", line = 35)
	@Override
	public int method16551(@OriginalArg(0) int arg0) {
		return arg0 == 3 && !Class376.method28043(672839876).method31615("jagdx", 97963460) ? 3 : 2;
	}

	@OriginalMember(owner = "client!amd", name = "p", descriptor = "(I)I", line = 35)
	@Override
	public int method16543(@OriginalArg(0) int arg0) {
		return arg0 == 3 && !Class376.method28043(672839876).method31615("jagdx", -1839070977) ? 3 : 2;
	}

	@OriginalMember(owner = "client!amd", name = "d", descriptor = "(I)V", line = 40)
	@Override
	void method16548(@OriginalArg(0) int arg0) {
		this.aBoolean365 = false;
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amd", name = "c", descriptor = "(I)V", line = 40)
	@Override
	void method16553(@OriginalArg(0) int arg0) {
		this.aBoolean365 = false;
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amd", name = "k", descriptor = "(II)V", line = 40)
	@Override
	void method16547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aBoolean365 = false;
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amd", name = "y", descriptor = "(B)I", line = 45)
	public int method15426(@OriginalArg(0) byte arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amd", name = "i", descriptor = "()I", line = 45)
	public int method15427() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amd", name = "a", descriptor = "()I", line = 45)
	public int method15428() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amd", name = "g", descriptor = "()I", line = 45)
	public int method15429() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amd", name = "j", descriptor = "()I", line = 45)
	public int method15430() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amd", name = "t", descriptor = "()Z", line = 49)
	boolean method15431() {
		return this.aBoolean366;
	}

	@OriginalMember(owner = "client!amd", name = "q", descriptor = "(I)Z", line = 49)
	boolean method15432(@OriginalArg(0) int arg0) {
		return this.aBoolean366;
	}

	@OriginalMember(owner = "client!amd", name = "x", descriptor = "(ZB)V", line = 53)
	public void method15433(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		this.aBoolean366 = arg0;
	}

	@OriginalMember(owner = "client!amd", name = "ae", descriptor = "(Z)V", line = 53)
	public void method15434(@OriginalArg(0) boolean arg0) {
		this.aBoolean366 = arg0;
	}

	@OriginalMember(owner = "client!amd", name = "ag", descriptor = "(Z)V", line = 53)
	public void method15435(@OriginalArg(0) boolean arg0) {
		this.aBoolean366 = arg0;
	}

	@OriginalMember(owner = "client!amd", name = "k", descriptor = "(B)V", line = 88)
	static void method15436(@OriginalArg(0) byte arg0) {
		Class168.aBoolean380 = false;
		Class635.method32440((short) 255);
	}
}
