package com.jagex.game.client;

import com.jagex.game.config.paramtype.ParamType;
import com.jagex.game.config.questtype.QuestType;
import com.jagex.game.script.ClientScriptState;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("yr")
public final class QuestCommands {

	public QuestCommands() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("nt.e(Lyf;I)V")
	public static void quest_getname(ClientScriptState arg0) {
		arg0.objectStack[++arg0.osp - 1] = ((QuestType) Client.questTypeList.list(arg0.intStack[--arg0.isp])).name;
	}

	@ObfuscatedName("ix.n(Lyf;B)V")
	public static void quest_getsortname(ClientScriptState arg0) {
		arg0.objectStack[++arg0.osp - 1] = ((QuestType) Client.questTypeList.list(arg0.intStack[--arg0.isp])).sortname;
	}

	@ObfuscatedName("kd.m(Lyf;S)V")
	public static void quest_type(ClientScriptState arg0) {
		arg0.intStack[arg0.isp - 1] = ((QuestType) Client.questTypeList.list(arg0.intStack[arg0.isp - 1])).type;
	}

	@ObfuscatedName("af.k(Lyf;I)V")
	public static void quest_getdifficulty(ClientScriptState arg0) {
		arg0.intStack[arg0.isp - 1] = ((QuestType) Client.questTypeList.list(arg0.intStack[arg0.isp - 1])).difficulty;
	}

	@ObfuscatedName("kd.f(Lyf;I)V")
	public static void quest_getmembers(ClientScriptState arg0) {
		arg0.intStack[arg0.isp - 1] = ((QuestType) Client.questTypeList.list(arg0.intStack[arg0.isp - 1])).members ? 1 : 0;
	}

	@ObfuscatedName("akw.w(Lyf;B)V")
	public static void quest_points(ClientScriptState arg0) {
		arg0.intStack[arg0.isp - 1] = ((QuestType) Client.questTypeList.list(arg0.intStack[arg0.isp - 1])).points;
	}

	@ObfuscatedName("g.l(Lyf;I)V")
	public static void quest_questreq_count(ClientScriptState arg0) {
		QuestType var1 = (QuestType) Client.questTypeList.list(arg0.intStack[--arg0.isp]);
		arg0.intStack[++arg0.isp - 1] = var1.questrequirements == null ? 0 : var1.questrequirements.length;
	}

	@ObfuscatedName("du.u(Lyf;I)V")
	public static void quest_questreq(ClientScriptState arg0) {
		arg0.intStack[arg0.isp - 2] = ((QuestType) Client.questTypeList.list(arg0.intStack[arg0.isp - 2])).questrequirements[arg0.intStack[arg0.isp - 1]];
		arg0.isp--;
	}

	@ObfuscatedName("anr.z(Lyf;I)V")
	public static void quest_questreq_met(ClientScriptState arg0) {
		arg0.intStack[arg0.isp - 2] = ((QuestType) Client.questTypeList.list(arg0.intStack[arg0.isp - 2])).questRequirementMet(Client.localPlayerGameState, arg0.intStack[arg0.isp - 1]) ? 1 : 0;
		arg0.isp--;
	}

	@ObfuscatedName("mb.p(Lyf;I)V")
	public static void quest_pointsreq(ClientScriptState arg0) {
		arg0.intStack[arg0.isp - 1] = ((QuestType) Client.questTypeList.list(arg0.intStack[arg0.isp - 1])).pointsrequirement;
	}

	@ObfuscatedName("et.d(Lyf;I)V")
	public static void quest_pointsreq_met(ClientScriptState arg0) {
		arg0.intStack[arg0.isp - 1] = ((QuestType) Client.questTypeList.list(arg0.intStack[arg0.isp - 1])).pointsRequirementMet(Client.localPlayerGameState) ? 1 : 0;
	}

	@ObfuscatedName("ny.c(Lyf;I)V")
	public static void quest_statreq_count(ClientScriptState arg0) {
		QuestType var1 = (QuestType) Client.questTypeList.list(arg0.intStack[--arg0.isp]);
		arg0.intStack[++arg0.isp - 1] = var1.statRequirements == null ? 0 : var1.statRequirements.length;
	}

	@ObfuscatedName("ec.r(Lyf;I)V")
	public static void quest_statreq_stat(ClientScriptState arg0) {
		arg0.intStack[arg0.isp - 2] = ((QuestType) Client.questTypeList.list(arg0.intStack[arg0.isp - 2])).statRequirements[arg0.intStack[arg0.isp - 1]][0];
		arg0.isp--;
	}

	@ObfuscatedName("ic.v(Lyf;I)V")
	public static void quest_statreq_level(ClientScriptState arg0) {
		arg0.intStack[arg0.isp - 2] = ((QuestType) Client.questTypeList.list(arg0.intStack[arg0.isp - 2])).statRequirements[arg0.intStack[arg0.isp - 1]][1];
		arg0.isp--;
	}

