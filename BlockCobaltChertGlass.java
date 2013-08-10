package net.minecraft.src;

import java.util.Random;

public class BlockCobaltChertGlass extends Block
{
     public BlockCobaltChertGlass(int par1)
     {
         super(par1, Material.rock);
         this.setCreativeTab(CreativeTabs.tabBlock);
     }

     public int quantityDropped(Random par1Random)
     {
         return par1Random.nextInt(2);
     }

     public int idDropped(int par1, Random par2Random, int par3)
     {
         return  mod_ChertCraft.BlockCobaltChertGlassPanel.blockID;
     }

    /**
     * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
     * coordinates.  Args: blockAccess, x, y, z, side
     */
    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        int var6 = par1IBlockAccess.getBlockId(par2, par3, par4);
        return var6 == this.blockID ? false : super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, par5);
    }

    /**
     * Return true if a player with Silk Touch can harvest this block directly, and not its normal drops.
     */
    protected boolean canSilkHarvest()
    {
        return true;
    }

    /**
     * Returns which pass should this block be rendered on. 0 for solids and 1 for alpha
     */
    public int getRenderBlockPass()
    {
        return 0;
    }
    
    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }
}