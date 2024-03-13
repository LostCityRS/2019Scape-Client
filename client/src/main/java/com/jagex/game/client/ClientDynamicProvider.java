package com.jagex.game.client;

import com.jagex.game.config.enumtype.EnumType;
import com.jagex.game.config.objtype.ObjType;
import com.jagex.game.shared.framework.chat.QuickChatDynamicCommand;
import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ny")
public class ClientDynamicProvider implements QuickChatDynamicProvider {

	@ObfuscatedName("ny.e(Lxs;[IJ)Ljava/lang/String;")
	public String method5945(QuickChatDynamicCommand arg0, int[] arg1, long arg2) {
		if (QuickChatDynamicCommand.field7941 == arg0) {
			EnumType var5 = (EnumType) Statics.field8514.getById(arg1[0]);
			return var5.method14849((int) arg2);
		} else if (QuickChatDynamicCommand.field7924 == arg0 || QuickChatDynamicCommand.field7937 == arg0) {
			ObjType var6 = (ObjType) Statics.field1842.getById((int) arg2);
			return var6.name;
		} else if (QuickChatDynamicCommand.field7927 == arg0 || QuickChatDynamicCommand.field7925 == arg0 || QuickChatDynamicCommand.field7928 == arg0 || QuickChatDynamicCommand.field7932 == arg0) {
			return ((EnumType) Statics.field8514.getById(arg1[0])).method14849((int) arg2);
		} else {
			return null;
		}
	}
}
