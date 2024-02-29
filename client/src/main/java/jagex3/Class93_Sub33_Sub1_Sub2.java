package jagex3;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!atr")
public final class Class93_Sub33_Sub1_Sub2 extends Class93_Sub33_Sub1 {

	@OriginalMember(owner = "client!atr", name = "c", descriptor = "[I")
	int[] anIntArray275 = null;

	@OriginalMember(owner = "client!atr", name = "d", descriptor = "Lclient!ago;")
	Class115_Sub2 aClass115_Sub2_2;

	@OriginalMember(owner = "client!atr", name = "<init>", descriptor = "(Lclient!ago;Lclient!hv;)V")
	Class93_Sub33_Sub1_Sub2(@OriginalArg(0) Class115_Sub2 arg0, @OriginalArg(1) Class325 arg1) {
		super(arg1);
		this.aClass115_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "client!atr", name = "z", descriptor = "(I)Z")
	@Override
	public boolean method23672(@OriginalArg(0) int arg0) {
		if (this.anIntArray275 == null) {
			this.anIntArray275 = new int[this.aClass115_Sub2_2.method8199((byte) -50)];
		}
		@Pc(16) Class116_Sub1 local16 = (Class116_Sub1) this.aClass115_Sub2_2.method8200(arg0, -2102610570);
		this.anIntArray275[arg0] = OpenGL.glGetUniformLocation(local16.anInt958, this.method23675(-779329247));
		return this.anIntArray275[arg0] != -1;
	}

	@OriginalMember(owner = "client!atr", name = "a", descriptor = "()I")
	int method23680() {
		return this.anIntArray275[this.aClass115_Sub2_2.method8253(-594583474)];
	}

	@OriginalMember(owner = "client!atr", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method23663(@OriginalArg(0) int arg0) {
		if (this.anIntArray275 == null) {
			this.anIntArray275 = new int[this.aClass115_Sub2_2.method8199((byte) -77)];
		}
		@Pc(16) Class116_Sub1 local16 = (Class116_Sub1) this.aClass115_Sub2_2.method8200(arg0, -1467770934);
		this.anIntArray275[arg0] = OpenGL.glGetUniformLocation(local16.anInt958, this.method23675(256248337));
		return this.anIntArray275[arg0] != -1;
	}

	@OriginalMember(owner = "client!atr", name = "w", descriptor = "(I)I")
	@Override
	public int method23668(@OriginalArg(0) int arg0) {
		return this.anIntArray275[arg0];
	}

	@OriginalMember(owner = "client!atr", name = "l", descriptor = "(I)Z")
	@Override
	public boolean method23669(@OriginalArg(0) int arg0) {
		if (this.anIntArray275 == null) {
			this.anIntArray275 = new int[this.aClass115_Sub2_2.method8199((byte) -67)];
		}
		@Pc(16) Class116_Sub1 local16 = (Class116_Sub1) this.aClass115_Sub2_2.method8200(arg0, -1326093701);
		this.anIntArray275[arg0] = OpenGL.glGetUniformLocation(local16.anInt958, this.method23675(-355818980));
		return this.anIntArray275[arg0] != -1;
	}

	@OriginalMember(owner = "client!atr", name = "i", descriptor = "()I")
	int method23681() {
		return this.anIntArray275[this.aClass115_Sub2_2.method8253(-1150527909)];
	}

	@OriginalMember(owner = "client!atr", name = "u", descriptor = "(I)Z")
	@Override
	public boolean method23670(@OriginalArg(0) int arg0) {
		if (this.anIntArray275 == null) {
			this.anIntArray275 = new int[this.aClass115_Sub2_2.method8199((byte) -15)];
		}
		@Pc(16) Class116_Sub1 local16 = (Class116_Sub1) this.aClass115_Sub2_2.method8200(arg0, -822978522);
		this.anIntArray275[arg0] = OpenGL.glGetUniformLocation(local16.anInt958, this.method23675(1368452782));
		return this.anIntArray275[arg0] != -1;
	}

	@OriginalMember(owner = "client!atr", name = "h", descriptor = "(I)I")
	@Override
	public int method23664(@OriginalArg(0) int arg0) {
		return this.anIntArray275[arg0];
	}

	@OriginalMember(owner = "client!atr", name = "g", descriptor = "()I")
	int method23682() {
		return this.anIntArray275[this.aClass115_Sub2_2.method8253(-1408248032)];
	}

	@OriginalMember(owner = "client!atr", name = "j", descriptor = "()I")
	int method23683() {
		return this.anIntArray275[this.aClass115_Sub2_2.method8253(-1252077771)];
	}

	@OriginalMember(owner = "client!atr", name = "x", descriptor = "(I)I")
	@Override
	public int method23677(@OriginalArg(0) int arg0) {
		return this.anIntArray275[arg0];
	}
}
