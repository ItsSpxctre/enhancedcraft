# ENHANCEDCRAFT CHANGELOG

## beta-1.4
This beta update adds some more config options, features, and applies some fixes to the mod for a better experience.

### beta-1.4 RELEASE

(IMPORTANT) Dropping support for 1.16.2 and 1.16.3. You must update to the latest version of Fabric Loader and Fabric API!
(ALSO IMPORTANT) One new feature overwrites an entire method related to the Riptide Enchantment. It is recommended to disable any mods that may make changes to the Riptide Enchantment has it might break both mods.

#### Changes

    <New Stuff>
    - New set: Aecoron (derives from the word "aecor", meaning "ocean" in Latin)
        - Aecoron crafted by smelting Prismarine Shards / Crystals
        - Aecoron Ingots crafted by combining Aecoron and Metal Alloy in a Smithing Table
        - 80% max durability of diamond (1248 for tools, 26 durability multiplier for armor)
        - Armor:
            - Same armor points as diamond.
            - Same toughness as diamond.
            - Same enchantability as iron (9).
            - Repaired with Aecoron Ingots.
            - Aecoron Set Bonus:
                - You swim significantly faster (up to Dolphin's Grace levels)
                - Infinite water breathing when in water.
                - Holding a trident now grants you Strength I.
                - Throwing a trident now deals 14 damage.
                - Riptide Buffs:
                    - Riptide now throws you 2.5 times further and has a faster cooldown.
                    - Riptide now deals 15 damage on impact.
                    - You are INVULNERABLE during riptide.
                    - Launching with Riptide will break your fall.
                    - After launching with Riptide, you swim EVEN FASTER for 5 seconds.
                - Loyalty Buffs:
                    - Loyalty now returns to you 3 times faster.
                - Siren's Rest:
                    - This unique ability allows you to heal and regain hunger by "meditating" underwater.
                    - After meditating, you gain Regeneration I, Resistance I, Speed I, and Absorption X for the next 5 minutes.
                    - You are invulnerable to damage during meditation.
                    - You cannot move during meditation.
        - Tools:
            - Same overall stats as Diamond.
            - Suffer no mining speed penalty when touching water.
        - Trident Mold:
            - Tridents can now be crafted with trident molds.
            - A trident mold will still require an existing trident to be created.
            - A trident mold has three uses before being destroyed.
                - The state of the mold will be displayed as a condition: New, Damaged, and Shattered.
    - New set of tools: Netherrack Tools!
        - Mining level of 1 (same as stone).
        - Mining speed of 3f.
        - Durability of 72.
        - Attacking a player who is lit on fire with a netherrack tool will extend the burning time for 50% longer.
    - New item: fireballs!
        - Fireballs currently have the same texture as Fire Charges.
        - Stackable up to 3!
        - When right-clicked, fireballs will launch a giant ghast fireball that deals 6 damage on direct contact, and explosion damage if not direct.
        - This item/concept was inspired by the Fireball in Hypixel's Bedwars.
        - Crafted by combining fire charges with gunpowder.
    - New item: Smart Pearls!
        - Smart Pearls work just like ender pearls, but have some benefits over normal Ender Pearls!
        - Smart Pearls do not deal damage to the user on teleport.
        - Smart Pearls *does* deal damage to any entities that are hit by the Smart Pearl. Deals 3 damage on impact.
        - Smart Pearls never spawn endermites.
        - Smart Pearls have 1/4 the cooldown compared to normal Ender Pearls.
        - Stackable up to 16.
        - Smart Pearls have a distinct particle when the user teleports, to differentiate it from normal Ender Pearls.
        - Smart Pearls have a unique sound effect when the user teleports, to differentiate it from normal Ender Pearls.
        - This item was inspired by the Smart Pearl in Hypixel's Skywars, but I highly doubt the concept is the same as Hypixel's implementation of this item.
        - Crafted by using ender pearls surrounding a piece of lapis lazuli. Crafted in batches of 2.
    - Added a new food item: Golden Heads (aka G-Heads)!
        - Continuing down the Hypixel copy-train, we have created the Golden Head from Hypixel UHC Meet-ups.
            - Food stats identical to Golden Apple:
                - Regeneration II for 5 seconds
                - Absorption I for 2 minutes.
                - 4 hunger points and 9.6 saturation points restored.
        - Like Hypixel's G-Heads, they are consumed instantly.
        - To prevent from accidently eating multiple G-heads, as well as for the sake of balance, we've put a 3-second delay on repeated-head-eating. ;)
        - They are crafted with golden ingots surrounding a player head, similar to Hypixel's G-Head.
        - Players now have a 50% chance to drop their own head when they die.
    - YEAY
    - NEW ENCHANTMENT: Harvester
        - Harvester is a new enchantment specific to hoes.
            - Harvester increases harvest amount of crops.
                - Beetroot crops now drop 4 to 10 beetroots when harvested.
                - Potato crops now drop an ADDITIONAL 5 to 12 potatoes when harvested. (You're welcome Technoblade)
                - Carrot crops now drop an ADDITIONAL 7 to 15 carrots when harvested.
                - Wheat crops now drops 3 to 7 wheat when harvested.
                - Haybales now have a 50% chance to duplicate themselves when harvested.
        - Harvester can be obtained with an enchantment table with a level-15 enchantment or better.
        - Harvester is mutually exclusive with the Fortune enchantment.
    - Two new advancements in-game!
    
    <Etherium Set Buffs>
     - New item: Godslayer (Etherium Perk)
        - Godslayer perk only works if the user equips a full set of Etherium armor.
        - On use, the user is granted temporary maximum enrage.
        - Cooldown for 45 seconds.
     - New mechanic: Relentless Warrior
        - When you are fully enraged, your sword will disable the opponent's shield and deal 125 durability to your opponent's shield.
        - You disable your opponent's shield for twenty seconds instead of ten, and deal full damage towards your opponent.
    
    <Better Spawning!>
    - Skeletons can now spawn equipped with swords and axes.
    - There are now different types (classes) of zombies!
        - In hard mode, zombies will always spawn with a class, with a 25% chance to spawn with a hard-mode class.
            - These zombies have a lowered chance to drop their hard-mode-only gear (2.5% chance instead of 8.5%).
            - Hard Classes:
                - Furious Zombie:
                    - Netherite Sword with Sharpness 4
                    - Iron Chestplate
                    - Strength III
                - Berserker Zombie:
                    - Iron Axe with Sharpness 5
                    - Diamond Helmet and Iron Chestplate
                - Scout Zombie:
                    - Speed IV
                    - Always able to pick up loot
                - Tank Zombie:
                    - Enchanted Diamond Sword with Sharpness I - IV
                    - 3/4 Diamond Set (diamond helmet is excluded)
                    - Shield with Unbreaking III (cosmetic only)
                    - Resistance I
        - In normal mode, zombies will have a 50% chance of spawning with a normal zombie class.
            - Normal Classes:
                - Warrior Zombies:
                    - Warrior Zombie ~
                        - Iron Helmet and Chestplate
                        - Stone Sword
                    - Weak Warrior Zombie ~
                        - Leather Helmet
                        - Wooden Sword
                - Sword Zombies:
                    - Weak ~ Golden Sword
                    - Simple ~ Bronze Sword
                    - Generic ~ Iron Sword
                    - Strong ~ Alloy Sword
                - Shovel Zombies:
                    - Generic ~ Iron Shovel
                - Axe Zombies:
                    - Simple ~ Bronze Axe
                    - Generic ~ Iron Axe
                - Nitwit Zombie:
                    - Metal Alloy in off-hand
        - In easy mode, the chances of spawning with a weapon is the same as vanilla.
        - The point of this change was to make normal zombies a more annoying-to-deal-with mob, than just a mere punching bag. Now, you're forced to deal with large groups of zombies with more skill required, than just slaying them in one hit with your smite 5 netherite sword.
        
    <Quality Of Life Changes>
    - Minecarts and rails can now be created with bronze ingots instead of iron ingots.
    
    <Fixes>
    - Fixed shields not being able to be crafted with metal alloy.
    - Etherium armor now has a unique equip sound effect and a unique set bonus activation sound effect.
    - Etherium sword retextured.
    - Removed irrelevant recipes JSONs.
    
    
    <Easter Egg?>
    - A easter egg ;)
    
    <Technical Stuff>
        - Maven publication has been officially removed since no one uses it anyways and it's kind of redundant.
        - ModRegistry has been refactored to ECRegistry.
        - Project was updated to JDK 15.0.1.
        - JIJ for Fabric-ASM.
        - Fixed all capitalization to match Java's official capitalization. (Thanks... YTG123 ;[           i cry)

### beta-1.4-SNAPSHOT-E

#### Changes
    - Added a new food item: Golden Heads (aka G-Heads)!
        - Continuing down the Hypixel copy-train, we have created the Golden Head from Hypixel UHC Meet-ups.
        - Food stats identical to Golden Apple:
            - Regeneration II for 5 seconds
            - Absorption I for 2 minutes.
            - 4 hunger points and 9.6 saturation points restored.
        - Like Hypixel's G-Heads, they are consumed instantly.
        - To prevent from accidentally eating multiple G-heads, as well as for the sake of balance, we've put a 3-second delay on repeated-head-eating. ;)
        - They are crafted with golden ingots surrounding a player head, similar to Hypixel's G-Head.
        - Players now have a 50% chance to drop their own head when they die.
    - Two new advancements in-game!
    - Fixed shields not being able to be crafted with metal alloy.
    - Easter egg ;)
    
    - Technical Stuff
        - Fixed all capitalization to match Java's official capitalization. (Thanks... YTG123 ;[           i cry)
    
