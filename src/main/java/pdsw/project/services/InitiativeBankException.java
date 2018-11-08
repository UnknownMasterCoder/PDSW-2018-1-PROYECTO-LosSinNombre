/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdsw.project.services;

/**
 *
 * @author 2099190
 */
public class InitiativeBankException extends Exception {

        public InitiativeBankException() {
    }

    public InitiativeBankException(String message) {
        super(message);
    }

    public InitiativeBankException(String message, Throwable cause) {
        super(message, cause);
    }

    public InitiativeBankException(Throwable cause) {
        super(cause);
    }

}
