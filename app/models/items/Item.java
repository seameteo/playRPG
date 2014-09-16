package models.items;

import models.Charactor;

public class Item {

	/**
	 * なまえ
	 * @return
	 */
	public String getName() {
		return "謎";
	}
	
	/**
	 * せつめい
	 * @return
	 */
	public String getDesp() {
		return "謎";
	}
	
	/**
	 * せつめい2
	 * @return
	 */
	public String getDespAfterUse(Used used) {
		return "このアイテムは使えない。";
	}
	
	/**
	 * アイテムタイプ
	 * @return
	 */
	public Type getType() {
		return Type.UNUSE;
	}
	
	/**
	 * 使用時の処理
	 * 武器装備時にどうなるかもここに書く
	 * @param c
	 */
	public Used onUse(Charactor c) {
		return Used.NOUSE;
	}
	
	// ===============================================
	
	public static enum Type {
		UNUSE,
		CONSUME,
		WEAPON,
		ARMOR,
		SHIELD,
		RING,
		AMULET
	}
	public static enum Used {
		OK,
		NOUSE,
		NONECESSARY
	}
	
	public static Item createByInt(int i) {
		switch (i) {
			
		}
		return new Item();
	}
}