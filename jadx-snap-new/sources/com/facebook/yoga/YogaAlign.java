package com.facebook.yoga;

public enum YogaAlign {
    AUTO(0),
    FLEX_START(1),
    CENTER(2),
    FLEX_END(3),
    STRETCH(4),
    BASELINE(5),
    SPACE_BETWEEN(6),
    SPACE_AROUND(7);
    
    private final int mIntValue;

    private YogaAlign(int i) {
        this.mIntValue = i;
    }
}
