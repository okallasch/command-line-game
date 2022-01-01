package cz.kallasch.gamebook.controller;

import cz.kallasch.gamebook.backend.entity.world.ChapterEntity;
import cz.kallasch.gamebook.backend.entity.world.PlayerEntity;
import cz.kallasch.gamebook.backend.service.ChapterService;
import cz.kallasch.gamebook.backend.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ChapterController {

    @Autowired
    private ChapterService chapterService;
    @Autowired
    private PlayerService playerService;

    @GetMapping("/game/{chapter}")
    public String getChapter(Model model,@PathVariable Long chapter) {
        ChapterEntity chapterById = chapterService.findChapterById(chapter);
        PlayerEntity playerEntity = playerService.getPlayerByName("DEV");
        model.addAttribute("title", chapterById.getName());
        model.addAttribute("story", chapterById.getStory());
        model.addAttribute("actionOne", chapterById.getActionOne());
        model.addAttribute("actionTwo", chapterById.getActionTwo());
        model.addAttribute("actionThree", chapterById.getActionThree());
        model.addAttribute("playerName", playerEntity.getName());
        model.addAttribute("playerHealth", playerEntity.getHealth());
        model.addAttribute("playerAgility", playerEntity.getAgility());
        model.addAttribute("playerStrength", playerEntity.getStrength());
        return "chapter";
    }
}
