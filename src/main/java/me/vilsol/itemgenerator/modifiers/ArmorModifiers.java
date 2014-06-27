package me.vilsol.itemgenerator.modifiers;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import me.vilsol.itemgenerator.engine.ItemModifier;
import me.vilsol.itemgenerator.engine.ModifierCondition;
import me.vilsol.itemgenerator.engine.ModifierRange;
import me.vilsol.itemgenerator.engine.ModifierType;
import minecade.dungeonrealms.enums.ItemRarity;
import minecade.dungeonrealms.enums.ItemTier;
import minecade.dungeonrealms.enums.ItemType;

import org.bukkit.ChatColor;
import org.bukkit.inventory.meta.ItemMeta;

public class ArmorModifiers {
	
	private static List<ItemType> armor = Arrays.asList(ItemType.BOOTS, ItemType.CHESTPLATE, ItemType.LEGGINGS, ItemType.HELMET);
	private static ChatColor r = ChatColor.RED;
	private static List<String> elements = Arrays.asList("FIRE", "ICE", "POISON");

	public class HPRegen extends ItemModifier {

		public HPRegen() {
			super(armor, 100, r + "HP REGEN: +", " HP/s");
			addCondition(new ModifierCondition(ItemTier.T1, null, new ModifierRange(ModifierType.RANGE, 5, 15)).setReplacement(ArmorModifiers.EnergyRegen.class));
			addCondition(new ModifierCondition(ItemTier.T2, null, new ModifierRange(ModifierType.RANGE, 10, 25)).setReplacement(ArmorModifiers.EnergyRegen.class));
			addCondition(new ModifierCondition(ItemTier.T3, null, new ModifierRange(ModifierType.RANGE, 35, 55)).setReplacement(ArmorModifiers.EnergyRegen.class));
			addCondition(new ModifierCondition(ItemTier.T4, null, new ModifierRange(ModifierType.RANGE, 60, 75)).setReplacement(ArmorModifiers.EnergyRegen.class));
			addCondition(new ModifierCondition(ItemTier.T5, null, new ModifierRange(ModifierType.RANGE, 80, 120)).setReplacement(ArmorModifiers.EnergyRegen.class));
		}
		
	}
	
	public class MainArmor extends ItemModifier {

