package org.camelapp.model;

public class PhotoBuilder {
    private String name;
    private String caption;

    public PhotoBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PhotoBuilder setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    public Photo createPhoto() {
        return new Photo(name, caption);
    }
}