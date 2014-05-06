package me.vilsol.betanpc;

import me.vilsol.betanpc.items.arrowmenu.SpawnTierFiveArrow;
import me.vilsol.betanpc.items.arrowmenu.SpawnTierFourArrow;
import me.vilsol.betanpc.items.arrowmenu.SpawnTierOneArrow;
import me.vilsol.betanpc.items.arrowmenu.SpawnTierThreeArrow;
import me.vilsol.betanpc.items.arrowmenu.SpawnTierTwoArrow;
import me.vilsol.betanpc.items.mainmenu.ChangeLevel;
import me.vilsol.betanpc.items.mainmenu.ExitMenu;
import me.vilsol.betanpc.items.mainmenu.SpawnGems;
import me.vilsol.betanpc.items.mainmenu.SpawnItem;
import me.vilsol.betanpc.items.mainmenu.SpawnMiscItems;
import me.vilsol.betanpc.items.mainmenu.SpawnProfessionItem;
import me.vilsol.betanpc.items.miscitemmenu.SpawnArrows;
import me.vilsol.betanpc.items.miscitemmenu.SpawnFood;
import me.vilsol.betanpc.items.miscitemmenu.SpawnOrbsOfAlteration;
import me.vilsol.betanpc.items.miscitemmenu.SpawnPotions;
import me.vilsol.betanpc.items.miscitemmenu.SpawnScrolls;
import me.vilsol.betanpc.items.miscitemmenu.SpawnTeleportBooks;
import me.vilsol.betanpc.items.potionmenu.SpawnTierFivePotion;
import me.vilsol.betanpc.items.potionmenu.SpawnTierFourPotion;
import me.vilsol.betanpc.items.potionmenu.SpawnTierOnePotion;
import me.vilsol.betanpc.items.potionmenu.SpawnTierThreePotion;
import me.vilsol.betanpc.items.potionmenu.SpawnTierTwoPotion;
import me.vilsol.betanpc.items.professionmenu.SpawnFishingRod;
import me.vilsol.betanpc.items.professionmenu.SpawnPickaxe;
import me.vilsol.betanpc.items.scrollmenu.SpawnTierFiveScrolls;
import me.vilsol.betanpc.items.scrollmenu.SpawnTierFourScrolls;
import me.vilsol.betanpc.items.scrollmenu.SpawnTierOneScrolls;
import me.vilsol.betanpc.items.scrollmenu.SpawnTierThreeScrolls;
import me.vilsol.betanpc.items.scrollmenu.SpawnTierTwoScrolls;
import me.vilsol.betanpc.items.spawnmenu.Boots;
import me.vilsol.betanpc.items.spawnmenu.Chestplate;
import me.vilsol.betanpc.items.spawnmenu.Helmet;
import me.vilsol.betanpc.items.spawnmenu.Leggings;
import me.vilsol.betanpc.items.spawnmenu.Weapon;
import me.vilsol.betanpc.items.spawnmenu.rarity.Common;
import me.vilsol.betanpc.items.spawnmenu.rarity.Rare;
import me.vilsol.betanpc.items.spawnmenu.rarity.Uncommon;
import me.vilsol.betanpc.items.spawnmenu.rarity.Unique;
import me.vilsol.betanpc.items.spawnmenu.weapons.Axe;
import me.vilsol.betanpc.items.spawnmenu.weapons.Bow;
import me.vilsol.betanpc.items.spawnmenu.weapons.Polearm;
import me.vilsol.betanpc.items.spawnmenu.weapons.Return;
import me.vilsol.betanpc.items.spawnmenu.weapons.Staff;
import me.vilsol.betanpc.items.spawnmenu.weapons.Sword;
import me.vilsol.betanpc.items.teleportmenu.TeleportToCrestguard;
import me.vilsol.betanpc.items.teleportmenu.TeleportToCyrennica;
import me.vilsol.betanpc.items.teleportmenu.TeleportToDarkOakTavern;
import me.vilsol.betanpc.items.teleportmenu.TeleportToDeadPeaks;
import me.vilsol.betanpc.items.teleportmenu.TeleportToGloomyHallows;
import me.vilsol.betanpc.items.teleportmenu.TeleportToHarrisonsFields;
import me.vilsol.betanpc.items.teleportmenu.TeleportToTripoli;
import me.vilsol.betanpc.items.teleportmenu.TeleportToTrollsbane;
import me.vilsol.betanpc.items.tiermenu.TierFive;
import me.vilsol.betanpc.items.tiermenu.TierFour;
import me.vilsol.betanpc.items.tiermenu.TierOne;
import me.vilsol.betanpc.items.tiermenu.TierThree;
import me.vilsol.betanpc.items.tiermenu.TierTwo;
import me.vilsol.betanpc.items.utils.BackToMainMenu;
import me.vilsol.betanpc.menus.ArrowMenu;
import me.vilsol.betanpc.menus.ItemSpawnMenu;
import me.vilsol.betanpc.menus.MainMenu;
import me.vilsol.betanpc.menus.MiscItemMenu;
import me.vilsol.betanpc.menus.PotionMenu;
import me.vilsol.betanpc.menus.ProfessionMenu;
import me.vilsol.betanpc.menus.ScrollMenu;
import me.vilsol.betanpc.menus.TeleportMenu;
import me.vilsol.betanpc.menus.TierMenu;
import me.vilsol.menuengine.engine.MenuModel;
import minecade.dungeonrealms.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class BetaNPC implements Listener {
	
	public void onEnable(){
		// Register Items
		
		new ChangeLevel().registerItem();
		new SpawnGems().registerItem();
		new SpawnProfessionItem().registerItem();
		new SpawnFishingRod().registerItem();
		new SpawnPickaxe().registerItem();
		new BackToMainMenu().registerItem();
		new ExitMenu().registerItem();
		new SpawnMiscItems().registerItem();
		new SpawnOrbsOfAlteration().registerItem();
		new SpawnFood().registerItem();
		new TeleportToCrestguard().registerItem();
		new TeleportToCyrennica().registerItem();
		new TeleportToDarkOakTavern().registerItem();
		new TeleportToDeadPeaks().registerItem();
		new TeleportToGloomyHallows().registerItem();
		new TeleportToHarrisonsFields().registerItem();
		new TeleportToTripoli().registerItem();
		new TeleportToTrollsbane().registerItem();
		new SpawnTeleportBooks().registerItem();
		new SpawnArrows().registerItem();
		new SpawnTierOneArrow().registerItem();
		new SpawnTierTwoArrow().registerItem();
		new SpawnTierThreeArrow().registerItem();
		new SpawnTierFourArrow().registerItem();
		new SpawnTierFiveArrow().registerItem();
		new SpawnTierOneScrolls().registerItem();
		new SpawnTierTwoScrolls().registerItem();
		new SpawnTierThreeScrolls().registerItem();
		new SpawnTierFourScrolls().registerItem();
		new SpawnTierFiveScrolls().registerItem();
		new SpawnScrolls().registerItem();
		new SpawnPotions().registerItem();
		new SpawnTierOnePotion().registerItem();
		new SpawnTierTwoPotion().registerItem();
		new SpawnTierThreePotion().registerItem();
		new SpawnTierFourPotion().registerItem();
		new SpawnTierFivePotion().registerItem();
		new TierOne().registerItem();
		new TierTwo().registerItem();
		new TierThree().registerItem();
		new TierFour().registerItem();
		new TierFive().registerItem();
		new SpawnItem().registerItem();
		new Helmet().registerItem();
		new Chestplate().registerItem();
		new Leggings().registerItem();
		new Boots().registerItem();
		new Weapon().registerItem();
		new Axe().registerItem();
		new Bow().registerItem();
		new Polearm().registerItem();
		new Return().registerItem();
		new Staff().registerItem();
		new Sword().registerItem();
		new Common().registerItem();
		new Uncommon().registerItem();
		new Rare().registerItem();
		new Unique().registerItem();
		
		// Register Menus
		
		new MainMenu();
		new ProfessionMenu();
		new MiscItemMenu();
		new TeleportMenu();
		new ArrowMenu();
		new ScrollMenu();
		new PotionMenu();
		new TierMenu();
		new ItemSpawnMenu();
		
		Bukkit.getServer().getPluginManager().registerEvents(this, Main.plugin);
	}
	
	@EventHandler
	public void onPlayerClickNPC(PlayerInteractEntityEvent e){
		if (!(e.getRightClicked() instanceof Player)) return;
		Player trader = (Player) e.getRightClicked();
		if (!(trader.hasMetadata("NPC"))) return;
		if (!(ChatColor.stripColor(trader.getName()).equalsIgnoreCase("Beta Vendor"))) return;
		e.setCancelled(true);
		MenuModel.menus.get(MainMenu.class).getMenu().showToPlayer(e.getPlayer());
	}
	
}
