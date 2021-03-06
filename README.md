# Battlecode 2020 Scaffold
[![Java CI with Gradle](https://github.com/Boxpedan/SE_554_battlecode/workflows/Java%20CI%20with%20Gradle/badge.svg?branch=master)](https://travis-ci.org/github/Boxpedan/SE_554_battlecode/builds/741247759)
[![License: AGPL 3.0](https://img.shields.io/badge/License-AGPL--3.0-yellow.svg)](https://github.com/Boxpedan/SE_554_battlecode/blob/master/LICENSE)

This is the Battlecode 2020 scaffold, containing an `examplefuncsplayer`. Read https://2020.battlecode.org/getting-started!

### Project Owners from Group 10
- Maxwell, Christopher B.
- Bailey, Alexander J.
- Mueller-Cox, Meghan L.
- Boxuan Zhang

### Sprint Schedule
- Oct. 8: Kick off
- Oct. 22: Sprint 1 demo (Oct 8th - Oct 21st) 
- Nov. 5 Sprint 2 demo   (Oct 22nd - Nov 4th)
- Nov. 19: Sprint 3 demo (Nov 5th - Nov 18th)
- Dec. 1: Sprint 4 demo  (Nov 19th - Dec 1st)

### Project Structure

- `README.md`
    This file.
- `build.gradle`
    The Gradle build file used to build and run players.
- `src/`
    Player source code.
- `test/`
    Player test code.
- `client/`
    Contains the client.
- `build/`
    Contains compiled player code and other artifacts of the build process. Can be safely ignored.
- `matches/`
    The output folder for match files.
- `maps/`
    The default folder for custom maps.
- `gradlew`, `gradlew.bat`
    The Unix (OS X/Linux) and Windows versions, respectively, of the Gradle wrapper. These are nifty scripts that you can execute in a terminal to run the Gradle build tasks of this project. If you aren't planning to do command line development, these can be safely ignored.
- `gradle/`
    Contains files used by the Gradle wrapper scripts. Can be safely ignored.

### Project Reference
- Game Specifications: https://sebattlecode.com/specs.html
- Battlecode20 javadoc: http://2020.battlecode.org/javadoc/index.html

### Cyclomatic 

- Integrated into gradle build script build.gradle
- Tool we are using is pmd
- We only look for violations of pmd's design rules since those target cyclomatic complexity: https://pmd.github.io/latest/pmd_rules_java_design.html
- Reports produced from the design rules are found in build/reports/pmd
- pmd produces an html page with violations outlined
- pmd's explanation of how they evaluate and when they signal complexity violations: https://pmd.github.io/latest/pmd_rules_java_design.html#cyclomaticcomplexity