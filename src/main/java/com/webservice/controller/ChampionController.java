package com.webservice.controller;

import com.webservice.model.Champions;
import com.webservice.repository.ChampionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ChampionController {

    @Autowired
    private ChampionsRepository championsRepository;

    @GetMapping("/champions")
    public List<Map<String, Object>> getAllChampions() {
        List<Champions> champions = championsRepository.findAll();

        List<Map<String, Object>> championsList = new ArrayList<>();
        for (Champions champion : champions) {
            Map<String, Object> championMap = new HashMap<>();
            championMap.put("name", champion.getName());
            championMap.put("image", champion.getImage().getFullname());
            championsList.add(championMap);
        }

        return championsList;
    }
}