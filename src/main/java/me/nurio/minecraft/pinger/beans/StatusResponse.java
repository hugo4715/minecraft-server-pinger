package me.nurio.minecraft.pinger.beans;

import lombok.Getter;
import lombok.Setter;

public class StatusResponse {

    @Getter private String description;
    @Getter private Players players;
    @Getter private Version version;
    @Getter private String favicon;

    @Getter @Setter private String json;
    @Getter @Setter private long time;

}