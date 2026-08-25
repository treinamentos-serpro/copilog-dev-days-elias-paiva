package com.socops.service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import com.socops.data.IcebreakerPrompts;
import com.socops.model.BingoCell;

/**
 * Defines the pure-logic contract for a fresh Scavenger Hunt checklist.
 */
class ScavengerHuntAssemblerTests {

    @Test
    @DisplayName("Scavenger Hunt contains every icebreaker prompt exactly once in a shuffled order")
    void assembledListContainsEveryPromptExactlyOnceInShuffledOrder() {
        List<BingoCell> scavengerHunt = ScavengerHuntAssembler.assembleNewList();

        List<String> prompts = scavengerHunt.stream()
                .map(BingoCell::prompt)
                .toList();

        assertEquals(IcebreakerPrompts.ALL_PROMPTS.size(), scavengerHunt.size(),
                "The hunt must contain all 24 prompts");
        assertEquals(Set.copyOf(IcebreakerPrompts.ALL_PROMPTS), Set.copyOf(prompts),
                "Each catalogue prompt must appear exactly once");
        assertNotEquals(IcebreakerPrompts.ALL_PROMPTS, prompts,
                "A new hunt should not retain the catalogue order");
    }

    @Test
    @DisplayName("Scavenger Hunt entries are regular unchecked items with sequential IDs")
    void assembledListStartsWithUncheckedRegularEntries() {
        List<BingoCell> scavengerHunt = ScavengerHuntAssembler.assembleNewList();
        Set<Integer> expectedIds = IntStream.range(0, IcebreakerPrompts.ALL_PROMPTS.size())
                .boxed()
                .collect(Collectors.toSet());

        assertEquals(expectedIds, scavengerHunt.stream()
                .map(BingoCell::id)
                .collect(Collectors.toSet()),
                "List IDs must cover every prompt position");

        for (BingoCell entry : scavengerHunt) {
            assertFalse(entry.selected(),
                    "Entry id=" + entry.id() + " must start unchecked");
            assertFalse(entry.freeCell(),
                    "Entry id=" + entry.id() + " must not be a free-space entry");
            assertNotEquals(IcebreakerPrompts.FREE_CELL_LABEL, entry.prompt(),
                    "The hunt must not include FREE SPACE");
        }
    }
}