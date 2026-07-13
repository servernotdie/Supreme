package com.github.relativobr.supreme.machine.recipe;

import static com.github.relativobr.supreme.Supreme.getSupremeOptions;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.util.SupremeOptions;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import io.github.thebusybiscuit.slimefun4.libraries.commons.lang.Validate;
import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;

public class MobCollectorMachineRecipe extends MachineRecipe implements Predicate<LivingEntity> {

  private final Predicate<LivingEntity> predicate;

  @ParametersAreNonnullByDefault
  public MobCollectorMachineRecipe(ItemStack input, ItemStack result, Predicate<LivingEntity> predicate) {
    super(Supreme.getSupremeOptions().getBaseTimeMobCollector(), new ItemStack[]{input}, new ItemStack[]{result});
    Validate.notNull(predicate, "The Predicate must not be null");
    this.predicate = predicate;
  }

  public static List<ItemStack> getAllRecipe() {

    SupremeOptions supremeOptions = getSupremeOptions();

    List<ItemStack> displayRecipes = new ArrayList();
    displayRecipes.add(new CustomItemStack(Material.GLASS_BOTTLE, null, "&fCần&b ong&f ở gần"));
    displayRecipes.add(new ItemStack(Material.HONEY_BOTTLE));
    displayRecipes.add(new CustomItemStack(Material.GLASS_BOTTLE, null, "&fCần&b mực&f ở gần"));
    displayRecipes.add(new ItemStack(Material.INK_SAC));
    displayRecipes.add(new CustomItemStack(Material.GLASS_BOTTLE, null, "&fCần&b mực phát sáng&f ở gần"));
    displayRecipes.add(new ItemStack(Material.GLOW_INK_SAC));
    displayRecipes.add(new CustomItemStack(Material.GLASS_BOTTLE, null, "&fCần&b Wither&f ở gần"));
    displayRecipes.add(new ItemStack(Material.EXPERIENCE_BOTTLE));
    displayRecipes.add(new CustomItemStack(Material.GLASS_BOTTLE, null, "&fCần&b Ender Dragon&f ở gần"));
    displayRecipes.add(new ItemStack(Material.DRAGON_BREATH));
    displayRecipes.add(new CustomItemStack(Material.SHEARS, null, "&fCần&b ong&f ở gần"));
    displayRecipes.add(new ItemStack(Material.HONEYCOMB));
    displayRecipes.add(new CustomItemStack(Material.SHEARS, null, "&fCần&b cừu&f ở gần (có màu)"));
    displayRecipes.add(new ItemStack(Material.WHITE_WOOL));
    displayRecipes.add(new CustomItemStack(Material.SHEARS, null, "&fCần&b bò&f ở gần"));
    displayRecipes.add(new ItemStack(Material.LEATHER));
    displayRecipes.add(new CustomItemStack(Material.SHEARS, null, "&fCần&b gà&f ở gần"));
    displayRecipes.add(new ItemStack(Material.FEATHER));
    displayRecipes.add(new CustomItemStack(Material.SHEARS, null, "&fCần&b Guardian&f ở gần"));
    displayRecipes.add(new ItemStack(Material.SPONGE));
    displayRecipes.add(new CustomItemStack(Material.SHEARS, null, "&fCần&b nhện&f ở gần"));
    displayRecipes.add(new ItemStack(Material.SPIDER_EYE));
    displayRecipes.add(new CustomItemStack(Material.SHEARS, null, "&fCần&b Wither Skeleton&f ở gần"));
    displayRecipes.add(new ItemStack(Material.COAL));
    displayRecipes.add(new CustomItemStack(Material.SHEARS, null, "&fCần&b Wither&f ở gần"));
    displayRecipes.add(SlimefunItems.COMPRESSED_CARBON);
    if (!supremeOptions.isCustomBc()) {
      displayRecipes.add(new CustomItemStack(Material.SHEARS, null, "&fCần&b Iron Golem&f ở gần"));
      displayRecipes.add(SlimefunItems.BASIC_CIRCUIT_BOARD);
    }
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fCần&b Phantom&f ở gần"));
    displayRecipes.add(new ItemStack(Material.PHANTOM_MEMBRANE));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fCần&b zombie&f ở gần"));
    displayRecipes.add(new ItemStack(Material.ROTTEN_FLESH));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fCần&b skeleton&f ở gần"));
    displayRecipes.add(new ItemStack(Material.BONE));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fCần&b Creeper&f ở gần"));
    displayRecipes.add(new ItemStack(Material.GUNPOWDER));
    if (!supremeOptions.isCustomBc()) {
      displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fCần&b Slime&f ở gần"));
      displayRecipes.add(new ItemStack(Material.SLIME_BALL));
    }
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fCần&b nhện&f ở gần"));
    displayRecipes.add(new ItemStack(Material.STRING));
    if (!supremeOptions.isCustomBc()) {
      displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fCần&b Wither Skeleton&f ở gần"));
      displayRecipes.add(new ItemStack(Material.WITHER_SKELETON_SKULL));
    }
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fCần&b Enderman&f ở gần"));
    displayRecipes.add(new ItemStack(Material.ENDER_PEARL));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fCần&b Blaze&f ở gần"));
    displayRecipes.add(new ItemStack(Material.BLAZE_ROD));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fCần&b Magma Cube&f ở gần"));
    displayRecipes.add(new ItemStack(Material.MAGMA_CREAM));
    if (!supremeOptions.isCustomBc()) {
      displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fCần&b Wither&f ở gần"));
      displayRecipes.add(new ItemStack(Material.NETHER_STAR));
      displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fCần&b Ghast&f ở gần"));
      displayRecipes.add(new ItemStack(Material.GHAST_TEAR));
      displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fCần&b Ravager&f ở gần"));
      displayRecipes.add(new ItemStack(Material.TOTEM_OF_UNDYING));
    }
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fCần&b bò&f ở gần"));
    displayRecipes.add(new ItemStack(Material.BEEF));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fCần&b heo&f ở gần"));
    displayRecipes.add(new ItemStack(Material.PORKCHOP));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fCần&b gà&f ở gần"));
    displayRecipes.add(new ItemStack(Material.CHICKEN));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fCần&b cừu&f ở gần"));
    displayRecipes.add(new ItemStack(Material.MUTTON));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fCần&b Snow Golem&f ở gần"));
    displayRecipes.add(new ItemStack(Material.SNOWBALL));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fCần&b Iron Golem&f ở gần"));
    displayRecipes.add(new ItemStack(Material.IRON_INGOT));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fCần&b Drowned&f ở gần"));
    displayRecipes.add(new ItemStack(Material.NAUTILUS_SHELL));
    if (!supremeOptions.isCustomBc()) {
      displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fCần&b Guardian&f ở gần"));
      displayRecipes.add(new ItemStack(Material.PRISMARINE_SHARD));
      displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fCần&b Elder Guardian&f ở gần"));
      displayRecipes.add(new ItemStack(Material.PRISMARINE_CRYSTALS));
    }
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fCần&b Wither&f ở gần"));
    displayRecipes.add(new ItemStack(Material.GLASS_BOTTLE));
    if (!supremeOptions.isCustomBc()) {
      displayRecipes.add(new CustomItemStack(Material.GOLD_INGOT, null, "&fCần&b Piglin&f ở gần"));
      displayRecipes.add(SlimefunItems.STRANGE_NETHER_GOO);
    }
    return displayRecipes;
  }

  public boolean test(@Nonnull LivingEntity entity) {
    return this.predicate.test(entity);
  }

}
