package com.jagex.audio.stream;

import com.jagex.audio.api.SoundBackend;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@ObfuscatedName("rw")
public class Sound {

	@ObfuscatedName("rw.e")
	public SoundBackend field4876;

	@ObfuscatedName("rw.n")
	public AudioProcessingInterface field4889;

	@ObfuscatedName("rw.m")
	public SoundVolume field4877 = SoundVolume.field4952;

	@ObfuscatedName("rw.k")
	public boolean field4878 = false;

	@ObfuscatedName("rw.f")
	public List field4879;

	@ObfuscatedName("rw.w")
	public Object field4893;

	@ObfuscatedName("rw.l")
	public Vector3 field4881;

	@ObfuscatedName("rw.u")
	public int field4890;

	@ObfuscatedName("rw.z")
	public boolean field4882;

	@ObfuscatedName("rw.p")
	public int field4880;

	@ObfuscatedName("rw.d")
	public float field4885;

	@ObfuscatedName("rw.c")
	public SoundAdjuster field4886;

	@ObfuscatedName("rw.r")
	public float field4887;

	@ObfuscatedName("rw.v")
	public float field4875;

	@ObfuscatedName("rw.o")
	public int field4883;

	@ObfuscatedName("rw.s")
	public boolean field4884;

	@ObfuscatedName("rw.y")
	public Object field4891;

	@ObfuscatedName("rw.q")
	public int field4892 = 0;

	@ObfuscatedName("rw.x")
	public float field4888;

	public Sound(SoundBackend arg0) {
		this.field4876 = arg0;
		this.field4879 = new ArrayList();
	}

	@ObfuscatedName("rw.e(I)V")
	public void method7375() {
		this.field4889 = null;
		this.field4877 = SoundVolume.field4952;
		this.field4878 = false;
		this.field4879.clear();
		this.field4893 = null;
		this.field4881 = null;
		this.field4890 = -1;
		this.field4882 = false;
		this.field4880 = 0;
		this.field4885 = 0.0F;
		this.field4886 = null;
		this.field4887 = 0.0F;
		this.field4875 = 0.0F;
		this.field4883 = 0;
		this.field4884 = false;
		this.field4891 = null;
		this.field4892 = 0;
		this.field4888 = 1.0F;
	}

	@ObfuscatedName("rw.n(Lwr;I)V")
	public void method7376(AudioProcessingInterface arg0) {
		this.field4889 = arg0;
		this.field4885 = 0.0F;
		this.field4877 = SoundVolume.field4946;
	}

	@ObfuscatedName("rw.m(I)V")
	public void method7377() {
		if (SoundVolume.field4947 != this.field4877 && SoundVolume.field4953 != this.field4877) {
			this.method7380(0);
		}
		Iterator var1 = this.field4879.iterator();
		while (var1.hasNext()) {
			AudioProcessingUnit var2 = (AudioProcessingUnit) var1.next();
			if (var2.method7516() == this) {
				var2.method7484();
			} else {
				var1.remove();
			}
		}
		this.method7375();
		this.field4877 = SoundVolume.field4955;
	}

	@ObfuscatedName("rw.k(I)V")
	public void method7392() {
		if (!this.field4878 && (SoundVolume.field4954 != this.field4877 && SoundVolume.field4955 != this.field4877 && SoundVolume.field4952 != this.field4877 && SoundVolume.field4951 != this.field4877 && (this.field4877.field4956 <= SoundVolume.field4946.field4956 || this.field4877.field4956 >= SoundVolume.field4947.field4956))) {
			this.field4877 = SoundVolume.field4948;
		}
	}

	@ObfuscatedName("rw.f(I)V")
	public void method7441() {
		if (SoundVolume.field4954 == this.field4877 || SoundVolume.field4955 == this.field4877 || SoundVolume.field4952 == this.field4877 || SoundVolume.field4951 == this.field4877) {
			return;
		}
		if ((SoundVolume.field4948 == this.field4877 || SoundVolume.field4949 == this.field4877) && !this.field4878) {
			this.field4878 = true;
		} else if (this.field4877.field4956 < SoundVolume.field4948.field4956 || this.field4877.field4956 >= SoundVolume.field4947.field4956) {
			this.field4877 = SoundVolume.field4948;
			this.field4878 = true;
		}
	}

