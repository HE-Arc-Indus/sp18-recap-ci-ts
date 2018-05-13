/*
 * <pre>
 * ********************************************************************************************** *
 *  ... Auteur:
 * ╔╦╗┌─┐┬  ┬ ┬┌─┐  ╔═╗┌─┐┌┐ ┬┬─┐
 *  ║ ├─┤│  ├─┤├─┤  ╚═╗├─┤├┴┐│├┬┘
 *  ╩ ┴ ┴┴─┘┴ ┴┴ ┴  ╚═╝┴ ┴└─┘┴┴└─
 * ********************************************************************************************** *
 *    ... Date: 13.5.2018
 *    ... Version: 1.0.0.0.0
 *    ... Projet : IDL_FizzBuzz_recap
 *    ... Classe : FizzBuzz
 *    ... Fichier : FizzBuzz.java
 *    ... Copyright (c) 1977-2018.
 * *********************************************************************************************** *
 *  Description:
 *  </pre>
 */


public class FizzBuzz {
  private final String FIZZ = "Fizz";
  private final String BUZZ = "Buzz";
  private final String FIZZBUZZ = "FizzBuzz";


  public FizzBuzz() {
  }

  public String[] cheatSheet(int nombre){
    String[] maListe = new String[nombre];
    for (int i = 1; i <=nombre; i++){
      maListe[i-1] = intToString(i);
    }
    return maListe;
  }

  public String divisionTroisFizz(int nombre){
    return nombre % 3 == 0 ? FIZZ : String.valueOf(nombre);
  }

  public String divisionCinqBuzz(int nombre){
    return nombre % 5 == 0? BUZZ : String.valueOf(nombre);
  }

  public String divisionTroisCinqFizzBuzz(int nombre){
    return (nombre % 3 == 0) && (nombre % 5 == 0) ? FIZZBUZZ : String.valueOf(nombre);
  }

  private String intToString(int nombre){
    String s = "";
    if (divisionTroisCinqFizzBuzz(nombre) == FIZZBUZZ){
      s = FIZZBUZZ;
    }else if(divisionCinqBuzz(nombre)== BUZZ){
      s = BUZZ;
    }else if(divisionTroisFizz(nombre) == FIZZ){
      s = FIZZ;
    }else{
      s = String.valueOf(nombre);
    }
    return s;
  }

}
