package com.github.relativobr.supreme.setup;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.machine.multiblock.ElectricCoreFabricator;
import com.github.relativobr.supreme.machine.ElectricCrafter;
import com.github.relativobr.supreme.machine.ForgeIngot;
import com.github.relativobr.supreme.machine.ForgeMagical;
import com.github.relativobr.supreme.machine.Foundry;
import com.github.relativobr.supreme.machine.MagicAltar;
import com.github.relativobr.supreme.machine.MobCollector;
import com.github.relativobr.supreme.machine.mobtech.MobTechCollector;
import com.github.relativobr.supreme.machine.mobtech.TechGenerator;
import com.github.relativobr.supreme.machine.mobtech.TechMutation;
import com.github.relativobr.supreme.machine.mobtech.TechRobotic;
import com.github.relativobr.supreme.machine.VirtualAquarium;
import com.github.relativobr.supreme.machine.VirtualGarden;
import com.github.relativobr.supreme.util.ItemGroups;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

public class SetupElectricMachine {

  public static void setup(Supreme sup) {

    new ElectricCoreFabricator(ItemGroups.MACHINES_CATEGORY, ElectricCoreFabricator.ELECTRIC_CORE_MACHINE,
        RecipeType.ENHANCED_CRAFTING_TABLE, ElectricCoreFabricator.RECIPE_ELECTRIC_CORE_MACHINE).setMachineIdentifier(
            ElectricCoreFabricator.ELECTRIC_CORE_MACHINE.getItemId()).setMachineRecipes(ElectricCoreFabricator.getAllRecipe())
        .setCapacity(40).setEnergyConsumption(20).setProcessingSpeed(1).register(sup);

    new ElectricCoreFabricator(ItemGroups.MACHINES_CATEGORY, ElectricCoreFabricator.ELECTRIC_CORE_MACHINE_II,
        RecipeType.ENHANCED_CRAFTING_TABLE, ElectricCoreFabricator.RECIPE_ELECTRIC_CORE_MACHINE_II).setMachineIdentifier(
            ElectricCoreFabricator.ELECTRIC_CORE_MACHINE_II.getItemId()).setMachineRecipes(ElectricCoreFabricator.getAllRecipe())
        .setCapacity(200).setEnergyConsumption(100).setProcessingSpeed(5).register(sup);

    new ElectricCoreFabricator(ItemGroups.MACHINES_CATEGORY, ElectricCoreFabricator.ELECTRIC_CORE_MACHINE_III,
        RecipeType.ENHANCED_CRAFTING_TABLE, ElectricCoreFabricator.RECIPE_ELECTRIC_CORE_MACHINE_III).setMachineIdentifier(
            ElectricCoreFabricator.ELECTRIC_CORE_MACHINE_III.getItemId()).setMachineRecipes(ElectricCoreFabricator.getAllRecipe())
        .setCapacity(600).setEnergyConsumption(300).setProcessingSpeed(15).register(sup);

    new MobCollector(ItemGroups.MACHINES_CATEGORY, MobCollector.MOB_COLLECTOR_MACHINE,
        RecipeType.ENHANCED_CRAFTING_TABLE, MobCollector.RECIPE_MOB_COLLECTOR_MACHINE).setMobRange(4).setCapacity(1000)
        .setProcessingSpeed(1).setEnergyConsumption(20).register(sup);

    new MobCollector(ItemGroups.MACHINES_CATEGORY, MobCollector.MOB_COLLECTOR_MACHINE_II,
        RecipeType.ENHANCED_CRAFTING_TABLE, MobCollector.RECIPE_MOB_COLLECTOR_MACHINE_II).setMobRange(8)
        .setCapacity(5000).setProcessingSpeed(5).setEnergyConsumption(100).register(sup);

    new MobCollector(ItemGroups.MACHINES_CATEGORY, MobCollector.MOB_COLLECTOR_MACHINE_III,
        RecipeType.ENHANCED_CRAFTING_TABLE, MobCollector.RECIPE_MOB_COLLECTOR_MACHINE_III).setMobRange(16)
        .setCapacity(15000).setProcessingSpeed(15).setEnergyConsumption(300).register(sup);

    new VirtualGarden(ItemGroups.MACHINES_CATEGORY, VirtualGarden.VIRTUAL_GARDEN_MACHINE,
        RecipeType.ENHANCED_CRAFTING_TABLE, VirtualGarden.RECIPE_VIRTUAL_GARDEN_MACHINE).setCapacity(1000)
        .setProcessingSpeed(1).setEnergyConsumption(20).register(sup);

    new VirtualGarden(ItemGroups.MACHINES_CATEGORY, VirtualGarden.VIRTUAL_GARDEN_MACHINE_II,
        RecipeType.ENHANCED_CRAFTING_TABLE, VirtualGarden.RECIPE_VIRTUAL_GARDEN_MACHINE_II).setCapacity(5000)
        .setProcessingSpeed(5).setEnergyConsumption(100).register(sup);

    new VirtualGarden(ItemGroups.MACHINES_CATEGORY, VirtualGarden.VIRTUAL_GARDEN_MACHINE_III,
        RecipeType.ENHANCED_CRAFTING_TABLE, VirtualGarden.RECIPE_VIRTUAL_GARDEN_MACHINE_III).setCapacity(15000)
        .setProcessingSpeed(15).setEnergyConsumption(300).register(sup);

    new ForgeIngot(ItemGroups.MACHINES_CATEGORY, ForgeIngot.FORGE_INGOT_MACHINE,
        RecipeType.ENHANCED_CRAFTING_TABLE, ForgeIngot.RECIPE_FORGE_INGOT_MACHINE).setMachineIdentifier(
            ForgeIngot.FORGE_INGOT_MACHINE.getItemId()).setMachineRecipes(ForgeIngot.getAllRecipe())
        .setCapacity(1000).setProcessingSpeed(1).setEnergyConsumption(20).register(sup);

    new ForgeIngot(ItemGroups.MACHINES_CATEGORY, ForgeIngot.FORGE_INGOT_MACHINE_II,
        RecipeType.ENHANCED_CRAFTING_TABLE, ForgeIngot.RECIPE_FORGE_INGOT_MACHINE_II).setMachineIdentifier(
            ForgeIngot.FORGE_INGOT_MACHINE_II.getItemId()).setMachineRecipes(ForgeIngot.getAllRecipe())
        .setCapacity(5000).setProcessingSpeed(5).setEnergyConsumption(100).register(sup);

    new ForgeIngot(ItemGroups.MACHINES_CATEGORY, ForgeIngot.FORGE_INGOT_MACHINE_III,
        RecipeType.ENHANCED_CRAFTING_TABLE, ForgeIngot.RECIPE_FORGE_INGOT_MACHINE_III).setMachineIdentifier(
            ForgeIngot.FORGE_INGOT_MACHINE_III.getItemId()).setMachineRecipes(ForgeIngot.getAllRecipe())
        .setCapacity(15000).setProcessingSpeed(15).setEnergyConsumption(300).register(sup);

    new ForgeMagical(ItemGroups.MACHINES_CATEGORY, ForgeMagical.FORGE_MAGICAL_MACHINE,
        RecipeType.ENHANCED_CRAFTING_TABLE, ForgeMagical.RECIPE_FORGE_MAGICAL_MACHINE).setMachineIdentifier(
            ForgeMagical.FORGE_MAGICAL_MACHINE.getItemId()).setMachineRecipes(ForgeMagical.getAllRecipe())
        .setCapacity(1000).setProcessingSpeed(1).setEnergyConsumption(20).register(sup);

    new ForgeMagical(ItemGroups.MACHINES_CATEGORY, ForgeMagical.FORGE_MAGICAL_MACHINE_II,
        RecipeType.ENHANCED_CRAFTING_TABLE, ForgeMagical.RECIPE_FORGE_MAGICAL_MACHINE_II).setMachineIdentifier(
            ForgeMagical.FORGE_MAGICAL_MACHINE_II.getItemId()).setMachineRecipes(ForgeMagical.getAllRecipe())
        .setCapacity(5000).setProcessingSpeed(5).setEnergyConsumption(100).register(sup);

    new ForgeMagical(ItemGroups.MACHINES_CATEGORY, ForgeMagical.FORGE_MAGICAL_MACHINE_III,
        RecipeType.ENHANCED_CRAFTING_TABLE, ForgeMagical.RECIPE_FORGE_MAGICAL_MACHINE_III).setMachineIdentifier(
            ForgeMagical.FORGE_MAGICAL_MACHINE_III.getItemId()).setMachineRecipes(ForgeMagical.getAllRecipe())
        .setCapacity(15000).setProcessingSpeed(15).setEnergyConsumption(300).register(sup);

    new MagicAltar(ItemGroups.MACHINES_CATEGORY, MagicAltar.MAGIC_ALTAR_MACHINE,
        RecipeType.ENHANCED_CRAFTING_TABLE, MagicAltar.RECIPE_MAGIC_ALTAR_MACHINE).setMachineIdentifier(
            MagicAltar.MAGIC_ALTAR_MACHINE.getItemId()).setMachineRecipes(MagicAltar.getAllRecipe())
        .setCapacity(40).setEnergyConsumption(20).setProcessingSpeed(1).register(sup);

    new MagicAltar(ItemGroups.MACHINES_CATEGORY, MagicAltar.MAGIC_ALTAR_MACHINE_II,
        RecipeType.ENHANCED_CRAFTING_TABLE, MagicAltar.RECIPE_MAGIC_ALTAR_MACHINE_II).setMachineIdentifier(
            MagicAltar.MAGIC_ALTAR_MACHINE_II.getItemId()).setMachineRecipes(MagicAltar.getAllRecipe())
        .setCapacity(200).setEnergyConsumption(100).setProcessingSpeed(5).register(sup);

    new MagicAltar(ItemGroups.MACHINES_CATEGORY, MagicAltar.MAGIC_ALTAR_MACHINE_III,
        RecipeType.ENHANCED_CRAFTING_TABLE, MagicAltar.RECIPE_MAGIC_ALTAR_MACHINE_III).setMachineIdentifier(
            MagicAltar.MAGIC_ALTAR_MACHINE_III.getItemId()).setMachineRecipes(MagicAltar.getAllRecipe())
        .setCapacity(600).setEnergyConsumption(300).setProcessingSpeed(15).register(sup);

    new Foundry(ItemGroups.MACHINES_CATEGORY, Foundry.FOUNDRY_MACHINE, RecipeType.ENHANCED_CRAFTING_TABLE,
        Foundry.RECIPE_FOUNDRY_MACHINE).setMachineIdentifier(Foundry.FOUNDRY_MACHINE.getItemId())
        .setMachineRecipes(Foundry.getAllRecipe()).setCapacity(2000).setEnergyConsumption(1000)
        .setProcessingSpeed(1).register(sup);

    new Foundry(ItemGroups.MACHINES_CATEGORY, Foundry.FOUNDRY_MACHINE_II,
        RecipeType.ENHANCED_CRAFTING_TABLE, Foundry.RECIPE_FOUNDRY_MACHINE_II).setMachineIdentifier(
            Foundry.FOUNDRY_MACHINE_II.getItemId()).setMachineRecipes(Foundry.getAllRecipe())
        .setCapacity(10000).setEnergyConsumption(5000).setProcessingSpeed(5).register(sup);

    new Foundry(ItemGroups.MACHINES_CATEGORY, Foundry.FOUNDRY_MACHINE_III,
        RecipeType.ENHANCED_CRAFTING_TABLE, Foundry.RECIPE_FOUNDRY_MACHINE_III).setMachineIdentifier(
            Foundry.FOUNDRY_MACHINE_III.getItemId()).setMachineRecipes(Foundry.getAllRecipe())
        .setCapacity(30000).setEnergyConsumption(15000).setProcessingSpeed(15).register(sup);

    new ElectricCrafter(ItemGroups.MACHINES_CATEGORY, ElectricCrafter.ELECTRIC_CRAFTER_MACHINE,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        ElectricCrafter.RECIPE_ELECTRIC_CRAFTER_MACHINE).setMachineIdentifier(
            ElectricCrafter.ELECTRIC_CRAFTER_MACHINE.getItemId())
        .setMachineRecipes(ElectricCrafter.getAllRecipe()).setCapacity(1000).setProcessingSpeed(1)
        .setEnergyConsumption(20).register(sup);

    new ElectricCrafter(ItemGroups.MACHINES_CATEGORY, ElectricCrafter.ELECTRIC_CRAFTER_MACHINE_II,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        ElectricCrafter.RECIPE_ELECTRIC_CRAFTER_MACHINE_II).setMachineIdentifier(
            ElectricCrafter.ELECTRIC_CRAFTER_MACHINE_II.getItemId())
        .setMachineRecipes(ElectricCrafter.getAllRecipe()).setCapacity(5000).setProcessingSpeed(5)
        .setEnergyConsumption(100).register(sup);

    new ElectricCrafter(ItemGroups.MACHINES_CATEGORY, ElectricCrafter.ELECTRIC_CRAFTER_MACHINE_III,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        ElectricCrafter.RECIPE_ELECTRIC_CRAFTER_MACHINE_III).setMachineIdentifier(
            ElectricCrafter.ELECTRIC_CRAFTER_MACHINE_III.getItemId())
        .setMachineRecipes(ElectricCrafter.getAllRecipe()).setCapacity(15000).setProcessingSpeed(15)
        .setEnergyConsumption(300).register(sup);

    new VirtualAquarium(ItemGroups.MACHINES_CATEGORY, VirtualAquarium.VIRTUAL_AQUARIUM_MACHINE,
        RecipeType.ENHANCED_CRAFTING_TABLE, VirtualAquarium.RECIPE_VIRTUAL_AQUARIUM_MACHINE).setCapacity(1000)
        .setProcessingSpeed(1).setEnergyConsumption(20).register(sup);

    new VirtualAquarium(ItemGroups.MACHINES_CATEGORY, VirtualAquarium.VIRTUAL_AQUARIUM_MACHINE_II,
        RecipeType.ENHANCED_CRAFTING_TABLE, VirtualAquarium.RECIPE_VIRTUAL_AQUARIUM_MACHINE_II).setCapacity(5000)
        .setProcessingSpeed(5).setEnergyConsumption(100).register(sup);

    new VirtualAquarium(ItemGroups.MACHINES_CATEGORY, VirtualAquarium.VIRTUAL_AQUARIUM_MACHINE_III,
        RecipeType.ENHANCED_CRAFTING_TABLE, VirtualAquarium.RECIPE_VIRTUAL_AQUARIUM_MACHINE_III).setCapacity(15000)
        .setProcessingSpeed(15).setEnergyConsumption(300).register(sup);

    if(Supreme.checkEnableMobtech()){

      new MobTechCollector(ItemGroups.MACHINES_CATEGORY, MobTechCollector.MOB_TECH_COLLECTOR_MACHINE_I,
          RecipeType.ENHANCED_CRAFTING_TABLE,
          MobTechCollector.RECIPE_MOB_TECH_COLLECTOR_MACHINE_I)
          .setMobRange(3)
          .setCapacity(1000)
          .setProcessingSpeed(1)
          .setEnergyConsumption(200)
          .register(sup);

      new MobTechCollector(ItemGroups.MACHINES_CATEGORY, MobTechCollector.MOB_TECH_COLLECTOR_MACHINE_II,
          RecipeType.ENHANCED_CRAFTING_TABLE,
          MobTechCollector.RECIPE_MOB_TECH_COLLECTOR_MACHINE_II)
          .setMobRange(6)
          .setCapacity(1000)
          .setProcessingSpeed(1)
          .setEnergyConsumption(200)
          .register(sup);

      new MobTechCollector(ItemGroups.MACHINES_CATEGORY, MobTechCollector.MOB_TECH_COLLECTOR_MACHINE_III,
          RecipeType.ENHANCED_CRAFTING_TABLE,
          MobTechCollector.RECIPE_MOB_TECH_COLLECTOR_MACHINE_III)
          .setMobRange(9)
          .setCapacity(1000)
          .setProcessingSpeed(1)
          .setEnergyConsumption(200)
          .register(sup);

      new TechGenerator(TechGenerator.TECH_GENERATOR, TechGenerator.RECIPE_TECH_GENERATOR)
          .setTimeProcess(1800)
          .setMachineIdentifier(TechGenerator.TECH_GENERATOR.getItemId())
          .setCapacity(5000)
          .setEnergyConsumption(2000)
          .register(sup);

      new TechRobotic(TechRobotic.TECH_ROBOTIC, TechRobotic.RECIPE_TECH_ROBOTIC)
          .setTimeProcess(60)
          .setMachineIdentifier(TechRobotic.TECH_ROBOTIC.getItemId())
          .setCapacity(500)
          .setEnergyConsumption(500)
          .register(sup);

      new TechMutation(TechMutation.TECH_MUTATION, TechMutation.RECIPE_TECH_MUTATION)
          .setTimeProcess(60)
          .setMachineIdentifier(TechMutation.TECH_MUTATION.getItemId())
          .setCapacity(500)
          .setEnergyConsumption(500)
          .register(sup);
    }
  }
}
