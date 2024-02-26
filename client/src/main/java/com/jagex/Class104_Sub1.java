package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afd")
public final class Class104_Sub1 extends Class104 {

	@OriginalMember(owner = "client!afd", name = "w", descriptor = "Lclient!afm;")
	final Class102_Sub3 aClass102_Sub3_26;

	@OriginalMember(owner = "client!afd", name = "r", descriptor = "Lclient!apr;")
	final Class84_Sub1_Sub1 aClass84_Sub1_Sub1_4;

	@OriginalMember(owner = "client!afd", name = "h", descriptor = "Z")
	final boolean aBoolean107;

	@OriginalMember(owner = "client!afd", name = "q", descriptor = "Lclient!bv;")
	final Class197 aClass197_6;

	@OriginalMember(owner = "client!afd", name = "<init>", descriptor = "(Lclient!afm;Lclient!aan;Lclient!da;Z)V")
	Class104_Sub1(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass102_Sub3_26 = arg0;
		@Pc(19) int[] local19 = new int[this.aClass15_8.anInt49 * 592072939 * this.aClass15_8.anInt43 * 963433333];
		@Pc(23) Class109_Sub1 local23;
		@Pc(77) int local77;
		@Pc(85) int local85;
		@Pc(43) int local43;
		if (arg3) {
			local23 = null;
			@Pc(38) byte[] local38;
			if (arg2.method7116()) {
				@Pc(29) Class109_Sub2 local29 = (Class109_Sub2) arg2;
				local38 = local29.method7118() ? local29.aByteArray26 : local29.aByteArray25;
				if (!local29.method7118()) {
					for (local43 = 0; local43 < local38.length; local43++) {
						local38[local43] = (byte) (local38[local43] == 0 ? 0 : -1);
					}
				}
			} else {
				@Pc(64) Class109_Sub1 local64 = (Class109_Sub1) arg2;
				@Pc(68) int[] local68 = local64.method7117(false);
				local38 = new byte[local68.length];
				if (local64.method7118()) {
					for (local77 = 0; local77 < local38.length; local77++) {
						local38[local77] = (byte) (local19[local77] >> 24 & 0xFF);
					}
				} else {
					for (local77 = 0; local77 < local38.length; local77++) {
						local85 = local68[local77];
						@Pc(108) byte local108 = (byte) ((local85 >> 16 & 0xFF) * 3 + (local85 >> 8 & 0xFF) * 4 + (local85 & 0xFF) >> 3);
						local38[local77] = local108;
					}
				}
			}
			this.aClass84_Sub1_Sub1_4 = Class84_Sub1_Sub1.method18376(arg0, Class210.aClass210_17, Class236.aClass236_21, this.aClass15_8.anInt49 * 592072939, this.aClass15_8.anInt43 * 963433333, false, local38, Class210.aClass210_17);
			this.aBoolean107 = true;
		} else {
			@Pc(166) int[] local166;
			if (arg2.method7116()) {
				@Pc(163) Class109_Sub2 local163 = (Class109_Sub2) arg2;
				local166 = local163.anIntArray79;
				@Pc(169) byte[] local169 = local163.aByteArray26;
				@Pc(172) byte[] local172 = local163.aByteArray25;
				if (local169 == null) {
					for (local85 = 0; local85 < local172.length; local85++) {
						@Pc(210) byte local210;
						if ((local210 = local172[local85]) != 0) {
							local19[local85] = local166[local210 & 0xFF] | 0xFF000000;
						}
					}
				} else {
					for (local85 = 0; local85 < local169.length; local85++) {
						local19[local85] = local169[local85] << 24 | local166[local172[local85] & 0xFF];
					}
				}
			} else {
				local23 = (Class109_Sub1) arg2;
				local166 = local23.method7117(false);
				if (local23.method7118()) {
					for (local43 = 0; local43 < local19.length; local43++) {
						local19[local43] = local166[local43];
					}
				} else {
					for (local43 = 0; local43 < local19.length; local43++) {
						local77 = local166[local43] & 0xFFFFFF;
						local19[local43] = (local77 == 0 ? 0 : 255) << 24 | local77;
					}
				}
			}
			this.aClass84_Sub1_Sub1_4 = Class84_Sub1_Sub1.method18375(arg0, this.aClass15_8.anInt49 * 592072939, this.aClass15_8.anInt43 * 963433333, false, local19, 0, 0);
			this.aBoolean107 = false;
		}
		this.aClass84_Sub1_Sub1_4.method18340(this.aClass15_8.anInt50 * -2031443477 != 1);
		this.aClass197_6 = new Class197(arg0, 256);
		@Pc(325) float local325 = 1.0F / (float) (this.aClass15_8.anInt49 * 592072939);
		@Pc(334) float local334 = 1.0F / (float) (this.aClass15_8.anInt43 * 963433333);
		for (local43 = 0; local43 < 256; local43++) {
			local77 = arg1.method369(local43, (short) -29250);
			local85 = arg1.method371(local43, 303644933);
			@Pc(355) short[] local355 = this.aClass15_8.method384(local43, -1437921412);
			@Pc(362) float local362 = (float) local355[0] * local325;
			@Pc(369) float local369 = (float) local355[1] * local334;
			@Pc(380) float local380 = (float) (local355[0] + local355[2]) * local325;
			@Pc(391) float local391 = (float) (local355[1] + local355[3]) * local334;
			@Pc(397) int local397 = this.aClass15_8.method401(local43, -1671672002);
			this.aClass197_6.method24905(local43);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local362, 1.0F - local369);
			OpenGL.glVertex2i(0, local397);
			OpenGL.glTexCoord2f(local362, 1.0F - local391);
			OpenGL.glVertex2i(0, local397 + local85);
			OpenGL.glTexCoord2f(local380, 1.0F - local391);
			OpenGL.glVertex2i(local77, local397 + local85);
			OpenGL.glTexCoord2f(local380, 1.0F - local369);
			OpenGL.glVertex2i(local77, local397);
			OpenGL.glEnd();
			this.aClass197_6.method24913();
		}
	}

	@OriginalMember(owner = "client!afd", name = "n", descriptor = "(CIIIZLclient!cg;II)V")
	@Override
	void method7651(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class98_Sub1 local2 = (Class98_Sub1) arg5;
		@Pc(5) Class84_Sub1_Sub1 local5 = local2.aClass84_Sub1_Sub1_1;
		this.aClass102_Sub3_26.method6382();
		this.aClass102_Sub3_26.method6339(this.aClass84_Sub1_Sub1_4);
		if (this.aBoolean107 || arg4) {
			this.aClass102_Sub3_26.method6389(7681, 8448);
			this.aClass102_Sub3_26.method6390(0, 34168, 768);
		} else {
			this.aClass102_Sub3_26.method6389(7681, 7681);
		}
		this.aClass102_Sub3_26.method6386(1);
		this.aClass102_Sub3_26.method6339(local5);
		this.aClass102_Sub3_26.method6389(7681, 8448);
		this.aClass102_Sub3_26.method6390(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(69) float local69 = local5.aFloat164 / (float) local5.anInt2599;
		@Pc(76) float local76 = local5.aFloat163 / (float) local5.anInt2598;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local69, 0.0F, 0.0F, (float) -arg6 * local69 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local76, 0.0F, (float) -arg7 * local76 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass197_6.method24907(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass102_Sub3_26.method6390(0, 5890, 768);
		this.aClass102_Sub3_26.method6389(8448, 8448);
		this.aClass102_Sub3_26.method6339(null);
		this.aClass102_Sub3_26.method6386(0);
		if (this.aBoolean107 || arg4) {
			this.aClass102_Sub3_26.method6390(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!afd", name = "p", descriptor = "(CIIIZ)V")
	@Override
	void method7648(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass102_Sub3_26.method6382();
		this.aClass102_Sub3_26.method6339(this.aClass84_Sub1_Sub1_4);
		if (this.aBoolean107 || arg4) {
			this.aClass102_Sub3_26.method6389(7681, 8448);
			this.aClass102_Sub3_26.method6390(0, 34168, 768);
		} else {
			this.aClass102_Sub3_26.method6389(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass197_6.method24907(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean107 || arg4) {
			this.aClass102_Sub3_26.method6390(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!afd", name = "q", descriptor = "(CIIIZLclient!cg;II)V")
	@Override
	void method7644(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class98_Sub1 local2 = (Class98_Sub1) arg5;
		@Pc(5) Class84_Sub1_Sub1 local5 = local2.aClass84_Sub1_Sub1_1;
		this.aClass102_Sub3_26.method6382();
		this.aClass102_Sub3_26.method6339(this.aClass84_Sub1_Sub1_4);
		if (this.aBoolean107 || arg4) {
			this.aClass102_Sub3_26.method6389(7681, 8448);
			this.aClass102_Sub3_26.method6390(0, 34168, 768);
		} else {
			this.aClass102_Sub3_26.method6389(7681, 7681);
		}
		this.aClass102_Sub3_26.method6386(1);
		this.aClass102_Sub3_26.method6339(local5);
		this.aClass102_Sub3_26.method6389(7681, 8448);
		this.aClass102_Sub3_26.method6390(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(69) float local69 = local5.aFloat164 / (float) local5.anInt2599;
		@Pc(76) float local76 = local5.aFloat163 / (float) local5.anInt2598;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local69, 0.0F, 0.0F, (float) -arg6 * local69 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local76, 0.0F, (float) -arg7 * local76 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass197_6.method24907(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass102_Sub3_26.method6390(0, 5890, 768);
		this.aClass102_Sub3_26.method6389(8448, 8448);
		this.aClass102_Sub3_26.method6339(null);
		this.aClass102_Sub3_26.method6386(0);
		if (this.aBoolean107 || arg4) {
			this.aClass102_Sub3_26.method6390(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!afd", name = "h", descriptor = "(CIIIZ)V")
	@Override
	void method7645(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass102_Sub3_26.method6382();
		this.aClass102_Sub3_26.method6339(this.aClass84_Sub1_Sub1_4);
		if (this.aBoolean107 || arg4) {
			this.aClass102_Sub3_26.method6389(7681, 8448);
			this.aClass102_Sub3_26.method6390(0, 34168, 768);
		} else {
			this.aClass102_Sub3_26.method6389(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass197_6.method24907(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean107 || arg4) {
			this.aClass102_Sub3_26.method6390(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!afd", name = "v", descriptor = "(CIIIZLclient!cg;II)V")
	@Override
	void method7649(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class98_Sub1 local2 = (Class98_Sub1) arg5;
		@Pc(5) Class84_Sub1_Sub1 local5 = local2.aClass84_Sub1_Sub1_1;
		this.aClass102_Sub3_26.method6382();
		this.aClass102_Sub3_26.method6339(this.aClass84_Sub1_Sub1_4);
		if (this.aBoolean107 || arg4) {
			this.aClass102_Sub3_26.method6389(7681, 8448);
			this.aClass102_Sub3_26.method6390(0, 34168, 768);
		} else {
			this.aClass102_Sub3_26.method6389(7681, 7681);
		}
		this.aClass102_Sub3_26.method6386(1);
		this.aClass102_Sub3_26.method6339(local5);
		this.aClass102_Sub3_26.method6389(7681, 8448);
		this.aClass102_Sub3_26.method6390(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(69) float local69 = local5.aFloat164 / (float) local5.anInt2599;
		@Pc(76) float local76 = local5.aFloat163 / (float) local5.anInt2598;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local69, 0.0F, 0.0F, (float) -arg6 * local69 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local76, 0.0F, (float) -arg7 * local76 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass197_6.method24907(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass102_Sub3_26.method6390(0, 5890, 768);
		this.aClass102_Sub3_26.method6389(8448, 8448);
		this.aClass102_Sub3_26.method6339(null);
		this.aClass102_Sub3_26.method6386(0);
		if (this.aBoolean107 || arg4) {
			this.aClass102_Sub3_26.method6390(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!afd", name = "z", descriptor = "(CIIIZ)V")
	@Override
	void method7647(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass102_Sub3_26.method6382();
		this.aClass102_Sub3_26.method6339(this.aClass84_Sub1_Sub1_4);
		if (this.aBoolean107 || arg4) {
			this.aClass102_Sub3_26.method6389(7681, 8448);
			this.aClass102_Sub3_26.method6390(0, 34168, 768);
		} else {
			this.aClass102_Sub3_26.method6389(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass197_6.method24907(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean107 || arg4) {
			this.aClass102_Sub3_26.method6390(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!afd", name = "y", descriptor = "(CIIIZLclient!cg;II)V")
	@Override
	void method7650(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class98_Sub1 local2 = (Class98_Sub1) arg5;
		@Pc(5) Class84_Sub1_Sub1 local5 = local2.aClass84_Sub1_Sub1_1;
		this.aClass102_Sub3_26.method6382();
		this.aClass102_Sub3_26.method6339(this.aClass84_Sub1_Sub1_4);
		if (this.aBoolean107 || arg4) {
			this.aClass102_Sub3_26.method6389(7681, 8448);
			this.aClass102_Sub3_26.method6390(0, 34168, 768);
		} else {
			this.aClass102_Sub3_26.method6389(7681, 7681);
		}
		this.aClass102_Sub3_26.method6386(1);
		this.aClass102_Sub3_26.method6339(local5);
		this.aClass102_Sub3_26.method6389(7681, 8448);
		this.aClass102_Sub3_26.method6390(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(69) float local69 = local5.aFloat164 / (float) local5.anInt2599;
		@Pc(76) float local76 = local5.aFloat163 / (float) local5.anInt2598;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local69, 0.0F, 0.0F, (float) -arg6 * local69 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local76, 0.0F, (float) -arg7 * local76 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass197_6.method24907(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass102_Sub3_26.method6390(0, 5890, 768);
		this.aClass102_Sub3_26.method6389(8448, 8448);
		this.aClass102_Sub3_26.method6339(null);
		this.aClass102_Sub3_26.method6386(0);
		if (this.aBoolean107 || arg4) {
			this.aClass102_Sub3_26.method6390(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!afd", name = "r", descriptor = "(CIIIZ)V")
	@Override
	void method7643(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass102_Sub3_26.method6382();
		this.aClass102_Sub3_26.method6339(this.aClass84_Sub1_Sub1_4);
		if (this.aBoolean107 || arg4) {
			this.aClass102_Sub3_26.method6389(7681, 8448);
			this.aClass102_Sub3_26.method6390(0, 34168, 768);
		} else {
			this.aClass102_Sub3_26.method6389(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass197_6.method24907(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean107 || arg4) {
			this.aClass102_Sub3_26.method6390(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!afd", name = "d", descriptor = "(CIIIZ)V")
	@Override
	void method7646(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass102_Sub3_26.method6382();
		this.aClass102_Sub3_26.method6339(this.aClass84_Sub1_Sub1_4);
		if (this.aBoolean107 || arg4) {
			this.aClass102_Sub3_26.method6389(7681, 8448);
			this.aClass102_Sub3_26.method6390(0, 34168, 768);
		} else {
			this.aClass102_Sub3_26.method6389(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass197_6.method24907(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean107 || arg4) {
			this.aClass102_Sub3_26.method6390(0, 5890, 768);
		}
	}
}
