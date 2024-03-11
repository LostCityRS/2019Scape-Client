package com.jagex.game.client;

import com.jagex.game.script.ClientScriptState;
import com.jagex.game.config.paramtype.ParamType;
import com.jagex.game.config.questtype.QuestType;
import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("yr")
public final class QuestCommands {

	public QuestCommands() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("nt.e(Lyf;I)V")
	public static void method6038(ClientScriptState arg0) {
		arg0.field8218[++arg0.field8211 - 1] = ((QuestType) Statics.field1972.get(arg0.field8216[--arg0.field8226])).field2633;
	}

	@ObfuscatedName("ix.n(Lyf;B)V")
	public static void method4478(ClientScriptState arg0) {
		arg0.field8218[++arg0.field8211 - 1] = ((QuestType) Statics.field1972.get(arg0.field8216[--arg0.field8226])).field2631;
	}

	@ObfuscatedName("kd.m(Lyf;S)V")
	public static void method5339(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 1] = ((QuestType) Statics.field1972.get(arg0.field8216[arg0.field8226 - 1])).field2645;
	}

	@ObfuscatedName("af.k(Lyf;I)V")
	public static void method1004(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 1] = ((QuestType) Statics.field1972.get(arg0.field8216[arg0.field8226 - 1])).field2639;
	}

	@ObfuscatedName("kd.f(Lyf;I)V")
	public static void method5341(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 1] = ((QuestType) Statics.field1972.get(arg0.field8216[arg0.field8226 - 1])).field2636 ? 1 : 0;
	}

	@ObfuscatedName("akw.w(Lyf;B)V")
	public static void method17723(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 1] = ((QuestType) Statics.field1972.get(arg0.field8216[arg0.field8226 - 1])).field2637;
	}

	@ObfuscatedName("g.l(Lyf;I)V")
	public static void method616(ClientScriptState arg0) {
		QuestType var1 = (QuestType) Statics.field1972.get(arg0.field8216[--arg0.field8226]);
		arg0.field8216[++arg0.field8226 - 1] = var1.field2635 == null ? 0 : var1.field2635.length;
	}

	@ObfuscatedName("du.u(Lyf;I)V")
	public static void method2087(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 2] = ((QuestType) Statics.field1972.get(arg0.field8216[arg0.field8226 - 2])).field2635[arg0.field8216[arg0.field8226 - 1]];
		arg0.field8226--;
	}

	@ObfuscatedName("anr.z(Lyf;I)V")
	public static void method18726(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 2] = ((QuestType) Statics.field1972.get(arg0.field8216[arg0.field8226 - 2])).method4453(Statics.field7410, arg0.field8216[arg0.field8226 - 1]) ? 1 : 0;
		arg0.field8226--;
	}

	@ObfuscatedName("mb.p(Lyf;I)V")
	public static void method5858(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 1] = ((QuestType) Statics.field1972.get(arg0.field8216[arg0.field8226 - 1])).field2641;
	}

	@ObfuscatedName("et.d(Lyf;I)V")
	public static void method2860(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 1] = ((QuestType) Statics.field1972.get(arg0.field8216[arg0.field8226 - 1])).method4440(Statics.field7410) ? 1 : 0;
	}

	@ObfuscatedName("ny.c(Lyf;I)V")
	public static void method5951(ClientScriptState arg0) {
		QuestType var1 = (QuestType) Statics.field1972.get(arg0.field8216[--arg0.field8226]);
		arg0.field8216[++arg0.field8226 - 1] = var1.field2640 == null ? 0 : var1.field2640.length;
	}

	@ObfuscatedName("ec.r(Lyf;I)V")
	public static void method2794(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 2] = ((QuestType) Statics.field1972.get(arg0.field8216[arg0.field8226 - 2])).field2640[arg0.field8216[arg0.field8226 - 1]][0];
		arg0.field8226--;
	}

	@ObfuscatedName("ic.v(Lyf;I)V")
	public static void method4632(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 2] = ((QuestType) Statics.field1972.get(arg0.field8216[arg0.field8226 - 2])).field2640[arg0.field8216[arg0.field8226 - 1]][1];
		arg0.field8226--;
	}

	@ObfuscatedName("e.o(Lyf;I)V")
	public static void method132(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 2] = ((QuestType) Statics.field1972.get(arg0.field8216[arg0.field8226 - 2])).method4433(Statics.field7410, arg0.field8216[arg0.field8226 - 1]) ? 1 : 0;
		arg0.field8226--;
	}

	@ObfuscatedName("ez.s(Lyf;I)V")
	public static void method2843(ClientScriptState arg0) {
		QuestType var1 = (QuestType) Statics.field1972.get(arg0.field8216[--arg0.field8226]);
		arg0.field8216[++arg0.field8226 - 1] = var1.field2642 == null ? 0 : var1.field2642.length;
	}

	@ObfuscatedName("et.y(Lyf;I)V")
	public static void method2861(ClientScriptState arg0) {
		arg0.field8218[++arg0.field8211 - 1] = ((QuestType) Statics.field1972.get(arg0.field8216[arg0.field8226 - 2])).field2644[arg0.field8216[arg0.field8226 - 1]];
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("ab.q(Lyf;B)V")
	public static void method988(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 2] = ((QuestType) Statics.field1972.get(arg0.field8216[arg0.field8226 - 2])).method4435(Statics.field7410, arg0.field8216[arg0.field8226 - 1]) ? 1 : 0;
		arg0.field8226--;
	}

	@ObfuscatedName("xo.x(Lyf;B)V")
	public static void method10322(ClientScriptState arg0) {
		QuestType var1 = (QuestType) Statics.field1972.get(arg0.field8216[--arg0.field8226]);
		arg0.field8216[++arg0.field8226 - 1] = var1.field2646 == null ? 0 : var1.field2646.length;
	}

	@ObfuscatedName("wc.b(Lyf;S)V")
	public static void method9841(ClientScriptState arg0) {
		arg0.field8218[++arg0.field8211 - 1] = ((QuestType) Statics.field1972.get(arg0.field8216[arg0.field8226 - 2])).field2634[arg0.field8216[arg0.field8226 - 1]];
		arg0.field8226 -= 2;
	}

	@ObfuscatedName("rp.h(Lyf;I)V")
	public static void method7476(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 2] = ((QuestType) Statics.field1972.get(arg0.field8216[arg0.field8226 - 2])).method4436(Statics.field7410, arg0.field8216[arg0.field8226 - 1]) ? 1 : 0;
		arg0.field8226--;
	}

	@ObfuscatedName("fi.a(Lyf;I)V")
	public static void method3069(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 1] = ((QuestType) Statics.field1972.get(arg0.field8216[arg0.field8226 - 1])).method4431(Statics.field7410) ? 1 : 0;
	}

	@ObfuscatedName("ud.g(Lyf;I)V")
	public static void method9190(ClientScriptState arg0) {
		arg0.field8216[arg0.field8226 - 1] = ((QuestType) Statics.field1972.get(arg0.field8216[arg0.field8226 - 1])).method4429(Statics.field7410) ? 1 : 0;
	}

	@ObfuscatedName("au.j(Lyf;I)V")
	public static void method848(ClientScriptState arg0) {
		arg0.field8226 -= 2;
		int var1 = arg0.field8216[arg0.field8226];
		int var2 = arg0.field8216[arg0.field8226 + 1];
		ParamType var3 = (ParamType) Statics.field3086.get(var2);
		if (!var3.method15152()) {
			int var5 = var3.field9172;
			if (var1 == -1) {
				arg0.field8216[++arg0.field8226 - 1] = var5;
			} else {
				arg0.field8216[++arg0.field8226 - 1] = ((QuestType) Statics.field1972.get(var1)).method4428(var2, var5);
			}
			return;
		}
		String var4 = var3.field9171;
		if (var1 == -1) {
			arg0.field8218[++arg0.field8211 - 1] = var4;
		} else {
			arg0.field8218[++arg0.field8211 - 1] = ((QuestType) Statics.field1972.get(var1)).method4437(var2, var4);
		}
	}
}