	@ObfuscatedName("rw.w(IB)V")
	public void method7380(int arg0) {
		if (this.field4877.field4956 >= SoundVolume.field4947.field4956) {
			return;
		}
		if (this.field4877.field4956 < SoundVolume.field4950.field4956) {
			this.field4877 = SoundVolume.field4947;
			this.field4878 = false;
		} else if (arg0 <= 0) {
			Iterator var2 = this.field4879.iterator();
			while (var2.hasNext()) {
				AudioProcessingUnit var3 = (AudioProcessingUnit) var2.next();
				if (var3.method7516() == this) {
					var3.method7489();
				} else {
					var2.remove();
				}
			}
			this.field4877 = SoundVolume.field4947;
			this.field4878 = false;
		} else {
			this.field4877 = SoundVolume.field4951;
			Iterator var4 = this.field4879.iterator();
			while (var4.hasNext()) {
				AudioProcessingUnit var5 = (AudioProcessingUnit) var4.next();
				if (var5.method7516() == this) {
					var5.method7485(0.0F, arg0);
				} else {
					var4.remove();
				}
			}
		}
	}

	@ObfuscatedName("rw.l(B)V")
	public void method7381() {
		Iterator var1 = this.field4879.iterator();
		this.field4877 = SoundVolume.field4947;
		while (var1.hasNext()) {
			AudioProcessingUnit var2 = (AudioProcessingUnit) var1.next();
			if (var2.method7516() == this) {
				var2.method7502();
			}
		}
	}

	@ObfuscatedName("rw.u(I)V")
	public void method7382() {
		Iterator var1 = this.field4879.iterator();
		this.field4877 = SoundVolume.field4948;
		while (var1.hasNext()) {
			AudioProcessingUnit var2 = (AudioProcessingUnit) var1.next();
			if (var2.method7516() == this) {
				var2.method7584();
			}
		}
	}

	@ObfuscatedName("rw.z(Lro;I)V")
	public void method7383(SoundAdjuster arg0) {
		this.field4886 = arg0;
	}

	// line 167
	@ObfuscatedName("rw.p(B)V")
	public void method7384() {
		if (SoundVolume.field4948 == this.field4877) {
			AudioStreamRelated var1 = this.field4889.method9674();
			if (AudioStreamRelated.field7626 == var1) {
				this.field4877 = SoundVolume.field4949;
			}
		}
		if (SoundVolume.field4949 == this.field4877 && this.field4878) {
			AudioProcessingUnit var2 = this.field4876.method5865(this.field4889.method9679());
			if (var2 != null) {
				boolean var3 = this.field4889.method9675();
				SoundRelated var4 = new SoundRelated(this);
				boolean var5 = var2.method7487(var3 ? null : this.field4889.method9673(0), var3 ? var4 : null, this.field4890, this.field4892 > 0 ? 0.0F : this.field4885, false, this.field4882, this.field4880, this.field4888, this);
				if (var5) {
					this.field4877 = SoundVolume.field4950;
					var2.method7536(this.field4886);
					var2.method7485(this.field4885, this.field4892);
					var2.method7488();
					this.field4879.add(var2);
					this.field4878 = false;
				} else {
					if (var2.method7550() == SoundRelatedType1.field4865) {
						this.field4877 = SoundVolume.field4953;
					}
					var2.method7484();
				}
			}
		}
		Iterator var6 = this.field4879.iterator();
		boolean var7 = true;
		while (true) {
			while (var6.hasNext()) {
				AudioProcessingUnit var8 = (AudioProcessingUnit) var6.next();
				if (var8.method7516() == this) {
					if (SoundVolume.field4951 == this.field4877) {
						if (var8.method7486() == 0.0F) {
							var8.method7489();
						} else {
							var7 = false;
						}
					}
					if (var8.method7482() || var8.method7581()) {
						var8.method7484();
						var6.remove();
					} else {
						var7 = false;
					}
				} else {
					var6.remove();
				}
			}
			if (var7 && this.field4877.field4956 >= SoundVolume.field4950.field4956 && this.field4877.field4956 < SoundVolume.field4947.field4956) {
				if (SoundVolume.field4951 == this.field4877) {
					this.field4877 = SoundVolume.field4947;
				} else {
					this.field4877 = SoundVolume.field4953;
				}
			}
			return;
		}
	}

