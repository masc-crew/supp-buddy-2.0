package io.suppbuddy.suppbuddy_20.model;

import lombok.Data;
import lombok.Getter;

import java.util.UUID;
@Getter
@Data
public class CustomUUID     {

        private final String value;

        public CustomUUID() {
            this.value = UUID.randomUUID().toString();
        }

}