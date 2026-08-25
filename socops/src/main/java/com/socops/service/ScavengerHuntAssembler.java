package com.socops.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.socops.data.IcebreakerPrompts;
import com.socops.model.BingoCell;

/** Builds fresh, shuffled Scavenger Hunt checklists. */
public final class ScavengerHuntAssembler {

    private ScavengerHuntAssembler() {
        /* static helper -- never instantiated */
    }

    /** Produce a fresh checklist containing every prompt and no free-space item. */
    public static List<BingoCell> assembleNewList() {
        List<String> shuffledPrompts = new ArrayList<>(IcebreakerPrompts.ALL_PROMPTS);
        Collections.shuffle(shuffledPrompts);
        if (shuffledPrompts.equals(IcebreakerPrompts.ALL_PROMPTS)) {
            Collections.swap(shuffledPrompts, 0, 1);
        }

        List<BingoCell> freshList = new ArrayList<>(shuffledPrompts.size());
        for (int index = 0; index < shuffledPrompts.size(); index++) {
            freshList.add(BingoCell.ofPrompt(index, shuffledPrompts.get(index)));
        }
        return freshList;
    }
}