package net.minecraft.src;

import java.util.Random;
import java.io.*;
import java.util.*;
import java.net.URL;
//import java.util.logging.Level;
import java.util.logging.Logger;
import net.minecraft.client.Minecraft;

public class mod_ChertCraft extends BaseMod
{
	public static Random DieRoller = new Random();
	
    public String getVersion()
    {
        return "MineCraft1.5.2__ChertCraft1.5.2r1";
    }
	
//    WOODSPEAR(0, 50, 2.0F, 1, 3),	       	    WOOD(0, 59, 2.0F, 0, 15),
//    GRAVELSPEAR(0, 80, 2.5F, 2, 6),	
//    STONESPEAR(1, 150, 3.75F, 3, 10),         STONE(1, 131, 4.0F, 1, 5),
//    SANDSTONESPEAR(1, 70, 3.75F, 2, 8),
//    PETRIFIEDCHERT(2, 380, 6.5F, 5, 14),
//    CHERT(2, 180, 4.0F, 2, 12),               IRON(2, 250, 6.0F, 2, 14),
//    BLACKCHERT(2, 300, 5.0F, 3, 18),
//    REDCHERT(3, 450, 6.0F, 6, 22),
//    NETHERQUARTZSPEAR(3, 350, 9.0F, 7, 50),   EMERALD(3, 1561, 8.0F, 3, 10),
//    COBALTCHERT(3, 600, 5.3F, 5, 18),
//    GOLDENCHERT(3, 1000, 7.0F, 10, 30);        GOLD(0, 32, 12.0F, 0, 22);
	
	public static int EnumWoodSpearPower = 0; //0
	public static int EnumGravelSpearPower = 0; //0
	public static int EnumStoneSpearPower = 1; //1
	public static int EnumSandStoneSpearPower = 1; //1
	public static int EnumPetrifiedChertPower = 2; //2
	public static int EnumChertPower = 2; //2
	public static int EnumBlackChertPower = 2; //2
	public static int EnumCobaltChertPower = 3; //3
	public static int EnumRedChertPower = 3; //3
	public static int EnumNetherQuartzSpearPower = 3; //3
	public static int EnumGoldChertPower = 3; //3
	
	public static int EnumWoodSpearUses = DieRoller.nextInt(1) + 50; //50
	public static int EnumGravelSpearUses = DieRoller.nextInt(1) + 80; //80
	public static int EnumStoneSpearUses = DieRoller.nextInt(1) + 150; //150
	public static int EnumSandStoneSpearUses = DieRoller.nextInt(1) + 70; //70
	public static int EnumPetrifiedChertUses = DieRoller.nextInt(1) + 380; //380
	public static int EnumChertUses = DieRoller.nextInt(1) + 180; //180
	public static int EnumBlackChertUses = DieRoller.nextInt(1) + 300; //300
	public static int EnumCobaltChertUses = DieRoller.nextInt(1) + 600; //600
	public static int EnumRedChertUses = DieRoller.nextInt(1) + 450; //450
	public static int EnumNetherQuartzSpearUses = DieRoller.nextInt(1) + 350; //350
	public static int EnumGoldChertUses = DieRoller.nextInt(1) + 1000; //1000
	
	public static float EnumWoodSpearSpeed = 2.0F; //2.0F
	public static float EnumGravelSpearSpeed = 2.5F; //2.5F
	public static float EnumStoneSpearSpeed = 3.75F; //3.75F
	public static float EnumSandStoneSpearSpeed = 3.225F; //3.225F
	public static float EnumPetrifiedChertSpeed = 6.5F; //6.5F
	public static float EnumChertSpeed = 4.0F; //4.0F
	public static float EnumBlackChertSpeed = 5.0F; //5.0F
	public static float EnumCobaltChertSpeed = 5.3F; //5.3F
	public static float EnumRedChertSpeed = 6.0F; //6.0F
	public static float EnumNetherQuartzSpearSpeed = 9.0F; //9.0F
	public static float EnumGoldChertSpeed = 7.0F; //7.0F
	
	public static int EnumWoodSpearDamage = DieRoller.nextInt(1) + 1; //1
	public static int EnumGravelSpearDamage = DieRoller.nextInt(1) + 2; //2
	public static int EnumStoneSpearDamage = DieRoller.nextInt(1) + 3; //3
	public static int EnumSandStoneSpearDamage = DieRoller.nextInt(1) + 2; //2
	public static int EnumPetrifiedChertDamage = DieRoller.nextInt(1) + 5; //5
	public static int EnumChertDamage = DieRoller.nextInt(1) + 2; //2
	public static int EnumBlackChertDamage = DieRoller.nextInt(1) + 3; //3
	public static int EnumCobaltChertDamage = DieRoller.nextInt(1) + 5; //5
	public static int EnumRedChertDamage = DieRoller.nextInt(1) + 6; //6
	public static int EnumNetherQuartzSpearDamage = DieRoller.nextInt(1) + 7; //7
	public static int EnumGoldChertDamage = DieRoller.nextInt(1) + 10; //10
	
	public static int EnumWoodSpearEnchant = DieRoller.nextInt(1) + 3; //3
	public static int EnumGravelSpearEnchant = DieRoller.nextInt(1) + 6; //6
	public static int EnumStoneSpearEnchant = DieRoller.nextInt(1) + 10; //10
	public static int EnumSandStoneSpearEnchant = DieRoller.nextInt(1) + 8; //8
	public static int EnumPetrifiedChertEnchant = DieRoller.nextInt(1) + 14; //14
	public static int EnumChertEnchant = DieRoller.nextInt(1) + 12; //12
	public static int EnumBlackChertEnchant = DieRoller.nextInt(1) + 18; //18
	public static int EnumCobaltChertEnchant = DieRoller.nextInt(1) + 18; //18
	public static int EnumRedChertEnchant = DieRoller.nextInt(1) + 22; //22
	public static int EnumNetherQuartzSpearEnchant = DieRoller.nextInt(1) + 50; //50
	public static int EnumGoldChertEnchant = DieRoller.nextInt(1) + 30; //30
	
