package com.nology.RS3DB;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int tier;
    private String material;
    private String name;
    private String type;
    private String handle;
    private double static_damage;
    private double ability_damage;
    private int accuracy;
    private int prayer_bonus;
    private int lifepoint_bonus;
    private double defence_rating;
    private String style;
    private String image;


    public Stats() {
    }

    public Stats(
            long id,
            int tier,
            String material,
            String name,
            String type,
            String handle,
            double static_damage,
            double ability_damage,
            int accuracy,
            int prayer_bonus,
            int lifepoint_bonus,
            double defence_rating,
            String style,
            String image
    ) {
        this.id = id;
        this.tier = tier;
        this.material = material;
        this.name = name;
        this.type = type;
        this.handle = handle;
        this.static_damage = static_damage;
        this.ability_damage = ability_damage;
        this.accuracy = accuracy;
        this.prayer_bonus = prayer_bonus;
        this.lifepoint_bonus = lifepoint_bonus;
        this.defence_rating = defence_rating;
        this.style = style;
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public double getStatic_damage() {
        return static_damage;
    }

    public void setStatic_damage(double static_damage) {
        this.static_damage = static_damage;
    }

    public double getAbility_damage() {
        return ability_damage;
    }

    public void setAbility_damage(double ability_damage) {
        this.ability_damage = ability_damage;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getPrayer_bonus() {
        return prayer_bonus;
    }

    public void setPrayer_bonus(int prayer_bonus) {
        this.prayer_bonus = prayer_bonus;
    }

    public int getLifepoint_bonus() {
        return lifepoint_bonus;
    }

    public void setLifepoint_bonus(int lifepoint_bonus) {
        this.lifepoint_bonus = lifepoint_bonus;
    }

    public double getDefence_rating() {
        return defence_rating;
    }

    public void setDefence_rating(double defence_rating) {
        this.defence_rating = defence_rating;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