### beta-1.4-SNAPSHOT-D

#### Changes
    - (IMPORTANT) Dropping support for 1.16.2 and 1.16.3. You must update to the latest version of Fabric Loader and Fabric API!
    - NEW ENCHANTMENT: Harvester
        - Harvester is a new enchantment specific to hoes.
        - Harvester increases harvest amount of crops.
            - Beetroot crops now drop 4 to 10 beetroots when harvested.
            - Potato crops now drop an ADDITIONAL 5 to 12 potatoes when harvested. (You're welcome Technoblade)
            - Carrot crops now drop an ADDITIONAL 7 to 15 carrots when harvested.
            - Wheat crops now drops 3 to 7 wheat when harvested.
            - Haybales now have a 50% chance to duplicate themselves when harvested.
        - Harvester can be obtained with an enchantment table with a level-15 enchantment or better.
        - Harvester is mutually exclusive with the Fortune enchantment.
    - Added a teleport-landing sound to Smart Pearls to fill in for the lack of the damage-taking sound that usually gives the feedback of landing with normal Ender Pearls.
    - Fixed an issue with fireballs crashing a server when used on a server.
    - Fixed lang files.
    - Quality of Life Changes:
        - Grass now has a 100% chance to 1 to 3 seeds when mined with hoes.
    
    - Technical Stuff
        - Project was updated to JDK 15.0.1.
        - JIJ for Fabric-ASM.

### beta-1.4-SNAPSHOT-C & 11.14.2020

#### Changes
    - New experimental item: fireballs!
        - Fireballs currently have the same texture as Fire Charges.
        - Stackable up to 3!
        - When right-clicked, fireballs will launch a giant ghast fireball that deals 6 damage on direct contact, and explosion damage if not direct.
        - This item/concept was inspired by the Fireball in Hypixel's Bedwars.
        - Crafted by combining fire charges with gunpowder.
    - Another new experimental item: Smart Pearls!
        - Smart Pearls work just like ender pearls, but have some benefits over normal Ender Pearls!
        - Smart Pearls do not deal damage to the user on teleport.
        - Smart Pearls *does* deal damage to any entities that are hit by the Smart Pearl. Deals 3 damage on impact.
        - Smart Pearls never spawn endermites.
        - Smart Pearls have 1/4 the cooldown compared to normal Ender Pearls.
        - Stackable up to 16.
        - Smart Pearls have a distinct particle when the user teleports, to differentiate it from normal Ender Pearls.
        - Smart Pearls have a unique sound effect when the user teleports, to differentiate it from normal Ender Pearls.
        - This item was inspired by the Smart Pearl in Hypixel's Skywars, but I highly doubt the concept is the same as Hypixel's implementation of this item.
        - Crafted by using ender pearls surrounding a piece of lapis lazuli. Crafted in batches of 2.
    - Skeletons can now spawn equipped with swords and axes.
    - There are now different types (classes) of zombies!
        - In hard mode, zombies will always spawn with a class, with a 7.5% chance to spawn with a hard-mode class.
            - These zombies have a lowered chance to drop their hard-mode-only gear (2.5% chance instead of 8.5%).
            - Hard Classes:
                - Furious Zombie:
                    - Netherite Sword with Sharpness 4
                    - Iron Chestplate
                    - Strength III
                - Berserker Zombie:
                    - Iron Axe with Sharpness 5
                    - Diamond Helmet and Iron Chestplate
                - Scout Zombie:
                    - Speed IV
                    - Always able to pick up loot
                - Tank Zombie:
                    - Enchanted Diamond Sword with Sharpness I - IV
                    - 3/4 Diamond Set (diamond helmet is excluded)
                    - Shield with Unbreaking III (cosmetic only)
                    - Resistance I
        - In normal mode, zombies will have a 50% chance of spawning with a normal zombie class.
            - Normal Classes:
                - Warrior Zombies:
                    - Warrior Zombie ~
                        - Iron Helmet and Chestplate
                        - Stone Sword
                    - Weak Warrior Zombie ~
                        - Leather Helmet
                        - Wooden Sword
                - Sword Zombies:
                    - Weak ~ Golden Sword
                    - Simple ~ Bronze Sword
                    - Generic ~ Iron Sword
                    - Strong ~ Alloy Sword
                - Shovel Zombies:
                    - Generic ~ Iron Shovel
                - Axe Zombies:
                    - Simple ~ Bronze Axe
                    - Generic ~ Iron Axe
                - Nitwit Zombie:
                    - Metal Alloy in off-hand
        - In easy mode, the chances of spawning with a weapon is the same as vanilla.
        - The point of this change was to make normal zombies a more annoying-to-deal-with mob, than just a mere punching bag. Now, you're forced to deal with large groups of zombies with more skill required, than just slaying them in one hit with your smite 5 netherite sword.
    - A easter egg ;)
    
    Technical Stuff:
        - Maven publication has been officially removed since no one uses it anyways and it's kind of redundant.
        - ModRegistry has been refactored to ECRegistry.

