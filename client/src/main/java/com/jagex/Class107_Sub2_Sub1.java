package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!apf")
public class Class107_Sub2_Sub1 extends Class107_Sub2 {

	@OriginalMember(owner = "client!apf", name = "m", descriptor = "[I")
	static final int[] anIntArray206 = new int[4];

	@OriginalMember(owner = "client!apf", name = "k", descriptor = "[I")
	static final int[] anIntArray205 = new int[4];

	@OriginalMember(owner = "client!apf", name = "e", descriptor = "Lclient!afa;")
	final Class104_Sub1 aClass104_Sub1_31;

	@OriginalMember(owner = "client!apf", name = "n", descriptor = "Lclient!adq;")
	Class88_Sub1 aClass88_Sub1_1;

	@OriginalMember(owner = "client!apf", name = "<init>", descriptor = "(Lclient!afa;I)V", line = 13)
	Class107_Sub2_Sub1(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass104_Sub1_31 = arg0;
		this.aClass88_Sub1_1 = new Class88_Sub1(arg0, Class206.aClass206_22, Class226.aClass226_22, arg1);
	}

	@OriginalMember(owner = "client!apf", name = "w", descriptor = "()I", line = 19)
	int method17753() {
		return this.aClass88_Sub1_1.anInt290;
	}

	@OriginalMember(owner = "client!apf", name = "m", descriptor = "()I", line = 19)
	int method17754() {
		return this.aClass88_Sub1_1.anInt290;
	}

	@OriginalMember(owner = "client!apf", name = "l", descriptor = "()I", line = 19)
	int method17755() {
		return this.aClass88_Sub1_1.anInt290;
	}

	@OriginalMember(owner = "client!apf", name = "f", descriptor = "()I", line = 19)
	int method17756() {
		return this.aClass88_Sub1_1.anInt290;
	}

	@OriginalMember(owner = "client!apf", name = "u", descriptor = "()I", line = 19)
	int method17757() {
		return this.aClass88_Sub1_1.anInt290;
	}

	@OriginalMember(owner = "client!apf", name = "n", descriptor = "()Lclient!adq;", line = 23)
	@Override
	Class88_Sub1 method17841() {
		return this.aClass88_Sub1_1;
	}

	@OriginalMember(owner = "client!apf", name = "e", descriptor = "()Lclient!adq;", line = 23)
	@Override
	Class88_Sub1 method17840() {
		return this.aClass88_Sub1_1;
	}

