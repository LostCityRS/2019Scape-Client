package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aon")
public class Class32_Sub12 extends Class32 {

	@OriginalMember(owner = "client!aon", name = "<init>", descriptor = "(Lclient!zd;Lclient!zt;ZLclient!ao;Lclient!py;Lclient!py;)V", line = 19)
	public Class32_Sub12(@OriginalArg(0) Class702 arg0, @OriginalArg(1) Class717 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Interface11 arg3, @OriginalArg(4) Class497 arg4, @OriginalArg(5) Class497 arg5) {
		super(arg0, arg1, arg4, Class667.aClass667_42, 64, new Class44_Sub1(arg0, arg1, arg2, arg5, arg3));
	}

	@OriginalMember(owner = "client!aon", name = "al", descriptor = "(Lclient!dh;IIIIILclient!xg;I)Lclient!cm;", line = 23)
	public Class100 method17069(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class658 arg6, @OriginalArg(7) int arg7) {
		return ((Class44) this.anInterface4_25).method17411(arg0, arg1, arg2, arg3, arg4, arg5, arg6, -1994596950);
	}

	@OriginalMember(owner = "client!aon", name = "at", descriptor = "(Lclient!dh;Lclient!dh;IIIIZZILclient!eu;Lclient!xg;Lclient!ws;)Lclient!cm;", line = 27)
	public Class100 method17070(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class106 arg9, @OriginalArg(10) Class658 arg10, @OriginalArg(11) Class645 arg11) {
		return ((Class44) this.anInterface4_25).method17413(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, this, 1318153810);
	}

	@OriginalMember(owner = "client!aon", name = "ac", descriptor = "(Lclient!dh;Lclient!dh;IIIIZZILclient!eu;Lclient!xg;Lclient!ws;S)Lclient!cm;", line = 27)
	public Class100 method17071(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class106 arg9, @OriginalArg(10) Class658 arg10, @OriginalArg(11) Class645 arg11, @OriginalArg(12) short arg12) {
		return ((Class44) this.anInterface4_25).method17413(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, this, 1318153810);
	}

	@OriginalMember(owner = "client!aon", name = "ai", descriptor = "(ZI)V", line = 31)
	public void setMembers(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		((Class44) this.anInterface4_25).method17415(arg0, (byte) 1);
		super.method17810(420243345);
	}

	@OriginalMember(owner = "client!aon", name = "ad", descriptor = "(Z)V", line = 31)
	public void method17073(@OriginalArg(0) boolean arg0) {
		((Class44) this.anInterface4_25).method17415(arg0, (byte) 1);
		super.method17810(1187196327);
	}

	@OriginalMember(owner = "client!aon", name = "am", descriptor = "(Z)V", line = 31)
	public void method17074(@OriginalArg(0) boolean arg0) {
		((Class44) this.anInterface4_25).method17415(arg0, (byte) 1);
		super.method17810(-674634172);
	}

