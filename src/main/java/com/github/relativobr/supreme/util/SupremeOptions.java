package com.github.relativobr.supreme.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class SupremeOptions {

    boolean autoUpdate;
    boolean useLegacySupremeexpansionItemId;
    String lang;
    int customTickerDelay;
    boolean enableGenerators;
    boolean limitProductionGenerators;
    int baseTimeVirtualGarden;
    int baseTimeVirtualAquarium;
    int baseTimeMobCollector;
    int baseTimeTechGenerator;
    int maxAmountTechGenerator;
    int chunkLimitMaxTechGenerator;
    int chunkLimitMaxTechMutation;
    int chunkLimitMaxTechRobotic;
    int chunkLimitMaxMobTechCollector;
    boolean mobTechEnableBee;
    boolean mobTechEnableIronGolem;
    boolean mobTechEnableZombie;
    boolean enableQuarry;
    boolean limitProductionQuarry;
    boolean enableWeapons;
    boolean enableTools;
    boolean enableArmor;
    boolean enableTech;
    boolean enableItemConverter;
    boolean customBc;

    public static SupremeOptions defaultValue() {
        return SupremeOptions.builder()
                .autoUpdate(true)
                .useLegacySupremeexpansionItemId(false)
                .lang("en-US")
                .customTickerDelay(2)
                .enableGenerators(true)
                .limitProductionGenerators(false)
                .enableQuarry(true)
                .limitProductionQuarry(false)
                .baseTimeVirtualGarden(15)
                .baseTimeVirtualAquarium(15)
                .baseTimeMobCollector(15)
                .baseTimeTechGenerator(1800)
                .maxAmountTechGenerator(64)
                .chunkLimitMaxTechGenerator(100)
                .chunkLimitMaxTechMutation(100)
                .chunkLimitMaxTechRobotic(100)
                .chunkLimitMaxMobTechCollector(100)
                .mobTechEnableBee(true)
                .mobTechEnableIronGolem(true)
                .mobTechEnableZombie(true)
                .enableWeapons(true)
                .enableTools(true)
                .enableArmor(true)
                .enableTech(true)
                .enableItemConverter(true)
                .customBc(false)
                .build();
    }
}
