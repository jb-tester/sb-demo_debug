package com.example.demo_debug;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * *
 * <p>Created by irina on 17.01.2021.</p>
 * <p>Project: demo_debug</p>
 * *
 */
@Component("Compo1")
public class Compo1 {
    public Compo1( @Value("Compo1")
                              String id) {
        this.id = id;
    }

    String id;

    public String getId() {
        return id.toLowerCase();
    }
}
