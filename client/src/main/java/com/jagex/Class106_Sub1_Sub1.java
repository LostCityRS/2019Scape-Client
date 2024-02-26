package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!apn")
public final class Class106_Sub1_Sub1 extends Class106_Sub1 {

	@OriginalMember(owner = "client!apn", name = "e", descriptor = "[I")
	static final int[] anIntArray216 = new int[4];

	@OriginalMember(owner = "client!apn", name = "u", descriptor = "[I")
	static final int[] anIntArray217 = new int[4];

	@OriginalMember(owner = "client!apn", name = "t", descriptor = "Lclient!afm;")
	final Class102_Sub3 aClass102_Sub3_32;

	@OriginalMember(owner = "client!apn", name = "f", descriptor = "Lclient!adr;")
	Class84_Sub2 aClass84_Sub2_1;

	@OriginalMember(owner = "client!apn", name = "<init>", descriptor = "(Lclient!afm;I)V")
	Class106_Sub1_Sub1(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass102_Sub3_32 = arg0;
		this.aClass84_Sub2_1 = new Class84_Sub2(arg0, Class210.aClass210_24, Class236.aClass236_21, arg1);
	}

	@OriginalMember(owner = "client!apn", name = "a", descriptor = "(Lclient!adr;Lclient!adr;F)Z")
	boolean method18197(@OriginalArg(0) Class84_Sub2 arg0, @OriginalArg(1) Class84_Sub2 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class108_Sub1_Sub2 local5 = this.aClass102_Sub3_32.aClass108_Sub1_Sub2_1;
		this.aClass102_Sub3_32.method20713(anIntArray216);
		this.aClass102_Sub3_32.method20877();
		this.aClass102_Sub3_32.method20707(anIntArray217);
		this.aClass102_Sub3_32.method6356();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glViewport(0, 0, this.aClass84_Sub2_1.anInt300, this.aClass84_Sub2_1.anInt300);
		this.aClass102_Sub3_32.method6424(false);
		this.aClass102_Sub3_32.method6429(false);
		this.aClass102_Sub3_32.method6399(false);
		this.aClass102_Sub3_32.method6545(false);
		this.aClass102_Sub3_32.method6384(-2);
		this.aClass102_Sub3_32.method6386(1);
		this.aClass102_Sub3_32.method6393(0.0F, 0.0F, 0.0F, arg2);
		this.aClass102_Sub3_32.method6389(34165, 34165);
		this.aClass102_Sub3_32.method6339(arg1);
		this.aClass102_Sub3_32.method6386(0);
		this.aClass102_Sub3_32.method6543(1);
		this.aClass102_Sub3_32.method6339(arg0);
		this.aClass102_Sub3_32.method20684(local5, 1537997511);
		for (@Pc(100) int local100 = 0; local100 < 6; local100++) {
			@Pc(107) int local107 = local100 + 34069;
			local5.method23903(0, this.aClass84_Sub2_1.method1739(local107, 0));
			local5.method18461(0);
			if (!local5.method23897()) {
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
		local5.method23903(0, null);
		this.aClass102_Sub3_32.method20887(local5, (byte) 1);
		this.aClass102_Sub3_32.method6386(1);
		this.aClass102_Sub3_32.method6339(null);
		this.aClass102_Sub3_32.method6389(8448, 8448);
		this.aClass102_Sub3_32.method6386(0);
		this.aClass102_Sub3_32.method6339(null);
		this.aClass102_Sub3_32.method20986(anIntArray216[0], anIntArray216[1], anIntArray216[2], anIntArray216[3]);
		this.aClass102_Sub3_32.method20706(anIntArray217[0], anIntArray217[1], anIntArray217[2], anIntArray217[3]);
		if (local1 && !this.aClass102_Sub3_32.aBoolean139) {
			this.aClass84_Sub2_1.method18319();
		}
		return local1;
	}

	@OriginalMember(owner = "client!apn", name = "l", descriptor = "()Lclient!adr;")
	@Override
	Class84_Sub2 method18211() {
		return this.aClass84_Sub2_1;
	}

	@OriginalMember(owner = "client!apn", name = "t", descriptor = "()Lclient!adr;")
	@Override
	Class84_Sub2 method18209() {
		return this.aClass84_Sub2_1;
	}

	@OriginalMember(owner = "client!apn", name = "i", descriptor = "(Lclient!adr;Lclient!adr;F)Z")
	boolean method18198(@OriginalArg(0) Class84_Sub2 arg0, @OriginalArg(1) Class84_Sub2 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class108_Sub1_Sub2 local5 = this.aClass102_Sub3_32.aClass108_Sub1_Sub2_1;
		this.aClass102_Sub3_32.method20713(anIntArray216);
		this.aClass102_Sub3_32.method20877();
		this.aClass102_Sub3_32.method20707(anIntArray217);
		this.aClass102_Sub3_32.method6356();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glViewport(0, 0, this.aClass84_Sub2_1.anInt300, this.aClass84_Sub2_1.anInt300);
		this.aClass102_Sub3_32.method6424(false);
		this.aClass102_Sub3_32.method6429(false);
		this.aClass102_Sub3_32.method6399(false);
		this.aClass102_Sub3_32.method6545(false);
		this.aClass102_Sub3_32.method6384(-2);
		this.aClass102_Sub3_32.method6386(1);
		this.aClass102_Sub3_32.method6393(0.0F, 0.0F, 0.0F, arg2);
		this.aClass102_Sub3_32.method6389(34165, 34165);
		this.aClass102_Sub3_32.method6339(arg1);
		this.aClass102_Sub3_32.method6386(0);
		this.aClass102_Sub3_32.method6543(1);
		this.aClass102_Sub3_32.method6339(arg0);
		this.aClass102_Sub3_32.method20684(local5, 493546796);
		for (@Pc(100) int local100 = 0; local100 < 6; local100++) {
			@Pc(107) int local107 = local100 + 34069;
			local5.method23903(0, this.aClass84_Sub2_1.method1739(local107, 0));
			local5.method18461(0);
			if (!local5.method23897()) {
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
		local5.method23903(0, null);
		this.aClass102_Sub3_32.method20887(local5, (byte) 1);
		this.aClass102_Sub3_32.method6386(1);
		this.aClass102_Sub3_32.method6339(null);
		this.aClass102_Sub3_32.method6389(8448, 8448);
		this.aClass102_Sub3_32.method6386(0);
		this.aClass102_Sub3_32.method6339(null);
		this.aClass102_Sub3_32.method20986(anIntArray216[0], anIntArray216[1], anIntArray216[2], anIntArray216[3]);
		this.aClass102_Sub3_32.method20706(anIntArray217[0], anIntArray217[1], anIntArray217[2], anIntArray217[3]);
		if (local1 && !this.aClass102_Sub3_32.aBoolean139) {
			this.aClass84_Sub2_1.method18319();
		}
		return local1;
	}

	@OriginalMember(owner = "client!apn", name = "f", descriptor = "()Lclient!adr;")
	@Override
	Class84_Sub2 method18210() {
		return this.aClass84_Sub2_1;
	}

	@OriginalMember(owner = "client!apn", name = "g", descriptor = "()I")
	int method18199() {
		return this.aClass84_Sub2_1.anInt300;
	}

	@OriginalMember(owner = "client!apn", name = "e", descriptor = "()Lclient!adr;")
	@Override
	Class84_Sub2 method18208() {
		return this.aClass84_Sub2_1;
	}

	@OriginalMember(owner = "client!apn", name = "u", descriptor = "()Lclient!adr;")
	@Override
	Class84_Sub2 method18212() {
		return this.aClass84_Sub2_1;
	}

	@OriginalMember(owner = "client!apn", name = "m", descriptor = "()I")
	int method18200() {
		return this.aClass84_Sub2_1.anInt300;
	}

	@OriginalMember(owner = "client!apn", name = "o", descriptor = "()I")
	int method18201() {
		return this.aClass84_Sub2_1.anInt300;
	}

	@OriginalMember(owner = "client!apn", name = "j", descriptor = "(Lclient!adr;Lclient!adr;F)Z")
	boolean method18202(@OriginalArg(0) Class84_Sub2 arg0, @OriginalArg(1) Class84_Sub2 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class108_Sub1_Sub2 local5 = this.aClass102_Sub3_32.aClass108_Sub1_Sub2_1;
		this.aClass102_Sub3_32.method20713(anIntArray216);
		this.aClass102_Sub3_32.method20877();
		this.aClass102_Sub3_32.method20707(anIntArray217);
		this.aClass102_Sub3_32.method6356();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glViewport(0, 0, this.aClass84_Sub2_1.anInt300, this.aClass84_Sub2_1.anInt300);
		this.aClass102_Sub3_32.method6424(false);
		this.aClass102_Sub3_32.method6429(false);
		this.aClass102_Sub3_32.method6399(false);
		this.aClass102_Sub3_32.method6545(false);
		this.aClass102_Sub3_32.method6384(-2);
		this.aClass102_Sub3_32.method6386(1);
		this.aClass102_Sub3_32.method6393(0.0F, 0.0F, 0.0F, arg2);
		this.aClass102_Sub3_32.method6389(34165, 34165);
		this.aClass102_Sub3_32.method6339(arg1);
		this.aClass102_Sub3_32.method6386(0);
		this.aClass102_Sub3_32.method6543(1);
		this.aClass102_Sub3_32.method6339(arg0);
		this.aClass102_Sub3_32.method20684(local5, 2077758108);
		for (@Pc(100) int local100 = 0; local100 < 6; local100++) {
			@Pc(107) int local107 = local100 + 34069;
			local5.method23903(0, this.aClass84_Sub2_1.method1739(local107, 0));
			local5.method18461(0);
			if (!local5.method23897()) {
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
		local5.method23903(0, null);
		this.aClass102_Sub3_32.method20887(local5, (byte) 1);
		this.aClass102_Sub3_32.method6386(1);
		this.aClass102_Sub3_32.method6339(null);
		this.aClass102_Sub3_32.method6389(8448, 8448);
		this.aClass102_Sub3_32.method6386(0);
		this.aClass102_Sub3_32.method6339(null);
		this.aClass102_Sub3_32.method20986(anIntArray216[0], anIntArray216[1], anIntArray216[2], anIntArray216[3]);
		this.aClass102_Sub3_32.method20706(anIntArray217[0], anIntArray217[1], anIntArray217[2], anIntArray217[3]);
		if (local1 && !this.aClass102_Sub3_32.aBoolean139) {
			this.aClass84_Sub2_1.method18319();
		}
		return local1;
	}
}
