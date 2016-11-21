
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
* Argument.java
* ------------
* Class representing the program arguments.
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

class Argument {
	/**
	 * Inicializa uma nova instância de Argument.
	 * @param args Os argumentos passados no metodo {@link Parser#main(String...)}.
	 */
	Argument(String... args) {
		// TODO Auto-generated constructor stub
		hasArgument = !(args.length == 0);
		sourceFile  = args.length == 0 ? "" : args[0];
	}
	
	/**
	 * O nome do arquivo que contém o programa fonte na linguagem EST.
	 * @return O nome do arquivo fonte.
	 */
	String getSourceFileName(){
		return sourceFile;
	}
	
	/**
	 * Método que testa se algum argumento foi passado para o programa principal.
	 * @return true se foi passado alguam argumento, caso contrário false.
	 */
	boolean hasArgument() {
		return hasArgument;
	}

	private String sourceFile;
	
	private boolean hasArgument;
}
