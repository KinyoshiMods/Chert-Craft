package net.minecraft.src;

public class ItemChertSword extends Item
{
    private int weaponDamage;
    private final EnumChertToolMaterial toolMaterial;

    public ItemChertSword(int var1, EnumChertToolMaterial var2)
    {
        super(var1);
        this.toolMaterial = var2;
        this.maxStackSize = 1;
        this.setMaxDamage(var2.getMaxUses());
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.weaponDamage = 4 + var2.getDamageVsEntity();
    }

    /**
     * Returns the strength of the stack against a given block. 1.0F base, (Quality+1)*2 if correct blocktype, 1.5F if
     * sword
     */
    public float getStrVsBlock(ItemStack var1, Block var2)
    {
        return var2.blockID == Block.web.blockID ? 15.0F : 1.5F;
    }

    /**
     * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
     * the damage on the stack.
     */
    public boolean hitEntity(ItemStack var1, EntityLiving var2, EntityLiving var3)
    {
        var1.damageItem(1, var3);
        return true;
    }

    public boolean onBlockDestroyed(ItemStack var1, World var2, int var3, int var4, int var5, int var6, EntityLiving var7)
    {
        if ((double)Block.blocksList[var3].getBlockHardness(var2, var4, var5, var6) != 0.0D)
        {
            var1.damageItem(2, var7);
        }

        return true;
    }

    /**
     * Returns the damage against a given entity.
     */
    public int getDamageVsEntity(Entity var1)
    {
        return this.weaponDamage;
    }

    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    public boolean isFull3D()
    {
        return true;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack var1)
    {
        return EnumAction.block;
    }

    /**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration(ItemStack var1)
    {
        return 72000;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        var3.setItemInUse(var1, this.getMaxItemUseDuration(var1));
        return var1;
    }

    /**
     * Returns if the item (tool) can harvest results from the block type.
     */
    public boolean canHarvestBlock(Block var1)
    {
        return var1.blockID == Block.web.blockID;
    }

    /**
     * Return the enchantability factor of the item, most of the time is based on material.
     */
    public int getItemEnchantability()
    {
        return this.toolMaterial.getEnchantability();
    }

    public String func_77825_f()
    {
        return this.toolMaterial.toString();
    }
}
