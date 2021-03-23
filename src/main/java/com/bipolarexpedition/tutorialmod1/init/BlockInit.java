package com.bipolarexpedition.tutorialmod1.init;

import com.bipolarexpedition.tutorialmod1.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.IRON, 6.0f, 30.0f, 3, "pickaxe");
}
