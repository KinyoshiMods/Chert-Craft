package net.minecraft.src;

public enum EnumChertToolMaterial
{
    WOODSPEAR(mod_ChertCraft.EnumWoodSpearPower, mod_ChertCraft.EnumWoodSpearUses, mod_ChertCraft.EnumWoodSpearSpeed, mod_ChertCraft.EnumWoodSpearDamage, mod_ChertCraft.EnumWoodSpearEnchant),	
    GRAVELSPEAR(mod_ChertCraft.EnumGravelSpearPower, mod_ChertCraft.EnumGravelSpearUses, mod_ChertCraft.EnumGravelSpearSpeed, mod_ChertCraft.EnumGravelSpearDamage, mod_ChertCraft.EnumGravelSpearEnchant),	
    STONESPEAR(mod_ChertCraft.EnumStoneSpearPower, mod_ChertCraft.EnumStoneSpearUses, mod_ChertCraft.EnumStoneSpearSpeed, mod_ChertCraft.EnumStoneSpearDamage, mod_ChertCraft.EnumStoneSpearEnchant),
    SANDSTONESPEAR(mod_ChertCraft.EnumSandStoneSpearPower, mod_ChertCraft.EnumSandStoneSpearUses, mod_ChertCraft.EnumSandStoneSpearSpeed, mod_ChertCraft.EnumSandStoneSpearDamage, mod_ChertCraft.EnumSandStoneSpearEnchant),
    PETRIFIEDCHERT(mod_ChertCraft.EnumPetrifiedChertPower, mod_ChertCraft.EnumPetrifiedChertUses, mod_ChertCraft.EnumPetrifiedChertSpeed, mod_ChertCraft.EnumPetrifiedChertDamage, mod_ChertCraft.EnumPetrifiedChertEnchant),
    CHERT(mod_ChertCraft.EnumChertPower, mod_ChertCraft.EnumChertUses, mod_ChertCraft.EnumChertSpeed, mod_ChertCraft.EnumChertDamage, mod_ChertCraft.EnumChertEnchant),
    BLACKCHERT(mod_ChertCraft.EnumBlackChertPower, mod_ChertCraft.EnumBlackChertUses, mod_ChertCraft.EnumBlackChertSpeed, mod_ChertCraft.EnumBlackChertDamage, mod_ChertCraft.EnumBlackChertEnchant),
    COBALTCHERT(mod_ChertCraft.EnumCobaltChertPower, mod_ChertCraft.EnumCobaltChertUses, mod_ChertCraft.EnumCobaltChertSpeed, mod_ChertCraft.EnumCobaltChertDamage, mod_ChertCraft.EnumCobaltChertEnchant),
    REDCHERT(mod_ChertCraft.EnumRedChertPower, mod_ChertCraft.EnumRedChertUses, mod_ChertCraft.EnumRedChertSpeed, mod_ChertCraft.EnumRedChertDamage, mod_ChertCraft.EnumRedChertEnchant),
    NETHERQUARTZSPEAR(mod_ChertCraft.EnumNetherQuartzSpearPower, mod_ChertCraft.EnumNetherQuartzSpearUses, mod_ChertCraft.EnumNetherQuartzSpearSpeed, mod_ChertCraft.EnumNetherQuartzSpearDamage, mod_ChertCraft.EnumNetherQuartzSpearEnchant),
    GOLDENCHERT(mod_ChertCraft.EnumGoldChertPower, mod_ChertCraft.EnumGoldChertUses, mod_ChertCraft.EnumGoldChertSpeed, mod_ChertCraft.EnumGoldChertDamage, mod_ChertCraft.EnumGoldChertEnchant);
    
    private final int harvestLevel;
    private final int maxUses;
    private final float efficiencyOnProperMaterial;
    private final int damageVsEntity;
    private final int enchantability;

    private EnumChertToolMaterial(int var3, int var4, float var5, int var6, int var7)
    {
        this.harvestLevel = var3;
        this.maxUses = var4;
        this.efficiencyOnProperMaterial = var5;
        this.damageVsEntity = var6;
        this.enchantability = var7;
    }

    public int getMaxUses()
    {
        return this.maxUses;
    }

    public float getEfficiencyOnProperMaterial()
    {
        return this.efficiencyOnProperMaterial;
    }

    public int getDamageVsEntity()
    {
        return this.damageVsEntity;
    }

    public int getHarvestLevel()
    {
        return this.harvestLevel;
    }

    public int getEnchantability()
    {
        return this.enchantability;
    }
}
