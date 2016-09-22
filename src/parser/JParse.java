package parser;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import japa.parser.JavaParser;
import japa.parser.ast.CompilationUnit;
import japa.parser.ast.body.BodyDeclaration;
import japa.parser.ast.body.ClassOrInterfaceDeclaration;
import japa.parser.ast.body.ConstructorDeclaration;
import japa.parser.ast.body.MethodDeclaration;
import japa.parser.ast.body.TypeDeclaration;


public class JParse {

	public List<Clase> leerArchivoJava(File archivo) {
			
		  List<Clase> lista = new ArrayList<Clase>();
			try {
				CompilationUnit compilationUnit = JavaParser.parse(archivo);
				
		        for (TypeDeclaration tipo : compilationUnit.getTypes()) {
		        	
	        		if ( tipo instanceof ClassOrInterfaceDeclaration ){
	        			
	        			ClassOrInterfaceDeclaration clases = (ClassOrInterfaceDeclaration) tipo;
	        			
	        			if (!clases.isInterface() ){
		        			lista.add(new Clase(clases.getName(), leerMetodos(clases.getMembers())));
	        			}
	        		}
		        }
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return lista;
		}
	
		public List<Metodo> leerMetodos(List<BodyDeclaration> miembros)
		{
			List<Metodo> metodos = new ArrayList<Metodo>();
			String[] cuerpo;
			for (BodyDeclaration miembro : miembros ) {
	        	
				if (miembro instanceof MethodDeclaration) {
	            	
	            	MethodDeclaration metodo = (MethodDeclaration) miembro;
	            	metodos.add(new Metodo(metodo.getName(),metodo.toString(),metodo.getEndLine() - metodo.getBeginLine() ));
	            	
		        } else if (miembro instanceof ConstructorDeclaration) {
		        	
		        	ConstructorDeclaration constructor = (ConstructorDeclaration) miembro;
		        	metodos.add(new Metodo(constructor.getName(),constructor.toString(),constructor.getEndLine() - constructor.getBeginLine() ));
		        }
	        }
			
			return metodos;
			
		}
			
		}

