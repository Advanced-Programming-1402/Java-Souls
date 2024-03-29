<img alt="Logo.png" src="resources/Logo.png" style="display: block; margin: 0 auto"/>

In this project you are tasked with developing the basis for a text-based role-playing game. 
You'll be creating a hierarchy of classes which will ultimately become assets for your game. 

Players should be able to choose between different character classes and then fight various 
monster types. Players and monsters will each have unique abilities based on their type, such as 
a dragon breathing fire or a wizard casting a healing spell. Each entity in the game has a 
number of stats as well, such as health points or attack power.

## Tasks 📝

### Step 0: Fork 🍴
Fork this repository and clone it to your local machine. Create a new branch named
  `develop` and switch to it.

### Step 1: Set up class hierarchies 🌴

<img alt="Hierarchy.jpg" src="resources/Hierarchy.jpg" height="354" width="600" style="display:block; margin: 0 auto"/>

You must implement the inheritance hierarchy displayed in the image above.<br>**Hint**: Remember to 
Use the correct inheritance keyword for each file type. `GameObject` is an interface while 
`Monster` and `Player` are abstract classes.

### Step 2: Implement the provided classes and add attributes 🗡️

Below you can find a list of all the classes you must implement. It is up to you to determine 
the datatype for each attribute and how to declare each method. You can add more variables, 
methods, and classes where you see fit.


- **GameObject**: <br>Each entity in the game is called a Game Object. That three  methods declared 
  in this Interface are used by both monsters and players.<br><br>
  - `attack()` is called whenever an entity wants to attack another entity (target) with
    their base attack power. This attack function is separate from the special abilities 
    different classes may have.
  - `takeDamage()` is called whenever an entity takes damage from another one, reducing their 
    health points by the amount of damage received.
  - `die()` is called when an entity's health reaches 0.<br><br>

- **Monster**: <br>Each monster must have the following attributes: `health`, `attackPower`.
   You can add `isAlive` as an attribute to keep track of a monster's current state.<br><br>

  - **Goblin**: The Goblin class is the most basic enemy type encountered in the game. It has no
    unique attributes or abilities. It can only deal damage to players  via basic attacks.<br>
  - **Dragon**: The dragon monster class has the special ability to breathe fire. Using this 
    ability damages multiple players simultaneously. You must define a `fireDamage` attribute to 
    determine the fire attack's damage.<br>
  - **Skeleton**: The Skeleton class has the unique ability to revive itself after dying (only
    once), resetting its health back to the full amount. One method of implementing this would be 
    to create a `deathCount` attribute to keep track of its deaths. <br><br>

- **Player**: <br>Each player must have the following attributes; `playerName`, `health`, 
  `attackPower`.<br><br>

  - **Assassin**: This character class is focused on stealth and dealing critical damage, it 
    has the unique attributes `isInvisible` and `criticalMultiplier`.<br>The 
    assassin has the ability to go invisible. Attacking while invisible breaks the invisibility 
    but triggers a critical hit, dealing extra damage (attackPower * criticalMultiplier).<br>
  - **Knight**: This character class focuses on damage reduction and blocking attacks. You must 
    define the unique attribute `armor`. Any damage the knight receives is reduced by the amount 
    of armor it has. <br>**Hint**: You must override the `takeDamage()` method and reduce the damage
    done based on the knight's armor value.<be>(Optional) The Knight can also use the 
    ability to block incoming attacks, halving the damage received while blocking. You must 
    define the attribute `isBlocking` for this purpose.<br>
  - **Wizard**: (Optional) This character class focuses on casting spells to either damage 
    enemies or heal allies. You must define the following unique attributes for it:
    `mana`, `healSpellPower`, `healSpellCost`, `damageSpellPower`, `damageSpellCost` <br>The 
    wizard can use mana to cast spells. Each spell has a mana cost and a power. Casting 
    the healing spell will heal a chosen player based on the spell's power. Casting the damaging 
    spell damages an enemy based on the spell's power. The wizard should not be able to cast 
    spells if it doesn't have enough mana.<br><br>


**Pro Tip 1**: Don't Repeat Yourself (DRY). Use inheritance to implement methods in the parent 
classes and only override them where necessary.

**Pro Tip 2**: Even though `Monster` and `Player` are abstract classes, you can implement methods in
them. These methods can later be used or overridden by subclasses.

**Pro Tip 3**: Remember that you can use `Super()` to call the constructor of the superclass. You 
can 
use this to simplify the constructor of a child class.

**Note**: Every time a player or a monster performs an action, you should print the action's
corresponding message in the terminal. For example, if a player uses a basic attack against a
monster it could be:

```
Arthur attacked Dragon!
Dragon took 25 damage!
Dragon has 75 health
```

### Step 3: Build instances of the various classes you made 🐉
Use what you've learned of inheritance and polymorphism to create instances of player and 
monster classes and test them. You can create a list of all game objects, or a list of all 
players and a list of all monsters. Use `App.java` for this purpose. You are allowed to 
change all the code in this class.

### Step 4: (Optional) Use the player and monster classes to develop a game! 🎮
Allow users to create a character and choose their class, then randomly generate monsters for 
the player to fight. You should also design a menu in the CLI to allow players to interact with 
the game.
Here are a few ideas for a more complex combat system:
  - Allow users to create multiple characters and send all of them (as a party) to fight monsters.
  - Create new monster and character classes to diversify the combat encounters.
  - Implement a dice-rolling system (like a D20) to add some elements of randomness to fights.
  - Build a PvP game mode where two players can combat each other.

  You are in charge of designing the game using the available tools, so get creative!

#### Bonus:
You can add more attributes to the existing classes, such as experience points, levels, gold, loot, 
weapons, spells, merchants, etc. Defining more complex systems might require additional 
interfaces and abstract classes.

<be>Have fun & good luck :)

