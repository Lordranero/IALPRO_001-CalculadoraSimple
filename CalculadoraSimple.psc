Algoritmo CalculadoraSimple
	// Pedir dos variables numéricas al usuario; calcular la suma, resta. multiplicación, división y resto y arrojar el resultado en pantalla.
	
    // Variables de entrada y para los resultados
    Definir num1, num2, suma, resta, multi, div, resto Como Real
    
    // Solicitud al usuario
    Escribir "Introduce el primer número:"
    Leer num1
    Escribir "Introduce el segundo número:"
    Leer num2
	
	// Aplicación del cálculo
    suma <- num1 + num2
    resta <- num1 - num2
    multi <- num1 * num2
    div <- num1 / num2
    resto <- num1 MOD num2
    
	// Resultado en pantalla
    Escribir "El resultado de la suma es: ", suma
    Escribir "El resultado de la resta es: ", resta
    Escribir "El resultado del producto es: ", multi
    Escribir "El resultado de la división es: ", div
    Escribir "El resultado del resto (%) es: ", resto
FinAlgoritmo
