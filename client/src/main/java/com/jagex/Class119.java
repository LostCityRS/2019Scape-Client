package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public abstract class Class119 {

	@OriginalMember(owner = "client!je", name = "t", descriptor = "I")
	static final int anInt1106 = 4;

	@OriginalMember(owner = "client!je", name = "l", descriptor = "Lclient!lb;")
	public Interface34 anInterface34_8;

	@OriginalMember(owner = "client!je", name = "v", descriptor = "I")
	public int anInt1105;

	@OriginalMember(owner = "client!je", name = "j", descriptor = "F")
	protected float aFloat84;

	@OriginalMember(owner = "client!je", name = "o", descriptor = "F")
	protected float aFloat85;

	@OriginalMember(owner = "client!je", name = "g", descriptor = "Lclient!ml;")
	public Interface42 anInterface42_3;

	@OriginalMember(owner = "client!je", name = "z", descriptor = "I")
	public int anInt1107;

	@OriginalMember(owner = "client!je", name = "p", descriptor = "I")
	public int anInt1108;

	@OriginalMember(owner = "client!je", name = "y", descriptor = "I")
	public int anInt1109;

	@OriginalMember(owner = "client!je", name = "e", descriptor = "[F")
	public float[] aFloatArray37 = new float[16];

	@OriginalMember(owner = "client!je", name = "u", descriptor = "[F")
	public float[] aFloatArray38 = new float[16];

	@OriginalMember(owner = "client!je", name = "i", descriptor = "Lclient!pm;")
	public final Class487 aClass487_35 = new Class487();

	@OriginalMember(owner = "client!je", name = "m", descriptor = "Lclient!on;")
	public final Class463 aClass463_18 = new Class463();

	@OriginalMember(owner = "client!je", name = "a", descriptor = "Lclient!ob;")
	public final Class456 aClass456_5 = new Class456();

	@OriginalMember(owner = "client!je", name = "s", descriptor = "Lclient!on;")
	public final Class463 aClass463_20 = new Class463();

	@OriginalMember(owner = "client!je", name = "k", descriptor = "Lclient!ob;")
	public final Class456 aClass456_6 = new Class456();

	@OriginalMember(owner = "client!je", name = "x", descriptor = "Lclient!on;")
	public final Class463 aClass463_19 = new Class463();

	@OriginalMember(owner = "client!je", name = "w", descriptor = "Lclient!on;")
	public final Class463 aClass463_17 = new Class463();

	@OriginalMember(owner = "client!je", name = "r", descriptor = "Lclient!on;")
	public final Class463 aClass463_22 = new Class463();

	@OriginalMember(owner = "client!je", name = "q", descriptor = "Lclient!on;")
	public final Class463 aClass463_16 = new Class463();

	@OriginalMember(owner = "client!je", name = "h", descriptor = "Lclient!on;")
	public final Class463 aClass463_21 = new Class463();

	@OriginalMember(owner = "client!je", name = "d", descriptor = "Lclient!pm;")
	public final Class487 aClass487_36 = new Class487();

	@OriginalMember(owner = "client!je", name = "f", descriptor = "Lclient!afa;")
	protected Class102_Sub1 aClass102_Sub1_8;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!afa;)V")
	Class119(@OriginalArg(0) Class102_Sub1 arg0) {
		this.aClass102_Sub1_8 = arg0;
	}

	@OriginalMember(owner = "client!je", name = "f", descriptor = "(Lclient!pm;)V")
	public abstract void method9392(@OriginalArg(0) Class487 arg0);

	@OriginalMember(owner = "client!je", name = "t", descriptor = "(B)V")
	public final void method9393(@OriginalArg(0) byte arg0) {
		switch(arg0) {
			case 1:
				this.aFloat85 = 32.0F;
				this.aFloat84 = 0.0F;
				break;
			case 2:
				this.aFloat85 = 4.0F;
				this.aFloat84 = 0.0F;
				break;
			case 3:
				this.aFloat85 = 1.0F;
				this.aFloat84 = 0.0F;
		}
	}

	@OriginalMember(owner = "client!je", name = "i", descriptor = "()V")
	public abstract void method9394();

	@OriginalMember(owner = "client!je", name = "n", descriptor = "()V")
	public abstract void method9395();

	@OriginalMember(owner = "client!je", name = "u", descriptor = "(I)V")
	public abstract void method9396(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!je", name = "h", descriptor = "(I)V")
	public abstract void method9397(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!je", name = "x", descriptor = "(I)V")
	public abstract void method9398(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!je", name = "m", descriptor = "()V")
	public abstract void method9399();

	@OriginalMember(owner = "client!je", name = "o", descriptor = "(Z)V")
	public abstract void method9400(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!je", name = "j", descriptor = "(I)V")
	public abstract void method9401(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public abstract void method9402(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!je", name = "s", descriptor = "(I)V")
	public abstract void method9403(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!je", name = "l", descriptor = "(I)V")
	public abstract void method9404(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!je", name = "aq", descriptor = "(Lclient!pm;)V")
	public abstract void method9405(@OriginalArg(0) Class487 arg0);

	@OriginalMember(owner = "client!je", name = "k", descriptor = "(I)V")
	public abstract void method9406(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!je", name = "r", descriptor = "(I)V")
	public abstract void method9407(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!je", name = "q", descriptor = "(I)V")
	public abstract void method9408(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!je", name = "g", descriptor = "(I)V")
	public abstract void method9409(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!je", name = "e", descriptor = "(Z)V")
	public abstract void method9410(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!je", name = "z", descriptor = "()V")
	public abstract void method9411();

	@OriginalMember(owner = "client!je", name = "p", descriptor = "()V")
	public abstract void method9412();

	@OriginalMember(owner = "client!je", name = "v", descriptor = "()V")
	public abstract void method9413();

	@OriginalMember(owner = "client!je", name = "y", descriptor = "()V")
	public abstract void method9414();

	@OriginalMember(owner = "client!je", name = "d", descriptor = "()V")
	public abstract void method9415();

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(B)V")
	public final void method9416(@OriginalArg(0) byte arg0) {
		switch(arg0) {
			case 1:
				this.aFloat85 = 32.0F;
				this.aFloat84 = 0.0F;
				break;
			case 2:
				this.aFloat85 = 4.0F;
				this.aFloat84 = 0.0F;
				break;
			case 3:
				this.aFloat85 = 1.0F;
				this.aFloat84 = 0.0F;
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(Lclient!pm;)V")
	public abstract void method9417(@OriginalArg(0) Class487 arg0);

	@OriginalMember(owner = "client!je", name = "ax", descriptor = "(Lclient!pm;)V")
	public abstract void method9418(@OriginalArg(0) Class487 arg0);

	@OriginalMember(owner = "client!je", name = "ay", descriptor = "(Lclient!pm;)V")
	public abstract void method9419(@OriginalArg(0) Class487 arg0);

	@OriginalMember(owner = "client!je", name = "ai", descriptor = "(Lclient!pm;)V")
	public abstract void method9420(@OriginalArg(0) Class487 arg0);

	@OriginalMember(owner = "client!je", name = "w", descriptor = "(I)V")
	public abstract void method9421(@OriginalArg(0) int arg0);
}
