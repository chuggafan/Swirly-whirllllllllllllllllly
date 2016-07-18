package com.github.chuggafan.Proxies;


import com.github.chuggafan.FancyHaloRenderer;

public class ClientProxy extends CommonProxy {

    @Override
    public void prepareForPretty() {

    }

    @Override
    public void makeThingsPretty() {
        FancyHaloRenderer shiny = new FancyHaloRenderer();

    }

    @Override
    public void theAfterPretty() {
        super.theAfterPretty();
    }
}
