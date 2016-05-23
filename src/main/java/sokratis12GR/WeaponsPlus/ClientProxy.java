package sokratis12GR.WeaponsPlus;

import sokratis12GR.WeaponsPlus.registry.ModItems;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenderers(WeaponsPlus ins) {
        ModItems.initModels();
    }
}
