package me.dordsor21.MyPetGUI;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Main
extends JavaPlugin
implements Listener
{
	public void onEnable()
	{
		getServer().getPluginManager().registerEvents(this, this);
	}

	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args)
	{
		if ((cmd.getName().equalsIgnoreCase("pet") && (sender instanceof Player)))
		{
			Player player = (Player)sender;
			if(player.hasPermission("mypetgui.use"))
			{
				Inventory inv = Bukkit.createInventory(null, 36,ChatColor.DARK_PURPLE + "Pets - " + ChatColor.UNDERLINE + "Pick a Pet!");

				if(player.hasPermission("mypetgui.cow")){
					ItemStack cowegg = new ItemStack(383, 1, (short)92);
					ItemMeta cowmeta = cowegg.getItemMeta();
					cowmeta.setDisplayName(ChatColor.YELLOW + "COW");
					cowegg.setItemMeta(cowmeta);
					inv.setItem(0, cowegg);
				}
				if(player.hasPermission("mypetgui.chicken")){
					ItemStack chickenegg = new ItemStack(383, 1, (short)93);
					ItemMeta chickenmeta = chickenegg.getItemMeta();
					chickenmeta.setDisplayName(ChatColor.YELLOW + "CHICKEN");
					chickenegg.setItemMeta(chickenmeta);
					inv.setItem(1, chickenegg);
				}
				if(player.hasPermission("mypetgui.pig")){
					ItemStack pigegg = new ItemStack(383, 1, (short)90);
					ItemMeta pigmeta = pigegg.getItemMeta();
					pigmeta.setDisplayName(ChatColor.YELLOW + "PIG");
					pigegg.setItemMeta(pigmeta);
					inv.setItem(2, pigegg);
				}
				if(player.hasPermission("mypetgui.sheep")){
					ItemStack sheepegg = new ItemStack(383, 1, (short)91);
					ItemMeta sheepmeta = sheepegg.getItemMeta();
					sheepmeta.setDisplayName(ChatColor.YELLOW + "SHEEP");
					sheepegg.setItemMeta(sheepmeta);
					inv.setItem(3, sheepegg);
				}
				if(player.hasPermission("mypetgui.rabbit")){
					ItemStack rabbitegg = new ItemStack(383, 1,(short)101);
					ItemMeta rabbitmeta = rabbitegg.getItemMeta();
					rabbitmeta.setDisplayName(ChatColor.YELLOW + "RABBIT");
					rabbitegg.setItemMeta(rabbitmeta);
					inv.setItem(4, rabbitegg);
				}
				if(player.hasPermission("mypetgui.wolf")){
					ItemStack wolfegg = new ItemStack(383, 1,(short)95);
					ItemMeta wolfmeta = wolfegg.getItemMeta();
					wolfmeta.setDisplayName(ChatColor.YELLOW + "WOLF");
					wolfegg.setItemMeta(wolfmeta);
					inv.setItem(5, wolfegg);
				}
				if(player.hasPermission("mypetgui.ocelot")){
					ItemStack ocelotegg = new ItemStack(383, 1, (short)98);
					ItemMeta ocelotmeta = ocelotegg.getItemMeta();
					ocelotmeta.setDisplayName(ChatColor.YELLOW + "OCELOT");
					ocelotegg.setItemMeta(ocelotmeta);
					inv.setItem(6, ocelotegg);
				}
				if(player.hasPermission("mypetgui.squid")){
					ItemStack squidegg = new ItemStack(383, 1, (short)94);
					ItemMeta squidmeta = squidegg.getItemMeta();
					squidmeta.setDisplayName(ChatColor.YELLOW + "SQUID");
					squidegg.setItemMeta(squidmeta);
					inv.setItem(7, squidegg);
				}
				if(player.hasPermission("mypetgui.mooshroom")){
					ItemStack mooshroomegg = new ItemStack(383, 1, (short)96);
					ItemMeta mooshroommeta = mooshroomegg.getItemMeta();
					mooshroommeta.setDisplayName(ChatColor.YELLOW + "MOOSHROOM");
					mooshroomegg.setItemMeta(mooshroommeta);
					inv.setItem(8, mooshroomegg);
				}
				if(player.hasPermission("mypetgui.bat")){
					ItemStack bategg = new ItemStack(383, 1, (short)65);
					ItemMeta batmeta = bategg.getItemMeta();
					batmeta.setDisplayName(ChatColor.YELLOW + "BAT");
					bategg.setItemMeta(batmeta);
					inv.setItem(9, bategg);
				}
				if(player.hasPermission("mypetgui.horse")){
					ItemStack horseegg = new ItemStack(383, 1, (short)100);
					ItemMeta horsemeta = horseegg.getItemMeta();
					horsemeta.setDisplayName(ChatColor.YELLOW + "HORSE");
					horseegg.setItemMeta(horsemeta);
					inv.setItem(10, horseegg);
				}
				if(player.hasPermission("mypetgui.villager")){
					ItemStack testificateegg = new ItemStack(383, 1, (short)120);
					ItemMeta testificatemeta = testificateegg.getItemMeta();
					testificatemeta.setDisplayName(ChatColor.YELLOW + "VILLAGER");
					testificateegg.setItemMeta(testificatemeta);
					inv.setItem(11, testificateegg);
				}
				if(player.hasPermission("mypetgui.snowman")){
					ItemStack snowmanegg = new ItemStack(80, 1, (short) 0);
					ItemMeta snowmanmeta = snowmanegg.getItemMeta();
					snowmanmeta.setDisplayName(ChatColor.YELLOW + "SNOWMAN");
					snowmanegg.setItemMeta(snowmanmeta);
					inv.setItem(12, snowmanegg);
				}
				if(player.hasPermission("mypetgui.golem")){
					ItemStack golemegg = new ItemStack(42, 1, (short) 0);
					ItemMeta golemmeta = golemegg.getItemMeta();
					golemmeta.setDisplayName(ChatColor.YELLOW + "IRON GOLEM");
					golemegg.setItemMeta(golemmeta);
					inv.setItem(13, golemegg);
				}
				if(player.hasPermission("mypetgui.pigman")){
					ItemStack pigmanegg = new ItemStack(383, 1, (short)57);
					ItemMeta pigmanmeta = pigmanegg.getItemMeta();
					pigmanmeta.setDisplayName(ChatColor.YELLOW + "PIGMAN");
					pigmanegg.setItemMeta(pigmanmeta);
					inv.setItem(14, pigmanegg);
				}
				if(player.hasPermission("mypetgui.blaze")){
					ItemStack blazeegg = new ItemStack(383, 1, (short)61);
					ItemMeta blazemeta = blazeegg.getItemMeta();
					blazemeta.setDisplayName(ChatColor.YELLOW + "BLAZE");
					blazeegg.setItemMeta(blazemeta);
					inv.setItem(15, blazeegg);
				}
				if(player.hasPermission("mypetgui.ghast")){
					ItemStack ghastegg = new ItemStack(383, 1, (short)56);
					ItemMeta ghastmeta = ghastegg.getItemMeta();
					ghastmeta.setDisplayName(ChatColor.YELLOW + "GHAST");
					ghastegg.setItemMeta(ghastmeta);
					inv.setItem(16, ghastegg);
				}
				if(player.hasPermission("mypetgui.magmacube")){
					ItemStack magmacubeegg = new ItemStack(383, 1, (short)62);
					ItemMeta magmacubemeta = magmacubeegg.getItemMeta();
					magmacubemeta.setDisplayName(ChatColor.YELLOW + "MAGMA CUBE");
					magmacubeegg.setItemMeta(magmacubemeta);
					inv.setItem(17, magmacubeegg);
				}
				if(player.hasPermission("mypetgui.slime")){
					ItemStack slimeegg = new ItemStack(383, 1, (short)55);
					ItemMeta slimemeta = slimeegg.getItemMeta();
					slimemeta.setDisplayName(ChatColor.YELLOW + "SLIME");
					slimeegg.setItemMeta(slimemeta);
					inv.setItem(18, slimeegg);
				}
				if(player.hasPermission("mypetgui.cavespider")){
					ItemStack cavespideregg = new ItemStack(383, 1, (short)59);
					ItemMeta cavespidermeta = cavespideregg.getItemMeta();
					cavespidermeta.setDisplayName(ChatColor.YELLOW + "CAVESPIDER");
					cavespideregg.setItemMeta(cavespidermeta);
					inv.setItem(19, cavespideregg);
				}
				if(player.hasPermission("mypetgui.skeleton")){
					ItemStack skeletonegg = new ItemStack(383, 1, (short)51);
					ItemMeta skeletonmeta = skeletonegg.getItemMeta();
					skeletonmeta.setDisplayName(ChatColor.YELLOW + "SKELETON");
					skeletonegg.setItemMeta(skeletonmeta);
					inv.setItem(20, skeletonegg);
				}
				if(player.hasPermission("mypetgui.zombie")){
					ItemStack zombieegg = new ItemStack(383, 1, (short)54);
					ItemMeta zombiemeta = zombieegg.getItemMeta();
					zombiemeta.setDisplayName(ChatColor.YELLOW + "ZOMBIE");
					zombieegg.setItemMeta(zombiemeta);
					inv.setItem(21, zombieegg);
				}
				if(player.hasPermission("mypetgui.creeper")){
					ItemStack creeperegg = new ItemStack(383, 1, (short)50);
					ItemMeta creepermeta = creeperegg.getItemMeta();
					creepermeta.setDisplayName(ChatColor.YELLOW + "CREEPER");
					creeperegg.setItemMeta(creepermeta);
					inv.setItem(22, creeperegg);
				}
				if(player.hasPermission("mypetgui.witch")){
					ItemStack witchegg = new ItemStack(383, 1, (short)66);
					ItemMeta witchmeta = witchegg.getItemMeta();
					witchmeta.setDisplayName(ChatColor.YELLOW + "WITCH");
					witchegg.setItemMeta(witchmeta);
					inv.setItem(23, witchegg);
				}
				if(player.hasPermission("mypetgui.spider")){
					ItemStack spideregg = new ItemStack(383, 1, (short)52);
					ItemMeta spidermeta = spideregg.getItemMeta();
					spidermeta.setDisplayName(ChatColor.YELLOW + "SPIDER");
					spideregg.setItemMeta(spidermeta);
					inv.setItem(24, spideregg);
				}
				if(player.hasPermission("mypetgui.silverfish")){
					ItemStack silverfishegg = new ItemStack(383, 1, (short)60);
					ItemMeta silverfishmeta = silverfishegg.getItemMeta();
					silverfishmeta.setDisplayName(ChatColor.YELLOW + "SILVERFISH");
					silverfishegg.setItemMeta(silverfishmeta);
					inv.setItem(25, silverfishegg);
				}
				if(player.hasPermission("mypetgui.guardian")){
					ItemStack guardianegg = new ItemStack(383, 1, (short)68);
					ItemMeta guardianmeta = guardianegg.getItemMeta();
					guardianmeta.setDisplayName(ChatColor.YELLOW + "GUARDIAN");
					guardianegg.setItemMeta(guardianmeta);
					inv.setItem(26, guardianegg);
				}
				if(player.hasPermission("mypetgui.enderman")){
					ItemStack endermanegg = new ItemStack(383, 1, (short)58);
					ItemMeta endermanmeta = endermanegg.getItemMeta();
					endermanmeta.setDisplayName(ChatColor.YELLOW + "ENDERMAN");
					endermanegg.setItemMeta(endermanmeta);
					inv.setItem(27, endermanegg);
				}
				if(player.hasPermission("mypetgui.endermite")){
					ItemStack endermiteegg = new ItemStack(383, 1, (short)67);
					ItemMeta endermitemeta = endermiteegg.getItemMeta();
					endermitemeta.setDisplayName(ChatColor.YELLOW + "ENDERMITE");
					endermiteegg.setItemMeta(endermitemeta);
					inv.setItem(28, endermiteegg);
				}
				if(player.hasPermission("mypetgui.wither")){
					ItemStack witherhead = new ItemStack(397, 1, (short)1);
					ItemMeta withermeta = witherhead.getItemMeta();
					withermeta.setDisplayName(ChatColor.YELLOW + "WITHER");
					witherhead.setItemMeta(withermeta);
					inv.setItem(29, witherhead);
				}
				if(player.hasPermission("mypetgui.giant")){
					ItemStack gianthead = new ItemStack(397, 1, (short)2);
					ItemMeta giantmeta = gianthead.getItemMeta();
					giantmeta.setDisplayName(ChatColor.YELLOW + "GIANT");
					gianthead.setItemMeta(giantmeta);
					inv.setItem(30, gianthead);
				}
				ItemStack arrow = new ItemStack(Material.ARROW, 1);
				ItemMeta arrowmeta = arrow.getItemMeta();
				arrowmeta.setDisplayName(ChatColor.RED + "Remove pet");
				ArrayList<String> arrowlore = new ArrayList<String>();
				arrowlore.add(ChatColor.AQUA + "Got a fat mob trailin' behind ya?");
				arrowlore.add(ChatColor.AQUA + "Wanna send it along?");
				arrowlore.add(ChatColor.AQUA + "Hit this arrow!");
				arrowmeta.setLore(arrowlore);
				arrow.setItemMeta(arrowmeta);
				inv.setItem(35, arrow);

				player.openInventory(inv);
			}else
				player.sendMessage(ChatColor.RED + "You do not have permission to use this command!" + ChatColor.LIGHT_PURPLE + "Donate at athion.minecraftmarket.com to gain permission!");
		}
		return false;
	}

	@EventHandler
	public void onInvClick(InventoryClickEvent event)
	{
		Player player = (Player) event.getWhoClicked();
		if(event.getInventory().getName().contains("Pick a Pet!")){
			if(event.getCurrentItem() == null) {
				return;
			}else{
				String p = player.getName();
				if (event.getCurrentItem().hasItemMeta())
				{
					event.setCancelled(true);
					if (event.getCurrentItem().getDurability() == 92)
					{
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin create " + p + " cow");
						player.closeInventory();
					}
					else if (event.getCurrentItem().getDurability() == 93)
					{
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin create " + p + " chicken");
						player.closeInventory();
					}
					else if (event.getCurrentItem().getDurability() == 65)
					{
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin create " + p + " bat");
						player.closeInventory();
					}
					else if (event.getCurrentItem().getDurability() == 95)
					{
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin create " + p + " wolf");
						player.closeInventory();
					}
					else if (event.getCurrentItem().getDurability() == 100)
					{
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin create " + p + " horse");
						player.closeInventory();
					}
					else if (event.getCurrentItem().getDurability() == 101)
					{
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin create " + p + " rabbit");
						player.closeInventory();
					}
					else if (event.getCurrentItem().getDurability() == 120)
					{
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin create " + p + " villager");
						player.closeInventory();
					}
					else if (event.getCurrentItem().getType() == Material.SNOW_BLOCK)
					{
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin create " + p + " snowman");
						player.closeInventory();
					}
					else if (event.getCurrentItem().getType() == Material.IRON_BLOCK)
					{
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin create " + p + " irongolem");
						player.closeInventory();
					}
					else if (event.getCurrentItem().getDurability() == 94)
					{
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin create " + p + " squid");
						player.closeInventory();
					}
					else if (event.getCurrentItem().getDurability() == 96)
					{
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin create " + p + " mushroom");
						player.closeInventory();
					}
					else if (event.getCurrentItem().getDurability() == 90)
					{
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin create " + p + " pig");
						player.closeInventory();
					}
					else if (event.getCurrentItem().getDurability() == 91)
					{
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin create " + p + " sheep");
						player.closeInventory();
					}
					else if (event.getCurrentItem().getDurability() == 57)
					{
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin create " + p + " pigzombie");
						player.closeInventory();
					}
					else if (event.getCurrentItem().getDurability() == 56)
					{
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin create " + p + " ghast");
						player.closeInventory();
					}
					else if (event.getCurrentItem().getDurability() == 62)
					{
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin create " + p + " magmacube");
						player.closeInventory();
					}
					else if (event.getCurrentItem().getDurability() == 61)
					{
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin create " + p + " blaze");
						player.closeInventory();
					}
					else if (event.getCurrentItem().getDurability() == 98)
					{
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin create " + p + " ocelot");
						player.closeInventory();
					}
					else if (event.getCurrentItem().getDurability() == 51)
					{
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin create " + p + " skeleton");
						player.closeInventory();
					}
					else if (event.getCurrentItem().getDurability() == 59)
					{
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin create " + p + " cavespider");
						player.closeInventory();
					}
					else if (event.getCurrentItem().getDurability() == 60)
					{
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin create " + p + " silverfish");
						player.closeInventory();
					}
					else if (event.getCurrentItem().getDurability() == 55)
					{
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin create " + p + " slime");
						player.closeInventory();
					}
					else if (event.getCurrentItem().getDurability() == 54)
					{
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin create " + p + " zombie");
						player.closeInventory();
					}
					else if (event.getCurrentItem().getDurability() == 52)
					{
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin create " + p + " spider");
						player.closeInventory();
					}
					else if (event.getCurrentItem().getDurability() == 50)
					{
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin create " + p + " creeper");
						player.closeInventory();
					}
					else if (event.getCurrentItem().getDurability() == 66)
					{
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin create " + p + " witch");
						player.closeInventory();
					}
					else if (event.getCurrentItem().getDurability() == 68)
					{
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin create " + p + " guardian");
						player.closeInventory();
					}
					else if (event.getCurrentItem().getDurability() == 58)
					{
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin create " + p + " enderman");
						player.closeInventory();
					}
					else if (event.getCurrentItem().getDurability() == 67)
					{
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin create " + p + " endermite");
						player.closeInventory();
					}
					else if ((event.getCurrentItem().getType() == Material.SKULL_ITEM) && (event.getCurrentItem().getDurability() == 1))
					{
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin create " + p + " wither");
						player.closeInventory();
					}
					else if ((event.getCurrentItem().getType() == Material.SKULL_ITEM) && (event.getCurrentItem().getDurability() == 2))
					{
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin create " + p + " giant");
						player.closeInventory();
					}
				}
				if (event.getCurrentItem().getType() == Material.ARROW)
				{
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "petadmin remove " + p);
				}else{
					return;
				}
			}
		}
	}
}
