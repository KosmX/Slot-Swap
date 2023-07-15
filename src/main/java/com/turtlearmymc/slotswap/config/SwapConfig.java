package com.turtlearmymc.slotswap.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = "slotswap")
public class SwapConfig implements ConfigData {

    public SwapMode swapMode = SwapMode.COMPATIBLE;

    public enum SwapMode {
        /**
         * Swap items using vanilla pick-item packet, likely safe to use everywhere but having issues
         */
        COMPATIBLE,

        /**
         * Use PlayerHandler swap packet, precisely swaps the items, may trigger anti-cheat
         */
        SWAP,
        /**
         * Use same method as SWAP, but instead of swapping items, it cyclic-shift the column, it shouldn't shuffle items in inventory.
         */
        SHIFT,
    }
}