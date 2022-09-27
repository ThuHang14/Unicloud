package service;

import modal.DemoInterface;

public class ImplementInterface implements DemoInterface {
    @Override
    public String draw() {
        return "draw 1 ";
    }
}
