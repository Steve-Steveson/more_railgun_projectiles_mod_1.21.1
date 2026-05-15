package net.steveson.morerailgunprojectiles.api;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class MRPTags {

    private MRPTags() {

    }

    public static final TagKey<Item> RODS_CONSTANTAN = createTag("rods/constantan");
    public static final TagKey<Item> RODS_URANIUM = createTag("rods/uranium");
    public static final TagKey<Item> RODS_LEAD = createTag("rods/lead");
    public static final TagKey<Item> RODS_ELECTRUM = createTag("rods/electrum");

    public static final TagKey<Item> RODS_NICKEL = createTag("rods/nickel");
    public static final TagKey<Item> RODS_COPPER = createTag("rods/copper");
    public static final TagKey<Item> RODS_GOLD = createTag("rods/gold");
    public static final TagKey<Item> RODS_SILVER = createTag("rods/silver");

    public static final TagKey<Item> RODS_BRASS = createTag("rods/brass");

    public static final TagKey<Item> RODS_WROUGHT_IRON = createTag("rods/wrought_iron");

    public static final TagKey<Item> RODS_BRONZE = createTag("rods/bronze");
    public static final TagKey<Item> RODS_BISMUTH_BRONZE = createTag("rods/bismuth_bronze");
    public static final TagKey<Item> RODS_BLACK_BRONZE = createTag("rods/black_bronze");
    public static final TagKey<Item> RODS_CAST_IRON = createTag("rods/cast_iron");
    public static final TagKey<Item> RODS_BLACK_STEEL = createTag("rods/black_steel");
    public static final TagKey<Item> RODS_RED_STEEL = createTag("rods/red_steel");
    public static final TagKey<Item> RODS_BLUE_STEEL = createTag("rods/blue_steel");

    public static final TagKey<Item> RODS_ROSE_GOLD = createTag("rods/rose_gold");
    public static final TagKey<Item> RODS_STERLING_SILVER = createTag("rods/sterling_silver");

    public static final TagKey<Item> RODS_BISMUTH = createTag("rods/bismuth");
    public static final TagKey<Item> RODS_ZINC = createTag("rods/zinc");
    public static final TagKey<Item> RODS_TIN = createTag("rods/tin");


    private static TagKey<Item> createTag(String name) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c" , name));
    }
}
