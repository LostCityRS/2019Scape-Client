package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dx")
public class Class236 {

	@OriginalMember(owner = "client!dx", name = "q", descriptor = "I")
	static final int anInt3812 = 1;

	@OriginalMember(owner = "client!dx", name = "x", descriptor = "I")
	static final int anInt3813 = 2;

	@OriginalMember(owner = "client!dx", name = "b", descriptor = "I")
	static final int anInt3814 = 2;

	@OriginalMember(owner = "client!dx", name = "e", descriptor = "[S")
	static short[] aShortArray102 = new short[500];

	@OriginalMember(owner = "client!dx", name = "n", descriptor = "[S")
	static short[] aShortArray100 = new short[500];

	@OriginalMember(owner = "client!dx", name = "m", descriptor = "[S")
	static short[] aShortArray107 = new short[500];

	@OriginalMember(owner = "client!dx", name = "k", descriptor = "[S")
	static short[] aShortArray101 = new short[500];

	@OriginalMember(owner = "client!dx", name = "f", descriptor = "[S")
	static short[] aShortArray104 = new short[500];

	@OriginalMember(owner = "client!dx", name = "w", descriptor = "[B")
	static byte[] aByteArray77 = new byte[500];

	@OriginalMember(owner = "client!dx", name = "l", descriptor = "Lclient!ako;")
	Class93_Sub25 aClass93_Sub25_2 = null;

	@OriginalMember(owner = "client!dx", name = "u", descriptor = "I")
	int anInt3811 = 0;

	@OriginalMember(owner = "client!dx", name = "o", descriptor = "Z")
	boolean aBoolean658 = false;

	@OriginalMember(owner = "client!dx", name = "s", descriptor = "Z")
	boolean aBoolean659 = false;

	@OriginalMember(owner = "client!dx", name = "y", descriptor = "Z")
	boolean aBoolean660 = false;

	@OriginalMember(owner = "client!dx", name = "z", descriptor = "[S")
	short[] aShortArray105;

	@OriginalMember(owner = "client!dx", name = "p", descriptor = "[S")
	short[] aShortArray103;

	@OriginalMember(owner = "client!dx", name = "d", descriptor = "[S")
	short[] aShortArray99;

	@OriginalMember(owner = "client!dx", name = "c", descriptor = "[S")
	short[] aShortArray106;

	@OriginalMember(owner = "client!dx", name = "r", descriptor = "[S")
	short[] aShortArray108;

	@OriginalMember(owner = "client!dx", name = "v", descriptor = "[B")
	byte[] aByteArray78;

	@OriginalMember(owner = "client!dx", name = "<init>", descriptor = "([BLclient!ako;)V", line = 31)
	Class236(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class93_Sub25 arg1) {
		this.aClass93_Sub25_2 = arg1;
		try {
			@Pc(24) Class93_Sub41 local24 = new Class93_Sub41(arg0);
			@Pc(29) Class93_Sub41 local29 = new Class93_Sub41(arg0);
			@Pc(33) int local33 = local24.method22465((short) 16384);
			local24.anInt3070 += 1403713386;
			@Pc(43) int local43 = local24.method22472(-1434290800);
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt3070 = (local24.anInt3070 * 212851357 + local43) * -1445626955;
			@Pc(61) int local61;
			for (local61 = 0; local61 < local43; local61++) {
				@Pc(70) int local70 = this.aClass93_Sub25_2.anIntArray180[local61];
				if (local70 == 0) {
					local47 = local61;
				}
				@Pc(78) int local78 = local24.method22465((short) 16384);
				if (local78 > 0) {
					if (local70 == 0) {
						local49 = local61;
					}
					aShortArray102[local45] = (short) local61;
					@Pc(91) short local91 = 0;
					if (local70 == 3 || local70 == 10) {
						local91 = 128;
					}
					if (local33 >= 2 && local70 == 7) {
						if ((local78 & 0x1) == 0) {
							aShortArray100[local45] = local91;
						} else {
							aShortArray100[local45] = (short) local29.method22522(-358186793);
							local29.method22522(-358186793);
						}
						if ((local78 & 0x2) == 0) {
							aShortArray107[local45] = local91;
						} else {
							aShortArray107[local45] = (short) local29.method22522(-358186793);
							local29.method22522(-358186793);
						}
						if ((local78 & 0x4) == 0) {
							aShortArray101[local45] = local91;
						} else {
							aShortArray101[local45] = (short) local29.method22522(-358186793);
							local29.method22522(-358186793);
						}
					} else {
						if ((local78 & 0x1) == 0) {
							aShortArray100[local45] = local91;
						} else {
							aShortArray100[local45] = (short) local29.method22522(-358186793);
						}
						if ((local78 & 0x2) == 0) {
							aShortArray107[local45] = local91;
						} else {
							aShortArray107[local45] = (short) local29.method22522(-358186793);
						}
						if ((local78 & 0x4) == 0) {
							aShortArray101[local45] = local91;
						} else {
							aShortArray101[local45] = (short) local29.method22522(-358186793);
						}
					}
					aByteArray77[local45] = (byte) (local78 >>> 3 & 0x3);
					if (local70 == 2 || local70 == 9) {
						aShortArray100[local45] = (short) (aShortArray100[local45] << 2 & 0x3FFF);
						aShortArray107[local45] = (short) (aShortArray107[local45] << 2 & 0x3FFF);
						aShortArray101[local45] = (short) (aShortArray101[local45] << 2 & 0x3FFF);
					}
					aShortArray104[local45] = -1;
					if (local70 == 1 || local70 == 2 || local70 == 3) {
						if (local47 > local49) {
							aShortArray104[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local70 == 5) {
						this.aBoolean658 = true;
					} else if (local70 == 7) {
						this.aBoolean659 = true;
					} else if (local70 == 9 || local70 == 10 || local70 == 8) {
						this.aBoolean660 = true;
					}
					local45++;
				}
			}
			if (local29.anInt3070 * 212851357 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt3811 = local45;
			this.aShortArray105 = new short[local45];
			this.aShortArray103 = new short[local45];
			this.aShortArray99 = new short[local45];
			this.aShortArray106 = new short[local45];
			this.aShortArray108 = new short[local45];
			this.aByteArray78 = new byte[local45];
			for (local61 = 0; local61 < local45; local61++) {
				this.aShortArray105[local61] = aShortArray102[local61];
				this.aShortArray103[local61] = aShortArray100[local61];
				this.aShortArray99[local61] = aShortArray107[local61];
				this.aShortArray106[local61] = aShortArray101[local61];
				this.aShortArray108[local61] = aShortArray104[local61];
				this.aByteArray78[local61] = aByteArray77[local61];
			}
		} catch (@Pc(404) Exception local404) {
			this.anInt3811 = 0;
			this.aBoolean658 = false;
			this.aBoolean659 = false;
		}
	}
}