## beta-1.3.3
Halloween update?

No, actually though, that update took way longer than it should've: almost two weeks instead of a day or two! Anyways, enjoy beta-1.3.3 while I work on beta-1.4.

### Changes
	- Added set bonuses for custom armor!
		- Etherium Set Bonus:
			- Set Bonus: Etherium Enrage
				- Killing an entity will grant you one enrage level.
				- Enrage Level 1: Strength I for 5 seconds.
				- Enrage Level 2: Strength II for 5 seconds.
				- Enrage Level 3: Strength II and Absorption II for 5 seconds. Enraged player now glows and plays a SoundEvent.
				- Enrage levels are capped at level 3. If you do not kill an entity within the time strength lasts, your enrage levels will reset.
				- Huge thanks to sschr15 for many of the code and help! Very appreciate it man, and godspeed to you if you see this!
			- You get Absorption 2, Speed 3, and Jump Boost 1 if under 4 health (2 hearts).
			- You get permanent Resistance II and 10 extra hearts.
			- SoundEvent ques that indicate when a buff has been activated.
			- Multiplayer support.
	- Removed unnecessary ItemGroup. Will be reimplemented in a later patch.
	- Quality of Life Changes:
	    - Options Background, Hotbar Icons, Widgets, Hotbar, and the enchanted item glint can now be changed in the AutoConfig menu accessible via Mod Menu.
	    - Changed default enchantment glint... again
	        - Tired of the blinding cyan lightning color that used to be part of EnhancedCraft? Now, it has been replaced with a cool and clean purple/magenta gradient!
	        - Enchantment glint can, of course, be customized with the config menu available inside of the Mod Menu.

	- Fixes:
		- Fixed MAJOR compatibility issue surrounding creative ItemGroups with other mods.
		- Fixed MAJOR ore-spawning issue, where Etherium wasn't being spawned. You may have to walk into a new chunk you haven't loaded before to find etherium.
			- Etherium nows spawns up to once per chunk, with up to 5 per vein.
		- Etherium ore now reacts differently when used with the fortune enchantment.
			- Fortune II and above will give you a chance to drop 1 - 3 etherium instead of 1.
		    - Fortune I will unfortunately result in no boost in drop rate.

