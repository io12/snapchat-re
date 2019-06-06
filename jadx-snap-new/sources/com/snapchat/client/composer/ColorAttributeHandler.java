package com.snapchat.client.composer;

public abstract class ColorAttributeHandler {
    public abstract void applyAttribute(Object obj, long j, Animator animator);

    public abstract void resetAttribute(Object obj, Animator animator);
}