package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class Class419 {

	@OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
	int anInt4770;

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "Lclient!lr;")
	Interface37 anInterface37_24;

	// $FF: synthetic field
	@OriginalMember(owner = "client!mi", name = "this$0", descriptor = "Lclient!afc;")
	final Class104_Sub2 this$0;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lclient!afc;I)V", line = 1879)
	Class419(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.this$0 = arg0;
		this.method28707();
		this.method28714(arg1, this.anInt4770);
	}

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "()V", line = 1885)
	void method28707() {
		this.anInterface37_24 = this.this$0.method21174(true);
		this.this$0.method21164(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_10 }) });
		this.this$0.method21164(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_10 }) });
		this.this$0.method21164(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_10 }) });
		this.anInt4770 = 16;
	}

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "()V", line = 1885)
	void method28708() {
		this.anInterface37_24 = this.this$0.method21174(true);
		this.this$0.method21164(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_10 }) });
		this.this$0.method21164(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_10 }) });
		this.this$0.method21164(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_10 }) });
		this.anInt4770 = 16;
	}

	@OriginalMember(owner = "client!mi", name = "n", descriptor = "()V", line = 1893)
	void method28709() {
		this.anInterface37_24.method30884();
	}

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "()V", line = 1893)
	void method28710() {
		this.anInterface37_24.method30884();
	}

	@OriginalMember(owner = "client!mi", name = "w", descriptor = "()V", line = 1893)
	void method28711() {
		this.anInterface37_24.method30884();
	}

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "()V", line = 1893)
	void method28712() {
		this.anInterface37_24.method30884();
	}

	@OriginalMember(owner = "client!mi", name = "z", descriptor = "(II)V", line = 1897)
	void method28713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.anInterface37_24.method29315(arg0, arg1)) {
			System.out.println("PrimitiveVertexBuffer:ensureSize: failed vertexBuffer.allocate !");
		}
	}

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "(II)V", line = 1897)
	void method28714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.anInterface37_24.method29315(arg0, arg1)) {
			System.out.println("PrimitiveVertexBuffer:ensureSize: failed vertexBuffer.allocate !");
		}
	}

	@OriginalMember(owner = "client!mi", name = "u", descriptor = "(II)V", line = 1897)
	void method28715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.anInterface37_24.method29315(arg0, arg1)) {
			System.out.println("PrimitiveVertexBuffer:ensureSize: failed vertexBuffer.allocate !");
		}
	}
}
