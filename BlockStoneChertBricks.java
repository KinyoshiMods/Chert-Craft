package net.minecraft.src;
import java.util.Random;

public class BlockStoneChertBricks extends Block
{
 public BlockStoneChertBricks(int par1)
 {
         super(par1, Material.rock);
         this.setCreativeTab(CreativeTabs.tabBlock);
 }

 public int quantityDropped(int par1, Random r)
 {
         return 1;
 }

 public int idDropped(int par1, Random par2Random, int par3)
 {
         return mod_ChertCraft.BlockStoneChertBricks.blockID;
 }

}