## beta-1.3.2
More Halloween updates muahahahhhahahahahahhahahahhhhhhhhhhhhhhhhhhhhhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa

### Changes
	- Made a ghetto portal mechanic. It kinda sucks, but it works in the meantime.
	- Verified the concept where entering specific dimensions with specific armor pieces and tools will grant debuffs. This is now officially and internally called "Deterioration".
		- To avoid "Deterioration", you must quickly swap out of "foreign" tools and armor.
		- If you do not avoid "deterioration", you will receive the following debuffs.
			- "Deterioration" and Slowness if wearing "foreign" armor.
			- Mining Fatigue and Weakness if holding "foreign" tools.
			- Added a new status effect: Deterioration.
				- Deterioration is just a superiorly nastier withering effect. It will deal 2.5 damage every 0.5 seconds, effectively killing a player in 4 seconds (slower due to natural regeneration and other factors.)
	- New (albeit experimental) blocks! These blocks have been temporarily added as placeholders for an upcoming dimension update. Currently the blocks don't drop anything are only accessible via creative inventory.
		- Fortisteel Ore (otherstone and earthstone variant.)
		- Purigold Ore (otherstone and earthstone variant.)
		- Cobalt Ore (otherstone exclusive.)
		- Otherstone.
		- Earthstone.
	- Quality of Life Changes:
		- You can now make arrows out of bronze ingots instead of flint, iron ingots, metal alloy, or cobblestone. Arrows made this way are made in batches of 8.
		- Shears can now be made from bronze.
		- Anvils can now be made from bronze.
		- Changed up the GUI textures. Credits to Lucy, the maker of Nebula 16x for some of the textures :)
		- Changed all of the Etherium textures. Credits to Lucy, the maker of Nebula 16x for the textures. You really make great packs! :)
		- Changed the icon.png
	- Fixes:
		- Fixed block variants of ores not dropping theirselves when mined.


