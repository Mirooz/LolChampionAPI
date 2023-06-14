package com.webservice.controller;

import com.library.lolmodel.models.Champions;
import com.library.lolmodel.repository.ChampionsRepository;
import com.webservice.DTO.ChampionListDTO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ChampionController {

    private final ChampionsRepository championsRepository;

    public ChampionController(ChampionsRepository championsRepository){
        this.championsRepository = championsRepository;
    }

    private static final Logger logger = Logger.getLogger(ChampionController.class);

    @GetMapping("/champions")
    @CrossOrigin("http://localhost:4200")
    public List<ChampionListDTO> getAllChampions() {
        List<Champions> champions = championsRepository.findAll();

        List<ChampionListDTO> ChampionListDTOs = new ArrayList<>();
        for (Champions champion : champions) {
            ChampionListDTO ChampionListDTO = new ChampionListDTO();
            ChampionListDTO.setId(champion.getId());
            ChampionListDTO.setKey(champion.getKey());
            ChampionListDTO.setName(champion.getName());
            ChampionListDTO.setTitle(champion.getTitle());
            ChampionListDTO.setLore(champion.getLore());
            ChampionListDTO.setBlurb(champion.getBlurb());
            ChampionListDTO.setPartype(champion.getPartype());
            ChampionListDTO.setImageFullName(champion.getImage().getFullname());
            ChampionListDTO.setAllytips(champion.getAllytips());
            ChampionListDTO.setEnemytips(champion.getEnemytips());
            ChampionListDTO.setTags(champion.getTags());
            ChampionListDTO.setInfoDefense(champion.getInfoDefense());
            ChampionListDTO.setInfoMagic(champion.getInfoMagic());
            ChampionListDTO.setInfoDifficulty(champion.getInfoDifficulty());
            ChampionListDTO.setInfoAttack(champion.getInfoAttack());

            ChampionListDTOs.add(ChampionListDTO);
        }

        ChampionListDTOs.forEach(logger::info);
        return ChampionListDTOs;
    }

}