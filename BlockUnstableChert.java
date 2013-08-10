package net.minecraft.src;
import java.util.Random;

public class BlockUnstableChert extends Block
{
public BlockUnstableChert(int par1)
{
         super(par1, Material.rock);
         this.setCreativeTab(CreativeTabs.tabBlock);
}

public int quantityDropped(Random par1Random)
{
         return 1 + par1Random.nextInt(5);
}

public int idDropped(int par1, Random par2Random, int par3)
{
         return mod_ChertCraft.ItemUnstableChert.itemID;
}
 
    public void onBlockDestroyedByPlayer(World var1, int var2, int var3, int var4, int var5)
    {
        boolean var6 = new Boolean(true);
        var1.createExplosion((Entity)null, (double)var2, (double)var3, (double)var4, 1.6F, var6);
    }
    
    public void onBlockDestroyedByExplosion(World var1, int var2, int var3, int var4, int var5)
    {
    	boolean var6 = new Boolean(true);
        var1.createExplosion((Entity)null, (double)var2, (double)var3, (double)var4, 1.6F, var6);
    }
    
    public boolean canDropFromExplosion(Explosion par1Explosion)
    {
        return true;
    }
    
    public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (par1World.canLightningStrikeAt(par2, par3 + 1, par4) && par5Random.nextInt(1) == 1)
        {
          boolean var6 = new Boolean(true);
          par1World.createExplosion((Entity)null, (double)par2, (double)par3, (double)par4, 50.0F, var6);
        }
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

            if (this.blockID == mod_ChertCraft.BlockUnstableChert.blockID)
            {
                var8 = MathHelper.getRandomIntegerInRange(par1World.rand, 0, 1);
            }
            
            this.dropXpOnBlockBreak(par1World, par2, par3, par4, var8);
        }
    }
}