## beta-1.3.1
Oooh, it's Halloween month, and some spooky updates are here! Muahahahhahhahahahhahhaahhahahahha

### Changes
	- Added a haunted entity to the game, his name we shall not speak of or his bad omens will follow.
		- When sleeping, he has a 1/100 chance to haunt you, leading to a jumpscare, and Blindness and Nausea for 10 seconds. Also, any Nether Portals within a 16 chunk radius will be broken.
	- Added a test dimension called "enhancedcraft:mirrored_dimension" to test and debug dimensions.
	- Significantly buffed Etherium Armor.
		- All armor points on Etherium armor increased by 2.
		- 20 armor toughness per piece compared to 10.
	- Added some custom advancements.
		- Added "The Final Element" advancement acquired by obtaining Etherium.
		- Added "The King of Minecraft" advancement acquired by obtaining full Etherium Gear, an Etherium Pickaxe, and an Etherium Sword.
	- Nerfed Bronze spawn mechanics.
		- Nerfed spawn rate from 22 to 20.
		- Nerfed vein size from 15 to 12.
		- Max y level changed to 80.
		- Circular spread now matches that of coal (128).
	- Nerfed Gemstone spawn mechanics.
		- Nerfed spawn rate from 6 to 4.
		- Changed minimum y level to 6 from 10.
		- Changed maximum y level from 27 to 20.
	- Buffed Etherium spawn mechanics.
		- Buffed minimum y level from 0 to 6.
	- Buffed Gemstone Apple's effects.
		- Added Fire Resistance for 30 seconds.
		- Now gives Regeneration 2.
	- Buffed Bronze Axe.
		- Now deals 8 hearts of damage.
			- This is to make it a competent competitor to the Stone and Iron Axe. It undercuts the Iron and Stone Axe in terms of raw damage, but has higher DPS.
	- Tested a concept where entering specific dimensions with specific armor pieces equipped will apply nasty debuffs. Currently functional but still testing.
	- Tested a concept where holding and using certain tools in certain biomes will grant nasty debuffs. Currently functional but still under testing.
	- Quality of Life Changes:
		- You can now make arrows out of iron ingots instead of flint or cobblestone. Arrows made this way are made in batches of 16.
		- You can now make arrows out of metal alloy instead of flint, cobblestone, or iron. Arrows made this way are made in stacks.
		- You can now make shields out of bronze and alloy ingots instead of using iron.
	- Added hidden textures for a later release ;)
	- Fixed Bronze Block requiring a Netherite Pickaxe to be broken.
	- Fixed Metal Alloy not able to be repaired.


