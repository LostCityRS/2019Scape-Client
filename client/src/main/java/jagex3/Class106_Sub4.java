package jagex3;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afs")
public final class Class106_Sub4 extends Class106 {

	@OriginalMember(owner = "client!afs", name = "o", descriptor = "Lclient!afa;")
	final Class104_Sub1 aClass104_Sub1_27;

	@OriginalMember(owner = "client!afs", name = "s", descriptor = "Lclient!apr;")
	final Class88_Sub2_Sub1 aClass88_Sub2_Sub1_4;

	@OriginalMember(owner = "client!afs", name = "q", descriptor = "Z")
	final boolean aBoolean170;

	@OriginalMember(owner = "client!afs", name = "y", descriptor = "Lclient!be;")
	final Class182 aClass182_6;

	@OriginalMember(owner = "client!afs", name = "<init>", descriptor = "(Lclient!afa;Lclient!aac;Lclient!de;Z)V")
	Class106_Sub4(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) Class105 arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass104_Sub1_27 = arg0;
		@Pc(19) int[] local19 = new int[this.aClass5_10.anInt12 * -2141347013 * this.aClass5_10.anInt13 * -345881099];
		@Pc(23) Class105_Sub1 local23;
		@Pc(77) int local77;
		@Pc(85) int local85;
		@Pc(43) int local43;
		if (arg3) {
			local23 = null;
			@Pc(38) byte[] local38;
			if (arg2.method7154()) {
				@Pc(29) Class105_Sub2 local29 = (Class105_Sub2) arg2;
				local38 = local29.method7211() ? local29.aByteArray26 : local29.aByteArray25;
				if (!local29.method7211()) {
					for (local43 = 0; local43 < local38.length; local43++) {
						local38[local43] = (byte) (local38[local43] == 0 ? 0 : -1);
					}
				}
			} else {
				@Pc(64) Class105_Sub1 local64 = (Class105_Sub1) arg2;
				@Pc(68) int[] local68 = local64.method7171(false);
				local38 = new byte[local68.length];
				if (local64.method7211()) {
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
			this.aClass88_Sub2_Sub1_4 = Class88_Sub2_Sub1.method18114(arg0, Class206.aClass206_19, Class226.aClass226_22, this.aClass5_10.anInt12 * -2141347013, this.aClass5_10.anInt13 * -345881099, false, local38, Class206.aClass206_19);
			this.aBoolean170 = true;
		} else {
			@Pc(166) int[] local166;
			if (arg2.method7154()) {
				@Pc(163) Class105_Sub2 local163 = (Class105_Sub2) arg2;
				local166 = local163.anIntArray82;
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
				local23 = (Class105_Sub1) arg2;
				local166 = local23.method7171(false);
				if (local23.method7211()) {
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
			this.aClass88_Sub2_Sub1_4 = Class88_Sub2_Sub1.method18113(arg0, this.aClass5_10.anInt12 * -2141347013, this.aClass5_10.anInt13 * -345881099, false, local19, 0, 0);
			this.aBoolean170 = false;
		}
		this.aClass88_Sub2_Sub1_4.method18053(this.aClass5_10.anInt11 * 286794121 != 1);
		this.aClass182_6 = new Class182(arg0, 256);
		@Pc(325) float local325 = 1.0F / (float) (this.aClass5_10.anInt12 * -2141347013);
		@Pc(334) float local334 = 1.0F / (float) (this.aClass5_10.anInt13 * -345881099);
		for (local43 = 0; local43 < 256; local43++) {
			local77 = arg1.method62(local43, (byte) -23);
			local85 = arg1.method33(local43, 1415476369);
			@Pc(355) short[] local355 = this.aClass5_10.method65(local43, 306054503);
			@Pc(362) float local362 = (float) local355[0] * local325;
			@Pc(369) float local369 = (float) local355[1] * local334;
			@Pc(380) float local380 = (float) (local355[0] + local355[2]) * local325;
			@Pc(391) float local391 = (float) (local355[1] + local355[3]) * local334;
			@Pc(397) int local397 = this.aClass5_10.method64(local43, (byte) -84);
			this.aClass182_6.method24571(local43);
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
			this.aClass182_6.method24569();
		}
	}

	@OriginalMember(owner = "client!afs", name = "s", descriptor = "(CIIIZ)V")
	@Override
	void method7533(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass104_Sub1_27.method3758();
		this.aClass104_Sub1_27.method3804(this.aClass88_Sub2_Sub1_4);
		if (this.aBoolean170 || arg4) {
			this.aClass104_Sub1_27.method3837(7681, 8448);
			this.aClass104_Sub1_27.method3807(0, 34168, 768);
		} else {
			this.aClass104_Sub1_27.method3837(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass182_6.method24572(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean170 || arg4) {
			this.aClass104_Sub1_27.method3807(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!afs", name = "b", descriptor = "(CIIIZ)V")
	@Override
	void method7549(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass104_Sub1_27.method3758();
		this.aClass104_Sub1_27.method3804(this.aClass88_Sub2_Sub1_4);
		if (this.aBoolean170 || arg4) {
			this.aClass104_Sub1_27.method3837(7681, 8448);
			this.aClass104_Sub1_27.method3807(0, 34168, 768);
		} else {
			this.aClass104_Sub1_27.method3837(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass182_6.method24572(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean170 || arg4) {
			this.aClass104_Sub1_27.method3807(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!afs", name = "q", descriptor = "(CIIIZ)V")
	@Override
	void method7541(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass104_Sub1_27.method3758();
		this.aClass104_Sub1_27.method3804(this.aClass88_Sub2_Sub1_4);
		if (this.aBoolean170 || arg4) {
			this.aClass104_Sub1_27.method3837(7681, 8448);
			this.aClass104_Sub1_27.method3807(0, 34168, 768);
		} else {
			this.aClass104_Sub1_27.method3837(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass182_6.method24572(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean170 || arg4) {
			this.aClass104_Sub1_27.method3807(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!afs", name = "y", descriptor = "(CIIIZLclient!ch;II)V")
	@Override
	void method7540(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class96_Sub1 local2 = (Class96_Sub1) arg5;
		@Pc(5) Class88_Sub2_Sub1 local5 = local2.aClass88_Sub2_Sub1_1;
		this.aClass104_Sub1_27.method3758();
		this.aClass104_Sub1_27.method3804(this.aClass88_Sub2_Sub1_4);
		if (this.aBoolean170 || arg4) {
			this.aClass104_Sub1_27.method3837(7681, 8448);
			this.aClass104_Sub1_27.method3807(0, 34168, 768);
		} else {
			this.aClass104_Sub1_27.method3837(7681, 7681);
		}
		this.aClass104_Sub1_27.method3803(1);
		this.aClass104_Sub1_27.method3804(local5);
		this.aClass104_Sub1_27.method3837(7681, 8448);
		this.aClass104_Sub1_27.method3807(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(69) float local69 = local5.aFloat164 / (float) local5.anInt2547;
		@Pc(76) float local76 = local5.aFloat163 / (float) local5.anInt2548;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local69, 0.0F, 0.0F, (float) -arg6 * local69 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local76, 0.0F, (float) -arg7 * local76 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass182_6.method24572(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass104_Sub1_27.method3807(0, 5890, 768);
		this.aClass104_Sub1_27.method3837(8448, 8448);
		this.aClass104_Sub1_27.method3804(null);
		this.aClass104_Sub1_27.method3803(0);
		if (this.aBoolean170 || arg4) {
			this.aClass104_Sub1_27.method3807(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!afs", name = "x", descriptor = "(CIIIZ)V")
	@Override
	void method7523(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass104_Sub1_27.method3758();
		this.aClass104_Sub1_27.method3804(this.aClass88_Sub2_Sub1_4);
		if (this.aBoolean170 || arg4) {
			this.aClass104_Sub1_27.method3837(7681, 8448);
			this.aClass104_Sub1_27.method3807(0, 34168, 768);
		} else {
			this.aClass104_Sub1_27.method3837(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass182_6.method24572(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean170 || arg4) {
			this.aClass104_Sub1_27.method3807(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!afs", name = "h", descriptor = "(CIIIZ)V")
	@Override
	void method7544(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass104_Sub1_27.method3758();
		this.aClass104_Sub1_27.method3804(this.aClass88_Sub2_Sub1_4);
		if (this.aBoolean170 || arg4) {
			this.aClass104_Sub1_27.method3837(7681, 8448);
			this.aClass104_Sub1_27.method3807(0, 34168, 768);
		} else {
			this.aClass104_Sub1_27.method3837(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass182_6.method24572(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean170 || arg4) {
			this.aClass104_Sub1_27.method3807(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!afs", name = "a", descriptor = "(CIIIZLclient!ch;II)V")
	@Override
	void method7545(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class96_Sub1 local2 = (Class96_Sub1) arg5;
		@Pc(5) Class88_Sub2_Sub1 local5 = local2.aClass88_Sub2_Sub1_1;
		this.aClass104_Sub1_27.method3758();
		this.aClass104_Sub1_27.method3804(this.aClass88_Sub2_Sub1_4);
		if (this.aBoolean170 || arg4) {
			this.aClass104_Sub1_27.method3837(7681, 8448);
			this.aClass104_Sub1_27.method3807(0, 34168, 768);
		} else {
			this.aClass104_Sub1_27.method3837(7681, 7681);
		}
		this.aClass104_Sub1_27.method3803(1);
		this.aClass104_Sub1_27.method3804(local5);
		this.aClass104_Sub1_27.method3837(7681, 8448);
		this.aClass104_Sub1_27.method3807(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(69) float local69 = local5.aFloat164 / (float) local5.anInt2547;
		@Pc(76) float local76 = local5.aFloat163 / (float) local5.anInt2548;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local69, 0.0F, 0.0F, (float) -arg6 * local69 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local76, 0.0F, (float) -arg7 * local76 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass182_6.method24572(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass104_Sub1_27.method3807(0, 5890, 768);
		this.aClass104_Sub1_27.method3837(8448, 8448);
		this.aClass104_Sub1_27.method3804(null);
		this.aClass104_Sub1_27.method3803(0);
		if (this.aBoolean170 || arg4) {
			this.aClass104_Sub1_27.method3807(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!afs", name = "g", descriptor = "(CIIIZLclient!ch;II)V")
	@Override
	void method7546(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class96_Sub1 local2 = (Class96_Sub1) arg5;
		@Pc(5) Class88_Sub2_Sub1 local5 = local2.aClass88_Sub2_Sub1_1;
		this.aClass104_Sub1_27.method3758();
		this.aClass104_Sub1_27.method3804(this.aClass88_Sub2_Sub1_4);
		if (this.aBoolean170 || arg4) {
			this.aClass104_Sub1_27.method3837(7681, 8448);
			this.aClass104_Sub1_27.method3807(0, 34168, 768);
		} else {
			this.aClass104_Sub1_27.method3837(7681, 7681);
		}
		this.aClass104_Sub1_27.method3803(1);
		this.aClass104_Sub1_27.method3804(local5);
		this.aClass104_Sub1_27.method3837(7681, 8448);
		this.aClass104_Sub1_27.method3807(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(69) float local69 = local5.aFloat164 / (float) local5.anInt2547;
		@Pc(76) float local76 = local5.aFloat163 / (float) local5.anInt2548;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local69, 0.0F, 0.0F, (float) -arg6 * local69 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local76, 0.0F, (float) -arg7 * local76 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass182_6.method24572(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass104_Sub1_27.method3807(0, 5890, 768);
		this.aClass104_Sub1_27.method3837(8448, 8448);
		this.aClass104_Sub1_27.method3804(null);
		this.aClass104_Sub1_27.method3803(0);
		if (this.aBoolean170 || arg4) {
			this.aClass104_Sub1_27.method3807(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!afs", name = "i", descriptor = "(CIIIZLclient!ch;II)V")
	@Override
	void method7566(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class96 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class96_Sub1 local2 = (Class96_Sub1) arg5;
		@Pc(5) Class88_Sub2_Sub1 local5 = local2.aClass88_Sub2_Sub1_1;
		this.aClass104_Sub1_27.method3758();
		this.aClass104_Sub1_27.method3804(this.aClass88_Sub2_Sub1_4);
		if (this.aBoolean170 || arg4) {
			this.aClass104_Sub1_27.method3837(7681, 8448);
			this.aClass104_Sub1_27.method3807(0, 34168, 768);
		} else {
			this.aClass104_Sub1_27.method3837(7681, 7681);
		}
		this.aClass104_Sub1_27.method3803(1);
		this.aClass104_Sub1_27.method3804(local5);
		this.aClass104_Sub1_27.method3837(7681, 8448);
		this.aClass104_Sub1_27.method3807(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(69) float local69 = local5.aFloat164 / (float) local5.anInt2547;
		@Pc(76) float local76 = local5.aFloat163 / (float) local5.anInt2548;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local69, 0.0F, 0.0F, (float) -arg6 * local69 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local76, 0.0F, (float) -arg7 * local76 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass182_6.method24572(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass104_Sub1_27.method3807(0, 5890, 768);
		this.aClass104_Sub1_27.method3837(8448, 8448);
		this.aClass104_Sub1_27.method3804(null);
		this.aClass104_Sub1_27.method3803(0);
		if (this.aBoolean170 || arg4) {
			this.aClass104_Sub1_27.method3807(0, 5890, 768);
		}
	}
}
