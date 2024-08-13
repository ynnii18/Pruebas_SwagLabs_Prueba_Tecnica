package com.testing.moviles.app.excepciones;


    public class ExceptionCompra extends AssertionError{
        private static final long serialVersionUID = 1L;
        private static final String ERROR_COMPRA = "Error en  el proceso de compra";
        public ExceptionCompra() {}

        public static String ErrorCompra() { return ERROR_COMPRA; }
    }

