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

    /**
     * Creates a new instance of <code>InitiativeBankException</code> without
     * detail message.
     */
    public InitiativeBankException() {
    }

    /**
     * Constructs an instance of <code>InitiativeBankException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InitiativeBankException(String msg) {
        super(msg);
    }
}
