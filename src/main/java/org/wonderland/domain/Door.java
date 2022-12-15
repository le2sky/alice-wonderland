package org.wonderland.domain;

public class Door {

    private final AliceLocation next;
    private final int height;

    public Door(AliceLocation next, int height) {
        this.next = next;
        this.height = height;
    }

    public AliceLocation pass(int targetHeight) {
        if (height < targetHeight)
            throw new TallerThanDoor();

        return next;
    }

    public static class TallerThanDoor extends IllegalArgumentException {
    }
}
