package dev.dkvl.womutils.beans;;

import lombok.Value;

@Value
public class Snapshot implements WomResult
{
	String createdAt;
	String importedAt;
	Skill overall;
	Skill attack;
	Skill defence;
	Skill strength;
	Skill hitpoints;
	Skill ranged;
	Skill prayer;
	Skill magic;
	Skill cooking;
	Skill woodcutting;
	Skill fletching;
	Skill fishing;
	Skill firemaking;
	Skill crafting;
	Skill smithing;
	Skill mining;
	Skill herblore;
	Skill agility;
	Skill thieving;
	Skill slayer;
	Skill farming;
	Skill runecrafting;
	Skill hunter;
	Skill construction;
	Minigame league_points;
	Minigame bounty_hunter_hunter;
	Minigame bounty_hunter_rogue;
	Minigame clue_scrolls_all;
	Minigame clue_scrolls_beginner;
	Minigame clue_scrolls_easy;
	Minigame clue_scrolls_medium;
	Minigame clue_scrolls_hard;
	Minigame clue_scrolls_elite;
	Minigame clue_scrolls_master;
	Minigame last_man_standing;
	Minigame soul_wars_zeal;
	Boss abyssal_sire;
	Boss alchemical_hydra;
	Boss barrows_chests;
	Boss bryophyta;
	Boss callisto;
	Boss cerberus;
	Boss chambers_of_xeric;
	Boss chambers_of_xeric_challenge_mode;
	Boss chaos_elemental;
	Boss chaos_fanatic;
	Boss commander_zilyana;
	Boss corporeal_beast;
	Boss crazy_archaeologist;
	Boss dagannoth_prime;
	Boss dagannoth_rex;
	Boss dagannoth_supreme;
	Boss deranged_archaeologist;
	Boss general_graardor;
	Boss giant_mole;
	Boss grotesque_guardians;
	Boss hespori;
	Boss kalphite_queen;
	Boss king_black_dragon;
	Boss kraken;
	Boss kreearra;
	Boss kril_tsutsaroth;
	Boss mimic;
	Boss nightmare;
	Boss obor;
	Boss sarachnis;
	Boss scorpia;
	Boss skotizo;
	Boss the_gauntlet;
	Boss the_corrupted_gauntlet;
	Boss theatre_of_blood;
	Boss thermonuclear_smoke_devil;
	Boss tzkal_zuk;
	Boss tztok_jad;
	Boss venenatis;
	Boss vetion;
	Boss vorkath;
	Boss wintertodt;
	Boss zalcano;
	Boss zulrah;
}