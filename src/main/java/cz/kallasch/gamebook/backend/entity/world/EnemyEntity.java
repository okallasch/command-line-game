package cz.kallasch.gamebook.backend.entity.world;

import javax.persistence.*;

@Entity
@Table(name = "Enemy")
public class EnemyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int health;
    private int damage;
    private int criticalDamage;
    private int armor;
}
