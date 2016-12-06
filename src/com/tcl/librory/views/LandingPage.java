package com.tcl.librory.views;

import com.tcl.librory.utils.SceneSwitcher;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * Created by franc on 12/6/2016.
 */
public class LandingPage {

    @FXML
    private Button btnRegister;

    @FXML
    private Button btnSignIn;

    public LandingPage() {

    }

    @FXML
    private void initialize() {

    }

    @FXML
    private void btnSignInOnClick() {
        try {
            SceneSwitcher.switchScene(btnSignIn.getScene(), getClass().getResource("Login.fxml"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