	@OriginalMember(owner = "client!aon", name = "aw", descriptor = "(II)V", line = 36)
	public void method17075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		((Class44) this.anInterface4_25).method17417(arg0, -1977861886);
	}

	@OriginalMember(owner = "client!aon", name = "ar", descriptor = "(I)V", line = 36)
	public void method17076(@OriginalArg(0) int arg0) {
		((Class44) this.anInterface4_25).method17417(arg0, -1420664360);
	}

	@OriginalMember(owner = "client!aon", name = "au", descriptor = "(I)V", line = 36)
	public void method17077(@OriginalArg(0) int arg0) {
		((Class44) this.anInterface4_25).method17417(arg0, 1404355947);
	}

	@OriginalMember(owner = "client!aon", name = "b", descriptor = "()V", line = 40)
	@Override
	public void method17809() {
		super.method17810(-177156337);
		((Class44) this.anInterface4_25).method17419(-1160906052);
	}

	@OriginalMember(owner = "client!aon", name = "s", descriptor = "()V", line = 40)
	@Override
	public void method17811() {
		super.method17810(-1997868214);
		((Class44) this.anInterface4_25).method17419(-1590172935);
	}

	@OriginalMember(owner = "client!aon", name = "x", descriptor = "()V", line = 40)
	@Override
	public void method17814() {
		super.method17810(-463444785);
		((Class44) this.anInterface4_25).method17419(-912630079);
	}

	@OriginalMember(owner = "client!aon", name = "q", descriptor = "()V", line = 40)
	@Override
	public void method17813() {
		super.method17810(-1726763716);
		((Class44) this.anInterface4_25).method17419(-1444004226);
	}

	@OriginalMember(owner = "client!aon", name = "h", descriptor = "()V", line = 40)
	@Override
	public void method17815() {
		super.method17810(-214424700);
		((Class44) this.anInterface4_25).method17419(-1792251556);
	}

	@OriginalMember(owner = "client!aon", name = "y", descriptor = "()V", line = 40)
	@Override
	public void method17812() {
		super.method17810(1381260073);
		((Class44) this.anInterface4_25).method17419(-1510593333);
	}

	@OriginalMember(owner = "client!aon", name = "r", descriptor = "(I)V", line = 40)
	@Override
	public void method17810(@OriginalArg(0) int arg0) {
		super.method17810(-425988288);
		((Class44) this.anInterface4_25).method17419(-1278734807);
	}

	@OriginalMember(owner = "client!aon", name = "as", descriptor = "(I)V", line = 45)
	public void method17078(@OriginalArg(0) int arg0) {
		((Class44) this.anInterface4_25).method17422(1162764107);
	}

	@OriginalMember(owner = "client!aon", name = "ap", descriptor = "()V", line = 45)
	public void method17079() {
		((Class44) this.anInterface4_25).method17422(-1090501103);
	}

	@OriginalMember(owner = "client!aon", name = "aq", descriptor = "()V", line = 45)
	public void method17080() {
		((Class44) this.anInterface4_25).method17422(1675430498);
	}

	@OriginalMember(owner = "client!aon", name = "j", descriptor = "(I)V", line = 49)
	@Override
	public void method17820(@OriginalArg(0) int arg0) {
		super.method17817(arg0, -1506441320);
		((Class44) this.anInterface4_25).method17424(arg0, (byte) 79);
	}

	@OriginalMember(owner = "client!aon", name = "v", descriptor = "(II)V", line = 49)
	@Override
	public void method17817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method17817(arg0, -1747344071);
		((Class44) this.anInterface4_25).method17424(arg0, (byte) 16);
	}

	@OriginalMember(owner = "client!aon", name = "a", descriptor = "(I)V", line = 49)
	@Override
	public void method17821(@OriginalArg(0) int arg0) {
		super.method17817(arg0, -1529262984);
		((Class44) this.anInterface4_25).method17424(arg0, (byte) -11);
	}

	@OriginalMember(owner = "client!aon", name = "g", descriptor = "(I)V", line = 49)
	@Override
	public void method17818(@OriginalArg(0) int arg0) {
		super.method17817(arg0, -1899907941);
		((Class44) this.anInterface4_25).method17424(arg0, (byte) 1);
	}

	@OriginalMember(owner = "client!aon", name = "i", descriptor = "(I)V", line = 49)
	@Override
	public void method17819(@OriginalArg(0) int arg0) {
		super.method17817(arg0, -1913788081);
		((Class44) this.anInterface4_25).method17424(arg0, (byte) -39);
	}

	@OriginalMember(owner = "client!aon", name = "o", descriptor = "(I)V", line = 54)
	@Override
	public void method17822(@OriginalArg(0) int arg0) {
		super.method17822(1724311617);
		((Class44) this.anInterface4_25).method17426(-616875112);
	}

	@OriginalMember(owner = "client!aon", name = "t", descriptor = "()V", line = 54)
	@Override
	public void method17823() {
		super.method17822(365852144);
		((Class44) this.anInterface4_25).method17426(-616875112);
	}
}
