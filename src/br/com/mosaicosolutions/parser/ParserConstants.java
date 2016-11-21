/* Generated By:JavaCC: Do not edit this line. ParserConstants.java */
/**
*===================================================================================
*Parser : A syntactic analyzer for a fictitious EST language.
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
* ------------
* Parser.java
* ------------
* This class is a syntactic parser for the EST language.
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
  int PLUS = 5;
  /** RegularExpression Id. */
  int NUMBER = 6;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\r\\n\"",
    "\"+\"",
    "<NUMBER>",
  };

}