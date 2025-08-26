package com.bdd.steps;

import io.cucumber.java.en.*;

public class LoginSteps {

    @Given("el usuario ingresa su usuario {string}")
    public void el_usuario_ingresa_su_usuario(String usuario) {
        System.out.println("Usuario: " + usuario);
    }

    @When("ingresa la contraseña {string}")
    public void ingresa_la_contraseña(String password) {
        System.out.println("Password: " + password);
    }

    @Then("accede al sistema")
    public void accede_al_sistema() {
        System.out.println("Accedió al sistema correctamente");
    }

    @Then("recibe un mensaje de error")
    public void recibe_un_mensaje_de_error() {
        System.out.println("Usuario o contraseña incorrecta");
    }
}
