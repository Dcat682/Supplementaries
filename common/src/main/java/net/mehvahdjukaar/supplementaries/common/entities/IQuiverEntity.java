package net.mehvahdjukaar.supplementaries.common.entities;

import net.minecraft.world.item.ItemStack;

public interface IQuiverEntity {

    //only used for rendering for player and both for skeletons
    ItemStack getQuiver();

    default boolean hasQuiver(){
        return !this.getQuiver().isEmpty();
    }

    void setQuiver(ItemStack quiver);
}
