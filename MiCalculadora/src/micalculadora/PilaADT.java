/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package micalculadora;

/**
 * @author Las integrantes del equipo son:<ul> 
     *                                    <li>Arindal Contreras Arellano</li>
     *                                    <li>Lourdes Angélica Gutiérrez Landa</li>
     *                                    <li>Regina Pérez Ibarra</li>
     *                                    <li>Tamara Terroba Schnaas</li>
     *                                    </ul>
 */
public interface PilaADT <T> {
    public void push(T dato);
    public T pop();
    public boolean isEmpty();
    public T peek();
    
}
