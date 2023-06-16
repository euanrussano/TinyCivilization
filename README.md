<a name="readme-top"></a>
# TinyCivilization

A [libGDX](https://libgdx.com/) project generated with [gdx-liftoff](https://github.com/tommyettinger/gdx-liftoff).

This project was generated with a Kotlin project template that includes Kotlin application launchers and [KTX](https://libktx.github.io/) utilities.

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
      <li><a href="#concept">Concept</a></li>
      <li><a href="#gameplay-overview">Gameplay Overview</a></li>
      <li><a href="#user-interface">User Interface</a></li>
      <li><a href="#art-and-audio">Art and Audio</a></li>
      <li><a href="#target-platforms">Target Platforms</a></li>
      <li><a href="#key-features">Key Features</a></li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#core-features-and-mechanics-for-alpha-version-(mvp)">Core Features and Mechanics for Alpha Version (MVP)</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>

## Concept

Create a turn-based strategy game inspired by the classic game Civilization. Players will guide a civilization from ancient times to the modern era, exploring, expanding, exploiting resources, researching technologies, and engaging in diplomacy and warfare.

## Gameplay Overview

Players control a civilization and make strategic decisions on multiple fronts: economy, technology, military, culture, and diplomacy.

The game progresses through turns, where players manage resources, construct buildings, train units, conduct research, and interact with other civilizations.

The world is represented as a grid-based map divided into tiles, each with unique terrain, resources, and features.

Players can explore the map, establish cities, improve tiles, and expand their territory.

Diplomatic interactions include forming alliances, negotiating trades, signing peace treaties, or waging wars.

Victory conditions can include achieving cultural dominance, scientific advancement, military conquest, or diplomatic influence.

## User Interface

- Interactive world map with zoom and pan functionality.
- City management screen for building construction, resource allocation, and policy settings.
- Technology tree interface for researching advancements.
- Military interface for unit recruitment, movement, and combat.
- Diplomacy screen for negotiations, trade agreements, and diplomatic actions.
- Information panels to display civilization statistics, resources, and current objectives.

## Art and Audio

- Visual style: Choose an art style that suits the theme and era of the game, with distinct visuals for civilizations, units, buildings, and terrain.
- Sound effects: Provide audio cues for actions, events, battles, and interactions.
- Music: Include a soundtrack that complements the game's atmosphere and enhances the player's immersion.

## Target Platforms

The game will be developed for PC and potentially adapted for other platforms such as mobile devices.
Development Timeline:

Pre-production: Conceptualize and plan game mechanics, art style, and technology requirements.
Production: Implement core gameplay features, UI elements, AI systems, and game content.
Testing and Iteration: Conduct extensive playtesting, gather feedback, and refine the game mechanics and balance.
Polishing: Optimize performance, enhance visuals and audio, and fix bugs.
Release: Prepare for distribution and launch on target platforms.

## Key Features

- Procedurally generated world map with varied terrain, resources, and civilizations.
- City management: Construct buildings, manage citizens, assign production and research, and control policies.
- Technology tree: Research advancements to unlock new units, buildings, and abilities.
- Military: Recruit and train units, strategize battles, and conquer enemy cities.
- Economy: Manage resources, trade with other civilizations, establish trade routes, and maintain a balanced economy.
- Culture: Develop cultural achievements, build wonders, and attract great people.
- Diplomacy: Interact with other civilizations through negotiations, alliances, trade, and espionage.
- Victory Conditions: Multiple paths to victory, including domination, cultural, scientific, and diplomatic victories.

<!-- GETTING STARTED -->
## Getting Started

**(REWRITE THIS)**

This is an example of how you may give instructions on setting up your project locally.
To get a local copy up and running follow these simple example steps.

### Prerequisites

**(REWRITE THIS)**
This is an example of how to list things you need to use the software and how to install them.
* npm
  ```sh
  npm install npm@latest -g
  ```

### Installation

**(REWRITE THIS)**
_Below is an example of how you can instruct your audience on installing and setting up your app. This template doesn't rely on any external dependencies or services._

1. Get a free API Key at [https://example.com](https://example.com)
2. Clone the repo
   ```sh
   git clone https://github.com/your_username_/Project-Name.git
   ```
3. Install NPM packages
   ```sh
   npm install
   ```
4. Enter your API in `config.js`
   ```js
   const API_KEY = 'ENTER YOUR API';
   ```

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- USAGE EXAMPLES -->
## Usage

**(REWRITE THIS)**
Use this space to show useful examples of how a project can be used. Additional screenshots, code examples and demos work well in this space. You may also link to more resources.

_For more examples, please refer to the [Documentation](https://example.com)_

<p align="right">(<a href="#readme-top">back to top</a>)</p>



## Core Features and Mechanics for Alpha Version (MVP)

### Map Generation

- [ ] Procedurally generate a playable map with different terrain types, resources, and features.
- [ ] Ensure the map is navigable and provides a balanced starting position for players.

### City Management

- [ ] Allow players to establish cities on the map.
- [ ] Implement basic city management mechanics, including city growth, population management, and resource allocation.

### Resource Management:

- [ ] Introduce essential resources such as food, production, and gold.
- [ ] Implement resource gathering and allocation systems for cities.

### Technology Tree:

- [ ] Design a basic technology tree with a few key advancements.
- [ ] Allow players to research technologies to unlock new units, buildings, or abilities.

### Unit Movement and Actions:

- [ ] Enable players to control units and move them across the map.
- [ ] Implement basic actions for units, such as exploring, harvesting resources, or engaging in combat.

### Combat and Warfare:

- [ ] Include basic combat mechanics for units engaging in battles.
- [ ] Allow units to attack and defend against enemy units or capture enemy cities.

### Diplomacy:

- [ ] Implement simple diplomacy mechanics, such as negotiating peace treaties or establishing trade agreements with AI-controlled civilizations.

### Turn-based Gameplay:

- [ ] Structure the game into turns, where players take actions and make decisions during their respective turns.
- [ ] Implement a turn management system that advances the game state and switches control between players.

### Victory Conditions:

- [ ] Define one or more victory conditions, such as achieving a certain level of cultural influence, conquering a specific number of cities, or being the first to reach a technological milestone.

### User Interface:

- [ ] Create a minimalistic user interface that allows players to interact with the game's features and mechanics effectively.
- [ ] Design UI screens for city management, technology research, unit actions, and game state information.

### Basic AI Opponent:

- [ ] Develop a basic AI opponent that makes decisions and takes actions based on a simple set of rules.
- [ ] Allow the AI opponent to expand, develop cities, and engage in basic diplomatic interactions.

### Playtesting and Bug Fixing:

- [ ] Conduct extensive playtesting to identify and address any bugs, glitches, or balancing issues.
- [ ] Gather feedback from testers and make necessary adjustments to improve gameplay experience.

Remember, the purpose of the alpha version is to provide a playable and representative experience of the game's core mechanics. The focus should be on creating a solid foundation with essential features while keeping the scope manageable. Additional features and refinements can be added in later iterations based on user feedback and development progress.

## Core Features and Mechanics for Beta Version

### Expanded Map and World Generation:

- [ ] Enhance the map generation algorithm to create larger and more diverse maps with varied biomes, resources, and terrain features.
- [ ] Introduce natural wonders and strategic points of interest on the map.

### Advanced City Management:

- [ ] Expand the city management mechanics to include more buildings, improvements, and specialized districts.
- [ ] Introduce policies and governance options that impact the city's growth, economy, and culture.

### Resource Diversity and Trade:

- [ ] Introduce a wider variety of resources, including luxury resources that provide unique benefits.
- [ ] Implement a trade system allowing players to establish trade routes and engage in resource exchange with other civilizations.

### Expanded Technology Tree:

- [ ] Enrich the technology tree with more advancements, allowing for greater customization and specialization of the civilization.
- [ ] Introduce unique technologies or branches based on the civilization's chosen path or attributes.

### Cultural Development:

- [ ] Enhance the cultural mechanics by introducing great works, cultural achievements, and influential figures.
- [ ] Implement cultural policies and diplomatic actions to influence and interact with other civilizations.

### Advanced Diplomacy and AI:

- [ ] Expand the diplomacy mechanics to include more diplomatic options, such as alliances, cultural exchanges, and negotiations on specific issues.
- [ ] Improve the AI opponents' behavior and decision-making, making them more challenging and realistic.

### Naval and Air Units:

- [ ] Introduce naval units, allowing for exploration and warfare on water bodies.
- [ ] Implement air units, providing strategic advantages and the ability to project power across the map.

### World Events and Random Encounters:

- [ ] Include random events, crises, and encounters that can affect civilizations and provide opportunities or challenges.
- [ ] Introduce dynamic events based on the game's progress or specific conditions.

### Espionage and Spying:

- [ ] Implement espionage mechanics, allowing players to gather intelligence, conduct covert operations, and influence other civilizations.

### Victory Conditions Variety:

- [ ] Expand the range of victory conditions, including additional paths to victory such as scientific, cultural, diplomatic, or time-based victories.
- [ ] Provide more diverse win conditions to cater to different playstyles.

### Improved User Interface and Graphics:

- [ ] Enhance the user interface to improve usability and provide more intuitive controls and information displays.
- [ ] Upgrade the visual quality of the game with improved graphics, animations, and effects.

### Balancing, Bug Fixes, and Polish:

- [ ] Continuously balance the gameplay, addressing any issues or exploits identified during the alpha testing phase.
- [ ] Address bug reports, optimize performance, and refine the overall user experience.

The beta version builds upon the core features established in the alpha version, expanding and refining the gameplay experience. The focus is on adding depth, variety, and improved mechanics to provide a more comprehensive and engaging Civilization game clone.

## Core Features and Mechanics for "Final" version

### Advanced Civilization Customization:

- [ ] Expand civilization customization options, allowing players to choose unique traits, abilities, and bonuses for their civilization.
- [ ] Introduce multiple playable civilizations with distinct playstyles and unique units or buildings.

### World Congress and Global Politics:

- [ ] Implement a World Congress system where civilizations can vote on resolutions, enact global policies, and engage in diplomatic negotiations.
- [ ] Introduce diplomatic victory conditions tied to alliances, global influence, or achieving leadership roles in the World Congress.

### Cultural and Ideological Clashes:

- [ ] Deepen the cultural mechanics, allowing civilizations to adopt ideologies, shape cultural identities, and engage in ideological conflicts.
- [ ] Implement cultural dominance mechanics, where civilizations can influence or convert other civilizations to their ideologies.

### Dynamic Events and Emergent Gameplay:

- [ ] Introduce a dynamic event system that generates complex events and scenarios based on in-game conditions and player actions.
- [ ] Include emergent gameplay elements where civilizations can rise and fall, and new civilizations can emerge based on historical circumstances.

### Multiplayer and Online Features:

- [ ] Implement robust multiplayer functionality, allowing players to compete or cooperate with others online.
- [ ] Include features such as online matchmaking, leaderboard rankings, and cooperative gameplay options.

### Expanded Victory Conditions:

- [ ] Introduce additional victory conditions, such as scientific victories requiring space colonization or cultural victories through achieving global cultural hegemony.
- [ ] Implement alternative victory paths based on unique civilization attributes or specialized victory conditions.

### World Wonder Construction and Effects:

- [ ] Include a range of iconic world wonders that civilizations can construct, providing significant bonuses and effects.
- [ ] Make world wonders visually distinct and impactful on the gameplay and civilization development.

### Advanced Espionage and Covert Operations:

- [ ] Expand espionage mechanics, allowing players to conduct deep undercover operations, sabotage enemy cities, steal technologies, or influence diplomatic relations.
- [ ] Introduce espionage victory conditions tied to successful covert operations.

### Enhanced AI Behavior and Adaptive Difficulty:

- [ ] Improve AI opponents' behavior, making them more dynamic, strategic, and responsive to player actions.
- [ ] Implement adaptive difficulty settings that provide a challenging experience for players of different skill levels.

### Modding Support:

- [ ] Provide modding tools and support to allow players to create and share custom civilizations, maps, scenarios, and gameplay modifications.
- [ ] Encourage a vibrant modding community to enhance the longevity and replayability of the game.

### Polished User Interface and Audio:

- [ ] Refine the user interface, ensuring it is intuitive, visually appealing, and accessible to players.
- [ ] Enhance audio effects, background music, and sound design to immerse players in the game world.

### Continuous Updates and Community Engagement:

- [ ] Commit to ongoing updates and support, addressing player feedback, balancing issues, and introducing new content post-release.
- [ ] Foster an active community by engaging with players, organizing events, and incorporating community suggestions into the game's development roadmap.

The main version aims to deliver a comprehensive and immersive Civilization game experience, providing deep strategic gameplay, extensive customization options, and a rich and dynamic world to explore. The focus is on delivering a polished, feature-rich game that caters to both single-player and multiplayer experiences, while also fostering a dedicated community of players and modders.

## Gradle

This project uses [Gradle](http://gradle.org/) to manage dependencies.
The Gradle wrapper was included, so you can run Gradle tasks using `gradlew.bat` or `./gradlew` commands.
Useful Gradle tasks and flags:

- `--continue`: when using this flag, errors will not stop the tasks from running.
- `--daemon`: thanks to this flag, Gradle daemon will be used to run chosen tasks.
- `--offline`: when using this flag, cached dependency archives will be used.
- `--refresh-dependencies`: this flag forces validation of all dependencies. Useful for snapshot versions.
- `android:lint`: performs Android project validation.
- `build`: builds sources and archives of every project.
- `cleanEclipse`: removes Eclipse project data.
- `cleanIdea`: removes IntelliJ project data.
- `clean`: removes `build` folders, which store compiled classes and built archives.
- `eclipse`: generates Eclipse project data.
- `headless:run`: starts the headless application. Note: if headless sources were not modified - and the application still creates `ApplicationListener` from `core` project - this task might fail due to no graphics support.
- `idea`: generates IntelliJ project data.
- `lwjgl3:jar`: builds application's runnable jar, which can be found at `lwjgl3/build/libs`.
- `lwjgl3:run`: starts the application.
- `test`: runs unit tests (if any).

Note that most tasks that are not specific to a single project can be run with `name:` prefix, where the `name` should be replaced with the ID of a specific project.
For example, `core:clean` removes `build` folder only from the `core` project.


<!-- CONTRIBUTING -->
## Contributing

**(REWRITE THIS)**
Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- LICENSE -->
## License

**(REWRITE THIS)**
Distributed under the MIT License. See `LICENSE.txt` for more information.

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTACT -->
## Contact

**(REWRITE THIS)**
Your Name - [@your_twitter](https://twitter.com/your_username) - email@example.com

Project Link: [https://github.com/your_username/repo_name](https://github.com/your_username/repo_name)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- ACKNOWLEDGMENTS -->
## Acknowledgments

**(REWRITE THIS)**
Use this space to list resources you find helpful and would like to give credit to. I've included a few of my favorites to kick things off!

* [Choose an Open Source License](https://choosealicense.com)
* [GitHub Pages](https://pages.github.com)

<p align="right">(<a href="#readme-top">back to top</a>)</p>