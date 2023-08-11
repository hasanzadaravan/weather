package com.hasanzada.weather.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include. NON_NULL)
public class Root {
    public Request request;
    public Location location;
    public Current current;

    public Root(Request request, Location location, Current current) {
        this.request = request;
        this.location = location;
        this.current = current;
    }

    public Root() {
    }

    @Override
    public String toString() {
        return "Root{" +
                "request=" + request +
                ", location=" + location +
                ", current=" + current +
                '}';
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }
}
