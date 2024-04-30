package com.jagex.game.config.questtype;

import com.jagex.core.datastruct.IntNode;
import com.jagex.core.datastruct.HashTable;
import com.jagex.core.datastruct.Node;
import com.jagex.core.io.Packet;
import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.game.config.vartype.VarIntDomain;
import com.jagex.game.config.vartype.VarType;
import com.jagex.game.config.vartype.VariableTypeProvider;
import com.jagex.game.config.vartype.bit.VarBitType;
import com.jagex.game.config.vartype.constants.VarDomainType;
import com.jagex.game.world.entity.ObjectNode;
import com.jagex.game.world.entity.PlayerStatProvider;
import com.jagex.math.IntMath;
import deob.ObfuscatedName;

@ObfuscatedName("ir")
public class QuestType implements ConfigType {

	@ObfuscatedName("ir.e")
	public ConfigTypeList configTypeList;

	@ObfuscatedName("ir.n")
	public String name;

	@ObfuscatedName("ir.m")
	public String sortname;

	@ObfuscatedName("ir.k")
	public int[][] field2632;

	@ObfuscatedName("ir.f")
	public int[][] field2630;

	@ObfuscatedName("ir.w")
	public int type = 0;

	@ObfuscatedName("ir.l")
	public int difficulty = 0;

	@ObfuscatedName("ir.u")
	public boolean members = false;

	@ObfuscatedName("ir.z")
	public int points;

	@ObfuscatedName("ir.p")
	public int[] field2638;

	@ObfuscatedName("ir.d")
	public int[] questrequirements;

	@ObfuscatedName("ir.c")
	public int[][] statRequirements;

	@ObfuscatedName("ir.r")
	public int pointsrequirement;

	@ObfuscatedName("ir.v")
	public int[] varpsRequirement;

	@ObfuscatedName("ir.o")
	public int[] field2643;

	@ObfuscatedName("ir.s")
	public int[] field2629;

	@ObfuscatedName("ir.y")
	public String[] varpsDescriptions;

	@ObfuscatedName("ir.q")
	public int[] varbitsRequirement;

	@ObfuscatedName("ir.x")
	public int[] field2647;

	@ObfuscatedName("ir.b")
	public int[] field2648;

	@ObfuscatedName("ir.h")
	public String[] varbitsDescriptions;

	@ObfuscatedName("ir.a")
	public HashTable params;

	@ObfuscatedName("ir.g")
	public int field2651 = -1;

	public QuestType(int arg0, ConfigTypeList configTypeList) {
		this.configTypeList = configTypeList;
	}

	@ObfuscatedName("ir.e(Lalw;B)V")
	public void decode(Packet buf) {
		while (true) {
			int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(buf, code);
		}
	}

