# Documentación Proyecto I Programación III

**Objetivo** 
Consiste en realizar una aplicación que reciba en una caja de texto 
una expresión matemática limitada en sumas, restas, multiplicaciones, divisiones, 
potencias y raices. Un ejemplo es a + b – (c – b) + e.

La aplicación debe tener la capacidad de validar los caracteres permitidos para evitar excepciones, si la expresión ingresada contiene variables el siguiente paso es solicitar los valores de dichas variables para el ejemplo deberá solicitar los valores para:

 - a = ? .
 - b = ?  
 - c = ?  
 - d = ?  
 - e = ?

Luego mostrar los recorridos del árbol y evaluar el recorrido postorden, este 
recorrido como notación polaca o postfija para que investigue cómo evaluarlo 
(es decir resolver la expresión).

## **Estructura** 
El código fuente está conformado por las siguientes clases:
- **formMain**
  Clase origen en la que se ejecutan y se hace el llamado a los procesos de evaluación y comportamiento de la interfaz principal.
- **NotacionPolaca**
  Clase en la que se maneja el procesamiento de la expresión.
- **Nodo**
  Clase con la estructura de cada nodo a ser procesado.
- **Literal**
  Clase para manejar el valor que contendrán las variables en caso de existir en la expresión.
- **ArbolExpresion**
  Clase para creación y ordenamientos del árbol de la expresión.
