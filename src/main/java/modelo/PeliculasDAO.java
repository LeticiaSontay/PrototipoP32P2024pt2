/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import controlador.Peliculas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 *
 * @author alumno
 */
public class PeliculasDAO {
    
    private static final String SQL_SELECT = "SELECT nombre, clasificacion, subtitulado, idioma, tipo, precio FROM peliculas";
    private static final String SQL_INSERT = "INSERT INTO peliculas(nombre, clasificacion, subtitulado, idioma, tipo, precio) VALUES(?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE peliculas SET clasificacion=?, subtitulado=?, idioma=?, tipo=?, precio=? WHERE nombre=?";
    private static final String SQL_DELETE = "DELETE FROM peliculas WHERE nombre=?";
    private static final String SQL_QUERY = "SELECT nombre, clasificacion, subtitulado, idioma, tipo, precio FROM peliculas WHERE nombre = ?";
    
    
    
    
}
