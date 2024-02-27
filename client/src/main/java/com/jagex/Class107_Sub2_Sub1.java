package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!apf")
public final class Class107_Sub2_Sub1 extends Class107_Sub2 {

	@OriginalMember(owner = "client!apf", name = "m", descriptor = "[I")
	static final int[] anIntArray206 = new int[4];

	@OriginalMember(owner = "client!apf", name = "k", descriptor = "[I")
	static final int[] anIntArray205 = new int[4];

	@OriginalMember(owner = "client!apf", name = "e", descriptor = "Lclient!afa;")
	final Class104_Sub1 aClass104_Sub1_31;

	@OriginalMember(owner = "client!apf", name = "n", descriptor = "Lclient!adq;")
	Class88_Sub1 aClass88_Sub1_1;

	@OriginalMember(owner = "client!apf", name = "<init>", descriptor = "(Lclient!afa;I)V")
	Class107_Sub2_Sub1(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass104_Sub1_31 = arg0;
		this.aClass88_Sub1_1 = new Class88_Sub1(arg0, Class206.aClass206_22, Class226.aClass226_22, arg1);
	}

	@OriginalMember(owner = "client!apf", name = "w", descriptor = "()I")
	int method17765() {
		return this.aClass88_Sub1_1.anInt290;
	}

	@OriginalMember(owner = "client!apf", name = "m", descriptor = "()I")
	int method17766() {
		return this.aClass88_Sub1_1.anInt290;
	}

