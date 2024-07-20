package com.jagex.game.client;

import com.jagex.game.config.enumtype.EnumType;
import com.jagex.game.config.objtype.ObjType;
import com.jagex.game.shared.framework.chat.QuickChatDynamicCommand;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("ny")
public class ClientDynamicProvider implements QuickChatDynamicProvider {

	@ObfuscatedName("ny.e(Lxs;[IJ)Ljava/lang/String;")
	public String method5945(QuickChatDynamicCommand arg0, int[] arg1, long arg2) {
		if (QuickChatDynamicCommand.LISTDIALOG == arg0) {
			EnumType var5 = (EnumType) Client.enumTypeList.list(arg1[0]);
			return var5.getValueString((int) arg2);
		} else if (QuickChatDynamicCommand.OBJDIALOG == arg0 || QuickChatDynamicCommand.OBJTRADEDIALOG == arg0) {
			ObjType var6 = (ObjType) Client.objTypeList.list((int) arg2);
			return var6.name;
		} else if (QuickChatDynamicCommand.ENUM_STRING == arg0 || QuickChatDynamicCommand.ENUM_STRING_VARBIT == arg0 || QuickChatDynamicCommand.ENUM_STRING_CLAN == arg0 || QuickChatDynamicCommand.ENUM_STRING_STATBASE == arg0) {
			return ((EnumType) Client.enumTypeList.list(arg1[0])).getValueString((int) arg2);
		} else {
			return null;
		}
	}
}
