package com.ordering.platform.processor.context;

public interface ContextWrapper<T extends Context> {
public <T extends Context> T getContext();
}
