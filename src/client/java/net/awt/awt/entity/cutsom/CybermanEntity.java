package net.awt.awt.entity.cutsom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class CybermanEntity extends HostileEntity {
    public CybermanEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    @Nullable
    @Override
    public HostileEntity createChild(ServerWorld world, HostileEntity entity){
        return null;
    }
}
