package org.biblioteca.pedroluizdeandradezaupa_patterns.Abstract_Factory;

public class DarkButton implements Button {
    @Override
    public void render() {
        System.out.println("Renderizando Botão com fundo cinza escuro");
    }
}