	@ObfuscatedName("qv")
	public static class SoundRelated implements SoundBaseInterface {

		// $FF: synthetic field
		public final Sound this$0;

		// line 177
		public SoundRelated(Sound arg0) {
			this.this$0 = arg0;
		}

		@ObfuscatedName("qv.e(II)[B")
		public byte[] method7354(int arg0) {
			return this.this$0.field4889.method9673(arg0);
		}
	}

	// line 230
	@ObfuscatedName("rw.d(I)Lrs;")
	public SoundVolume method7385() {
		return this.field4877;
	}

	@ObfuscatedName("rw.c(Ljava/lang/Object;B)V")
	public void setSoundSystem(Object arg0) {
		this.field4893 = arg0;
	}

	@ObfuscatedName("rw.r(I)Ljava/lang/Object;")
	public Object getSoundSystem() {
		return this.field4893;
	}

	@ObfuscatedName("rw.v(Ljava/lang/Object;I)V")
	public void setType(Object arg0) {
		this.field4891 = arg0;
	}

	@ObfuscatedName("rw.o(I)Ljava/lang/Object;")
	public Object getType() {
		return this.field4891;
	}

	@ObfuscatedName("rw.s(I)I")
	public int method7419() {
		return this.field4890;
	}

	@ObfuscatedName("rw.y(IB)V")
	public void method7391(int arg0) {
		this.field4890 = arg0;
	}

	@ObfuscatedName("rw.q(ZB)V")
	public void method7421(boolean arg0) {
	}

	@ObfuscatedName("rw.x(I)Lwr;")
	public AudioProcessingInterface method7386() {
		return this.field4889;
	}

	@ObfuscatedName("rw.b(Lox;I)V")
	public void setPosition(Vector3 arg0) {
		this.field4881 = arg0;
	}

	@ObfuscatedName("rw.h(S)Lox;")
	public Vector3 method7395() {
		return this.field4881;
	}

	@ObfuscatedName("rw.a(I)F")
	public float method7436() {
		return this.field4887;
	}

	@ObfuscatedName("rw.g(B)F")
	public float method7397() {
		return this.field4875;
	}

	@ObfuscatedName("rw.i(FB)V")
	public void setSize(float arg0) {
		this.field4887 = arg0;
	}

	@ObfuscatedName("rw.j(FB)V")
	public void setRange(float arg0) {
		this.field4875 = arg0;
	}

	@ObfuscatedName("rw.t(IZB)V")
	public void method7400(int arg0, boolean arg1) {
		this.field4884 = arg1;
		this.field4883 = arg0;
	}

	@ObfuscatedName("rw.ae(B)Z")
	public boolean method7390() {
		this.field4884 = false;
		return this.field4883 != 0;
	}

	@ObfuscatedName("rw.ag(B)V")
	public void method7402() {
		if (this.field4883 > -1 && !this.field4884) {
			this.field4883--;
		}
		if (this.field4883 == 0) {
			this.method7441();
		}
	}

	@ObfuscatedName("rw.ah(FII)V")
	public void method7403(float arg0, int arg1) {
		this.field4885 = arg0;
		int var3 = 0;
		Iterator var4 = this.field4879.iterator();
		while (var4.hasNext()) {
			AudioProcessingUnit var5 = (AudioProcessingUnit) var4.next();
			if (var5.method7516() == this) {
				var5.method7485(this.field4885, arg1);
				var3++;
			} else {
				this.field4879.remove(var5);
			}
		}
		if (var3 == 0) {
			this.field4892 = arg1;
		}
	}

	@ObfuscatedName("rw.al(ZIB)V")
	public void method7404(boolean arg0, int arg1) {
		this.field4882 = arg0;
		this.field4880 = arg1;
	}

	// line 327
	@ObfuscatedName("rw.ac(FI)V")
	public void setRate(float arg0) {
		if (!(arg0 < 0.0F)) {
			this.field4888 = arg0;
		}
	}
}
