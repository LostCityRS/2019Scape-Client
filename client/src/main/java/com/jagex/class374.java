package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ny")
public class class374 implements class645 {

	@ObfuscatedName("ny.e(Lxs;[IJ)Ljava/lang/String;")
	public String method5945(class646 arg0, int[] arg1, long arg2) {
		if (class646.field7941 == arg0) {
			class754 var5 = (class754) Statics.field8514.method962(arg1[0]);
			return var5.method14849((int) arg2);
		} else if (class646.field7924 == arg0 || class646.field7937 == arg0) {
			class738 var6 = (class738) Statics.field1842.method962((int) arg2);
			return var6.field8630;
		} else if (class646.field7927 == arg0 || class646.field7925 == arg0 || class646.field7928 == arg0 || class646.field7932 == arg0) {
			return ((class754) Statics.field8514.method962(arg1[0])).method14849((int) arg2);
		} else {
			return null;
		}
	}
}
