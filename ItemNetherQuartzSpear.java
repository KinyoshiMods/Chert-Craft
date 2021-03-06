package net.minecraft.src;

public class ItemNetherQuartzSpear extends ItemChertTool
{
    private static Block[] blocksEffectiveAgainst = new Block[] {Block.grass, Block.dirt, Block.sand, Block.gravel, Block.blockClay, Block.tilledField, Block.slowSand, Block.mycelium};

    public ItemNetherQuartzSpear(int var1, EnumChertToolMaterial var2)
    {
        super(var1, 1, var2, blocksEffectiveAgainst);
    }
    
        /**
     * Returns if the item (tool) can harvest results from the block type.
     */
    public boolean canHarvestBlock(Block var1)
    {
        return var1 == Block.obsidian ? this.toolMaterial.getHarvestLevel() == 3 : (var1 != Block.blockDiamond && var1 != Block.oreDiamond ? (var1 == Block.oreEmerald ? this.toolMaterial.getHarvestLevel() >= 2 : (var1 != Block.blockGold && var1 != Block.oreGold ? (var1 != Block.blockIron && var1 != Block.oreIron ? (var1 != Block.blockLapis && var1 != Block.oreLapis ? (var1 != Block.oreRedstone && var1 != Block.oreRedstoneGlowing ? (var1.blockMaterial == Material.rock ? true : var1.blockMaterial == Material.iron) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 1) : this.toolMaterial.getHarvestLevel() >= 1) : this.toolMaterial.getHarvestLevel() >= 2)) : this.toolMaterial.getHarvestLevel() >= 2);
    }

    /**
     * Returns the strength of the stack against a given block. 1.0F base, (Quality+1)*2 if correct blocktype, 1.5F if
     * sword
     */
    public float getStrVsBlock(ItemStack var1, Block var2)
    {
        return var2 != null && (var2.blockMaterial == Material.iron || var2.blockMaterial == Material.rock) ? this.efficiencyOnProperMaterial : super.getStrVsBlock(var1, var2);
    }
    
    public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
 {
         par1ItemStack.damageItem(1, par3EntityLiving);
         par2EntityLiving.addPotionEffect(new PotionEffect(Potion.wither.id, 80, 1));
         return true;
 }
}
