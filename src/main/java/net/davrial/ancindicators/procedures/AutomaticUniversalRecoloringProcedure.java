package net.davrial.ancindicators.procedures;

import net.davrial.ancindicators.ANCIndicators;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;



public class AutomaticUniversalRecoloringProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {


        //All Variables
        BlockState clickedBlock = world.getBlockState(BlockPos.containing(x, y, z));
        boolean GetColoredBlockBool = false;
        String GetTargetedBlock = "";
        String GetTargetedBlockRegistryName = "";
        String GetColoredBlockColorString = "";
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
        String GetBlockNameCore =
                "";
        int intX = (int) x;
        int intY = (int) y;
        int intZ = (int) z;
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
        final String GetItemNameInitial =
                String.valueOf(itemstack.getItem());


        //Starter "if" to check if item is a Coloring Tool
        if (itemstack.is(ItemTags.create(new ResourceLocation("ancindicators:coloring_tools")))) {

            //Getting Full Block Name (Mod Name + Block Name)
            try {
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
            } catch (Exception e) {
                System.out.println("Something went wrong with the Get Full Block Name process");
            }

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



            //Block Color Getter
            double ColoredBlockChecking =
                    0;
            boolean ColoredBlock =
                    false;
            boolean ColoredBlockPrefixColorBool =
                    false;
            boolean ColoredBlockMidfixColorBool =
                    false;
            boolean ColoredBlockAffixColorBool =
                    false;
            String ColoredBlockMidfixColorString =
                    "";
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

            //Block Color Checking
            try {
                while (ColoredBlockChecking == 0) {
                    if (GetTextInitial.contains("white" + "_") && !GetTextColon.contains("_" + "white" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockPrefixColorBool = true;
                        ColoredBlockColorType = "white";
                        ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                        ColoredBlockChecking = 1;
                    }
                    if (GetTextColon.contains("_" + "white" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockMidfixColorBool = true;
                        ColoredBlockColorType = "white";
                        ColoredBlockMidfixColorString = "_" + ColoredBlockColorType + "_";
                        ColoredBlockChecking = 1;
                    }
                    if (GetTextInitial.endsWith("_" + "white") && !GetTextColon.contains("_" + "white" + "_")) {
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
                        if (GetTextInitial.contains("light_gray" + "_")) {
                            ColoredBlock = true;
                            ColoredBlockPrefixColorBool = true;
                            ColoredBlockColorType = "light_gray";
                            ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                            ColoredBlockChecking = 2;
                        }
                    } else if (GetTextInitial.contains("_" + "gray")) {
                        if (GetTextInitial.contains("_" + "gray") && !GetTextColon.contains("_" + "light_gray") && !GetTextColon.contains("light_gray" + "_")) {
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
                    if (GetTextInitial.contains("black" + "_") && !GetTextColon.contains("_" + "black" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockPrefixColorBool = true;
                        ColoredBlockColorType = "black";
                        ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                        ColoredBlockChecking = 4;
                    }
                    if (GetTextColon.contains("_" + "black" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockMidfixColorBool = true;
                        ColoredBlockColorType = "black";
                        ColoredBlockMidfixColorString = "_" + ColoredBlockColorType + "_";
                        ColoredBlockChecking = 4;
                    }
                    if (GetTextInitial.endsWith("_" + "black")) {
                        ColoredBlock = true;
                        ColoredBlockAffixColorBool = true;
                        ColoredBlockColorType = "black";
                        ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                        ColoredBlockChecking = 4;
                    }
                    if (GetTextInitial.contains("brown" + "_") && !GetTextColon.contains("_" + "brown" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockPrefixColorBool = true;
                        ColoredBlockColorType = "brown";
                        ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                        ColoredBlockChecking = 5;
                    }
                    if (GetTextColon.contains("_" + "brown" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockMidfixColorBool = true;
                        ColoredBlockColorType = "brown";
                        ColoredBlockMidfixColorString = "_" + ColoredBlockColorType + "_";
                        ColoredBlockChecking = 5;
                    }
                    if (GetTextInitial.endsWith("_" + "brown")) {
                        ColoredBlock = true;
                        ColoredBlockAffixColorBool = true;
                        ColoredBlockColorType = "brown";
                        ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                        ColoredBlockChecking = 5;
                    }
                    if (GetTextInitial.contains("red" + "_") && !GetTextColon.contains("_" + "red" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockPrefixColorBool = true;
                        ColoredBlockColorType = "red";
                        ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                        ColoredBlockChecking = 6;
                    }
                    if (GetTextColon.contains("_" + "red" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockMidfixColorBool = true;
                        ColoredBlockColorType = "red";
                        ColoredBlockMidfixColorString = "_" + ColoredBlockColorType + "_";
                        ColoredBlockChecking = 6;
                    }
                    if (GetTextInitial.endsWith("_" + "red")) {
                        ColoredBlock = true;
                        ColoredBlockAffixColorBool = true;
                        ColoredBlockColorType = "red";
                        ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                        ColoredBlockChecking = 6;
                    }
                    if (GetTextInitial.contains("orange" + "_") && !GetTextColon.contains("_" + "orange" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockPrefixColorBool = true;
                        ColoredBlockColorType = "orange";
                        ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                        ColoredBlockChecking = 7;
                    }
                    if (GetTextColon.contains("_" + "orange" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockMidfixColorBool = true;
                        ColoredBlockColorType = "orange";
                        ColoredBlockMidfixColorString = "_" + ColoredBlockColorType + "_";
                        ColoredBlockChecking = 7;
                    }
                    if (GetTextInitial.endsWith("_" + "orange")) {
                        ColoredBlock = true;
                        ColoredBlockAffixColorBool = true;
                        ColoredBlockColorType = "orange";
                        ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                        ColoredBlockChecking = 7;
                    }
                    if (GetTextInitial.contains("yellow" + "_") && !GetTextColon.contains("_" + "yellow" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockPrefixColorBool = true;
                        ColoredBlockColorType = "yellow";
                        ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                        ColoredBlockChecking = 8;
                    }
                    if (GetTextColon.contains("_" + "yellow" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockMidfixColorBool = true;
                        ColoredBlockColorType = "yellow";
                        ColoredBlockMidfixColorString = "_" + ColoredBlockColorType + "_";
                        ColoredBlockChecking = 8;
                    }
                    if (GetTextInitial.endsWith("_" + "yellow")) {
                        ColoredBlock = true;
                        ColoredBlockAffixColorBool = true;
                        ColoredBlockColorType = "yellow";
                        ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                        ColoredBlockChecking = 8;
                    }
                    if (GetTextInitial.contains("lime" + "_") && !GetTextColon.contains("_" + "lime" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockPrefixColorBool = true;
                        ColoredBlockColorType = "lime";
                        ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                        ColoredBlockChecking = 9;
                    }
                    if (GetTextColon.contains("_" + "lime" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockMidfixColorBool = true;
                        ColoredBlockColorType = "lime";
                        ColoredBlockMidfixColorString = "_" + ColoredBlockColorType + "_";
                        ColoredBlockChecking = 9;
                    }
                    if (GetTextInitial.endsWith("_" + "lime")) {
                        ColoredBlock = true;
                        ColoredBlockAffixColorBool = true;
                        ColoredBlockColorType = "lime";
                        ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                        ColoredBlockChecking = 9;
                    }
                    if (GetTextInitial.contains("green" + "_") && !GetTextColon.contains("_" + "green" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockPrefixColorBool = true;
                        ColoredBlockColorType = "green";
                        ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                        ColoredBlockChecking = 10;
                    }
                    if (GetTextColon.contains("_" + "green" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockMidfixColorBool = true;
                        ColoredBlockColorType = "green";
                        ColoredBlockMidfixColorString = "_" + ColoredBlockColorType + "_";
                        ColoredBlockChecking = 10;
                    }
                    if (GetTextInitial.endsWith("_" + "green")) {
                        ColoredBlock = true;
                        ColoredBlockAffixColorBool = true;
                        ColoredBlockColorType = "green";
                        ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                        ColoredBlockChecking = 10;
                    }
                    if (GetTextInitial.contains("cyan" + "_") && !GetTextColon.contains("_" + "cyan" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockPrefixColorBool = true;
                        ColoredBlockColorType = "cyan";
                        ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                        ColoredBlockChecking = 11;
                    }
                    if (GetTextColon.contains("_" + "cyan" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockMidfixColorBool = true;
                        ColoredBlockColorType = "cyan";
                        ColoredBlockMidfixColorString = "_" + ColoredBlockColorType + "_";
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
                    } else if (GetTextInitial.contains("_" + "blue" + "_")) {
                        if (GetTextInitial.contains("_" + "blue" + "_") && !GetTextColon.contains("light_blue")) {                            ColoredBlock = true;
                            ColoredBlockMidfixColorBool = true;
                            ColoredBlockColorType = "blue";
                            ColoredBlockMidfixColorString = "_" + ColoredBlockColorType + "_";
                            ColoredBlockChecking = 13;
                        }
                        if (GetTextInitial.contains("_" + "light_blue" + "_")) {
                            ColoredBlock = true;
                            ColoredBlockMidfixColorBool = true;
                            ColoredBlockColorType = "light_blue";
                            ColoredBlockMidfixColorString = "_" + ColoredBlockColorType + "_";
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
                    if (GetTextInitial.contains("purple" + "_") && !GetTextColon.contains("_" + "purple" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockPrefixColorBool = true;
                        ColoredBlockColorType = "purple";
                        ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                        ColoredBlockChecking = 14;
                    }
                    if (GetTextColon.contains("_" + "purple" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockMidfixColorBool = true;
                        ColoredBlockColorType = "purple";
                        ColoredBlockMidfixColorString = "_" + ColoredBlockColorType + "_";
                        ColoredBlockChecking = 14;
                    }
                    if (GetTextInitial.endsWith("_" + "purple")) {
                        ColoredBlock = true;
                        ColoredBlockAffixColorBool = true;
                        ColoredBlockColorType = "purple";
                        ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                        ColoredBlockChecking = 14;
                    }
                    if (GetTextInitial.contains("magenta" + "_") && !GetTextColon.contains("_" + "magenta" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockPrefixColorBool = true;
                        ColoredBlockColorType = "magenta";
                        ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                        ColoredBlockChecking = 15;
                    }
                    if (GetTextColon.contains("_" + "magenta" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockMidfixColorBool = true;
                        ColoredBlockColorType = "magenta";
                        ColoredBlockMidfixColorString = "_" + ColoredBlockColorType + "_";
                        ColoredBlockChecking = 15;
                    }
                    if (GetTextInitial.endsWith("_" + "magenta")) {
                        ColoredBlock = true;
                        ColoredBlockAffixColorBool = true;
                        ColoredBlockColorType = "magenta";
                        ColoredBlockAffixColorString = "_" + ColoredBlockColorType;
                        ColoredBlockChecking = 15;
                    }
                    if (GetTextInitial.contains("pink" + "_") && !GetTextColon.contains("_" + "pink" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockPrefixColorBool = true;
                        ColoredBlockColorType = "pink";
                        ColoredBlockPrefixColorString = ColoredBlockColorType + "_";
                        ColoredBlockChecking = 16;
                    }
                    if (GetTextColon.contains("_" + "pink" + "_")) {
                        ColoredBlock = true;
                        ColoredBlockMidfixColorBool = true;
                        ColoredBlockColorType = "pink";
                        ColoredBlockMidfixColorString = "_" + ColoredBlockColorType + "_";
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

            } catch (Exception e) {
                System.out.println("Something went wrong with the Get Block Color process");
            }



            //Item Color Getter
            double ColoredItemChecking =
                    0;
            boolean ColoredItem =
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

            //Item Color Checking
            try {
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

            } catch (Exception e) {
                System.out.println("Something went wrong with the Get Item Color process");
            }


            GetBlockNameCore =
                    GetTextInitial.substring(
                            (0 + GetModNamePlusColon.length() + ColoredBlockPrefixColorString.length()),
                            (GetTextInitial.length() - ColoredBlockAffixColorString.length()));


            try {
                //Process 1: For Strongly Colored items converting straight to their respective color
                if ((ColoredBlock == true) && (ColoredItem == true)) {

                    //Block Color Prefix
                    if ((ColoredBlockPrefixColorBool == true) && (ColoredItemPrefixColorBool == true)) {
                        ColoredBlockPrefixColorString = ColoredItemPrefixColorString;
                    } else if ((ColoredBlockPrefixColorBool == true) && (ColoredItemAffixColorBool == true)) {
                        ColoredBlockPrefixColorString = (ColoredItemColorType + "_");
                    //Block Color Midfix
                    } else if ((ColoredBlockMidfixColorBool == true) && (ColoredItemPrefixColorBool == true)) {
                        ColoredBlockMidfixColorString = ("_" + ColoredItemColorType + "_");
                    } else if ((ColoredBlockMidfixColorBool == true) && (ColoredItemAffixColorBool == true)) {
                        ColoredBlockMidfixColorString = ("_" + ColoredItemColorType + "_");
                    //Block Color Affix
                    } else if ((ColoredBlockAffixColorBool == true) && (ColoredItemPrefixColorBool == true)) {
                        ColoredBlockAffixColorString = ColoredItemAffixColorString;
                    } else if ((ColoredBlockAffixColorBool == true) && (ColoredItemAffixColorBool == true)) {
                        ColoredBlockAffixColorString = ("_" + ColoredItemColorType);
                    }
                }
            } catch (Exception e) {
                System.out.println("Something went wrong with the Color Change process");
            }

            BlockEntity clickedBlockEntity = null;
            if (clickedBlock.hasBlockEntity() == true) {
                clickedBlockEntity = world.getBlockEntity(BlockPos.containing(x, y, z));
            }

            int CommandBlockOrder = 1;
            while (CommandBlockOrder != 0) {
                //get data command
                if (CommandBlockOrder == 1) {
                    try {
                        if (world instanceof ServerLevel _level)
                            _level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "Items", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
                                    "execute as @p run data modify storage colorchangeitemsget Items set from block "
                                            + intX
                                            + " "
                                            + intY
                                            + " "
                                            + intZ
                                            + " Items"
                            );
                        //ANCIndicators.MOD_ID.wait(1);
                        System.out.println("execute as @p run data modify storage colorchangeitemsget Items set from block " + intX + " " + intY + " " + intZ + " Items");
                        CommandBlockOrder = 2;
                    } catch (Exception e) {
                        System.out.println("Something went wrong withe the Get Data command");
                        CommandBlockOrder = 2;
                    }
                }

                //Replace block command
                if (CommandBlockOrder == 2 || CommandBlockOrder == 3) {
                    try {
                        if (world instanceof ServerLevel _level)
                            _level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
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
                            );

                        //Beds Procedure
                        String CBBDFinalBeds = CBBDFinal;
                        System.out.println("CBBDFinalBeds: " + CBBDFinalBeds);
                        if (GetBlockName.contains("_bed")) {
                            System.out.println("execute as @p run setblock "
                                    + intX
                                    + " "
                                    + intY
                                    + " "
                                    + (intZ + 1)
                                    + " "
                                    + GetModName
                                    + ":"
                                    + ColoredBlockPrefixColorString
                                    + GetBlockNameCore
                                    + ColoredBlockAffixColorString
                                    + CBBDFinalBeds
                                    + " replace");
                            if ((CBBDFinal.contains("south")) && (CBBDFinal.contains("foot"))) {
                                CBBDFinalBeds = "[facing=south,occupied=false,part=head]";
                                System.out.println("CBBDFinalBeds1: " + CBBDFinalBeds);
                                if (world instanceof ServerLevel _level)
                                    _level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
                                            "execute as @p run setblock "
                                                    + intX
                                                    + " "
                                                    + intY
                                                    + " "
                                                    + (intZ + 1)
                                                    + " "
                                                    + GetModName
                                                    + ":"
                                                    + ColoredBlockPrefixColorString
                                                    + GetBlockNameCore
                                                    + ColoredBlockAffixColorString
                                                    + CBBDFinalBeds
                                                    + " replace"
                                    );
                            } else if ((CBBDFinal.contains("south")) && (CBBDFinal.contains("head"))) {
                                CBBDFinalBeds = "[facing=south,occupied=false,part=foot]";
                                System.out.println("CBBDFinalBeds2: " + CBBDFinalBeds);
                                if (world instanceof ServerLevel _level)
                                    _level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
                                            "execute as @p run setblock "
                                                    + intX
                                                    + " "
                                                    + intY
                                                    + " "
                                                    + (intZ - 1)
                                                    + " "
                                                    + GetModName
                                                    + ":"
                                                    + ColoredBlockPrefixColorString
                                                    + GetBlockNameCore
                                                    + ColoredBlockAffixColorString
                                                    + CBBDFinalBeds
                                                    + " replace"
                                    );
                            } else if ((CBBDFinal.contains("north")) && (CBBDFinal.contains("foot"))) {
                                CBBDFinalBeds = "[facing=north,occupied=false,part=head]";
                                System.out.println("CBBDFinalBeds3: " + CBBDFinalBeds);
                                if (world instanceof ServerLevel _level)
                                    _level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
                                            "execute as @p run setblock "
                                                    + intX
                                                    + " "
                                                    + intY
                                                    + " "
                                                    + (intZ - 1)
                                                    + " "
                                                    + GetModName
                                                    + ":"
                                                    + ColoredBlockPrefixColorString
                                                    + GetBlockNameCore
                                                    + ColoredBlockAffixColorString
                                                    + CBBDFinalBeds
                                                    + " replace"
                                    );
                            } else if ((CBBDFinal.contains("north")) && (CBBDFinal.contains("head"))) {
                                CBBDFinalBeds = "[facing=north,occupied=false,part=foot]";
                                System.out.println("CBBDFinalBeds4: " + CBBDFinalBeds);
                                if (world instanceof ServerLevel _level)
                                    _level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
                                            "execute as @p run setblock "
                                                    + intX
                                                    + " "
                                                    + intY
                                                    + " "
                                                    + (intZ + 1)
                                                    + " "
                                                    + GetModName
                                                    + ":"
                                                    + ColoredBlockPrefixColorString
                                                    + GetBlockNameCore
                                                    + ColoredBlockAffixColorString
                                                    + CBBDFinalBeds
                                                    + " replace"
                                    );
                            } else if ((CBBDFinal.contains("west")) && (CBBDFinal.contains("foot"))) {
                                CBBDFinalBeds = "[facing=west,occupied=false,part=head]";
                                System.out.println("CBBDFinalBeds5: " + CBBDFinalBeds);
                                if (world instanceof ServerLevel _level)
                                    _level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
                                            "execute as @p run setblock "
                                                    + (intX - 1)
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
                                                    + CBBDFinalBeds
                                                    + " replace"
                                    );
                            } else if ((CBBDFinal.contains("west")) && (CBBDFinal.contains("head"))) {
                                CBBDFinalBeds = "[facing=west,occupied=false,part=foot]";
                                System.out.println("CBBDFinalBeds6: " + CBBDFinalBeds);
                                if (world instanceof ServerLevel _level)
                                    _level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
                                            "execute as @p run setblock "
                                                    + (intX + 1)
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
                                                    + CBBDFinalBeds
                                                    + " replace"
                                    );
                            } else if ((CBBDFinal.contains("east")) && (CBBDFinal.contains("foot"))) {
                                CBBDFinalBeds = "[facing=east,occupied=false,part=head]";
                                System.out.println("CBBDFinalBeds7: " + CBBDFinalBeds);
                                if (world instanceof ServerLevel _level)
                                    _level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
                                            "execute as @p run setblock "
                                                    + (intX + 1)
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
                                                    + CBBDFinalBeds
                                                    + " replace"
                                    );
                            } else if ((CBBDFinal.contains("east")) && (CBBDFinal.contains("head"))) {
                                CBBDFinalBeds = "[facing=east,occupied=false,part=foot]";
                                System.out.println("CBBDFinalBeds8: " + CBBDFinalBeds);
                                if (world instanceof ServerLevel _level)
                                    _level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
                                            "execute as @p run setblock "
                                                    + (intX - 1)
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
                                                    + CBBDFinalBeds
                                                    + " replace"
                                    );
                            }
                        }
                        CommandBlockOrder = 4;
                    } catch (Exception e) {
                        System.out.println("Something went wrong withe the SetBlock command");
                        CommandBlockOrder = 0;
                    }
                }

                //Replace block data command
                if (CommandBlockOrder == 4) {
                    try {
                        if (world instanceof ServerLevel _level)
                            _level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "Items", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
                                    "execute as @p run data modify block "
                                            + intX
                                            + " "
                                            + intY
                                            + " "
                                            + intZ
                                            + " Items set from storage colorchangeitemsget Items"
                            );
                        System.out.println("execute as @p run data modify block " + intX + " " + intY + " " + intZ + " Items set from storage colorchangeitemsget Items");
                        CommandBlockOrder = 5;
                    } catch (Exception e) {
                        System.out.println("Something went wrong withe the Modify Data command");
                        CommandBlockOrder = 0;
                    }
                }

                //Clear stored block data command
                if (CommandBlockOrder == 5) {
                    try {
                        if (world instanceof ServerLevel _level)
                            _level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "Items", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
                                    "execute as @p run data remove storage colorchangeitemsget Items"
                            );
                        CommandBlockOrder = 6;
                    } catch (Exception e) {
                        System.out.println("Something went wrong withe the Modify Data command");
                        CommandBlockOrder = 0;
                    }
                }
                if (CommandBlockOrder == 6) {
                    if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("ancindicators:all_paintable_blocks")))) {
                        world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId((world.getBlockState(BlockPos.containing(x, y, z)))));
                    }
                    CommandBlockOrder = 7;
                }

                if (CommandBlockOrder == 7) {
                    CommandBlockOrder = 0;
                }
            }


            //Play Sound On Finish
            if (world instanceof Level _level) {
                if (!_level.isClientSide()) {
                    _level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, 1, (float) 0.88);
                } else {
                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.ink_sac.use")), SoundSource.BLOCKS, 1, (float) 0.88, false);
                }
            }

            if (itemstack.isDamageableItem()) {
                {
                    ItemStack _ist = itemstack;
                    if (_ist.hurt(1, RandomSource.create(), null)) {
                        _ist.shrink(1);
                        _ist.setDamageValue(0);
                    }
                }
            } else {
                itemstack.shrink(1);
            }
        }
    }
}


