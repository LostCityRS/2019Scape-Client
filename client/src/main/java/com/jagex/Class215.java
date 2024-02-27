package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
public final class Class215 {

	@OriginalMember(owner = "client!cv", name = "y", descriptor = "Lclient!adt;")
	Class88_Sub2 aClass88_Sub2_7;

	@OriginalMember(owner = "client!cv", name = "s", descriptor = "Lclient!aeg;")
	Class93_Sub1_Sub3 aClass93_Sub1_Sub3_1;

	@OriginalMember(owner = "client!cv", name = "q", descriptor = "Lclient!aeg;")
	Class93_Sub1_Sub3 aClass93_Sub1_Sub3_2;

	@OriginalMember(owner = "client!cv", name = "z", descriptor = "Z")
	boolean aBoolean648;

	@OriginalMember(owner = "client!cv", name = "f", descriptor = "I")
	int anInt3649 = 0;

	@OriginalMember(owner = "client!cv", name = "w", descriptor = "I")
	int anInt3650 = 0;

	@OriginalMember(owner = "client!cv", name = "l", descriptor = "I")
	int anInt3653 = 1;

	@OriginalMember(owner = "client!cv", name = "u", descriptor = "I")
	int anInt3651 = 1;

	@OriginalMember(owner = "client!cv", name = "p", descriptor = "Lclient!aat;")
	Class22 aClass22_50 = new Class22();

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "Z")
	boolean aBoolean643 = true;

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "Z")
	boolean aBoolean644 = true;

	@OriginalMember(owner = "client!cv", name = "r", descriptor = "Z")
	boolean aBoolean645 = true;

	@OriginalMember(owner = "client!cv", name = "v", descriptor = "Z")
	boolean aBoolean646 = true;

	@OriginalMember(owner = "client!cv", name = "o", descriptor = "[Lclient!adt;")
	Class88_Sub2[] aClass88_Sub2Array4 = new Class88_Sub2[2];

	@OriginalMember(owner = "client!cv", name = "x", descriptor = "Z")
	boolean aBoolean647 = false;

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "I")
	int anInt3652 = 0;

	@OriginalMember(owner = "client!cv", name = "h", descriptor = "Lclient!dg;")
	Class226 aClass226_18 = Class226.aClass226_22;

	@OriginalMember(owner = "client!cv", name = "e", descriptor = "Lclient!afa;")
	final Class104_Sub1 aClass104_Sub1_47;

	@OriginalMember(owner = "client!cv", name = "n", descriptor = "Lclient!app;")
	Class112_Sub1_Sub2 aClass112_Sub1_Sub2_4;

	@OriginalMember(owner = "client!cv", name = "k", descriptor = "Lclient!app;")
	Class112_Sub1_Sub2 aClass112_Sub1_Sub2_6;

	@OriginalMember(owner = "client!cv", name = "m", descriptor = "Lclient!app;")
	Class112_Sub1_Sub2 aClass112_Sub1_Sub2_5;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Lclient!afa;)V")
	Class215(@OriginalArg(0) Class104_Sub1 arg0) {
		this.aClass104_Sub1_47 = arg0;
		if (this.aClass104_Sub1_47.aBoolean90 && this.aClass104_Sub1_47.aBoolean87) {
			this.aClass112_Sub1_Sub2_6 = this.aClass112_Sub1_Sub2_4 = new Class112_Sub1_Sub2(this.aClass104_Sub1_47);
			if (this.aClass104_Sub1_47.anInt566 > 1 && this.aClass104_Sub1_47.aBoolean77 && this.aClass104_Sub1_47.aBoolean91) {
				this.aClass112_Sub1_Sub2_6 = this.aClass112_Sub1_Sub2_5 = new Class112_Sub1_Sub2(this.aClass104_Sub1_47);
			}
		}
	}

	@OriginalMember(owner = "client!cv", name = "ah", descriptor = "()V")
	void method25566() {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		@Pc(5) Class226 local5 = Class226.aClass226_22;
		for (@Pc(11) Class93_Sub4 local11 = (Class93_Sub4) this.aClass22_50.method445((byte) 64); local11 != null; local11 = (Class93_Sub4) this.aClass22_50.method415(398199647)) {
			@Pc(16) Class226 local16 = local11.method20183();
			if (local16.anInt3687 * -1066472467 > local5.anInt3687 * -1066472467) {
				local5 = local16;
			}
			local3 |= local11.method20182();
			local1 += local11.method20210();
		}
		if (local5 != this.aClass226_18) {
			this.aClass226_18 = local5;
			this.aBoolean643 = true;
		}
		@Pc(63) int local63 = this.anInt3652 > 2 ? 2 : this.anInt3652;
		@Pc(70) int local70 = local1 > 2 ? 2 : local1;
		if (local63 != local70) {
			this.aBoolean643 = true;
			this.aBoolean645 = true;
		}
		if (local3 != this.aBoolean647) {
			this.aBoolean647 = local3;
			this.aBoolean644 = true;
		}
		this.anInt3652 = local1;
	}

	@OriginalMember(owner = "client!cv", name = "f", descriptor = "()Z")
	boolean method25567() {
		if (this.aBoolean644) {
			if (this.aClass93_Sub1_Sub3_2 != null) {
				this.aClass93_Sub1_Sub3_2.method31065();
				this.aClass93_Sub1_Sub3_2 = null;
			}
			if (this.aClass88_Sub2_7 != null) {
				this.aClass88_Sub2_7.method18060();
				this.aClass88_Sub2_7 = null;
			}
		}
		if (this.aBoolean643) {
			if (this.aClass93_Sub1_Sub3_1 != null) {
				this.aClass93_Sub1_Sub3_1.method31065();
				this.aClass93_Sub1_Sub3_1 = null;
			}
			if (this.aClass88_Sub2Array4[0] != null) {
				this.aClass88_Sub2Array4[0].method18060();
				this.aClass88_Sub2Array4[0] = null;
			}
			if (this.aClass88_Sub2Array4[1] != null) {
				this.aClass88_Sub2Array4[1].method18060();
				this.aClass88_Sub2Array4[1] = null;
			}
		}
		if (this.aBoolean644) {
			if (this.aClass112_Sub1_Sub2_5 != null) {
				this.aClass93_Sub1_Sub3_2 = new Class93_Sub1_Sub3(this.aClass104_Sub1_47, Class206.aClass206_17, Class226.aClass226_26, this.anInt3653, this.anInt3651, this.aClass104_Sub1_47.anInt566);
			}
			if (this.aBoolean647) {
				this.aClass88_Sub2_7 = new Class88_Sub2(this.aClass104_Sub1_47, 34037, Class206.aClass206_17, Class226.aClass226_26, this.anInt3653, this.anInt3651);
			} else if (this.aClass93_Sub1_Sub3_2 == null) {
				this.aClass93_Sub1_Sub3_2 = new Class93_Sub1_Sub3(this.aClass104_Sub1_47, Class206.aClass206_17, Class226.aClass226_26, this.anInt3653, this.anInt3651);
			}
			this.aBoolean644 = false;
			this.aBoolean645 = true;
			this.aBoolean646 = true;
		}
		if (this.aBoolean643) {
			if (this.aClass112_Sub1_Sub2_5 != null) {
				this.aClass93_Sub1_Sub3_1 = new Class93_Sub1_Sub3(this.aClass104_Sub1_47, Class206.aClass206_22, this.aClass226_18, this.anInt3653, this.anInt3651, this.aClass104_Sub1_47.anInt566);
			}
			this.aClass88_Sub2Array4[0] = new Class88_Sub2(this.aClass104_Sub1_47, 34037, Class206.aClass206_22, this.aClass226_18, this.anInt3653, this.anInt3651);
			this.aClass88_Sub2Array4[1] = this.anInt3652 > 1 ? new Class88_Sub2(this.aClass104_Sub1_47, 34037, Class206.aClass206_22, this.aClass226_18, this.anInt3653, this.anInt3651) : null;
			this.aBoolean643 = false;
			this.aBoolean645 = true;
			this.aBoolean646 = true;
		}
		if (this.aBoolean645) {
			if (this.aClass112_Sub1_Sub2_5 == null) {
				this.aClass104_Sub1_47.method20453(this.aClass112_Sub1_Sub2_4, (byte) 1);
				this.aClass112_Sub1_Sub2_4.method23448(null);
				this.aClass112_Sub1_Sub2_4.method23446(0, null);
				this.aClass112_Sub1_Sub2_4.method23446(1, null);
				this.aClass112_Sub1_Sub2_4.method23446(0, this.aClass88_Sub2Array4[0].method18097(0));
				this.aClass112_Sub1_Sub2_4.method23446(1, this.anInt3652 > 1 ? this.aClass88_Sub2Array4[1].method18097(0) : null);
				if (this.aBoolean647) {
					this.aClass112_Sub1_Sub2_4.method23448(this.aClass88_Sub2_7.method18100(0));
				} else {
					this.aClass112_Sub1_Sub2_4.method23448(this.aClass93_Sub1_Sub3_2);
				}
				this.aClass104_Sub1_47.method20454(this.aClass112_Sub1_Sub2_4, -1497248091);
			} else {
				this.aClass104_Sub1_47.method20453(this.aClass112_Sub1_Sub2_4, (byte) 1);
				this.aClass112_Sub1_Sub2_4.method23448(null);
				this.aClass112_Sub1_Sub2_4.method23446(0, null);
				this.aClass112_Sub1_Sub2_4.method23446(1, null);
				this.aClass112_Sub1_Sub2_4.method23446(0, this.aClass88_Sub2Array4[0].method18097(0));
				this.aClass112_Sub1_Sub2_4.method23446(1, this.anInt3652 > 1 ? this.aClass88_Sub2Array4[1].method18097(0) : null);
				if (this.aBoolean647) {
					this.aClass112_Sub1_Sub2_4.method23448(this.aClass88_Sub2_7.method18100(0));
				}
				this.aClass104_Sub1_47.method20454(this.aClass112_Sub1_Sub2_4, -1497248091);
				this.aClass104_Sub1_47.method20453(this.aClass112_Sub1_Sub2_5, (byte) 1);
				this.aClass112_Sub1_Sub2_5.method23448(null);
				this.aClass112_Sub1_Sub2_5.method23446(0, null);
				this.aClass112_Sub1_Sub2_5.method23446(0, this.aClass93_Sub1_Sub3_1);
				this.aClass112_Sub1_Sub2_5.method23448(this.aClass93_Sub1_Sub3_2);
				this.aClass104_Sub1_47.method20454(this.aClass112_Sub1_Sub2_5, -1497248091);
			}
			this.aBoolean645 = false;
			this.aBoolean646 = true;
		}
		if (this.aBoolean646) {
			this.aClass104_Sub1_47.method20453(this.aClass112_Sub1_Sub2_6, (byte) 1);
			this.aBoolean646 = !this.aClass112_Sub1_Sub2_6.method23453();
			this.aClass104_Sub1_47.method20454(this.aClass112_Sub1_Sub2_6, -1497248091);
		}
		return !this.aBoolean646;
	}

	@OriginalMember(owner = "client!cv", name = "n", descriptor = "()Z")
	boolean method25568() {
		return this.aClass112_Sub1_Sub2_6 != null;
	}

	@OriginalMember(owner = "client!cv", name = "k", descriptor = "()Z")
	boolean method25569() {
		for (@Pc(5) Class93_Sub4 local5 = (Class93_Sub4) this.aClass22_50.method445((byte) 26); local5 != null; local5 = (Class93_Sub4) this.aClass22_50.method415(935942407)) {
			if (!local5.method20192()) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cv", name = "p", descriptor = "()V")
	void method25570() {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		@Pc(5) Class226 local5 = Class226.aClass226_22;
		for (@Pc(11) Class93_Sub4 local11 = (Class93_Sub4) this.aClass22_50.method445((byte) 72); local11 != null; local11 = (Class93_Sub4) this.aClass22_50.method415(542980029)) {
			@Pc(16) Class226 local16 = local11.method20183();
			if (local16.anInt3687 * -1066472467 > local5.anInt3687 * -1066472467) {
				local5 = local16;
			}
			local3 |= local11.method20182();
			local1 += local11.method20210();
		}
		if (local5 != this.aClass226_18) {
			this.aClass226_18 = local5;
			this.aBoolean643 = true;
		}
		@Pc(63) int local63 = this.anInt3652 > 2 ? 2 : this.anInt3652;
		@Pc(70) int local70 = local1 > 2 ? 2 : local1;
		if (local63 != local70) {
			this.aBoolean643 = true;
			this.aBoolean645 = true;
		}
		if (local3 != this.aBoolean647) {
			this.aBoolean647 = local3;
			this.aBoolean644 = true;
		}
		this.anInt3652 = local1;
	}

	@OriginalMember(owner = "client!cv", name = "y", descriptor = "()Z")
	boolean method25571() {
		for (@Pc(5) Class93_Sub4 local5 = (Class93_Sub4) this.aClass22_50.method445((byte) 63); local5 != null; local5 = (Class93_Sub4) this.aClass22_50.method415(1035417235)) {
			if (!local5.method20192()) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cv", name = "w", descriptor = "(IIII)Z")
	boolean method25572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass112_Sub1_Sub2_6 == null || this.aClass22_50.method418(1756198421) || this.method25569()) {
			return false;
		}
		if (this.anInt3653 != arg2 || this.anInt3651 != arg3) {
			this.anInt3653 = arg2;
			this.anInt3651 = arg3;
			for (@Pc(31) Class93 local31 = this.aClass22_50.method445((byte) 92); local31 != this.aClass22_50.aClass93_8; local31 = local31.aClass93_227) {
				((Class93_Sub4) local31).method20181(this.anInt3653, this.anInt3651);
			}
			this.aBoolean643 = true;
			this.aBoolean644 = true;
			this.aBoolean645 = true;
		}
		if (!this.method25567()) {
			return false;
		}
		this.anInt3649 = arg0;
		this.anInt3650 = arg1;
		this.aBoolean648 = true;
		this.aClass104_Sub1_47.method3952(-this.anInt3649, this.anInt3651 + this.anInt3650 - this.aClass104_Sub1_47.method20446((byte) -115).method23749());
		this.aClass104_Sub1_47.method20453(this.aClass112_Sub1_Sub2_6, (byte) 1);
		this.aClass112_Sub1_Sub2_6.method18026(0);
		this.aClass104_Sub1_47.method20786(3, 0);
		return true;
	}

	@OriginalMember(owner = "client!cv", name = "l", descriptor = "(II)V")
	void method25573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean648) {
			return;
		}
		if (this.aClass112_Sub1_Sub2_5 != null) {
			this.aClass104_Sub1_47.method20454(this.aClass112_Sub1_Sub2_5, -1497248091);
			this.aClass104_Sub1_47.method20453(this.aClass112_Sub1_Sub2_4, (byte) 1);
			this.aClass112_Sub1_Sub2_4.method18026(0);
			this.aClass112_Sub1_Sub2_5.method23447(0, 0, this.anInt3653, this.anInt3651, 0, 0, true, this.aBoolean647);
		}
		this.aClass104_Sub1_47.method3799();
		this.aClass104_Sub1_47.method3818(0);
		this.aClass104_Sub1_47.method3805(1);
		this.aClass104_Sub1_47.method20478();
		@Pc(52) int local52 = 0;
		@Pc(54) int local54 = 1;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = 0;
		@Pc(62) Class93_Sub4[] local62 = null;
		@Pc(68) Class93_Sub4 local68;
		for (local68 = (Class93_Sub4) this.aClass22_50.method445((byte) 16); local68 != null; local68 = (Class93_Sub4) this.aClass22_50.method415(1955939604)) {
			if (!local68.method20192()) {
				local58++;
			}
		}
		local62 = new Class93_Sub4[local58];
		local58 = 0;
		for (local68 = (Class93_Sub4) this.aClass22_50.method445((byte) 22); local68 != null; local68 = (Class93_Sub4) this.aClass22_50.method415(1931001491)) {
			if (!local68.method20192()) {
				local62[local58++] = local68;
			}
		}
		while (local56 < local58) {
			for (@Pc(114) int local114 = 0; local114 < local58; local114++) {
				@Pc(121) Class93_Sub4 local121 = local62[local114];
				if (local121.method20187() == local60) {
					@Pc(128) int local128 = local121.method20210();
					for (@Pc(130) int local130 = 0; local130 < local128; local130++) {
						this.aClass104_Sub1_47.method3952(0, 0);
						local121.method20178(local130, this.aClass88_Sub2Array4[local52], this.aClass88_Sub2_7, arg1, arg0);
						if (local130 == local128 - 1 && local56 == local58 - 1) {
							this.aClass104_Sub1_47.method20454(this.aClass112_Sub1_Sub2_4, -1497248091);
							OpenGL.glBegin(7);
							OpenGL.glTexCoord2f(0.0F, (float) this.anInt3651);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
							OpenGL.glVertex2i(this.anInt3649, this.anInt3650);
							OpenGL.glTexCoord2f(0.0F, (float) (this.anInt3651 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
							OpenGL.glVertex2i(this.anInt3649, this.anInt3650 + arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) (this.anInt3651 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
							OpenGL.glVertex2i(this.anInt3649 + arg0, this.anInt3650 + arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) this.anInt3651);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
							OpenGL.glVertex2i(this.anInt3649 + arg0, this.anInt3650);
							OpenGL.glEnd();
						} else {
							this.aClass112_Sub1_Sub2_4.method18026(local54);
							OpenGL.glBegin(7);
							OpenGL.glTexCoord2f(0.0F, (float) this.anInt3651);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
							OpenGL.glVertex2i(0, 0);
							OpenGL.glTexCoord2f(0.0F, (float) (this.anInt3651 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
							OpenGL.glVertex2i(0, arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) (this.anInt3651 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
							OpenGL.glVertex2i(arg0, arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) this.anInt3651);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
							OpenGL.glVertex2i(arg0, 0);
							OpenGL.glEnd();
						}
						local121.method20179(local130);
						local54 = local54 + 1 & 0x1;
						local52 = local52 + 1 & 0x1;
					}
					local56++;
				}
			}
			local60++;
		}
		this.aBoolean648 = false;
		local62 = null;
	}

	@OriginalMember(owner = "client!cv", name = "u", descriptor = "(Lclient!ajl;)Z")
	boolean method25574(@OriginalArg(0) Class93_Sub4 arg0) {
		if (this.aClass112_Sub1_Sub2_6 != null) {
			if (arg0.method20180() || arg0.method20175()) {
				this.aClass22_50.method407(arg0, -1330538933);
				this.method25570();
				if (arg0.method20187() >= 0 && this.method25567()) {
					if (this.anInt3653 != -1 && this.anInt3651 != -1) {
						arg0.method20181(this.anInt3653, this.anInt3651);
					}
					arg0.aBoolean458 = true;
					return true;
				}
			}
			this.method25575(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!cv", name = "z", descriptor = "(Lclient!ajl;)V")
	void method25575(@OriginalArg(0) Class93_Sub4 arg0) {
		arg0.aBoolean458 = false;
		arg0.method20211();
		arg0.method23981(2008895063);
		this.method25570();
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(II)V")
	void method25576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean648) {
			return;
		}
		if (this.aClass112_Sub1_Sub2_5 != null) {
			this.aClass104_Sub1_47.method20454(this.aClass112_Sub1_Sub2_5, -1497248091);
			this.aClass104_Sub1_47.method20453(this.aClass112_Sub1_Sub2_4, (byte) 1);
			this.aClass112_Sub1_Sub2_4.method18026(0);
			this.aClass112_Sub1_Sub2_5.method23447(0, 0, this.anInt3653, this.anInt3651, 0, 0, true, this.aBoolean647);
		}
		this.aClass104_Sub1_47.method3799();
		this.aClass104_Sub1_47.method3818(0);
		this.aClass104_Sub1_47.method3805(1);
		this.aClass104_Sub1_47.method20478();
		@Pc(52) int local52 = 0;
		@Pc(54) int local54 = 1;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = 0;
		@Pc(62) Class93_Sub4[] local62 = null;
		@Pc(68) Class93_Sub4 local68;
		for (local68 = (Class93_Sub4) this.aClass22_50.method445((byte) 123); local68 != null; local68 = (Class93_Sub4) this.aClass22_50.method415(221979027)) {
			if (!local68.method20192()) {
				local58++;
			}
		}
		local62 = new Class93_Sub4[local58];
		local58 = 0;
		for (local68 = (Class93_Sub4) this.aClass22_50.method445((byte) 93); local68 != null; local68 = (Class93_Sub4) this.aClass22_50.method415(888024484)) {
			if (!local68.method20192()) {
				local62[local58++] = local68;
			}
		}
		while (local56 < local58) {
			for (@Pc(114) int local114 = 0; local114 < local58; local114++) {
				@Pc(121) Class93_Sub4 local121 = local62[local114];
				if (local121.method20187() == local60) {
					@Pc(128) int local128 = local121.method20210();
					for (@Pc(130) int local130 = 0; local130 < local128; local130++) {
						this.aClass104_Sub1_47.method3952(0, 0);
						local121.method20178(local130, this.aClass88_Sub2Array4[local52], this.aClass88_Sub2_7, arg1, arg0);
						if (local130 == local128 - 1 && local56 == local58 - 1) {
							this.aClass104_Sub1_47.method20454(this.aClass112_Sub1_Sub2_4, -1497248091);
							OpenGL.glBegin(7);
							OpenGL.glTexCoord2f(0.0F, (float) this.anInt3651);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
							OpenGL.glVertex2i(this.anInt3649, this.anInt3650);
							OpenGL.glTexCoord2f(0.0F, (float) (this.anInt3651 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
							OpenGL.glVertex2i(this.anInt3649, this.anInt3650 + arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) (this.anInt3651 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
							OpenGL.glVertex2i(this.anInt3649 + arg0, this.anInt3650 + arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) this.anInt3651);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
							OpenGL.glVertex2i(this.anInt3649 + arg0, this.anInt3650);
							OpenGL.glEnd();
						} else {
							this.aClass112_Sub1_Sub2_4.method18026(local54);
							OpenGL.glBegin(7);
							OpenGL.glTexCoord2f(0.0F, (float) this.anInt3651);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
							OpenGL.glVertex2i(0, 0);
							OpenGL.glTexCoord2f(0.0F, (float) (this.anInt3651 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
							OpenGL.glVertex2i(0, arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) (this.anInt3651 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
							OpenGL.glVertex2i(arg0, arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) this.anInt3651);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
							OpenGL.glVertex2i(arg0, 0);
							OpenGL.glEnd();
						}
						local121.method20179(local130);
						local54 = local54 + 1 & 0x1;
						local52 = local52 + 1 & 0x1;
					}
					local56++;
				}
			}
			local60++;
		}
		this.aBoolean648 = false;
		local62 = null;
	}

	@OriginalMember(owner = "client!cv", name = "v", descriptor = "()Z")
	boolean method25577() {
		return this.aBoolean648;
	}

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "()Z")
	boolean method25578() {
		return this.aBoolean648;
	}

	@OriginalMember(owner = "client!cv", name = "r", descriptor = "()Z")
	boolean method25579() {
		return this.aBoolean648;
	}

	@OriginalMember(owner = "client!cv", name = "e", descriptor = "()V")
	void method25580() {
		this.aClass112_Sub1_Sub2_4 = null;
		this.aClass112_Sub1_Sub2_5 = null;
		this.aClass112_Sub1_Sub2_6 = null;
		this.aClass93_Sub1_Sub3_2 = null;
		this.aClass88_Sub2_7 = null;
		this.aClass88_Sub2Array4 = null;
		this.aClass93_Sub1_Sub3_1 = null;
		if (!this.aClass22_50.method418(1867636030)) {
			for (@Pc(30) Class93 local30 = this.aClass22_50.method445((byte) 48); local30 != this.aClass22_50.aClass93_8; local30 = local30.aClass93_227) {
				((Class93_Sub4) local30).method20211();
			}
		}
		this.anInt3651 = 1;
		this.anInt3653 = 1;
	}

	@OriginalMember(owner = "client!cv", name = "o", descriptor = "()Z")
	boolean method25581() {
		for (@Pc(5) Class93_Sub4 local5 = (Class93_Sub4) this.aClass22_50.method445((byte) 50); local5 != null; local5 = (Class93_Sub4) this.aClass22_50.method415(91179564)) {
			if (!local5.method20192()) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cv", name = "s", descriptor = "()Z")
	boolean method25582() {
		for (@Pc(5) Class93_Sub4 local5 = (Class93_Sub4) this.aClass22_50.method445((byte) 54); local5 != null; local5 = (Class93_Sub4) this.aClass22_50.method415(921091583)) {
			if (!local5.method20192()) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cv", name = "m", descriptor = "()Z")
	boolean method25583() {
		return this.aBoolean648;
	}

	@OriginalMember(owner = "client!cv", name = "q", descriptor = "()Z")
	boolean method25584() {
		for (@Pc(5) Class93_Sub4 local5 = (Class93_Sub4) this.aClass22_50.method445((byte) 100); local5 != null; local5 = (Class93_Sub4) this.aClass22_50.method415(567163161)) {
			if (!local5.method20192()) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cv", name = "x", descriptor = "()Z")
	boolean method25585() {
		if (this.aBoolean644) {
			if (this.aClass93_Sub1_Sub3_2 != null) {
				this.aClass93_Sub1_Sub3_2.method31065();
				this.aClass93_Sub1_Sub3_2 = null;
			}
			if (this.aClass88_Sub2_7 != null) {
				this.aClass88_Sub2_7.method18060();
				this.aClass88_Sub2_7 = null;
			}
		}
		if (this.aBoolean643) {
			if (this.aClass93_Sub1_Sub3_1 != null) {
				this.aClass93_Sub1_Sub3_1.method31065();
				this.aClass93_Sub1_Sub3_1 = null;
			}
			if (this.aClass88_Sub2Array4[0] != null) {
				this.aClass88_Sub2Array4[0].method18060();
				this.aClass88_Sub2Array4[0] = null;
			}
			if (this.aClass88_Sub2Array4[1] != null) {
				this.aClass88_Sub2Array4[1].method18060();
				this.aClass88_Sub2Array4[1] = null;
			}
		}
		if (this.aBoolean644) {
			if (this.aClass112_Sub1_Sub2_5 != null) {
				this.aClass93_Sub1_Sub3_2 = new Class93_Sub1_Sub3(this.aClass104_Sub1_47, Class206.aClass206_17, Class226.aClass226_26, this.anInt3653, this.anInt3651, this.aClass104_Sub1_47.anInt566);
			}
			if (this.aBoolean647) {
				this.aClass88_Sub2_7 = new Class88_Sub2(this.aClass104_Sub1_47, 34037, Class206.aClass206_17, Class226.aClass226_26, this.anInt3653, this.anInt3651);
			} else if (this.aClass93_Sub1_Sub3_2 == null) {
				this.aClass93_Sub1_Sub3_2 = new Class93_Sub1_Sub3(this.aClass104_Sub1_47, Class206.aClass206_17, Class226.aClass226_26, this.anInt3653, this.anInt3651);
			}
			this.aBoolean644 = false;
			this.aBoolean645 = true;
			this.aBoolean646 = true;
		}
		if (this.aBoolean643) {
			if (this.aClass112_Sub1_Sub2_5 != null) {
				this.aClass93_Sub1_Sub3_1 = new Class93_Sub1_Sub3(this.aClass104_Sub1_47, Class206.aClass206_22, this.aClass226_18, this.anInt3653, this.anInt3651, this.aClass104_Sub1_47.anInt566);
			}
			this.aClass88_Sub2Array4[0] = new Class88_Sub2(this.aClass104_Sub1_47, 34037, Class206.aClass206_22, this.aClass226_18, this.anInt3653, this.anInt3651);
			this.aClass88_Sub2Array4[1] = this.anInt3652 > 1 ? new Class88_Sub2(this.aClass104_Sub1_47, 34037, Class206.aClass206_22, this.aClass226_18, this.anInt3653, this.anInt3651) : null;
			this.aBoolean643 = false;
			this.aBoolean645 = true;
			this.aBoolean646 = true;
		}
		if (this.aBoolean645) {
			if (this.aClass112_Sub1_Sub2_5 == null) {
				this.aClass104_Sub1_47.method20453(this.aClass112_Sub1_Sub2_4, (byte) 1);
				this.aClass112_Sub1_Sub2_4.method23448(null);
				this.aClass112_Sub1_Sub2_4.method23446(0, null);
				this.aClass112_Sub1_Sub2_4.method23446(1, null);
				this.aClass112_Sub1_Sub2_4.method23446(0, this.aClass88_Sub2Array4[0].method18097(0));
				this.aClass112_Sub1_Sub2_4.method23446(1, this.anInt3652 > 1 ? this.aClass88_Sub2Array4[1].method18097(0) : null);
				if (this.aBoolean647) {
					this.aClass112_Sub1_Sub2_4.method23448(this.aClass88_Sub2_7.method18100(0));
				} else {
					this.aClass112_Sub1_Sub2_4.method23448(this.aClass93_Sub1_Sub3_2);
				}
				this.aClass104_Sub1_47.method20454(this.aClass112_Sub1_Sub2_4, -1497248091);
			} else {
				this.aClass104_Sub1_47.method20453(this.aClass112_Sub1_Sub2_4, (byte) 1);
				this.aClass112_Sub1_Sub2_4.method23448(null);
				this.aClass112_Sub1_Sub2_4.method23446(0, null);
				this.aClass112_Sub1_Sub2_4.method23446(1, null);
				this.aClass112_Sub1_Sub2_4.method23446(0, this.aClass88_Sub2Array4[0].method18097(0));
				this.aClass112_Sub1_Sub2_4.method23446(1, this.anInt3652 > 1 ? this.aClass88_Sub2Array4[1].method18097(0) : null);
				if (this.aBoolean647) {
					this.aClass112_Sub1_Sub2_4.method23448(this.aClass88_Sub2_7.method18100(0));
				}
				this.aClass104_Sub1_47.method20454(this.aClass112_Sub1_Sub2_4, -1497248091);
				this.aClass104_Sub1_47.method20453(this.aClass112_Sub1_Sub2_5, (byte) 1);
				this.aClass112_Sub1_Sub2_5.method23448(null);
				this.aClass112_Sub1_Sub2_5.method23446(0, null);
				this.aClass112_Sub1_Sub2_5.method23446(0, this.aClass93_Sub1_Sub3_1);
				this.aClass112_Sub1_Sub2_5.method23448(this.aClass93_Sub1_Sub3_2);
				this.aClass104_Sub1_47.method20454(this.aClass112_Sub1_Sub2_5, -1497248091);
			}
			this.aBoolean645 = false;
			this.aBoolean646 = true;
		}
		if (this.aBoolean646) {
			this.aClass104_Sub1_47.method20453(this.aClass112_Sub1_Sub2_6, (byte) 1);
			this.aBoolean646 = !this.aClass112_Sub1_Sub2_6.method23453();
			this.aClass104_Sub1_47.method20454(this.aClass112_Sub1_Sub2_6, -1497248091);
		}
		return !this.aBoolean646;
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(IIII)Z")
	boolean method25586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass112_Sub1_Sub2_6 == null || this.aClass22_50.method418(1781321342) || this.method25569()) {
			return false;
		}
		if (this.anInt3653 != arg2 || this.anInt3651 != arg3) {
			this.anInt3653 = arg2;
			this.anInt3651 = arg3;
			for (@Pc(31) Class93 local31 = this.aClass22_50.method445((byte) 98); local31 != this.aClass22_50.aClass93_8; local31 = local31.aClass93_227) {
				((Class93_Sub4) local31).method20181(this.anInt3653, this.anInt3651);
			}
			this.aBoolean643 = true;
			this.aBoolean644 = true;
			this.aBoolean645 = true;
		}
		if (!this.method25567()) {
			return false;
		}
		this.anInt3649 = arg0;
		this.anInt3650 = arg1;
		this.aBoolean648 = true;
		this.aClass104_Sub1_47.method3952(-this.anInt3649, this.anInt3651 + this.anInt3650 - this.aClass104_Sub1_47.method20446((byte) -14).method23749());
		this.aClass104_Sub1_47.method20453(this.aClass112_Sub1_Sub2_6, (byte) 1);
		this.aClass112_Sub1_Sub2_6.method18026(0);
		this.aClass104_Sub1_47.method20786(3, 0);
		return true;
	}

	@OriginalMember(owner = "client!cv", name = "h", descriptor = "(IIII)Z")
	boolean method25587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass112_Sub1_Sub2_6 == null || this.aClass22_50.method418(2033274335) || this.method25569()) {
			return false;
		}
		if (this.anInt3653 != arg2 || this.anInt3651 != arg3) {
			this.anInt3653 = arg2;
			this.anInt3651 = arg3;
			for (@Pc(31) Class93 local31 = this.aClass22_50.method445((byte) 68); local31 != this.aClass22_50.aClass93_8; local31 = local31.aClass93_227) {
				((Class93_Sub4) local31).method20181(this.anInt3653, this.anInt3651);
			}
			this.aBoolean643 = true;
			this.aBoolean644 = true;
			this.aBoolean645 = true;
		}
		if (!this.method25567()) {
			return false;
		}
		this.anInt3649 = arg0;
		this.anInt3650 = arg1;
		this.aBoolean648 = true;
		this.aClass104_Sub1_47.method3952(-this.anInt3649, this.anInt3651 + this.anInt3650 - this.aClass104_Sub1_47.method20446((byte) -49).method23749());
		this.aClass104_Sub1_47.method20453(this.aClass112_Sub1_Sub2_6, (byte) 1);
		this.aClass112_Sub1_Sub2_6.method18026(0);
		this.aClass104_Sub1_47.method20786(3, 0);
		return true;
	}

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "()V")
	void method25588() {
		this.aClass112_Sub1_Sub2_4 = null;
		this.aClass112_Sub1_Sub2_5 = null;
		this.aClass112_Sub1_Sub2_6 = null;
		this.aClass93_Sub1_Sub3_2 = null;
		this.aClass88_Sub2_7 = null;
		this.aClass88_Sub2Array4 = null;
		this.aClass93_Sub1_Sub3_1 = null;
		if (!this.aClass22_50.method418(1901849845)) {
			for (@Pc(30) Class93 local30 = this.aClass22_50.method445((byte) 27); local30 != this.aClass22_50.aClass93_8; local30 = local30.aClass93_227) {
				((Class93_Sub4) local30).method20211();
			}
		}
		this.anInt3651 = 1;
		this.anInt3653 = 1;
	}

	@OriginalMember(owner = "client!cv", name = "g", descriptor = "(Lclient!ajl;)Z")
	boolean method25589(@OriginalArg(0) Class93_Sub4 arg0) {
		if (this.aClass112_Sub1_Sub2_6 != null) {
			if (arg0.method20180() || arg0.method20175()) {
				this.aClass22_50.method407(arg0, -1059603725);
				this.method25570();
				if (arg0.method20187() >= 0 && this.method25567()) {
					if (this.anInt3653 != -1 && this.anInt3651 != -1) {
						arg0.method20181(this.anInt3653, this.anInt3651);
					}
					arg0.aBoolean458 = true;
					return true;
				}
			}
			this.method25575(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!cv", name = "i", descriptor = "(Lclient!ajl;)Z")
	boolean method25590(@OriginalArg(0) Class93_Sub4 arg0) {
		if (this.aClass112_Sub1_Sub2_6 != null) {
			if (arg0.method20180() || arg0.method20175()) {
				this.aClass22_50.method407(arg0, -2001487167);
				this.method25570();
				if (arg0.method20187() >= 0 && this.method25567()) {
					if (this.anInt3653 != -1 && this.anInt3651 != -1) {
						arg0.method20181(this.anInt3653, this.anInt3651);
					}
					arg0.aBoolean458 = true;
					return true;
				}
			}
			this.method25575(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!cv", name = "j", descriptor = "(Lclient!ajl;)V")
	void method25591(@OriginalArg(0) Class93_Sub4 arg0) {
		arg0.aBoolean458 = false;
		arg0.method20211();
		arg0.method23981(-906380406);
		this.method25570();
	}

	@OriginalMember(owner = "client!cv", name = "t", descriptor = "(Lclient!ajl;)V")
	void method25592(@OriginalArg(0) Class93_Sub4 arg0) {
		arg0.aBoolean458 = false;
		arg0.method20211();
		arg0.method23981(77795931);
		this.method25570();
	}

	@OriginalMember(owner = "client!cv", name = "ae", descriptor = "(Lclient!ajl;)V")
	void method25593(@OriginalArg(0) Class93_Sub4 arg0) {
		arg0.aBoolean458 = false;
		arg0.method20211();
		arg0.method23981(-1977691729);
		this.method25570();
	}

	@OriginalMember(owner = "client!cv", name = "ag", descriptor = "(Lclient!ajl;)V")
	void method25594(@OriginalArg(0) Class93_Sub4 arg0) {
		arg0.aBoolean458 = false;
		arg0.method20211();
		arg0.method23981(2018759723);
		this.method25570();
	}
}
