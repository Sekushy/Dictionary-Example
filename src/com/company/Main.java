package com.company;

import netscape.javascript.JSObject;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	    // Definirea unui dictionar in Java se face prin folosirea uneia din urmatoarele:
        // HashMap - cel pe care il vom folosi
        // LinkedHashMap
        // Hashtable
        Map<String, String> dictionary = new HashMap<String, String>();

        // Un dictionar este un tip de data de care pentru fiecare intrare ia doua valori
        // Key - Prima valoare este o cheie, aceasta este folosita pentru identificarea elementului
        // Value - Valoare propriu-zisa pe care o salvam in interiorul dictionarului nostru
        // Stocarea datelor se face prin folosirea metodei de put care primeste doi parametri, cheia si valoarea
        dictionary.put("Animal", "Caine");
        dictionary.put("Curs", "Testare Software");

        // Pentru a accesa un element din interiorul dictionarului nostru, vom folosi metoda de 'get' unde ii vom da ca si parametru
        // cheia setata pentru valoarea cu care vrem sa lucram. In cazul de fata vrem sa ne folosim de valoarea salvata pentru 'Curs'
        System.out.println(dictionary.get("Curs"));

        // In mod similar putem obtine valorile pentru cheia noastra de 'Animal'
        System.out.println(dictionary.get("Animal"));

        // In cazul in care dorim sa printam intregul dictionar il vom da ca si parametru catre 'System.out.println()'
        System.out.println(dictionary);

        // Pentru a printa fiecare valoare din dictionarul nostru, vom folosi un for loop care itereaza prin fiecare cheie din dictionar
        for (String key : dictionary.keySet()) {
            System.out.println(key);
        }

        // Intr-un mod similar putem face acelasi lucru si pentru a itera prin fiecare valoare din dictionar
        for (String value : dictionary.values()) {
            System.out.println(value);
        }
    }
}
