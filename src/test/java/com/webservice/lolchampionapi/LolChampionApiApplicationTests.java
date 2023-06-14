package com.webservice.lolchampionapi;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.library.lolmodel.config.DataSourceConfiguration;
import com.library.lolmodel.models.Champions;
import com.library.lolmodel.repository.ChampionsRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@ContextConfiguration(classes = DataSourceConfiguration.class)
@EnableJpaRepositories("com.library.lolmodel.repository")
class LolChampionApiApplicationTests {

    @Autowired
    private ChampionsRepository championsRepository;
    @Autowired
    private MockMvc mockMvc;
    @Test
    void contextLoads() {
    }

    @Test
    public void printChamps(){
        List<Champions> champions = championsRepository.findAll();

        // Faire quelque chose avec les résultats de la requête
        for (Champions champion : champions) {
            System.out.println(champion);
        }
    }
    @Test
    void testGetAllChampions() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/champions"))
                .andExpect(status().isOk())
                .andReturn();

        String response = result.getResponse().getContentAsString();
        // Vérifier la réponse en fonction de vos attentes
        // Ici, vous pouvez analyser la réponse JSON et vérifier les valeurs attendues
        // par exemple, vous pouvez utiliser des bibliothèques comme Gson ou Jackson pour désérialiser la réponse JSON

        // Exemple avec Jackson :
        ObjectMapper objectMapper = new ObjectMapper();
        List<Map<String, Object>> championsList = objectMapper.readValue(response, new TypeReference<List<Map<String, Object>>>() {});

        // Vérifier que la liste des champions n'est pas vide
        assertEquals(false, championsList.isEmpty());

        // Vérifier les propriétés de chaque champion dans la liste
        for (Map<String, Object> champion : championsList) {
            // Vérifier que le nom et l'image existent
            assertEquals(true, champion.containsKey("name"));
            assertEquals(true, champion.containsKey("image"));
        }
    }
}