    public mod_ChertCraft()
    {
  	readWriteProperties();

 //   ItemChertDye = new ItemChertDye(ItemChertDyeID).setUnlocalizedName("ItemChertDye");
     ItemChertAxe = new ItemChertAxe(ItemChertAxeID, EnumChertToolMaterial.CHERT).setUnlocalizedName("ItemChertAxe");
     ItemBlackChertAxe = new ItemChertAxe(ItemBlackChertAxeID, EnumChertToolMaterial.BLACKCHERT).setUnlocalizedName("ItemBlackChertAxe");
     ItemCobaltChertAxe = new ItemChertAxe(ItemCobaltChertAxeID, EnumChertToolMaterial.COBALTCHERT).setUnlocalizedName("ItemCobaltChertAxe");
     ItemRedChertAxe = new ItemChertAxe(ItemRedChertAxeID, EnumChertToolMaterial.REDCHERT).setUnlocalizedName("ItemRedChertAxe");
     ItemGoldenChertAxe = new ItemChertAxe(ItemGoldenChertAxeID, EnumChertToolMaterial.GOLDENCHERT).setUnlocalizedName("ItemGoldenChertAxe");

    ItemPetrifiedChertAxe = new ItemChertAxe(ItemPetrifiedChertAxeID, EnumChertToolMaterial.PETRIFIEDCHERT).setUnlocalizedName("ItemPetrifiedChertAxe");
    ItemNetherQuartzSpear = new ItemNetherQuartzSpear(ItemNetherQuartzSpearID, EnumChertToolMaterial.NETHERQUARTZSPEAR).setUnlocalizedName("ItemNetherQuartzSpear");
    ItemWoodenSpear =new ItemStoneChertSpear(ItemWoodenSpearID, EnumChertToolMaterial.WOODSPEAR).setUnlocalizedName("ItemWoodenSpear");
    ItemGravelSpear =new ItemStoneChertSpear(ItemGravelSpearID, EnumChertToolMaterial.GRAVELSPEAR).setUnlocalizedName("ItemGravelSpear");
    ItemStoneChertSpear = new ItemStoneChertSpear(ItemStoneChertSpearID, EnumChertToolMaterial.STONESPEAR).setUnlocalizedName("ItemStoneChertSpear");
    ItemPetrifiedChertSpear = new ItemStoneChertSpear(ItemPetrifiedChertSpearID, EnumChertToolMaterial.PETRIFIEDCHERT).setUnlocalizedName("ItemPetrifiedChertSpear");
    ItemChert = new Item(ItemChertID).setUnlocalizedName("ItemChert");
    ItemUnstableChert = new Item(ItemUnstableChertID).setUnlocalizedName("ItemUnstableChert");
    ItemCarbonizedChert = new Item(ItemCarbonizedChertID).setUnlocalizedName("ItemCarbonizedChert");
    ItemWhiteChert = new Item(ItemWhiteChertID).setUnlocalizedName("ItemWhiteChert");
    ItemStoneChert = new Item(ItemStoneChertID).setUnlocalizedName("ItemStoneChert");
    ItemRedChert = new Item(ItemRedChertID).setUnlocalizedName("ItemRedChert");
    ItemGoldenChert = new Item(ItemGoldenChertID).setUnlocalizedName("ItemGoldenChert");
    ItemStoneChertBrick = new Item(ItemStoneChertBrickID).setUnlocalizedName("ItemStoneChertBrick");
    ItemBlackChert = new Item(ItemBlackChertID).setUnlocalizedName("ItemBlackChert");
    ItemPetrifiedChert = new Item(ItemPetrifiedChertID).setUnlocalizedName("ItemPetrifiedChert");
    ItemCobaltChert = new Item(ItemCobaltChertID).setUnlocalizedName("ItemCobaltChert");
    ItemChertHoe = new ItemChertHoe(ItemChertHoeID, EnumChertToolMaterial.CHERT).setUnlocalizedName("ItemChertHoe");
    ItemChertPickaxe = new ItemChertPickaxe(ItemChertPickaxeID, EnumChertToolMaterial.CHERT).setUnlocalizedName("ItemChertPickaxe");
    ItemChertSpade = new ItemChertSpade(ItemChertSpadeID, EnumChertToolMaterial.CHERT).setUnlocalizedName("ItemChertSpade");
    ItemChertSword = new ItemChertSword(ItemChertSwordID, EnumChertToolMaterial.CHERT).setUnlocalizedName("ItemChertSword");
    ItemCobaltChertHoe = new ItemChertHoe(ItemCobaltChertHoeID, EnumChertToolMaterial.COBALTCHERT).setUnlocalizedName("ItemCobaltChertHoe");
    ItemCobaltChertPickaxe = new ItemChertPickaxe(ItemCobaltChertPickaxeID, EnumChertToolMaterial.COBALTCHERT).setUnlocalizedName("ItemCobaltChertPickaxe");
    ItemCobaltChertSpade = new ItemChertSpade(ItemCobaltChertSpadeID, EnumChertToolMaterial.COBALTCHERT).setUnlocalizedName("ItemCobaltChertSpade");
    ItemCobaltChertSword = new ItemChertSword(ItemCobaltChertSwordID, EnumChertToolMaterial.COBALTCHERT).setUnlocalizedName("ItemCobaltChertSword");
    ItemBlackChertHoe = new ItemChertHoe(ItemBlackChertHoeID, EnumChertToolMaterial.BLACKCHERT).setUnlocalizedName("ItemBlackChertHoe");
    ItemBlackChertPickaxe = new ItemChertPickaxe(ItemBlackChertPickaxeID, EnumChertToolMaterial.BLACKCHERT).setUnlocalizedName("ItemBlackChertPickaxe");
    ItemBlackChertSpade = new ItemChertSpade(ItemBlackChertSpadeID, EnumChertToolMaterial.BLACKCHERT).setUnlocalizedName("ItemBlackChertSpade");
    ItemBlackChertSword = new ItemChertSword(ItemBlackChertSwordID, EnumChertToolMaterial.BLACKCHERT).setUnlocalizedName("ItemBlackChertSword");
    ItemRedChertHoe = new ItemChertHoe(ItemRedChertHoeID, EnumChertToolMaterial.REDCHERT).setUnlocalizedName("ItemRedChertHoe");
    ItemRedChertPickaxe = new ItemChertPickaxe(ItemRedChertPickaxeID, EnumChertToolMaterial.REDCHERT).setUnlocalizedName("ItemRedChertPickaxe");
    ItemRedChertSpade = new ItemChertSpade(ItemRedChertSpadeID, EnumChertToolMaterial.REDCHERT).setUnlocalizedName("ItemRedChertSpade");
    ItemRedChertSword = new ItemChertSword(ItemRedChertSwordID, EnumChertToolMaterial.REDCHERT).setUnlocalizedName("ItemRedChertSword");
    ItemGoldenChertHoe = new ItemChertHoe(ItemGoldenChertHoeID, EnumChertToolMaterial.GOLDENCHERT).setUnlocalizedName("ItemGoldenChertHoe");
    ItemGoldenChertPickaxe = new ItemChertPickaxe(ItemGoldenChertPickaxeID, EnumChertToolMaterial.GOLDENCHERT).setUnlocalizedName("ItemGoldenChertPickaxe");
    ItemGoldenChertSpade = new ItemChertSpade(ItemGoldenChertSpadeID, EnumChertToolMaterial.GOLDENCHERT).setUnlocalizedName("ItemGoldenChertSpade");
    ItemGoldenChertSword = new ItemChertSword(ItemGoldenChertSwordID, EnumChertToolMaterial.GOLDENCHERT).setUnlocalizedName("ItemGoldenChertSword");

// 	  CLOTH(5, new int[]{1, 3, 2, 1}, 15), CHAIN(15, new int[]{2, 5, 4, 1}, 12), IRON(15, new int[]{2, 6, 5, 2}, 9),
//    GOLD(7, new int[]{2, 5, 3, 1}, 25), DIAMOND(33, new int[]{3, 8, 6, 3}, 10); 
//                                                                                                                                             
//                                              ("Stone", 10, new int[] {1, 5, 4, 1}, 9);                                                                                  
//                                              ("CStone", 10, new int[] {1, 4, 3, 1}, 9);                                                                                 
//                                                                                                                                    
//                                                                                                                               
//                                                                                                                                                                                                                                                    
 // ("CHERTARMOR", 12, new int[] {2, 3, 3, 1}, 12);  <-FML | ML ->  {2, 5, 3, 1}, 12          GOLD     GOLD     GOLD     GOLD
 // ("BLACKCHERTARMOR", 16, new int[] {2, 5, 4, 2}, 16);  <-FML | ML ->  {2, 5, 4, 2}, 16     CHAIN    CHAIN    CHAIN    IRON
  // ("COBALTCHERTARMOR", 16, new int[] {2, 5, 4, 2}, 16);  <-FML | ML ->  {3, 5, 4, 3}, 16   DIAMOND  CHAIN    CHAIN    DIAMOND
 // ("REDCHERTARMOR", 24, new int[] {3, 6, 5, 3}, 24);  <-FML | ML ->  {3, 6, 5, 3}, 24       DIAMOND  IRON     IRON     DIAMOND
 // ("GOLDCHERTARMOR", 31, new int[] {3, 8, 6, 3}, 31);  <-FML | ML ->  {3, 8, 6, 3}, 31      DIAMOND  DIAMOND  DIAMOND  DIAMOND
 
    ItemChertHelmet = new ItemArmor(ItemChertHelmetID, EnumArmorMaterial.GOLD, ModLoader.addArmor("chert"), 0).setUnlocalizedName("ItemChertHelmet");
    ItemChertChestplate = new ItemArmor(ItemChertChestplateID, EnumArmorMaterial.GOLD, ModLoader.addArmor("chert"), 1).setUnlocalizedName("ItemChertChestplate");
    ItemChertLeggings = new ItemArmor(ItemChertLeggingsID, EnumArmorMaterial.GOLD, ModLoader.addArmor("chert"), 2).setUnlocalizedName("ItemChertLeggings");
    ItemChertBoots = new ItemArmor(ItemChertBootsID, EnumArmorMaterial.GOLD, ModLoader.addArmor("chert"), 3).setUnlocalizedName("ItemChertBoots");
    
    ItemBlackChertHelmet = new ItemArmor(ItemBlackChertHelmetID, EnumArmorMaterial.CHAIN, ModLoader.addArmor("blackchert"), 0).setUnlocalizedName("ItemBlackChertHelmet");
    ItemBlackChertChestplate = new ItemArmor(ItemBlackChertChestplateID, EnumArmorMaterial.CHAIN, ModLoader.addArmor("blackchert"), 1).setUnlocalizedName("ItemBlackChertChestplate");
    ItemBlackChertLeggings = new ItemArmor(ItemBlackChertLeggingsID, EnumArmorMaterial.CHAIN, ModLoader.addArmor("blackchert"), 2).setUnlocalizedName("ItemBlackChertLeggings");
    ItemBlackChertBoots = new ItemArmor(ItemBlackChertBootsID, EnumArmorMaterial.IRON, ModLoader.addArmor("blackchert"), 3).setUnlocalizedName("ItemBlackChertBoots");
    
    ItemCobaltChertHelmet = new ItemArmor(ItemCobaltChertHelmetID, EnumArmorMaterial.DIAMOND, ModLoader.addArmor("cobaltchert"), 0).setUnlocalizedName("ItemCobaltChertHelmet");
    ItemCobaltChertChestplate = new ItemArmor(ItemCobaltChertChestplateID, EnumArmorMaterial.CHAIN, ModLoader.addArmor("cobaltchert"), 1).setUnlocalizedName("ItemCobaltChertChestplate");
    ItemCobaltChertLeggings = new ItemArmor(ItemCobaltChertLeggingsID, EnumArmorMaterial.CHAIN, ModLoader.addArmor("cobaltchert"), 2).setUnlocalizedName("ItemCobaltChertLeggings");
    ItemCobaltChertBoots = new ItemArmor(ItemCobaltChertBootsID, EnumArmorMaterial.DIAMOND, ModLoader.addArmor("cobaltchert"), 3).setUnlocalizedName("ItemCobaltChertBoots");
    
    ItemRedChertHelmet = new ItemArmor(ItemRedChertHelmetID, EnumArmorMaterial.DIAMOND, ModLoader.addArmor("redchert"), 0).setUnlocalizedName("ItemRedChertHelmet");
    ItemRedChertChestplate = new ItemArmor(ItemRedChertChestplateID, EnumArmorMaterial.IRON, ModLoader.addArmor("redchert"), 1).setUnlocalizedName("ItemRedChertChestplate");
    ItemRedChertLeggings = new ItemArmor(ItemRedChertLeggingsID, EnumArmorMaterial.IRON, ModLoader.addArmor("redchert"), 2).setUnlocalizedName("ItemRedChertLeggings");
    ItemRedChertBoots = new ItemArmor(ItemRedChertBootsID, EnumArmorMaterial.DIAMOND, ModLoader.addArmor("redchert"), 3).setUnlocalizedName("ItemRedChertBoots");
    
    ItemGoldenChertHelmet = new ItemArmor(ItemGoldenChertHelmetID, EnumArmorMaterial.DIAMOND, ModLoader.addArmor("goldenchert"), 0).setUnlocalizedName("ItemGoldenChertHelmet");
    ItemGoldenChertChestplate = new ItemArmor(ItemGoldenChertChestplateID, EnumArmorMaterial.DIAMOND, ModLoader.addArmor("goldenchert"), 1).setUnlocalizedName("ItemGoldenChertChestplate");
    ItemGoldenChertLeggings = new ItemArmor(ItemGoldenChertLeggingsID, EnumArmorMaterial.DIAMOND, ModLoader.addArmor("goldenchert"), 2).setUnlocalizedName("ItemGoldenChertLeggings");
    ItemGoldenChertBoots = new ItemArmor(ItemGoldenChertBootsID, EnumArmorMaterial.DIAMOND, ModLoader.addArmor("goldenchert"), 3).setUnlocalizedName("ItemGoldenChertBoots");
    	
    BlockChert = new BlockChert(BlockChertID).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("BlockChert").setHardness(1.5F).setResistance(3.0F).setLightValue(0.0F);   	
    BlockUnstableChert = new BlockUnstableChert(BlockUnstableChertID).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("BlockUnstableChert").setHardness(1.5F).setResistance(3.0F).setLightValue(0.0F);
    BlockWhiteChert = new BlockWhiteChert(BlockWhiteChertID).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("BlockWhiteChert").setHardness(1.5F).setResistance(3.0F).setLightValue(0.0F);
    BlockBlackChert = new BlockBlackChert(BlockBlackChertID).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("BlockBlackChert").setHardness(1.5F).setResistance(3.0F).setLightValue(0.0F);
    BlockStoneChert = new BlockStoneChert(BlockStoneChertID).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("BlockStoneChert").setHardness(1.5F).setResistance(3.0F).setLightValue(0.0F);
    BlockRedChert = new BlockRedChert(BlockRedChertID).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("BlockRedChert").setHardness(1.5F).setResistance(3.0F).setLightValue(0.0F);
    BlockGoldenChert = new BlockGoldenChert(BlockGoldenChertID).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("BlockGoldenChert").setHardness(1.5F).setResistance(3.0F).setLightValue(0.0F);
    BlockChertSand = new BlockChertSand(BlockChertSandID).setStepSound(Block.soundGravelFootstep).setUnlocalizedName("BlockChertSand").setHardness(0.7F).setResistance(3.0F).setLightValue(0.0F);
    BlockCobaltChertSand = new BlockCobaltChertSand(BlockCobaltChertSandID).setStepSound(Block.soundGravelFootstep).setUnlocalizedName("BlockCobaltChertSand").setHardness(1.3F).setResistance(3.0F).setLightValue(0.0F);
    BlockStoneChertBricks = new BlockStoneChertBricks(BlockStoneChertBricksID).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("BlockStoneChertBricks").setHardness(1.5F).setResistance(3.0F).setLightValue(0.0F);
 	BlockStoneChertStairs = new BlockStairs(BlockStoneChertStairsID, BlockStoneChertBricks, 0).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("BlockStoneChertStairs").setHardness(1.5F).setResistance(3.0F).setLightValue(0.0F);
 //   BlockStoneChertSlab = new BlockStep(BlockStoneChertSlabID, false).setHardness(2.0F).setResistance(2.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("BlockStoneChertSlab");
    BlockChertGlass = new BlockChertGlass(BlockChertGlassID).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("BlockChertGlass").setHardness(0.225F).setResistance(1.2F).setLightValue(0.0F);
    BlockCobaltChertGlass = new BlockCobaltChertGlass(BlockCobaltChertGlassID).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("BlockCobaltChertGlass").setHardness(0.225F).setResistance(2.5F).setLightValue(0.0F);
    BlockStoneChertPressurePlate = new BlockPressurePlate(BlockStoneChertPressurePlateID, "BlockStoneChertBricks", Material.rock, EnumMobType.mobs).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("BlockStoneChertPressurePlate").setHardness(0.3F).setResistance(1.2F).setLightValue(0.0F);
    BlockPetrifiedChert = new BlockPetrifiedChert(BlockPetrifiedChertID).setHardness(0.2F).setResistance(3.0F).setLightValue(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("BlockPetrifiedChert");
    BlockPetrifiedChert2 = new BlockPetrifiedChert2(BlockPetrifiedChert2ID).setHardness(0.2F).setResistance(3.0F).setLightValue(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("BlockPetrifiedChert2");

    BlockCobaltChert = new BlockCobaltChert(BlockCobaltChertID).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("BlockCobaltChert").setHardness(2.5F).setResistance(5.0F).setLightValue(0.0F);   	
    BlockChertGlassPanel = new BlockPane(BlockChertGlassPanelID, "BlockChertGlass", "BlockChertGlass_top", Material.glass, false).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("BlockChertGlassPanel");
    BlockCobaltChertGlassPanel = new BlockPane(BlockCobaltChertGlassPanelID, "BlockCobaltChertGlass", "BlockCobaltChertGlass_top", Material.glass, false).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("BlockCobaltChertGlassPanel");
	
     //   ModLoader.addName(BlockStoneChertSlab, "Stone Chert Slab");
     //   BlockStoneChertSlab.setCreativeTab(CreativeTabs.tabBlock);
        
        ModLoader.addName(BlockPetrifiedChert2, "Petrified Chert");
        BlockPetrifiedChert2.setCreativeTab(CreativeTabs.tabBlock); 
        
 //       ModLoader.addName(ItemChertDye, "Chert Dye");
 //       ItemChertDye.setCreativeTab(CreativeTabs.tabMaterials); 	
        
        ModLoader.addName(BlockPetrifiedChert, "Petrified Chert");
  //      BlockPetrifiedChert.setCreativeTab(CreativeTabs.tabBlock); 
        
        ModLoader.addName(BlockCobaltChert, "Cobalt Chert");
        BlockCobaltChert.setCreativeTab(CreativeTabs.tabBlock);
        
        
        ModLoader.addName(BlockCobaltChertGlass, "Cobalt Chert Glass");
        BlockCobaltChertGlass.setCreativeTab(CreativeTabs.tabBlock);
        	      
        
        ModLoader.addName(BlockStoneChertPressurePlate, "Stone Chert Pressure Plate");
        BlockStoneChertPressurePlate.setCreativeTab(CreativeTabs.tabRedstone);
    
        
        ModLoader.addName(BlockRedChert, "Red Chert");
        BlockRedChert.setCreativeTab(CreativeTabs.tabBlock);
        
        
        ModLoader.addName(BlockGoldenChert, "Golden Chert");
        BlockGoldenChert.setCreativeTab(CreativeTabs.tabBlock);
        
        
        ModLoader.addName(BlockChert, "Chert");
        BlockChert.setCreativeTab(CreativeTabs.tabBlock);

        ModLoader.addName(BlockUnstableChert, "Unstable Chert");
        BlockUnstableChert.setCreativeTab(CreativeTabs.tabBlock);  
        	 
        
        ModLoader.addName(BlockWhiteChert, "White Chert");
        BlockWhiteChert.setCreativeTab(CreativeTabs.tabBlock);
        	    
        
        ModLoader.addName(BlockChertSand, "Chert Sand");
        BlockChertSand.setCreativeTab(CreativeTabs.tabBlock);
        
        
        ModLoader.addName(BlockCobaltChertSand, "Cobalt Chert Sand");
        BlockCobaltChertSand.setCreativeTab(CreativeTabs.tabBlock);
        	
        
        ModLoader.addName(BlockChertGlassPanel, "Chert Glass Panel");
        BlockChertGlassPanel.setCreativeTab(CreativeTabs.tabDecorations);
        
        
        ModLoader.addName(BlockCobaltChertGlassPanel, "Cobalt Chert Glass Panel");
        BlockCobaltChertGlassPanel.setCreativeTab(CreativeTabs.tabDecorations);
        
        
        ModLoader.addName(BlockChertGlass, "Chert Glass");
        BlockChertGlass.setCreativeTab(CreativeTabs.tabBlock);
        
        ModLoader.addName(ItemWoodenSpear, "Wooden Spear");
        ItemWoodenSpear.setCreativeTab(CreativeTabs.tabTools);
        
        ModLoader.addName(ItemGravelSpear, "Gravel Spear");
        ItemGravelSpear.setCreativeTab(CreativeTabs.tabTools);
        
        ModLoader.addName(ItemPetrifiedChertSpear, "Petrified Chert Spear");
        ItemPetrifiedChertSpear.setCreativeTab(CreativeTabs.tabTools);
        
        ModLoader.addName(ItemPetrifiedChertAxe, "Petrified Chert Axe");
        ItemPetrifiedChertAxe.setCreativeTab(CreativeTabs.tabTools);
        
        ModLoader.addName(ItemStoneChertSpear, "Stone Chert Spear");
        ItemStoneChertSpear.setCreativeTab(CreativeTabs.tabTools);
        
        
        ModLoader.addName(BlockBlackChert, "Blackened Chert");
        BlockBlackChert.setCreativeTab(CreativeTabs.tabBlock);  
        	
        ModLoader.addName(ItemChert, "Chert");
        ItemChert.setCreativeTab(CreativeTabs.tabMaterials);
        
        ModLoader.addName(ItemNetherQuartzSpear, "Nether Quartz Spear");
        ItemNetherQuartzSpear.setCreativeTab(CreativeTabs.tabTools);
        
        
        ModLoader.addName(BlockStoneChertBricks, "Stone Chert Bricks");
        BlockStoneChertBricks.setCreativeTab(CreativeTabs.tabBlock);  
        	
        ModLoader.addName(BlockStoneChertStairs, "Stone Chert Stairs");
        BlockStoneChertStairs.setCreativeTab(CreativeTabs.tabBlock);
        
        ModLoader.addName(BlockStoneChert, "Stone Chert");
        BlockStoneChert.setCreativeTab(CreativeTabs.tabBlock);  
        	
        ModLoader.addName(ItemStoneChert, "Stone Chert");
        ItemStoneChert.setCreativeTab(CreativeTabs.tabMaterials);
        
        ModLoader.addName(ItemRedChert, "Red Chert");
        ItemRedChert.setCreativeTab(CreativeTabs.tabMaterials);
        
        ModLoader.addName(ItemGoldenChert, "Golden Chert");
        ItemGoldenChert.setCreativeTab(CreativeTabs.tabMaterials);
     
        ModLoader.addName(ItemStoneChertBrick, "Stone Chert Brick");
        ItemStoneChertBrick.setCreativeTab(CreativeTabs.tabMaterials);
        
        ModLoader.addName(ItemCarbonizedChert, "Carbonized Chert");
        ItemCarbonizedChert.setCreativeTab(CreativeTabs.tabMaterials);
       
        ModLoader.addName(ItemWhiteChert, "White Chert");
        ItemWhiteChert.setCreativeTab(CreativeTabs.tabMaterials);
        
        ModLoader.addName(ItemBlackChert, "Blackened Chert");
        ItemBlackChert.setCreativeTab(CreativeTabs.tabMaterials);       
        
        ModLoader.addName(ItemUnstableChert, "Unstable Chert");
        ItemUnstableChert.setCreativeTab(CreativeTabs.tabMaterials);
        
        ModLoader.addName(ItemPetrifiedChert, "Petrified Chert");
        ItemPetrifiedChert.setCreativeTab(CreativeTabs.tabMaterials);
        
        ModLoader.addName(ItemCobaltChert, "Cobalt Chert");
        ItemCobaltChert.setCreativeTab(CreativeTabs.tabMaterials);
        
        ModLoader.addName(ItemChertAxe, "Chert Axe");
        ItemChertAxe.setCreativeTab(CreativeTabs.tabTools);
        ModLoader.addName(ItemChertHoe, "Chert Hoe");
        ItemChertHoe.setCreativeTab(CreativeTabs.tabTools);
        ModLoader.addName(ItemChertPickaxe, "Chert Pickaxe");
        ItemChertPickaxe.setCreativeTab(CreativeTabs.tabTools);
        ModLoader.addName(ItemChertSpade, "Chert Spade");
        ItemChertSpade.setCreativeTab(CreativeTabs.tabTools);
        ModLoader.addName(ItemChertSword, "Chert Sword");
        ItemChertSword.setCreativeTab(CreativeTabs.tabTools);
        ModLoader.addName(ItemBlackChertAxe, "Blackened Chert Axe");
        ItemBlackChertAxe.setCreativeTab(CreativeTabs.tabTools);
        ModLoader.addName(ItemBlackChertHoe, "Blackened Chert Hoe");
        ItemBlackChertHoe.setCreativeTab(CreativeTabs.tabTools);
        ModLoader.addName(ItemBlackChertPickaxe, "Blackened Chert Pickaxe");
        ItemBlackChertPickaxe.setCreativeTab(CreativeTabs.tabTools);
        ModLoader.addName(ItemBlackChertSpade, "Blackened Chert Spade");
        ItemBlackChertSpade.setCreativeTab(CreativeTabs.tabTools);
        ModLoader.addName(ItemBlackChertSword, "Blackened Chert Sword");
        ItemBlackChertSword.setCreativeTab(CreativeTabs.tabTools);
        ModLoader.addName(ItemRedChertAxe, "Red Chert Axe");
        ItemRedChertAxe.setCreativeTab(CreativeTabs.tabTools);
        ModLoader.addName(ItemRedChertHoe, "Red Chert Hoe");
        ItemRedChertHoe.setCreativeTab(CreativeTabs.tabTools);
        ModLoader.addName(ItemRedChertPickaxe, "Red Chert Pickaxe");
        ItemRedChertPickaxe.setCreativeTab(CreativeTabs.tabTools);
        ModLoader.addName(ItemRedChertSpade, "Red Chert Spade");
        ItemRedChertSpade.setCreativeTab(CreativeTabs.tabTools);
        ModLoader.addName(ItemRedChertSword, "Red Chert Sword");
        ItemRedChertSword.setCreativeTab(CreativeTabs.tabTools);   
        ModLoader.addName(ItemGoldenChertAxe, "Golden Chert Axe");
        ItemGoldenChertAxe.setCreativeTab(CreativeTabs.tabTools);
        ModLoader.addName(ItemGoldenChertHoe, "Golden Chert Hoe");
        ItemGoldenChertHoe.setCreativeTab(CreativeTabs.tabTools);
        ModLoader.addName(ItemGoldenChertPickaxe, "Golden Chert Pickaxe");
        ItemGoldenChertPickaxe.setCreativeTab(CreativeTabs.tabTools);
        ModLoader.addName(ItemGoldenChertSpade, "Golden Chert Spade");
        ItemGoldenChertSpade.setCreativeTab(CreativeTabs.tabTools);
        ModLoader.addName(ItemGoldenChertSword, "Golden Chert Sword");
        ItemGoldenChertSword.setCreativeTab(CreativeTabs.tabTools);    
        ModLoader.addName(ItemChertHelmet, "Chert Helmet");
        ItemChertHelmet.setCreativeTab(CreativeTabs.tabCombat);
        ModLoader.addName(ItemChertChestplate, "Chert Chestplate");
        ItemChertChestplate.setCreativeTab(CreativeTabs.tabCombat);
        ModLoader.addName(ItemChertLeggings, "Chert Leggings");
        ItemChertLeggings.setCreativeTab(CreativeTabs.tabCombat);
        ModLoader.addName(ItemChertBoots, "Chert Boots");
        ItemChertBoots.setCreativeTab(CreativeTabs.tabCombat);
        
        ModLoader.addName(ItemCobaltChertAxe, "Cobalt Chert Axe");
        ItemCobaltChertAxe.setCreativeTab(CreativeTabs.tabTools);
        ModLoader.addName(ItemCobaltChertHoe, "Cobalt Chert Hoe");
        ItemCobaltChertHoe.setCreativeTab(CreativeTabs.tabTools);
        ModLoader.addName(ItemCobaltChertPickaxe, "Cobalt Chert Pickaxe");
        ItemCobaltChertPickaxe.setCreativeTab(CreativeTabs.tabTools);
        ModLoader.addName(ItemCobaltChertSpade, "Cobalt Chert Spade");
        ItemCobaltChertSpade.setCreativeTab(CreativeTabs.tabTools);
        ModLoader.addName(ItemCobaltChertSword, "Cobalt Chert Sword");
        ItemCobaltChertSword.setCreativeTab(CreativeTabs.tabTools);
        
        
        ModLoader.addName(ItemBlackChertHelmet, "Blackened Chert Helmet");
        ItemBlackChertHelmet.setCreativeTab(CreativeTabs.tabCombat);
        ModLoader.addName(ItemBlackChertChestplate, "Blackened Chert Chestplate");
        ItemBlackChertChestplate.setCreativeTab(CreativeTabs.tabCombat);
        ModLoader.addName(ItemBlackChertLeggings, "Blackened Chert Leggings");
        ItemBlackChertLeggings.setCreativeTab(CreativeTabs.tabCombat);
        ModLoader.addName(ItemBlackChertBoots, "Blackened Chert Boots");
        ItemBlackChertBoots.setCreativeTab(CreativeTabs.tabCombat);
        
        ModLoader.addName(ItemRedChertHelmet, "Red Chert Helmet");
        ItemRedChertHelmet.setCreativeTab(CreativeTabs.tabCombat);
        ModLoader.addName(ItemRedChertChestplate, "Red Chert Chestplate");
        ItemRedChertChestplate.setCreativeTab(CreativeTabs.tabCombat);
        ModLoader.addName(ItemRedChertLeggings, "Red Chert Leggings");
        ItemRedChertLeggings.setCreativeTab(CreativeTabs.tabCombat);
        ModLoader.addName(ItemRedChertBoots, "Red Chert Boots");
        ItemRedChertBoots.setCreativeTab(CreativeTabs.tabCombat);
        
        ModLoader.addName(ItemGoldenChertHelmet, "Golden Chert Helmet");
        ItemGoldenChertHelmet.setCreativeTab(CreativeTabs.tabCombat);
        ModLoader.addName(ItemGoldenChertChestplate, "Golden Chert Chestplate");
        ItemGoldenChertChestplate.setCreativeTab(CreativeTabs.tabCombat);
        ModLoader.addName(ItemGoldenChertLeggings, "Golden Chert Leggings");
        ItemGoldenChertLeggings.setCreativeTab(CreativeTabs.tabCombat);
        ModLoader.addName(ItemGoldenChertBoots, "Golden Chert Boots");
        ItemGoldenChertBoots.setCreativeTab(CreativeTabs.tabCombat);
        
        ModLoader.addName(ItemCobaltChertHelmet, "Cobalt Chert Helmet");
        ItemCobaltChertHelmet.setCreativeTab(CreativeTabs.tabCombat);
        ModLoader.addName(ItemCobaltChertChestplate, "Cobalt Chert Chestplate");
        ItemCobaltChertChestplate.setCreativeTab(CreativeTabs.tabCombat);
        ModLoader.addName(ItemCobaltChertLeggings, "Cobalt Chert Leggings");
        ItemCobaltChertLeggings.setCreativeTab(CreativeTabs.tabCombat);
        ModLoader.addName(ItemCobaltChertBoots, "Cobalt Chert Boots");
        ItemCobaltChertBoots.setCreativeTab(CreativeTabs.tabCombat);

        
        
        ModLoader.addRecipe(new ItemStack(Block.torchWood, 4), new Object[] {"C", "S", 'C', ItemUnstableChert, 'S', Item.stick});
	
        ModLoader.addSmelting(Block.gravel.blockID, new ItemStack(ItemChert, 1), 0.1F);
        ModLoader.addSmelting(ItemWhiteChert.itemID, new ItemStack(ItemBlackChert, 1), 0.1F);
        ModLoader.addSmelting(ItemStoneChert.itemID, new ItemStack(ItemStoneChertBrick, 1), 0.1F);
        ModLoader.addSmelting(BlockChertSand.blockID, new ItemStack(BlockChertGlassPanel, 1), 0.1F);
        ModLoader.addSmelting(BlockCobaltChertSand.blockID, new ItemStack(BlockCobaltChertGlassPanel, 1), 0.1F);
        ModLoader.addSmelting(ItemPetrifiedChert.itemID, new ItemStack(ItemCarbonizedChert, 1), 0.1F);
        ModLoader.addRecipe(new ItemStack(Item.flint, 1), new Object[] {"C", 'C', ItemChert});
        ModLoader.addRecipe(new ItemStack(BlockStoneChertBricks, 1), new Object[] {"CC", "CC", 'C', ItemStoneChertBrick});
        ModLoader.addRecipe(new ItemStack(Block.furnaceIdle, 1), new Object[] {"CCC", "C C", "CCC", 'C', ItemStoneChert});
        ModLoader.addRecipe(new ItemStack(ItemStoneChertBrick, 4), new Object[] {"C", 'C', BlockStoneChertBricks});
        ModLoader.addRecipe(new ItemStack(BlockChert, 1), new Object[] {"CC", "CC", 'C', ItemChert});
        ModLoader.addRecipe(new ItemStack(ItemChert, 4), new Object[] {"C", 'C', BlockChert});
        ModLoader.addRecipe(new ItemStack(BlockBlackChert, 1), new Object[] {"CC", "CC", 'C', ItemBlackChert});
        ModLoader.addRecipe(new ItemStack(ItemBlackChert, 4), new Object[] {"C", 'C', BlockBlackChert});
        ModLoader.addRecipe(new ItemStack(BlockStoneChertStairs, 2), new Object[] {"  C", " CC", "CCC", 'C', ItemStoneChertBrick});
    //    ModLoader.addRecipe(new ItemStack(BlockStoneChertSlab, 2), new Object[] {"CCC", "CCC", 'C', ItemStoneChertBrick});
        ModLoader.addRecipe(new ItemStack(BlockChertGlass, 8), new Object[] {"CCC", "CCC", 'C', BlockChertGlassPanel});
        ModLoader.addRecipe(new ItemStack(BlockCobaltChertGlass, 8), new Object[] {"CCC", "CCC", 'C', BlockCobaltChertGlassPanel});
        ModLoader.addShapelessRecipe(new ItemStack(BlockCobaltChertSand), new Object[] {Block.sand, ItemCobaltChert});
        ModLoader.addShapelessRecipe(new ItemStack(Item.gunpowder, 4), new Object[] {Item.coal, ItemWhiteChert, Item.sugar, new ItemStack(Item.dyePowder, 1, 15)});
        ModLoader.addShapelessRecipe(new ItemStack(Item.gunpowder, 4), new Object[] {new ItemStack(Item.coal, 1, 1), ItemWhiteChert, Item.sugar, new ItemStack(Item.dyePowder, 1, 15)});
        ModLoader.addShapelessRecipe(new ItemStack(Item.gunpowder, 4), new Object[] {ItemUnstableChert, ItemWhiteChert, Item.sugar, new ItemStack(Item.dyePowder, 1, 15)});
        ModLoader.addRecipe(new ItemStack(Item.glassBottle, 3), new Object[] {"# #", " # ", '#', BlockChertGlass});
        ModLoader.addRecipe(new ItemStack(Item.glassBottle, 4), new Object[] {"# #", " # ", '#', BlockCobaltChertGlass});
        ModLoader.addRecipe(new ItemStack(ItemChertAxe, 1), new Object[] {"CC ", "CS ", " S ", 'C', ItemChert, 'S', Item.stick});
        ModLoader.addRecipe(new ItemStack(ItemChertHoe, 1), new Object[] {"CC ", " S ", " S ", 'C', ItemChert, 'S', Item.stick});
        ModLoader.addRecipe(new ItemStack(ItemChertPickaxe, 1), new Object[] {"CCC", " S ", " S ", 'C', ItemChert, 'S', Item.stick});
        ModLoader.addRecipe(new ItemStack(ItemChertSpade, 1), new Object[] {" C ", " S ", " S ", 'C', ItemChert, 'S', Item.stick});
        ModLoader.addRecipe(new ItemStack(ItemChertSword, 1), new Object[] {" C ", " C ", " S ", 'C', ItemChert, 'S', Item.stick});
        ModLoader.addRecipe(new ItemStack(ItemBlackChertAxe, 1), new Object[] {"HH ", "HS ", " S ", 'H', ItemBlackChert, 'S', Item.stick});
        ModLoader.addRecipe(new ItemStack(ItemBlackChertHoe, 1), new Object[] {"HH ", " S ", " S ", 'H', ItemBlackChert, 'S', Item.stick});
        ModLoader.addRecipe(new ItemStack(ItemBlackChertPickaxe, 1), new Object[] {"HHH", " S ", " S ", 'H', ItemBlackChert, 'S', Item.stick});
        ModLoader.addRecipe(new ItemStack(ItemBlackChertSpade, 1), new Object[] {" H ", " S ", " S ", 'H', ItemBlackChert, 'S', Item.stick});
        ModLoader.addRecipe(new ItemStack(ItemBlackChertSword, 1), new Object[] {" H ", " H ", " S ", 'H', ItemBlackChert, 'S', Item.stick});
  
        ModLoader.addRecipe(new ItemStack(ItemCobaltChertAxe, 1), new Object[] {"CC ", "CS ", " S ", 'C', ItemCobaltChert, 'S', Item.stick});
        ModLoader.addRecipe(new ItemStack(ItemCobaltChertHoe, 1), new Object[] {"CC ", " S ", " S ", 'C', ItemCobaltChert, 'S', Item.stick});
        ModLoader.addRecipe(new ItemStack(ItemCobaltChertPickaxe, 1), new Object[] {"CCC", " S ", " S ", 'C', ItemCobaltChert, 'S', Item.stick});
        ModLoader.addRecipe(new ItemStack(ItemCobaltChertSpade, 1), new Object[] {" C ", " S ", " S ", 'C', ItemCobaltChert, 'S', Item.stick});
        ModLoader.addRecipe(new ItemStack(ItemCobaltChertSword, 1), new Object[] {" C ", " C ", " S ", 'C', ItemCobaltChert, 'S', Item.stick});
 
        ModLoader.addRecipe(new ItemStack(ItemPetrifiedChertAxe, 1), new Object[] {"CC ", "CS ", " S ", 'C', ItemPetrifiedChert, 'S', Item.stick});
        ModLoader.addRecipe(new ItemStack(ItemRedChertAxe, 1), new Object[] {"CC ", "CS ", " S ", 'C', ItemRedChert, 'S', Item.stick});
        ModLoader.addRecipe(new ItemStack(ItemRedChertHoe, 1), new Object[] {"CC ", " S ", " S ", 'C', ItemRedChert, 'S', Item.stick});
        ModLoader.addRecipe(new ItemStack(ItemRedChertPickaxe, 1), new Object[] {"CCC", " S ", " S ", 'C', ItemRedChert, 'S', Item.stick});
        ModLoader.addRecipe(new ItemStack(ItemRedChertSpade, 1), new Object[] {" C ", " S ", " S ", 'C', ItemRedChert, 'S', Item.stick});
        ModLoader.addRecipe(new ItemStack(ItemRedChertSword, 1), new Object[] {" C ", " C ", " S ", 'C', ItemRedChert, 'S', Item.stick});
 
        ModLoader.addRecipe(new ItemStack(ItemGoldenChertAxe, 1), new Object[] {"CC ", "CS ", " S ", 'C', ItemGoldenChert, 'S', Item.stick});
        ModLoader.addRecipe(new ItemStack(ItemGoldenChertHoe, 1), new Object[] {"CC ", " S ", " S ", 'C', ItemGoldenChert, 'S', Item.stick});
        ModLoader.addRecipe(new ItemStack(ItemGoldenChertPickaxe, 1), new Object[] {"CCC", " S ", " S ", 'C', ItemGoldenChert, 'S', Item.stick});
        ModLoader.addRecipe(new ItemStack(ItemGoldenChertSpade, 1), new Object[] {" C ", " S ", " S ", 'C', ItemGoldenChert, 'S', Item.stick});
        ModLoader.addRecipe(new ItemStack(ItemGoldenChertSword, 1), new Object[] {" C ", " C ", " S ", 'C', ItemGoldenChert, 'S', Item.stick});
 
        ModLoader.addRecipe(new ItemStack(BlockStoneChertPressurePlate, 1), new Object[] {"CC", 'C', ItemStoneChertBrick});
        ModLoader.addRecipe(new ItemStack(ItemStoneChertSpear, 1), new Object[] {"  C", " S ",  "S  ", 'C', ItemStoneChert, 'S', Item.stick});
        ModLoader.addRecipe(new ItemStack(ItemNetherQuartzSpear, 1), new Object[] {"  C", " S ",  "S  ", 'C', Item.netherQuartz, 'S', Item.stick});
        ModLoader.addRecipe(new ItemStack(ItemGravelSpear, 1), new Object[] {"  C", " S ",  "S  ", 'C', Block.gravel, 'S', Item.stick});
        ModLoader.addRecipe(new ItemStack(ItemWoodenSpear, 1), new Object[] {"  C", " S ",  "S  ", 'C', Block.planks, 'S', Item.stick});
        ModLoader.addRecipe(new ItemStack(ItemPetrifiedChertSpear, 1), new Object[] {"  C", " S ",  "S  ", 'C', ItemPetrifiedChert, 'S', Item.stick});
        
        ModLoader.addRecipe(new ItemStack(ItemChertHelmet, 1), new Object[] {"CCC", "C C", 'C', ItemChert});
        ModLoader.addRecipe(new ItemStack(ItemChertChestplate, 1), new Object[] {"C C", "CCC", "CCC", 'C', ItemChert});
        ModLoader.addRecipe(new ItemStack(ItemChertLeggings, 1), new Object[] {"CCC", "C C", "C C", 'C', ItemChert});
        ModLoader.addRecipe(new ItemStack(ItemChertBoots, 1), new Object[] {"C C", "C C", 'C', ItemChert});
        
        ModLoader.addRecipe(new ItemStack(ItemBlackChertHelmet, 1), new Object[] {"HHH", "H H", 'H', ItemBlackChert});
        ModLoader.addRecipe(new ItemStack(ItemBlackChertChestplate, 1), new Object[] {"H H", "HHH", "HHH", 'H', ItemBlackChert});
        ModLoader.addRecipe(new ItemStack(ItemBlackChertLeggings, 1), new Object[] {"HHH", "H H", "H H", 'H', ItemBlackChert});
        ModLoader.addRecipe(new ItemStack(ItemBlackChertBoots, 1), new Object[] {"H H", "H H", 'H', ItemBlackChert});
        
        ModLoader.addRecipe(new ItemStack(ItemRedChertHelmet, 1), new Object[] {"CCC", "C C", 'C', ItemRedChert});
        ModLoader.addRecipe(new ItemStack(ItemRedChertChestplate, 1), new Object[] {"C C", "CCC", "CCC", 'C', ItemRedChert});
        ModLoader.addRecipe(new ItemStack(ItemRedChertLeggings, 1), new Object[] {"CCC", "C C", "C C", 'C', ItemRedChert});
        ModLoader.addRecipe(new ItemStack(ItemRedChertBoots, 1), new Object[] {"C C", "C C", 'C', ItemRedChert});
        
        ModLoader.addRecipe(new ItemStack(ItemGoldenChertHelmet, 1), new Object[] {"CCC", "C C", 'C', ItemGoldenChert});
        ModLoader.addRecipe(new ItemStack(ItemGoldenChertChestplate, 1), new Object[] {"C C", "CCC", "CCC", 'C', ItemGoldenChert});
        ModLoader.addRecipe(new ItemStack(ItemGoldenChertLeggings, 1), new Object[] {"CCC", "C C", "C C", 'C', ItemGoldenChert});
        ModLoader.addRecipe(new ItemStack(ItemGoldenChertBoots, 1), new Object[] {"C C", "C C", 'C', ItemGoldenChert});
       
        ModLoader.addRecipe(new ItemStack(ItemCobaltChertHelmet, 1), new Object[] {"CCC", "C C", 'C', ItemCobaltChert});
        ModLoader.addRecipe(new ItemStack(ItemCobaltChertChestplate, 1), new Object[] {"C C", "CCC", "CCC", 'C', ItemCobaltChert});
        ModLoader.addRecipe(new ItemStack(ItemCobaltChertLeggings, 1), new Object[] {"CCC", "C C", "C C", 'C', ItemCobaltChert});
        ModLoader.addRecipe(new ItemStack(ItemCobaltChertBoots, 1), new Object[] {"C C", "C C", 'C', ItemCobaltChert});
    }
    
	public void readWriteProperties() {
		Properties properties = new Properties();
		try
		{	
            File file = new File((new StringBuilder()).append(Minecraft.getMinecraftDir()).append("/mods/ChertCraft.config").toString());
            boolean flag = file.createNewFile();
            if(flag)
            {
                FileOutputStream fileoutputstream = new FileOutputStream(file);
                properties.setProperty("BlockChertID", Integer.toString(241));
                properties.setProperty("BlockUnstableChertID", Integer.toString(242));
                properties.setProperty("BlockWhiteChertID", Integer.toString(243));
                properties.setProperty("BlockBlackChertID", Integer.toString(244));
                properties.setProperty("BlockStoneChertID", Integer.toString(245));
                properties.setProperty("BlockStoneChertBricksID", Integer.toString(246));
                properties.setProperty("BlockStoneChertStairsID", Integer.toString(247));
                properties.setProperty("BlockRedChertID", Integer.toString(248));                 
                properties.setProperty("BlockGoldenChertID", Integer.toString(249)); 
                properties.setProperty("BlockChertSandID", Integer.toString(251));
                properties.setProperty("BlockChertGlassID", Integer.toString(252));
                properties.setProperty("BlockStoneChertPressurePlateID", Integer.toString(232));
                properties.setProperty("BlockPetrifiedChertID", Integer.toString(233));
                properties.setProperty("BlockCobaltChertID", Integer.toString(234));
                properties.setProperty("BlockCobaltChertGlassID", Integer.toString(235));
                properties.setProperty("BlockChertGlassPanelID", Integer.toString(236)); 
                properties.setProperty("BlockCobaltChertGlassPanelID", Integer.toString(237));
                properties.setProperty("BlockCobaltChertSandID", Integer.toString(238));
        //        properties.setProperty("BlockStoneChertSlabID", Integer.toString(239));
                properties.setProperty("BlockPetrifiedChert2ID", Integer.toString(240));
                properties.setProperty("ItemChertAxeID", Integer.toString(3265));
                properties.setProperty("ItemBlackChertAxeID", Integer.toString(3266));
                properties.setProperty("ItemRedChertAxeID", Integer.toString(3267));
                properties.setProperty("ItemGoldenChertAxeID", Integer.toString(3268));
                properties.setProperty("ItemGravelSpearID", Integer.toString(3269));
                properties.setProperty("ItemStoneChertSpearID", Integer.toString(3270));
                properties.setProperty("ItemChertID", Integer.toString(3271));
                properties.setProperty("ItemUnstableChertID", Integer.toString(3272));
                properties.setProperty("ItemWhiteChertID", Integer.toString(3273));
                properties.setProperty("ItemStoneChertID", Integer.toString(3274));
                properties.setProperty("ItemRedChertID", Integer.toString(3275));
                properties.setProperty("ItemGoldenChertID", Integer.toString(3276));
                properties.setProperty("ItemStoneChertBrickID", Integer.toString(3277));
                properties.setProperty("ItemBlackChertID", Integer.toString(3278));
                properties.setProperty("ItemChertHoeID", Integer.toString(3280));
                properties.setProperty("ItemChertPickaxeID", Integer.toString(3281));
                properties.setProperty("ItemChertSpadeID", Integer.toString(3282));
                properties.setProperty("ItemChertSwordID", Integer.toString(3283));
                properties.setProperty("ItemBlackChertHoeID", Integer.toString(3284));
                properties.setProperty("ItemBlackChertPickaxeID", Integer.toString(3285));
                properties.setProperty("ItemBlackChertSpadeID", Integer.toString(3286));
                properties.setProperty("ItemBlackChertSwordID", Integer.toString(3287));
                properties.setProperty("ItemRedChertHoeID", Integer.toString(3288));
                properties.setProperty("ItemRedChertPickaxeID", Integer.toString(3289));
                properties.setProperty("ItemRedChertSpadeID", Integer.toString(3290));
                properties.setProperty("ItemRedChertSwordID", Integer.toString(3291));
                properties.setProperty("ItemGoldenChertHoeID", Integer.toString(3292));
                properties.setProperty("ItemGoldenChertPickaxeID", Integer.toString(3293));
                properties.setProperty("ItemGoldenChertSpadeID", Integer.toString(3294));
                properties.setProperty("ItemGoldenChertSwordID", Integer.toString(3295));
                properties.setProperty("ItemChertHelmetID", Integer.toString(3296));
                properties.setProperty("ItemChertChestplateID", Integer.toString(3297));
                properties.setProperty("ItemChertLeggingsID", Integer.toString(3298));
                properties.setProperty("ItemChertBootsID", Integer.toString(3299));
                properties.setProperty("ItemBlackChertHelmetID", Integer.toString(3300));
                properties.setProperty("ItemBlackChertChestplateID", Integer.toString(3301));
                properties.setProperty("ItemBlackChertLeggingsID", Integer.toString(3302));
                properties.setProperty("ItemBlackChertBootsID", Integer.toString(3303));
                properties.setProperty("ItemRedChertHelmetID", Integer.toString(3304));
                properties.setProperty("ItemRedChertChestplateID", Integer.toString(3305));
                properties.setProperty("ItemRedChertLeggingsID", Integer.toString(3306));
                properties.setProperty("ItemRedChertBootsID", Integer.toString(3307));
                properties.setProperty("ItemGoldenChertHelmetID", Integer.toString(3308));
                properties.setProperty("ItemGoldenChertChestplateID", Integer.toString(3309));
                properties.setProperty("ItemGoldenChertLeggingsID", Integer.toString(3310));
                properties.setProperty("ItemGoldenChertBootsID", Integer.toString(3311));
                properties.setProperty("ItemPetrifiedChertID", Integer.toString(3312));
                properties.setProperty("ItemCobaltChertID", Integer.toString(3313));
                properties.setProperty("ItemCobaltChertHelmetID", Integer.toString(3314));
                properties.setProperty("ItemCobaltChertChestplateID", Integer.toString(3315));
                properties.setProperty("ItemCobaltChertLeggingsID", Integer.toString(3316));
                properties.setProperty("ItemCobaltChertBootsID", Integer.toString(3317));
                properties.setProperty("ItemCobaltChertHoeID", Integer.toString(3318));
                properties.setProperty("ItemCobaltChertPickaxeID", Integer.toString(3319));
                properties.setProperty("ItemCobaltChertSpadeID", Integer.toString(3320));
                properties.setProperty("ItemCobaltChertSwordID", Integer.toString(3321));
                properties.setProperty("ItemCobaltChertAxeID", Integer.toString(3322));
                properties.setProperty("ItemWoodenSpearID", Integer.toString(3323));
                properties.setProperty("ItemNetherQuartzSpearID", Integer.toString(3324));
                properties.setProperty("ItemPetrifiedChertSpearID", Integer.toString(3325));
                properties.setProperty("ItemCarbonizedChertID", Integer.toString(3326));
                properties.setProperty("ItemPetrifiedChertAxeID", Integer.toString(3327));
    //            properties.setProperty("ItemChertDyeID", Integer.toString(3328));
                
                properties.store(fileoutputstream, "Change the ID's to fix ID incompatibilities. For Treecapitator, use the Axe Item IDs below and add 256 for the shifted index and add them to your Treecapitator config file. The stock IDs are 3265; 3266; 3267; 3268. The stock shifted IDs are 3521; 3522; 3523; 3524.");
                fileoutputstream.close();
            }
             
            properties.load(new FileInputStream((new StringBuilder()).append(Minecraft.getMinecraftDir()).append("/mods/ChertCraft.config").toString()));
            BlockChertID = Integer.parseInt(properties.getProperty("BlockChertID"));
            BlockUnstableChertID = Integer.parseInt(properties.getProperty("BlockUnstableChertID"));
            BlockWhiteChertID = Integer.parseInt(properties.getProperty("BlockWhiteChertID"));
            BlockBlackChertID = Integer.parseInt(properties.getProperty("BlockBlackChertID"));
            BlockStoneChertID = Integer.parseInt(properties.getProperty("BlockStoneChertID"));
            BlockStoneChertBricksID = Integer.parseInt(properties.getProperty("BlockStoneChertBricksID"));
            BlockStoneChertStairsID = Integer.parseInt(properties.getProperty("BlockStoneChertStairsID"));
            BlockRedChertID = Integer.parseInt(properties.getProperty("BlockRedChertID"));
            BlockGoldenChertID = Integer.parseInt(properties.getProperty("BlockGoldenChertID"));
            BlockChertSandID = Integer.parseInt(properties.getProperty("BlockChertSandID"));
            BlockChertGlassID = Integer.parseInt(properties.getProperty("BlockChertGlassID"));
            BlockStoneChertPressurePlateID = Integer.parseInt(properties.getProperty("BlockStoneChertPressurePlateID"));
            BlockPetrifiedChertID = Integer.parseInt(properties.getProperty("BlockPetrifiedChertID"));
            BlockCobaltChertID = Integer.parseInt(properties.getProperty("BlockCobaltChertID"));
            BlockCobaltChertGlassID = Integer.parseInt(properties.getProperty("BlockCobaltChertGlassID"));
            BlockCobaltChertSandID = Integer.parseInt(properties.getProperty("BlockCobaltChertSandID"));
    //        BlockStoneChertSlabID = Integer.parseInt(properties.getProperty("BlockStoneChertSlabID"));
            BlockPetrifiedChert2ID = Integer.parseInt(properties.getProperty("BlockPetrifiedChert2ID"));
            
            ItemChertAxeID = Integer.parseInt(properties.getProperty("ItemChertAxeID"));
            ItemBlackChertAxeID = Integer.parseInt(properties.getProperty("ItemBlackChertAxeID"));
            ItemRedChertAxeID = Integer.parseInt(properties.getProperty("ItemRedChertAxeID"));
            ItemGoldenChertAxeID = Integer.parseInt(properties.getProperty("ItemGoldenChertAxeID"));
            
            ItemGravelSpearID = Integer.parseInt(properties.getProperty("ItemGravelSpearID"));
            ItemStoneChertSpearID = Integer.parseInt(properties.getProperty("ItemStoneChertSpearID"));
            ItemPetrifiedChertSpearID = Integer.parseInt(properties.getProperty("ItemPetrifiedChertSpearID"));
            ItemWoodenSpearID = Integer.parseInt(properties.getProperty("ItemWoodenSpearID"));
            ItemChertID = Integer.parseInt(properties.getProperty("ItemChertID"));
            ItemUnstableChertID = Integer.parseInt(properties.getProperty("ItemUnstableChertID"));
            ItemWhiteChertID = Integer.parseInt(properties.getProperty("ItemWhiteChertID"));
            ItemStoneChertID = Integer.parseInt(properties.getProperty("ItemStoneChertID"));
            ItemRedChertID = Integer.parseInt(properties.getProperty("ItemRedChertID"));
            ItemGoldenChertID = Integer.parseInt(properties.getProperty("ItemGoldenChertID"));
            ItemStoneChertBrickID = Integer.parseInt(properties.getProperty("ItemStoneChertBrickID"));
            
            ItemBlackChertID = Integer.parseInt(properties.getProperty("ItemBlackChertID"));
            BlockChertGlassPanelID = Integer.parseInt(properties.getProperty("BlockChertGlassPanelID"));
            BlockCobaltChertGlassPanelID = Integer.parseInt(properties.getProperty("BlockCobaltChertGlassPanelID"));
            ItemChertHoeID = Integer.parseInt(properties.getProperty("ItemChertHoeID"));
            ItemChertPickaxeID = Integer.parseInt(properties.getProperty("ItemChertPickaxeID"));
            ItemChertSpadeID = Integer.parseInt(properties.getProperty("ItemChertSpadeID"));
            ItemChertSwordID = Integer.parseInt(properties.getProperty("ItemChertSwordID"));
            ItemBlackChertHoeID = Integer.parseInt(properties.getProperty("ItemBlackChertHoeID"));
            ItemBlackChertPickaxeID = Integer.parseInt(properties.getProperty("ItemBlackChertPickaxeID"));
            ItemBlackChertSpadeID = Integer.parseInt(properties.getProperty("ItemBlackChertSpadeID"));
            ItemBlackChertSwordID = Integer.parseInt(properties.getProperty("ItemBlackChertSwordID"));
            
            ItemCobaltChertHoeID = Integer.parseInt(properties.getProperty("ItemCobaltChertHoeID"));
            ItemCobaltChertPickaxeID = Integer.parseInt(properties.getProperty("ItemCobaltChertPickaxeID"));
            ItemCobaltChertSpadeID = Integer.parseInt(properties.getProperty("ItemCobaltChertSpadeID"));
            ItemCobaltChertSwordID = Integer.parseInt(properties.getProperty("ItemCobaltChertSwordID"));
            
            ItemRedChertHoeID = Integer.parseInt(properties.getProperty("ItemRedChertHoeID"));
            ItemRedChertPickaxeID = Integer.parseInt(properties.getProperty("ItemRedChertPickaxeID"));
            ItemRedChertSpadeID = Integer.parseInt(properties.getProperty("ItemRedChertSpadeID"));
            ItemRedChertSwordID = Integer.parseInt(properties.getProperty("ItemRedChertSwordID"));
            ItemGoldenChertHoeID = Integer.parseInt(properties.getProperty("ItemGoldenChertHoeID"));
            ItemGoldenChertPickaxeID = Integer.parseInt(properties.getProperty("ItemGoldenChertPickaxeID"));
            ItemGoldenChertSpadeID = Integer.parseInt(properties.getProperty("ItemGoldenChertSpadeID"));
            ItemGoldenChertSwordID = Integer.parseInt(properties.getProperty("ItemGoldenChertSwordID"));
            ItemChertHelmetID = Integer.parseInt(properties.getProperty("ItemChertHelmetID"));
            ItemChertChestplateID = Integer.parseInt(properties.getProperty("ItemChertChestplateID"));
            ItemChertLeggingsID = Integer.parseInt(properties.getProperty("ItemChertLeggingsID"));
            ItemChertBootsID = Integer.parseInt(properties.getProperty("ItemChertBootsID"));
            ItemBlackChertHelmetID = Integer.parseInt(properties.getProperty("ItemBlackChertHelmetID"));
            ItemBlackChertChestplateID = Integer.parseInt(properties.getProperty("ItemBlackChertChestplateID"));
            ItemBlackChertLeggingsID = Integer.parseInt(properties.getProperty("ItemBlackChertLeggingsID"));
            ItemBlackChertBootsID = Integer.parseInt(properties.getProperty("ItemBlackChertBootsID"));
            ItemRedChertHelmetID = Integer.parseInt(properties.getProperty("ItemRedChertHelmetID"));
            ItemRedChertChestplateID = Integer.parseInt(properties.getProperty("ItemRedChertChestplateID"));
            ItemRedChertLeggingsID = Integer.parseInt(properties.getProperty("ItemRedChertLeggingsID"));
            ItemRedChertBootsID = Integer.parseInt(properties.getProperty("ItemRedChertBootsID"));
            ItemGoldenChertHelmetID = Integer.parseInt(properties.getProperty("ItemGoldenChertHelmetID"));
            ItemGoldenChertChestplateID = Integer.parseInt(properties.getProperty("ItemGoldenChertChestplateID"));
            ItemGoldenChertLeggingsID = Integer.parseInt(properties.getProperty("ItemGoldenChertLeggingsID"));
            ItemGoldenChertBootsID = Integer.parseInt(properties.getProperty("ItemGoldenChertBootsID"));
            ItemPetrifiedChertID = Integer.parseInt(properties.getProperty("ItemPetrifiedChertID"));
            ItemCobaltChertAxeID = Integer.parseInt(properties.getProperty("ItemCobaltChertAxeID"));
            ItemCobaltChertID = Integer.parseInt(properties.getProperty("ItemCobaltChertID"));
            ItemCobaltChertHelmetID = Integer.parseInt(properties.getProperty("ItemCobaltChertHelmetID"));
            ItemCobaltChertChestplateID = Integer.parseInt(properties.getProperty("ItemCobaltChertChestplateID"));
            ItemCobaltChertLeggingsID = Integer.parseInt(properties.getProperty("ItemCobaltChertLeggingsID"));
            ItemCobaltChertBootsID = Integer.parseInt(properties.getProperty("ItemCobaltChertBootsID"));
            ItemNetherQuartzSpearID = Integer.parseInt(properties.getProperty("ItemNetherQuartzSpearID"));
            ItemCarbonizedChertID = Integer.parseInt(properties.getProperty("ItemCarbonizedChertID"));
            ItemPetrifiedChertAxeID = Integer.parseInt(properties.getProperty("ItemPetrifiedChertAxeID"));
   //         ItemChertDyeID = Integer.parseInt(properties.getProperty("ItemChertDyeID"));
            
        }
        catch(IOException ioexception)
        {
            ioexception.printStackTrace();
            BlockStoneChertPressurePlateID = 232; 
            BlockPetrifiedChertID = 233;
            BlockCobaltChertID = 234;
            BlockCobaltChertGlassID = 235;
            BlockChertGlassPanelID = 236;
            BlockCobaltChertGlassPanelID = 237;
            BlockCobaltChertSandID = 238;
      //      BlockStoneChertSlabID = 239;
            BlockPetrifiedChert2ID = 240;
            BlockChertID = 241;
            BlockUnstableChertID = 242;
            BlockWhiteChertID = 243;
            BlockBlackChertID = 244;
            BlockStoneChertID = 245;
            BlockStoneChertBricksID = 246;
            BlockStoneChertStairsID = 247;
            BlockRedChertID = 248;
            BlockGoldenChertID = 249;
            BlockChertSandID = 251;
            BlockChertGlassID = 252;   
            
            ItemChertAxeID = 3265;
            ItemBlackChertAxeID = 3266;   
            ItemRedChertAxeID = 3267;      
            ItemGoldenChertAxeID = 3268;
            
            ItemGravelSpearID = 3269;
            ItemStoneChertSpearID = 3270;
            ItemChertID = 3271;
            ItemUnstableChertID = 3272;
            ItemWhiteChertID = 3273;
            ItemStoneChertID = 3274;
            ItemRedChertID = 3275;
            ItemGoldenChertID = 3276;
            ItemStoneChertBrickID = 3277;
            ItemBlackChertID = 3278;
            
            ItemChertHoeID = 3280;
            ItemChertPickaxeID = 3281;
            ItemChertSpadeID = 3282;
            ItemChertSwordID = 3283;
            ItemBlackChertHoeID = 3284;
            ItemBlackChertPickaxeID = 3285;
            ItemBlackChertSpadeID = 3286;
            ItemBlackChertSwordID = 3287;
            ItemRedChertHoeID = 3288;
            ItemRedChertPickaxeID = 3289;
            ItemRedChertSpadeID = 3290;
            ItemRedChertSwordID = 3291;
            ItemGoldenChertHoeID = 3292;
            ItemGoldenChertPickaxeID = 3293;
            ItemGoldenChertSpadeID = 3294;
            ItemGoldenChertSwordID = 3295;
            ItemChertHelmetID = 3296;
            ItemChertChestplateID = 3297;
            ItemChertLeggingsID = 3298;
            ItemChertBootsID = 3299;
            ItemBlackChertHelmetID = 3300;
            ItemBlackChertChestplateID = 3301;
            ItemBlackChertLeggingsID = 3302;
            ItemBlackChertBootsID = 3303;
            ItemRedChertHelmetID = 3304;
            ItemRedChertChestplateID = 3305;
            ItemRedChertLeggingsID = 3306;
            ItemRedChertBootsID = 3307;
            ItemGoldenChertHelmetID = 3308;
            ItemGoldenChertChestplateID = 3309;
            ItemGoldenChertLeggingsID = 3310;
            ItemGoldenChertBootsID = 3311;
            ItemPetrifiedChertID = 3312;
            ItemCobaltChertID = 3313;
            ItemCobaltChertHelmetID = 3314;
            ItemCobaltChertChestplateID = 3315;
            ItemCobaltChertLeggingsID = 3316;
            ItemCobaltChertBootsID = 3317;
            ItemCobaltChertHoeID = 3318;
            ItemCobaltChertPickaxeID = 3319;
            ItemCobaltChertSpadeID = 3320;
            ItemCobaltChertSwordID = 3321;
            ItemCobaltChertAxeID = 3322;
            ItemWoodenSpearID = 3323;
            ItemNetherQuartzSpearID = 3324;
            ItemPetrifiedChertSpearID = 3325;
            ItemCarbonizedChertID = 3326;
            ItemPetrifiedChertAxeID = 3327;
    //        ItemPetrifiedChertAxeID = 3328;
        }
	}
	

   	public static Item ItemChertAxe;
    public static int ItemChertAxeID;
    public static Item ItemBlackChertAxe;
    public static int ItemBlackChertAxeID;
    public static Item ItemRedChertAxe;
    public static int ItemRedChertAxeID;
    public static Item ItemGoldenChertAxe;
    public static int ItemGoldenChertAxeID;		
    public static Item ItemGravelSpear;
    public static int ItemGravelSpearID;
    public static Item ItemStoneChertSpear;
    public static int ItemStoneChertSpearID;
    public static Item ItemWoodenSpear;
    public static int ItemWoodenSpearID;
    public static Item ItemChert;
    public static int ItemChertID;
    public static Item ItemUnstableChert;
    public static int ItemUnstableChertID;
    public static Item ItemPetrifiedChert;
    public static int ItemPetrifiedChertID;
    public static Block BlockCobaltChertGlassPanel;
    public static int BlockCobaltChertGlassPanelID;
    public static Block BlockCobaltChertSand;
    public static int BlockCobaltChertSandID;
    public static Item ItemCobaltChert;
    public static int ItemCobaltChertID;
    public static Item ItemWhiteChert;
    public static int ItemWhiteChertID;
    public static Item ItemStoneChert;
    public static int ItemStoneChertID;
    public static Item ItemRedChert;
    public static int ItemRedChertID;
    public static Item ItemGoldenChert;
    public static int ItemGoldenChertID;
    public static Item ItemStoneChertBrick;
    public static int ItemStoneChertBrickID;
    public static Item ItemBlackChert;
    public static int ItemBlackChertID;
    public static Block BlockChertGlassPanel;
    public static int BlockChertGlassPanelID;
    public static Item ItemChertHoe;
    public static int ItemChertHoeID;
    public static Item ItemChertPickaxe;
    public static int ItemChertPickaxeID;
    public static Item ItemChertSpade;
    public static int ItemChertSpadeID;
    public static Item ItemChertSword;
    public static int ItemChertSwordID;
    public static Item ItemCobaltChertHoe;
    public static int ItemCobaltChertHoeID;
    public static Item ItemCobaltChertPickaxe;
    public static int ItemCobaltChertPickaxeID;
    public static Item ItemCobaltChertSpade;
    public static int ItemCobaltChertSpadeID;
    public static Item ItemCobaltChertSword;
    public static int ItemCobaltChertSwordID;
    public static Item ItemBlackChertHoe;
    public static int ItemBlackChertHoeID;
    public static Item ItemBlackChertPickaxe;
    public static int ItemBlackChertPickaxeID;
    public static Item ItemBlackChertSpade;
    public static int ItemBlackChertSpadeID;
    public static Item ItemBlackChertSword;
    public static int ItemBlackChertSwordID;
    public static Item ItemRedChertHoe;
    public static int ItemRedChertHoeID;
    public static Item ItemRedChertPickaxe;
    public static int ItemRedChertPickaxeID;
    public static Item ItemRedChertSpade;
    public static int ItemRedChertSpadeID;
    public static Item ItemRedChertSword;
    public static int ItemRedChertSwordID;
    public static Item ItemGoldenChertHoe;
    public static int ItemGoldenChertHoeID;
    public static Item ItemGoldenChertPickaxe;
    public static int ItemGoldenChertPickaxeID;
    public static Item ItemGoldenChertSpade;
    public static int ItemGoldenChertSpadeID;
    public static Item ItemGoldenChertSword;
    public static int ItemGoldenChertSwordID;
    public static Item ItemChertHelmet;
    public static int ItemChertHelmetID;
    public static Item ItemChertChestplate;
    public static int ItemChertChestplateID;
    public static Item ItemChertLeggings;
    public static int ItemChertLeggingsID;
    public static Item ItemChertBoots;
    public static int ItemChertBootsID;	
    public static Item ItemBlackChertHelmet;
    public static int ItemBlackChertHelmetID;
    public static Item ItemBlackChertChestplate;
    public static int ItemBlackChertChestplateID;
    public static Item ItemBlackChertLeggings;
    public static int ItemBlackChertLeggingsID;
    public static Item ItemBlackChertBoots;
    public static int ItemBlackChertBootsID;
    public static Item ItemRedChertHelmet;
    public static int ItemRedChertHelmetID;
    public static Item ItemRedChertChestplate;
    public static int ItemRedChertChestplateID;
    public static Item ItemRedChertLeggings;
    public static int ItemRedChertLeggingsID;	
    public static Item ItemRedChertBoots;
    public static int ItemRedChertBootsID;
    public static Item ItemGoldenChertHelmet;
    public static int ItemGoldenChertHelmetID;
    public static Item ItemGoldenChertChestplate;
    public static int ItemGoldenChertChestplateID;
    public static Item ItemGoldenChertLeggings;
    public static int ItemGoldenChertLeggingsID;
    public static Item ItemGoldenChertBoots;
    public static int ItemGoldenChertBootsID;
    public static Item ItemCobaltChertAxe;
    public static int ItemCobaltChertAxeID;
    public static Item ItemCobaltChertHelmet;
    public static int ItemCobaltChertHelmetID;
    public static Item ItemCobaltChertChestplate;
    public static int ItemCobaltChertChestplateID;
    public static Item ItemCobaltChertLeggings;
    public static int ItemCobaltChertLeggingsID;
    public static Item ItemCobaltChertBoots;
    public static int ItemCobaltChertBootsID;	
	public static Block BlockChert;
    public static int BlockChertID;
    public static Block BlockUnstableChert;
    public static int BlockUnstableChertID;
    public static Block BlockRedChert;
    public static int BlockRedChertID;
    public static Block BlockGoldenChert;
    public static int BlockGoldenChertID;
    public static Block BlockWhiteChert;
    public static int BlockWhiteChertID;
    public static Block BlockChertSand;
    public static int BlockChertSandID;
    public static Block BlockChertGlass;
    public static int BlockChertGlassID;
    public static Block BlockStoneChertPressurePlate;
    public static int BlockStoneChertPressurePlateID;
    public static Block BlockPetrifiedChert;
    public static int BlockPetrifiedChertID;
    public static Block BlockCobaltChert;
    public static int BlockCobaltChertID;
    public static Block BlockCobaltChertGlass;
    public static int BlockCobaltChertGlassID;
    public static Block BlockBlackChert;
    public static int BlockBlackChertID;
    public static Block BlockStoneChert;
    public static int BlockStoneChertID;
    public static Block BlockStoneChertBricks;
    public static int BlockStoneChertBricksID;
 //   public static Block BlockStoneChertSlab;
 //   public static int BlockStoneChertSlabID;
    public static Block BlockPetrifiedChert2;
    public static int BlockPetrifiedChert2ID;
    public static Block BlockStoneChertStairs;
    public static int BlockStoneChertStairsID;
    public static Item ItemNetherQuartzSpear;
    public static int ItemNetherQuartzSpearID;
    public static Item ItemPetrifiedChertSpear;
    public static int ItemPetrifiedChertSpearID;
    public static Item ItemPetrifiedChertAxe;
    public static int ItemPetrifiedChertAxeID;
    public static Item ItemCarbonizedChert;
    public static int ItemCarbonizedChertID;
    	     
	public int addFuel(int par1, int par2)
    {
    	//200 for each item, 1600 for coal
        if(par1 == ItemUnstableChert.itemID)
        {
            return 1254;
        }
        if(par1 == ItemCarbonizedChert.itemID)
        {
            return 4800;
        }
        return 0;
    }
    	
public void generateSurface(World world, Random r, int i, int j)
{
    for(int k = 0; k < 15 + r.nextInt(30); k++)
    {
    	//on leaves
         int randPosX = i + r.nextInt(16);
         int randPosY = r.nextInt(256);
         int randPosZ = j + r.nextInt(16);
         (new WorldGenPetrifiedChert()).generate(world, r, randPosX, randPosY, randPosZ);
    }
    
    for(int k = 0; k < 14 + r.nextInt(32); k++)
    {
    	//in leaves
         int randPosX = i + r.nextInt(16);
         int randPosY = r.nextInt(256);
         int randPosZ = j + r.nextInt(16);
         (new WorldGenPetrifiedChert2(BlockPetrifiedChert2.blockID, 1 + r.nextInt(5))).generate(world, r, randPosX, randPosY, randPosZ);
    }
    
    for(int k = 0; k < 10 + r.nextInt(15); k++)
    {
         int randPosX = i + r.nextInt(16);
         int randPosY = r.nextInt(52);
         int randPosZ = j + r.nextInt(16);
         (new WorldGenMinable(BlockCobaltChert.blockID, 1 + r.nextInt(4))).generate(world, r, randPosX, randPosY, randPosZ);
    }
    
    for(int k = 0; k < 6 + r.nextInt(10); k++)
    {
         int randPosX = i + r.nextInt(16);
         int randPosY = r.nextInt(128);
         int randPosZ = j + r.nextInt(16);
         (new WorldGenMinable(BlockCobaltChertSand.blockID, 3 + r.nextInt(5))).generate(world, r, randPosX, randPosY, randPosZ);
    }
    
    for(int k = 0; k < 10 + r.nextInt(20); k++)
    {
         int randPosX = i + r.nextInt(16);
         int randPosY = r.nextInt(128);
         int randPosZ = j + r.nextInt(16);
         (new WorldGenMinable(BlockChert.blockID, 2 + r.nextInt(3))).generate(world, r, randPosX, randPosY, randPosZ);
    }
    
    for(int k = 0; k < 10 + r.nextInt(15); k++)
    {
         int randPosX = i + r.nextInt(16);
         int randPosY = r.nextInt(128);
         int randPosZ = j + r.nextInt(16);
         (new WorldGenMinable(BlockBlackChert.blockID, 2 + r.nextInt(3))).generate(world, r, randPosX, randPosY, randPosZ);
    }
	
    for(int k = 0; k < 15 + r.nextInt(25); k++)
    {
         int randPosX = i + r.nextInt(16);
         int randPosY = r.nextInt(128);
         int randPosZ = j + r.nextInt(16);
         (new WorldGenMinable(BlockStoneChert.blockID, 4 + r.nextInt(8))).generate(world, r, randPosX, randPosY, randPosZ);
    }
    
    for(int k = 0; k < 12 + r.nextInt(22); k++)
    {
         int randPosX = i + r.nextInt(16);
         int randPosY = r.nextInt(128);
         int randPosZ = j + r.nextInt(16);
         (new WorldGenMinable(BlockWhiteChert.blockID, 3 + r.nextInt(5))).generate(world, r, randPosX, randPosY, randPosZ);
    }
    
        for(int k = 0; k < 15 + r.nextInt(45); k++)
    {
         int randPosX = i + r.nextInt(16);
         int randPosY = r.nextInt(128);
         int randPosZ = j + r.nextInt(16);
         (new WorldGenMinable(BlockUnstableChert.blockID, 3 + r.nextInt(10))).generate(world, r, randPosX, randPosY, randPosZ);
    }
    
       for(int k = 0; k < 15 + r.nextInt(30); k++)
    {
         int randPosX = i + r.nextInt(16);
         int randPosY = r.nextInt(128);
         int randPosZ = j + r.nextInt(16);
         (new WorldGenMinable(BlockChertSand.blockID, 4 + r.nextInt(10))).generate(world, r, randPosX, randPosY, randPosZ);
    }
    
    
    
       for(int k = 0; k < 10 + r.nextInt(10); k++)
    {
                 int randPosX = i + r.nextInt(16);
                 int randPosY = r.nextInt(45);
                 int randPosZ = j + r.nextInt(16);
                 (new WorldGenMinable(BlockRedChert.blockID, 1 + r.nextInt(4))).generate(world, r, randPosX, randPosY, randPosZ);
    }
         
       for(int k = 0; k < 5 + r.nextInt(10); k++)
    {
                 int randPosX = i + r.nextInt(16);
                 int randPosY = r.nextInt(30);
                 int randPosZ = j + r.nextInt(16);
                 (new WorldGenMinable(BlockGoldenChert.blockID, 1 + r.nextInt(2))).generate(world, r, randPosX, randPosY, randPosZ);
    }
    
}
   
   
    	
    public void generateNether(World world, Random r, int i, int j)
{
         for(int m = 0; m < 30 + r.nextInt(30); m++)
         {
                 int randPosX = i + r.nextInt(16);
                 int randPosY = r.nextInt(256);
                 int randPosZ = j + r.nextInt(16);
                 (new NetherGenChertMinable(BlockRedChert.blockID, 1 + r.nextInt(5))).generate(world, r, randPosX, randPosY, randPosZ);
         }
         
         for(int m = 0; m < 20 + r.nextInt(20); m++)
         {
                 int randPosX = i + r.nextInt(16);
                 int randPosY = r.nextInt(256);
                 int randPosZ = j + r.nextInt(16);
                 (new NetherGenChertMinable(BlockGoldenChert.blockID, 1 + r.nextInt(3))).generate(world, r, randPosX, randPosY, randPosZ);
         }
         
}

    public void load() 
    	{
  //      	ModLoader.registerBlock(BlockStoneChertSlab);
        	ModLoader.registerBlock(BlockPetrifiedChert2);
        	ModLoader.registerBlock(BlockPetrifiedChert);
        	ModLoader.registerBlock(BlockCobaltChert);
        	ModLoader.registerBlock(BlockCobaltChertGlass);
        	ModLoader.registerBlock(BlockStoneChertPressurePlate);
        	ModLoader.registerBlock(BlockRedChert);
        	ModLoader.registerBlock(BlockGoldenChert);
        	ModLoader.registerBlock(BlockChert);
        	ModLoader.registerBlock(BlockUnstableChert);
        	ModLoader.registerBlock(BlockWhiteChert);
        	ModLoader.registerBlock(BlockChertSand);
        	ModLoader.registerBlock(BlockCobaltChertSand);
        	ModLoader.registerBlock(BlockChertGlassPanel);
        	ModLoader.registerBlock(BlockCobaltChertGlassPanel);
        	ModLoader.registerBlock(BlockChertGlass);
        	ModLoader.registerBlock(BlockStoneChertBricks);
        	ModLoader.registerBlock(BlockBlackChert);
        	ModLoader.registerBlock(BlockStoneChertStairs);
            ModLoader.registerBlock(BlockStoneChert);
       	}

}
