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
 *    ... Classe : FizzBuzzTest
 *    ... Fichier : FizzBuzzTest.java
 *    ... Copyright (c) 1977-2018.
 * *********************************************************************************************** *
 *  Description:
 *  </pre>
 */

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
  private FizzBuzz fb = null;

  public FizzBuzzTest() {
  }

  @Before
  public void setUp() {
    fb = new FizzBuzz();
  }

  @Test
  public void checkSize() {
    String[] maListe = fb.cheatSheet(30);
    String[] expected = new String[30];
    assertThat(maListe.length, is(expected.length));
  }
}