	@OriginalMember(owner = "client!apf", name = "r", descriptor = "(Lclient!adq;Lclient!adq;F)Z")
	boolean method17767(@OriginalArg(0) Class88_Sub1 arg0, @OriginalArg(1) Class88_Sub1 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class112_Sub1_Sub2 local5 = this.aClass104_Sub1_31.aClass112_Sub1_Sub2_1;
		this.aClass104_Sub1_31.method20482(anIntArray206);
		this.aClass104_Sub1_31.method20478();
		this.aClass104_Sub1_31.method20637(anIntArray205);
		this.aClass104_Sub1_31.method3775();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glViewport(0, 0, this.aClass88_Sub1_1.anInt290, this.aClass88_Sub1_1.anInt290);
		this.aClass104_Sub1_31.method3765(false);
		this.aClass104_Sub1_31.method3791(false);
		this.aClass104_Sub1_31.method3815(false);
		this.aClass104_Sub1_31.method3816(false);
		this.aClass104_Sub1_31.method3801(-2);
		this.aClass104_Sub1_31.method3803(1);
		this.aClass104_Sub1_31.method3810(0.0F, 0.0F, 0.0F, arg2);
		this.aClass104_Sub1_31.method3837(34165, 34165);
		this.aClass104_Sub1_31.method3804(arg1);
		this.aClass104_Sub1_31.method3803(0);
		this.aClass104_Sub1_31.method3805(1);
		this.aClass104_Sub1_31.method3804(arg0);
		this.aClass104_Sub1_31.method20453(local5, (byte) 1);
		for (@Pc(100) int local100 = 0; local100 < 6; local100++) {
			@Pc(107) int local107 = local100 + 34069;
			local5.method23446(0, this.aClass88_Sub1_1.method1592(local107, 0));
			local5.method18026(0);
			if (!local5.method23453()) {
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
		local5.method23446(0, null);
		this.aClass104_Sub1_31.method20454(local5, -1497248091);
		this.aClass104_Sub1_31.method3803(1);
		this.aClass104_Sub1_31.method3804(null);
		this.aClass104_Sub1_31.method3837(8448, 8448);
		this.aClass104_Sub1_31.method3803(0);
		this.aClass104_Sub1_31.method3804(null);
		this.aClass104_Sub1_31.method20479(anIntArray206[0], anIntArray206[1], anIntArray206[2], anIntArray206[3]);
		this.aClass104_Sub1_31.method20475(anIntArray205[0], anIntArray205[1], anIntArray205[2], anIntArray205[3]);
		if (local1 && !this.aClass104_Sub1_31.aBoolean107) {
			this.aClass88_Sub1_1.method18055();
		}
		return local1;
	}

	@OriginalMember(owner = "client!apf", name = "k", descriptor = "(Lclient!adq;Lclient!adq;F)Z")
	boolean method17768(@OriginalArg(0) Class88_Sub1 arg0, @OriginalArg(1) Class88_Sub1 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class112_Sub1_Sub2 local5 = this.aClass104_Sub1_31.aClass112_Sub1_Sub2_1;
		this.aClass104_Sub1_31.method20482(anIntArray206);
		this.aClass104_Sub1_31.method20478();
		this.aClass104_Sub1_31.method20637(anIntArray205);
		this.aClass104_Sub1_31.method3775();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glViewport(0, 0, this.aClass88_Sub1_1.anInt290, this.aClass88_Sub1_1.anInt290);
		this.aClass104_Sub1_31.method3765(false);
		this.aClass104_Sub1_31.method3791(false);
		this.aClass104_Sub1_31.method3815(false);
		this.aClass104_Sub1_31.method3816(false);
		this.aClass104_Sub1_31.method3801(-2);
		this.aClass104_Sub1_31.method3803(1);
		this.aClass104_Sub1_31.method3810(0.0F, 0.0F, 0.0F, arg2);
		this.aClass104_Sub1_31.method3837(34165, 34165);
		this.aClass104_Sub1_31.method3804(arg1);
		this.aClass104_Sub1_31.method3803(0);
		this.aClass104_Sub1_31.method3805(1);
		this.aClass104_Sub1_31.method3804(arg0);
		this.aClass104_Sub1_31.method20453(local5, (byte) 1);
		for (@Pc(100) int local100 = 0; local100 < 6; local100++) {
			@Pc(107) int local107 = local100 + 34069;
			local5.method23446(0, this.aClass88_Sub1_1.method1592(local107, 0));
			local5.method18026(0);
			if (!local5.method23453()) {
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
		local5.method23446(0, null);
		this.aClass104_Sub1_31.method20454(local5, -1497248091);
		this.aClass104_Sub1_31.method3803(1);
		this.aClass104_Sub1_31.method3804(null);
		this.aClass104_Sub1_31.method3837(8448, 8448);
		this.aClass104_Sub1_31.method3803(0);
		this.aClass104_Sub1_31.method3804(null);
		this.aClass104_Sub1_31.method20479(anIntArray206[0], anIntArray206[1], anIntArray206[2], anIntArray206[3]);
		this.aClass104_Sub1_31.method20475(anIntArray205[0], anIntArray205[1], anIntArray205[2], anIntArray205[3]);
		if (local1 && !this.aClass104_Sub1_31.aBoolean107) {
			this.aClass88_Sub1_1.method18055();
		}
		return local1;
	}

	@OriginalMember(owner = "client!apf", name = "l", descriptor = "()I")
	int method17769() {
		return this.aClass88_Sub1_1.anInt290;
	}

	@OriginalMember(owner = "client!apf", name = "f", descriptor = "()I")
	int method17770() {
		return this.aClass88_Sub1_1.anInt290;
	}

	@OriginalMember(owner = "client!apf", name = "n", descriptor = "()Lclient!adq;")
	@Override
	Class88_Sub1 method17853() {
		return this.aClass88_Sub1_1;
	}

	@OriginalMember(owner = "client!apf", name = "p", descriptor = "(Lclient!adq;Lclient!adq;F)Z")
	boolean method17771(@OriginalArg(0) Class88_Sub1 arg0, @OriginalArg(1) Class88_Sub1 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class112_Sub1_Sub2 local5 = this.aClass104_Sub1_31.aClass112_Sub1_Sub2_1;
		this.aClass104_Sub1_31.method20482(anIntArray206);
		this.aClass104_Sub1_31.method20478();
		this.aClass104_Sub1_31.method20637(anIntArray205);
		this.aClass104_Sub1_31.method3775();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glViewport(0, 0, this.aClass88_Sub1_1.anInt290, this.aClass88_Sub1_1.anInt290);
		this.aClass104_Sub1_31.method3765(false);
		this.aClass104_Sub1_31.method3791(false);
		this.aClass104_Sub1_31.method3815(false);
		this.aClass104_Sub1_31.method3816(false);
		this.aClass104_Sub1_31.method3801(-2);
		this.aClass104_Sub1_31.method3803(1);
		this.aClass104_Sub1_31.method3810(0.0F, 0.0F, 0.0F, arg2);
		this.aClass104_Sub1_31.method3837(34165, 34165);
		this.aClass104_Sub1_31.method3804(arg1);
		this.aClass104_Sub1_31.method3803(0);
		this.aClass104_Sub1_31.method3805(1);
		this.aClass104_Sub1_31.method3804(arg0);
		this.aClass104_Sub1_31.method20453(local5, (byte) 1);
		for (@Pc(100) int local100 = 0; local100 < 6; local100++) {
			@Pc(107) int local107 = local100 + 34069;
			local5.method23446(0, this.aClass88_Sub1_1.method1592(local107, 0));
			local5.method18026(0);
			if (!local5.method23453()) {
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
		local5.method23446(0, null);
		this.aClass104_Sub1_31.method20454(local5, -1497248091);
		this.aClass104_Sub1_31.method3803(1);
		this.aClass104_Sub1_31.method3804(null);
		this.aClass104_Sub1_31.method3837(8448, 8448);
		this.aClass104_Sub1_31.method3803(0);
		this.aClass104_Sub1_31.method3804(null);
		this.aClass104_Sub1_31.method20479(anIntArray206[0], anIntArray206[1], anIntArray206[2], anIntArray206[3]);
		this.aClass104_Sub1_31.method20475(anIntArray205[0], anIntArray205[1], anIntArray205[2], anIntArray205[3]);
		if (local1 && !this.aClass104_Sub1_31.aBoolean107) {
			this.aClass88_Sub1_1.method18055();
		}
		return local1;
	}

	@OriginalMember(owner = "client!apf", name = "u", descriptor = "()I")
	int method17772() {
		return this.aClass88_Sub1_1.anInt290;
	}

	@OriginalMember(owner = "client!apf", name = "z", descriptor = "(Lclient!adq;Lclient!adq;F)Z")
	boolean method17773(@OriginalArg(0) Class88_Sub1 arg0, @OriginalArg(1) Class88_Sub1 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class112_Sub1_Sub2 local5 = this.aClass104_Sub1_31.aClass112_Sub1_Sub2_1;
		this.aClass104_Sub1_31.method20482(anIntArray206);
		this.aClass104_Sub1_31.method20478();
		this.aClass104_Sub1_31.method20637(anIntArray205);
		this.aClass104_Sub1_31.method3775();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glViewport(0, 0, this.aClass88_Sub1_1.anInt290, this.aClass88_Sub1_1.anInt290);
		this.aClass104_Sub1_31.method3765(false);
		this.aClass104_Sub1_31.method3791(false);
		this.aClass104_Sub1_31.method3815(false);
		this.aClass104_Sub1_31.method3816(false);
		this.aClass104_Sub1_31.method3801(-2);
		this.aClass104_Sub1_31.method3803(1);
		this.aClass104_Sub1_31.method3810(0.0F, 0.0F, 0.0F, arg2);
		this.aClass104_Sub1_31.method3837(34165, 34165);
		this.aClass104_Sub1_31.method3804(arg1);
		this.aClass104_Sub1_31.method3803(0);
		this.aClass104_Sub1_31.method3805(1);
		this.aClass104_Sub1_31.method3804(arg0);
		this.aClass104_Sub1_31.method20453(local5, (byte) 1);
		for (@Pc(100) int local100 = 0; local100 < 6; local100++) {
			@Pc(107) int local107 = local100 + 34069;
			local5.method23446(0, this.aClass88_Sub1_1.method1592(local107, 0));
			local5.method18026(0);
			if (!local5.method23453()) {
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
		local5.method23446(0, null);
		this.aClass104_Sub1_31.method20454(local5, -1497248091);
		this.aClass104_Sub1_31.method3803(1);
		this.aClass104_Sub1_31.method3804(null);
		this.aClass104_Sub1_31.method3837(8448, 8448);
		this.aClass104_Sub1_31.method3803(0);
		this.aClass104_Sub1_31.method3804(null);
		this.aClass104_Sub1_31.method20479(anIntArray206[0], anIntArray206[1], anIntArray206[2], anIntArray206[3]);
		this.aClass104_Sub1_31.method20475(anIntArray205[0], anIntArray205[1], anIntArray205[2], anIntArray205[3]);
		if (local1 && !this.aClass104_Sub1_31.aBoolean107) {
			this.aClass88_Sub1_1.method18055();
		}
		return local1;
	}

	@OriginalMember(owner = "client!apf", name = "e", descriptor = "()Lclient!adq;")
	@Override
	Class88_Sub1 method17852() {
		return this.aClass88_Sub1_1;
	}

	@OriginalMember(owner = "client!apf", name = "d", descriptor = "(Lclient!adq;Lclient!adq;F)Z")
	boolean method17774(@OriginalArg(0) Class88_Sub1 arg0, @OriginalArg(1) Class88_Sub1 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class112_Sub1_Sub2 local5 = this.aClass104_Sub1_31.aClass112_Sub1_Sub2_1;
		this.aClass104_Sub1_31.method20482(anIntArray206);
		this.aClass104_Sub1_31.method20478();
		this.aClass104_Sub1_31.method20637(anIntArray205);
		this.aClass104_Sub1_31.method3775();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glViewport(0, 0, this.aClass88_Sub1_1.anInt290, this.aClass88_Sub1_1.anInt290);
		this.aClass104_Sub1_31.method3765(false);
		this.aClass104_Sub1_31.method3791(false);
		this.aClass104_Sub1_31.method3815(false);
		this.aClass104_Sub1_31.method3816(false);
		this.aClass104_Sub1_31.method3801(-2);
		this.aClass104_Sub1_31.method3803(1);
		this.aClass104_Sub1_31.method3810(0.0F, 0.0F, 0.0F, arg2);
		this.aClass104_Sub1_31.method3837(34165, 34165);
		this.aClass104_Sub1_31.method3804(arg1);
		this.aClass104_Sub1_31.method3803(0);
		this.aClass104_Sub1_31.method3805(1);
		this.aClass104_Sub1_31.method3804(arg0);
		this.aClass104_Sub1_31.method20453(local5, (byte) 1);
		for (@Pc(100) int local100 = 0; local100 < 6; local100++) {
			@Pc(107) int local107 = local100 + 34069;
			local5.method23446(0, this.aClass88_Sub1_1.method1592(local107, 0));
			local5.method18026(0);
			if (!local5.method23453()) {
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
		local5.method23446(0, null);
		this.aClass104_Sub1_31.method20454(local5, -1497248091);
		this.aClass104_Sub1_31.method3803(1);
		this.aClass104_Sub1_31.method3804(null);
		this.aClass104_Sub1_31.method3837(8448, 8448);
		this.aClass104_Sub1_31.method3803(0);
		this.aClass104_Sub1_31.method3804(null);
		this.aClass104_Sub1_31.method20479(anIntArray206[0], anIntArray206[1], anIntArray206[2], anIntArray206[3]);
		this.aClass104_Sub1_31.method20475(anIntArray205[0], anIntArray205[1], anIntArray205[2], anIntArray205[3]);
		if (local1 && !this.aClass104_Sub1_31.aBoolean107) {
			this.aClass88_Sub1_1.method18055();
		}
		return local1;
	}

	@OriginalMember(owner = "client!apf", name = "c", descriptor = "(Lclient!adq;Lclient!adq;F)Z")
	boolean method17775(@OriginalArg(0) Class88_Sub1 arg0, @OriginalArg(1) Class88_Sub1 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class112_Sub1_Sub2 local5 = this.aClass104_Sub1_31.aClass112_Sub1_Sub2_1;
		this.aClass104_Sub1_31.method20482(anIntArray206);
		this.aClass104_Sub1_31.method20478();
		this.aClass104_Sub1_31.method20637(anIntArray205);
		this.aClass104_Sub1_31.method3775();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glViewport(0, 0, this.aClass88_Sub1_1.anInt290, this.aClass88_Sub1_1.anInt290);
		this.aClass104_Sub1_31.method3765(false);
		this.aClass104_Sub1_31.method3791(false);
		this.aClass104_Sub1_31.method3815(false);
		this.aClass104_Sub1_31.method3816(false);
		this.aClass104_Sub1_31.method3801(-2);
		this.aClass104_Sub1_31.method3803(1);
		this.aClass104_Sub1_31.method3810(0.0F, 0.0F, 0.0F, arg2);
		this.aClass104_Sub1_31.method3837(34165, 34165);
		this.aClass104_Sub1_31.method3804(arg1);
		this.aClass104_Sub1_31.method3803(0);
		this.aClass104_Sub1_31.method3805(1);
		this.aClass104_Sub1_31.method3804(arg0);
		this.aClass104_Sub1_31.method20453(local5, (byte) 1);
		for (@Pc(100) int local100 = 0; local100 < 6; local100++) {
			@Pc(107) int local107 = local100 + 34069;
			local5.method23446(0, this.aClass88_Sub1_1.method1592(local107, 0));
			local5.method18026(0);
			if (!local5.method23453()) {
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
		local5.method23446(0, null);
		this.aClass104_Sub1_31.method20454(local5, -1497248091);
		this.aClass104_Sub1_31.method3803(1);
		this.aClass104_Sub1_31.method3804(null);
		this.aClass104_Sub1_31.method3837(8448, 8448);
		this.aClass104_Sub1_31.method3803(0);
		this.aClass104_Sub1_31.method3804(null);
		this.aClass104_Sub1_31.method20479(anIntArray206[0], anIntArray206[1], anIntArray206[2], anIntArray206[3]);
		this.aClass104_Sub1_31.method20475(anIntArray205[0], anIntArray205[1], anIntArray205[2], anIntArray205[3]);
		if (local1 && !this.aClass104_Sub1_31.aBoolean107) {
			this.aClass88_Sub1_1.method18055();
		}
		return local1;
	}

	@OriginalMember(owner = "client!apf", name = "v", descriptor = "(Lclient!adq;Lclient!adq;F)Z")
	boolean method17776(@OriginalArg(0) Class88_Sub1 arg0, @OriginalArg(1) Class88_Sub1 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class112_Sub1_Sub2 local5 = this.aClass104_Sub1_31.aClass112_Sub1_Sub2_1;
		this.aClass104_Sub1_31.method20482(anIntArray206);
		this.aClass104_Sub1_31.method20478();
		this.aClass104_Sub1_31.method20637(anIntArray205);
		this.aClass104_Sub1_31.method3775();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glViewport(0, 0, this.aClass88_Sub1_1.anInt290, this.aClass88_Sub1_1.anInt290);
		this.aClass104_Sub1_31.method3765(false);
		this.aClass104_Sub1_31.method3791(false);
		this.aClass104_Sub1_31.method3815(false);
		this.aClass104_Sub1_31.method3816(false);
		this.aClass104_Sub1_31.method3801(-2);
		this.aClass104_Sub1_31.method3803(1);
		this.aClass104_Sub1_31.method3810(0.0F, 0.0F, 0.0F, arg2);
		this.aClass104_Sub1_31.method3837(34165, 34165);
		this.aClass104_Sub1_31.method3804(arg1);
		this.aClass104_Sub1_31.method3803(0);
		this.aClass104_Sub1_31.method3805(1);
		this.aClass104_Sub1_31.method3804(arg0);
		this.aClass104_Sub1_31.method20453(local5, (byte) 1);
		for (@Pc(100) int local100 = 0; local100 < 6; local100++) {
			@Pc(107) int local107 = local100 + 34069;
			local5.method23446(0, this.aClass88_Sub1_1.method1592(local107, 0));
			local5.method18026(0);
			if (!local5.method23453()) {
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
		local5.method23446(0, null);
		this.aClass104_Sub1_31.method20454(local5, -1497248091);
		this.aClass104_Sub1_31.method3803(1);
		this.aClass104_Sub1_31.method3804(null);
		this.aClass104_Sub1_31.method3837(8448, 8448);
		this.aClass104_Sub1_31.method3803(0);
		this.aClass104_Sub1_31.method3804(null);
		this.aClass104_Sub1_31.method20479(anIntArray206[0], anIntArray206[1], anIntArray206[2], anIntArray206[3]);
		this.aClass104_Sub1_31.method20475(anIntArray205[0], anIntArray205[1], anIntArray205[2], anIntArray205[3]);
		if (local1 && !this.aClass104_Sub1_31.aBoolean107) {
			this.aClass88_Sub1_1.method18055();
		}
		return local1;
	}
}
