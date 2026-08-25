package com.socops.data;

import java.util.List;

/**
 * Central catalogue of every icebreaker prompt that can appear on a board.
 * Exactly 24 entries — one fewer than the 25-cell grid, because the
 * centre cell is always the free space.
 */
public final class IcebreakerPrompts {

    public static final String FREE_CELL_LABEL = "FREE SPACE";

    public static final List<String> ALL_PROMPTS = List.of(
            "would name a black hole after a snack",
            "has waved at a security camera",
            "can invent a planet in ten seconds",
            "has given a name to an inanimate object",
            "would negotiate with aliens over pizza",
            "has accidentally joined the wrong meeting",
            "can make a sound effect for a spaceship",
            "has a completely unnecessary but beloved skill",
            "would bring one ridiculous item to Mars",
            "has solved a problem with a surprisingly weird workaround",
            "can describe their job as a sci-fi plot",
            "has a desk object that looks suspicious",
            "would choose a dramatic space-captain name",
            "has pretended to understand a confusing acronym",
            "can teach a five-second dance move",
            "would adopt a friendly alien sidekick",
            "has sent a message to the wrong chat",
            "can create a conspiracy theory about the office plant",
            "would open a coffee shop on the Moon",
            "has built something using the wrong tool",
            "can do a rock-paper-scissors rematch with a stranger",
            "would make a playlist for a wormhole",
            "has a surprisingly strong opinion about space food",
            "can share their most harmless plot twist"
    );

    private IcebreakerPrompts() {
        /* catalogue only — no instances */
    }
}
