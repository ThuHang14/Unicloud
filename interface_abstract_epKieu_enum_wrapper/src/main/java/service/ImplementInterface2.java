package service;

import modal.DemoInterface;

public class ImplementInterface2 implements DemoInterface {
    @Override
    public String draw() {
        return "draw 2 ";
    }
}
