package net.awt.awt.exterior.block;

import loqor.ait.client.models.exteriors.ExteriorModel;
import loqor.ait.data.datapack.exterior.BiomeOverrides;
import loqor.ait.data.schema.exterior.ClientExteriorVariantSchema;
import net.awt.awt.AWT;
import net.awt.awt.exterior.block.model.TardisBlockExteriorModel;
import net.minecraft.util.Identifier;
import org.joml.Vector3f;

public class ClientTardisBlockVariant extends ClientExteriorVariantSchema {
    protected static final String CATEGORY_PATH = "textures/exterior/block";
    protected static final Identifier CATEGORY_IDENTIFIER = new Identifier(AWT.MOD_ID,
            CATEGORY_PATH + "/block.png");
    protected static final String TEXTURE_PATH = CATEGORY_PATH + "/";
    protected static final BiomeOverrides OVERRIDES = BiomeOverrides.EMPTY;

    private final String name;

    protected ClientTardisBlockVariant(String name) {
        super(new Identifier(AWT.MOD_ID, "exterior/block/" + name));

        this.name = name;
    }

    @Override
    public Identifier texture() {
        return new Identifier(AWT.MOD_ID, TEXTURE_PATH + name + ".png");
    }

    @Override
    public Identifier emission() {
        return new Identifier(AWT.MOD_ID, TEXTURE_PATH + name + "_emission.png");
    }

    @Override
    public ExteriorModel model() {
        return new TardisBlockExteriorModel();
    }

    @Override
    public Vector3f sonicItemTranslations() {
        return new Vector3f(0, 0, 0); // todo
    }

    @Override
    public BiomeOverrides overrides() {
        return OVERRIDES;
    }
}
