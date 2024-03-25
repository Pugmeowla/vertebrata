package net.pugmeowla.vertebrata.entity.custom;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.level.Level;

public class EntityBream extends PathfinderMob {
    public EntityBream(EntityType<? extends PathfinderMob> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public static AttributeSupplier.Builder registerAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 5.0D)
                .add(Attributes.MOVEMENT_SPEED, 1.0D)
                .add(Attributes.ATTACK_DAMAGE, 0)
                .add(Attributes.ATTACK_SPEED, 0);
    }

    protected void registerGoals() {
     //   this.goalSelector.addGoal(1, new Tempt)
        this.goalSelector.addGoal(5, new RandomSwimmingGoal(this, 1D, 1));
    }
}
