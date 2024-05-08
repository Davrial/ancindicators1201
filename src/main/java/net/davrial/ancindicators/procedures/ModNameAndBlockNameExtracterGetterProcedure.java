package net.davrial.ancindicators.procedures;

import net.davrial.ancindicators.ANCIndicators;
import net.davrial.ancindicators.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraftforge.registries.ForgeRegistries;

public class ModNameAndBlockNameExtracterGetterProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
        BlockState clickedBlock = world.getBlockState(BlockPos.containing(x, y, z));
        if (itemstack.getItem() == ModItems.GETTER_STICK.get()) {



            //Mod Name and Item Name Getter
            ANCIndicators.LOGGER.info(ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString());
            ANCIndicators.LOGGER.info(String.valueOf(world.getBlockState(BlockPos.containing(x, y, z))));
            ANCIndicators.LOGGER.info((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("facing") instanceof EnumProperty _getep16
                    ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getep16).toString()
                    : "");
            ANCIndicators.LOGGER.info((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("part") instanceof EnumProperty _getep18
                    ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getep18).toString()
                    : "");
            final String GetTextInitial =
                    ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString();
            String GetText =
                    ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString();
            int GetNumber =
                    GetText.length();
            final int GetNumberInitial =
                    GetTextInitial.length();
            final String ClickedBlockBlockDataInitial =
                    clickedBlock.toString();
            String ClickedBlockBlockDataWorker =
                    clickedBlock.toString();
            String ClickedBlockBlockDataStarterToInvert =
                    "";
            String ClickedBlockBlockDataFinal =
                    "";
            final int GetNumberClickedBlockBlockDataInitial =
                    ClickedBlockBlockDataInitial.length();
            int GetNumberClickedBlockBlockDataWorker =
                    ClickedBlockBlockDataWorker.length();
            boolean LoopFlag1 =
                    true;
            boolean LoopFlag2 =
                    true;
            String GetTextColon =
                    "";
            String GetBlockNameCore =
                    "";
            int intX = (int) x;
            int intY = (int) y;
            int intZ = (int) z;
            final String GetItemNameInitial =
                    String.valueOf(itemstack.getItem());



            //Getting Full Block Name (Mod Name + Block Name)
            while (LoopFlag1 == true) {
                for (int index1 = 1; index1 <= (int) GetNumberInitial; index1++) {
                    GetNumber = GetNumber - 1;
                    GetText = (ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString())
                            .substring(0, (int) GetNumber);
                    if (GetText.endsWith(":") == true) {
                        GetTextColon = GetText;
                    }
                    if (GetTextColon.endsWith(":") == true) {
                        LoopFlag1 = false;
                    }
                }
            }



            //Getting Block Data (Square Brackets) []
            while (LoopFlag2 == true) {
                for (int index1 = 1; index1 <= (int) GetNumberClickedBlockBlockDataInitial; index1++) {
                    GetNumberClickedBlockBlockDataWorker =
                            GetNumberClickedBlockBlockDataWorker - 1;
                    ClickedBlockBlockDataWorker =
                            (world.getBlockState(BlockPos.containing(x, y, z)).toString()).substring(0, (int) GetNumberClickedBlockBlockDataWorker);
                    if (ClickedBlockBlockDataWorker.endsWith("[") == true) {
                        ClickedBlockBlockDataStarterToInvert = ClickedBlockBlockDataWorker;
                    }
                    if (ClickedBlockBlockDataWorker.endsWith("[") == true) {
                        LoopFlag2 = false;
                    }
                    if (GetNumberClickedBlockBlockDataWorker <= 5) {
                        GetNumberClickedBlockBlockDataWorker = 5;
                    }
                    if (GetNumberClickedBlockBlockDataWorker <= 5) {
                        LoopFlag2 = false;
                    }
                }
            }
            int GNCBBDWForInverting
                    = 0;
            int GNCBBDWForFinal
                    = 0;
            String CBBDFinal =
                    "";
            if ((ClickedBlockBlockDataStarterToInvert.length() >= 2)) {
                GNCBBDWForInverting =
                        ClickedBlockBlockDataStarterToInvert.length() - 1;
                GNCBBDWForFinal =
                        GetNumberClickedBlockBlockDataInitial - GNCBBDWForInverting;
                CBBDFinal =
                        (world.getBlockState(BlockPos.containing(x, y, z)).toString()).substring(GetNumberClickedBlockBlockDataInitial - GNCBBDWForFinal, (int) GetNumberClickedBlockBlockDataInitial);
            }



            // Getting Items NBT Data (Curly Brackets, Inventory Contents) {}

            String GetBlockContentsString =
                    "";
            BlockEntity blockEntity =
                    world.getBlockEntity(BlockPos.containing(x, y, z));
            if ((new Object() {
                public String getValue(LevelAccessor world, BlockPos pos, String tag) {
                    BlockEntity blockEntity = world.getBlockEntity(pos);
                    if (blockEntity != null)
                        return blockEntity.getPersistentData().getString(tag);
                    return "";
                }
            }.getValue(world, BlockPos.containing(x, y, z), "Items")).isEmpty() == false) {
                GetBlockContentsString = new Object() {
                    public String getValue(LevelAccessor world, BlockPos pos, String tag) {
                        BlockEntity blockEntity = world.getBlockEntity(pos);
                        if (blockEntity != null)
                            return blockEntity.getPersistentData().getString(tag);
                        return "";
                    }
                }.getValue(world, BlockPos.containing(x, y, z), "Items");
            }



            //Replacing copied NBT data
            //Will want to put at the end for actual block replacement
            if (!world.isClientSide()) {
                BlockPos _bp = BlockPos.containing(x, y, z);
                BlockEntity _blockEntity = world.getBlockEntity(_bp);
                BlockState _bs = world.getBlockState(_bp);
                if (_blockEntity != null)
                    _blockEntity.getPersistentData().putString("Items", GetBlockContentsString);
                if (world instanceof Level _level)
                    _level.sendBlockUpdated(_bp, _bs, _bs, 3);
            }
            //*/



            final String GetTextFinal =
                    GetTextColon;
            int GetNumberColon =
                    GetTextColon.length();
            final int GetNumberFinal =
                    GetNumberColon;
            //Block Name Getter
            ANCIndicators.LOGGER.info((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).substring((int) (0 + GetNumberFinal),
                    (int) ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).length())));
            //Block Name Getter Simpler
            final String GetBlockName =
                    (GetTextInitial.substring((int) (0 + GetNumberFinal)));
            final String GetModNamePlusColon =
                    GetTextFinal;
            final String GetModName =
                    (GetModNamePlusColon.substring((int) 0, (GetNumberFinal - 1)));



            //Block Color Getter
            double ColoredBlockChecking =
                    0;
            boolean ColoredBlock =
                    false;
            boolean ColoredBlockPrefixColor =
                    false;
            boolean ColoredBlockAffixColor =
                    false;
            boolean ColoredBlockPrefixColorBool =
                    false;
            boolean ColoredBlockAffixColorBool =
                    false;
            String ColoredBlockPrefixColorString =
                    "";
            String ColoredBlockAffixColorString =
                    "";
            String ColoredBlockColorType =
                    "";
            ColoredBlockChecking =
                    0;
            ColoredBlock =
                    false;
            //Color Checking
            while (ColoredBlockChecking == 0) {
                if (GetTextInitial.contains("white" + "_")) {
                    ColoredBlock = true;
                    ColoredBlockPrefixColorBool = true;
                    ColoredBlockColorType = "white";
                    ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                    ColoredBlockChecking = 1;
                }
                if (GetTextInitial.endsWith("_" + "white")) {
                    ColoredBlock = true;
                    ColoredBlockAffixColorBool = true;
                    ColoredBlockColorType = "white";
                    ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                    ColoredBlockChecking = 1;
                }
                //Grays
                if (GetTextInitial.contains("gray" + "_")) {
                    if (GetTextInitial.contains("gray" + "_") && !GetTextColon.contains("light_gray" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockPrefixColorBool = true;
                        ColoredBlockColorType = "gray";
                        ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                        ColoredBlockChecking = 3;
                    }
                    if (GetTextInitial.endsWith("light_gray" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockPrefixColorBool = true;
                        ColoredBlockColorType = "light_gray";
                        ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                        ColoredBlockChecking = 2;
                    }
                } else if (GetTextInitial.contains("_" + "gray")) {
                    if (GetTextInitial.contains("_" + "gray") && !GetTextColon.contains("_" + "light_gray") && !GetTextColon.contains("light_blue" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockAffixColorBool = true;
                        ColoredBlockColorType = "gray";
                        ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                        ColoredBlockChecking = 3;
                    }
                    if (GetTextInitial.endsWith("_" + "light_gray") && !GetTextColon.contains("light_gray" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockAffixColorBool = true;
                        ColoredBlockColorType = "light_gray";
                        ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                        ColoredBlockChecking = 2;
                    }
                }
                if (GetTextInitial.contains("black" + "_")) {
                    ColoredBlock = true;
                    ColoredBlockPrefixColorBool = true;
                    ColoredBlockColorType = "black";
                    ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                    ColoredBlockChecking = 4;
                }
                if (GetTextInitial.endsWith("_" + "black")) {
                    ColoredBlock = true;
                    ColoredBlockAffixColorBool = true;
                    ColoredBlockColorType = "black";
                    ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                    ColoredBlockChecking = 4;
                }
                if (GetTextInitial.contains("brown" + "_")) {
                    ColoredBlock = true;
                    ColoredBlockPrefixColorBool = true;
                    ColoredBlockColorType = "brown";
                    ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                    ColoredBlockChecking = 5;
                }
                if (GetTextInitial.endsWith("_" + "brown")) {
                    ColoredBlock = true;
                    ColoredBlockAffixColorBool = true;
                    ColoredBlockColorType = "brown";
                    ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                    ColoredBlockChecking = 5;
                }
                if (GetTextInitial.contains("red" + "_")) {
                    ColoredBlock = true;
                    ColoredBlockPrefixColorBool = true;
                    ColoredBlockColorType = "red";
                    ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                    ColoredBlockChecking = 6;
                }
                if (GetTextInitial.endsWith("_" + "red")) {
                    ColoredBlock = true;
                    ColoredBlockAffixColorBool = true;
                    ColoredBlockColorType = "red";
                    ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                    ColoredBlockChecking = 6;
                }
                if (GetTextInitial.contains("orange" + "_")) {
                    ColoredBlock = true;
                    ColoredBlockPrefixColorBool = true;
                    ColoredBlockColorType = "orange";
                    ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                    ColoredBlockChecking = 7;
                }
                if (GetTextInitial.endsWith("_" + "orange")) {
                    ColoredBlock = true;
                    ColoredBlockAffixColorBool = true;
                    ColoredBlockColorType = "orange";
                    ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                    ColoredBlockChecking = 7;
                }
                if (GetTextInitial.contains("yellow" + "_")) {
                    ColoredBlock = true;
                    ColoredBlockPrefixColorBool = true;
                    ColoredBlockColorType = "yellow";
                    ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                    ColoredBlockChecking = 8;
                }
                if (GetTextInitial.endsWith("_" + "yellow")) {
                    ColoredBlock = true;
                    ColoredBlockAffixColorBool = true;
                    ColoredBlockColorType = "yellow";
                    ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                    ColoredBlockChecking = 8;
                }
                if (GetTextInitial.contains("lime" + "_")) {
                    ColoredBlock = true;
                    ColoredBlockPrefixColorBool = true;
                    ColoredBlockColorType = "lime";
                    ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                    ColoredBlockChecking = 9;
                }
                if (GetTextInitial.endsWith("_" + "lime")) {
                    ColoredBlock = true;
                    ColoredBlockAffixColorBool = true;
                    ColoredBlockColorType = "lime";
                    ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                    ColoredBlockChecking = 9;
                }
                if (GetTextInitial.contains("green" + "_")) {
                    ColoredBlock = true;
                    ColoredBlockPrefixColorBool = true;
                    ColoredBlockColorType = "green";
                    ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                    ColoredBlockChecking = 10;
                }
                if (GetTextInitial.endsWith("_" + "green")) {
                    ColoredBlock = true;
                    ColoredBlockAffixColorBool = true;
                    ColoredBlockColorType = "green";
                    ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                    ColoredBlockChecking = 10;
                }
                if (GetTextInitial.contains("cyan" + "_")) {
                    ColoredBlock = true;
                    ColoredBlockPrefixColorBool = true;
                    ColoredBlockColorType = "cyan";
                    ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                    ColoredBlockChecking = 11;
                }
                if (GetTextInitial.endsWith("_" + "cyan")) {
                    ColoredBlock = true;
                    ColoredBlockAffixColorBool = true;
                    ColoredBlockColorType = "cyan";
                    ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                    ColoredBlockChecking = 11;
                }
                //Blues
                if (GetTextInitial.contains("blue" + "_")) {
                    if (GetTextInitial.contains("blue" + "_") && !GetTextColon.contains("light_blue" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockPrefixColorBool = true;
                        ColoredBlockColorType = "blue";
                        ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                        ColoredBlockChecking = 13;
                    }
                    if (GetTextInitial.contains("light_blue" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockPrefixColorBool = true;
                        ColoredBlockColorType = "light_blue";
                        ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                        ColoredBlockChecking = 12;
                    }
                } else if (GetTextInitial.endsWith("_" + "blue")) {
                    if (GetTextInitial.endsWith("_" + "blue") && !GetTextColon.endsWith("_" + "light_blue") && !GetTextColon.contains("light_blue" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockAffixColorBool = true;
                        ColoredBlockColorType = "blue";
                        ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                        ColoredBlockChecking = 13;
                    }
                    if (GetTextInitial.endsWith("_" + "light_blue") && !GetTextColon.contains("light_blue" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockAffixColorBool = true;
                        ColoredBlockColorType = "light_blue";
                        ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                        ColoredBlockChecking = 12;
                    }
                }
                if (GetTextInitial.contains("purple" + "_")) {
                    ColoredBlock = true;
                    ColoredBlockPrefixColorBool = true;
                    ColoredBlockColorType = "purple";
                    ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                    ColoredBlockChecking = 14;
                }
                if (GetTextInitial.endsWith("_" + "purple")) {
                    ColoredBlock = true;
                    ColoredBlockAffixColorBool = true;
                    ColoredBlockColorType = "purple";
                    ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                    ColoredBlockChecking = 14;
                }
                if (GetTextInitial.contains("magenta" + "_")) {
                    ColoredBlock = true;
                    ColoredBlockPrefixColorBool = true;
                    ColoredBlockColorType = "magenta";
                    ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                    ColoredBlockChecking = 15;
                }
                if (GetTextInitial.endsWith("_" + "magenta")) {
                    ColoredBlock = true;
                    ColoredBlockAffixColorBool = true;
                    ColoredBlockColorType = "magenta";
                    ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                    ColoredBlockChecking = 15;
                }
                if (GetTextInitial.contains("pink" + "_")) {
                    ColoredBlock = true;
                    ColoredBlockPrefixColorBool = true;
                    ColoredBlockColorType = "pink";
                    ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                    ColoredBlockChecking = 16;
                }
                if (GetTextInitial.endsWith("_" + "pink")) {
                    ColoredBlock = true;
                    ColoredBlockAffixColorBool = true;
                    ColoredBlockColorType = "pink";
                    ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                    ColoredBlockChecking = 16;
                } else {
                    ColoredBlockChecking = -1;
                }
            }



            GetBlockNameCore =
                    GetTextInitial.substring(
                            ( 0 + GetModNamePlusColon.length() + ColoredBlockPrefixColorString.length()),
                            (GetTextInitial.length() - ColoredBlockAffixColorString.length()));



            //Item Color Getter
            double ColoredItemChecking =
                    0;
            boolean ColoredItem =
                    false;
            boolean ColoredItemPrefixColor =
                    false;
            boolean ColoredItemAffixColor =
                    false;
            boolean ColoredItemPrefixColorBool =
                    false;
            boolean ColoredItemAffixColorBool =
                    false;
            String ColoredItemPrefixColorString =
                    "";
            String ColoredItemAffixColorString =
                    "";
            String ColoredItemColorType =
                    "";
            ColoredItemChecking =
                    0;
            ColoredItem =
                    false;
            //Color Checking
            while (ColoredItemChecking == 0) {
                if (GetItemNameInitial.contains("white" + "_")) {
                    ColoredItem = true;
                    ColoredItemPrefixColorBool = true;
                    ColoredItemColorType = "white";
                    ColoredItemPrefixColorString = ColoredItemColorType + "_";
                    ColoredItemChecking = 1;
                }
                if (GetItemNameInitial.endsWith("_" + "white")) {
                    ColoredItem = true;
                    ColoredItemAffixColorBool = true;
                    ColoredItemColorType = "white";
                    ColoredItemAffixColorString = "_" + ColoredItemColorType;
                    ColoredItemChecking = 1;
                }
                //Grays
                if (GetItemNameInitial.contains("gray" + "_")) {
                    if (GetItemNameInitial.contains("gray" + "_") && !GetTextColon.contains("light_gray" + "_")) {
                        ColoredItem = true;
                        ColoredItemPrefixColorBool = true;
                        ColoredItemColorType = "gray";
                        ColoredItemPrefixColorString = ColoredItemColorType + "_";
                        ColoredItemChecking = 3;
                    }
                    if (GetItemNameInitial.endsWith("light_gray" + "_")) {
                        ColoredItem = true;
                        ColoredItemPrefixColorBool = true;
                        ColoredItemColorType = "light_gray";
                        ColoredItemPrefixColorString = ColoredItemColorType + "_";
                        ColoredItemChecking = 2;
                    }
                } else if (GetItemNameInitial.contains("_" + "gray")) {
                    if (GetItemNameInitial.contains("_" + "gray") && !GetTextColon.contains("_" + "light_gray") && !GetTextColon.contains("light_blue" + "_")) {
                        ColoredItem = true;
                        ColoredItemAffixColorBool = true;
                        ColoredItemColorType = "gray";
                        ColoredItemAffixColorString = "_" + ColoredItemColorType;
                        ColoredItemChecking = 3;
                    }
                    if (GetItemNameInitial.endsWith("_" + "light_gray") && !GetTextColon.contains("light_gray" + "_")) {
                        ColoredItem = true;
                        ColoredItemAffixColorBool = true;
                        ColoredItemColorType = "light_gray";
                        ColoredItemAffixColorString = "_" + ColoredItemColorType;
                        ColoredItemChecking = 2;
                    }
                }
                if (GetItemNameInitial.contains("black" + "_")) {
                    ColoredItem = true;
                    ColoredItemPrefixColorBool = true;
                    ColoredItemColorType = "black";
                    ColoredItemPrefixColorString = ColoredItemColorType + "_";
                    ColoredItemChecking = 4;
                }
                if (GetItemNameInitial.endsWith("_" + "black")) {
                    ColoredItem = true;
                    ColoredItemAffixColorBool = true;
                    ColoredItemColorType = "black";
                    ColoredItemAffixColorString = "_" + ColoredItemColorType;
                    ColoredItemChecking = 4;
                }
                if (GetItemNameInitial.contains("brown" + "_")) {
                    ColoredItem = true;
                    ColoredItemPrefixColorBool = true;
                    ColoredItemColorType = "brown";
                    ColoredItemPrefixColorString = ColoredItemColorType + "_";
                    ColoredItemChecking = 5;
                }
                if (GetItemNameInitial.endsWith("_" + "brown")) {
                    ColoredItem = true;
                    ColoredItemAffixColorBool = true;
                    ColoredItemColorType = "brown";
                    ColoredItemAffixColorString = "_" + ColoredItemColorType;
                    ColoredItemChecking = 5;
                }
                if (GetItemNameInitial.contains("red" + "_")) {
                    ColoredItem = true;
                    ColoredItemPrefixColorBool = true;
                    ColoredItemColorType = "red";
                    ColoredItemPrefixColorString = ColoredItemColorType + "_";
                    ColoredItemChecking = 6;
                }
                if (GetItemNameInitial.endsWith("_" + "red")) {
                    ColoredItem = true;
                    ColoredItemAffixColorBool = true;
                    ColoredItemColorType = "red";
                    ColoredItemAffixColorString = "_" + ColoredItemColorType;
                    ColoredItemChecking = 6;
                }
                if (GetItemNameInitial.contains("orange" + "_")) {
                    ColoredItem = true;
                    ColoredItemPrefixColorBool = true;
                    ColoredItemColorType = "orange";
                    ColoredItemPrefixColorString = ColoredItemColorType + "_";
                    ColoredItemChecking = 7;
                }
                if (GetItemNameInitial.endsWith("_" + "orange")) {
                    ColoredItem = true;
                    ColoredItemAffixColorBool = true;
                    ColoredItemColorType = "orange";
                    ColoredItemAffixColorString = "_" + ColoredItemColorType;
                    ColoredItemChecking = 7;
                }
                if (GetItemNameInitial.contains("yellow" + "_")) {
                    ColoredItem = true;
                    ColoredItemPrefixColorBool = true;
                    ColoredItemColorType = "yellow";
                    ColoredItemPrefixColorString = ColoredItemColorType + "_";
                    ColoredItemChecking = 8;
                }
                if (GetItemNameInitial.endsWith("_" + "yellow")) {
                    ColoredItem = true;
                    ColoredItemAffixColorBool = true;
                    ColoredItemColorType = "yellow";
                    ColoredItemAffixColorString = "_" + ColoredItemColorType;
                    ColoredItemChecking = 8;
                }
                if (GetItemNameInitial.contains("lime" + "_")) {
                    ColoredItem = true;
                    ColoredItemPrefixColorBool = true;
                    ColoredItemColorType = "lime";
                    ColoredItemPrefixColorString = ColoredItemColorType + "_";
                    ColoredItemChecking = 9;
                }
                if (GetItemNameInitial.endsWith("_" + "lime")) {
                    ColoredItem = true;
                    ColoredItemAffixColorBool = true;
                    ColoredItemColorType = "lime";
                    ColoredItemAffixColorString = "_" + ColoredItemColorType;
                    ColoredItemChecking = 9;
                }
                if (GetItemNameInitial.contains("green" + "_")) {
                    ColoredItem = true;
                    ColoredItemPrefixColorBool = true;
                    ColoredItemColorType = "green";
                    ColoredItemPrefixColorString = ColoredItemColorType + "_";
                    ColoredItemChecking = 10;
                }
                if (GetItemNameInitial.endsWith("_" + "green")) {
                    ColoredItem = true;
                    ColoredItemAffixColorBool = true;
                    ColoredItemColorType = "green";
                    ColoredItemAffixColorString = "_" + ColoredItemColorType;
                    ColoredItemChecking = 10;
                }
                if (GetItemNameInitial.contains("cyan" + "_")) {
                    ColoredItem = true;
                    ColoredItemPrefixColorBool = true;
                    ColoredItemColorType = "cyan";
                    ColoredItemPrefixColorString = ColoredItemColorType + "_";
                    ColoredItemChecking = 11;
                }
                if (GetItemNameInitial.endsWith("_" + "cyan")) {
                    ColoredItem = true;
                    ColoredItemAffixColorBool = true;
                    ColoredItemColorType = "cyan";
                    ColoredItemAffixColorString = "_" + ColoredItemColorType;
                    ColoredItemChecking = 11;
                }
                //Blues
                if (GetItemNameInitial.contains("blue" + "_")) {
                    if (GetItemNameInitial.contains("blue" + "_") && !GetTextColon.contains("light_blue" + "_")) {
                        ColoredItem = true;
                        ColoredItemPrefixColorBool = true;
                        ColoredItemColorType = "blue";
                        ColoredItemPrefixColorString = ColoredItemColorType + "_";
                        ColoredItemChecking = 13;
                    }
                    if (GetItemNameInitial.contains("light_blue" + "_")) {
                        ColoredItem = true;
                        ColoredItemPrefixColorBool = true;
                        ColoredItemColorType = "light_blue";
                        ColoredItemPrefixColorString = ColoredItemColorType + "_";
                        ColoredItemChecking = 12;
                    }
                } else if (GetItemNameInitial.endsWith("_" + "blue")) {
                    if (GetItemNameInitial.endsWith("_" + "blue") && !GetTextColon.endsWith("_" + "light_blue") && !GetTextColon.contains("light_blue" + "_")) {
                        ColoredItem = true;
                        ColoredItemAffixColorBool = true;
                        ColoredItemColorType = "blue";
                        ColoredItemAffixColorString = "_" + ColoredItemColorType;
                        ColoredItemChecking = 13;
                    }
                    if (GetItemNameInitial.endsWith("_" + "light_blue") && !GetTextColon.contains("light_blue" + "_")) {
                        ColoredItem = true;
                        ColoredItemAffixColorBool = true;
                        ColoredItemColorType = "light_blue";
                        ColoredItemAffixColorString = "_" + ColoredItemColorType;
                        ColoredItemChecking = 12;
                    }
                }
                if (GetItemNameInitial.contains("purple" + "_")) {
                    ColoredItem = true;
                    ColoredItemPrefixColorBool = true;
                    ColoredItemColorType = "purple";
                    ColoredItemPrefixColorString = ColoredItemColorType + "_";
                    ColoredItemChecking = 14;
                }
                if (GetItemNameInitial.endsWith("_" + "purple")) {
                    ColoredItem = true;
                    ColoredItemAffixColorBool = true;
                    ColoredItemColorType = "purple";
                    ColoredItemAffixColorString = "_" + ColoredItemColorType;
                    ColoredItemChecking = 14;
                }
                if (GetItemNameInitial.contains("magenta" + "_")) {
                    ColoredItem = true;
                    ColoredItemPrefixColorBool = true;
                    ColoredItemColorType = "magenta";
                    ColoredItemPrefixColorString = ColoredItemColorType + "_";
                    ColoredItemChecking = 15;
                }
                if (GetItemNameInitial.endsWith("_" + "magenta")) {
                    ColoredItem = true;
                    ColoredItemAffixColorBool = true;
                    ColoredItemColorType = "magenta";
                    ColoredItemAffixColorString = "_" + ColoredItemColorType;
                    ColoredItemChecking = 15;
                }
                if (GetItemNameInitial.contains("pink" + "_")) {
                    ColoredItem = true;
                    ColoredItemPrefixColorBool = true;
                    ColoredItemColorType = "pink";
                    ColoredItemPrefixColorString = ColoredItemColorType + "_";
                    ColoredItemChecking = 16;
                }
                if (GetItemNameInitial.endsWith("_" + "pink")) {
                    ColoredItem = true;
                    ColoredItemAffixColorBool = true;
                    ColoredItemColorType = "pink";
                    ColoredItemAffixColorString = "_" + ColoredItemColorType;
                    ColoredItemChecking = 16;
                } else {
                    ColoredItemChecking = -1;
                }
            }



            if ((ColoredBlock == true ) && (ColoredItem == true)) {

                if ((ColoredBlockPrefixColorBool == true) && (ColoredItemPrefixColorBool == true) ) {
                    ColoredBlockPrefixColorString = ColoredItemPrefixColorString;
                }

                else if ((ColoredBlockPrefixColorBool == true) && (ColoredItemAffixColorBool == true) ) {
                    ColoredBlockPrefixColorString = (ColoredItemColorType + "_");
                }

                else if ((ColoredBlockAffixColorBool == true) && (ColoredItemPrefixColorBool == true) ) {
                    ColoredBlockAffixColorString = ColoredItemAffixColorString;
                }

                else if ((ColoredBlockAffixColorBool == true) && (ColoredItemAffixColorBool == true) ) {
                    ColoredBlockAffixColorString = ("_" + ColoredItemColorType);
                }
            }



            //All Loggers aka Text Print
            ANCIndicators.LOGGER.info("Get Text Start: " + GetText + ", Get Number Start: " + GetNumber);
            ANCIndicators.LOGGER.info("Get Item Display Name: " + itemstack.getDisplayName().getString());
            ANCIndicators.LOGGER.info("Get Item Registry Name: " + ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString());
            ANCIndicators.LOGGER.info("Get Text Initial: " + GetTextInitial);
            ANCIndicators.LOGGER.info("Get Text End: " + GetText);
            ANCIndicators.LOGGER.info("Get Text Colon End: " + GetTextColon);
            ANCIndicators.LOGGER.info("Get Text Final End: " + GetTextFinal);
            ANCIndicators.LOGGER.info("Get Number Initial End: " + GetNumberInitial);
            ANCIndicators.LOGGER.info("Get Number End: " + GetNumber);
            ANCIndicators.LOGGER.info("Get Number Colon End: " + GetNumberColon);
            ANCIndicators.LOGGER.info("Get Number Final End: " + GetNumberFinal);
            ANCIndicators.LOGGER.info("Get Block Name Simple End: " + GetBlockName);
            ANCIndicators.LOGGER.info("Get Mod Name Plus Colon End: " + GetModNamePlusColon);
            ANCIndicators.LOGGER.info("Get Mod Name End: " + GetModName);
            ANCIndicators.LOGGER.info("Recompile Block Name " + GetTextFinal + GetBlockName);
            ANCIndicators.LOGGER.info("BlockData: " + clickedBlock);
            ANCIndicators.LOGGER.info("BlockPos: " + BlockPos.containing(x, y, z));
            ANCIndicators.LOGGER.info("Block Entity: " + world.getBlockEntity(BlockPos.containing(x, y, z)));
            ANCIndicators.LOGGER.info("ClickedBlockBlockDataStarterToInvert: " + ClickedBlockBlockDataStarterToInvert);
            ANCIndicators.LOGGER.info("GNCBBDWForInverting: " + GNCBBDWForInverting);
            ANCIndicators.LOGGER.info("GNCBBDWForFinal: " + GNCBBDWForFinal);
            ANCIndicators.LOGGER.info("CBBDFinal: " + CBBDFinal);
            ANCIndicators.LOGGER.info("Is Block Colored? From Color Getter: " + ColoredBlock);
            ANCIndicators.LOGGER.info("Prefix? from Color Getter: " + ColoredBlockPrefixColorBool);
            ANCIndicators.LOGGER.info("Affix? from Color Getter: " + ColoredBlockAffixColorBool);
            ANCIndicators.LOGGER.info("Get Color from Color Getter: " + ColoredBlockColorType);
            ANCIndicators.LOGGER.info((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()).toString()).replace("red_", ColoredBlockPrefixColorString));
            ANCIndicators.LOGGER.info("GetBlockNameCore " + GetBlockNameCore);





            ANCIndicators.LOGGER.info((
                    "setblock "
                            + intX
                            + " "
                            + intY
                            + " "
                            + intZ
                            + " "
                            + GetModName
                            + ":"
                            + ColoredBlockPrefixColorString
                            + GetBlockNameCore
                            + ColoredBlockAffixColorString
                            + CBBDFinal
                            + " replace"
                    ));





            //Play Sound On Finish
            if (world instanceof Level _level) {
                if (!_level.isClientSide()) {
                    _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, 1, (float) 0.88);
                } else {
                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, 1, (float) 0.88, false);
                }
            }



        }
    }
}