	@ObfuscatedName("ir.u(Lalw;II)V")
	public void decode(Packet buf, int code) {
		if (code == 1) {
			this.name = buf.gjstr2();
		} else if (code == 2) {
			this.sortname = buf.gjstr2();
		} else if (code == 3) {
			int length = buf.g1();
			this.field2632 = new int[length][3];
			for (int index = 0; index < length; index++) {
				this.field2632[index][0] = buf.g2();
				this.field2632[index][1] = buf.g4s();
				this.field2632[index][2] = buf.g4s();
			}
		} else if (code == 4) {
			int length = buf.g1();
			this.field2630 = new int[length][3];
			for (int index = 0; index < length; index++) {
				this.field2630[index][0] = buf.g2();
				this.field2630[index][1] = buf.g4s();
				this.field2630[index][2] = buf.g4s();
			}
		} else if (code == 5) {
			buf.g2();
		} else if (code == 6) {
			this.type = buf.g1();
		} else if (code == 7) {
			this.difficulty = buf.g1();
		} else if (code == 8) {
			this.members = true;
		} else if (code == 9) {
			this.points = buf.g1();
		} else if (code == 10) {
			int length = buf.g1();
			this.field2638 = new int[length];
			for (int index = 0; index < length; index++) {
				this.field2638[index] = buf.g4s();
			}
		} else if (code == 12) {
			buf.g4s();
		} else if (code == 13) {
			int length = buf.g1();
			this.questrequirements = new int[length];
			for (int index = 0; index < length; index++) {
				this.questrequirements[index] = buf.g2();
			}
		} else if (code == 14) {
			int length = buf.g1();
			this.statRequirements = new int[length][2];
			for (int index = 0; index < length; index++) {
				this.statRequirements[index][0] = buf.g1();
				this.statRequirements[index][1] = buf.g1();
			}
		} else if (code == 15) {
			this.pointsrequirement = buf.g2();
		} else if (code == 17) {
			this.field2651 = buf.gSmart2or4null();
		} else if (code == 18) {
			int length = buf.g1();
			this.varpsRequirement = new int[length];
			this.field2643 = new int[length];
			this.field2629 = new int[length];
			this.varpsDescriptions = new String[length];
			for (int index = 0; index < length; index++) {
				this.varpsRequirement[index] = buf.g4s();
				this.field2643[index] = buf.g4s();
				this.field2629[index] = buf.g4s();
				this.varpsDescriptions[index] = buf.gjstr();
			}
		} else if (code == 19) {
			int length = buf.g1();
			this.varbitsRequirement = new int[length];
			this.field2647 = new int[length];
			this.field2648 = new int[length];
			this.varbitsDescriptions = new String[length];
			for (int index = 0; index < length; index++) {
				this.varbitsRequirement[index] = buf.g4s();
				this.field2647[index] = buf.g4s();
				this.field2648[index] = buf.g4s();
				this.varbitsDescriptions[index] = buf.gjstr();
			}
		} else if (code == 249) {
			int var17 = buf.g1();
			if (this.params == null) {
				int var18 = IntMath.bitceil(var17);
				this.params = new HashTable(var18);
			}
			for (int var19 = 0; var19 < var17; var19++) {
				boolean var20 = buf.g1() == 1;
				int var21 = buf.g3();
				Node var22;
				if (var20) {
					var22 = new ObjectNode(buf.gjstr());
				} else {
					var22 = new IntNode(buf.g4s());
				}
				this.params.put(var22, (long) var21);
			}
		}
	}

	@ObfuscatedName("ir.n(I)V")
	public void postDecode() {
		if (this.sortname == null) {
			this.sortname = this.name;
		}
	}

