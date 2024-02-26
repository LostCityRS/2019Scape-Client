package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dz")
public final class Class237 {

	@OriginalMember(owner = "client!dz", name = "d", descriptor = "I")
	static final int anInt3806 = 2;

	@OriginalMember(owner = "client!dz", name = "h", descriptor = "I")
	static final int anInt3808 = 1;

	@OriginalMember(owner = "client!dz", name = "z", descriptor = "I")
	static final int anInt3809 = 2;

	@OriginalMember(owner = "client!dz", name = "t", descriptor = "[S")
	static short[] aShortArray99 = new short[500];

	@OriginalMember(owner = "client!dz", name = "f", descriptor = "[S")
	static short[] aShortArray100 = new short[500];

	@OriginalMember(owner = "client!dz", name = "e", descriptor = "[S")
	static short[] aShortArray101 = new short[500];

	@OriginalMember(owner = "client!dz", name = "u", descriptor = "[S")
	static short[] aShortArray102 = new short[500];

	@OriginalMember(owner = "client!dz", name = "l", descriptor = "[S")
	static short[] aShortArray103 = new short[500];

	@OriginalMember(owner = "client!dz", name = "g", descriptor = "[B")
	static byte[] aByteArray77 = new byte[500];

	@OriginalMember(owner = "client!dz", name = "i", descriptor = "Lclient!akm;")
	Class80_Sub23 aClass80_Sub23_2 = null;

	@OriginalMember(owner = "client!dz", name = "m", descriptor = "I")
	int anInt3807 = 0;

	@OriginalMember(owner = "client!dz", name = "w", descriptor = "Z")
	boolean aBoolean766 = false;

	@OriginalMember(owner = "client!dz", name = "r", descriptor = "Z")
	boolean aBoolean767 = false;

	@OriginalMember(owner = "client!dz", name = "q", descriptor = "Z")
	boolean aBoolean765 = false;

	@OriginalMember(owner = "client!dz", name = "o", descriptor = "[S")
	short[] aShortArray104;

	@OriginalMember(owner = "client!dz", name = "j", descriptor = "[S")
	short[] aShortArray108;

	@OriginalMember(owner = "client!dz", name = "a", descriptor = "[S")
	short[] aShortArray107;

	@OriginalMember(owner = "client!dz", name = "s", descriptor = "[S")
	short[] aShortArray105;

	@OriginalMember(owner = "client!dz", name = "k", descriptor = "[S")
	short[] aShortArray106;

	@OriginalMember(owner = "client!dz", name = "x", descriptor = "[B")
	byte[] aByteArray78;

	@OriginalMember(owner = "client!dz", name = "<init>", descriptor = "([BLclient!akm;)V")
	Class237(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class80_Sub23 arg1) {
		this.aClass80_Sub23_2 = arg1;
		try {
			@Pc(24) Class80_Sub36 local24 = new Class80_Sub36(arg0);
			@Pc(29) Class80_Sub36 local29 = new Class80_Sub36(arg0);
			@Pc(33) int local33 = local24.method23362(-1434654531);
			local24.anInt3152 += 2068361142;
			@Pc(43) int local43 = local24.method23178((byte) -96);
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt3152 = (local24.anInt3152 * -1380987821 + local43) * 1034180571;
			@Pc(61) int local61;
			for (local61 = 0; local61 < local43; local61++) {
				@Pc(70) int local70 = this.aClass80_Sub23_2.anIntArray188[local61];
				if (local70 == 0) {
					local47 = local61;
				}
				@Pc(78) int local78 = local24.method23362(-624683873);
				if (local78 > 0) {
					if (local70 == 0) {
						local49 = local61;
					}
					aShortArray99[local45] = (short) local61;
					@Pc(91) short local91 = 0;
					if (local70 == 3 || local70 == 10) {
						local91 = 128;
					}
					if (local33 >= 2 && local70 == 7) {
						if ((local78 & 0x1) == 0) {
							aShortArray100[local45] = local91;
						} else {
							aShortArray100[local45] = (short) local29.method23194(35000);
							local29.method23194(35000);
						}
						if ((local78 & 0x2) == 0) {
							aShortArray101[local45] = local91;
						} else {
							aShortArray101[local45] = (short) local29.method23194(35000);
							local29.method23194(35000);
						}
						if ((local78 & 0x4) == 0) {
							aShortArray102[local45] = local91;
						} else {
							aShortArray102[local45] = (short) local29.method23194(35000);
							local29.method23194(35000);
						}
					} else {
						if ((local78 & 0x1) == 0) {
							aShortArray100[local45] = local91;
						} else {
							aShortArray100[local45] = (short) local29.method23194(35000);
						}
						if ((local78 & 0x2) == 0) {
							aShortArray101[local45] = local91;
						} else {
							aShortArray101[local45] = (short) local29.method23194(35000);
						}
						if ((local78 & 0x4) == 0) {
							aShortArray102[local45] = local91;
						} else {
							aShortArray102[local45] = (short) local29.method23194(35000);
						}
					}
					aByteArray77[local45] = (byte) (local78 >>> 3 & 0x3);
					if (local70 == 2 || local70 == 9) {
						aShortArray100[local45] = (short) (aShortArray100[local45] << 2 & 0x3FFF);
						aShortArray101[local45] = (short) (aShortArray101[local45] << 2 & 0x3FFF);
						aShortArray102[local45] = (short) (aShortArray102[local45] << 2 & 0x3FFF);
					}
					aShortArray103[local45] = -1;
					if (local70 == 1 || local70 == 2 || local70 == 3) {
						if (local47 > local49) {
							aShortArray103[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local70 == 5) {
						this.aBoolean766 = true;
					} else if (local70 == 7) {
						this.aBoolean767 = true;
					} else if (local70 == 9 || local70 == 10 || local70 == 8) {
						this.aBoolean765 = true;
					}
					local45++;
				}
			}
			if (local29.anInt3152 * -1380987821 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt3807 = local45;
			this.aShortArray104 = new short[local45];
			this.aShortArray108 = new short[local45];
			this.aShortArray107 = new short[local45];
			this.aShortArray105 = new short[local45];
			this.aShortArray106 = new short[local45];
			this.aByteArray78 = new byte[local45];
			for (local61 = 0; local61 < local45; local61++) {
				this.aShortArray104[local61] = aShortArray99[local61];
				this.aShortArray108[local61] = aShortArray100[local61];
				this.aShortArray107[local61] = aShortArray101[local61];
				this.aShortArray105[local61] = aShortArray102[local61];
				this.aShortArray106[local61] = aShortArray103[local61];
				this.aByteArray78[local61] = aByteArray77[local61];
			}
		} catch (@Pc(404) Exception local404) {
			this.anInt3807 = 0;
			this.aBoolean766 = false;
			this.aBoolean767 = false;
		}
	}
}
