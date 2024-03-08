package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ny")
public class class374 implements class645 {

	@ObfuscatedName("ny.e(Lxs;[IJ)Ljava/lang/String;")
	public String method5945(class646 arg0, int[] arg1, long arg2) {
		if (class646.field7941 == arg0) {
			EnumType var5 = (EnumType) Statics.field8514.get(arg1[0]);
			return var5.method14849((int) arg2);
		} else if (class646.field7924 == arg0 || class646.field7937 == arg0) {
			ObjType var6 = (ObjType) Statics.field1842.get((int) arg2);
			return var6.field8630;
		} else if (class646.field7927 == arg0 || class646.field7925 == arg0 || class646.field7928 == arg0 || class646.field7932 == arg0) {
			return ((EnumType) Statics.field8514.get(arg1[0])).method14849((int) arg2);
		} else {
			return null;
		}
	}
}