	@OriginalMember(owner = "client!apf", name = "r", descriptor = "(Lclient!adq;Lclient!adq;F)Z", line = 27)
	boolean method17758(@OriginalArg(0) Class88_Sub1 arg0, @OriginalArg(1) Class88_Sub1 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class112_Sub1_Sub2 local5 = this.aClass104_Sub1_31.aClass112_Sub1_Sub2_1;
		this.aClass104_Sub1_31.method20571(anIntArray206);
		this.aClass104_Sub1_31.method20568();
		this.aClass104_Sub1_31.method20694(anIntArray205);
		this.aClass104_Sub1_31.method3800();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glViewport(0, 0, this.aClass88_Sub1_1.anInt290, this.aClass88_Sub1_1.anInt290);
		this.aClass104_Sub1_31.method3918(false);
		this.aClass104_Sub1_31.method3921(false);
		this.aClass104_Sub1_31.method3928(false);
		this.aClass104_Sub1_31.method3931(false);
		this.aClass104_Sub1_31.method3873(-2);
		this.aClass104_Sub1_31.method3882(1);
		this.aClass104_Sub1_31.method3908(0.0F, 0.0F, 0.0F, arg2);
		this.aClass104_Sub1_31.method3894(34165, 34165);
		this.aClass104_Sub1_31.method3887(arg1);
		this.aClass104_Sub1_31.method3882(0);
		this.aClass104_Sub1_31.method3888(1);
		this.aClass104_Sub1_31.method3887(arg0);
		this.aClass104_Sub1_31.method20453(local5, (byte) 1);
		for (@Pc(100) int local100 = 0; local100 < 6; local100++) {
			@Pc(107) int local107 = local100 + 34069;
			local5.method23435(0, this.aClass88_Sub1_1.method1592(local107, 0));
			local5.method18014(0);
			if (!local5.method23442()) {
				local1 = false;
				break;
			}
			OpenGL.glBegin(7);
			switch(local107) {
				case 34069:
					OpenGL.glTexCoord3i(65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34070:
					OpenGL.glTexCoord3i(-65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34071:
					OpenGL.glTexCoord3i(-65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34072:
					OpenGL.glTexCoord3i(-65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34073:
					OpenGL.glTexCoord3i(-65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34074:
					OpenGL.glTexCoord3i(65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
			}
			OpenGL.glEnd();
		}
		local5.method23435(0, null);
		this.aClass104_Sub1_31.method20456(local5, -1497248091);
		this.aClass104_Sub1_31.method3882(1);
		this.aClass104_Sub1_31.method3887(null);
		this.aClass104_Sub1_31.method3894(8448, 8448);
		this.aClass104_Sub1_31.method3882(0);
		this.aClass104_Sub1_31.method3887(null);
		this.aClass104_Sub1_31.method20569(anIntArray206[0], anIntArray206[1], anIntArray206[2], anIntArray206[3]);
		this.aClass104_Sub1_31.method20566(anIntArray205[0], anIntArray205[1], anIntArray205[2], anIntArray205[3]);
		if (local1 && !this.aClass104_Sub1_31.aBoolean107) {
			this.aClass88_Sub1_1.method18046();
		}
		return local1;
	}

	@OriginalMember(owner = "client!apf", name = "k", descriptor = "(Lclient!adq;Lclient!adq;F)Z", line = 27)
	boolean method17759(@OriginalArg(0) Class88_Sub1 arg0, @OriginalArg(1) Class88_Sub1 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class112_Sub1_Sub2 local5 = this.aClass104_Sub1_31.aClass112_Sub1_Sub2_1;
		this.aClass104_Sub1_31.method20571(anIntArray206);
		this.aClass104_Sub1_31.method20568();
		this.aClass104_Sub1_31.method20694(anIntArray205);
		this.aClass104_Sub1_31.method3800();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glViewport(0, 0, this.aClass88_Sub1_1.anInt290, this.aClass88_Sub1_1.anInt290);
		this.aClass104_Sub1_31.method3918(false);
		this.aClass104_Sub1_31.method3921(false);
		this.aClass104_Sub1_31.method3928(false);
		this.aClass104_Sub1_31.method3931(false);
		this.aClass104_Sub1_31.method3873(-2);
		this.aClass104_Sub1_31.method3882(1);
		this.aClass104_Sub1_31.method3908(0.0F, 0.0F, 0.0F, arg2);
		this.aClass104_Sub1_31.method3894(34165, 34165);
		this.aClass104_Sub1_31.method3887(arg1);
		this.aClass104_Sub1_31.method3882(0);
		this.aClass104_Sub1_31.method3888(1);
		this.aClass104_Sub1_31.method3887(arg0);
		this.aClass104_Sub1_31.method20453(local5, (byte) 1);
		for (@Pc(100) int local100 = 0; local100 < 6; local100++) {
			@Pc(107) int local107 = local100 + 34069;
			local5.method23435(0, this.aClass88_Sub1_1.method1592(local107, 0));
			local5.method18014(0);
			if (!local5.method23442()) {
				local1 = false;
				break;
			}
			OpenGL.glBegin(7);
			switch(local107) {
				case 34069:
					OpenGL.glTexCoord3i(65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34070:
					OpenGL.glTexCoord3i(-65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34071:
					OpenGL.glTexCoord3i(-65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34072:
					OpenGL.glTexCoord3i(-65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34073:
					OpenGL.glTexCoord3i(-65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34074:
					OpenGL.glTexCoord3i(65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
			}
			OpenGL.glEnd();
		}
		local5.method23435(0, null);
		this.aClass104_Sub1_31.method20456(local5, -1497248091);
		this.aClass104_Sub1_31.method3882(1);
		this.aClass104_Sub1_31.method3887(null);
		this.aClass104_Sub1_31.method3894(8448, 8448);
		this.aClass104_Sub1_31.method3882(0);
		this.aClass104_Sub1_31.method3887(null);
		this.aClass104_Sub1_31.method20569(anIntArray206[0], anIntArray206[1], anIntArray206[2], anIntArray206[3]);
		this.aClass104_Sub1_31.method20566(anIntArray205[0], anIntArray205[1], anIntArray205[2], anIntArray205[3]);
		if (local1 && !this.aClass104_Sub1_31.aBoolean107) {
			this.aClass88_Sub1_1.method18046();
		}
		return local1;
	}

	@OriginalMember(owner = "client!apf", name = "p", descriptor = "(Lclient!adq;Lclient!adq;F)Z", line = 27)
	boolean method17760(@OriginalArg(0) Class88_Sub1 arg0, @OriginalArg(1) Class88_Sub1 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class112_Sub1_Sub2 local5 = this.aClass104_Sub1_31.aClass112_Sub1_Sub2_1;
		this.aClass104_Sub1_31.method20571(anIntArray206);
		this.aClass104_Sub1_31.method20568();
		this.aClass104_Sub1_31.method20694(anIntArray205);
		this.aClass104_Sub1_31.method3800();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glViewport(0, 0, this.aClass88_Sub1_1.anInt290, this.aClass88_Sub1_1.anInt290);
		this.aClass104_Sub1_31.method3918(false);
		this.aClass104_Sub1_31.method3921(false);
		this.aClass104_Sub1_31.method3928(false);
		this.aClass104_Sub1_31.method3931(false);
		this.aClass104_Sub1_31.method3873(-2);
		this.aClass104_Sub1_31.method3882(1);
		this.aClass104_Sub1_31.method3908(0.0F, 0.0F, 0.0F, arg2);
		this.aClass104_Sub1_31.method3894(34165, 34165);
		this.aClass104_Sub1_31.method3887(arg1);
		this.aClass104_Sub1_31.method3882(0);
		this.aClass104_Sub1_31.method3888(1);
		this.aClass104_Sub1_31.method3887(arg0);
		this.aClass104_Sub1_31.method20453(local5, (byte) 1);
		for (@Pc(100) int local100 = 0; local100 < 6; local100++) {
			@Pc(107) int local107 = local100 + 34069;
			local5.method23435(0, this.aClass88_Sub1_1.method1592(local107, 0));
			local5.method18014(0);
			if (!local5.method23442()) {
				local1 = false;
				break;
			}
			OpenGL.glBegin(7);
			switch(local107) {
				case 34069:
					OpenGL.glTexCoord3i(65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34070:
					OpenGL.glTexCoord3i(-65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34071:
					OpenGL.glTexCoord3i(-65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34072:
					OpenGL.glTexCoord3i(-65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34073:
					OpenGL.glTexCoord3i(-65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34074:
					OpenGL.glTexCoord3i(65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
			}
			OpenGL.glEnd();
		}
		local5.method23435(0, null);
		this.aClass104_Sub1_31.method20456(local5, -1497248091);
		this.aClass104_Sub1_31.method3882(1);
		this.aClass104_Sub1_31.method3887(null);
		this.aClass104_Sub1_31.method3894(8448, 8448);
		this.aClass104_Sub1_31.method3882(0);
		this.aClass104_Sub1_31.method3887(null);
		this.aClass104_Sub1_31.method20569(anIntArray206[0], anIntArray206[1], anIntArray206[2], anIntArray206[3]);
		this.aClass104_Sub1_31.method20566(anIntArray205[0], anIntArray205[1], anIntArray205[2], anIntArray205[3]);
		if (local1 && !this.aClass104_Sub1_31.aBoolean107) {
			this.aClass88_Sub1_1.method18046();
		}
		return local1;
	}

	@OriginalMember(owner = "client!apf", name = "z", descriptor = "(Lclient!adq;Lclient!adq;F)Z", line = 27)
	boolean method17761(@OriginalArg(0) Class88_Sub1 arg0, @OriginalArg(1) Class88_Sub1 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class112_Sub1_Sub2 local5 = this.aClass104_Sub1_31.aClass112_Sub1_Sub2_1;
		this.aClass104_Sub1_31.method20571(anIntArray206);
		this.aClass104_Sub1_31.method20568();
		this.aClass104_Sub1_31.method20694(anIntArray205);
		this.aClass104_Sub1_31.method3800();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glViewport(0, 0, this.aClass88_Sub1_1.anInt290, this.aClass88_Sub1_1.anInt290);
		this.aClass104_Sub1_31.method3918(false);
		this.aClass104_Sub1_31.method3921(false);
		this.aClass104_Sub1_31.method3928(false);
		this.aClass104_Sub1_31.method3931(false);
		this.aClass104_Sub1_31.method3873(-2);
		this.aClass104_Sub1_31.method3882(1);
		this.aClass104_Sub1_31.method3908(0.0F, 0.0F, 0.0F, arg2);
		this.aClass104_Sub1_31.method3894(34165, 34165);
		this.aClass104_Sub1_31.method3887(arg1);
		this.aClass104_Sub1_31.method3882(0);
		this.aClass104_Sub1_31.method3888(1);
		this.aClass104_Sub1_31.method3887(arg0);
		this.aClass104_Sub1_31.method20453(local5, (byte) 1);
		for (@Pc(100) int local100 = 0; local100 < 6; local100++) {
			@Pc(107) int local107 = local100 + 34069;
			local5.method23435(0, this.aClass88_Sub1_1.method1592(local107, 0));
			local5.method18014(0);
			if (!local5.method23442()) {
				local1 = false;
				break;
			}
			OpenGL.glBegin(7);
			switch(local107) {
				case 34069:
					OpenGL.glTexCoord3i(65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34070:
					OpenGL.glTexCoord3i(-65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34071:
					OpenGL.glTexCoord3i(-65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34072:
					OpenGL.glTexCoord3i(-65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34073:
					OpenGL.glTexCoord3i(-65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34074:
					OpenGL.glTexCoord3i(65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
			}
			OpenGL.glEnd();
		}
		local5.method23435(0, null);
		this.aClass104_Sub1_31.method20456(local5, -1497248091);
		this.aClass104_Sub1_31.method3882(1);
		this.aClass104_Sub1_31.method3887(null);
		this.aClass104_Sub1_31.method3894(8448, 8448);
		this.aClass104_Sub1_31.method3882(0);
		this.aClass104_Sub1_31.method3887(null);
		this.aClass104_Sub1_31.method20569(anIntArray206[0], anIntArray206[1], anIntArray206[2], anIntArray206[3]);
		this.aClass104_Sub1_31.method20566(anIntArray205[0], anIntArray205[1], anIntArray205[2], anIntArray205[3]);
		if (local1 && !this.aClass104_Sub1_31.aBoolean107) {
			this.aClass88_Sub1_1.method18046();
		}
		return local1;
	}

	@OriginalMember(owner = "client!apf", name = "d", descriptor = "(Lclient!adq;Lclient!adq;F)Z", line = 27)
	boolean method17762(@OriginalArg(0) Class88_Sub1 arg0, @OriginalArg(1) Class88_Sub1 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class112_Sub1_Sub2 local5 = this.aClass104_Sub1_31.aClass112_Sub1_Sub2_1;
		this.aClass104_Sub1_31.method20571(anIntArray206);
		this.aClass104_Sub1_31.method20568();
		this.aClass104_Sub1_31.method20694(anIntArray205);
		this.aClass104_Sub1_31.method3800();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glViewport(0, 0, this.aClass88_Sub1_1.anInt290, this.aClass88_Sub1_1.anInt290);
		this.aClass104_Sub1_31.method3918(false);
		this.aClass104_Sub1_31.method3921(false);
		this.aClass104_Sub1_31.method3928(false);
		this.aClass104_Sub1_31.method3931(false);
		this.aClass104_Sub1_31.method3873(-2);
		this.aClass104_Sub1_31.method3882(1);
		this.aClass104_Sub1_31.method3908(0.0F, 0.0F, 0.0F, arg2);
		this.aClass104_Sub1_31.method3894(34165, 34165);
		this.aClass104_Sub1_31.method3887(arg1);
		this.aClass104_Sub1_31.method3882(0);
		this.aClass104_Sub1_31.method3888(1);
		this.aClass104_Sub1_31.method3887(arg0);
		this.aClass104_Sub1_31.method20453(local5, (byte) 1);
		for (@Pc(100) int local100 = 0; local100 < 6; local100++) {
			@Pc(107) int local107 = local100 + 34069;
			local5.method23435(0, this.aClass88_Sub1_1.method1592(local107, 0));
			local5.method18014(0);
			if (!local5.method23442()) {
				local1 = false;
				break;
			}
			OpenGL.glBegin(7);
			switch(local107) {
				case 34069:
					OpenGL.glTexCoord3i(65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34070:
					OpenGL.glTexCoord3i(-65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34071:
					OpenGL.glTexCoord3i(-65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34072:
					OpenGL.glTexCoord3i(-65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34073:
					OpenGL.glTexCoord3i(-65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34074:
					OpenGL.glTexCoord3i(65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
			}
			OpenGL.glEnd();
		}
		local5.method23435(0, null);
		this.aClass104_Sub1_31.method20456(local5, -1497248091);
		this.aClass104_Sub1_31.method3882(1);
		this.aClass104_Sub1_31.method3887(null);
		this.aClass104_Sub1_31.method3894(8448, 8448);
		this.aClass104_Sub1_31.method3882(0);
		this.aClass104_Sub1_31.method3887(null);
		this.aClass104_Sub1_31.method20569(anIntArray206[0], anIntArray206[1], anIntArray206[2], anIntArray206[3]);
		this.aClass104_Sub1_31.method20566(anIntArray205[0], anIntArray205[1], anIntArray205[2], anIntArray205[3]);
		if (local1 && !this.aClass104_Sub1_31.aBoolean107) {
			this.aClass88_Sub1_1.method18046();
		}
		return local1;
	}

	@OriginalMember(owner = "client!apf", name = "c", descriptor = "(Lclient!adq;Lclient!adq;F)Z", line = 27)
	boolean method17763(@OriginalArg(0) Class88_Sub1 arg0, @OriginalArg(1) Class88_Sub1 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class112_Sub1_Sub2 local5 = this.aClass104_Sub1_31.aClass112_Sub1_Sub2_1;
		this.aClass104_Sub1_31.method20571(anIntArray206);
		this.aClass104_Sub1_31.method20568();
		this.aClass104_Sub1_31.method20694(anIntArray205);
		this.aClass104_Sub1_31.method3800();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glViewport(0, 0, this.aClass88_Sub1_1.anInt290, this.aClass88_Sub1_1.anInt290);
		this.aClass104_Sub1_31.method3918(false);
		this.aClass104_Sub1_31.method3921(false);
		this.aClass104_Sub1_31.method3928(false);
		this.aClass104_Sub1_31.method3931(false);
		this.aClass104_Sub1_31.method3873(-2);
		this.aClass104_Sub1_31.method3882(1);
		this.aClass104_Sub1_31.method3908(0.0F, 0.0F, 0.0F, arg2);
		this.aClass104_Sub1_31.method3894(34165, 34165);
		this.aClass104_Sub1_31.method3887(arg1);
		this.aClass104_Sub1_31.method3882(0);
		this.aClass104_Sub1_31.method3888(1);
		this.aClass104_Sub1_31.method3887(arg0);
		this.aClass104_Sub1_31.method20453(local5, (byte) 1);
		for (@Pc(100) int local100 = 0; local100 < 6; local100++) {
			@Pc(107) int local107 = local100 + 34069;
			local5.method23435(0, this.aClass88_Sub1_1.method1592(local107, 0));
			local5.method18014(0);
			if (!local5.method23442()) {
				local1 = false;
				break;
			}
			OpenGL.glBegin(7);
			switch(local107) {
				case 34069:
					OpenGL.glTexCoord3i(65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34070:
					OpenGL.glTexCoord3i(-65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34071:
					OpenGL.glTexCoord3i(-65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34072:
					OpenGL.glTexCoord3i(-65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34073:
					OpenGL.glTexCoord3i(-65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34074:
					OpenGL.glTexCoord3i(65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
			}
			OpenGL.glEnd();
		}
		local5.method23435(0, null);
		this.aClass104_Sub1_31.method20456(local5, -1497248091);
		this.aClass104_Sub1_31.method3882(1);
		this.aClass104_Sub1_31.method3887(null);
		this.aClass104_Sub1_31.method3894(8448, 8448);
		this.aClass104_Sub1_31.method3882(0);
		this.aClass104_Sub1_31.method3887(null);
		this.aClass104_Sub1_31.method20569(anIntArray206[0], anIntArray206[1], anIntArray206[2], anIntArray206[3]);
		this.aClass104_Sub1_31.method20566(anIntArray205[0], anIntArray205[1], anIntArray205[2], anIntArray205[3]);
		if (local1 && !this.aClass104_Sub1_31.aBoolean107) {
			this.aClass88_Sub1_1.method18046();
		}
		return local1;
	}

	@OriginalMember(owner = "client!apf", name = "v", descriptor = "(Lclient!adq;Lclient!adq;F)Z", line = 27)
	boolean method17764(@OriginalArg(0) Class88_Sub1 arg0, @OriginalArg(1) Class88_Sub1 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class112_Sub1_Sub2 local5 = this.aClass104_Sub1_31.aClass112_Sub1_Sub2_1;
		this.aClass104_Sub1_31.method20571(anIntArray206);
		this.aClass104_Sub1_31.method20568();
		this.aClass104_Sub1_31.method20694(anIntArray205);
		this.aClass104_Sub1_31.method3800();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glViewport(0, 0, this.aClass88_Sub1_1.anInt290, this.aClass88_Sub1_1.anInt290);
		this.aClass104_Sub1_31.method3918(false);
		this.aClass104_Sub1_31.method3921(false);
		this.aClass104_Sub1_31.method3928(false);
		this.aClass104_Sub1_31.method3931(false);
		this.aClass104_Sub1_31.method3873(-2);
		this.aClass104_Sub1_31.method3882(1);
		this.aClass104_Sub1_31.method3908(0.0F, 0.0F, 0.0F, arg2);
		this.aClass104_Sub1_31.method3894(34165, 34165);
		this.aClass104_Sub1_31.method3887(arg1);
		this.aClass104_Sub1_31.method3882(0);
		this.aClass104_Sub1_31.method3888(1);
		this.aClass104_Sub1_31.method3887(arg0);
		this.aClass104_Sub1_31.method20453(local5, (byte) 1);
		for (@Pc(100) int local100 = 0; local100 < 6; local100++) {
			@Pc(107) int local107 = local100 + 34069;
			local5.method23435(0, this.aClass88_Sub1_1.method1592(local107, 0));
			local5.method18014(0);
			if (!local5.method23442()) {
				local1 = false;
				break;
			}
			OpenGL.glBegin(7);
			switch(local107) {
				case 34069:
					OpenGL.glTexCoord3i(65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34070:
					OpenGL.glTexCoord3i(-65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34071:
					OpenGL.glTexCoord3i(-65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34072:
					OpenGL.glTexCoord3i(-65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34073:
					OpenGL.glTexCoord3i(-65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34074:
					OpenGL.glTexCoord3i(65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
			}
			OpenGL.glEnd();
		}
		local5.method23435(0, null);
		this.aClass104_Sub1_31.method20456(local5, -1497248091);
		this.aClass104_Sub1_31.method3882(1);
		this.aClass104_Sub1_31.method3887(null);
		this.aClass104_Sub1_31.method3894(8448, 8448);
		this.aClass104_Sub1_31.method3882(0);
		this.aClass104_Sub1_31.method3887(null);
		this.aClass104_Sub1_31.method20569(anIntArray206[0], anIntArray206[1], anIntArray206[2], anIntArray206[3]);
		this.aClass104_Sub1_31.method20566(anIntArray205[0], anIntArray205[1], anIntArray205[2], anIntArray205[3]);
		if (local1 && !this.aClass104_Sub1_31.aBoolean107) {
			this.aClass88_Sub1_1.method18046();
		}
		return local1;
	}
}
