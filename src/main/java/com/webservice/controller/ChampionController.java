package com.webservice.controller;

import com.library.lolmodel.models.Champions;
import com.library.lolmodel.models.SpellEffect;
import com.library.lolmodel.models.Stats;
import com.library.lolmodel.repository.ChampionsRepository;
import com.library.lolmodel.repository.SpellEffectRepository;
import com.library.lolmodel.repository.StatsRepository;
import com.webservice.DTO.ChampionDTO;
import com.webservice.DTO.ChampionListDTO;
import com.webservice.DTO.SpellsDTO;
import jakarta.persistence.EntityManager;
import org.apache.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@CrossOrigin("${front_base_url}")
public class ChampionController {

    private final ChampionsRepository championsRepository;
    private final StatsRepository statsRepository;

    private final SpellEffectRepository spellEffectRepository;

    private final EntityManager entityManager;
    public ChampionController(ChampionsRepository championsRepository, StatsRepository statsRepository, SpellEffectRepository spellEffectRepository, EntityManager entityManager){
        this.championsRepository = championsRepository;
        this.statsRepository = statsRepository;
        this.spellEffectRepository = spellEffectRepository;
        this.entityManager = entityManager;
    }

    private static final Logger logger = Logger.getLogger(ChampionController.class);



    @GetMapping("/champions/{championId}")
    public ResponseEntity<ChampionDTO> getChampionById(@PathVariable("championId") String championId) {
        Champions champion = championsRepository.findById(championId).orElse(null);

        if (champion == null) {
            // Gérer le cas où le champion n'est pas trouvé
            // Vous pouvez retourner une erreur 404 ou une réponse appropriée selon vos besoins
            // Par exemple : throw new ChampionNotFoundException("Champion not found");
            return ResponseEntity.notFound().build();
        }

        ChampionDTO championDTO = new ChampionDTO(champion);
        return ResponseEntity.ok(championDTO);
    }
    @GetMapping("/champions")
    public List<ChampionListDTO> getAllChampions() {
/*        List<Champions> champions = championsRepository.findAll();

        List<ChampionDTO> championDTOS = new ArrayList<>();
        champions.forEach(champion -> championDTOS.add(new ChampionDTO(champion)));
        return championDTOS;*/

        List<Object[]> champions = entityManager.createQuery("SELECT p.id,p.name,p.image.fullname FROM Champions p").getResultList();

        List<ChampionListDTO> championListDTOS = new ArrayList<>();
        champions.forEach(champion -> {
            ChampionListDTO championListDTO = new ChampionListDTO(champion[0].toString(),
                    champion[1].toString(),
                    champion[2].toString());
            championListDTOS.add(championListDTO);
        });

        return championListDTOS;
    }
    @GetMapping("/stats")
    public ResponseEntity<Stats> getChampionStats(@RequestParam("championid") String championId) {

        Stats stats = statsRepository.findByChampionid(championId);

        return ResponseEntity.ok(stats);
    }

    @GetMapping("/spells")
    public ResponseEntity<List<SpellsDTO>> getSpellsByChampionId(@RequestParam("championName") String championName) {
        List<SpellEffect> spells = spellEffectRepository.findAllByChampionName(championName);

        List<SpellsDTO> spellsDTOs = new ArrayList<>();
        spells.forEach(spellEffect -> spellsDTOs.add(new SpellsDTO(spellEffect)));

        return ResponseEntity.ok(spellsDTOs);
    }

}