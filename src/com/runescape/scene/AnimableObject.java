package com.runescape.scene;
import com.runescape.cache.anim.Frame;
import com.runescape.cache.anim.Graphic;
import com.runescape.entity.Renderable;
import com.runescape.entity.model.Model;

public final class AnimableObject extends Renderable {
	
	public final int anInt1560;
	public final int anInt1561;
	public final int anInt1562;
	public final int anInt1563;
	public final int anInt1564;
	public boolean aBoolean1567;
	private final Graphic aSpotAnim_1568;
	private int anInt1569;
	private int anInt1570;

	public AnimableObject(int i, int j, int l, int i1, int j1, int k1, int l1) {
		aBoolean1567 = false;
		aSpotAnim_1568 = Graphic.cache[i1];
		anInt1560 = i;
		anInt1561 = l1;
		anInt1562 = k1;
		anInt1563 = j1;
		anInt1564 = j + l;
		aBoolean1567 = false;
	}

	public Model getRotatedModel() {
		Model model = aSpotAnim_1568.getModel();
		if(model == null) {
			return null;
		}
		int j = aSpotAnim_1568.animationSequence.primaryFrames[anInt1569];
		Model model_1 = new Model(true, Frame.method532(j), false, model);
		if(!aBoolean1567) {
			model_1.skin();
			model_1.apply(j);
			model_1.faceGroups = null;
			model_1.vertexGroups = null;
		}
		if(aSpotAnim_1568.resizeXY != 128 || aSpotAnim_1568.resizeZ != 128) {
			model_1.scale(aSpotAnim_1568.resizeXY, aSpotAnim_1568.resizeXY, aSpotAnim_1568.resizeZ);
		}
		if(aSpotAnim_1568.rotation != 0) {
			if(aSpotAnim_1568.rotation == 90) {
				model_1.method473();
			}
			if(aSpotAnim_1568.rotation == 180) {
				model_1.method473();
				model_1.method473();
			}
			if(aSpotAnim_1568.rotation == 270) {
				model_1.method473();
				model_1.method473();
				model_1.method473();
			}
		}
		model_1.light(64 + aSpotAnim_1568.modelBrightness, 850 + aSpotAnim_1568.modelShadow, -30, -50, -30, true);
		return model_1;
	}

	public void method454(int i) {
		for(anInt1570 += i; anInt1570 > aSpotAnim_1568.animationSequence.duration(anInt1569);) {
			anInt1570 -= aSpotAnim_1568.animationSequence.duration(anInt1569) + 1;
			anInt1569++;
			if(anInt1569 >= aSpotAnim_1568.animationSequence.frameCount && (anInt1569 < 0 || anInt1569 >= aSpotAnim_1568.animationSequence.frameCount)) {
				anInt1569 = 0;
				aBoolean1567 = true;
			}
		}
	}
}