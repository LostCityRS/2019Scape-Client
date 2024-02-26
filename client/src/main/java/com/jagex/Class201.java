package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class201 {

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "Z")
	boolean aBoolean685;

	@OriginalMember(owner = "client!cc", name = "q", descriptor = "Lclient!adm;")
	Class84_Sub1 aClass84_Sub1_6;

	@OriginalMember(owner = "client!cc", name = "r", descriptor = "Lclient!aen;")
	Class80_Sub1_Sub3 aClass80_Sub1_Sub3_1;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Lclient!aen;")
	Class80_Sub1_Sub3 aClass80_Sub1_Sub3_2;

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
	int anInt3374 = 0;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
	int anInt3375 = 0;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
	int anInt3376 = 1;

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
	int anInt3377 = 1;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "Lclient!aag;")
	Class8 aClass8_44 = new Class8();

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Z")
	boolean aBoolean684 = true;

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "Z")
	boolean aBoolean686 = true;

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "Z")
	boolean aBoolean688 = true;

	@OriginalMember(owner = "client!cc", name = "x", descriptor = "Z")
	boolean aBoolean687 = true;

	@OriginalMember(owner = "client!cc", name = "w", descriptor = "[Lclient!adm;")
	Class84_Sub1[] aClass84_Sub1Array4 = new Class84_Sub1[2];

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "Z")
	boolean aBoolean689 = false;

	@OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
	int anInt3378 = 0;

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "Lclient!dy;")
	Class236 aClass236_18 = Class236.aClass236_21;

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "Lclient!afm;")
	final Class102_Sub3 aClass102_Sub3_44;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "Lclient!apt;")
	Class108_Sub1_Sub2 aClass108_Sub1_Sub2_4;

	@OriginalMember(owner = "client!cc", name = "u", descriptor = "Lclient!apt;")
	Class108_Sub1_Sub2 aClass108_Sub1_Sub2_6;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "Lclient!apt;")
	Class108_Sub1_Sub2 aClass108_Sub1_Sub2_5;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!afm;)V")
	Class201(@OriginalArg(0) Class102_Sub3 arg0) {
		this.aClass102_Sub3_44 = arg0;
		if (this.aClass102_Sub3_44.aBoolean141 && this.aClass102_Sub3_44.aBoolean149) {
			this.aClass108_Sub1_Sub2_6 = this.aClass108_Sub1_Sub2_4 = new Class108_Sub1_Sub2(this.aClass102_Sub3_44);
			if (this.aClass102_Sub3_44.anInt773 > 1 && this.aClass102_Sub3_44.aBoolean142 && this.aClass102_Sub3_44.aBoolean143) {
				this.aClass108_Sub1_Sub2_6 = this.aClass108_Sub1_Sub2_5 = new Class108_Sub1_Sub2(this.aClass102_Sub3_44);
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "(IIII)Z")
	boolean method24932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass108_Sub1_Sub2_6 == null || this.aClass8_44.method240(-221657960) || this.method24936()) {
			return false;
		}
		if (this.anInt3376 != arg2 || this.anInt3377 != arg3) {
			this.anInt3376 = arg2;
			this.anInt3377 = arg3;
			for (@Pc(31) Class80 local31 = this.aClass8_44.method247(129206984); local31 != this.aClass8_44.aClass80_3; local31 = local31.aClass80_227) {
				((Class80_Sub2) local31).method21629(this.anInt3376, this.anInt3377);
			}
			this.aBoolean684 = true;
			this.aBoolean686 = true;
			this.aBoolean688 = true;
		}
		if (!this.method24945()) {
			return false;
		}
		this.anInt3374 = arg0;
		this.anInt3375 = arg1;
		this.aBoolean685 = true;
		this.aClass102_Sub3_44.method6348(-this.anInt3374, this.anInt3377 + this.anInt3375 - this.aClass102_Sub3_44.method20677(1162353510).method24037());
		this.aClass102_Sub3_44.method20684(this.aClass108_Sub1_Sub2_6, -2109579815);
		this.aClass108_Sub1_Sub2_6.method18461(0);
		this.aClass102_Sub3_44.method20714(3, 0);
		return true;
	}

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "()V")
	void method24933() {
		this.aClass108_Sub1_Sub2_4 = null;
		this.aClass108_Sub1_Sub2_5 = null;
		this.aClass108_Sub1_Sub2_6 = null;
		this.aClass80_Sub1_Sub3_2 = null;
		this.aClass84_Sub1_6 = null;
		this.aClass84_Sub1Array4 = null;
		this.aClass80_Sub1_Sub3_1 = null;
		if (!this.aClass8_44.method240(1034950194)) {
			for (@Pc(30) Class80 local30 = this.aClass8_44.method247(129206984); local30 != this.aClass8_44.aClass80_3; local30 = local30.aClass80_227) {
				((Class80_Sub2) local30).method21628();
			}
		}
		this.anInt3377 = 1;
		this.anInt3376 = 1;
	}

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "()Z")
	boolean method24934() {
		return this.aClass108_Sub1_Sub2_6 != null;
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "()Z")
	boolean method24935() {
		return this.aBoolean685;
	}

	@OriginalMember(owner = "client!cc", name = "u", descriptor = "()Z")
	boolean method24936() {
		for (@Pc(5) Class80_Sub2 local5 = (Class80_Sub2) this.aClass8_44.method247(129206984); local5 != null; local5 = (Class80_Sub2) this.aClass8_44.method237(-468164838)) {
			if (!local5.method21637()) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cc", name = "ax", descriptor = "(Lclient!ajb;)V")
	void method24937(@OriginalArg(0) Class80_Sub2 arg0) {
		arg0.aBoolean550 = false;
		arg0.method21628();
		arg0.method24395((byte) 17);
		this.method24956();
	}

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "(Lclient!ajb;)Z")
	boolean method24938(@OriginalArg(0) Class80_Sub2 arg0) {
		if (this.aClass108_Sub1_Sub2_6 != null) {
			if (arg0.method21626() || arg0.method21636()) {
				this.aClass8_44.method232(arg0, -43818892);
				this.method24956();
				if (arg0.method21633() >= 0 && this.method24945()) {
					if (this.anInt3376 != -1 && this.anInt3377 != -1) {
						arg0.method21629(this.anInt3376, this.anInt3377);
					}
					arg0.aBoolean550 = true;
					return true;
				}
			}
			this.method24940(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "(II)V")
	void method24939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean685) {
			return;
		}
		if (this.aClass108_Sub1_Sub2_5 != null) {
			this.aClass102_Sub3_44.method20887(this.aClass108_Sub1_Sub2_5, (byte) 1);
			this.aClass102_Sub3_44.method20684(this.aClass108_Sub1_Sub2_4, 1002197776);
			this.aClass108_Sub1_Sub2_4.method18461(0);
			this.aClass108_Sub1_Sub2_5.method23898(0, 0, this.anInt3376, this.anInt3377, 0, 0, true, this.aBoolean689);
		}
		this.aClass102_Sub3_44.method6407();
		this.aClass102_Sub3_44.method6370(0);
		this.aClass102_Sub3_44.method6543(1);
		this.aClass102_Sub3_44.method20877();
		@Pc(52) int local52 = 0;
		@Pc(54) int local54 = 1;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = 0;
		@Pc(62) Class80_Sub2[] local62 = null;
		@Pc(68) Class80_Sub2 local68;
		for (local68 = (Class80_Sub2) this.aClass8_44.method247(129206984); local68 != null; local68 = (Class80_Sub2) this.aClass8_44.method237(109061201)) {
			if (!local68.method21637()) {
				local58++;
			}
		}
		local62 = new Class80_Sub2[local58];
		local58 = 0;
		for (local68 = (Class80_Sub2) this.aClass8_44.method247(129206984); local68 != null; local68 = (Class80_Sub2) this.aClass8_44.method237(-1421631878)) {
			if (!local68.method21637()) {
				local62[local58++] = local68;
			}
		}
		while (local56 < local58) {
			for (@Pc(114) int local114 = 0; local114 < local58; local114++) {
				@Pc(121) Class80_Sub2 local121 = local62[local114];
				if (local121.method21633() == local60) {
					@Pc(128) int local128 = local121.method21632();
					for (@Pc(130) int local130 = 0; local130 < local128; local130++) {
						this.aClass102_Sub3_44.method6348(0, 0);
						local121.method21630(local130, this.aClass84_Sub1Array4[local52], this.aClass84_Sub1_6, arg1, arg0);
						if (local130 == local128 - 1 && local56 == local58 - 1) {
							this.aClass102_Sub3_44.method20887(this.aClass108_Sub1_Sub2_4, (byte) 1);
							OpenGL.glBegin(7);
							OpenGL.glTexCoord2f(0.0F, (float) this.anInt3377);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
							OpenGL.glVertex2i(this.anInt3374, this.anInt3375);
							OpenGL.glTexCoord2f(0.0F, (float) (this.anInt3377 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
							OpenGL.glVertex2i(this.anInt3374, this.anInt3375 + arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) (this.anInt3377 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
							OpenGL.glVertex2i(this.anInt3374 + arg0, this.anInt3375 + arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) this.anInt3377);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
							OpenGL.glVertex2i(this.anInt3374 + arg0, this.anInt3375);
							OpenGL.glEnd();
						} else {
							this.aClass108_Sub1_Sub2_4.method18461(local54);
							OpenGL.glBegin(7);
							OpenGL.glTexCoord2f(0.0F, (float) this.anInt3377);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
							OpenGL.glVertex2i(0, 0);
							OpenGL.glTexCoord2f(0.0F, (float) (this.anInt3377 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
							OpenGL.glVertex2i(0, arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) (this.anInt3377 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
							OpenGL.glVertex2i(arg0, arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) this.anInt3377);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
							OpenGL.glVertex2i(arg0, 0);
							OpenGL.glEnd();
						}
						local121.method21631(local130);
						local54 = local54 + 1 & 0x1;
						local52 = local52 + 1 & 0x1;
					}
					local56++;
				}
			}
			local60++;
		}
		this.aBoolean685 = false;
		local62 = null;
	}

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "(Lclient!ajb;)V")
	void method24940(@OriginalArg(0) Class80_Sub2 arg0) {
		arg0.aBoolean550 = false;
		arg0.method21628();
		arg0.method24395((byte) 62);
		this.method24956();
	}

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "()Z")
	boolean method24941() {
		return this.aClass108_Sub1_Sub2_6 != null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "()V")
	void method24942() {
		this.aClass108_Sub1_Sub2_4 = null;
		this.aClass108_Sub1_Sub2_5 = null;
		this.aClass108_Sub1_Sub2_6 = null;
		this.aClass80_Sub1_Sub3_2 = null;
		this.aClass84_Sub1_6 = null;
		this.aClass84_Sub1Array4 = null;
		this.aClass80_Sub1_Sub3_1 = null;
		if (!this.aClass8_44.method240(348621244)) {
			for (@Pc(30) Class80 local30 = this.aClass8_44.method247(129206984); local30 != this.aClass8_44.aClass80_3; local30 = local30.aClass80_227) {
				((Class80_Sub2) local30).method21628();
			}
		}
		this.anInt3377 = 1;
		this.anInt3376 = 1;
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(Lclient!ajb;)Z")
	boolean method24943(@OriginalArg(0) Class80_Sub2 arg0) {
		if (this.aClass108_Sub1_Sub2_6 != null) {
			if (arg0.method21626() || arg0.method21636()) {
				this.aClass8_44.method232(arg0, -179302597);
				this.method24956();
				if (arg0.method21633() >= 0 && this.method24945()) {
					if (this.anInt3376 != -1 && this.anInt3377 != -1) {
						arg0.method21629(this.anInt3376, this.anInt3377);
					}
					arg0.aBoolean550 = true;
					return true;
				}
			}
			this.method24940(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "(Lclient!ajb;)Z")
	boolean method24944(@OriginalArg(0) Class80_Sub2 arg0) {
		if (this.aClass108_Sub1_Sub2_6 != null) {
			if (arg0.method21626() || arg0.method21636()) {
				this.aClass8_44.method232(arg0, 1379558545);
				this.method24956();
				if (arg0.method21633() >= 0 && this.method24945()) {
					if (this.anInt3376 != -1 && this.anInt3377 != -1) {
						arg0.method21629(this.anInt3376, this.anInt3377);
					}
					arg0.aBoolean550 = true;
					return true;
				}
			}
			this.method24940(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "()Z")
	boolean method24945() {
		if (this.aBoolean686) {
			if (this.aClass80_Sub1_Sub3_2 != null) {
				this.aClass80_Sub1_Sub3_2.method30837();
				this.aClass80_Sub1_Sub3_2 = null;
			}
			if (this.aClass84_Sub1_6 != null) {
				this.aClass84_Sub1_6.method18321();
				this.aClass84_Sub1_6 = null;
			}
		}
		if (this.aBoolean684) {
			if (this.aClass80_Sub1_Sub3_1 != null) {
				this.aClass80_Sub1_Sub3_1.method30837();
				this.aClass80_Sub1_Sub3_1 = null;
			}
			if (this.aClass84_Sub1Array4[0] != null) {
				this.aClass84_Sub1Array4[0].method18321();
				this.aClass84_Sub1Array4[0] = null;
			}
			if (this.aClass84_Sub1Array4[1] != null) {
				this.aClass84_Sub1Array4[1].method18321();
				this.aClass84_Sub1Array4[1] = null;
			}
		}
		if (this.aBoolean686) {
			if (this.aClass108_Sub1_Sub2_5 != null) {
				this.aClass80_Sub1_Sub3_2 = new Class80_Sub1_Sub3(this.aClass102_Sub3_44, Class210.aClass210_21, Class236.aClass236_22, this.anInt3376, this.anInt3377, this.aClass102_Sub3_44.anInt773);
			}
			if (this.aBoolean689) {
				this.aClass84_Sub1_6 = new Class84_Sub1(this.aClass102_Sub3_44, 34037, Class210.aClass210_21, Class236.aClass236_22, this.anInt3376, this.anInt3377);
			} else if (this.aClass80_Sub1_Sub3_2 == null) {
				this.aClass80_Sub1_Sub3_2 = new Class80_Sub1_Sub3(this.aClass102_Sub3_44, Class210.aClass210_21, Class236.aClass236_22, this.anInt3376, this.anInt3377);
			}
			this.aBoolean686 = false;
			this.aBoolean688 = true;
			this.aBoolean687 = true;
		}
		if (this.aBoolean684) {
			if (this.aClass108_Sub1_Sub2_5 != null) {
				this.aClass80_Sub1_Sub3_1 = new Class80_Sub1_Sub3(this.aClass102_Sub3_44, Class210.aClass210_24, this.aClass236_18, this.anInt3376, this.anInt3377, this.aClass102_Sub3_44.anInt773);
			}
			this.aClass84_Sub1Array4[0] = new Class84_Sub1(this.aClass102_Sub3_44, 34037, Class210.aClass210_24, this.aClass236_18, this.anInt3376, this.anInt3377);
			this.aClass84_Sub1Array4[1] = this.anInt3378 > 1 ? new Class84_Sub1(this.aClass102_Sub3_44, 34037, Class210.aClass210_24, this.aClass236_18, this.anInt3376, this.anInt3377) : null;
			this.aBoolean684 = false;
			this.aBoolean688 = true;
			this.aBoolean687 = true;
		}
		if (this.aBoolean688) {
			if (this.aClass108_Sub1_Sub2_5 == null) {
				this.aClass102_Sub3_44.method20684(this.aClass108_Sub1_Sub2_4, 899250718);
				this.aClass108_Sub1_Sub2_4.method23905(null);
				this.aClass108_Sub1_Sub2_4.method23903(0, null);
				this.aClass108_Sub1_Sub2_4.method23903(1, null);
				this.aClass108_Sub1_Sub2_4.method23903(0, this.aClass84_Sub1Array4[0].method18361(0));
				this.aClass108_Sub1_Sub2_4.method23903(1, this.anInt3378 > 1 ? this.aClass84_Sub1Array4[1].method18361(0) : null);
				if (this.aBoolean689) {
					this.aClass108_Sub1_Sub2_4.method23905(this.aClass84_Sub1_6.method18360(0));
				} else {
					this.aClass108_Sub1_Sub2_4.method23905(this.aClass80_Sub1_Sub3_2);
				}
				this.aClass102_Sub3_44.method20887(this.aClass108_Sub1_Sub2_4, (byte) 1);
			} else {
				this.aClass102_Sub3_44.method20684(this.aClass108_Sub1_Sub2_4, 890937359);
				this.aClass108_Sub1_Sub2_4.method23905(null);
				this.aClass108_Sub1_Sub2_4.method23903(0, null);
				this.aClass108_Sub1_Sub2_4.method23903(1, null);
				this.aClass108_Sub1_Sub2_4.method23903(0, this.aClass84_Sub1Array4[0].method18361(0));
				this.aClass108_Sub1_Sub2_4.method23903(1, this.anInt3378 > 1 ? this.aClass84_Sub1Array4[1].method18361(0) : null);
				if (this.aBoolean689) {
					this.aClass108_Sub1_Sub2_4.method23905(this.aClass84_Sub1_6.method18360(0));
				}
				this.aClass102_Sub3_44.method20887(this.aClass108_Sub1_Sub2_4, (byte) 1);
				this.aClass102_Sub3_44.method20684(this.aClass108_Sub1_Sub2_5, -1904983204);
				this.aClass108_Sub1_Sub2_5.method23905(null);
				this.aClass108_Sub1_Sub2_5.method23903(0, null);
				this.aClass108_Sub1_Sub2_5.method23903(0, this.aClass80_Sub1_Sub3_1);
				this.aClass108_Sub1_Sub2_5.method23905(this.aClass80_Sub1_Sub3_2);
				this.aClass102_Sub3_44.method20887(this.aClass108_Sub1_Sub2_5, (byte) 1);
			}
			this.aBoolean688 = false;
			this.aBoolean687 = true;
		}
		if (this.aBoolean687) {
			this.aClass102_Sub3_44.method20684(this.aClass108_Sub1_Sub2_6, 1136263688);
			this.aBoolean687 = !this.aClass108_Sub1_Sub2_6.method23897();
			this.aClass102_Sub3_44.method20887(this.aClass108_Sub1_Sub2_6, (byte) 1);
		}
		return !this.aBoolean687;
	}

	@OriginalMember(owner = "client!cc", name = "w", descriptor = "()Z")
	boolean method24946() {
		return this.aClass108_Sub1_Sub2_6 != null;
	}

	@OriginalMember(owner = "client!cc", name = "r", descriptor = "()Z")
	boolean method24947() {
		return this.aClass108_Sub1_Sub2_6 != null;
	}

	@OriginalMember(owner = "client!cc", name = "y", descriptor = "(II)V")
	void method24948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean685) {
			return;
		}
		if (this.aClass108_Sub1_Sub2_5 != null) {
			this.aClass102_Sub3_44.method20887(this.aClass108_Sub1_Sub2_5, (byte) 1);
			this.aClass102_Sub3_44.method20684(this.aClass108_Sub1_Sub2_4, -239128709);
			this.aClass108_Sub1_Sub2_4.method18461(0);
			this.aClass108_Sub1_Sub2_5.method23898(0, 0, this.anInt3376, this.anInt3377, 0, 0, true, this.aBoolean689);
		}
		this.aClass102_Sub3_44.method6407();
		this.aClass102_Sub3_44.method6370(0);
		this.aClass102_Sub3_44.method6543(1);
		this.aClass102_Sub3_44.method20877();
		@Pc(52) int local52 = 0;
		@Pc(54) int local54 = 1;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = 0;
		@Pc(62) Class80_Sub2[] local62 = null;
		@Pc(68) Class80_Sub2 local68;
		for (local68 = (Class80_Sub2) this.aClass8_44.method247(129206984); local68 != null; local68 = (Class80_Sub2) this.aClass8_44.method237(737309346)) {
			if (!local68.method21637()) {
				local58++;
			}
		}
		local62 = new Class80_Sub2[local58];
		local58 = 0;
		for (local68 = (Class80_Sub2) this.aClass8_44.method247(129206984); local68 != null; local68 = (Class80_Sub2) this.aClass8_44.method237(-36421789)) {
			if (!local68.method21637()) {
				local62[local58++] = local68;
			}
		}
		while (local56 < local58) {
			for (@Pc(114) int local114 = 0; local114 < local58; local114++) {
				@Pc(121) Class80_Sub2 local121 = local62[local114];
				if (local121.method21633() == local60) {
					@Pc(128) int local128 = local121.method21632();
					for (@Pc(130) int local130 = 0; local130 < local128; local130++) {
						this.aClass102_Sub3_44.method6348(0, 0);
						local121.method21630(local130, this.aClass84_Sub1Array4[local52], this.aClass84_Sub1_6, arg1, arg0);
						if (local130 == local128 - 1 && local56 == local58 - 1) {
							this.aClass102_Sub3_44.method20887(this.aClass108_Sub1_Sub2_4, (byte) 1);
							OpenGL.glBegin(7);
							OpenGL.glTexCoord2f(0.0F, (float) this.anInt3377);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
							OpenGL.glVertex2i(this.anInt3374, this.anInt3375);
							OpenGL.glTexCoord2f(0.0F, (float) (this.anInt3377 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
							OpenGL.glVertex2i(this.anInt3374, this.anInt3375 + arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) (this.anInt3377 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
							OpenGL.glVertex2i(this.anInt3374 + arg0, this.anInt3375 + arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) this.anInt3377);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
							OpenGL.glVertex2i(this.anInt3374 + arg0, this.anInt3375);
							OpenGL.glEnd();
						} else {
							this.aClass108_Sub1_Sub2_4.method18461(local54);
							OpenGL.glBegin(7);
							OpenGL.glTexCoord2f(0.0F, (float) this.anInt3377);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
							OpenGL.glVertex2i(0, 0);
							OpenGL.glTexCoord2f(0.0F, (float) (this.anInt3377 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
							OpenGL.glVertex2i(0, arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) (this.anInt3377 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
							OpenGL.glVertex2i(arg0, arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) this.anInt3377);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
							OpenGL.glVertex2i(arg0, 0);
							OpenGL.glEnd();
						}
						local121.method21631(local130);
						local54 = local54 + 1 & 0x1;
						local52 = local52 + 1 & 0x1;
					}
					local56++;
				}
			}
			local60++;
		}
		this.aBoolean685 = false;
		local62 = null;
	}

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "()Z")
	boolean method24949() {
		return this.aBoolean685;
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "()Z")
	boolean method24950() {
		for (@Pc(5) Class80_Sub2 local5 = (Class80_Sub2) this.aClass8_44.method247(129206984); local5 != null; local5 = (Class80_Sub2) this.aClass8_44.method237(-683904767)) {
			if (!local5.method21637()) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cc", name = "z", descriptor = "()Z")
	boolean method24951() {
		if (this.aBoolean686) {
			if (this.aClass80_Sub1_Sub3_2 != null) {
				this.aClass80_Sub1_Sub3_2.method30837();
				this.aClass80_Sub1_Sub3_2 = null;
			}
			if (this.aClass84_Sub1_6 != null) {
				this.aClass84_Sub1_6.method18321();
				this.aClass84_Sub1_6 = null;
			}
		}
		if (this.aBoolean684) {
			if (this.aClass80_Sub1_Sub3_1 != null) {
				this.aClass80_Sub1_Sub3_1.method30837();
				this.aClass80_Sub1_Sub3_1 = null;
			}
			if (this.aClass84_Sub1Array4[0] != null) {
				this.aClass84_Sub1Array4[0].method18321();
				this.aClass84_Sub1Array4[0] = null;
			}
			if (this.aClass84_Sub1Array4[1] != null) {
				this.aClass84_Sub1Array4[1].method18321();
				this.aClass84_Sub1Array4[1] = null;
			}
		}
		if (this.aBoolean686) {
			if (this.aClass108_Sub1_Sub2_5 != null) {
				this.aClass80_Sub1_Sub3_2 = new Class80_Sub1_Sub3(this.aClass102_Sub3_44, Class210.aClass210_21, Class236.aClass236_22, this.anInt3376, this.anInt3377, this.aClass102_Sub3_44.anInt773);
			}
			if (this.aBoolean689) {
				this.aClass84_Sub1_6 = new Class84_Sub1(this.aClass102_Sub3_44, 34037, Class210.aClass210_21, Class236.aClass236_22, this.anInt3376, this.anInt3377);
			} else if (this.aClass80_Sub1_Sub3_2 == null) {
				this.aClass80_Sub1_Sub3_2 = new Class80_Sub1_Sub3(this.aClass102_Sub3_44, Class210.aClass210_21, Class236.aClass236_22, this.anInt3376, this.anInt3377);
			}
			this.aBoolean686 = false;
			this.aBoolean688 = true;
			this.aBoolean687 = true;
		}
		if (this.aBoolean684) {
			if (this.aClass108_Sub1_Sub2_5 != null) {
				this.aClass80_Sub1_Sub3_1 = new Class80_Sub1_Sub3(this.aClass102_Sub3_44, Class210.aClass210_24, this.aClass236_18, this.anInt3376, this.anInt3377, this.aClass102_Sub3_44.anInt773);
			}
			this.aClass84_Sub1Array4[0] = new Class84_Sub1(this.aClass102_Sub3_44, 34037, Class210.aClass210_24, this.aClass236_18, this.anInt3376, this.anInt3377);
			this.aClass84_Sub1Array4[1] = this.anInt3378 > 1 ? new Class84_Sub1(this.aClass102_Sub3_44, 34037, Class210.aClass210_24, this.aClass236_18, this.anInt3376, this.anInt3377) : null;
			this.aBoolean684 = false;
			this.aBoolean688 = true;
			this.aBoolean687 = true;
		}
		if (this.aBoolean688) {
			if (this.aClass108_Sub1_Sub2_5 == null) {
				this.aClass102_Sub3_44.method20684(this.aClass108_Sub1_Sub2_4, 1340291189);
				this.aClass108_Sub1_Sub2_4.method23905(null);
				this.aClass108_Sub1_Sub2_4.method23903(0, null);
				this.aClass108_Sub1_Sub2_4.method23903(1, null);
				this.aClass108_Sub1_Sub2_4.method23903(0, this.aClass84_Sub1Array4[0].method18361(0));
				this.aClass108_Sub1_Sub2_4.method23903(1, this.anInt3378 > 1 ? this.aClass84_Sub1Array4[1].method18361(0) : null);
				if (this.aBoolean689) {
					this.aClass108_Sub1_Sub2_4.method23905(this.aClass84_Sub1_6.method18360(0));
				} else {
					this.aClass108_Sub1_Sub2_4.method23905(this.aClass80_Sub1_Sub3_2);
				}
				this.aClass102_Sub3_44.method20887(this.aClass108_Sub1_Sub2_4, (byte) 1);
			} else {
				this.aClass102_Sub3_44.method20684(this.aClass108_Sub1_Sub2_4, -1946439777);
				this.aClass108_Sub1_Sub2_4.method23905(null);
				this.aClass108_Sub1_Sub2_4.method23903(0, null);
				this.aClass108_Sub1_Sub2_4.method23903(1, null);
				this.aClass108_Sub1_Sub2_4.method23903(0, this.aClass84_Sub1Array4[0].method18361(0));
				this.aClass108_Sub1_Sub2_4.method23903(1, this.anInt3378 > 1 ? this.aClass84_Sub1Array4[1].method18361(0) : null);
				if (this.aBoolean689) {
					this.aClass108_Sub1_Sub2_4.method23905(this.aClass84_Sub1_6.method18360(0));
				}
				this.aClass102_Sub3_44.method20887(this.aClass108_Sub1_Sub2_4, (byte) 1);
				this.aClass102_Sub3_44.method20684(this.aClass108_Sub1_Sub2_5, 1826888361);
				this.aClass108_Sub1_Sub2_5.method23905(null);
				this.aClass108_Sub1_Sub2_5.method23903(0, null);
				this.aClass108_Sub1_Sub2_5.method23903(0, this.aClass80_Sub1_Sub3_1);
				this.aClass108_Sub1_Sub2_5.method23905(this.aClass80_Sub1_Sub3_2);
				this.aClass102_Sub3_44.method20887(this.aClass108_Sub1_Sub2_5, (byte) 1);
			}
			this.aBoolean688 = false;
			this.aBoolean687 = true;
		}
		if (this.aBoolean687) {
			this.aClass102_Sub3_44.method20684(this.aClass108_Sub1_Sub2_6, 1008793273);
			this.aBoolean687 = !this.aClass108_Sub1_Sub2_6.method23897();
			this.aClass102_Sub3_44.method20887(this.aClass108_Sub1_Sub2_6, (byte) 1);
		}
		return !this.aBoolean687;
	}

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "(IIII)Z")
	boolean method24952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass108_Sub1_Sub2_6 == null || this.aClass8_44.method240(-116796393) || this.method24936()) {
			return false;
		}
		if (this.anInt3376 != arg2 || this.anInt3377 != arg3) {
			this.anInt3376 = arg2;
			this.anInt3377 = arg3;
			for (@Pc(31) Class80 local31 = this.aClass8_44.method247(129206984); local31 != this.aClass8_44.aClass80_3; local31 = local31.aClass80_227) {
				((Class80_Sub2) local31).method21629(this.anInt3376, this.anInt3377);
			}
			this.aBoolean684 = true;
			this.aBoolean686 = true;
			this.aBoolean688 = true;
		}
		if (!this.method24945()) {
			return false;
		}
		this.anInt3374 = arg0;
		this.anInt3375 = arg1;
		this.aBoolean685 = true;
		this.aClass102_Sub3_44.method6348(-this.anInt3374, this.anInt3377 + this.anInt3375 - this.aClass102_Sub3_44.method20677(1864968670).method24037());
		this.aClass102_Sub3_44.method20684(this.aClass108_Sub1_Sub2_6, -1468421291);
		this.aClass108_Sub1_Sub2_6.method18461(0);
		this.aClass102_Sub3_44.method20714(3, 0);
		return true;
	}

	@OriginalMember(owner = "client!cc", name = "v", descriptor = "(II)V")
	void method24953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean685) {
			return;
		}
		if (this.aClass108_Sub1_Sub2_5 != null) {
			this.aClass102_Sub3_44.method20887(this.aClass108_Sub1_Sub2_5, (byte) 1);
			this.aClass102_Sub3_44.method20684(this.aClass108_Sub1_Sub2_4, -1191703390);
			this.aClass108_Sub1_Sub2_4.method18461(0);
			this.aClass108_Sub1_Sub2_5.method23898(0, 0, this.anInt3376, this.anInt3377, 0, 0, true, this.aBoolean689);
		}
		this.aClass102_Sub3_44.method6407();
		this.aClass102_Sub3_44.method6370(0);
		this.aClass102_Sub3_44.method6543(1);
		this.aClass102_Sub3_44.method20877();
		@Pc(52) int local52 = 0;
		@Pc(54) int local54 = 1;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = 0;
		@Pc(62) Class80_Sub2[] local62 = null;
		@Pc(68) Class80_Sub2 local68;
		for (local68 = (Class80_Sub2) this.aClass8_44.method247(129206984); local68 != null; local68 = (Class80_Sub2) this.aClass8_44.method237(-1371216871)) {
			if (!local68.method21637()) {
				local58++;
			}
		}
		local62 = new Class80_Sub2[local58];
		local58 = 0;
		for (local68 = (Class80_Sub2) this.aClass8_44.method247(129206984); local68 != null; local68 = (Class80_Sub2) this.aClass8_44.method237(125118727)) {
			if (!local68.method21637()) {
				local62[local58++] = local68;
			}
		}
		while (local56 < local58) {
			for (@Pc(114) int local114 = 0; local114 < local58; local114++) {
				@Pc(121) Class80_Sub2 local121 = local62[local114];
				if (local121.method21633() == local60) {
					@Pc(128) int local128 = local121.method21632();
					for (@Pc(130) int local130 = 0; local130 < local128; local130++) {
						this.aClass102_Sub3_44.method6348(0, 0);
						local121.method21630(local130, this.aClass84_Sub1Array4[local52], this.aClass84_Sub1_6, arg1, arg0);
						if (local130 == local128 - 1 && local56 == local58 - 1) {
							this.aClass102_Sub3_44.method20887(this.aClass108_Sub1_Sub2_4, (byte) 1);
							OpenGL.glBegin(7);
							OpenGL.glTexCoord2f(0.0F, (float) this.anInt3377);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
							OpenGL.glVertex2i(this.anInt3374, this.anInt3375);
							OpenGL.glTexCoord2f(0.0F, (float) (this.anInt3377 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
							OpenGL.glVertex2i(this.anInt3374, this.anInt3375 + arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) (this.anInt3377 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
							OpenGL.glVertex2i(this.anInt3374 + arg0, this.anInt3375 + arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) this.anInt3377);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
							OpenGL.glVertex2i(this.anInt3374 + arg0, this.anInt3375);
							OpenGL.glEnd();
						} else {
							this.aClass108_Sub1_Sub2_4.method18461(local54);
							OpenGL.glBegin(7);
							OpenGL.glTexCoord2f(0.0F, (float) this.anInt3377);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
							OpenGL.glVertex2i(0, 0);
							OpenGL.glTexCoord2f(0.0F, (float) (this.anInt3377 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
							OpenGL.glVertex2i(0, arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) (this.anInt3377 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
							OpenGL.glVertex2i(arg0, arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) this.anInt3377);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
							OpenGL.glVertex2i(arg0, 0);
							OpenGL.glEnd();
						}
						local121.method21631(local130);
						local54 = local54 + 1 & 0x1;
						local52 = local52 + 1 & 0x1;
					}
					local56++;
				}
			}
			local60++;
		}
		this.aBoolean685 = false;
		local62 = null;
	}

	@OriginalMember(owner = "client!cc", name = "x", descriptor = "()Z")
	boolean method24954() {
		return this.aClass108_Sub1_Sub2_6 != null;
	}

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "()V")
	void method24955() {
		this.aClass108_Sub1_Sub2_4 = null;
		this.aClass108_Sub1_Sub2_5 = null;
		this.aClass108_Sub1_Sub2_6 = null;
		this.aClass80_Sub1_Sub3_2 = null;
		this.aClass84_Sub1_6 = null;
		this.aClass84_Sub1Array4 = null;
		this.aClass80_Sub1_Sub3_1 = null;
		if (!this.aClass8_44.method240(-145686676)) {
			for (@Pc(30) Class80 local30 = this.aClass8_44.method247(129206984); local30 != this.aClass8_44.aClass80_3; local30 = local30.aClass80_227) {
				((Class80_Sub2) local30).method21628();
			}
		}
		this.anInt3377 = 1;
		this.anInt3376 = 1;
	}

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "()V")
	void method24956() {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		@Pc(5) Class236 local5 = Class236.aClass236_21;
		for (@Pc(11) Class80_Sub2 local11 = (Class80_Sub2) this.aClass8_44.method247(129206984); local11 != null; local11 = (Class80_Sub2) this.aClass8_44.method237(-147112727)) {
			@Pc(16) Class236 local16 = local11.method21649();
			if (local16.anInt3804 * -369125885 > local5.anInt3804 * -369125885) {
				local5 = local16;
			}
			local3 |= local11.method21646();
			local1 += local11.method21632();
		}
		if (local5 != this.aClass236_18) {
			this.aClass236_18 = local5;
			this.aBoolean684 = true;
		}
		@Pc(63) int local63 = this.anInt3378 > 2 ? 2 : this.anInt3378;
		@Pc(70) int local70 = local1 > 2 ? 2 : local1;
		if (local63 != local70) {
			this.aBoolean684 = true;
			this.aBoolean688 = true;
		}
		if (local3 != this.aBoolean689) {
			this.aBoolean689 = local3;
			this.aBoolean686 = true;
		}
		this.anInt3378 = local1;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lclient!ajb;)Z")
	boolean method24957(@OriginalArg(0) Class80_Sub2 arg0) {
		if (this.aClass108_Sub1_Sub2_6 != null) {
			if (arg0.method21626() || arg0.method21636()) {
				this.aClass8_44.method232(arg0, 953812180);
				this.method24956();
				if (arg0.method21633() >= 0 && this.method24945()) {
					if (this.anInt3376 != -1 && this.anInt3377 != -1) {
						arg0.method21629(this.anInt3376, this.anInt3377);
					}
					arg0.aBoolean550 = true;
					return true;
				}
			}
			this.method24940(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!cc", name = "q", descriptor = "()Z")
	boolean method24958() {
		return this.aBoolean685;
	}
}
