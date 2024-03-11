package com.jagex;

import com.jagex.game.config.enumtype.EnumType;
import com.jagex.game.config.objtype.ObjType;
import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ny")
public class ClientDynamicProvider implements QuickChatDynamicProvider {

	@ObfuscatedName("ny.e(Lxs;[IJ)Ljava/lang/String;")
	public String method5945(QuickChatDynamicCommand arg0, int[] arg1, long arg2) {
		if (QuickChatDynamicCommand.field7941 == arg0) {
			EnumType var5 = (EnumType) Statics.field8514.get(arg1[0]);
			return var5.method14849((int) arg2);
		} else if (QuickChatDynamicCommand.field7924 == arg0 || QuickChatDynamicCommand.field7937 == arg0) {
			ObjType var6 = (ObjType) Statics.field1842.get((int) arg2);
			return var6.field8630;
		} else if (QuickChatDynamicCommand.field7927 == arg0 || QuickChatDynamicCommand.field7925 == arg0 || QuickChatDynamicCommand.field7928 == arg0 || QuickChatDynamicCommand.field7932 == arg0) {
			return ((EnumType) Statics.field8514.get(arg1[0])).method14849((int) arg2);
		} else {
			return null;
		}
	}
}