	@ObfuscatedName("ir.z(IIB)I")
	public int getParam(int arg0, int arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			IntNode var3 = (IntNode) this.params.get((long) arg0);
			return var3 == null ? arg1 : var3.value;
		}
	}

	@ObfuscatedName("ir.p(ILjava/lang/String;I)Ljava/lang/String;")
	public String getParam(int arg0, String arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			ObjectNode var3 = (ObjectNode) this.params.get((long) arg0);
			return var3 == null ? arg1 : (String) var3.value;
		}
	}

	@ObfuscatedName("ir.d(Lep;I)Z")
	public boolean started(VarIntDomain arg0) {
		if (this.field2632 != null) {
			for (int var2 = 0; var2 < this.field2632.length; var2++) {
				VarType var3 = ((VariableTypeProvider) arg0).getVarType(VarDomainType.PLAYER, this.field2632[var2][0]);
				if (arg0.getVarValueInt(var3) >= this.field2632[var2][1]) {
					return true;
				}
			}
		}
		if (this.field2630 != null) {
			for (int var4 = 0; var4 < this.field2630.length; var4++) {
				VarBitType var5 = ((VariableTypeProvider) arg0).getVarBitType(this.field2630[var4][0]);
				if (arg0.getVarBitValue(var5) >= this.field2630[var4][1]) {
					return true;
				}
			}
		}
		return false;
	}

	@ObfuscatedName("ir.c(Lep;I)Z")
	public boolean finished(VarIntDomain arg0) {
		if (this.field2632 != null) {
			for (int var2 = 0; var2 < this.field2632.length; var2++) {
				VarType var3 = ((VariableTypeProvider) arg0).getVarType(VarDomainType.PLAYER, this.field2632[var2][0]);
				if (arg0.getVarValueInt(var3) >= this.field2632[var2][2]) {
					return true;
				}
			}
		}
		if (this.field2630 != null) {
			for (int var4 = 0; var4 < this.field2630.length; var4++) {
				VarBitType var5 = ((VariableTypeProvider) arg0).getVarBitType(this.field2630[var4][0]);
				if (arg0.getVarBitValue(var5) >= this.field2630[var4][2]) {
					return true;
				}
			}
		}
		return false;
	}

	@ObfuscatedName("ir.r(Lep;I)Z")
	public boolean allRequirementsMet(VarIntDomain arg0) {
		if (method5179(arg0, this.configTypeList) < this.pointsrequirement) {
			return false;
		}
		if (this.statRequirements != null) {
			for (int var2 = 0; var2 < this.statRequirements.length; var2++) {
				if (((PlayerStatProvider) arg0).getStatLevelMax(this.statRequirements[var2][0]) < this.statRequirements[var2][1]) {
					return false;
				}
			}
		}
		if (this.questrequirements != null) {
			for (int var3 = 0; var3 < this.questrequirements.length; var3++) {
				if (!((QuestType) this.configTypeList.list(this.questrequirements[var3])).finished(arg0)) {
					return false;
				}
			}
		}
		if (this.varpsRequirement != null) {
			for (int var4 = 0; var4 < this.varpsRequirement.length; var4++) {
				VarType var5 = ((VariableTypeProvider) arg0).getVarType(VarDomainType.PLAYER, this.varpsRequirement[var4]);
				int var6 = arg0.getVarValueInt(var5);
				if (var6 < this.field2643[var4] || var6 > this.field2629[var4]) {
					return false;
				}
			}
		}
		if (this.varbitsRequirement != null) {
			for (int var7 = 0; var7 < this.varbitsRequirement.length; var7++) {
				VarBitType var8 = ((VariableTypeProvider) arg0).getVarBitType(this.varbitsRequirement[var7]);
				int var9 = arg0.getVarBitValue(var8);
				if (var9 < this.field2647[var7] || var9 > this.field2648[var7]) {
					return false;
				}
			}
		}
		return true;
	}

	@ObfuscatedName("ir.v(Lep;I)Z")
	public boolean pointsRequirementMet(VarIntDomain arg0) {
		return method5179(arg0, this.configTypeList) >= this.pointsrequirement;
	}

	@ObfuscatedName("ir.o(Lep;IB)Z")
	public boolean statRequirementMet(VarIntDomain arg0, int arg1) {
		if (this.statRequirements == null || arg1 < 0 || arg1 >= this.statRequirements.length) {
			return false;
		} else {
			return ((PlayerStatProvider) arg0).getStatLevelMax(this.statRequirements[arg1][0]) >= this.statRequirements[arg1][1];
		}
	}

	@ObfuscatedName("ir.s(Lep;IB)Z")
	public boolean questRequirementMet(VarIntDomain arg0, int arg1) {
		if (this.questrequirements == null || arg1 < 0 || arg1 >= this.questrequirements.length) {
			return false;
		} else {
			return ((QuestType) this.configTypeList.list(this.questrequirements[arg1])).finished(arg0);
		}
	}

	@ObfuscatedName("ir.y(Lep;II)Z")
	public boolean varpsRequirementMet(VarIntDomain arg0, int arg1) {
		if (this.varpsRequirement == null || arg1 < 0 || arg1 >= this.varpsRequirement.length) {
			return false;
		} else {
			VarType var3 = ((VariableTypeProvider) arg0).getVarType(VarDomainType.PLAYER, this.varpsRequirement[arg1]);
			int var4 = arg0.getVarValueInt(var3);
			return var4 >= this.field2643[arg1] && var4 <= this.field2629[arg1];
		}
	}

	@ObfuscatedName("ir.q(Lep;II)Z")
	public boolean varbitsRequirementMet(VarIntDomain arg0, int arg1) {
		if (this.varbitsRequirement == null || arg1 < 0 || arg1 >= this.varbitsRequirement.length) {
			return false;
		} else {
			VarBitType var3 = ((VariableTypeProvider) arg0).getVarBitType(this.varbitsRequirement[arg1]);
			int var4 = arg0.getVarBitValue(var3);
			return var4 >= this.field2647[arg1] && var4 <= this.field2648[arg1];
		}
	}

	@ObfuscatedName("ks.x(Lep;Lao;B)I")
	public static int method5179(VarIntDomain arg0, ConfigTypeList arg1) {
		int var2 = 0;
		for (int var3 = 0; var3 < arg1.length(); var3++) {
			QuestType var4 = (QuestType) arg1.list(var3);
			if (var4.finished(arg0)) {
				var2 += var4.points;
			}
		}
		return var2;
	}
}
