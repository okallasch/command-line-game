package cz.kallasch.gamebook.backend.entity.world;

import cz.kallasch.gamebook.backend.entity.items.ArmorEntity;
import cz.kallasch.gamebook.backend.entity.items.WeaponEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Chapter")
public class ChapterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String story;
    private String ActionOne;
    private String ActionTwo;
    private String ActionThree;
    private Long nextChapterOne;
    private Long nextChapterTwo;
    private Long nextChapterThree;
    @OneToMany (targetEntity = EnemyEntity.class)
    private List<EnemyEntity> enemies;
    @OneToMany (targetEntity = WeaponEntity.class)
    private List<WeaponEntity> weapons;
    @OneToMany (targetEntity = ArmorEntity.class)
    private List<ArmorEntity> armors;
}
