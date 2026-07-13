package com.github.relativobr.supreme.resource.mobtech;

import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;

@UtilityClass
public class SimpleCard {

  /**
   * MUSIC_DISC_STRAD       1 branco MUSIC_DISC_13          2 amarelo/branco MUSIC_DISC_MELLOHI     3 rosa/branco
   * MUSIC_DISC_FAR         4 verdeclaro MUSIC_DISC_CAT         5 verde MUSIC_DISC_WARD        6 verde/verdeclaro
   * MUSIC_DISC_WAIT        7 azul
   */

  // cards basicos
  public static final SlimefunItemStack CARD_STONE = new SupremeItemStack("SUPREME_CARD_STONE",
      Material.MUSIC_DISC_STRAD, "&bThẻ đá", "", "&fChuyển sang sản xuất đá", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");


  public static final SlimefunItemStack CARD_GRANITE = new SupremeItemStack("SUPREME_CARD_GRANITE",
      Material.MUSIC_DISC_STRAD, "&bThẻ đá hoa cương", "", "&fChuyển sang sản xuất đá hoa cương", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");


  public static final SlimefunItemStack CARD_DIORITE = new SupremeItemStack("SUPREME_CARD_DIORITE",
      Material.MUSIC_DISC_STRAD, "&bThẻ diorite", "", "&fChuyển sang sản xuất diorite", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");


  public static final SlimefunItemStack CARD_ANDESITE = new SupremeItemStack("SUPREME_CARD_ANDESITE",
      Material.MUSIC_DISC_STRAD, "&bThẻ andesite", "", "&fChuyển sang sản xuất andesite", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");


  public static final SlimefunItemStack CARD_GRAVEL = new SupremeItemStack("SUPREME_CARD_GRAVEL",
      Material.MUSIC_DISC_STRAD, "&bThẻ sỏi", "", "&fChuyển sang sản xuất sỏi", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");


  public static final SlimefunItemStack CARD_SAND = new SupremeItemStack("SUPREME_CARD_SAND", Material.MUSIC_DISC_STRAD,
      "&bThẻ cát", "", "&fChuyển sang sản xuất cát", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");


  public static final SlimefunItemStack CARD_ENDSTONE = new SupremeItemStack("SUPREME_CARD_ENDSTONE",
      Material.MUSIC_DISC_STRAD, "&bThẻ đá cuối", "", "&fChuyển sang sản xuất đá cuối", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");


  public static final SlimefunItemStack CARD_CLAY = new SupremeItemStack("SUPREME_CARD_CLAY", Material.MUSIC_DISC_STRAD,
      "&bThẻ đất sét", "", "&fChuyển sang sản xuất đất sét", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");


  public static final SlimefunItemStack CARD_SNOW = new SupremeItemStack("SUPREME_CARD_SNOW", Material.MUSIC_DISC_STRAD,
      "&bThẻ tuyết", "", "&fChuyển sang sản xuất tuyết", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");

  public static final SlimefunItemStack CARD_APPLE = new SupremeItemStack("SUPREME_CARD_APPLE", Material.MUSIC_DISC_STRAD,
      "&bThẻ táo", "", "&fChuyển sang sản xuất táo", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");

  public static final SlimefunItemStack CARD_NETHER_STAR = new SupremeItemStack("SUPREME_CARD_NETHER_STAR", Material.MUSIC_DISC_STRAD,
          "&bThẻ ngôi sao Nether", "", "&fChuyển sang sản xuất ngôi sao Nether", "",
          LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");

  public static final SlimefunItemStack CARD_WITHER_ROSE = new SupremeItemStack("SUPREME_CARD_WITHER_ROSE", Material.MUSIC_DISC_STRAD,
          "&bThẻ hoa hồng Wither", "", "&fChuyển sang sản xuất hoa hồng Wither", "",
          LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");

  public static final SlimefunItemStack CARD_SLIME_BALL = new SupremeItemStack("SUPREME_CARD_SLIME_BALL", Material.MUSIC_DISC_STRAD,
          "&bThẻ slime", "", "&fChuyển sang sản xuất slime", "",
          LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");

  public static final SlimefunItemStack CARD_INK_SAC = new SupremeItemStack("SUPREME_CARD_INK_SAC", Material.MUSIC_DISC_STRAD,
          "&bThẻ mực", "", "&fChuyển sang sản xuất mực", "",
          LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");

  public static final SlimefunItemStack CARD_GLOW_INK_SAC = new SupremeItemStack("SUPREME_CARD_GLOW_INK_SAC", Material.MUSIC_DISC_STRAD,
          "&bThẻ mực phát sáng", "", "&fChuyển sang sản xuất mực phát sáng", "",
          LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");

  public static final SlimefunItemStack CARD_HONEY_BOTTLE = new SupremeItemStack("SUPREME_CARD_HONEY_BOTTLE", Material.MUSIC_DISC_STRAD,
          "&bThẻ mật ong", "", "&fChuyển sang sản xuất mật ong", "",
          LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");

  public static final SlimefunItemStack CARD_COAL = new SupremeItemStack("SUPREME_CARD_COAL", Material.MUSIC_DISC_13,
      "&bThẻ than", "", "&fChuyển sang sản xuất than", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");


  public static final SlimefunItemStack CARD_IRON = new SupremeItemStack("SUPREME_CARD_IRON", Material.MUSIC_DISC_13,
      "&bThẻ sắt", "", "&fChuyển sang sản xuất sắt", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");

  public static final SlimefunItemStack CARD_COPPER = new SupremeItemStack("SUPREME_CARD_COPPER",
      Material.MUSIC_DISC_13, "&bThẻ đồng", "", "&fChuyển sang sản xuất đồng", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");


  public static final SlimefunItemStack CARD_GOLD = new SupremeItemStack("SUPREME_CARD_GOLD", Material.MUSIC_DISC_13,
      "&bThẻ vàng", "", "&fChuyển sang sản xuất vàng", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");


  public static final SlimefunItemStack CARD_QUARTZ = new SupremeItemStack("SUPREME_CARD_QUARTZ",
      Material.MUSIC_DISC_13, "&bThẻ thạch anh Nether", "", "&fChuyển sang sản xuất thạch anh Nether", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");


  public static final SlimefunItemStack CARD_QUARTZ_BLOCK = new SupremeItemStack("SUPREME_CARD_QUARTZ_BLOCK",
      Material.MUSIC_DISC_13, "&bThẻ khối thạch anh", "", "&fChuyển sang sản xuất khối thạch anh", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");


  public static final SlimefunItemStack CARD_LAPIS = new SupremeItemStack("SUPREME_CARD_LAPIS", Material.MUSIC_DISC_13,
      "&bThẻ lapis", "", "&fChuyển sang sản xuất lapis", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");


  public static final SlimefunItemStack CARD_REDSTONE = new SupremeItemStack("SUPREME_CARD_REDSTONE",
      Material.MUSIC_DISC_13, "&bThẻ đá đỏ", "", "&fChuyển sang sản xuất đá đỏ", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");


  public static final SlimefunItemStack CARD_DIAMOND = new SupremeItemStack("SUPREME_CARD_DIAMOND",
      Material.MUSIC_DISC_FAR, "&bThẻ kim cương", "", "&fChuyển sang sản xuất kim cương", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");


  public static final SlimefunItemStack CARD_EMERALD = new SupremeItemStack("SUPREME_CARD_EMERALD",
      Material.MUSIC_DISC_FAR, "&bThẻ ngọc lục bảo", "", "&fChuyển sang sản xuất ngọc lục bảo", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");


  public static final SlimefunItemStack CARD_BLAZE_ROD = new SupremeItemStack("SUPREME_CARD_BLAZE_ROD",
      Material.MUSIC_DISC_FAR, "&bThẻ que lửa", "", "&fChuyển sang sản xuất que lửa", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_NETHERITE = new SupremeItemStack("SUPREME_CARD_NETHERITE",
      Material.MUSIC_DISC_FAR, "&bThẻ netherite", "", "&fChuyển sang sản xuất netherite", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");


  public static final SlimefunItemStack CARD_AMETHYST = new SupremeItemStack("SUPREME_CARD_AMETHYST",
      Material.MUSIC_DISC_FAR, "&bThẻ amethyst", "", "&fChuyển sang sản xuất amethyst", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");


  public static final SlimefunItemStack CARD_IRON_DUST = new SupremeItemStack("SUPREME_CARD_IRON_DUST",
      Material.MUSIC_DISC_MELLOHI, "&bThẻ bột sắt", "", "&fChuyển sang sản xuất bột sắt", "",
      LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");

  public static final SlimefunItemStack CARD_LEAD_DUST = new SupremeItemStack("SUPREME_CARD_LEAD_DUST",
      Material.MUSIC_DISC_MELLOHI, "&bThẻ bột chì", "", "&fChuyển sang sản xuất bột chì", "",
      LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");


  public static final SlimefunItemStack CARD_GOLD_DUST = new SupremeItemStack("SUPREME_CARD_GOLD_DUST",
      Material.MUSIC_DISC_MELLOHI, "&bThẻ bột vàng", "", "&fChuyển sang sản xuất bột vàng", "",
      LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");


  public static final SlimefunItemStack CARD_COPPER_DUST = new SupremeItemStack("SUPREME_CARD_COPPER_DUST",
      Material.MUSIC_DISC_MELLOHI, "&bThẻ bột đồng", "", "&fChuyển sang sản xuất bột đồng", "",
      LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");


  public static final SlimefunItemStack CARD_MAGNESIUM_DUST = new SupremeItemStack("SUPREME_CARD_MAGNESIUM_DUST",
      Material.MUSIC_DISC_MELLOHI, "&bThẻ bột magie", "", "&fChuyển sang sản xuất bột magie", "",
      LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");


  public static final SlimefunItemStack CARD_ALUMINUM_DUST = new SupremeItemStack("SUPREME_CARD_ALUMINUM_DUST",
      Material.MUSIC_DISC_MELLOHI, "&bThẻ bột nhôm", "", "&fChuyển sang sản xuất bột nhôm", "",
      LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");


  public static final SlimefunItemStack CARD_SILVER_DUST = new SupremeItemStack("SUPREME_CARD_SILVER_DUST",
      Material.MUSIC_DISC_MELLOHI, "&bThẻ bột bạc ", "", "&fChuyển sang sản xuất bột bạc", "",
      LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");


  public static final SlimefunItemStack CARD_TIN_DUST = new SupremeItemStack("SUPREME_CARD_TIN_DUST",
      Material.MUSIC_DISC_MELLOHI, "&bThẻ bột thiếc", "", "&fChuyển sang sản xuất bột thiếc", "",
      LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");


  public static final SlimefunItemStack CARD_ZINC_DUST = new SupremeItemStack("SUPREME_CARD_ZINC_DUST",
      Material.MUSIC_DISC_MELLOHI, "&bThẻ bột kẽm", "", "&fChuyển sang sản xuất bột kẽm", "",
      LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Nguyên liệu Supreme");

}
