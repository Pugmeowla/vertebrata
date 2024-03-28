package net.pugmeowla.vertebrata.entity.custom;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;

public class EntityBream extends PathfinderMob {
    public EntityBream(EntityType<? extends PathfinderMob> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public static AttributeSupplier.Builder registerAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 5.0D)
                .add(Attributes.MOVEMENT_SPEED, 1.5D)
                .add(Attributes.ATTACK_DAMAGE, 0)
                .add(Attributes.ATTACK_SPEED, 0);
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(0, new TryFindWaterGoal(this));
   //     this.goalSelector.addGoal(1, new TemptGoal(this, 2.0D, )); want this one to make it follow bread
   //     this.goalSelector.addGoal(4, new AvoidEntityGoal<>(this, )); want this one to make it avoid the player
   //     this.goalSelector.addGoal(3, new BreedGoal(this, 1.7D)); also this pretty sure its an issue with the mob being classified as a pathfinder mob
        this.goalSelector.addGoal(5, new RandomSwimmingGoal(this, 1D, 1));
    }
}
