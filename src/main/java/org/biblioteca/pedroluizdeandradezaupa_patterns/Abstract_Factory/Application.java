package org.biblioteca.pedroluizdeandradezaupa_patterns.Abstract_Factory;

public class Application {
    private UIComponentFactory factory;

    public Application(UIComponentFactory factory) {
        this.factory = factory;
    }

    public void renderInterface() {
        Button botao = factory.createButton();
        TextField caixaTexto = factory.createTextField();
        Checkbox checkbox = factory.createCheckbox();

        botao.render();
        caixaTexto.render();
        checkbox.render();
    }
}
