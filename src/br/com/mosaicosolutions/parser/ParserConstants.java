/* Generated By:JavaCC: Do not edit this line. ParserConstants.java */
/**
*===================================================================================
* Parser : A syntactic analyzer for a fictitious EST language.
*===================================================================================
*
* (C) Copyright 2016 by Mosaico Solutions
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*
* (C) Copyright 2016 by Mosaico Solutions
*
* Original Author: Bruno Xavier (for Mosaico Solutions);
*
* Contributor(s) -;
*
* Changes: -;
*
* 
* @author BrunoXavier
* @version 1.0
*/

package br.com.mosaicosolutions.parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface ParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int MAIS = 6;
  /** RegularExpression Id. */
  int MENOS = 7;
  /** RegularExpression Id. */
  int MULT = 8;
  /** RegularExpression Id. */
  int DIV = 9;
  /** RegularExpression Id. */
  int RESTO = 10;
  /** RegularExpression Id. */
  int REAL = 11;
  /** RegularExpression Id. */
  int INT = 12;
  /** RegularExpression Id. */
  int DOISPONTOS = 13;
  /** RegularExpression Id. */
  int PROCEDURE = 14;
  /** RegularExpression Id. */
  int ABREPARENTESE = 15;
  /** RegularExpression Id. */
  int FECHAPARENTESE = 16;
  /** RegularExpression Id. */
  int IS = 17;
  /** RegularExpression Id. */
  int CODE = 18;
  /** RegularExpression Id. */
  int ENDCODE = 19;
  /** RegularExpression Id. */
  int VIRGULA = 20;
  /** RegularExpression Id. */
  int PONTO = 21;
  /** RegularExpression Id. */
  int PONTOVIRGULA = 22;
  /** RegularExpression Id. */
  int ATRIBUICAO = 23;
  /** RegularExpression Id. */
  int DIGITO = 24;
  /** RegularExpression Id. */
  int LETRA = 25;
  /** RegularExpression Id. */
  int IDENTIFICADOR = 26;
  /** RegularExpression Id. */
  int VALOR_INTEIRO = 27;
  /** RegularExpression Id. */
  int VALOR_REAL = 28;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\r\\n\"",
    "\"\\t\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"%\"",
    "\"real\"",
    "\"integer\"",
    "\":\"",
    "\"procedure\"",
    "\"(\"",
    "\")\"",
    "\"is\"",
    "\"code\"",
    "\"endcode\"",
    "\",\"",
    "\".\"",
    "\";\"",
    "\":=\"",
    "<DIGITO>",
    "<LETRA>",
    "<IDENTIFICADOR>",
    "<VALOR_INTEIRO>",
    "<VALOR_REAL>",
  };

}