		public MainArmor() {
			super(Arrays.asList(ItemType.CHESTPLATE, ItemType.LEGGINGS), 100, r + "ARMOR: ", "%"); // 50% chance for DPS, 50% for armor
			
			addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.COMMON, new ModifierRange(ModifierType.TRIPLE, 1, 1, 1)).setReplacement(MainDPS.class));
			addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.TRIPLE, 1, 2, 3)).setReplacement(MainDPS.class));
			addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.RARE, new ModifierRange(ModifierType.TRIPLE, 1, 2, 3)).setReplacement(MainDPS.class));
			addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.UNIQUE, new ModifierRange(ModifierType.TRIPLE, 1, 2, 3)).setReplacement(MainDPS.class));

			addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.COMMON, new ModifierRange(ModifierType.TRIPLE, 1, 2, 3)).setReplacement(MainDPS.class));
			addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.TRIPLE, 3, 4, 5)).setReplacement(MainDPS.class));
			addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.RARE, new ModifierRange(ModifierType.TRIPLE, 5, 6, 7)).setReplacement(MainDPS.class));
			addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.UNIQUE, new ModifierRange(ModifierType.TRIPLE, 5, 6, 7)).setReplacement(MainDPS.class));

			addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.COMMON, new ModifierRange(ModifierType.TRIPLE, 5, 6, 7)).setReplacement(MainDPS.class));
			addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.TRIPLE, 6, 9, 10)).setReplacement(MainDPS.class));
			addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.RARE, new ModifierRange(ModifierType.TRIPLE, 8, 9, 10)).setReplacement(MainDPS.class));
			addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.UNIQUE, new ModifierRange(ModifierType.TRIPLE, 8, 9, 11)).setReplacement(MainDPS.class));

			addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.COMMON, new ModifierRange(ModifierType.TRIPLE, 8, 9, 10)).setReplacement(MainDPS.class));
			addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.TRIPLE, 10, 11, 12)).setReplacement(MainDPS.class));
			addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.RARE, new ModifierRange(ModifierType.TRIPLE, 11, 12, 13)).setReplacement(MainDPS.class));
			addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.UNIQUE, new ModifierRange(ModifierType.TRIPLE, 12, 13, 14)).setReplacement(MainDPS.class));

			addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.COMMON, new ModifierRange(ModifierType.TRIPLE, 11, 12, 13)).setReplacement(MainDPS.class));
			addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.TRIPLE, 13, 14, 15)).setReplacement(MainDPS.class));
			addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.RARE, new ModifierRange(ModifierType.TRIPLE, 16, 17, 18)).setReplacement(MainDPS.class));
			addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.UNIQUE, new ModifierRange(ModifierType.TRIPLE, 17, 18, 19)).setReplacement(MainDPS.class));
			
			setOrderPriority(1);
		}
		
	}
	
	public class OtherArmor extends ItemModifier {

		public OtherArmor() {
			super(Arrays.asList(ItemType.HELMET, ItemType.BOOTS), 100, r + "ARMOR: ", "%"); // 50% chance for DPS, 50% for armor
			
			addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.COMMON, new ModifierRange(ModifierType.TRIPLE, 1, 1, 1)).setReplacement(OtherDPS.class));
			addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.TRIPLE, 1, 1, 2)).setReplacement(OtherDPS.class));
			addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.RARE, new ModifierRange(ModifierType.TRIPLE, 1, 1, 2)).setReplacement(OtherDPS.class));
			addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.UNIQUE, new ModifierRange(ModifierType.TRIPLE, 1, 1, 2)).setReplacement(OtherDPS.class));

			addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.COMMON, new ModifierRange(ModifierType.TRIPLE, 1, 1, 2)).setReplacement(OtherDPS.class));
			addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.TRIPLE, 2, 2, 3)).setReplacement(OtherDPS.class));
			addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.RARE, new ModifierRange(ModifierType.TRIPLE, 3, 3, 4)).setReplacement(OtherDPS.class));
			addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.UNIQUE, new ModifierRange(ModifierType.TRIPLE, 3, 3, 4)).setReplacement(OtherDPS.class));

			addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.COMMON, new ModifierRange(ModifierType.TRIPLE, 3, 3, 4)).setReplacement(OtherDPS.class));
			addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.TRIPLE, 3, 5, 5)).setReplacement(OtherDPS.class));
			addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.RARE, new ModifierRange(ModifierType.TRIPLE, 4, 5, 5)).setReplacement(OtherDPS.class));
			addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.UNIQUE, new ModifierRange(ModifierType.TRIPLE, 4, 5, 6)).setReplacement(OtherDPS.class));

			addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.COMMON, new ModifierRange(ModifierType.TRIPLE, 4, 5, 5)).setReplacement(OtherDPS.class));
			addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.TRIPLE, 5, 6, 6)).setReplacement(OtherDPS.class));
			addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.RARE, new ModifierRange(ModifierType.TRIPLE, 6, 6, 7)).setReplacement(OtherDPS.class));
			addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.UNIQUE, new ModifierRange(ModifierType.TRIPLE, 6, 7, 7)).setReplacement(OtherDPS.class));

			addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.COMMON, new ModifierRange(ModifierType.TRIPLE, 6, 6, 7)).setReplacement(OtherDPS.class));
			addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.TRIPLE, 7, 7, 8)).setReplacement(OtherDPS.class));
			addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.RARE, new ModifierRange(ModifierType.TRIPLE, 8, 9, 9)).setReplacement(OtherDPS.class));
			addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.UNIQUE, new ModifierRange(ModifierType.TRIPLE, 9, 9, 10)).setReplacement(OtherDPS.class));
			
			setOrderPriority(1);
		}
		
	}
	
	public class MainDPS extends ItemModifier {

        public MainDPS() {
            super(Arrays.asList(ItemType.CHESTPLATE, ItemType.LEGGINGS), 50, r + "DPS: ", "%"); // 50% chance for DPS, 50% for armor
            
            addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.COMMON, new ModifierRange(ModifierType.TRIPLE, 1, 1, 1)));
            addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.TRIPLE, 1, 2, 3)));
            addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.RARE, new ModifierRange(ModifierType.TRIPLE, 1, 2, 3)));
            addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.UNIQUE, new ModifierRange(ModifierType.TRIPLE, 1, 2, 3)));

            addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.COMMON, new ModifierRange(ModifierType.TRIPLE, 1, 2, 3)));
            addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.TRIPLE, 3, 4, 5)));
            addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.RARE, new ModifierRange(ModifierType.TRIPLE, 5, 6, 7)));
            addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.UNIQUE, new ModifierRange(ModifierType.TRIPLE, 5, 6, 7)));

            addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.COMMON, new ModifierRange(ModifierType.TRIPLE, 5, 6, 7)));
            addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.TRIPLE, 6, 9, 10)));
            addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.RARE, new ModifierRange(ModifierType.TRIPLE, 8, 9, 10)));
            addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.UNIQUE, new ModifierRange(ModifierType.TRIPLE, 8, 9, 11)));

            addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.COMMON, new ModifierRange(ModifierType.TRIPLE, 8, 9, 10)));
            addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.TRIPLE, 10, 11, 12)));
            addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.RARE, new ModifierRange(ModifierType.TRIPLE, 11, 12, 13)));
            addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.UNIQUE, new ModifierRange(ModifierType.TRIPLE, 12, 13, 14)));

            addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.COMMON, new ModifierRange(ModifierType.TRIPLE, 11, 12, 13)));
            addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.TRIPLE, 13, 14, 15)));
            addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.RARE, new ModifierRange(ModifierType.TRIPLE, 16, 17, 18)));
            addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.UNIQUE, new ModifierRange(ModifierType.TRIPLE, 17, 18, 19)));
            
            setOrderPriority(1);
        }
        
    }
	
	public class OtherDPS extends ItemModifier {

        public OtherDPS() {
            super(Arrays.asList(ItemType.HELMET, ItemType.BOOTS), 50, r + "DPS: ", "%"); // 50% chance for DPS, 50% for armor
            
            addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.COMMON, new ModifierRange(ModifierType.TRIPLE, 1, 1, 1)));
            addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.TRIPLE, 1, 1, 2)));
            addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.RARE, new ModifierRange(ModifierType.TRIPLE, 1, 1, 2)));
            addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.UNIQUE, new ModifierRange(ModifierType.TRIPLE, 1, 1, 2)));

            addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.COMMON, new ModifierRange(ModifierType.TRIPLE, 1, 1, 2)));
            addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.TRIPLE, 2, 2, 3)));
            addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.RARE, new ModifierRange(ModifierType.TRIPLE, 3, 3, 4)));
            addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.UNIQUE, new ModifierRange(ModifierType.TRIPLE, 3, 3, 4)));

            addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.COMMON, new ModifierRange(ModifierType.TRIPLE, 3, 3, 4)));
            addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.TRIPLE, 3, 5, 5)));
            addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.RARE, new ModifierRange(ModifierType.TRIPLE, 4, 5, 5)));
            addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.UNIQUE, new ModifierRange(ModifierType.TRIPLE, 4, 5, 6)));

            addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.COMMON, new ModifierRange(ModifierType.TRIPLE, 4, 5, 5)));
            addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.TRIPLE, 5, 6, 6)));
            addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.RARE, new ModifierRange(ModifierType.TRIPLE, 6, 6, 7)));
            addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.UNIQUE, new ModifierRange(ModifierType.TRIPLE, 6, 7, 7)));

            addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.COMMON, new ModifierRange(ModifierType.TRIPLE, 6, 6, 7)));
            addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.TRIPLE, 7, 7, 8)));
            addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.RARE, new ModifierRange(ModifierType.TRIPLE, 8, 9, 9)));
            addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.UNIQUE, new ModifierRange(ModifierType.TRIPLE, 9, 9, 10)));
            
            setOrderPriority(1);
        }
        
    }
	
