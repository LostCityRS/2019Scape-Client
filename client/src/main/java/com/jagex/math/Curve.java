package com.jagex.math;

import com.jagex.core.io.Packet;
import com.jagex.graphics.KeyFrame;
import com.jagex.graphics.TransformInfinityType;
import deob.ObfuscatedName;

@ObfuscatedName("dn")
public class Curve {

	@ObfuscatedName("dn.e")
	public boolean useBezierInterpolation;

	@ObfuscatedName("dn.n")
	public boolean field1444;

	@ObfuscatedName("dn.m")
	public TransformInfinityType preInfinityType; // determines how the curve behaves before the first keyframe

	@ObfuscatedName("dn.k")
	public TransformInfinityType postInfinityType; // determines how the curve behaves after the last keyframe

	@ObfuscatedName("dn.f")
	public KeyFrame[] keyframes;

	@ObfuscatedName("dn.w")
	public boolean field1440;

	@ObfuscatedName("dn.l")
	public float field1441;

	@ObfuscatedName("dn.u")
	public float field1443;

	@ObfuscatedName("dn.z")
	public float[] field1449 = new float[4];

	@ObfuscatedName("dn.p")
	public float[] field1442 = new float[4];

	@ObfuscatedName("dn.d")
	public boolean field1445 = true;

	@ObfuscatedName("dn.c")
	public int field1446 = 0;

	@ObfuscatedName("dn.r")
	public float[] values;

	@ObfuscatedName("dn.v")
	public float firstValue;

	@ObfuscatedName("dn.o")
	public float lastValue;

	@ObfuscatedName("dn.e(Lalw;II)I")
	public int decode(Packet packet, int arg1) {
		int keyframeCount = packet.g2();
		CurveType.method2995(packet.g1());
		this.preInfinityType = TransformInfinityType.getByValue(packet.g1());
		this.postInfinityType = TransformInfinityType.getByValue(packet.g1());
		this.useBezierInterpolation = packet.g1() != 0;
		this.keyframes = new KeyFrame[keyframeCount];
		KeyFrame lastKeyframe = null;
		for (int var5 = 0; var5 < keyframeCount; var5++) {
			KeyFrame keyframe = new KeyFrame();
			keyframe.decode(packet, arg1);
			this.keyframes[var5] = keyframe;
			if (lastKeyframe != null) {
				lastKeyframe.next = keyframe;
			}
			lastKeyframe = keyframe;
		}
		this.values = new float[this.getDuration() + 1];
		for (int time = this.getStartTime(); time <= this.getEndTime(); time++) {
			this.values[time - this.getStartTime()] = CurveEvaluator.evaluate(this, (float) time);
		}
		this.firstValue = CurveEvaluator.evaluate(this, (float) (this.getStartTime() - 1));
		this.lastValue = CurveEvaluator.evaluate(this, (float) (this.getEndTime() + 1));
		return keyframeCount;
	}

	@ObfuscatedName("dn.n(II)F")
	public float getValue(int time) {
		if (time < this.getStartTime()) {
			return this.firstValue;
		} else if (time > this.getEndTime()) {
			return this.lastValue;
		} else {
			return this.values[time - this.getStartTime()];
		}
	}

	@ObfuscatedName("dn.m(I)I")
	public int getStartTime() {
		return this.keyframes == null ? 0 : this.keyframes[0].time;
	}

	@ObfuscatedName("dn.k(I)I")
	public int getEndTime() {
		return this.keyframes == null ? 0 : this.keyframes[this.getKeyframeCount() - 1].time;
	}

	@ObfuscatedName("dn.f(I)I")
	public int getDuration() {
		return this.getEndTime() - this.getStartTime();
	}

	@ObfuscatedName("dn.w(FB)I")
	public int getKeyframeIndexByTime(float arg0) {
		if (this.field1446 >= 0 && (float) this.keyframes[this.field1446].time <= arg0 && (this.keyframes[this.field1446].next == null || (float) this.keyframes[this.field1446].next.time > arg0)) {
			return this.field1446;
		} else if (arg0 < (float) this.getStartTime() || arg0 > (float) this.getEndTime()) {
			return -1;
		} else {
			int count = this.getKeyframeCount();
			int var3 = this.field1446;
			if (count > 0) {
				int low = 0;
				int high = count - 1;
				// binary search
				do {
					int mid = low + high >> 1;
					if (arg0 < (float) this.keyframes[mid].time) {
						if (arg0 > (float) this.keyframes[mid - 1].time) {
							var3 = mid - 1;
							break;
						}
						high = mid - 1;
					} else {
						if (!(arg0 > (float) this.keyframes[mid].time)) {
							var3 = mid;
							break;
						}
						if (arg0 < (float) this.keyframes[mid + 1].time) {
							var3 = mid;
							break;
						}
						low = mid + 1;
					}
				} while (low <= high);
			}
			if (this.field1446 != var3) {
				this.field1446 = var3;
				this.field1445 = true;
			}
			return this.field1446;
		}
	}

	@ObfuscatedName("dn.l(FI)Ley;")
	public KeyFrame getKeyframeByTime(float time) {
		int index = this.getKeyframeIndexByTime(time);
		return index >= 0 && index < this.keyframes.length ? this.keyframes[index] : null;
	}

	@ObfuscatedName("dn.u(I)I")
	public int getKeyframeCount() {
		return this.keyframes == null ? 0 : this.keyframes.length;
	}
}