## beta-1.3

This beta update introduces some quality of life changes, a working GUI implementation for Mod Menu, as well as some other changes and bug fixes.

### Changes
	- OPTIONS_BACKGROUND is now customizable! We have created a mod menu that allows for configuration.
	- Quality-of-Life Changes
		- Changed the crosshair. Some people didn't want to play Minecraft like an FPS lol.
		- Changed the Enchanted Item Glint. Now looks epic as fuq
		- Changed "Tom Yum" to "Tom Yum Kong".
		- Added a custom attack indicator.
		- Added flesh-to-leather capability without additional mods, via smelting only.
		- Added granite-to-cobble capability without additional mods, for those who don't want granite, diorite, or andesite, (aka the ugly & useless blocks).
		- Added cheap-arrow capability for those who hate flint. Now you can craft an arrow with cobblestone, albeit less efficient.
	- Added Block of Etherium and Bronze.
	- Add custom skybox. (For OptiFine users)
	- Adds skybox dependency. (No we're not, we reverted this.)
	- 1.16.3 is supported alongside 1.16.2.

	- IMPORTANT: Fixed block madness.
		- All tools previously were broken, in that they were not following block mining level rules. This has been patched.
	- Fixed Etherium's blurry sprite while using OptiFabric and OptiFine in Fabric.
	- Fixes ModMenu "website" and "sources" buttons.

### TODO
	- Add skyboxes support for FabricSkyboxes
	- Implement Canvas support.
	- Add more Features.


## beta-1.2.1

This minor beta update updates textures... yeah...

### Changes
	- Changed the Enchantment Glint. The current one looks way better than the golden mess that was beta-1.2.
	- Added a sky.

	- Fixed Bronze Ingots not crafting a Bucket.


## beta-1.2

This minor beta update brings some new features, bug fixes, additions, and changes to the mod.

### Changes
	- Added a GUI patch that differentiates vanilla Minecraft from having the mod installed.
		- Hearts will look more glossy, and particles will look different.
		- The dirt background in the settings has been changed to a wall of Etherium Ore.
		- Enchanted Items' glints are different.

	- Fixed Tom Yum Stew's glint not showing.
	- Fixed a bug where the mixin would not inject server-side.


## beta-1.1

This minor beta update brings some new features, bug fixes, additions, and changes to mod.

### Changes
	- Metal Alloy gear and tools are now available!
		- 750 durability (for tools), 28 base durability multiplier (for armor).
		- Enchantability of 22 (same as gold).
		- Iron and Diamond step-in. Very good for getting better-than-Iron protection fairly early in-game, and provides near-Diamond protection until you find Diamond.
		- Alloy Sword: Deals 6.7 damage with 1.6 swing speed. Slightly weaker than Iron, but better than Stone.
		- Alloy Pickaxe: 7.5f Pickaxe Multiplier. Deals 4.5 damage with 1.2 swing speed. Mining level of 3. Substantially better than Iron, minusculely worse than Diamond.
		- Alloy Axe: 7.5f Axe Multiplier. Deals 9 damage with 1.05 swing speed. Substantially better than Iron, minusculely worse than Diamond.
		- Alloy Shovel: 7.5f Shovel Multiplier. Deals 5 damage with 1.1 swing speed. Substantially better than Iron, minusculely worse than Diamond.
		- Alloy Hoe: 7.5f Hoe Multiplier.  Deals 1 damage with 2.5 swing speed. Substantially better than Iron, minusculely worse than Diamond.
		- Alloy Set: {3, 5, 7, 3} Helmet and boots are the same as Diamond. Chestplate and leggings are one armor point lower than Diamond respectively.
			- Bronze Set includes armor toughness! Armor toughness of 2, same as Diamond.
	- Added "Sword Of The Night".
		- Same stats as the Iron Sword.
		- Currently unobtainable.
		- Planned to give invisibility when holding at night.
	- Added Tom Yum Stew.
		- Regeneration 3 for 3 seconds.
		- 20 saturation points.
		- Can be crafted with a bowl, a carrot, some dried kelp, a tropical fish, a potato, and grass.
		- When eaten, returns a bowl.
		
	- Fixed lang file for Metal Alloy.
	- Fixed texture file for Metal Alloy.


## beta-1.0

The first beta release for EnhancedCraft! Many changes have been implemented, tons of new features are all coming together, and now we are ready to announce that EnhancedCraft is ready and stable enough for its first beta release! Here are some changes.

### Changes

	- Bronze can now create various items that can normally be crafted with iron.
		- Buckets.
		- Flint and Steel.
	- New material: Metal Alloy.
		- Currently a concept, but will soon have the ability to craft an in-between set of tools and gear between Diamond and Iron.
		- Crafted using a combination of Gold, Bronze, and Iron ingots.
	- Brand new music disc now out: Soaked Hands.
	- Etherium's rarity is now EPIC.
	- Fixed Bronze Ore not spawning on the sides of mountains.
	- All ores now have a unique circular spread in a random generation.


## v0.2.0-alpha

This minor alpha update brings some new features, bug fixes, and changes to the mod.

### Changes

	- Bronze Tools, Ore, Gear.
		- 200 durability (for tools.)
		- Base durability multiplier of 12 (for armor.)
		- Enchantability of 17. (Better than everything in vanilla except for gold.)
		- Budget Iron.
		- Bronze Ore spawns anywhere from y-level 0 to 60 in veins of up to 15, 22 times per chunks.
		- Bronze Sword: Deals 5.5 damage with 1.6 swing speed. Slightly weaker than Iron, but better than Stone.
		- Bronze Pickaxe: 5f Pickaxe Multiplier. Deals 3.5 damage with 1.2 swing speed. Mining level of 2. Slightly worse than Iron, but better than Stone.
		- Bronze Axe: 5f Axe Multiplier. Deals 7.5 damage with 1.0 swing speed. Slightly worse than Iron, but better than Stone.
		- Bronze Shovel: 5f Shovel Multiplier. Deals 3.5 damage with 1.1 swing speed. Slightly worse than Iron, but better than Stone.
		- Bronze Hoe: 5f Hoe Multiplier.  Deals 1 damage with 2.5 swing speed. Slightly worse than Iron, but better than Stone.
		- Bronze Set: {1, 5, 5, 2} Leggings as strong as iron, otherwise the same as chain.

	- Etherium Ore changes.
		- Now spawns from y-level 6 to y-level 9, from veins of up to 2.


## v0.1.0-alpha Initial Release

The official EnhancedCraft release! EnhancedCraft brings tons of new and useful tools to Minecraft that makes Minecraft more fun and intuitive, as well as make many tasks that much easier!

### Changes

	- Added Obsidian Tools:
		- All Obsidian Tools have 9366 durability. (6x Diamond, most durable in the game)
		- Enchantability of 3. Worst of all tools.
		- Diamond Alternative.
		- Budget Netherite.
		- Slightly slower than Diamond tools.
		- Obsidian Sword: Deals 8 damage with a 1.35 swing speed. Same damage as Netherite, slower.
		- Obsidian Pickaxe: 7f Pickaxe Multiplier. Mining Level of 3. Slower than Diamond. Stronger than Diamond.
		- Obsidian Axe: 7f Axe Multiplier. Slower than Diamond. Deals 10 damage.
		- Obsidian Shovel: 7f Shovel Multiplier. Slower than Diamond.
		- Obsidian Hoe: 7f Hoe Multiplier. Slower than Diamond. Stronger than Diamond.

	- Added Etherium, Etherium Ore & Etherium Tools.
		- New end-game gear set.
		- All Etherium Tools have 1796 durability. (15% more durable than Diamond.)
		- All Etherium armor have a durability base multiplier of 35.
		- Enchantability of 35. Best of all tools.
		- Way faster than Gold and Netherite.
		- Strongest tools in-game.
		- Etherium Ore spawns under y-level 6, in veins of 2, with only 2 veins per chunk.
		- Etherium Sword: Deals 14 damage with 1.8 swing speed.
		- Etherium Pickaxe: 28f Pickaxe Multiplier. Mining Level of 7. Deals 8 damage with 1.6 swing speed.
		- Etherium Axe: 28f Axe Multiplier. Deals 15 damage with 1.1 swing speed.
		- Etherium Shovel: 28f Shovel Multiplier. Deals 9 damage with 1.3 swing speed.
		- Etherium Hoe: 28f Hoe Multiplier. Deals 2 damage with 4 swing speed.
		- Etherium Set: Same as Netherite armor, 10 armor toughness per piece. Applies Resistance 1 with full set.

	- Added Gemstone.
		- New material that can sometimes give free gems upon mining.
			- 15% to drop 12 - 29 lapis lazuli or redstone.
			- 10% to drop 9 - 22 gold ingots.
			- 8% to drop 8 - 18 diamonds.
			- 6% to drop 7 - 16 emeralds.
			- 0.05% to drop one etherium.
			- Or drops itself.

		- Blasted to make Gemstone Shards.
			- Can be used to create various powerful items.
				- Gemstone Apples.
		- Smoked to make Gemfuel.
			- 6000 ticks of burning time (5 minutes, or 300 seconds).
		- Smelted normally to make Cobblestone, while generating 15.0 experience.

	- Re-added the ability to craft Enchanted Golden Apples.

	- Added a new, very powerful apple. The Primordial Catalyst.
		- Restores 10 saturation points.
		- Regeneration IV for 20 seconds.
		- Strength II for 20 seconds.
		- Speed IV for 20 seconds.
		- Absorption VI for 5 minutes.
		- Resistance II for 6 minutes.
		- Fire Resistance for 6 minutes.
		- Glowing for 6 minutes.
		- Can be crafted with emeralds, diamonds, gold, a golden apple, a gemstone apple, and an enchanted golden apple.