//	public class HP extends ItemModifier {
//
//		public HP() {
//			super(armor, 100, r + "HP: +", null);
//
//			addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 10, 20)));
//			addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 20, 50)));
//			addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 80, 120)));
//			addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 88, 132)));
//
//			addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 60, 80)));
//			addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 100, 250)));
//			addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 250, 350)));
//			addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 275, 385)));
//
//			addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 200, 350)));
//			addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 350, 600)));
//			addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 600, 800)));
//			addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 660, 880)));
//
//			addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 600, 800)));
//			addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 800, 1300)));
//			addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 1300, 2400)));
//			addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 1430, 2640)));
//
//			addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 1500, 2500)));
//			addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 2500, 3600)));
//			addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 3600, 5400)));
//			addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 3960, 5940)));
//			
//		}
//		
//	}
	
	public class ChestplateHP extends ItemModifier {

        public ChestplateHP() {
            super(Arrays.asList(ItemType.CHESTPLATE), 100, r + "HP: +", null);

            addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 10, 90)));
            addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 90, 150)));
            addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 150, 180)));
            addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 180, 240)));

            addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 300, 420)));
            addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 420, 500)));
            addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 500, 560)));
            addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 560, 580)));

            addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 700, 900)));
            addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 900, 1100)));
            addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 1100, 1250)));
            addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 1250, 1350)));

            addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 2000, 2900)));
            addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 2900, 3500)));
            addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 3500, 4000)));
            addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 4000, 4300)));

            addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 5500, 7500)));
            addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 7500, 8900)));
            addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 8900, 9900)));
            addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 9900, 10600)));
            
            setOrderPriority(2);
        }
        
    }
	
	public class LeggingsHP extends ItemModifier {

        public LeggingsHP() {
            super(Arrays.asList(ItemType.LEGGINGS), 100, r + "HP: +", null);

            addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 10, 90)));
            addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 90, 150)));
            addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 150, 180)));
            addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 180, 240)));

            addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 300, 420)));
            addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 420, 500)));
            addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 500, 560)));
            addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 560, 580)));

            addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 700, 900)));
            addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 900, 1100)));
            addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 1100, 1250)));
            addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 1250, 1350)));

            addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 2000, 2900)));
            addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 2900, 3500)));
            addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 3500, 4000)));
            addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 4000, 4300)));

            addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 4400, 6000)));
            addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 6000, 7120)));
            addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 7120, 7920)));
            addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 7920, 8480)));
            
            setOrderPriority(2);
        }
        
    }
	
	// HP generation for helmets and boots
	public class OtherHP extends ItemModifier {

        public OtherHP() {
            super(Arrays.asList(ItemType.HELMET, ItemType.BOOTS), 100, r + "HP: +", null);

            addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 10, 90)));
            addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 90, 150)));
            addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 150, 180)));
            addCondition(new ModifierCondition(ItemTier.T1, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 180, 240)));

            addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 300, 420)));
            addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 420, 500)));
            addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 500, 560)));
            addCondition(new ModifierCondition(ItemTier.T2, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 560, 580)));

            addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 700, 900)));
            addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 900, 1100)));
            addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 1100, 1250)));
            addCondition(new ModifierCondition(ItemTier.T3, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 1250, 1350)));

            addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 2000, 2900)));
            addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 2900, 3500)));
            addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 3500, 4000)));
            addCondition(new ModifierCondition(ItemTier.T4, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 4000, 4300)));

            addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.COMMON, new ModifierRange(ModifierType.STATIC, 3300, 4500)));
            addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.UNCOMMON, new ModifierRange(ModifierType.STATIC, 4500, 5340)));
            addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.RARE, new ModifierRange(ModifierType.STATIC, 5340, 5940)));
            addCondition(new ModifierCondition(ItemTier.T5, ItemRarity.UNIQUE, new ModifierRange(ModifierType.STATIC, 5940, 6360)));
            
            setOrderPriority(2);
        }
        
    }
	
	public class StrDexVitInt extends ItemModifier {

		public StrDexVitInt() {
			super(armor, -1, null, null);
			addCondition(new ModifierCondition(ItemTier.T1, null, new ModifierRange(ModifierType.STATIC, 1, 15), 25));
			addCondition(new ModifierCondition(ItemTier.T2, null, new ModifierRange(ModifierType.STATIC, 1, 35), 20).setBonus(new ModifierCondition(ItemTier.T2, null, new ModifierRange(ModifierType.STATIC, 1, 35), 5).setReplacement(StrDexVitInt.class)));
			addCondition(new ModifierCondition(ItemTier.T3, null, new ModifierRange(ModifierType.STATIC, 1, 75), 15).setBonus(new ModifierCondition(ItemTier.T3, null, new ModifierRange(ModifierType.STATIC, 1, 75), 5).setReplacement(StrDexVitInt.class).setBonus(new ModifierCondition(ItemTier.T3, null, new ModifierRange(ModifierType.STATIC, 1, 75), 1).setReplacement(StrDexVitInt.class))));
			addCondition(new ModifierCondition(ItemTier.T4, null, new ModifierRange(ModifierType.STATIC, 1, 115), 15).setBonus(new ModifierCondition(ItemTier.T4, null, new ModifierRange(ModifierType.STATIC, 1, 115), 9).setReplacement(StrDexVitInt.class).setBonus(new ModifierCondition(ItemTier.T4, null, new ModifierRange(ModifierType.STATIC, 1, 115), 4).setReplacement(StrDexVitInt.class))));
			addCondition(new ModifierCondition(ItemTier.T5, null, new ModifierRange(ModifierType.STATIC, 1, 315), 20).setBonus(new ModifierCondition(ItemTier.T5, null, new ModifierRange(ModifierType.STATIC, 1, 315), 10).setReplacement(StrDexVitInt.class).setBonus(new ModifierCondition(ItemTier.T5, null, new ModifierRange(ModifierType.STATIC, 1, 315), 5).setReplacement(StrDexVitInt.class))));
		}
		
		@Override
		public String getPrefix(ItemMeta meta){
			List<String> allStats = Arrays.asList(r + "STR: +", r + "INT: +", r + "VIT: +", r + "DEX: +");
			return allStats.get(new Random().nextInt(allStats.size()));
		}
		
	}
	
	public class EnergyRegen extends ItemModifier {

		public EnergyRegen() {
			super(armor, 50, r + "ENERGY REGEN: +", "%");
			addCondition(new ModifierCondition(ItemTier.T1, null, new ModifierRange(ModifierType.RANGE, 1, 5)).setReplacement(ArmorModifiers.HPRegen.class));
			addCondition(new ModifierCondition(ItemTier.T2, null, new ModifierRange(ModifierType.RANGE, 3, 7)).setReplacement(ArmorModifiers.HPRegen.class));
			addCondition(new ModifierCondition(ItemTier.T3, null, new ModifierRange(ModifierType.RANGE, 5, 9)).setReplacement(ArmorModifiers.HPRegen.class));
			addCondition(new ModifierCondition(ItemTier.T4, null, new ModifierRange(ModifierType.RANGE, 7, 12)).setReplacement(ArmorModifiers.HPRegen.class));
			addCondition(new ModifierCondition(ItemTier.T5, null, new ModifierRange(ModifierType.RANGE, 7, 12)).setReplacement(ArmorModifiers.HPRegen.class));
			
			setOrderPriority(3);
		}
		
	}
	
	public class Thorns extends ItemModifier {

		public Thorns() {
			super(armor, -1, r + "THORNS: +", "% DMG");
			addCondition(new ModifierCondition(ItemTier.T1, null, new ModifierRange(ModifierType.STATIC, 1, 2), 3));
			addCondition(new ModifierCondition(ItemTier.T2, null, new ModifierRange(ModifierType.STATIC, 1, 3), 5));
			addCondition(new ModifierCondition(ItemTier.T3, null, new ModifierRange(ModifierType.STATIC, 1, 5), 10));
			addCondition(new ModifierCondition(ItemTier.T4, null, new ModifierRange(ModifierType.STATIC, 1, 9), 13));
			addCondition(new ModifierCondition(ItemTier.T5, null, new ModifierRange(ModifierType.STATIC, 1, 9), 20));
		}
		
	}
	
	public class Dodge extends ItemModifier {

		public Dodge() {
			super(armor, -1, r + "DODGE: ", "%");
			addCondition(new ModifierCondition(ItemTier.T1, null, new ModifierRange(ModifierType.STATIC, 1, 5), 5));
			addCondition(new ModifierCondition(ItemTier.T2, null, new ModifierRange(ModifierType.STATIC, 1, 8), 9));
			addCondition(new ModifierCondition(ItemTier.T3, null, new ModifierRange(ModifierType.STATIC, 1, 10), 15));
			addCondition(new ModifierCondition(ItemTier.T4, null, new ModifierRange(ModifierType.STATIC, 1, 12), 25));
			addCondition(new ModifierCondition(ItemTier.T5, null, new ModifierRange(ModifierType.STATIC, 1, 12), 30));
		}
		
	}
	
	public class Block extends ItemModifier {

		public Block() {
			super(armor, -1, r + "BLOCK: ", "%");
			addCondition(new ModifierCondition(ItemTier.T1, null, new ModifierRange(ModifierType.STATIC, 1, 5), 5));
			addCondition(new ModifierCondition(ItemTier.T2, null, new ModifierRange(ModifierType.STATIC, 1, 8), 9));
			addCondition(new ModifierCondition(ItemTier.T3, null, new ModifierRange(ModifierType.STATIC, 1, 10), 15));
			addCondition(new ModifierCondition(ItemTier.T4, null, new ModifierRange(ModifierType.STATIC, 1, 12), 25));
			addCondition(new ModifierCondition(ItemTier.T5, null, new ModifierRange(ModifierType.STATIC, 1, 12), 30));
		}
		
	}
	
	public class Resistances extends ItemModifier {

		public Resistances() {
			super(armor, -1, null, "%");
			addCondition(new ModifierCondition(ItemTier.T1, null, new ModifierRange(ModifierType.STATIC, 1, 5), 15));
			addCondition(new ModifierCondition(ItemTier.T2, null, new ModifierRange(ModifierType.STATIC, 1, 7), 15));
			addCondition(new ModifierCondition(ItemTier.T3, null, new ModifierRange(ModifierType.STATIC, 1, 20), 25));
			addCondition(new ModifierCondition(ItemTier.T4, null, new ModifierRange(ModifierType.STATIC, 1, 32), 20));
			addCondition(new ModifierCondition(ItemTier.T5, null, new ModifierRange(ModifierType.STATIC, 1, 45), 30));
		}
		
		@Override
		public String getPrefix(ItemMeta meta){
			return r + elements.get(new Random().nextInt(elements.size())) + " RESISTANCE:";
		}
		
	}
	
	public class Reflection extends ItemModifier {

		public Reflection() {
			super(armor, -1, r + "REFLECTION: ", "%");
			addCondition(new ModifierCondition(ItemTier.T1, null, new ModifierRange(ModifierType.STATIC, 1, 1), 3));
			addCondition(new ModifierCondition(ItemTier.T2, null, new ModifierRange(ModifierType.STATIC, 1, 2), 5));
			addCondition(new ModifierCondition(ItemTier.T3, null, new ModifierRange(ModifierType.STATIC, 1, 4), 10));
			addCondition(new ModifierCondition(ItemTier.T4, null, new ModifierRange(ModifierType.STATIC, 1, 5), 13));
			addCondition(new ModifierCondition(ItemTier.T5, null, new ModifierRange(ModifierType.STATIC, 1, 5), 15));
		}
		
	}
	
	public class GemFind extends ItemModifier {

		public GemFind() {
			super(armor, -1, r + "GEM FIND: ", "%");
			addCondition(new ModifierCondition(ItemTier.T1, null, new ModifierRange(ModifierType.STATIC, 1, 5), 5));
			addCondition(new ModifierCondition(ItemTier.T2, null, new ModifierRange(ModifierType.STATIC, 1, 8), 5));
			addCondition(new ModifierCondition(ItemTier.T3, null, new ModifierRange(ModifierType.STATIC, 1, 15), 5));
			addCondition(new ModifierCondition(ItemTier.T4, null, new ModifierRange(ModifierType.STATIC, 1, 20), 5));
			addCondition(new ModifierCondition(ItemTier.T5, null, new ModifierRange(ModifierType.STATIC, 1, 20), 5));
		}
		
	}
	
	public class ItemFind extends ItemModifier {

		public ItemFind() {
			super(armor, -1, r + "ITEM FIND: +", "%");
			addCondition(new ModifierCondition(ItemTier.T1, null, new ModifierRange(ModifierType.STATIC, 1, 1), 5));
			addCondition(new ModifierCondition(ItemTier.T2, null, new ModifierRange(ModifierType.STATIC, 1, 2), 5));
			addCondition(new ModifierCondition(ItemTier.T3, null, new ModifierRange(ModifierType.STATIC, 1, 3), 5));
			addCondition(new ModifierCondition(ItemTier.T4, null, new ModifierRange(ModifierType.STATIC, 1, 4), 5));
			addCondition(new ModifierCondition(ItemTier.T5, null, new ModifierRange(ModifierType.STATIC, 1, 4), 5));
		}
		
	}
	
}
