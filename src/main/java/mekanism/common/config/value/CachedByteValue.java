package mekanism.common.config.value;

import mekanism.common.config.IMekanismConfig;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public class CachedByteValue extends CachedPrimitiveValue<Byte> {

    private byte cachedValue;

    private CachedByteValue(IMekanismConfig config, ConfigValue<Byte> internal) {
        super(config, internal);
    }

    public static CachedByteValue wrap(IMekanismConfig config, ConfigValue<Byte> internal) {
        return new CachedByteValue(config, internal);
    }

    public byte get() {
        if (!resolved) {
            //If we don't have a cached value or need to resolve it again, get it from the actual ConfigValue
            cachedValue = internal.get();
            resolved = true;
        }
        return cachedValue;
    }

    public void set(byte value) {
        internal.set(value);
        cachedValue = value;
    }
}