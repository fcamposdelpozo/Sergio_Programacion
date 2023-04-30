package ejemplos.T10Excepciones;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejemplo3_CopiarFicheroExcepcionSinControlar {

	public static void main(String[] args){
		int i;
		FileInputStream fin=null;
		FileOutputStream fout=null;
				
		//comprobar que se han especificado los dos archivos
		if (args.length != 2){
			System.out.println("Debe especifirar fichero de entrada y salida");
            return;			
		}
		
		//Copiar un archivo
		
			// abrir los archivos
			fin = new FileInputStream(args[0]);
			fout = new FileOutputStream(args[1]);
			
			do{
			   i = fin.read(); //leer desde el archivo
			   if(i != -1) fout.write(i);

			}while (i!=-1); //cuando i sea igual a -1 se habr� alcanzado el final del archivo origen

	}

}
