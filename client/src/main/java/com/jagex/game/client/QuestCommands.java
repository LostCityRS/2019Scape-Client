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
		arg0.field8218[++arg0.field8211 - 1] = ((QuestType) Client.field1972.list(arg0.field8216[--arg0.field8226])).field2633;
	}

	@ObfuscatedName("ix.n(Lyf;B)V")
	public static void quest_getsortname(ClientScriptState arg0) {
		arg0.field8218[++arg0.field8211 - 1] = ((QuestType) Client.field1972.list(arg0.field8216[--arg0.field8226])).field2631;
	}

	@ObfuscatedName("kd.m(Lyf;S)V")
	public static void quest_type(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 1] = ((QuestType) Client.field1972.list(arg0.field8216[arg0.field8226 - 1])).field2645;
	}

	@ObfuscatedName("af.k(Lyf;I)V")
	public static void quest_getdifficulty(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 1] = ((QuestType) Client.field1972.list(arg0.field8216[arg0.field8226 - 1])).field2639;
	}

	@ObfuscatedName("kd.f(Lyf;I)V")
	public static void quest_getmembers(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 1] = ((QuestType) Client.field1972.list(arg0.field8216[arg0.field8226 - 1])).field2636 ? 1 : 0;
	}

	@ObfuscatedName("akw.w(Lyf;B)V")
	public static void quest_points(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 1] = ((QuestType) Client.field1972.list(arg0.field8216[arg0.field8226 - 1])).field2637;
	}

	@ObfuscatedName("g.l(Lyf;I)V")
	public static void quest_questreq_count(ClientScriptState arg0) {
		QuestType var1 = (QuestType) Client.field1972.list(arg0.field8216[--arg0.field8226]);
		arg0.field8216[++arg0.field8226 - 1] = var1.field2635 == null ? 0 : var1.field2635.length;
	}

	@ObfuscatedName("du.u(Lyf;I)V")
	public static void quest_questreq(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 2] = ((QuestType) Client.field1972.list(arg0.field8216[arg0.field8226 - 2])).field2635[arg0.field8216[arg0.field8226 - 1]];
		arg0.field8226--;
	}

	@ObfuscatedName("anr.z(Lyf;I)V")
	public static void quest_questreq_met(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 2] = ((QuestType) Client.field1972.list(arg0.field8216[arg0.field8226 - 2])).method4453(Client.field7410, arg0.field8216[arg0.field8226 - 1]) ? 1 : 0;
		arg0.field8226--;
	}

	@ObfuscatedName("mb.p(Lyf;I)V")
	public static void quest_pointsreq(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 1] = ((QuestType) Client.field1972.list(arg0.field8216[arg0.field8226 - 1])).field2641;
	}

	@ObfuscatedName("et.d(Lyf;I)V")
	public static void quest_pointsreq_met(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 1] = ((QuestType) Client.field1972.list(arg0.field8216[arg0.field8226 - 1])).method4440(Client.field7410) ? 1 : 0;
	}

	@ObfuscatedName("ny.c(Lyf;I)V")
	public static void quest_statreq_count(ClientScriptState arg0) {
		QuestType var1 = (QuestType) Client.field1972.list(arg0.field8216[--arg0.field8226]);
		arg0.field8216[++arg0.field8226 - 1] = var1.field2640 == null ? 0 : var1.field2640.length;
	}

	@ObfuscatedName("ec.r(Lyf;I)V")
	public static void quest_statreq_stat(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 2] = ((QuestType) Client.field1972.list(arg0.field8216[arg0.field8226 - 2])).field2640[arg0.field8216[arg0.field8226 - 1]][0];
		arg0.field8226--;
	}

	@ObfuscatedName("ic.v(Lyf;I)V")
	public static void quest_statreq_level(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 2] = ((QuestType) Client.field1972.list(arg0.field8216[arg0.field8226 - 2])).field2640[arg0.field8216[arg0.field8226 - 1]][1];
		arg0.field8226--;
	}

	@ObfuscatedName("e.o(Lyf;I)V")
	public static void quest_statreq_met(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 2] = ((QuestType) Client.field1972.list(arg0.field8216[arg0.field8226 - 2])).method4433(Client.field7410, arg0.field8216[arg0.field8226 - 1]) ? 1 : 0;
		arg0.field8226--;
	}

	@ObfuscatedName("ez.s(Lyf;I)V")
	public static void quest_varpreq_count(ClientScriptState arg0) {
		QuestType var1 = (QuestType) Client.field1972.list(arg0.field8216[--arg0.field8226]);
		arg0.field8216[++arg0.field8226 - 1] = var1.field2642 == null ? 0 : var1.field2642.length;
	}

	@ObfuscatedName("et.y(Lyf;I)V")
	public static void quest_varpreq_desc(ClientScriptState arg0) {
		arg0.field8218[++arg0.field8211 - 1] = ((QuestType) Client.field1972.list(arg0.field8216[arg0.field8226 - 2])).field2644[arg0.field8216[arg0.field8226 - 1]];
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("ab.q(Lyf;B)V")
	public static void quest_varpreq_met(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 2] = ((QuestType) Client.field1972.list(arg0.field8216[arg0.field8226 - 2])).method4435(Client.field7410, arg0.field8216[arg0.field8226 - 1]) ? 1 : 0;
		arg0.field8226--;
	}

	@ObfuscatedName("xo.x(Lyf;B)V")
	public static void quest_varbitreq_count(ClientScriptState arg0) {
		QuestType var1 = (QuestType) Client.field1972.list(arg0.field8216[--arg0.field8226]);
		arg0.field8216[++arg0.field8226 - 1] = var1.field2646 == null ? 0 : var1.field2646.length;
	}

	@ObfuscatedName("wc.b(Lyf;S)V")
	public static void quest_varbitreq_desc(ClientScriptState arg0) {
		arg0.field8218[++arg0.field8211 - 1] = ((QuestType) Client.field1972.list(arg0.field8216[arg0.field8226 - 2])).field2634[arg0.field8216[arg0.field8226 - 1]];
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("rp.h(Lyf;I)V")
	public static void quest_varbitreq_met(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 2] = ((QuestType) Client.field1972.list(arg0.field8216[arg0.field8226 - 2])).method4436(Client.field7410, arg0.field8216[arg0.field8226 - 1]) ? 1 : 0;
		arg0.field8226--;
	}

	@ObfuscatedName("fi.a(Lyf;I)V")
	public static void quest_allreqmet(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 1] = ((QuestType) Client.field1972.list(arg0.field8216[arg0.field8226 - 1])).method4431(Client.field7410) ? 1 : 0;
	}

	@ObfuscatedName("ud.g(Lyf;I)V")
	public static void quest_started(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 1] = ((QuestType) Client.field1972.list(arg0.field8216[arg0.field8226 - 1])).method4429(Client.field7410) ? 1 : 0;
	}

	@ObfuscatedName("tx.i(Lyf;B)V")
	public static void quest_finished(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 1] = ((QuestType) Client.field1972.list(arg0.field8216[arg0.field8226 - 1])).method4430(Client.field7410) ? 1 : 0;
	}

	@ObfuscatedName("au.j(Lyf;I)V")
	public static void quest_param(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		ParamType var3 = (ParamType) Client.field3086.list(var2);
		if (!var3.isStringType()) {
			int var5 = var3.defaultInt;
			if (var1 == -1) {
				arg0.field8216[++arg0.field8226 - 1] = var5;
			} else {
				arg0.field8216[++arg0.field8226 - 1] = ((QuestType) Client.field1972.list(var1)).method4428(var2, var5);
			}
			return;
		}
		String var4 = var3.defaultString;
		if (var1 == -1) {
			arg0.field8218[++arg0.field8211 - 1] = var4;
		} else {
			arg0.field8218[++arg0.field8211 - 1] = ((QuestType) Client.field1972.list(var1)).method4437(var2, var4);
		}
	}
}
