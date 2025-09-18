This is a refactor and partial deobfuscation of the Hydrix 718 RSPS client. It also contains several patches, new features, and changes to make the client more functional and custom. Compiled using JDK1.8.0_202.

Notable changes include:
- Fixed most random crashing in OSRS regions by changing LocType.aStringArray5394 to 5 instead of 10 for opcodes 30/35
- Fixed color/hue shift on chat crowns & other sprites with a no-op on Class89.method991
- Added increased render distance by changing GameMap.anInt3016 -> zfar & multiplying it by Loader.EXTRA_DRAW_DISTANCE
- Edited Class264.method2484 to lower chat crown draws by 3px, removing the floating effect they had likely as a result of JODE decompilation
- Added tamper detection for Windows PCs, this must be disabled to support MacOS/Linux, I left instructions in the code on how, inside TamperScanner.java
- Discord Rich Presence status text can be set by in-game commands in the dev console, and the status will display usernames if available
- Java Swing/JFX environment editor tool baked into the AtmosphereManager class, using a concurrent linked queue to deliver custom environment settings safely into the game's rendering thread.
- Thousands of renamed methods/fields/values changed in the (partial) deobfuscation process

Java Swing environment editor features:
- Sun color
- Sun position
- Sun intensity
- Sun brightness
- Fog color
- Fog distance
- Fog Intensity
- Ambient light
- Diffusion
- Skyboxes (1-5 built into the game's engine)
- Experimental skybox adjustments (not fully functional)
- Save/load/import/export presets from .JSON
- Live preview/update to the game if selected

Newest Update (Sept. 18, 2025) -
New collapsible toolbar with some fun settings:
- Website links
- Toggle snow mode on/off - This puts snow on the ground in-game.
- Open the environment editor straight from the toolbar
- Discord status options - Set custom text to display on the "Playing" card, filtered.

This update also adds support for SSL/TLS, configurable via the Settings class, which now has a good bit more options than before.
- HWID tracking has been added alongside MAC tracking in what was Class360, now named LoginPacket.
- HWID is computed via HW serials and a static salt.
- It is recommended to change the salt before use, in the HardwareFingerprint class.
- You will also need to add a decoder to your server to use the HWID payload.
- At this time there is not a way to disable the HWID as being part of the payload without disabling the code directly. This may be addressed one day, but I use it so I may hold off.
- Client now supports favicon/taskbar icon, loaded from an array of images in /src/img/
- Toast notifications for frame buttons/switches
- Client will now auto-configure cache folder name/runtimes to the server name set in settings
- Configurable console colors
- More that I forget
