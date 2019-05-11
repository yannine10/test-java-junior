Si compila, lo que sucede es que el operador es igual.
En este caso, los objetos son distintos, String.valueOf 
	devuelve un objeto distinto al referenciado en letra, 
	entonces la condición no se cumple. Si lo que queremos es,
	comparar los valores, deberíamos usar el método Objects.equals.
