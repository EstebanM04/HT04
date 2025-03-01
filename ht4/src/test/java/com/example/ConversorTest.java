package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConversorTest {

    private ConversorArrayList conversorArrayList;
    private ConversorListaDoble conversorListaDoble;
    private ConversorVector conversorVector;
    private CoversorListaSimple coversorListaSimple;
    private CoversorStack coversorStack;

    @BeforeEach
    void setUp() {
        conversorArrayList = new ConversorArrayList();
        conversorListaDoble = new ConversorListaDoble();
        conversorVector = new ConversorVector();
        coversorListaSimple = new CoversorListaSimple();
        coversorStack = new CoversorStack();
    }

    @Test
    void testInfixToPostFix() {
        String infix = "3+5*2";
        String expectedPostfix = "352*+";
        
        conversorArrayList.InfixToPostFix(infix);
        assertEquals(expectedPostfix, conversorArrayList.getCadenaPostFix());
        
        conversorListaDoble.InfixToPostFix(infix);
        assertEquals(expectedPostfix, conversorListaDoble.getCadenaPostFix());
        
        conversorVector.InfixToPostFix(infix);
        assertEquals(expectedPostfix, conversorVector.getCadenaPostFix());
        
        coversorListaSimple.InfixToPostFix(infix);
        assertEquals(expectedPostfix, coversorListaSimple.getCadenaPostFix());
        
        coversorStack.InfixToPostFix(infix);
        assertEquals(expectedPostfix, coversorStack.getCadenaPostFix());
    }
    
    @Test
    void testInfixWithParentheses() {
        String infix = "(3+5)*2";
        String expectedPostfix = "35+2*";
        
        conversorArrayList.InfixToPostFix(infix);
        assertEquals(expectedPostfix, conversorArrayList.getCadenaPostFix());
        
        conversorListaDoble.InfixToPostFix(infix);
        assertEquals(expectedPostfix, conversorListaDoble.getCadenaPostFix());
        
        conversorVector.InfixToPostFix(infix);
        assertEquals(expectedPostfix, conversorVector.getCadenaPostFix());
        
        coversorListaSimple.InfixToPostFix(infix);
        assertEquals(expectedPostfix, coversorListaSimple.getCadenaPostFix());
        
        coversorStack.InfixToPostFix(infix);
        assertEquals(expectedPostfix, coversorStack.getCadenaPostFix());
    }
}