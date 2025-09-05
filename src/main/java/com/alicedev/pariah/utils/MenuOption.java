package com.alicedev.pariah.utils;

public class MenuOption {
    private final String id;
    private String description;

    public MenuOption(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
