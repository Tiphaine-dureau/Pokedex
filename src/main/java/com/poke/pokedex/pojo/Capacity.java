package com.poke.pokedex.pojo;

public class Capacity {
    private Long id;
    private String label;
    private Long powerful;

    public Capacity() {
    }

    public Capacity(Long id, String label, Long powerful) {
        this.id = id;
        this.label = label;
        this.powerful = powerful;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Long getPowerful() {
        return powerful;
    }

    public void setPowerful(Long powerful) {
        this.powerful = powerful;
    }
}
