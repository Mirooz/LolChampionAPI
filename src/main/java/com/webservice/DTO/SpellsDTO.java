package com.webservice.DTO;

import com.library.lolmodel.models.SpellCooldown;
import com.library.lolmodel.models.SpellCost;
import com.library.lolmodel.models.SpellEffect;

import java.util.List;

public class SpellsDTO {
    private String championName;
    private String letter;
    private String description;
    private String range;
    private String name;
    private List<SpellCooldown> spellCooldowns;
    private List<SpellCost> spellCosts;

    public SpellsDTO(SpellEffect spell) {
        this.championName = spell.getChampionName();
        this.letter = spell.getLetter();
        this.description = spell.getDescription();
        this.range = spell.getRange();
        this.name = spell.getName();
        this.spellCosts = spell.getSpellCostList();
        this.spellCooldowns = spell.getSpellCooldownList();
    }

    public String getChampionName() {
        return championName;
    }

    public void setChampionName(String championName) {
        this.championName = championName;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SpellCooldown> getSpellCooldowns() {
        return spellCooldowns;
    }

    public void setSpellCooldowns(List<SpellCooldown> spellCooldowns) {
        this.spellCooldowns = spellCooldowns;
    }

    public List<SpellCost> getSpellCosts() {
        return spellCosts;
    }

    public void setSpellCosts(List<SpellCost> spellCosts) {
        this.spellCosts = spellCosts;
    }
}