	@ObfuscatedName("e.o(Lyf;I)V")
	public static void quest_statreq_met(ClientScriptState arg0) {
		arg0.intStack[arg0.isp - 2] = ((QuestType) Client.questTypeList.list(arg0.intStack[arg0.isp - 2])).statRequirementMet(Client.localPlayerGameState, arg0.intStack[arg0.isp - 1]) ? 1 : 0;
		arg0.isp--;
	}

	@ObfuscatedName("ez.s(Lyf;I)V")
	public static void quest_varpreq_count(ClientScriptState arg0) {
		QuestType var1 = (QuestType) Client.questTypeList.list(arg0.intStack[--arg0.isp]);
		arg0.intStack[++arg0.isp - 1] = var1.varpsRequirement == null ? 0 : var1.varpsRequirement.length;
	}

	@ObfuscatedName("et.y(Lyf;I)V")
	public static void quest_varpreq_desc(ClientScriptState arg0) {
		arg0.objectStack[++arg0.osp - 1] = ((QuestType) Client.questTypeList.list(arg0.intStack[arg0.isp - 2])).varpsDescriptions[arg0.intStack[arg0.isp - 1]];
		arg0.isp -= 2;
	}

	@ObfuscatedName("ab.q(Lyf;B)V")
	public static void quest_varpreq_met(ClientScriptState arg0) {
		arg0.intStack[arg0.isp - 2] = ((QuestType) Client.questTypeList.list(arg0.intStack[arg0.isp - 2])).varpsRequirementMet(Client.localPlayerGameState, arg0.intStack[arg0.isp - 1]) ? 1 : 0;
		arg0.isp--;
	}

	@ObfuscatedName("xo.x(Lyf;B)V")
	public static void quest_varbitreq_count(ClientScriptState arg0) {
		QuestType var1 = (QuestType) Client.questTypeList.list(arg0.intStack[--arg0.isp]);
		arg0.intStack[++arg0.isp - 1] = var1.varbitsRequirement == null ? 0 : var1.varbitsRequirement.length;
	}

	@ObfuscatedName("wc.b(Lyf;S)V")
	public static void quest_varbitreq_desc(ClientScriptState arg0) {
		arg0.objectStack[++arg0.osp - 1] = ((QuestType) Client.questTypeList.list(arg0.intStack[arg0.isp - 2])).varbitsDescriptions[arg0.intStack[arg0.isp - 1]];
		arg0.isp -= 2;
	}

	@ObfuscatedName("rp.h(Lyf;I)V")
	public static void quest_varbitreq_met(ClientScriptState arg0) {
		arg0.intStack[arg0.isp - 2] = ((QuestType) Client.questTypeList.list(arg0.intStack[arg0.isp - 2])).varbitsRequirementMet(Client.localPlayerGameState, arg0.intStack[arg0.isp - 1]) ? 1 : 0;
		arg0.isp--;
	}

	@ObfuscatedName("fi.a(Lyf;I)V")
	public static void quest_allreqmet(ClientScriptState arg0) {
		arg0.intStack[arg0.isp - 1] = ((QuestType) Client.questTypeList.list(arg0.intStack[arg0.isp - 1])).allRequirementsMet(Client.localPlayerGameState) ? 1 : 0;
	}

	@ObfuscatedName("ud.g(Lyf;I)V")
	public static void quest_started(ClientScriptState arg0) {
		arg0.intStack[arg0.isp - 1] = ((QuestType) Client.questTypeList.list(arg0.intStack[arg0.isp - 1])).started(Client.localPlayerGameState) ? 1 : 0;
	}

	@ObfuscatedName("tx.i(Lyf;B)V")
	public static void quest_finished(ClientScriptState arg0) {
		arg0.intStack[arg0.isp - 1] = ((QuestType) Client.questTypeList.list(arg0.intStack[arg0.isp - 1])).finished(Client.localPlayerGameState) ? 1 : 0;
	}

	@ObfuscatedName("au.j(Lyf;I)V")
	public static void quest_param(ClientScriptState arg0) {
		arg0.isp -= 2;
		int var1 = arg0.intStack[arg0.isp];
		int var2 = arg0.intStack[arg0.isp + 1];
		ParamType var3 = (ParamType) Client.paramTypeList.list(var2);
		if (!var3.isStringType()) {
			int var5 = var3.defaultint;
			if (var1 == -1) {
				arg0.intStack[++arg0.isp - 1] = var5;
			} else {
				arg0.intStack[++arg0.isp - 1] = ((QuestType) Client.questTypeList.list(var1)).getParam(var2, var5);
			}
			return;
		}
		String var4 = var3.defaultstr;
		if (var1 == -1) {
			arg0.objectStack[++arg0.osp - 1] = var4;
		} else {
			arg0.objectStack[++arg0.osp - 1] = ((QuestType) Client.questTypeList.list(var1)).getParam(var2, var4);
		}
	}
}
