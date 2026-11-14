package org.biblioteca.pedroluizdeandradezaupa_patterns.Abstract_Factory;


public class LightCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Renderizando Checkbox com tema claro");
    }
}
