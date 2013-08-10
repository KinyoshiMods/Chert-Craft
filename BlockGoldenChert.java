package net.minecraft.src;
import java.util.Random;

public class BlockGoldenChert extends Block
{
public BlockGoldenChert(int par1)
{
         super(par1, Material.rock);
         this.setCreativeTab(CreativeTabs.tabBlock);
}

public int quantityDropped(Random par1Random)
{
         return 1;
}

public int idDropped(int par1, Random par2Random, int par3)
{
         return mod_ChertCraft.ItemGoldenChert.itemID;
}

 /**
     * Drops the block items with a specified chance of dropping the specified items
     */
    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);

        if (this.idDropped(par5, par1World.rand, par7) != this.blockID)
        {
            int var8 = 0;

            if (this.blockID == mod_ChertCraft.BlockGoldenChert.blockID)
            {
                var8 = MathHelper.getRandomIntegerInRange(par1World.rand, 0, 2);
            }
            
            this.dropXpOnBlockBreak(par1World, par2, par3, par4, var8);
        }
    }
}