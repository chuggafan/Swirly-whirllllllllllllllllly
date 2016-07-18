package com.github.chuggafan.items;


import com.github.chuggafan.Swirl;
import com.google.common.collect.Lists;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class Singularities extends Item implements IHaloRenderItem {
    public static IIcon background;
    public static IIcon foreground;
    public Singularities() {
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setUnlocalizedName("chugga_fan_singularity");
        this.setTextureName("chugga_fan:singularity");
        this.setCreativeTab(Swirl.tab);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean drawHalo(ItemStack stack) {
        return false;
    }
    public String getUnlocalizedName(ItemStack stack)
    {
        return "item.singularity_" + stack.getDisplayName();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getHaloTexture(ItemStack stack) {
        return null;
    }
    @Override
    public IIcon getIcon(ItemStack stack, int pass)
    {
        if (pass == 0) { return background; }
        return foreground;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public int getHaloSize(ItemStack stack) {
        return 4;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean drawPulseEffect(ItemStack stack) {
        return false;
    }
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IIconRegister ir) {
        foreground = ir.registerIcon("chugga_fan:singularity");
        background = ir.registerIcon("chugga_fan:singularity2");
    }
    @Override
    public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.uncommon;
    }
    @SideOnly(Side.CLIENT)
    @Override
    public boolean requiresMultipleRenderPasses()
    {
        return true;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public int getHaloColour(ItemStack stack) {
        return 0xFF000000;
    }
}
