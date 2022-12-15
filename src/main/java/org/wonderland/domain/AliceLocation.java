package org.wonderland.domain;

import java.util.Objects;

// 값 객체(value object)는 식별자를 가지지 않는 값을 가리키는 용어다.
public class AliceLocation {

    private final String name;

    public AliceLocation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        AliceLocation location = (AliceLocation) obj;
        return Objects.equals(name, location.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
