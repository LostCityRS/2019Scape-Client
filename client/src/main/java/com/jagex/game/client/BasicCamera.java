package com.jagex.game.client;

import com.jagex.core.io.Packet;
import com.jagex.game.camera.CameraEffect;
import com.jagex.game.camera.LookatMode;
import com.jagex.game.world.entity.PositionMode;
import com.jagex.graphics.camera.*;
import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("ahc")
public class BasicCamera extends Camera {

	@ObfuscatedName("ahc.au")
	public int field10465 = 0;

	public BasicCamera(CameraTrackableProvider arg0) {
		super(CameraRelated.field2813, arg0);
	}

	@ObfuscatedName("ahc.fs(B)I")
	public int method16602() {
		this.field10465++;
		if (this.field10465 == 126) {
			this.field10465 = 0;
		}
		return this.field10465;
	}

	@ObfuscatedName("ahc.fz(Lalw;II)V")
	public void decode(Packet buf, int size) {
		int var3 = buf.pos;
		int var4 = buf.g1();
		this.setControlMode(CameraControlMode.of(var4 & 0x1));
		if ((var4 & 0x8) != 0) {
			LookatMode var5 = LookatMode.of(buf.g1());
			if (this.lookatMode != var5) {
				try {
					this.setLookatMode(var5, true);
				} catch (CameraException var20) {
					var20.printStackTrace();
				}
			}
		}
		if ((var4 & 0x10) != 0) {
			PositionMode var7 = PositionMode.method1058(buf.g1());
			if (this.positionMode != var7) {
				try {
					this.setPositionMode(var7, true);
				} catch (CameraException var19) {
					var19.printStackTrace();
				}
			}
		}
		if ((var4 >> 7 & 0x1) == 1) {
			int var9 = buf.g2();
			if ((var9 >> CameraSettingType.field2810.field2803 & 0x1) == 1) {
				this.lookatMaxSpeed.decode(buf);
			}
			if ((var9 >> CameraSettingType.field2797.field2803 & 0x1) == 1) {
				this.positionMaxSpeed.decode(buf);
			}
			if ((var9 >> CameraSettingType.field2809.field2803 & 0x1) == 1) {
				this.lookatAcceleration.decode(buf);
			}
			if ((var9 >> CameraSettingType.field2799.field2803 & 0x1) == 1) {
				this.positionAcceleration.decode(buf);
			}
			if ((var9 >> CameraSettingType.field2798.field2803 & 0x1) == 1) {
				this.field2855 = buf.gFloat();
				this.field2859 = buf.gFloat();
			}
			if ((var9 >> CameraSettingType.field2801.field2803 & 0x1) == 1) {
				this.field2872 = buf.gFloat();
				this.field2868 = buf.gFloat();
			}
			if ((var9 >> CameraSettingType.field2802.field2803 & 0x1) == 1) {
				this.projectionMode = CameraProjectionMode.method16906(buf.g1());
			}
			if ((var9 >> CameraSettingType.field2806.field2803 & 0x1) == 1) {
				this.field2851 = buf.g3();
				buf.g1();
			}
			if ((var9 >> CameraSettingType.field2804.field2803 & 0x1) == 1) {
				int var10 = buf.g1();
				this.field2862 = (var10 & 0x1) == 1;
				this.field2875 = (var10 & 0x2) == 2;
			}
			if ((var9 >> CameraSettingType.field2805.field2803 & 0x1) == 1) {
				int var11 = buf.g1();
				for (int var12 = 0; var12 < var11; var12++) {
					int var13 = buf.g1();
					int var14 = buf.g1();
					if (var13 == 0) {
						this.removeEffect(var14);
					} else {
						CameraEffectType var15 = CameraEffectType.of(buf.g1());
						boolean var16 = true;
						Iterator var17 = this.effects.iterator();
						while (var17.hasNext()) {
							CameraEffect var18 = (CameraEffect) var17.next();
							if (var18.id == var14) {
								var18.decode(buf);
								var16 = false;
								break;
							}
						}
						if (var16) {
							this.addEffect(CameraEffect.createCameraEffect(var14, var15, buf));
						}
					}
				}
			}
			if ((var9 >> CameraSettingType.field2811.field2803 & 0x1) == 1) {
				this.field2876 = buf.g2();
				this.field2877 = buf.gFloat();
			}
			if ((var9 >> CameraSettingType.field2807.field2803 & 0x1) == 1) {
				this.linearMovementMode = CameraLinearMovementMode.method17805(buf.g1());
			}
			if ((var9 >> CameraSettingType.field2808.field2803 & 0x1) == 1) {
				this.lookatSpring.decode(buf);
				this.positionSpring.decode(buf);
				this.field2866 = buf.gFloat();
				this.field2843 = buf.gFloat();
			}
			if ((var9 >> CameraSettingType.field2796.field2803 & 0x1) == 1) {
				buf.gFloat();
			}
			if ((var9 >> CameraSettingType.field2800.field2803 & 0x1) == 1) {
				this.positionAngularInterpolation = buf.gFloat();
			}
		}
		if (this.lookat != null && (var4 >> 5 & 0x1) == 1) {
			this.lookat.decode(buf);
		}
		if (this.position != null && (var4 >> 6 & 0x1) == 1) {
			this.position.method5224(buf);
		}
		if (buf.pos - var3 != size) {
			throw new RuntimeException(buf.pos - var3 + "," + size);
		}
	}
}
