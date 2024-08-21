package io.suppbuddy.suppbuddy_20.model;

import lombok.Data;

import java.util.UUID;
@Data
public class CustomUUID     {

        private final String value;

        public CustomUUID() {
            this.value = UUID.randomUUID().toString();
        }

        public String getValue() {
            return value;
        }
    }