package net.davrial.ancindicators.datagen;

import net.davrial.ancindicators.ANCIndicators;
import net.davrial.ancindicators.item.ModItems;
import net.davrial.ancindicators.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, ANCIndicators.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        //FILL IN BLOCKS HERE
        //FILL IN TAGS HERE

        /*
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.SAPPHIRE_HELMET.get(),
                        ModItems.SAPPHIRE_CHESTPLATE.get(),
                        ModItems.SAPPHIRE_LEGGINGS.get(),
                        ModItems.SAPPHIRE_BOOTS.get()
                );
         */

        this.tag(ModTags.Items.COLORING_TOOLS)
                .add(ModItems.ERASER.get(),
                    ModItems.MAGIC_ERASER.get(),
                    ModItems.PALETTE.get(),
                    ModItems.PALETTE_TEXT.get(),
                    ModItems.PALETTE_BLOCKS.get(),
                    ModItems.FLASK_OF_ETERNAL_DARKNESS.get(),
                    ModItems.VESSEL_OF_INFINITE_LIGHT.get(),
                    ModItems.VIAL_OF_CLEANING_SOLUTION_WHITE.get(),
                    ModItems.VIAL_OF_DARKENING_SOLUTION_BLACK.get(),
                    ModItems.VIAL_OF_PAINT_STRONG_RED.get()
                )
                .addTag(ModTags.Items.ERASERS)
        ;

        this.tag(ModTags.Items.ANY_INDICATOR)
                .addTag(ModTags.Items.ALL_INDICATOR_ITEMS)
                .addTag(ModTags.Items.ALL_INDICATOR_BLOCK_ITEMS)
        ;

        this.tag(ModTags.Items.ALL_INDICATOR_ITEMS)
                .addTag(ModTags.Items.NON_BLANK_INDICATOR_ITEMS)
                .addTag(ModTags.Items.ALPHABETIC_INDICATOR_ITEMS)
                .addTag(ModTags.Items.NUMERIC_INDICATOR_ITEMS)
                .addTag(ModTags.Items.BLOCK_COLOR_INDICATOR_ITEMS)
                .addTag(ModTags.Items.TEXT_COLOR_INDICATOR_ITEMS)
                .addTag(ModTags.Items.DIRECTIONAL_INDICATOR_ITEMS)
                .addTag(ModTags.Items.TIME_INDICATOR_ITEMS)
                .add(ModItems.BLANK_INDICATOR_ITEM.get()         )
                .add(ModItems.DARKENED_BLANK_INDICATOR_ITEM.get())
        ;

        this.tag(ModTags.Items.NON_BLANK_INDICATOR_ITEMS)
                .add(ModItems.ALPHABETIC_INDICATOR_TEMPLATE_ITEM.get(),
                        ModItems.NUMERIC_INDICATOR_TEMPLATE_ITEM.get(),
                        ModItems.BLOCK_COLOR_INDICATOR_TEMPLATE_ITEM.get(),
                        ModItems.TEXT_COLOR_INDICATOR_TEMPLATE_ITEM.get(),
                        ModItems.TEXT_COLOR_INDICATOR_TEMPLATE_ITEM_DARKENED.get()
                        )
        ;

        this.tag(ModTags.Items.ALPHABETIC_INDICATOR_ITEMS)
                .add(ModItems.ALPHABETIC_INDICATOR_TEMPLATE_ITEM.get(),
                        ModItems.ALPHABETIC_INDICATOR_ITEM_A.get(),
                        ModItems.ALPHABETIC_INDICATOR_ITEM_B.get(),
                        ModItems.ALPHABETIC_INDICATOR_ITEM_C.get(),
                        ModItems.ALPHABETIC_INDICATOR_ITEM_D.get(),
                        ModItems.ALPHABETIC_INDICATOR_ITEM_E.get(),
                        ModItems.ALPHABETIC_INDICATOR_ITEM_F.get(),
                        ModItems.ALPHABETIC_INDICATOR_ITEM_G.get(),
                        ModItems.ALPHABETIC_INDICATOR_ITEM_H.get(),
                        ModItems.ALPHABETIC_INDICATOR_ITEM_I.get(),
                        ModItems.ALPHABETIC_INDICATOR_ITEM_J.get(),
                        ModItems.ALPHABETIC_INDICATOR_ITEM_K.get(),
                        ModItems.ALPHABETIC_INDICATOR_ITEM_L.get(),
                        ModItems.ALPHABETIC_INDICATOR_ITEM_M.get(),
                        ModItems.ALPHABETIC_INDICATOR_ITEM_N.get(),
                        ModItems.ALPHABETIC_INDICATOR_ITEM_O.get(),
                        ModItems.ALPHABETIC_INDICATOR_ITEM_P.get(),
                        ModItems.ALPHABETIC_INDICATOR_ITEM_Q.get(),
                        ModItems.ALPHABETIC_INDICATOR_ITEM_R.get(),
                        ModItems.ALPHABETIC_INDICATOR_ITEM_S.get(),
                        ModItems.ALPHABETIC_INDICATOR_ITEM_T.get(),
                        ModItems.ALPHABETIC_INDICATOR_ITEM_U.get(),
                        ModItems.ALPHABETIC_INDICATOR_ITEM_V.get(),
                        ModItems.ALPHABETIC_INDICATOR_ITEM_W.get(),
                        ModItems.ALPHABETIC_INDICATOR_ITEM_X.get(),
                        ModItems.ALPHABETIC_INDICATOR_ITEM_Y.get(),
                        ModItems.ALPHABETIC_INDICATOR_ITEM_Z.get()
                )
        ;

        this.tag(ModTags.Items.NUMERIC_INDICATOR_ITEMS)
                .add(ModItems.NUMERIC_INDICATOR_TEMPLATE_ITEM.get(),
                        ModItems.NUMERIC_INDICATOR_ITEM_0.get(),
                        ModItems.NUMERIC_INDICATOR_ITEM_1.get(),
                        ModItems.NUMERIC_INDICATOR_ITEM_2.get(),
                        ModItems.NUMERIC_INDICATOR_ITEM_3.get(),
                        ModItems.NUMERIC_INDICATOR_ITEM_4.get(),
                        ModItems.NUMERIC_INDICATOR_ITEM_5.get(),
                        ModItems.NUMERIC_INDICATOR_ITEM_6.get(),
                        ModItems.NUMERIC_INDICATOR_ITEM_7.get(),
                        ModItems.NUMERIC_INDICATOR_ITEM_8.get(),
                        ModItems.NUMERIC_INDICATOR_ITEM_9.get(),
                        ModItems.NUMERIC_INDICATOR_ITEM_10.get(),
                        ModItems.NUMERIC_INDICATOR_ITEM_11.get(),
                        ModItems.NUMERIC_INDICATOR_ITEM_12.get(),
                        ModItems.NUMERIC_INDICATOR_ITEM_13.get(),
                        ModItems.NUMERIC_INDICATOR_ITEM_14.get(),
                        ModItems.NUMERIC_INDICATOR_ITEM_15.get(),
                        ModItems.NUMERIC_INDICATOR_ITEM_16.get(),
                        ModItems.NUMERIC_INDICATOR_ITEM_32.get(),
                        ModItems.NUMERIC_INDICATOR_ITEM_64.get(),
                        ModItems.NUMERIC_INDICATOR_ITEM_1000.get(),
                        ModItems.NUMERIC_INDICATOR_ITEM_EVEN.get(),
                        ModItems.NUMERIC_INDICATOR_ITEM_ODD.get(),
                        ModItems.NUMERIC_INDICATOR_ITEM_INFINITY.get(),
                        ModItems.NUMERIC_INDICATOR_ITEM_ADD.get(),
                        ModItems.NUMERIC_INDICATOR_ITEM_SUBTRACT.get(),
                        ModItems.NUMERIC_INDICATOR_ITEM_MULTIPLY.get(),
                        ModItems.NUMERIC_INDICATOR_ITEM_DIVIDE.get(),
                        ModItems.NUMERIC_INDICATOR_ITEM_EQUALS.get()
                )
        ;

        this.tag(ModTags.Items.BLOCK_COLOR_INDICATOR_ITEMS)
                .add(ModItems.BLOCK_COLOR_INDICATOR_TEMPLATE_ITEM.get(),
                        ModItems.BLOCK_COLOR_INDICATOR_ITEM_WHITE.get(),
                        ModItems.BLOCK_COLOR_INDICATOR_ITEM_LIGHT_GRAY.get(),
                        ModItems.BLOCK_COLOR_INDICATOR_ITEM_GRAY.get(),
                        ModItems.BLOCK_COLOR_INDICATOR_ITEM_BLACK.get(),
                        ModItems.BLOCK_COLOR_INDICATOR_ITEM_BROWN.get(),
                        ModItems.BLOCK_COLOR_INDICATOR_ITEM_RED.get(),
                        ModItems.BLOCK_COLOR_INDICATOR_ITEM_ORANGE.get(),
                        ModItems.BLOCK_COLOR_INDICATOR_ITEM_YELLOW.get(),
                        ModItems.BLOCK_COLOR_INDICATOR_ITEM_LIME.get(),
                        ModItems.BLOCK_COLOR_INDICATOR_ITEM_GREEN.get(),
                        ModItems.BLOCK_COLOR_INDICATOR_ITEM_CYAN.get(),
                        ModItems.BLOCK_COLOR_INDICATOR_ITEM_LIGHT_BLUE.get(),
                        ModItems.BLOCK_COLOR_INDICATOR_ITEM_BLUE.get(),
                        ModItems.BLOCK_COLOR_INDICATOR_ITEM_PURPLE.get(),
                        ModItems.BLOCK_COLOR_INDICATOR_ITEM_MAGENTA.get(),
                        ModItems.BLOCK_COLOR_INDICATOR_ITEM_PINK.get()
                )
        ;

        this.tag(ModTags.Items.ERASABLE_TO_BLANK_ITEMS)
                .addTag(ModTags.Items.ALPHABETIC_INDICATOR_ITEMS)
                .addTag(ModTags.Items.NUMERIC_INDICATOR_ITEMS)
                .addTag(ModTags.Items.BLOCK_COLOR_INDICATOR_ITEMS)
                .addTag(ModTags.Items.DIRECTIONAL_INDICATOR_ITEMS)
                .addTag(ModTags.Items.TIME_INDICATOR_ITEMS)
                .add(ModItems.TEXT_COLOR_INDICATOR_TEMPLATE_ITEM.get(),
                        ModItems.DARKENED_BLANK_INDICATOR_ITEM.get()
                        )
        ;

        this.tag(ModTags.Items.TEXT_COLOR_INDICATOR_ITEMS)
                .add(ModItems.TEXT_COLOR_INDICATOR_TEMPLATE_ITEM.get(),
                        ModItems.TEXT_COLOR_INDICATOR_TEMPLATE_ITEM_DARKENED.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_BLACK.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_DARK_BLUE.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_DARK_GREEN.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_DARK_AQUA.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_DARK_RED.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_DARK_PURPLE.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_GOLD.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_GRAY.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_DARK_GRAY.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_BLUE.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_GREEN.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_AQUA.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_RED.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_RED.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_LIGHT_PURPLE.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_YELLOW.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_WHITE.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_MINECOIN_GOLD.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_QUARTZ.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_IRON.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_NETHERITE.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_REDSTONE.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_COPPER.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_GOLD.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_EMERALD.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_DIAMOND.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_LAPIS.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_AMETHYST.get()
                )
        ;

        this.tag(ModTags.Items.ERASABLE_TO_DARKENED_ITEMS)
                .add(ModItems.TEXT_COLOR_INDICATOR_TEMPLATE_ITEM_DARKENED.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_BLACK.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_DARK_BLUE.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_DARK_GREEN.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_DARK_AQUA.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_DARK_RED.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_DARK_PURPLE.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_GOLD.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_GRAY.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_DARK_GRAY.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_BLUE.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_GREEN.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_AQUA.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_RED.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_RED.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_LIGHT_PURPLE.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_YELLOW.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_WHITE.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_MINECOIN_GOLD.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_QUARTZ.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_IRON.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_NETHERITE.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_REDSTONE.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_COPPER.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_GOLD.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_EMERALD.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_DIAMOND.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_LAPIS.get(),
                        ModItems.TEXT_COLOR_INDICATOR_ITEM_MATERIAL_AMETHYST.get()
                )
        ;

        this.tag(ModTags.Items.ERASABLE_TO_REDSTONE_LEVEL_ITEMS)
                .add(ModItems.REDSTONE_INDICATOR_ITEM_0.get(),
                        ModItems.REDSTONE_INDICATOR_ITEM_1.get(),
                        ModItems.REDSTONE_INDICATOR_ITEM_2.get(),
                        ModItems.REDSTONE_INDICATOR_ITEM_3.get(),
                        ModItems.REDSTONE_INDICATOR_ITEM_4.get(),
                        ModItems.REDSTONE_INDICATOR_ITEM_5.get(),
                        ModItems.REDSTONE_INDICATOR_ITEM_6.get(),
                        ModItems.REDSTONE_INDICATOR_ITEM_7.get(),
                        ModItems.REDSTONE_INDICATOR_ITEM_8.get(),
                        ModItems.REDSTONE_INDICATOR_ITEM_9.get(),
                        ModItems.REDSTONE_INDICATOR_ITEM_10.get(),
                        ModItems.REDSTONE_INDICATOR_ITEM_11.get(),
                        ModItems.REDSTONE_INDICATOR_ITEM_12.get(),
                        ModItems.REDSTONE_INDICATOR_ITEM_13.get(),
                        ModItems.REDSTONE_INDICATOR_ITEM_14.get(),
                        ModItems.REDSTONE_INDICATOR_ITEM_15.get(),
                        ModItems.REDSTONE_INDICATOR_TEMPLATE_ITEM.get(),
                        ModItems.BLANK_REDSTONE_INDICATOR_ITEM.get()
                )
        ;

        this.tag(ModTags.Items.REDSTONE_INDICATOR_ITEMS)
                .add(ModItems.REDSTONE_INDICATOR_ITEM_0.get(),
                        ModItems.REDSTONE_INDICATOR_ITEM_1.get(),
                        ModItems.REDSTONE_INDICATOR_ITEM_2.get(),
                        ModItems.REDSTONE_INDICATOR_ITEM_3.get(),
                        ModItems.REDSTONE_INDICATOR_ITEM_4.get(),
                        ModItems.REDSTONE_INDICATOR_ITEM_5.get(),
                        ModItems.REDSTONE_INDICATOR_ITEM_6.get(),
                        ModItems.REDSTONE_INDICATOR_ITEM_7.get(),
                        ModItems.REDSTONE_INDICATOR_ITEM_8.get(),
                        ModItems.REDSTONE_INDICATOR_ITEM_9.get(),
                        ModItems.REDSTONE_INDICATOR_ITEM_10.get(),
                        ModItems.REDSTONE_INDICATOR_ITEM_11.get(),
                        ModItems.REDSTONE_INDICATOR_ITEM_12.get(),
                        ModItems.REDSTONE_INDICATOR_ITEM_13.get(),
                        ModItems.REDSTONE_INDICATOR_ITEM_14.get(),
                        ModItems.REDSTONE_INDICATOR_ITEM_15.get(),
                        ModItems.REDSTONE_INDICATOR_TEMPLATE_ITEM.get()
                )
        ;

        this.tag(ModTags.Items.LIGHT_LEVEL_INDICATOR_ITEMS)
                .add(ModItems.LIGHT_LEVEL_INDICATOR_ITEM_0.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_ITEM_1.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_ITEM_2.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_ITEM_3.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_ITEM_4.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_ITEM_5.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_ITEM_6.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_ITEM_7.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_ITEM_8.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_ITEM_9.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_ITEM_10.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_ITEM_11.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_ITEM_12.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_ITEM_13.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_ITEM_14.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_ITEM_15.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_TEMPLATE_ITEM.get(),
                        ModItems.BLANK_LIGHT_LEVEL_INDICATOR_ITEM.get()
                )
        ;

        this.tag(ModTags.Items.DIRECTIONAL_INDICATOR_ITEMS)
                .add(ModItems.DIRECTIONAL_INDICATOR_ITEM_UP.get(),
                        ModItems.DIRECTIONAL_INDICATOR_ITEM_DOWN.get(),
                        ModItems.DIRECTIONAL_INDICATOR_ITEM_LEFT.get(),
                        ModItems.DIRECTIONAL_INDICATOR_ITEM_RIGHT.get(),
                        ModItems.DIRECTIONAL_INDICATOR_ITEM_AWAY.get(),
                        ModItems.DIRECTIONAL_INDICATOR_ITEM_TOWARDS.get(),
                        ModItems.DIRECTIONAL_INDICATOR_ITEM_CLOCKWISE.get(),
                        ModItems.DIRECTIONAL_INDICATOR_ITEM_CCW.get()
                )
        ;

        this.tag(ModTags.Items.TIME_INDICATOR_ITEMS)
                .add(ModItems.TIME_INDICATOR_ITEM_DAWN.get(),
                        ModItems.TIME_INDICATOR_ITEM_NOON.get(),
                        ModItems.TIME_INDICATOR_ITEM_DUSK.get(),
                        ModItems.TIME_INDICATOR_ITEM_MIDNIGHT.get()
                )
        ;

        this.tag(ModTags.Items.ERASABLE_TO_LIGHT_LEVEL_ITEMS)
                .add(ModItems.LIGHT_LEVEL_INDICATOR_ITEM_0.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_ITEM_1.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_ITEM_2.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_ITEM_3.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_ITEM_4.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_ITEM_5.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_ITEM_6.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_ITEM_7.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_ITEM_8.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_ITEM_9.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_ITEM_10.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_ITEM_11.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_ITEM_12.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_ITEM_13.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_ITEM_14.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_ITEM_15.get(),
                        ModItems.LIGHT_LEVEL_INDICATOR_TEMPLATE_ITEM.get()
                )
        ;

        this.tag(ModTags.Items.ERASABLE_TO_PLAIN_REDSTONE_ITEMS)
                .add(ModItems.BLANK_REDSTONE_INDICATOR_ITEM.get())
        ;

        this.tag(ModTags.Items.ERASABLE_TO_PLAIN_GLOWSTONE_ITEMS)
                .add(ModItems.BLANK_LIGHT_LEVEL_INDICATOR_ITEM.get())
        ;

        this.tag(ModTags.Items.ALL_ERASABLE_ITEMS)
                .addTag(ModTags.Items.ERASABLE_TO_BLANK_ITEMS)
                .addTag(ModTags.Items.ERASABLE_TO_DARKENED_ITEMS)
                .addTag(ModTags.Items.ERASABLE_TO_REDSTONE_LEVEL_ITEMS)
                .addTag(ModTags.Items.LIGHT_LEVEL_INDICATOR_ITEMS)
                .addTag(ModTags.Items.ERASABLE_TO_PLAIN_REDSTONE_ITEMS)
                .addTag(ModTags.Items.ERASABLE_TO_PLAIN_GLOWSTONE_BLOCK_ITEMS)
        ;

        this.copy(ModTags.Blocks.BLANK_INDICATOR_BLOCKS, ModTags.Items.BLANK_INDICATOR_BLOCK_ITEMS);
        this.copy(ModTags.Blocks.ALPHABETIC_INDICATOR_BLOCKS, ModTags.Items.ALPHABETIC_INDICATOR_BLOCK_ITEMS);
        this.copy(ModTags.Blocks.MISC_NUMERIC_INDICATOR_BLOCKS, ModTags.Items.MISC_NUMERIC_INDICATOR_BLOCK_ITEMS);
        this.copy(ModTags.Blocks.EVEN_NUMERIC_INDICATOR_BLOCKS, ModTags.Items.EVEN_NUMERIC_INDICATOR_BLOCK_ITEMS);
        this.copy(ModTags.Blocks.ODD_NUMERIC_INDICATOR_BLOCKS, ModTags.Items.ODD_NUMERIC_INDICATOR_BLOCK_ITEMS);
        this.copy(ModTags.Blocks.MATH_NUMERIC_INDICATOR_BLOCKS, ModTags.Items.MATH_NUMERIC_INDICATOR_BLOCK_ITEMS);
        this.copy(ModTags.Blocks.BLOCK_COLOR_INDICATOR_BLOCKS, ModTags.Items.BLOCK_COLOR_INDICATOR_BLOCK_ITEMS);
        this.copy(ModTags.Blocks.TEXT_COLOR_INDICATOR_BLOCKS, ModTags.Items.TEXT_COLOR_INDICATOR_BLOCK_ITEMS);
        this.copy(ModTags.Blocks.TEXT_COLOR_INDICATOR_BLOCKS_DARK, ModTags.Items.TEXT_COLOR_INDICATOR_BLOCK_ITEMS_DARK);
        this.copy(ModTags.Blocks.REDSTONE_INDICATOR_BLOCKS, ModTags.Items.REDSTONE_INDICATOR_BLOCK_ITEMS);
        this.copy(ModTags.Blocks.LIGHT_LEVEL_INDICATOR_BLOCKS, ModTags.Items.LIGHT_LEVEL_INDICATOR_BLOCK_ITEMS);
        this.copy(ModTags.Blocks.ERASABLE_TO_PLAIN_REDSTONE_BLOCKS, ModTags.Items.ERASABLE_TO_PLAIN_REDSTONE_BLOCK_ITEMS);
        this.copy(ModTags.Blocks.ERASABLE_TO_PLAIN_GLOWSTONE_BLOCKS, ModTags.Items.ERASABLE_TO_PLAIN_GLOWSTONE_BLOCK_ITEMS);

        //Erasable Blocks to Block Items
        this.copy(ModTags.Blocks.ERASABLE_TO_BLANK_BLOCKS, ModTags.Items.ERASABLE_TO_BLANK_BLOCK_ITEMS);
        this.copy(ModTags.Blocks.ERASABLE_TO_DARKENED_BLOCKS, ModTags.Items.ERASABLE_TO_DARKENED_BLOCK_ITEMS);
        this.copy(ModTags.Blocks.ERASABLE_TO_REDSTONE_LEVEL_BLOCKS, ModTags.Items.ERASABLE_TO_REDSTONE_LEVEL_BLOCK_ITEMS);
        this.copy(ModTags.Blocks.ERASABLE_TO_LIGHT_LEVEL_BLOCKS, ModTags.Items.ERASABLE_TO_LIGHT_LEVEL_BLOCK_ITEMS);
        this.copy(ModTags.Blocks.ERASABLE_TO_PLAIN_REDSTONE_BLOCKS, ModTags.Items.ERASABLE_TO_PLAIN_REDSTONE_BLOCK_ITEMS);
        this.copy(ModTags.Blocks.ERASABLE_TO_PLAIN_GLOWSTONE_BLOCKS, ModTags.Items.ERASABLE_TO_PLAIN_GLOWSTONE_BLOCK_ITEMS);

        this.tag(ModTags.Items.ALL_INDICATOR_BLOCK_ITEMS)
                .addTag(ModTags.Items.BLANK_INDICATOR_BLOCK_ITEMS)
                .addTag(ModTags.Items.NON_BLANK_INDICATOR_BLOCK_ITEMS)
                .addTag(ModTags.Items.ADVANCED_INDICATOR_BLOCK_ITEMS)
        ;
        this.tag(ModTags.Items.BLANK_INDICATOR_BLOCK_ITEMS);
        this.tag(ModTags.Items.NON_BLANK_INDICATOR_BLOCK_ITEMS)
                .addTag(ModTags.Items.ALPHABETIC_INDICATOR_BLOCK_ITEMS)
                .addTag(ModTags.Items.NUMERIC_INDICATOR_BLOCK_ITEMS)
                .addTag(ModTags.Items.COLOR_INDICATOR_BLOCK_ITEMS)
        ;
        this.tag(ModTags.Items.ALPHABETIC_INDICATOR_BLOCK_ITEMS);
        this.tag(ModTags.Items.NUMERIC_INDICATOR_BLOCK_ITEMS)
                .addTag(ModTags.Items.MISC_NUMERIC_INDICATOR_BLOCK_ITEMS)
                .addTag(ModTags.Items.ODD_NUMERIC_INDICATOR_BLOCK_ITEMS)
                .addTag(ModTags.Items.EVEN_NUMERIC_INDICATOR_BLOCK_ITEMS)
                .addTag(ModTags.Items.MATH_NUMERIC_INDICATOR_BLOCK_ITEMS)
        ;
        this.tag(ModTags.Items.MISC_NUMERIC_INDICATOR_BLOCK_ITEMS);
        this.tag(ModTags.Items.ODD_NUMERIC_INDICATOR_BLOCK_ITEMS);
        this.tag(ModTags.Items.EVEN_NUMERIC_INDICATOR_BLOCK_ITEMS);
        this.tag(ModTags.Items.MATH_NUMERIC_INDICATOR_BLOCK_ITEMS);
        this.tag(ModTags.Items.COLOR_INDICATOR_BLOCK_ITEMS)
                .addTag(ModTags.Items.BLOCK_COLOR_INDICATOR_BLOCK_ITEMS)
                .addTag(ModTags.Items.TEXT_COLOR_INDICATOR_BLOCK_ITEMS)
        ;
        this.tag(ModTags.Items.BLOCK_COLOR_INDICATOR_BLOCK_ITEMS);
        this.tag(ModTags.Items.TEXT_COLOR_INDICATOR_BLOCK_ITEMS);
        this.tag(ModTags.Items.ADVANCED_INDICATOR_BLOCK_ITEMS)
                .addTag(ModTags.Items.REDSTONE_INDICATOR_BLOCK_ITEMS)
                .addTag(ModTags.Items.LIGHT_LEVEL_INDICATOR_BLOCK_ITEMS);
        this.tag(ModTags.Items.REDSTONE_INDICATOR_BLOCK_ITEMS);
        this.tag(ModTags.Items.LIGHT_LEVEL_INDICATOR_BLOCK_ITEMS);

        //Erasable Block Items
        this.tag(ModTags.Items.ALL_ERASABLE_BLOCK_ITEMS)
                .addTag(ModTags.Items.ERASABLE_TO_BLANK_BLOCK_ITEMS)
                .addTag(ModTags.Items.ERASABLE_TO_DARKENED_BLOCK_ITEMS)
                .addTag(ModTags.Items.ERASABLE_TO_REDSTONE_LEVEL_BLOCK_ITEMS)
                .addTag(ModTags.Items.LIGHT_LEVEL_INDICATOR_BLOCK_ITEMS)
                .addTag(ModTags.Items.ERASABLE_TO_PLAIN_REDSTONE_BLOCK_ITEMS)
                .addTag(ModTags.Items.ERASABLE_TO_PLAIN_GLOWSTONE_BLOCK_ITEMS)
        ;
        this.tag(ModTags.Items.ERASABLE_TO_BLANK_ITEMS);
        this.tag(ModTags.Items.ERASABLE_TO_DARKENED_BLOCK_ITEMS);
        this.tag(ModTags.Items.ERASABLE_TO_REDSTONE_LEVEL_BLOCK_ITEMS);
        this.tag(ModTags.Items.ERASABLE_TO_LIGHT_LEVEL_BLOCK_ITEMS);
        this.tag(ModTags.Items.ERASABLE_TO_PLAIN_REDSTONE_BLOCK_ITEMS);
        this.tag(ModTags.Items.ERASABLE_TO_PLAIN_GLOWSTONE_BLOCK_ITEMS);


        //Combined Supertags
        this.tag(ModTags.Items.ALL_INDICATORS)
                .addTag(ModTags.Items.ALL_INDICATOR_BLOCK_ITEMS)
                .addTag(ModTags.Items.ALL_INDICATOR_ITEMS)
        ;
        this.tag(ModTags.Items.ALL_ERASABLES)
                .addTag(ModTags.Items.ALL_ERASABLE_BLOCK_ITEMS)
                .addTag(ModTags.Items.ALL_ERASABLE_ITEMS)
        ;




        //Other Item Tags

        this.tag(ModTags.Items.INDICATOR_DARKENING_ITEMS)
                .add(   Items.INK_SAC,
                        Items.COAL,
                        Items.CHARCOAL,
                        ModItems.VIAL_OF_DARKENING_SOLUTION_BLACK.get()
                );

        this.tag(ModTags.Items.INDICATOR_DARKENING_ITEMS_WITH_DYES)
                .addTag(ModTags.Items.INDICATOR_DARKENING_ITEMS)
                .add(   Items.BLACK_DYE,
                        Items.GRAY_DYE
                );

        this.tag(ModTags.Items.WRITING_ITEMS)
                .add(   Items.BOOK,
                        Items.BOOKSHELF,
                        Items.WRITABLE_BOOK,
                        Items.PAPER
                )
                .addTag(ItemTags.SIGNS)
                .addTag(ItemTags.HANGING_SIGNS)
                ;

        this.tag(ModTags.Items.MISC_ANCINDICATOR_ITEMS)
                .add(   ModItems.ERASER.get(),
                        ModItems.PALETTE.get(),
                        ModItems.PALETTE_BLOCKS.get(),
                        ModItems.PALETTE_TEXT.get(),
                        ModItems.BOTTLE_OF_PAINT_BASE.get()
                )
        ;

        this.tag(ModTags.Items.COLORING_TOOLS)
                .addTag(ModTags.Items.ALL_COLOR_PALETTES)
                .addTag(ModTags.Items.ALL_PAINTS)
        ;

        this.tag(ModTags.Items.ERASERS)
                .add(   ModItems.ERASER.get(),
                        ModItems.MAGIC_ERASER.get()
                )
        ;

        this.tag(ModTags.Items.ALL_COLOR_PALETTES)
                .addTag(ModTags.Items.BLOCK_COLOR_PALETTES)
                .addTag(ModTags.Items.TEXT_COLOR_PALETTES)
        ;

        this.tag(ModTags.Items.BLOCK_COLOR_PALETTES)
                .add(   ModItems.PALETTE.get(),
                        ModItems.PALETTE_BLOCKS.get()
                )
        ;

        this.tag(ModTags.Items.TEXT_COLOR_PALETTES)
                .add(   ModItems.PALETTE.get(),
                        ModItems.PALETTE_TEXT.get()
                )
        ;

        this.tag(ModTags.Items.ALL_PAINTS)
                .addTag(ModTags.Items.STRONG_PAINTS)
                .addTag(ModTags.Items.WEAK_PAINTS)
                .addTag(ModTags.Items.SPECIAL_PAINTS)
        ;

        this.tag(ModTags.Items.STRONG_PAINTS)
                .add(
                        ModItems.VESSEL_OF_INFINITE_LIGHT.get(),
                        ModItems.FLASK_OF_ETERNAL_DARKNESS.get(),
                        ModItems.VIAL_OF_CLEANING_SOLUTION_WHITE.get(),
                        ModItems.VIAL_OF_DARKENING_SOLUTION_BLACK.get(),
                        ModItems.VIAL_OF_PAINT_STRONG_BROWN.get(),
                        ModItems.VIAL_OF_PAINT_STRONG_RED.get(),
                        ModItems.VIAL_OF_PAINT_STRONG_ORANGE.get(),
                        ModItems.VIAL_OF_PAINT_STRONG_YELLOW.get(),
                        ModItems.VIAL_OF_PAINT_STRONG_LIME.get(),
                        ModItems.VIAL_OF_PAINT_STRONG_GREEN.get(),
                        ModItems.VIAL_OF_PAINT_STRONG_CYAN.get(),
                        ModItems.VIAL_OF_PAINT_STRONG_LIGHT_BLUE.get(),
                        ModItems.VIAL_OF_PAINT_STRONG_BLUE.get(),
                        ModItems.VIAL_OF_PAINT_STRONG_PURPLE.get(),
                        ModItems.VIAL_OF_PAINT_STRONG_MAGENTA.get(),
                        ModItems.VIAL_OF_PAINT_STRONG_PINK.get()
                )
        ;

        this.tag(ModTags.Items.WEAK_PAINTS)
                .add(
                        ModItems.VIAL_OF_CLEANING_SOLUTION_WHITE.get(),
                        ModItems.VIAL_OF_DARKENING_SOLUTION_BLACK.get()
                )
        ;

        this.tag(ModTags.Items.SPECIAL_PAINTS)
                .add(
                        ModItems.VESSEL_OF_INFINITE_LIGHT.get(),
                        ModItems.FLASK_OF_ETERNAL_DARKNESS.get()
                )
        ;

        this.tag(ModTags.Items.BASE_INDICATOR_CRAFTING_BLOCKS)
                .addTag(ItemTags.PLANKS)
                .addTag(ItemTags.DIRT)
                .addTag(ItemTags.STONE_CRAFTING_MATERIALS)
        ;

        this.tag(ModTags.Items.BETTER_INDICATOR_CRAFTING_BLOCKS)
                .add(   Items.BONE_BLOCK,
                        Items.QUARTZ_BLOCK
                )
        ;

        this.tag(ModTags.Items.INDICATOR_CRAFTING_ITEMS)
                .add(   Items.BONE_MEAL,
                        Items.QUARTZ
                )
        ;






    }
}